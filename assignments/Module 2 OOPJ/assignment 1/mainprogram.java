
public class mainprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int choice;
utility obj=new utility();
input in=new input();
		do {
			System.out.println("*********************");
		System.out.println("1.set date");
		System.out.println("2.add day");
		System.out.println("3.add month");
		System.out.println("4.add year");
		System.out.println("5.display");
		System.out.println("6.compare dates");
		System.out.println("7.exit");
		System.out.println("*********************");
		System.out.println("enter your choice");
		System.out.println("*********************");
		
		 choice=in.getint();
		
		
		switch(choice) {
		case 1:{
			System.out.println("enter day");
			int dd=in.getint();
			System.out.println("enter month");
			int mm=in.getint();
			System.out.println("enter year");
			int yy=in.getint();
			
			obj.setDay(dd,mm,yy);
			System.out.println(obj.getDay()+"/"+ obj.getMonth()+"/"+obj.getYear());
		}
		break;
		
		case 2:{
			
			System.out.println("enter no of days you want to add ");
			int dd=in.getint();
			obj.addday(dd);
			obj.display();
			
		}
		break;
		
		case 3:{
			System.out.println("enter no of months you want to add ");
			int mm=in.getint();
			obj.addmonth(mm);
			obj.display();
			
		}
		break;
		
		case 4:{
			System.out.println("enter no of year you want to add ");
			int yy=in.getint();
			obj.addyear(yy);
			obj.display();
		}
		break;
		
		case 5:{
			obj.display();
		}
		break;
		
		case 6:{
		}
		break;
		
		case 7:{
			System.out.println("exited");
		}
		break;
		
		default:
			System.out.println("enter valid input");
		
	}}while(choice!=7);

}}
