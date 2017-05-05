package entity;

import java.sql.Date;

public class Message {
	private String roomNum;
	private String customerID;
	private Date liveDate;
	private Date leaveDate;
	private int isLeft;
	
	public Message(String r, String c, Date d1, Date d2, int i) {
		// TODO Auto-generated constructor stub
		roomNum=r;
		customerID = c;
		liveDate = d1;
		leaveDate = d2;
		isLeft = i;
	}
	public String getRoomNum() {
		return roomNum;
	}
	public void setRoomNum(String roomNum) {
		this.roomNum = roomNum;
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
	public int getIsLeft() {
		return isLeft;
	}
	public void setIsLeft(int isLeft) {
		this.isLeft = isLeft;
	}
	
	
}
