import program.consoleinput;

public class entry {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		employee []arr=new employee[100];
		int count=0;
		int current=0;
		
		
		int choice;
		do {
			System.out.println("####################################################");
			 System.out.println("\n===== MAIN MENU =====");
		System.out.println("1. add employee ");
		System.out.println("2.Display ");
		System.out.println("3.sort ");
		System.out.println("4");
		System.out.println("5 ");
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
					System.out.println("enter the name:");
					String name=consoleinput.getstring();	
					System.out.println("enter the eddress");
					String address=consoleinput.getstring();
					System.out.println("enter age");
					int age=consoleinput.getint();
					System.out.println("enter the salary");
					float sal=consoleinput.getfloat();
					System.out.println("enter gender(true/false)");
					boolean gender=consoleinput.getboolean();
					System.out.println("enter hra");
					float hra=consoleinput.getfloat();
					arr[count]=new manager(name,address,age,gender,sal,hra);
					count++;
					System.out.println("manager added succesfully");
					
				}break;
				
				case 2:{
					System.out.println("enter the name:");
					String name=consoleinput.getstring();	
					System.out.println("enter the eddress");
					String address=consoleinput.getstring();
					System.out.println("enter age");
					int age=consoleinput.getint();
					System.out.println("enter the salary");
					float sal=consoleinput.getfloat();
					System.out.println("enter gender(true/false)");
					boolean gender=consoleinput.getboolean();
					System.out.println("enter overtime");
					int overtime=consoleinput.getint();
					arr[count]=new engineer(name,address,age,gender,sal,overtime);
					count++;
					System.out.println("engineer added succesfuly");
					
					
					
					
				}break;
				
				case 3:{
					
					System.out.println("enter the name:");
					String name=consoleinput.getstring();	
					System.out.println("enter the eddress");
					String address=consoleinput.getstring();
					System.out.println("enter age");
					int age=consoleinput.getint();
					System.out.println("enter the salary");
					float sal=consoleinput.getfloat();
					System.out.println("enter gender(true/false)");
					boolean gender=consoleinput.getboolean();
					System.out.println("enter region");
					String region=consoleinput.getstring();
					arr[count]=new salesperson(name,address,age,gender,sal,region);
					count++;
					System.out.println("salesperson  added succesfuly");
					
					
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
					if(count!=0)
					{
                      for(int itemp=0;itemp<count;itemp++) {
                    	  arr[itemp].display();
                      }
					}
					
				}break;
				case 2:{
					if(count!=0) {
						arr[0].display();
					}
					else
						System.out.println("no employee");
					
				}break;
				case 3:{
					if(count!=0) {
						arr[current+1].display();
						current++;
					}
					else
						System.out.println("no employee");
					
				}break;
				case 4:{
					if(count!=0 && current!=0) {
						arr[current-1].display();
						current--;
					}
					else
						System.out.println("no employee");
					
				}break;
				case 5:{
					if(count!=0) {
						arr[count-1].display();
						current=count-1;
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
		            if(count!=0) {
		            	for(int itemp=0;itemp<count;itemp++) {
		            		if(arr[itemp] instanceof manager) {
		            			arr[itemp].display();
		            		}
		            	}
		            }
		            else
		            	System.out.println("no employees");
		            break;
		        }

		        case 2:{
		            if(count!=0) {
		            	for(int itemp=0;itemp<count;itemp++) {
		            		if(arr[itemp] instanceof engineer) {
		            			arr[itemp].display();
		            		}
		            	}
		            }
		            else
		            	System.out.println("no employee");
		            break;
		        }

		        case 3:{
		          if(count!=0) {
		        	  for(int itemp=0;itemp<count;itemp++) {
		        		  if(arr[itemp] instanceof salesperson) {
		        			  arr[itemp].display();
		        		  }
		        	  }
		          }
		            break;
		        }

		        case 4:{
		            if(count!=0) {
		            	for(int itemp=0;itemp<count-1;itemp++) {
		            		for(int jtemp=itemp+1;jtemp<count;jtemp++) {
		            			
		            			if(arr[itemp].getName().compareTo(arr[jtemp].getName())>0) {
		            				employee temp=arr[itemp];
		            				arr[itemp]=arr[jtemp];
		            				arr[jtemp]=temp;
		            			}
		            		}
		            	}
		            	System.out.println("sorted employee");
		            	for(int itemp=0;itemp<count;itemp++) {
		            		arr[itemp].display();
		            	}
		            }
		            else
		            	System.out.println("no employee");
		            break;
		        }

		        case 5:{
		            if(count!=0) {
		            	for(int itemp=0;itemp<count-1;itemp++) {
		            		for(int jtemp=itemp+1;jtemp<count;jtemp++) {
		            			
		            			if(arr[itemp].getName().compareTo(arr[jtemp].getName())<0) {
		            				employee temp=arr[itemp];
		            				arr[itemp]=arr[jtemp];
		            				arr[jtemp]=temp;
		            			}
		            		}
		            	}
		            	
		            	System.out.println("decending order");
		            	for(int itemp=0;itemp<count;itemp++) {
		            		arr[itemp].display();
		            	}
		            }
		            break;
		        }

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
			
		}break;
		
		case 5:{
			
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
