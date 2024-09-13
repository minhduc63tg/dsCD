package bai12Module2;

import java.util.Arrays;

public class CDList {
	private CD[] dsCD;
	private int count=0;
	public CDList(int n) {
		if(n<=0) {
			throw new IllegalArgumentException("n >0");
		}
		dsCD = new CD[n];
	}
	
	
	public int getCount() {
		return count;
	}


	public void setCount(int count) {
		this.count = count;
	}


	public void addCD(CD cd) {
		if(cd==null) {
			throw new IllegalArgumentException("cd khong duoc null");
		}
		for(int i=0;i<count;i++) {
			CD temp= dsCD[i];
			if(temp.getMaCD()==cd.getMaCD()) {
				throw new IllegalArgumentException("ma cd da ton tai");
			}
		}
		if(count== dsCD.length) {
			throw new IllegalArgumentException("mang day");
		}
		int newlength= (int)(dsCD.length *1.5);
		CD [] temp= new CD[newlength];
		for(int i=0;i< dsCD.length;i++) {
			temp[i]=dsCD[i];
		}
		dsCD= temp;
		dsCD[count++]=cd;
	}
	public CD[] getDsCD() {
		return dsCD;
	}
	public void setDsCD(CD[] dsCD) {
		this.dsCD = dsCD;
	}
	
	public void xoaCD(int macd) {
		for(int i=0;i<count;i++) {
			if(dsCD[i].getMaCD()==macd ){
				for(int j=i;j<count-1;j++) {
					dsCD[j]=dsCD[j+1];
				}
				dsCD[count-1]=null;
				count--;
			}		
		}
	}
	public CD[] sapXepbyGia() {
		CD []temp= Arrays.copyOf(dsCD, count);
		for(int i=0;i<count-1;i++) {
			for(int j=i+1;j<count;j++) {
				if(temp[j].getGia() < temp[i].getGia()) {
					CD t= temp[i];
					temp[i]=temp[j];
					temp[j]=t;
					
				}
			}
		}
		return temp;
		
	}
	
	public CD[] sapXepbyTua() {
		CD []temp= Arrays.copyOf(dsCD, count);
		for(int i=0;i<count-1;i++) {
			for(int j=i+1;j<count;j++) {
				if(temp[j].getTuaCD().compareToIgnoreCase(temp[i].getTuaCD())<0) {
					CD t= temp[i];
					temp[i]=temp[j];
					temp[j]=t;
					
				}
			}
		}
		return temp;
		
	}
}
