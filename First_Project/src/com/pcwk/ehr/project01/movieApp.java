package com.pcwk.ehr.project01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class movieApp {
	private List<Member> members;
	private Member loginedMember;
	private List<MovieList> movieInfos;

	public movieApp() {
		members = new ArrayList<>();
		movieInfos = new ArrayList<>();
		loginedMember = null;
	}

	public void run() {
		System.out.println("========프로그램 시작========");
		Scanner sc = new Scanner(System.in);
		boolean managerId = false; // 관리자 표시
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd"); // 개봉일 형식 변환을 위한 선언
		makeManagerId();
		loadMovieFile();
		int userAge = 0;
		int myWallet = 0;
		while (true) {

			System.out.println("┌─────────────────────────────────────────┐");
			System.out.println("│  1.로그인   2.회원가입  3.사이트로 이동  4.종료   │ ");
			System.out.println("└─────────────────────────────────────────┘");
			System.out.print("메뉴 선택 > ");
			String menu = sc.nextLine().trim();
			try (BufferedReader reader = new BufferedReader(new FileReader("members.txt"))) {
				String line;
				while ((line = reader.readLine()) != null) {
					String[] data = line.split(","); // 파일에서 쉼표로 구분된 데이터를 읽기
					String loginId = data[0];
					String loginPass = data[1];
					String name = data[2];
					managerId = Boolean.parseBoolean(data[3]);
					myWallet = Integer.parseInt(data[4]);
					userAge = Integer.parseInt(data[5]);
					Member member = new Member(loginId, loginPass, name, managerId, myWallet,userAge);
					members.add(member); // 읽어온 데이터를 바탕으로 멤버 객체를 생성하고 리스트에 추가
				}
			} catch (IOException e) {
				System.out.println("파일에서 회원 정보를 불러오는 중 오류가 발생했습니다.");
			}
			loadReservations();
			
			if (menu.equals("4")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else if (menu.equals("2")) {
				String loginId = null; // 로그인된 상태 여부 확인
				if (isLogined()) {
					System.out.println("로그아웃 후 이용해주세요.");
					continue;
				}
				System.out.printf("이름 : ");
				String name = sc.nextLine();
				System.out.print("연령 : ");
				userAge = sc.nextInt();
				
				sc.nextLine(); //nextLine() 사용 후 nextInt() 사용시 그냥 넘어가는 상황 발생
				while (true) {
					System.out.print("로그인 아이디 : ");
					loginId = sc.nextLine().trim();

					if (isLoginIdDup(loginId) == false) { // 중복 여부 확인
						System.out.println("이미 사용중인 아이디입니다.");
						continue;
					}

					System.out.printf("%s은(는) 사용가능한 아이디입니다.%n", loginId);
					break;
				}
				String loginPass = null;
				while (true) {
					System.out.printf("로그인 비밀번호 : ");
					loginPass = sc.nextLine().trim();
					System.out.printf("로그인 비밀번호 확인 : ");
					String passCheck = sc.nextLine().trim();

					if (loginPass.equals(passCheck) == false) {
						System.out.println("비밀번호가 다릅니다.");
						continue;
					}
					break;
				}
				Member member = new Member(loginId, loginPass, name, managerId, myWallet,userAge);
				members.add(member);
				try (BufferedWriter writer = new BufferedWriter(new FileWriter("members.txt", true))) {
					writer.write(loginId + "," + loginPass + "," + name + "," + managerId + "," + myWallet + "," + userAge);
					writer.newLine(); //회원가입된 유저의 정보를 형식에 따라 파일에 저장
				} catch (IOException e) {
					System.out.println("회원 정보를 파일에 저장하는 중 오류가 발생했습니다.");
				}

				System.out.printf("%s 회원님 환영합니다.%n", name);
				continue;
			} else if (menu.equals("1")) {
				if (isLogined()) {
					System.out.println("이미 로그인 되어 있습니다.");
					continue;
				}

				System.out.printf("아이디 : ");
				String loginId = sc.nextLine().trim();
				System.out.printf("비밀번호 : ");
				String loginPass = sc.nextLine().trim();
				Member member = getMemberByLoginId(loginId); //저장된 유저의 정보를 불러와 가입 여부 확인 및 비번 확인

				if (member == null) {
					System.out.printf("%s은(는) 존재하지 않는 아이디입니다.\n", loginId);
					continue;
				}
				if (loginPass.equals(member.pass) == false) {
					System.out.println("비밀번호를 확인해주세요.");
					continue;
				}
				this.loginedMember = member;
				System.out.printf("%s님 환영합니다.%n", member.name);

			} else if (menu.equals("3")) {
				if (isLogined() == false) {
					System.out.println("로그인 후 이용해 주세요.");
					continue;
				}
				while (true) {
					System.out.println("┌─────────────────────────────────────────────────────────────────────────┐");
					System.out.println("│ 1.상영중인 영화 조회  2.영화 검색  3.영화 예매  4.개인 정보 확인  5.관리자 모드  6.로그아웃 │");
					System.out.println("└─────────────────────────────────────────────────────────────────────────┘");
					System.out.print("메뉴 선택 > ");
					String internalMenu = sc.nextLine().trim();

					if (internalMenu.equals("6")) {
						if (isLogined()) {
							System.out.println("로그아웃 되었습니다.");
							this.loginedMember = null;
							break; //로그인 정보 제거
						}
						
					} else if (internalMenu.equals("1")) {
						System.out.println("영화 제목  |       개봉일    |  감독  | 연령 제한  |  평점");
						for (MovieList movieInfo : movieInfos) {
							System.out.printf("%s	|   %s	 |  %s  |  %2d   |  %.2f\n", movieInfo.movieName,
									movieInfo.date.format(formatter), movieInfo.supervision, movieInfo.ageLimit,
									movieInfo.rating);
						}

					} else if (internalMenu.equals("2")) {
						System.out.print("검색하실 영화를 입력해주세요. > ");
						String searchMovie = sc.nextLine().trim();
						
						for(MovieList movieInfo : movieInfos) {
							System.out.println("영화 제목  |       개봉일    |  감독  | 연령 제한  |  평점");
							if(searchMovie.equals(movieInfo.movieName)|| //제목, 감독, 출시일 일치 여부
									searchMovie.equals(movieInfo.supervision)
									||searchMovie.equals(movieInfo.date.format(formatter))){
								System.out.printf("%s	|   %s	 |  %s  |  %2d   |  %.2f\n", movieInfo.movieName,
										movieInfo.date.format(formatter), movieInfo.supervision, movieInfo.ageLimit,
										movieInfo.rating);
							}
						}
						
					} else if (internalMenu.equals("3")) {
						System.out.println("영화 제목  |       개봉일    |  감독  | 연령 제한  |  평점");
						for (MovieList movieInfo : movieInfos) {
							System.out.printf("%s	|   %s	 |  %s  |  %2d   |  %.2f\n", movieInfo.movieName,
									movieInfo.date.format(formatter), movieInfo.supervision, movieInfo.ageLimit,
									movieInfo.rating);
						}
						MovieList selectedMovie = null; //고른 영화의 정보 호출 준비
						try { //영화 예매 시 띄어쓰기를 안 하고 제목 입력시 나오는 에러 잡기
							System.out.print("관람하실 영화의 제목을 입력해주세요. > ");
							String choiceMovie = sc.nextLine().trim();
							for (MovieList movieInfo : movieInfos) {
								if (movieInfo.movieName.equals(choiceMovie)) {
									selectedMovie = movieInfo; //movieInfo 리스트에 있는 목록 중 이름 일치하는 정보 호출
									break;
								}
							}
							if(loginedMember.age < selectedMovie.ageLimit) { //로그인 되어 있는 계정 나이와 영화 연령제한 검사
								System.out.println("적정 연령이 아닙니다.");
								continue;
							}
						    System.out.println("좌석을 선택해 주세요.");
						    selectedMovie.displaySeats();//영화 좌석 -> 빈 좌석 □
						    System.out.print("원하시는 좌석 번호를 선택해주세요 (ex)2 2) ");
						    int row = sc.nextInt();
						    int col = sc.nextInt();
						    
						    sc.nextLine();
						    selectedMovie.bookSeat(row-1, col-1);//입력 좌석 예매 후 ■
						 
						    if (selectedMovie != null) {
						        // 예매 금액 설정 (예시로 10,000원)
						    	int ticketPrice = 12000;
						    	if(loginedMember.age < 18) { 
						    		ticketPrice = 8000;
						    	}
						        if (loginedMember.wallet >= ticketPrice) {
						            loginedMember.wallet -= ticketPrice;
						            System.out.printf("%s 영화를 예매하셨습니다. 현재 잔액은 %d원입니다.\n", selectedMovie.movieName, loginedMember.wallet);
						            saveReservation(loginedMember, selectedMovie, row, col); // 예매 정보 저장
						            updateMovieFile(); // 영화 정보 업데이트
						            updateMemberFile(); // 회원 정보 업데이트
						            // 예매 정보를 사용자 데이터에 추가 (나중에 확인, 취소 가능하게)
						            loginedMember.addReservation(selectedMovie);
						            selectedMovie.displaySeats();
						        } else {
						            System.out.println("잔액이 부족하여 예매할 수 없습니다.");
						        }
						    }						
						}catch(NullPointerException e) {
							System.out.println("영화 제목을 띄어쓰기도 포함하여 작성해주세요.");
						}
						
					} else if (internalMenu.equals("4")) {
						System.out.println("┌───────────────────────────────────────────────────────────┐");
						System.out.println("│ 1.개인 정보 수정  2.예매한 영화 확인  3.나의 지갑  4.회원 탈퇴  5.나가기  │");
						System.out.println("└───────────────────────────────────────────────────────────┘");
						System.out.print("메뉴 선택 > ");
						String personalMenu = sc.nextLine();
						if (personalMenu.equals("5")) {
							System.out.println("개인 정보 확인 창을 종료하겠습니다.");
						} else if (personalMenu.equals("1")) {
							System.out.print("비밀번호 확인 : ");
							String passCheck = sc.nextLine().trim();

							Member changeMemberData = null;

							for (Member member : members) { //passCheck이 저장된 번호가 같은 시 정보 호출
								if (loginedMember != null && passCheck.equals(loginedMember.pass)) {
									changeMemberData = loginedMember;
									break;
								}
							}

							if (changeMemberData != null) {
								System.out.println("변경하실 정보를 골라주세요.");
								System.out.println("┌────────────────┐");
								System.out.println("│ 1.이름  2.비밀번호 │");
								System.out.println("└────────────────┘");
								System.out.print("메뉴 선택 > ");
								String changeMenu = sc.nextLine();
								if (changeMenu.equals("1") || changeMenu.trim().equals("이름")) {
									System.out.print("새로운 이름 입력 : ");
									String newName = sc.nextLine().trim();
									//새로 입력받은 정보를 가져온 changeMemberData에 입력
									changeMemberData.name = newName;
									System.out.println("변경이 완료되었습니다.");
									updateMemberFile();
								} else if (changeMenu.equals("2") || changeMenu.trim().equals("비밀번호")) {
									System.out.print("새로운 비밀번호 입력 : ");
									String newPassword = sc.nextLine().trim();

									changeMemberData.pass = newPassword;
									System.out.println("변경이 완료되었습니다.");
									updateMemberFile(); //확인 필요
								} else {
									System.out.println("유효하지 않은 명령입니다.");
								}
							} else {
								System.out.println("비밀번호가 일치하지 않습니다.");
							}

						} else if (personalMenu.equals("2")) {
								//계정마다 저장된 예약정보 호출
							 List<MovieList> reservations = loginedMember.getReservations(); 
							    if (reservations.isEmpty()) { //isEmpty 함수를 통해 예약 정보 null 여부 확인
							        System.out.println("예매한 영화가 없습니다.");
							    } else {
							        System.out.println("예매한 영화 목록:");
							        for (MovieList reservation : reservations) {
							            System.out.printf("영화: %s | 개봉일: %s | 감독: %s\n",
							                    reservation.movieName, reservation.date.format(formatter), reservation.supervision);
							        }
							        System.out.print("예매 취소할 영화의 제목을 입력해주세요. (취소하지 않으려면 엔터): ");
							        String cancelMovie = sc.nextLine().trim();
							        if (!cancelMovie.isEmpty()) {
							            MovieList movieToCancel = null;
							            for (MovieList reservation : reservations) {
							                if (reservation.movieName.equals(cancelMovie)) {
							                    movieToCancel = reservation;
							                    break;
							                }//취소를 입력한 제목의 영화가 있는지 확인
							            }
							            if (movieToCancel != null) {
							                loginedMember.cancelReservation(movieToCancel);
							                if(loginedMember.age < 18) {
							                	loginedMember.wallet += 8000;  
							                }else {
							                	loginedMember.wallet += 12000;  							                	
							                }//환불
							                System.out.printf("%s 영화의 예매가 취소되었습니다. 현재 잔액은 %d원입니다.\n", movieToCancel.movieName, loginedMember.wallet);
							                
							                updateMovieFile(); // 영화 정보 업데이트
							                updateMemberFile(); // 회원 정보 업데이트
							            } else {
							                System.out.println("입력한 영화가 예매 목록에 없습니다.");
							            }
							        }
							    }
						} else if (personalMenu.equals("3")) {
							System.out.printf("%s 고객님은 현재 %d원을 보유 중입니다.\n", loginedMember.name, loginedMember.wallet);
							System.out.println("┌────────────────┐");
							System.out.println("│ 1.충전  2.나가기  │");
							System.out.println("└────────────────┘");

							System.out.print("메뉴 선택 > ");
							String walletMenu = sc.nextLine();

							if (walletMenu.equals("1") || walletMenu.equals("충전")) {
								System.out.println("충전하실 금액을 입력해주세요.");
								System.out.print("금액 > ");
								String moneyLoad = sc.nextLine();

								try {
									Integer.parseInt(moneyLoad);
									loginedMember.wallet += Integer.parseInt(moneyLoad);
									System.out.println("충전이 완료되었습니다.");
									updateMemberFile();
								} catch (NumberFormatException e) {
									System.out.println("충전 금액이 정수가 아닙니다.");
								}

							} else if (walletMenu.equals("2") || walletMenu.equals("나가기")) {
								System.out.println("개인 정보 메뉴로 돌아갑니다.");
							} else {
								System.out.println("유효하지 않은 명령입니다.");
							}

						} else if (personalMenu.equals("4")) {
							System.out.println("회원 탈퇴를 하시겠습니까?");
							System.out.println("1.네 \t 2.아니오");
							System.out.print("메뉴 선택 > ");
							String WithdrawalChoice = sc.nextLine();
							if (WithdrawalChoice.equals("2")) {
								System.out.println("기존 메뉴창으로 돌아갑니다.");
								break;
							} else if (WithdrawalChoice.equals("1")) {
								Member Withdrawal = callMemberData(loginedMember.id);
								deleteMemberFromFile(Withdrawal);
								loginedMember = null;
								System.out.println("회원 탈퇴가 완료되었습니다.");
								System.out.println("프로그램을 다시 실행해주세요.");
								System.exit(0);
							} else {
								System.out.println("유효하지 않은 명령입니다.");
							}
						} else {
							System.out.println("유효하지 않은 명령입니다.");
						}
					} else if (internalMenu.equals("5")) {
						if (loginedMember != null && loginedMember.manager) {
							System.out.println("┌───────────────────────────────────────────────────┐");
							System.out.println("│ 1.영화 목록 등록  2.영화 목록 삭제  3.유저 계정 관리  4.나가기  │");
							System.out.println("└───────────────────────────────────────────────────┘");
							System.out.print("메뉴 선택 > ");
							int managerMenu = sc.nextInt();
							sc.nextLine();
							switch (managerMenu) {
							case 1:
								System.out.print("영화 제목 : ");
								String title = sc.nextLine().trim();
								System.out.print("출시일(예: 2024-10-11) : ");
								String date = sc.nextLine().trim();
								System.out.print("영화 감독 : ");
								String supervision = sc.nextLine().trim();
								System.out.print("연령 제한 : ");
								String ageLimit = sc.nextLine().trim();
								System.out.print("평점 : ");
								String rating = sc.nextLine().trim();

								LocalDate releaseDate = LocalDate.parse(date,
										DateTimeFormatter.ofPattern("yyyy-MM-dd"));

								MovieList movieInfo = new MovieList(title, releaseDate, supervision,
										Integer.parseInt(ageLimit), Double.parseDouble(rating));
								movieInfos.add(movieInfo);
								updateMovieFile();
								System.out.println("영화가 등록되었습니다.");
								continue;
							case 2:
								System.out.print("삭제하실 영화의 제목을 입력해주세요 > ");
								String deleteInfo = sc.nextLine().trim();

								MovieList foundMovie = callMovieData(deleteInfo);

								if (foundMovie == null) {
									System.out.printf("%s의 제목인 영화는 존재하지 않습니다\n", deleteInfo);
									continue;
								}

								movieInfos.remove(foundMovie);
								updateMovieFile();
								System.out.printf("%s 영화가 목록에서 삭제되었습니다\n", deleteInfo);
								continue;

							case 3:
								System.out.println("------유저 목록------");
								System.out.println("이름 \t ID \t 소지금");
								
								for (Member member : members) {
									if(member.manager == false) {
										System.out.printf("%s \t %s \t %d \t %d\n", member.id, member.name, member.wallet,member.age);										
									}
								}
								continue;
							case 4:
								System.out.println("관리자 창을 종료하겠습니다.");
								break;
							default:
								System.out.println("유효하지 않은 명령입니다.");
								break;
							}
						} else {
							System.out.println("관리자 계정이 아닙니다.");
						}
					}
				}

			} else {
				System.out.println("유효하지 않은 명령입니다.");
			}
			sc.close();
		}

	}

	private MovieList callMovieData(String movieName) {
		for (int i = 0; i < movieInfos.size(); i++) {
			MovieList movieInfo = movieInfos.get(i);

			if (movieInfo.movieName.equals(movieName)) {
				return movieInfo;
			}
		}
		return null;
	}

	private Member callMemberData(String id) {
		for (int i = 0; i < members.size(); i++) {
			Member member = members.get(i);

			if (member.id.equals(id)) {
				return member;
			}
		}
		return null;
	}

	private void makeManagerId() {
		members.add(new Member("manager", "1234", "manager", true, 0, 20));
	}

	private boolean isLogined() {
		return this.loginedMember != null;
	}

	private boolean isLoginIdDup(String loginId) {
		for (Member member : members) {

			if (member.id.equals(loginId)) {
				return false;
			}
		}
		return true;
	}

	private Member getMemberByLoginId(String id) {
		for (Member member : members) {

			if (member.id.equals(id)) {
				return member;
			}
		}
		return null;
	}

	public void deleteMemberFromFile(Member memberIdToDelete) {
		List<Member> members = new ArrayList<>();

		// 1. 파일에서 모든 데이터를 읽어오기
		try (BufferedReader reader = new BufferedReader(new FileReader("members.txt"))) {
			String line;
			while ((line = reader.readLine()) != null) {
				// 삭제할 멤버 ID가 아닌 경우에만 리스트에 추가
				String[] data = line.split(",");
				String loginId = data[0];
				String loginPass = data[1];
				String name = data[2];
				boolean manager = Boolean.parseBoolean(data[3]);
				int wallet = Integer.parseInt(data[4]);
				int age = Integer.parseInt(data[5]);

				// 삭제할 멤버 ID와 일치하지 않는 경우에만 리스트에 추가
				if (!loginId.equals(memberIdToDelete.id)) {
					members.add(new Member(loginId, loginPass, name, manager, wallet, age));
				}
			}
		} catch (IOException e) {
			System.out.println("파일을 읽는 중 오류가 발생했습니다.");
		}

		// 2. 파일을 새로 작성하여 업데이트된 멤버 리스트를 저장
		try (BufferedWriter writer = new BufferedWriter(new FileWriter("members.txt"))) {
			for (Member member : members) {
				writer.write(member.id + "," + member.pass + "," + member.name + "," + member.manager + ","
						+ member.wallet + "," + member.age);
				writer.newLine();
			}
		} catch (IOException e) {
			System.out.println("파일을 저장하는 중 오류가 발생했습니다.");
		}
	}
	public void updateMemberFile() {
	    try (BufferedWriter writer = new BufferedWriter(new FileWriter("members.txt"))) {
	        for (Member member : members) {
	            writer.write(member.id + "," + member.pass + "," + member.name + ","
	                    + member.manager + "," + member.wallet + "," + member.age);
	            writer.newLine();
	        }
	    } catch (IOException e) {
	        System.out.println("회원 정보를 파일에 저장하는 중 오류가 발생했습니다.");
	    }
	}
	public void updateMovieFile() {
	    try (BufferedWriter writer = new BufferedWriter(new FileWriter("movies.txt"))) {
	        for (MovieList movie : movieInfos) {
	            writer.write(movie.movieName + "," + movie.date + "," + movie.supervision + "," +
	                    movie.ageLimit + "," + movie.rating + ",");
	            
	            // 좌석 상태를 파일에 저장 (행별로 구분)
	            for (char[] row : movie.seats) {
	                for (char seat : row) {
	                    writer.write(seat); // '□' 또는 '■'
	                }
	                writer.write(";"); // 행 구분자
	            }
	            writer.newLine();
	        }
	    } catch (IOException e) {
	        System.out.println("영화 정보를 파일에 저장하는 중 오류가 발생했습니다.");
	    }
	}
	public void saveReservation(Member member, MovieList movie, int row, int col) {
	    try (BufferedWriter writer = new BufferedWriter(new FileWriter("reservations.txt", true))) {
	        writer.write(member.id + "," + movie.movieName + "," + row + "," + col);
	        writer.newLine();
	    } catch (IOException e) {
	        System.out.println("예매 정보를 파일에 저장하는 중 오류가 발생했습니다.");
	    }
	}
	public void loadMovieFile() {
		DateTimeFormatter movieFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		try (BufferedReader reader = new BufferedReader(new FileReader("movies.txt"))) {
			String line;
			while ((line = reader.readLine()) != null) {
				String[] data = line.split(","); // 파일에서 쉼표로 구분된 데이터를 읽기
				String movieName = data[0];
				String dateString = data[1];
				String supervision = data[2];
				int ageLimit = Integer.parseInt(data[3]);
				double rating = Double.parseDouble(data[4]);
				
				LocalDate date = LocalDate.parse(dateString, movieFormatter);
				
				MovieList movieInfo = new MovieList(movieName, date, supervision, ageLimit, rating);
				movieInfos.add(movieInfo); // 읽어온 데이터를 바탕으로 멤버 객체를 생성하고 리스트에 추가
			}
		} catch (IOException e) {
			System.out.println("파일에서 영화 정보를 불러오는 중 오류가 발생했습니다.");
		}
	}
	public void loadReservations() {
	    try (BufferedReader reader = new BufferedReader(new FileReader("reservations.txt"))) {
	        String line;
	        while ((line = reader.readLine()) != null) {
	            String[] data = line.split(",");
	            String memberId = data[0];
	            String movieName = data[1];
	            int row = Integer.parseInt(data[2]);
	            int col = Integer.parseInt(data[3]);

	            // 해당 영화와 좌석 정보를 업데이트
	            MovieList movie = callMovieData(movieName);
	            if (movie != null) {
	                movie.seats[row-1][col-1] = '■';
	            }
	        }
	    } catch (IOException e) {
	        System.out.println("예매 정보를 파일에서 불러오는 중 오류가 발생했습니다.");
	    }
	}
}
