package action;

import com.opensymphony.xwork2.ActionSupport;
import DAO.userDao;
public class login extends ActionSupport{
	/**
	 * @author 孙阳阳
	 * 登陆action
	 */
	private static final long serialVersionUID = 1L;
	String username;
	String password;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	/*
	 * @author 孙阳阳
	 * 检查输入的用户名和密码是否正确
	 * 正确？SUCCESS:INPUT
	 */
	
	public String check(){
		userDao userdao = new userDao();
		int flag = userdao.validUser(username, password);
		if(flag==1){
			return SUCCESS;
		}
			
		else{
			addFieldError(username,"用户名或密码错误");
			return INPUT;
		}
			
	}
}
