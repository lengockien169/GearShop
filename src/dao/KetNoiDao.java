package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class KetNoiDao {

	public Connection cn;

	public void KetNoi() {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			cn = DriverManager
					.getConnection("jdbc:sqlserver://KINE\\SQLEXPRESS:1433;databaseName=LeNgocKien_19T1021111_ThiHK_JavaNangCao;user=sa;password=123");
		} catch (Exception tt) {
			tt.printStackTrace();
		}
	}

	public static void main(String[] args) {
		KetNoiDao kn = new KetNoiDao();
		kn.KetNoi();
	}
}
