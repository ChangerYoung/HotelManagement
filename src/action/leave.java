package action;
import java.sql.Date;

import com.opensymphony.xwork2.ActionSupport;
import DAO.customerDao;

public class leave extends ActionSupport{
	private String roomNum;
	private String name;
	//private String isVIP;
	public String getRoomNum() {
		return roomNum;
	}
	public void setRoomNum(String roomNum) {
		this.roomNum = roomNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//public String getIsVIP() {
	//	return isVIP;
	//}
	//public void setIsVIP(String isVIP) {
	//	this.isVIP = isVIP;
	//}
	/*
	 * @author 李光旭
	 * 客户离店
	 */
	public String leaveOut(){
		customerDao custDao = new customerDao();
		//System.out.println("执行函数 livein");
		int num1,num2;
		int vip = 0;
		boolean flag = custDao.IsRoomRest(roomNum); 
		//System.out.println(isVIP);
		if(!flag){
		//	if(isVIP==null){
		//		if(isVIP.equals("1"))
			//		vip = 1;
				System.out.println(flag);
				System.out.println("修改");
				custDao.upDateIsLeft(roomNum);
		//	}
			return SUCCESS;
		}
		else {
			System.out.println("flag: "+flag);
			addFieldError(roomNum,"房间号与顾客姓名不匹配");
			return ERROR;
		}
			
		
	}
}
