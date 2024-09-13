package bai12Module2;

import java.text.DecimalFormat;

public class CD {
	private int maCD;
	private String tuaCD;
	private int soBH;
	private double gia;
	public CD(int maCD, String tuaCD, int soBH, double gia) {
		this.maCD = maCD;
		this.tuaCD = tuaCD;
		this.soBH = soBH;
		this.gia = gia;
	}
	
	public CD() {
		this(999999,"chua xac dinh", 1,1.0);
	}
	public int getMaCD() {
		return maCD;
	}
	public void setMaCD(int maCD) {
		if(maCD<0) {
			this.maCD=999999;
		}
		else {
			this.maCD = maCD;
		}
	}
	public String getTuaCD() {
		return tuaCD;
	}
	public void setTuaCD(String tuaCD) {
		if(tuaCD == null || tuaCD.trim().length() == 0)
			this.tuaCD = "chưa xác định";
		else
			this.tuaCD = tuaCD;
	}
	public int getSoBH() {
		return soBH;
	}
	public void setSoBH(int soBH) {
		this.soBH = soBH;
	}
	public double getGia() {
		return gia;
	}
	public void setGia(double gia) {
		this.gia = gia;
	}
	@Override
	public String toString() {
		DecimalFormat df= new DecimalFormat("#,##0.# VND");
		return String.format("%-10s %-25s %10s %15s", maCD, tuaCD, soBH,df.format(gia));
	}
	
}
