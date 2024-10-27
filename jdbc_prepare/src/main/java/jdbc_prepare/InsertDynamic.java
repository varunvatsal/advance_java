package jdbc_prepare;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertDynamic {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Scanner myScanner = new Scanner(System.in);
		
		System.out.println("enter the id");
		int id = myScanner.nextInt();
		
		System.out.println("enter the First name");
		String first_name=myScanner.next();
		
		System.out.println("enter the Last name");
		String last_name=myScanner.next();
		
		System.out.println("enter the email");
		String email=myScanner.next();
		
		System.out.println("enter the address");
		String address=myScanner.next();
		
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/varunDB", "root", "Tiger@123");
		
		PreparedStatement preparedStatement = connection.prepareStatement("insert into user values(?, ?, ?, ?, ?)");
		preparedStatement.setInt(1, id);
		preparedStatement.setString(2, first_name);
		preparedStatement.setString(3, last_name);
		preparedStatement.setString(4, email);
		preparedStatement.setString(5, address);
		
		preparedStatement.execute();
		connection.close();
		
		System.out.println("done!!!!");
	}
}
