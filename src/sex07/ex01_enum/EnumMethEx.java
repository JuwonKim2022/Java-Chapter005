package sex07.ex01_enum;

public class EnumMethEx {

	public static void main(String[] args) {
		
		Week today = Week.SUNDAY;
		String name = today.name();
		System.out.println(name);
		
		int ordinal = today.ordinal();
		System.out.println(ordinal);
		
		Week day1 = Week.MONDAY;
		Week day2 = Week.WEDNESDAY;
		int result1 = day1.compareTo(day2);
		int result2 = day2.compareTo(day1);
		System.out.println(result1);
		System.out.println(result2);
		
		Week weekDay = Week.valueOf("SUNDAY");
		if(weekDay == Week.SATURDAY || weekDay == Week.SUNDAY) {
			System.out.println("주말");
		} else {
			System.out.println("주중");
		}
		
		Week[] days = Week.values();	//열거개 7개의 참조를 갖고 있는 배열을 만들어서 이 배열의 생성번지를 대입해
		for(Week day : days) {
			System.out.println(day);
		}

	}

}
