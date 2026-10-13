
public class employee {
	
	int no;
	double sal;
	public void getinfo() {
		System.out.println("enter no of work dayas :");
		input obj=new input();
		no=obj.getint();
		System.out.println("enter salary : ");
		sal=obj.getint();
		
	}
	public void addsal() {
		if(sal<500) {
			sal +=10;
			
		}
	}
	public void addwork() {
		if(no>6) {
			sal +=5;
		}
	}
	
	public void display() {
		System.out.println("salary : "+sal);
		System.out.println("no of days : "+no);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		employee e=new employee();
		e.getinfo();e.addsal();
		e.addwork();
		e.display();
	}

}
