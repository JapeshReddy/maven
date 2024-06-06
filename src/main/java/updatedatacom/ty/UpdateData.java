package updatedatacom.ty;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateData {
	private static String url="jdbc:postgresql://localhost:5432/shop";
	private static String user="postgres";
	private static String password=" ";
public static void main(String[] args) {
	try {
		Class.forName("org.postgresql.Driver");
		Connection con =DriverManager.getConnection(url, user, password);
		String sql="UPDATE product set cost=2500 WHERE ID=3";
		Statement stm=con.createStatement();
		stm.execute(sql);
		con.close();
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	} catch (SQLException e) {
		e.printStackTrace();
		
		
		
		System.out.println("----------");
	}
}
}
