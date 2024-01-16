package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import bean.khachhangBean;

public class khachhangDao {
	private PreparedStatement cmd = null;
	private ResultSet rs = null;

	public khachhangBean checkLogin(String TenDangNhap, String MatKhau) {
		try {

			KetNoiDao kn = new KetNoiDao();
			kn.KetNoi();
			String sql = "select * from KhachHang where TenDangNhap = ? and MatKhau = ?";
			cmd = kn.cn.prepareStatement(sql);
			cmd.setString(1, TenDangNhap);
			cmd.setString(2, MatKhau);
			rs = cmd.executeQuery();
			while (rs.next()) {
				khachhangBean khbean = new khachhangBean(rs.getInt(1), rs.getString(2), rs.getString(3),
						rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7));
				return khbean;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
