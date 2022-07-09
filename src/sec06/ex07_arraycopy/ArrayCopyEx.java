package sec06.ex07_arraycopy;

public class ArrayCopyEx {

	public static void main(String[] args) {
		
		String[] oldArr = {"java","array","copy"};
		String[] newArr = new String[5];
		
		System.arraycopy(oldArr, 0, newArr, 0, oldArr.length);
		
		for(int i=0; i<newArr.length; i++) {
			System.out.print(newArr[i]+", ");
		}

	}

}
