package com.im.test;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.im.model.Car;

public class Demo4 {
	public static void main(String[] args){
		Configuration config = new Configuration();
		SessionFactory sf = config.configure().buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();

		List<Car> list = session.createCriteria(Car.class).list();
			
		for(Car c :list){
			System.out.println(c.getId());
			System.out.println(c.getTitle());
			System.out.println(c.getDescription());
			System.out.println(c.getAmount());
			System.out.println(c.getBrand());
			System.out.println(c.getMember());
			System.out.println(c.getDate());
		}
	}

}
