package entity;

public class vip {
	private String customerID;
	private String customerName;
	private String VIPNum;
	private String phone;
	
	public vip(String c,String cn,String v,String p){
		customerID = c;
		customerName = cn;
		VIPNum = v;
		phone = p;
	}
	
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
	
	
}
