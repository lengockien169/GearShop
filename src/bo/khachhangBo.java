package bo;

import bean.khachhangBean;
import dao.khachhangDao;

public class khachhangBo {
	khachhangDao khdao = new khachhangDao();

	public khachhangBean ktdn(String tendn, String pass) {
		return khdao.checkLogin(tendn, pass);
	}
}