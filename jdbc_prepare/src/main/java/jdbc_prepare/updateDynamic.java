package jdbc_prepare;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class updateDynamic {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Scanner myScanner = new Scanner(System.in);
		
		System.out.println("enter id");
		int id = myScanner.nextInt();
		
		System.out.println("enter new last_name");
		String last_name = myScanner.next();
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/varunDB", "root", "Tiger@123");
		
		PreparedStatement preparedStatement = connection.prepareStatement("update user set last_name = ? where id = ?");
		preparedStatement.setString(1, last_name);
		preparedStatement.setInt(2, id);
		int returnVal = preparedStatement.executeUpdate();
		
		connection.close();		
		
		System.out.println("done!!!!!");
	}
}
