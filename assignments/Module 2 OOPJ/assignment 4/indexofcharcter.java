package day9;

public class stringclass {

	public static void main(String[] args) {
		
		String s = "The quick brown fox jumps over the lazy dog.";

		for( char c='a';c<='z';c++) {
			
			int i=s.indexOf(c);
			System.out.println(c+" = "+i);
			
			
		}

		

	}

}
