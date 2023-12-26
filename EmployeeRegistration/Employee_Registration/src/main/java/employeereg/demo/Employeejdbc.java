package employeereg.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import employeereg.model.Employee;

public class Employeejdbc {
	
	public int registerEmployee(Employee employee)throws ClassNotFoundException
	{
		String url = "jdbc:mysql//localhost:3306?user=root&password=12345";
		String insert = "insert into venky.registration" + " (fullname, email, mobilenumber, qualification, branch, yearofpass, skills, country, state, address, pincode, gender, aadharnumber, file) values " + "(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);";
		
		int result= 0;
		Class.forName("com.mysql.jdbc.Driver");
		
		try {
			Connection connection = DriverManager.getConnection(url);
			PreparedStatement ps = connection.prepareStatement(insert);
			
			ps.setString(1,  employee.getFullName());
			ps.setString(2, employee.getEmail());
			ps.setString(3, employee.getMobileNo());
			ps.setString(4, employee.getQualification());
			ps.setString(5, employee.getCourse());
			ps.setString(6, employee.getBrach());
			ps.setString(7, employee.getYearofpass());
			ps.setString(8, employee.getSkills());
			ps.setString(9, employee.getCountry());
			ps.setString(10, employee.getState());
			ps.setString(11, employee.getAddress());
			ps.setString(12, employee.getPincode());
			ps.setString(13, employee.getGender());
			ps.setString(14, employee.getAadharNo());
			ps.setBlob(15, employee.getFile);
			
			System.out.println(ps);
			
			result = ps.executeUpdate();
			
		} catch (SQLException e) {
			printSQLException(e);
		}
		return result;	
	}
	private void printSQLException(SQLException ex) {
		for(Throwable e: ex) {
			if(e instanceof SQLException) {
				e.printStackTrace(System.err);
				System.err.println("SQLState: "+ ((SQLException) e).getSQLState());
				System.err.println("Error Code: "+ ((SQLException) e).getErrorCode());
				System.err.println("Message: "+e.getMessage());
				Throwable t = ex.getCause();
				
				while (t != null) {
					System.out.println("Cause: " + t);
					t = t.getCause();				}
			}
		}
	}
}
