import java.sql.*;
public class CreateChar {

	public static void cchar () throws Exception{
		String url = "jdbc:mysql://127.0.0.1:3306/characters";
		String username = "root";
		String password = "1234";
		String query = "Insert into names values (?,?,?)";
		
		Connection con = DriverManager.getConnection(url, username, password);
		PreparedStatement ps = con.prepareStatement(query);
		ps.setInt(1, 4);
		ps.setString(2, "Yuta");
		ps.setInt(3, 700000000);
		ps.executeUpdate();
		con.close();
	}

	public static void main(String[] args) throws Exception {
		cchar();
}
}
