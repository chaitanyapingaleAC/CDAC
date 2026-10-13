
public class complex {

	public void sum(int r1, int i1,int r2, int i2) {
		System.out.println("sum is : "+(r1+r1)+"+"+(i1+i2)+"i");
		
	}
	public void diff(int r1, int i1,int r2, int i2) {
		System.out.println("sum is : "+(r1-r1)+"+"+(i1-i2)+"i");
		
	}
	public void mul(int r1, int i1,int r2, int i2) {
		System.out.println("sum is : "+(r1*r1)+"+"+(i1*i2)+"i");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		input obj=new input();
		System.out.println("enter real and img of first num : ");
		int r1=obj.getint();
		int i1=obj.getint();
		System.out.println("enter real and img of secoud num : ");
		int r2=obj.getint();
		int i2=obj.getint();
		
		complex oo=new complex();
		oo.sum(r1,i1,r2,i2);
		oo.diff(r1,i1,r2,i2);
		oo.mul(r1,i1,r2,i2);
	}

}
