import java.sql.*;
public class Insert {
	public static void main(String[]args) throws Exception{
		insert();
	}
	public static void insert()  throws Exception {
		String url="jdbc:mysql://127.0.0.1:3306/faddi";
		String username="root";
		String password="Raalfaha";
		String query="insert into product values(?,?)";
		Connection con=DriverManager.getConnection(url, username, password);
		PreparedStatement pst=con.prepareStatement(query);
		pst.setInt(1, 101);
		pst.setString(2, "product");
		pst.executeUpdate();
		con.close();
	}

}

