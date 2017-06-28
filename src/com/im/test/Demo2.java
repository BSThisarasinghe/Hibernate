package com.im.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.im.model.Brand;

public class Demo2 {
	public static void main(String[] args){
		Brand brand = new Brand();
		
		brand.setId(1);
		brand.setBrand("Toyota");
		
		
		Configuration config = new Configuration();
		SessionFactory sf = config.configure().buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		session.save(brand);
		session.getTransaction().commit();
	}
}
