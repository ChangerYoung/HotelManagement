package action;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import DAO.customerDao;
import entity.Message;
public class showMessage extends ActionSupport{
	List<Message> message;

	public List<Message> getMessage() {
		return message;
	}

	public void setMessage(List<Message> message) {
		this.message = message;
	}
	/*
	 * @auto:贾孟歌
	 */
	public String showmessage(){
		customerDao custDao = new customerDao();
		List<Message> m = custDao.getData();
		//this.setMessage(m);
		message = m;
		System.out.println(message+"xxx");
		return SUCCESS;
	}
}
