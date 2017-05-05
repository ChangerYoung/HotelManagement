package DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entity.Message;
import entity.vip;
import common.DBConnection;


public class customerDao {
	List<Message> data;
	private Connection conn;// 用于保存数据库连接对象

	private PreparedStatement ps;// 用于执行SQL语句（预处理）

	private ResultSet rs;// 用于保存查询的结果集
	/**
	 * 在初始化函数中setData
	 */
	public customerDao(){
		data = new ArrayList();
		data = setData();
	}
	/**
	 * 根据用户名和密码，判断该用户是否存在
	 * @param userName
	 * @param password
	 * @return  存在？1：0
	 * @author yangxiaoshuo
	 */
	@SuppressWarnings("null")
	/*public List<Message> secectAll() {
		int num=0;
		Message m = new Message();
		List<Message> list = null ;
		String sql = "select * from message ";
		try {
			conn = DBConnection.getConnection();
			ps = conn.prepareStatement(sql);

			rs = ps.executeQuery();
			while(rs.next()) {
				m.setRoomNum(rs.getString("roomNum"));
				m.setCustomerID(rs.getString("customerID"));
				m.setLiveDate(rs.getDate("liveDate"));
				m.setLeaveDate(rs.getDate("leaveDate"));
				m.setIsLeft(rs.getInt("isLeft"));
				list.add(m);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBConnection.closeResultSet(rs);
			DBConnection.closeStatement(ps);
			DBConnection.closeConnection();
		}
		return list;
	}*/
	public Boolean IsRoomRest(String roomNum){
		int num=0;
		/*
		 * 在message中查询是否有没离店的房间好
		 */
		String sql = "select * from message where roomNum=? and isLeft=? ";
		try {
			conn = DBConnection.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, roomNum);
			ps.setInt(2, 0);

			rs = ps.executeQuery();
			if (rs.next()) {
				num = 0;
			}
			else 
				num = 1;

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBConnection.closeResultSet(rs);
			DBConnection.closeStatement(ps);
			DBConnection.closeConnection();
		}
		return (num==0)?false:true;
	}
	
	/*
	 * 离店后更新message表中的isLeft
	 */
	public void upDateIsLeft(String roomNum){
		String sql = " update [hotelManage].[dbo].[message] set isLeft=1 where roomNum=?";
		int count = 0;
		try {
			conn = DBConnection.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, roomNum);
			count = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBConnection.closeStatement(ps);
			DBConnection.closeConnection();
		}
		System.out.println("更新isLeft成功！");
	}
	public List<Message> setData() {
		int num=0;
		int i = 0;
		List<Message>d = new ArrayList();
		String sql = "select * from message ";
		try {
			conn = DBConnection.getConnection();
			ps = conn.prepareStatement(sql);

			rs = ps.executeQuery();
			while(rs.next()) {
				d.add(new Message(rs.getString("roomNum"),rs.getString("customerID"),rs.getDate("liveDate"),rs.getDate("leaveDate"),rs.getInt("isLeft")));
				//i++;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBConnection.closeResultSet(rs);
			DBConnection.closeStatement(ps);
			DBConnection.closeConnection();
		}
		return d;
	}
	public List<Message> getData() {
		return data;
	}
	public int addMessage(String roomNum,String customerID,Date liveDate,Date leaveDate){
		String sql = "insert into message values(?,?,?,?,?) ";
		int count = 0;
		try {
			conn = DBConnection.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, roomNum);
			ps.setString(2, customerID);
			ps.setDate(3, liveDate);
			ps.setDate(4, leaveDate);
			ps.setInt(5, 0);
			count = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBConnection.closeStatement(ps);
			DBConnection.closeConnection();
		}
		System.out.println("添加mesage成功！");
		return count;
	}
	public int addCustomer(String name,String customerID,int vip){
		/*
		 * 往customer数据表中添加数据，先检测是否重复，
		 */
		int count = 0;
		PreparedStatement pstmt = null;
        ResultSet rs = null;
		String preparedSql="select * from customer where customerID=?";
		Object[] param = {customerID};
		Connection conn = DBConnection.getConnection();;// 数据连接对象
		//conn =  getConnection(conn);  
		try {
			pstmt = conn.prepareStatement(preparedSql);
			if (param != null) {
				for (int i = 0; i < param.length; i++) {
					pstmt.setObject(i + 1, param[i]); // 为预编译sql设置参数
				}
			}
		rs = pstmt.executeQuery(); 
		if(!rs.next()){
			System.out.print("直接添加");
			String sql="insert into customer(customerID,customerName,isVIP) values(?,?,?)";
			conn = DBConnection.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, customerID);
			ps.setString(2,name);
			ps.setInt(3, vip);
			//Object[] param1 = {customerID,name,0};
			//this.exceuteUpdate(sql, param1);
			count = ps.executeUpdate();
			System.out.println("添加customer成功！");
		}
		else{
			System.out.println("customer用户已存在@@");
		}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			DBConnection.closeResultSet(rs);
			DBConnection.closeStatement(ps);
			DBConnection.closeConnection();
		}
		return count;
	}
	/*
	 * 从customer表中返回vip list
	 */
	public List<vip> getVIPS(){
		int num=0;
		int i = 0;
		List<vip> v = new ArrayList();
		String sql = "select customerID,customerName,VIPNum,phone from customer where isVIP=1 ";
		try {
			conn = DBConnection.getConnection();
			ps = conn.prepareStatement(sql);

			rs = ps.executeQuery();
			while(rs.next()) {
				v.add(new vip(rs.getString("customerID"),rs.getString("customerName"),rs.getString("VIPNum"),rs.getString("phone")));
				//i++;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBConnection.closeResultSet(rs);
			DBConnection.closeStatement(ps);
			DBConnection.closeConnection();
		}
		return v;
	}
	/*
	 * 向customer表中增加会员
	 * 
	 */
	public int addVip(String customerName,String customerID,String VIPNum,String phone){
		int count = 0;
		PreparedStatement pstmt = null;
        ResultSet rs = null;
		String preparedSql="select * from customer where customerID=?";
		Object[] param = {customerID};
		Connection conn = DBConnection.getConnection();;// 数据连接对象
		//conn =  getConnection(conn);  
		try {
			pstmt = conn.prepareStatement(preparedSql);
			if (param != null) {
				for (int i = 0; i < param.length; i++) {
					pstmt.setObject(i + 1, param[i]); // 为预编译sql设置参数
				}
			}
		rs = pstmt.executeQuery(); 
		if(!rs.next()){
			System.out.print("直接添加");
			String sql="insert into customer(customerID,customerName,isVIP,VIPNum,phone) values(?,?,?,?,?)";
			conn = DBConnection.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, customerID);
			ps.setString(2,customerName);
			ps.setInt(3, 1);
			ps.setString(4,VIPNum);
			ps.setString(5,phone);
			//Object[] param1 = {customerID,name,0};
			//this.exceuteUpdate(sql, param1);
			count = ps.executeUpdate();
			System.out.println("添加VIP成功！");
		}
		else{
			//customer表中存在该ID则进行update
			String sql="update customer set customerName=?,isVIP=1,VIPNum=?,phone=? where customerID=?";
			conn = DBConnection.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, customerName);
			ps.setString(2, VIPNum);
			ps.setString(3, phone);
			ps.setString(4, customerID);
			count = ps.executeUpdate();
			System.out.println("修改vip成功");
		}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			DBConnection.closeResultSet(rs);
			DBConnection.closeStatement(ps);
			DBConnection.closeConnection();
		}
		return count;
	}
	/*
	 *根据customerID删除vip列表中的vip 
	 *
	 */
	public void removeVIPByID(String customerID){
		String sql = " delete from [hotelManage].[dbo].[customer] where customerID=?";
		int count = 0;
		try {
			conn = DBConnection.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, customerID);
			count = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBConnection.closeStatement(ps);
			DBConnection.closeConnection();
		}
		System.out.println("删除VIP成功！");
	}
	
	/*
	 * 在message表中选择入住的表
	 */
	public List<Message> selectUnrestRoom() {
		int num=0;
		int i = 0;
		List<Message>d = new ArrayList();
		String sql = "select * from message where isLeft=0";
		try {
			conn = DBConnection.getConnection();
			ps = conn.prepareStatement(sql);

			rs = ps.executeQuery();
			while(rs.next()) {
				d.add(new Message(rs.getString("roomNum"),rs.getString("customerID"),rs.getDate("liveDate"),rs.getDate("leaveDate"),rs.getInt("isLeft")));
				//i++;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBConnection.closeResultSet(rs);
			DBConnection.closeStatement(ps);
			DBConnection.closeConnection();
		}
		return d;
	}
}
