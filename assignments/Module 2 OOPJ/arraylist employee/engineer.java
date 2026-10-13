
public class engineer extends employee{
int overtime;

	public engineer(String name,String address,int age,boolean gender,float basicsalary,int overtime){
		super(name,address,age,gender,basicsalary);
		setOvertime(overtime);
	}

	public int getOvertime() {
		return overtime;
	}

	public void setOvertime(int overtime) {
		this.overtime = overtime;
	}
	@Override
	public void display() {
		super.display();
		System.out.println("overtime : "+overtime);
	}
	
	
}
