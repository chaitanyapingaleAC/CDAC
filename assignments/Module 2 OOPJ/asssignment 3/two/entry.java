import program.consoleinput;

public class entry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		member obj=new member();
		System.out.println("enter name");
		String name=consoleinput.getstring();
		obj.setName(name);
		System.out.println("enter the age");
		int age=consoleinput.getint();
		obj.setAge(age);
		System.out.println("enter address");
		String address=consoleinput.getstring();
		obj.setAddress(address);
		System.out.println("enter number");
		long num=consoleinput.getint();
		obj.setPhonenumber(num);
		System.out.println("enter salary");
		int sal=consoleinput.getint();
		obj.setSalary(sal);
		
		System.out.println("name : "+obj.getName()+" arrdess : "+obj.getAddress()+" number : "+obj.getPhonenumber()+" age : "+obj.getAge()+"  salary : "+obj.getSalary());
		
		
		primemember oobj=new primemember();
		System.out.println("enter name");
		String nname=consoleinput.getstring();
		oobj.setName(nname);
		System.out.println("enter the age");
		int aage=consoleinput.getint();
		oobj.setAge(aage);
		System.out.println("enter address");
		String aaddress=consoleinput.getstring();
		oobj.setAddress(aaddress);
		System.out.println("enter number");
		long nnum=consoleinput.getint();
		oobj.setPhonenumber(nnum);
		System.out.println("enter salary");
		int ssal=consoleinput.getint();
		oobj.setSalary(ssal);
		System.out.println("enter no of join year");
		int jyear=consoleinput.getint();
		oobj.setJyear(jyear);
//		
		System.out.println("enter join fee");
		int jfee=consoleinput.getint();
		oobj.setJfee(jfee);
		
		System.out.println("name : "+oobj.getName()+" arrdess : "+oobj.getAddress()+" number : "+oobj.getPhonenumber()+" age : "+oobj.getAge()+"  salary : "+oobj.getSalary()+"joining yera : "+oobj.getJyear()+" joining fee : "+oobj.jfee+" is active : "+oobj.isIsactive());

		
		
	}

}
