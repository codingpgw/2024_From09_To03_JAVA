package com.pcwk.ehr.ed02;
import java.util.*;
public class J02CommandHistory {
	//기록할 명령어 최대 개수
	private static final int HISTORY_LIMIT = 5;
	private Queue<String> historyQ = new LinkedList<String>();
	
	//명령어 추가 함수
	public void addCommand(String command) {
		//명령어가 기록 한계를 넘었을 때, 오래된 명령어 삭제
		if(HISTORY_LIMIT == historyQ.size()) {
			historyQ.poll(); //큐에서 오랜된 명령어 삭제
		}
		historyQ.offer(command);
	}
	//히스토리 출력 함수
	public void showHistory() {
		if(historyQ.isEmpty()) {
			System.out.println("History를 이용할 수 없습니다.");
		}else {
			System.out.println("Command History");
			
			int i = 1;
			for(String cmd : historyQ) {
				System.out.println(i+"."+cmd);
				i++;
			}
		}
		
	}
	
	public static void main(String[] args) {
		J02CommandHistory cmdHistory = new J02CommandHistory();
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("q 또는 Q를 입력하면 프로그램 종료.");
			System.out.println("history를 입력하면 최근 입력한 명령어"+HISTORY_LIMIT+"개를 보여줍니다.");
			String command = sc.nextLine();
			
			if(command.equalsIgnoreCase("q")) {
				System.out.println("프로그램 종료");
				System.exit(0);
			}else if(command.equals("history")) {
				cmdHistory.showHistory();
			}else{
				cmdHistory.addCommand(command);
//				 echo $JAVA_HOME
//				 java -verion
//				 echo $PATH
//				 ls -l
//				 uname
//				 pwd
			}
		}

	}

}
