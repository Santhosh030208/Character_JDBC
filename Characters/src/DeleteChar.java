import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeleteChar {
	
	public static void dchar () throws Exception{
		String url = "jdbc:mysql://127.0.0.1:3306/characters";
		String username = "root";
		String password = "1234";
		String query = "delete from names where name_id = 4";
		
		Connection con = DriverManager.getConnection(url, username, password);
		PreparedStatement ps = con.prepareStatement(query);
		ps.executeUpdate();
		con.close();
	}

	public static void main(String[] args) throws Exception {
		dchar();

}

}