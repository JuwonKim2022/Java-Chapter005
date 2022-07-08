package sec06.ex04_mainargument;

public class MainStringArrayEx {

	public static void main(String[] args) {
		
		System.out.println("배열의 길이 : "+args.length);
		
		if(args.length != 2) {
			System.out.println("프로그램의 사용법");
			System.out.println("java MainStringArrayEx num1 num2");
			System.exit(0);		//프로그램 종료 
		}
		
		String strNum1 = args[0];
		String strNum2 = args[1];
		
		int num1 = Integer.parseInt(strNum1);	//문자열 인트
		int num2 = Integer.parseInt(strNum2);	//문자열 인트
		
		int result = num1 + num2;
		System.out.println(num1+"+"+num2+"="+result);
		
	}

}
