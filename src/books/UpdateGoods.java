package books;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateGoods {
	public static int Update(Book book,int id) {
		JdbcConnection con= new JdbcConnection();
	    Connection conn = con.dbConnection();
	    int i = 0;
	    String sql = "update books set name='" + book.getName() + "',count='"+book.getCount()+"' where id='" +id + "'";
	    PreparedStatement pstmt;
	    try {
	        pstmt = (PreparedStatement) conn.prepareStatement(sql);

	        i = pstmt.executeUpdate();
	        System.out.println("resutl: " + i);
	        pstmt.close();
	        conn.close();
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return i;
	}
}
