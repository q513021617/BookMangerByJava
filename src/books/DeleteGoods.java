package books;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteGoods {
	public static int Delte(int id) {
		JdbcConnection con= new JdbcConnection();
	    Connection conn = con.dbConnection();
	    int i = 0;
	    String sql = "delete from books where id='" + id + "'";
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
