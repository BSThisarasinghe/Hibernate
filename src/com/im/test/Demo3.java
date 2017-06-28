package com.im.test;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.im.model.Brand;
import com.im.model.Car;
import com.im.model.Member;

public class Demo3 {
	public static void main(String[] args){
		Configuration config = new Configuration();
		SessionFactory sf = config.configure().buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		Member member = (Member)session.get(Member.class,1);
		Brand brand = (Brand)session.get(Brand.class,1);
		
		Car car = new Car();
		car.setTitle("CRV 2012 for Sale in Colombo");
		car.setDescription("BIa b");
		car.setAmount(7400000);
		car.setDate(new Date());
		car.setMember(member);
		car.setBrand(brand);
		
		session.save(car);
		session.getTransaction().commit();
		
	}
}
