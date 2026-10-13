import program.consoleinput;
import java.util.Collections;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.File;
public class entry {

	static String name;
	static String address;
	static int age;
	static float sal;
	static boolean gender;
	
	public static void employeeinfo() {
		System.out.println("enter the name:");
		 name=consoleinput.getstring();	
		System.out.println("enter the eddress");
		 address=consoleinput.getstring();
		System.out.println("enter age");
		age=consoleinput.getint();
		System.out.println("enter the salary");
		 sal=consoleinput.getfloat();
		System.out.println("enter gender(true/false)");
		 gender=consoleinput.getboolean();
	}

	public static void main(String[] args) {
		
//		employee []arr=new employee[100];
		ArrayList<employee> arrayobj=new ArrayList<>();
		
//		int count=0;
		int current=0;
	
		int choice;
		do {
			System.out.println("####################################################");
			 System.out.println("\n===== MAIN MENU =====");
		System.out.println("1. add employee ");
		System.out.println("2.Display ");
		System.out.println("3.sort ");
		System.out.println("4.Save");
		System.out.println("5.Load ");
		System.out.println("6.Exit ");
		System.out.println("************enter thr choice********");
		System.out.println("####################################################");
		choice=consoleinput.getint();
	
		switch(choice){
		case 1:{
			int cc;
			
			do {
				System.out.println("1.add manager");
				System.out.println("2.add engineer");
				System.out.println("3.add salesperson");
				System.out.println("4.exit to main menu");
				System.out.println("ener the choice");
				cc=consoleinput.getint();
				
				switch(cc) {
				case 1:{
					employeeinfo();
					System.out.println("enter hra");
					float hra=consoleinput.getfloat();
					arrayobj.add(new manager(name,address,age,gender,sal,hra));
//					arr[count]=new manager(name,address,age,gender,sal,hra);
//					count++;
					System.out.println("manager added succesfully");
					System.out.println("#####################################");
					
				}break;
				
				case 2:{
					employeeinfo();
					System.out.println("enter overtime");
					int overtime=consoleinput.getint();
					arrayobj.add(new engineer(name,address,age,gender,sal,overtime));
//					arr[count]=new engineer(name,address,age,gender,sal,overtime);
//					count++;
					System.out.println("engineer added succesfuly");
					System.out.println("#####################################");
					
				}break;
				
				case 3:{
					
					employeeinfo();
					System.out.println("enter region");
					String region=consoleinput.getstring();
					arrayobj.add(new salesperson(name,address,age,gender,sal,region));
//					arr[count]=new salesperson(name,address,age,gender,sal,region);
//					count++;
					System.out.println("salesperson  added succesfuly");
					System.out.println("#####################################");
					
					
				}break;
				
				case 4:{
					System.out.println("returend to main menu");
				}break;
				default:
					System.out.println("enter appropriate  the choice");
				}
			}while(cc!=4);
			
			
		}break;
		
		
		case 2:{
			int cc;
			do {
				 System.out.println("\n===== DISPLAY MENU =====");
				System.out.println("1.display all employee");
				System.out.println("2.first employee");
				System.out.println("3.next employee");
				System.out.println("4.previous employee");
				System.out.println("5.last employee");
				System.out.println("6.exit to main menu");
				cc=consoleinput.getint();
				
				switch(cc) {
				case 1:{
					if(arrayobj.size()!=0)
					{
                      for(int itemp=0;itemp<arrayobj.size();itemp++) {
                    	  arrayobj.get(itemp).display();
                      }
					}
					
				}break;
				case 2:{
					if(arrayobj.size()!=0) {
						arrayobj.get(0).display();
						
						
					}
					else
						System.out.println("no employee");
					
				}break;
				case 3:{
					if(arrayobj.size()!=0) {
						if(current<arrayobj.size()-1) {
							
							current++;
							arrayobj.get(current).display();;
						}
						else
							System.out.println("already last position");
						
						
					}
					else
						System.out.println("no employee");
					
				}break;
				case 4:{
					if(arrayobj.size()!=0) {
						if(current>0) {
							current--;
						arrayobj.get(current).display();;
						}
						else {
							System.out.println("alredy in 1st position...");
							
						}
					}
					else
						System.out.println("no employee");
					
				}break;
				case 5:{
					if(arrayobj.size()!=0) {
						current=arrayobj.size()-1;
						
						arrayobj.get(current).display();;
						
					}
					else
						System.out.println("no employee");
					
				}break;
				case 6:{
					System.out.println("returened to main menu");
					
				}break;
				default:
					System.out.println("enter appropriate  the choice");
					
					
				}
				
				
				
			}while(cc!=6);		
			
		}break;
				
			
		case 3: {

		    int sc;

		    do {

		        System.out.println("\n===== SORT MENU =====");
		        System.out.println("1. All Managers");
		        System.out.println("2. All Engineers");
		        System.out.println("3. All Sales Person");
		        System.out.println("4. All Employees Alphabetic order ascending");
		        System.out.println("5. All Employees Alphabetic order descending");
		        System.out.println("6. Exit to Main Menu");

		        System.out.println("Enter choice:");
		        sc = consoleinput.getint();

		        switch(sc) {

		        case 1:{
		            if(arrayobj.size()!=0) {
		            	for(int itemp=0;itemp<arrayobj.size();itemp++) {
		            		if(arrayobj.get(itemp) instanceof manager) {
		            			arrayobj.get(itemp).display();
		            		}
		            	}
		            }
		            else
		            	System.out.println("no employees");
		            break;
		        }

		        case 2:{
		            if(arrayobj.size()!=0) {
		            	for(int itemp=0;itemp<arrayobj.size();itemp++) {
		            		if(arrayobj.get(itemp) instanceof engineer) {
		            			arrayobj.get(itemp).display();
		            		}
		            	}
		            }
		            else
		            	System.out.println("no employee");
		            break;
		        }

		        case 3:{
		        	
		        	if(arrayobj.size()!=0) {
		            	for(int itemp=0;itemp<arrayobj.size();itemp++) {
		            		if(arrayobj.get(itemp) instanceof salesperson) {
		            			arrayobj.get(itemp).display();
		            		}
		            	}
		            }
		        	
		        	
		          }
		            break;
		        

		        case 4:{
		           
		        	Collections.sort(arrayobj,new employeecompare());
		        	for(employee e:arrayobj) {
		        		e.display();
		        	}
		            break;
		        }

		        case 5:{
		           
		        	Collections.sort(arrayobj,new employeecompare().reversed());
		        	for(employee e:arrayobj) {
		        		e.display();
		        	}
		        	
		        	
		            	}
		            
		            break;
		        

		        case 6:{
		            System.out.println("Returning to Main Menu...");
		            break;
		        }

		        default:
		            System.out.println("Invalid choice");
		        }

		    } while(sc != 6);

		} break;
		
		case 4:{
			
			try {
				ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream ("newemployee.txt"));
				out.writeObject(arrayobj);
//				out.writeInt(count);
				System.out.println("save data succesfully...");
				System.out.println(new File("newemployee.txt").getAbsolutePath());
				out.close();
				
			}
			 catch (Exception e) {
				
				e.printStackTrace();
			}
			
			
		}break;
		
		case 5:{
			
			try {
				ObjectInputStream in=new ObjectInputStream(new FileInputStream("newemployee.txt"));
				try {
					arrayobj=(ArrayList<employee>)in.readObject();
//					count=in.readInt();
					
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				finally {
					in.close();
				}
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}break;
		
		case 6:{
			
			System.out.println("exited from program......");
			System.out.println("thank you");
			
		}break;
		
		default:
			System.out.println("enter valid choice");
		}
		}while(choice!=6);

	}

}
