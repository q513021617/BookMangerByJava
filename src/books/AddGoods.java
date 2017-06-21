package books;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AddGoods {

	public static int insert(Book book) {
		JdbcConnection con= new JdbcConnection();
	    Connection conn = con.dbConnection();
	    int i = 0;
	    String sql = "insert into books (name,count) values(?,?)";
	    PreparedStatement pstmt;
	    try {
	        pstmt = (PreparedStatement) conn.prepareStatement(sql);
	        pstmt.setString(1, book.getName());
	        pstmt.setString(2, book.getCount());
	        i = pstmt.executeUpdate();
	        pstmt.close();
	        conn.close();
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return i;
	}
	
	
	public static void main(String[] args) {
		
	
	}
	
}
