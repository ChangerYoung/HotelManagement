package action;

import DAO.customerDao;
import com.opensymphony.xwork2.ActionSupport;
public class deleteVIP extends ActionSupport{
	private String customerID;

	public String getCustomerID() {
		return customerID;
	}

	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}
	
	public String remove(){
		customerDao custDao = new customerDao();
		System.out.println(customerID);
		custDao.removeVIPByID(customerID);
		return SUCCESS;
	}
}
