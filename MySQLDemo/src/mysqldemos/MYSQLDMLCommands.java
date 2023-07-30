package mysqldemos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MYSQLDMLCommands {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		/*//Create a connection
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demodatabase", "root", "root");

		//Create a statement
		
		Statement stat = con.createStatement();
		
		//String s = "INSERT INTO STUDENT VALUES(105, 'Smith')";
		String s1 = "DELETE FROM  STUDENT WHERE STUDENTID = 103"; 
		
		// Execute the query
		
		//stat.execute(s);
		stat.execute(s1);
		
		// Close the connection
		
		stat.close();*/
		
		//Create a connection
		
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demodatabase", "root", "root");

				//Create a statement
				
				Statement stat = con.createStatement();
				
				//String s = "INSERT INTO STUDENT VALUES(105, 'Smith')";
				String s1 = "select idemployee, EmployeeName, EmployeeResident, EmployeeSalary from employee "; 
				
				// Store the data in Resultset
				
				ResultSet rs = stat.executeQuery(s1);
				
				//stat.execute(s);
				//stat.execute(s1);
				
				// Print
				
				while(rs.next())
				{
					int eid = rs.getInt("idEmployee");
					String ename = rs.getString("EmployeeName");
					String eres = rs.getString("EmployeeResident");
					int esalary = rs.getInt("EmployeeSalary");
					
					System.out.println(eid+" | "+ename+" | "+eres+" | "+esalary);
							
				}
				
				
				
				// Close the connection
				
				con.close();
				
				System.out.println("Query is executed.......");
		
		
	}

}
