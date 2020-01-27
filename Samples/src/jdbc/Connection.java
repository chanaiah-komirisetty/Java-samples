/**
 * @author Chanaiah
 *
 * 
 */
package jdbc;

/**
 * @author Chanaiah
 *
 * modified by @author Chanaiah last on 2019-11-26 15:07:45.546
 */
import java.sql.*;

class Connection {
	public static void main(String args[]) {
		try {
//step1 load the driver class  
			Class.forName("com.mysql.jdbc.Driver");

//step2 create  the connection object  
			java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kigalibank", "root",
					"mFino3600");

//step3 create the statement object  
			Statement stmt = con.createStatement();

//step4 execute query  
			ResultSet rs = stmt.executeQuery("select * from mfs_sec_actor_custom_role");
			while (rs.next())
				System.out.println(rs.getString(1) + "  " + rs.getString(2) + "  " + rs.getString(3));

//step5 close the connection object  
			con.close();

		} catch (Exception e) {
			System.out.println(e);
		}

	}
}