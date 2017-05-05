package action;
import java.util.List;
import com.opensymphony.xwork2.ActionSupport;
import DAO.customerDao;
import entity.Message;
import entity.vip;

public class showRoom extends ActionSupport {
	private List<Message> rooms;

	public List<Message> getRooms() {
		return rooms;
	}

	public void setRooms(List<Message> rooms) {
		this.rooms = rooms;
	}
	/*
	 * author:孟祥蕊
	 * 显示房间空余情况
	 */
	public String showroom(){
		customerDao custDao = new customerDao();
		rooms = custDao.selectUnrestRoom();
		return SUCCESS;
	}
}
