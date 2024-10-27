package jdbc_prepare;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class SelectDynamic {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/varunDB", "root", "Tiger@123");
		
		PreparedStatement preparedStatement = connection.prepareStatement("select * from user");
		ResultSet result = preparedStatement.executeQuery();
		
		while(result.next()) {
			System.out.println(result.getInt(1));
			System.out.println(result.getString(2));
			System.out.println(result.getString(3));
			System.out.println(result.getString(4));
			System.out.println(result.getString(5));
			System.out.println("********************************");
		}
		
		connection.close();		
		
		System.out.println("done!!!!!");
	}
}
