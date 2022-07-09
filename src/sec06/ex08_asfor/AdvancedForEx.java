package sec06.ex08_asfor;

public class AdvancedForEx {

	public static void main(String[] args) {
		
		int[] scores = {96,53,75,91,80};
		int sum=0;
		
		for(int score : scores) {
			sum += score;
		}
		System.out.println("총합 : "+sum);
		
		double avg = (double)sum/scores.length;
		System.out.println("평균 : "+avg);

	}

}
