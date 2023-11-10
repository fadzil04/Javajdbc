import java.sql.*;

public class Updatee {
	public static void main(String[]args) throws Exception{
		insert();
	}
	public static void insert()  throws Exception {
		String url="jdbc:mysql://127.0.0.1:3306/faddi";
		String username="root";
		String password="Raalfaha";
		String query="update product set name='iphone' where id=101";
		Connection con=DriverManager.getConnection(url, username, password);
		PreparedStatement pst=con.prepareStatement(query);
		pst.executeUpdate();
		con.close();
	}


}
