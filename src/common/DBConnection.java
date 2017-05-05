package common;

import java.sql.*;

public class DBConnection {
	
	private static Connection conn;

	private static final String DRIVER_CLASS = "com.microsoft.sqlserver.jdbc.SQLServerDriver";

	private static final String DATABASE_URL = "jdbc:sqlserver://localhost:1433;DatabaseName=hotelManage";

	private static final String DATABASE_USRE = "hotelManage";

	private static final String DATABASE_PASSWORD = "123456";

	/**
	 * 返回连接
	 * 
	 * @return Connection
	 */
	public static Connection getConnection() {

		try {
			Class.forName(DRIVER_CLASS);
			conn = DriverManager.getConnection(DATABASE_URL,
					DATABASE_USRE, DATABASE_PASSWORD);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return conn;
	}

	/**
	 * 关闭数据库连接
	 * 
	 */
	public static void closeConnection(){
		try{
			if(conn!=null)
				conn.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	/**
	 * 关闭Statement对象
	 * 
	 * @param stm
	 */
	public static void closeStatement(Statement stm){
		try{
			if(stm!=null)
				stm.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	/**
	 * 关闭PreparedStatement对象
	 * 
	 * @param ps
	 */
	public static void closeStatement(PreparedStatement ps){
		try{
			if(ps!=null)
				ps.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	/**
	 * 关闭ResultSet结果集对象
	 * 
	 * @param rs
	 */
	public static void closeResultSet(ResultSet rs){
		try{
			if(rs!=null)
				rs.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}

