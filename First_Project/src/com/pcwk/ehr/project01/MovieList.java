package com.pcwk.ehr.project01;
import java.time.LocalDate;

public class MovieList {
	public String movieName;
	public LocalDate date;
	public String supervision;
	public int ageLimit;
	public double rating;
	public char[][] seats;
	

	public MovieList(String movieName,LocalDate date, String supervision, int ageLimit, double rating ) {
		this.movieName = movieName;
		this.date = date;
		this.supervision = supervision;
		this.ageLimit = ageLimit;
		this.rating = rating;
		this.seats = new char[5][5];
		initializeSeats();
	}
	
	  // 좌석 초기화 메서드
    private void initializeSeats() {
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                seats[i][j] = '□'; // 모든 좌석을 빈 상태로 초기화
            }
        }
    }
	
	public void displaySeats() {
	    System.out.println("현재 좌석 상태:");
	    for (int i = 0; i < seats.length; i++) {
	        for (int j = 0; j < seats[i].length; j++) {
	            System.out.print(seats[i][j] + " ");
	        }
	        System.out.println();
	    }
	}
	public void bookSeat(int row, int col) {
	    if (seats[row][col] == '■') {
	        System.out.println("이미 예매된 좌석입니다. 다른 좌석을 선택해 주세요.");
	    } else {
	        seats[row][col] = '■';
	        System.out.println("좌석이 성공적으로 예매되었습니다.");
	    }
	}
}
