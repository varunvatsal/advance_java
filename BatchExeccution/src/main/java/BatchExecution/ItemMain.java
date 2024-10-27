package BatchExecution;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ItemMain {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/BatchExecution", "root", "Tiger@123");
		
		item i1 = new item(1, "denims", 3000);
		item i2 = new item(2, "kurta", 1000);
		item i3 = new item(3, "book", 300);
		
		List<item> l1 = new ArrayList<item>();
		l1.add(i1);
		l1.add(i2);
		l1.add(i3);
		
		PreparedStatement preparedStatement = connection.prepareStatement("insert into item values (?, ?, ?)");
		for(item ele: l1) {
			preparedStatement.setInt(1, ele.getId());
			preparedStatement.setString(2, ele.getName());
			preparedStatement.setDouble(3, ele.getCost());
			preparedStatement.addBatch();
		}
		
		preparedStatement.executeBatch();
		connection.close();
		System.out.println("batch data inserted");
	}
}
