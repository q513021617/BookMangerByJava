package books;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcConnection {
	private static Connection conn = null;

	// �������ݿ����ӵķ���dbConnection()���ѻ�����ݿ����Ӵ����װ��һ�������У����ڶ�ε��úͼ���ά����
	public Connection dbConnection() {
		// ʹ�ô�Java������ʽ
		try {
			// ���ص���������
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException ce) {
			System.out.print(ce);
		}
		try {
			// ����MySQL��URL
			String url = "jdbc:mysql://localhost:3306/test?characterEncoding=utf8&useSSL=false";
			String user = "root";// ��¼�û���
			String password = "3256028";// ��¼����

			// ������ݿ�����
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("�ɹ�");
		} catch (SQLException ce) {
			System.out.print(ce);
		}
		return conn;
	}

	/**
	 * �������ݿ�����
	 * 
	 * @param args
	 */
	/*
	 * public static void main(String[] args) { JdbcConnection jdbc = new
	 * JdbcConnection(); Connection conn = jdbc.dbConnection(); if (null ==
	 * conn) { System.out.print("���ݿ����Ӳ��ɹ�"); } else {
	 * System.out.print("���ݿ����ӳɹ�"); } }
	 */

	
	
}
