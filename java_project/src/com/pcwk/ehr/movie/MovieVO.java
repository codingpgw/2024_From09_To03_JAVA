package com.pcwk.ehr.movie;

import java.time.LocalDate;

import com.pcwk.ehr.cmn.DTO;

public class MovieVO extends DTO {
	private String movieName;
	private LocalDate date;
	private String supervision;
	private int ageLimit;
	private double rating;
	private char[][] seats;
	

	public MovieVO(String movieName,LocalDate date, String supervision, int ageLimit, double rating ) {
		this.movieName = movieName;
		this.date = date;
		this.supervision = supervision;
		this.ageLimit = ageLimit;
		this.rating = rating;
		this.seats = new char[5][5];
		initializeSeats();
	}
	
	  public String getMovieName() {
		return movieName;
	}



	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}



	public LocalDate getDate() {
		return date;
	}



	public void setDate(LocalDate date) {
		this.date = date;
	}



	public String getSupervision() {
		return supervision;
	}



	public void setSupervision(String supervision) {
		this.supervision = supervision;
	}



	public int getAgeLimit() {
		return ageLimit;
	}



	public void setAgeLimit(int ageLimit) {
		this.ageLimit = ageLimit;
	}



	public double getRating() {
		return rating;
	}



	public void setRating(double rating) {
		this.rating = rating;
	}



	public char[][] getSeats() {
		return seats;
	}



	public void setSeats(char[][] seats) {
		this.seats = seats;
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

	@Override
	public String toString() {
		return "MovieVO [movieName=" + movieName + ", date=" + date + ", supervision=" + supervision + ", ageLimit="
				+ ageLimit + ", rating=" + rating + "]";
	}
	
	
}
