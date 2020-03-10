package com.furkankara;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Merkez {


	@SuppressWarnings("resource")
	public static void main(String[] args) {
			
	ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeanConfig.xml");	
		
	Ogrenci ogrenci = context.getBean("ogrenciBean",Ogrenci.class);
	
	System.out.println("Adi : "+ogrenci.getAdi());
	System.out.println("Soyadi :"+ogrenci.getSoyadi());
	System.out.println("Yasi : "+ogrenci.getYasi());
		
	
	
	}
}
