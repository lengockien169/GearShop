package bean;

public class giohangBean {
	private String mahang;
	private String tenhang;
	private long soluong;
	private long gia;

	public String getMahang() {
		return mahang;
	}

	public void setMahang(String mahang) {
		this.mahang = mahang;
	}

	public String getTenhang() {
		return tenhang;
	}

	public void setTenhang(String tenhang) {
		this.tenhang = tenhang;
	}

	public long getSoluong() {
		return soluong;
	}

	public void setSoluong(long soluong) {
		this.soluong = soluong;
	}

	public giohangBean(String mahang, String tenhang, long soluong, long gia) {
		super();
		this.mahang = mahang;
		this.tenhang = tenhang;
		this.soluong = soluong;
		this.gia = gia;
	}

	public long getGia() {
		return gia;
	}

	public void setGia(long gia) {
		this.gia = gia;
	}

	public long getThanhtien() {
		return soluong * gia;
	}
}
