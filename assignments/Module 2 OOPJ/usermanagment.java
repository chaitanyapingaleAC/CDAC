import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class usermanagment {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String url="jdbc:mysql://localhost:3306/user_db";
		String user="root";
		String password="1234";
		try(Connection conn=DriverManager.getConnection(url,user,password)){
			
			int choice;
			do {
				System.out.println("\n===== USER MANAGEMENT SYSTEM =====");
                System.out.println("1. Register a User");
                System.out.println("2. List All Users Based on City");
                System.out.println("3. Update Password of a User");
                System.out.println("4. Display User Information Based on User Name");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");

                choice = Integer.parseInt(sc.nextLine());

                switch (choice) {
                    case 1:
                        registerUser(conn);
                        break;

                    case 2:
                        listUsersByCity(conn);
                        break;

                    case 3:
                        updatePassword(conn);
                        break;

                    case 4:
                        displayUserByUsername(conn);
                        break;

                    case 5:
                        System.out.println("Exiting application...");
                        break;

                    default:
                        System.out.println("Invalid choice!");
                }

				
			}while(choice!=5);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	

	}
	
	 static void registerUser(Connection conn) {
		 
		 try(PreparedStatement ps=conn.prepareStatement("insert into user_info values (?,?,?,?,?)")){
			 
			 System.out.println("enter username");
			 String username=sc.nextLine(); 
			   ps.setString(1, username);
			   
			 System.out.println("enter password ");
			 String pass=sc.nextLine();
			 ps.setString(2, pass);
			 
			 System.out.println(" enter name :");
			 String name=sc.nextLine();
			 ps.setString(3, name);
			 
			 System.out.println("enter email:");
			 String email=sc.nextLine();
			 ps.setString(4, email);
			 
			 System.out.println("enter city :");
			 String city=sc.nextLine();
			 ps.setString(5, city);
			 
			 int row=ps.executeUpdate();
			 if(row>0) {
				 System.out.println("inserted successfully");
			 }
			 
			 
		 } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		}
	 
	 
	 
	 
	 static void listUsersByCity(Connection conn) {
		 try {
			PreparedStatement ps=conn.prepareStatement("select * from user_info where city=?");
			System.out.println("enter your city...");
			ps.setString(1, sc.nextLine());
			
			ResultSet r=ps.executeQuery();
			while(r.next()) {

				System.out.println("\nusername : "+r.getString("username"));
				System.out.println("name : "+r.getString("name"));
				System.out.println("email : "+r.getString("email"));
				System.out.println("city : "+r.getString("city"));
			}
			
		 } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		 }
	 }
	 
	 
	 
	 
	 static void  updatePassword(Connection conn) {
		 try {
			PreparedStatement ps=conn.prepareStatement("update user_info set password=? where name=?");
			System.out.println("enter the name wher you want to update password");
			ps.setString(2,sc.nextLine());
			System.out.println("enter the updated password ");
			ps.setString(1, sc.nextLine());
			
			int row=ps.executeUpdate();
			if(row<0) {
				System.out.println("not update ");
			}else {
				System.out.println("updated");
			}
			
			
			
		 } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		 }
	 }
	 static void displayUserByUsername(Connection conn) {
		 
		 try {
			PreparedStatement ps=conn.prepareStatement("select * from user_info where username=?");
		
			System.out.println("enter the username");
			ps.setString(1, sc.nextLine());
			
			ResultSet rr=ps.executeQuery();
			
			if(rr.next()) {
				System.out.println("username :"+rr.getString("username"));
				System.out.println("name :"+rr.getString("name"));
				System.out.println("city :"+rr.getString("city"));
				System.out.println("password :"+rr.getString("password"));
			}
			
			
		 } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		 }
		 
	 }

}
