package sec06.ex07_arraycopy;

public class ArrayCopyForEx {

	public static void main(String[] args) {
		
		int[] oldArray = {1,2,3};
		int[] newArray = new int[5];
		
		for(int i=0; i<oldArray.length; i++) {
			newArray[i]=oldArray[i];
		}
		for(int i=0; i<newArray.length; i++) {
			System.out.print(newArray[i]);
		}
		

	}

}
