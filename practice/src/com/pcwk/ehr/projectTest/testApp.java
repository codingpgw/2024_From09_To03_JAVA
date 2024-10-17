package com.pcwk.ehr.projectTest;

import java.util.Scanner;

public class testApp {
	private MemberManager memberManager;
	private MovieManager movieManager;
	private Scanner sc;
	
	public testApp() {
        memberManager = new MemberManager();
        movieManager = new MovieManager();
        sc = new Scanner(System.in);
    }
	 public void run() {
	        System.out.println("========프로그램 시작========");
	        boolean isRunning = true;
	        
	        while (isRunning) {
	            UI.displayMainMenu();
	            String choice = sc.nextLine().trim();
	            
	            switch (choice) {
	                case "1":
	                    memberManager.login(sc);
	                    break;
	                case "2":
	                    memberManager.register(sc);
	                    break;
	                case "3":
	                    memberManager.accessSite(sc, movieManager);
	                    break;
	                case "4":
	                    isRunning = false;
	                    System.out.println("프로그램을 종료합니다.");
	                    break;
	                default:
	                    System.out.println("유효하지 않은 명령입니다.");
	                    break;
	            }
	        }
	 }
}
