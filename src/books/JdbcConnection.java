package books;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcConnection {
	private static Connection conn = null;

	// 定义数据库连接的方法dbConnection()，把获得数据库连接代码封装到一个方法中，便于多次调用和集中维护。
	public Connection dbConnection() {
		// 使用纯Java驱动方式
		try {
			// 加载的驱动程序
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException ce) {
			System.out.print(ce);
		}
		try {
			// 访问MySQL的URL
			String url = "jdbc:mysql://localhost:3306/test?characterEncoding=utf8&useSSL=false";
			String user = "root";// 登录用户名
			String password = "3256028";// 登录密码

			// 获得数据库连接
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("成功");
		} catch (SQLException ce) {
			System.out.print(ce);
		}
		return conn;
	}

	/**
	 * 测试数据库连接
	 * 
	 * @param args
	 */
	/*
	 * public static void main(String[] args) { JdbcConnection jdbc = new
	 * JdbcConnection(); Connection conn = jdbc.dbConnection(); if (null ==
	 * conn) { System.out.print("数据库连接不成功"); } else {
	 * System.out.print("数据库连接成功"); } }
	 */

	
	
}
