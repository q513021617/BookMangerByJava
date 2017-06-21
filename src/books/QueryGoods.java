package books;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class QueryGoods {
	
	
	
	public static Book querygoodsbyid(int id) {
		JdbcConnection con= new JdbcConnection();
	    Connection conn = con.dbConnection();
	    Book book=new Book();
	    int i = 0;
	    String sql = "select * from books where id='" + id + "'";
	    PreparedStatement pstmt;
	    try {
	        pstmt = (PreparedStatement) conn.prepareStatement(sql);
	        ResultSet rs = pstmt.executeQuery();
	        int col = rs.getMetaData().getColumnCount();
	        while(rs.next())  
            {  
	           book.setId((int) rs.getObject("id"));
               book.setName(rs.getObject("name").toString());
               book.setCount(rs.getObject("count").toString());
            } 
	        pstmt.close();
	        conn.close();
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return book;
	}



}
