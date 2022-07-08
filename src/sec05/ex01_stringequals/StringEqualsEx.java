package sec05.ex01_stringequals;

public class StringEqualsEx {

	public static void main(String[] args) {
		
		String strVar1 = "김주원";
		String strVar2 = "김주원";
		
		if(strVar1 == strVar2) {
			System.out.println("strVar1과 strVar2는 참조가 같음");
		} else {
			System.out.println("strVar1과 strVar2는 참조가 다름");
		}
		
		System.out.println("-----------------------------");
		
		String strVar3 = new String("김주원");
		String strVar4 = new String("김주원");
		
		if(strVar3 == strVar4) {
			System.out.println("strVar3과 strVar4는 참조가 같음");
		} else {
			System.out.println("strVar3과 strVar4는 참조가 다름");
		}

		System.out.println("-----------------------------");
		
		if(strVar3.equals(strVar4)) {
			System.out.println("strVar3과 strVar4는 문자열이 같음");
		}
		
	}
}
