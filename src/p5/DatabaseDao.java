package p5;

import java.sql.Connection;
import java.sql.PreparedStatement;


public class DatabaseDao {

	public static int save(Employee bean){
		int status=0;
		try{
			Connection con=Database.getCon();
			PreparedStatement ps=con.prepareStatement("insert into fee_accountant(name,email,password,address,contact) values(?,?,?,?,?)");
			ps.setString(1,bean.getFname());
			ps.setString(2,bean.getLname());
			ps.setInt(3,bean.getAge());
			ps.setInt(4,bean.getSalary());
			ps.setString(5,bean.getGender());
			ps.setString(6,bean.getDept());
			ps.setString(7,bean.getState());
			ps.setString(8,bean.getCity());
			ps.setString(9,bean.getCheck());
			ps.setString(10,bean.getComment());
			status=ps.executeUpdate();
			con.close();
		}catch(Exception ex){System.out.println(ex);}
		return status;
	}
	
	
		
	
	
	public static void main(String[] args) {
		
	}

}
