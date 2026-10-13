
public class traingle {
	
	traingle(int a,int b, int c){
		System.out.println("peremeter is : "+(a+b+c));
		double s=(a+b+c)/2;
		double area=s*(s-a)*(s-b)*(s-c);
		System.out.println("area is : "+Math.sqrt(area));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		traingle obj=new traingle(3,4,5);
		

		
	}

}
