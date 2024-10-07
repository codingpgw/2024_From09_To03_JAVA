package com.pcwk.ehr.ex06;

public class Chatting {
	class Chat{
		void start() {}
		void sendMessage(String message) {}
	}
	
	void startChat(String chatId) {
		String nickName = chatId;
		//nickName = chatId; -> 익명 이너 클래스에서 지역변수는 상수처럼 처음에만 초기화 가능
		
		Chat chat = new Chat() {
			@Override
			public void start() {
				while(true) {
					String inputData = "안녕하세요";
					String message = "[" + nickName + "]" + inputData;
					sendMessage(message);
				}
			}
		};
		
		chat.start();
	}
	
}
