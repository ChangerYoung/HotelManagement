package action;

import DAO.customerDao;
import com.opensymphony.xwork2.ActionSupport;

public class addVIP extends ActionSupport{
	private String customerID;
	private String customerName;
	private String VIPNum;
	private String phone;
	public String getCustomerID() {
		return customerID;
	}
	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getVIPNum() {
		return VIPNum;
	}
	public void setVIPNum(String vIPNum) {
		VIPNum = vIPNum;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String addvip(){
		customerDao custDao = new customerDao();
		custDao.addVip(customerName, customerID, VIPNum, phone);
		return SUCCESS;
	}
}
