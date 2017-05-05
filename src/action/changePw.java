package action;

import DAO.userDao;
import com.opensymphony.xwork2.ActionSupport;

public class changePw extends ActionSupport{
	private String oldPassword;
	private String newPassword;
	private String newPassword2;
	public String getOldPassword() {
		return oldPassword;
	}
	public void setOldPassword(String oldPassword) {
		this.oldPassword = oldPassword;
	}
	public String getNewPassword() {
		return newPassword;
	}
	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}
	public String getNewPassword2() {
		return newPassword2;
	}
	public void setNewPassword2(String newPassword2) {
		this.newPassword2 = newPassword2;
	}
	/*
	 * @author 孙阳阳
	 * 检查输入的用户名和密码是否正确
	 * 正确？SUCCESS:INPUT
	 */
	public String changepw(){
		userDao userdao = new userDao();
		int num = 0;
		if(newPassword.equals(newPassword2)&&(!newPassword.equalsIgnoreCase(""))){
			 num = userdao.updateUser(oldPassword, newPassword);
			 //System.out.println("执行了函数");
			if(num!=0)
			{
				return SUCCESS;
			}
		}
		addFieldError(oldPassword,"修改密码失败");
		return INPUT;
	}
}
