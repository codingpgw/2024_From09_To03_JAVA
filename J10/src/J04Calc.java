
public class J04Calc {

	public static void main(String[] args) {
		//파라메터가 3개가 아니면 프로그램 종료
		//* 파라메터 : 현재 디렉토리의 파일이름
		if(args.length != 3) {
			System.out.println("사용 방법 : J04Calc 13 + 15");
			//프로그램 강제 종료 : 0은 정상 종료, 0외에는 비정상
			System.exit(0);
		}
		
		
		int num01 = Integer.parseInt(args[0]);
		char op = args[1].charAt(0);
		int num02 = Integer.parseInt(args[2]);

		System.out.println("num01 : "+num01);
		System.out.println("op : "+op);
		System.out.println("num02 : "+num02);
		
		double result = 0.0;
		
		//사칙연산 : +,-,*,/
		switch(op) {
		case '+':
			result = num01 + num02;
			break;
		case '-':
			result = num01 - num02;
			break;
		case 'x':
		case 'X':
			result = num01 * num02;
			break;
		case '/':
			result = num01 / (double)num02;
			break;
		default:
			System.out.println("연산자를 확인하세요.");
		}
		
		System.out.printf("결과 : %.2f \n",result);
	}

}
