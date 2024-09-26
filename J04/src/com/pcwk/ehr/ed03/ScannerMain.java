/**
 * ScannerMain.java<br/>
 * gy<br/>
 * 2024. 9. 12.<br/>
 */
package com.pcwk.ehr.ed03;

import java.util.Scanner; 

/**
 * 
 */
public class ScannerMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("두 자리 정수를 입력하세요 > ");
			
			
			String input = sc.nextLine();
			
			if(input.length() == 0 || input.length() > 2) {
				System.out.println("공백이거나 2자리를 넘었습니다.");
				continue;
			}else if(isNumberic(input)== false) {
				System.out.println("정수가 아닙니다. 다시 입력해주세요.");
				continue;
			}
			
			System.out.printf("input = %s %n", input);
			//숫자형 문자를 -> 숫자로
			
			int age = Integer.parseInt(input);
			System.out.printf("age = %d %n",(age-1));
			break;
		}
		sc.close();
		
	}
    public static boolean isNumberic(String str) {
        return str.chars().allMatch(Character::isDigit);
     }
    
    public static boolean isNumberic8(String str) {
    	boolean result = true;
    	for(char c : str.toCharArray()){
    		if(!Character.isDigit(c)){
    			result = false;
    			break;
    		}
    	}
    	return result;
    }
}


