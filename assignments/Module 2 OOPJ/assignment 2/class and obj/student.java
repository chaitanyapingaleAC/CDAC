
public class student {
	String name;
	int rollno;
	String phone;
	String address;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		student obj=new student();
		obj.name="john";
		obj.rollno=22;
		obj.address="pune.maharashtra";
		obj.phone="5544887711";
		
		System.out.println("name: "+obj.name);
		System.out.println("roll no : "+obj.rollno);
		System.out.println("address : "+obj.address);
		System.out.println("phone : "+obj.phone);
	}

}
