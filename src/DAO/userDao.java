package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import common.DBConnection;

public class userDao {

	private Connection conn;// 用于保存数据库连接对象

	private PreparedStatement ps;// 用于执行SQL语句（预处理）

	private ResultSet rs;// 用于保存查询的结果集
	/**
	 * 根据用户名和密码，判断该用户是否存在
	 * @param userName
	 * @param password
	 * @return  存在？1：0
	 * @author yangxiaoshuo
	 */
	public int validUser(String userName, String password) {
		int num=0;
		String sql = "select * from [user] where username=? and password=? ";
		try {
			conn = DBConnection.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, userName);
			ps.setString(2, password);

			rs = ps.executeQuery();
			if (rs.next()) {
				num = 1;
			}
			else 
				num = 0;

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBConnection.closeResultSet(rs);
			DBConnection.closeStatement(ps);
			DBConnection.closeConnection();
		}
		return num;
	}
	/**
	 * @author yangxiaoshuo
	 * 修改密码
	 */
	public int updateUser(String oldPassword,String newPassword){
		String sql = "update [user] set password=? where password=? ";
		int count = 0;
		try {
			conn = DBConnection.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1,newPassword);
			ps.setString(2,oldPassword);
			count = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBConnection.closeStatement(ps);
			DBConnection.closeConnection();
		}
		return count;
	}
}


