import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class GetChar {

	public static void gchar () throws Exception{
		String url = "jdbc:mysql://127.0.0.1:3306/characters";
		String username = "root";
		String password = "1234";
		String query = "select * from names where name_id = 1";
		
		Connection con = DriverManager.getConnection(url, username, password);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		
		while(rs.next()) {
			System.out.println("Food id is " + rs.getInt(1));
			System.out.println("Food name is " + rs.getString(2));
			System.out.println("Food price is " + rs.getInt(3)); 
		}
		con.close();
	}

	public static void main(String[] args) throws Exception {
		gchar();

}
}
