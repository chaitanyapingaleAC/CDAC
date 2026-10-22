import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.sql.CallableStatement;

public class mysqlconnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String user="root";
		String password="1234";
		String url="jdbc:mysql://localhost:3306/jdbc";
		
	
		try(Connection conn=DriverManager.getConnection(url, user, password);
				Statement smt=conn.createStatement();
				ResultSet res=smt.executeQuery("select * from student");
				)
		{
			while(res.next()) {
				int id=res.getInt("student_id");
				String name=res.getString("name");
				String marks =res.getString("marks");
				System.out.println(id+" "+name+" "+marks+" ");
			}
		
			smt.executeUpdate("update student set name='cmp' where student_id=1");
		
			
//			
//			PreparedStatement ps=conn.prepareStatement("insert into student values (?,?,?)");
//			
//			ps.setInt(1, 4);
//			ps.setString(2,"ddd");
//			ps.setInt(3, 99);
//			int rr=ps.executeUpdate();
			
			Scanner sc=new Scanner(System.in);
			System.out.println("enteer name");
			String cname=sc.nextLine();
			System.out.println("entyer the id");
			int cid=sc.nextInt();
			

			Statement ss=conn.createStatement();
			ResultSet rr=ss.executeQuery("select name,student_id from student where name='"+cname+"'and student_id='"+cid+"'");
			if(rr.next()) {
				System.out.println("authenticated");
			}else {
				System.out.println("not authencitaee");
			}
			
			
			
		}catch(SQLException e) {
			 e.printStackTrace();
		}

	}

}
