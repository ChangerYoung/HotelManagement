package action;
import java.util.List;
import com.opensymphony.xwork2.ActionSupport;
import DAO.customerDao;
import entity.vip;

public class showVIP extends ActionSupport{
	private List<vip> vips;
	private vip v;
	public List<vip> getVips() {
		return vips;
	}
	public void setVips(List<vip> vips) {
		this.vips = vips;
	}
	public vip getV() {
		return v;
	}
	public void setV(vip v) {
		this.v = v;
	}
	
	public String showvip(){
		customerDao custDao = new customerDao();
		vips = custDao.getVIPS();
		return SUCCESS;
	}
}
