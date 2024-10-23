package com.pcwk.ehr.ed04;
import java.io.*;
public class Main {

	public static void main(String[] args) {
		//바이트 스트림으로 변환하여 파일에 저장
		
		//직렬화
		Person person = new Person("이상무",22);
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.ser"))){
			oos.writeObject(person);
			

			System.out.println("객체 직렬화 : "+person);
			
			
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.ser"))){
			Person deserializedPerson = (Person)ois.readObject();
			
			System.out.println("역직렬화 완료 : "+deserializedPerson);
			
		}catch(IOException | ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
