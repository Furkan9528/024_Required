package com.furkankara;

import org.springframework.beans.factory.annotation.Required;

public class Ogrenci {


	
	private Integer yasi;
	private String adi, soyadi;
	
	

	@Required
	public void setYasi(Integer yasi) {
		this.yasi = yasi;
	}
	public Integer getYasi() {
		return yasi;
	}
	
	public String getAdi() {
		return adi;
	}
	public void setAdi(String adi) {
		this.adi = adi;
	}
	public String getSoyadi() {
		return soyadi;
	}
	public void setSoyadi(String soyadi) {
		this.soyadi = soyadi;
	}
	
	
	
}
