package action;
import java.sql.Date;

import com.opensymphony.xwork2.ActionSupport;
import DAO.customerDao;

public class live extends ActionSupport{
	private String roomNum;
	private String name;
	private String customerID;
	private Date liveDate;
	private Date leaveDate;
	private String isVIP;
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
	public String getCustomerID() {
		return customerID;
	}
	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}
	public Date getLiveDate() {
		return liveDate;
	}
	public void setLiveDate(Date liveDate) {
		this.liveDate = liveDate;
	}
	public Date getLeaveDate() {
		return leaveDate;
	}
	public void setLeaveDate(Date leaveDate) {
		this.leaveDate = leaveDate;
	}
	public String getIsVIP() {
		return isVIP;
	}
	public void setIsVIP(String isVIP) {
		this.isVIP = isVIP;
	}
	/*
	 * @@author 孙阳阳
	 * 客户入住
	 */
	public String liveIn(){
		customerDao custDao = new customerDao();
		//System.out.println("执行函数 livein");
		int num1,num2;
		int vip = 0;
		//System.out.println(isVIP);
		if(custDao.IsRoomRest(roomNum)){
			if(isVIP.equals("1"))
				vip = 1;
			
			num1 = custDao.addCustomer(name, customerID,vip);
			num2 = custDao.addMessage(roomNum, customerID, liveDate, leaveDate);
			//if(num2!=0)
			//	System.out.println("添加成功！");
			return SUCCESS;
		}
		else {
			addFieldError(name,"房间不是在空闲状态");
			return ERROR;
		}
			
		
	}
}
