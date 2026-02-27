import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateChar {

	public static void uchar () throws Exception{
		String url = "jdbc:mysql://127.0.0.1:3306/characters";
		String username = "root";
		String password = "1234";
		String query = "update names set stonks = 750000000 where name_id = 4";
		
		Connection con = DriverManager.getConnection(url, username, password);
		PreparedStatement ps = con.prepareStatement(query);
		ps.executeUpdate();
		con.close();
	}

	public static void main(String[] args) throws Exception {
		uchar();

}
}
