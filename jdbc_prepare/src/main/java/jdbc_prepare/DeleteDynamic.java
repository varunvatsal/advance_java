package jdbc_prepare;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteDynamic {
	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		
		Scanner myScanner = new Scanner(System.in);
		
		System.out.println("enter the id");
		int id = myScanner.nextInt();
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/varunDB", "root", "Tiger@123");
		
		PreparedStatement preparedStatement = connection.prepareStatement("delete from user where id=?");
		preparedStatement.setInt(1, id);
		
		preparedStatement.execute();
		
		connection.close();
		
		System.out.println("done!!!!!!");
		
		
	}
}
