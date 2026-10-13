package day9;

public class stringclass {

	public static void main(String[] args) {
		
		String s="this is exersise 1";
		String ss="this is exersise 2";
		int a=s.compareTo(ss);
		if(a<0)
			System.out.println(s+" is less than "+ss);
		else if(a==0)
			System.out.println("same");
		else
			System.out.println(s+" is greater than "+ss);
		
		

	}

}
