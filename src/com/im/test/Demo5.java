package com.im.test;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.im.model.Car;

public class Demo5 {
	public static void main(String[] args){
		Configuration config = new Configuration();
		SessionFactory sf = config.configure().buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();

		List<Car> list = session.createQuery("from Car").list();
			
		for(Car c :list){
			System.out.println(c.getId());
			System.out.println(c.getTitle());
			System.out.println(c.getDescription());
			System.out.println(c.getAmount());
			System.out.println(c.getBrand().getBrand());
			System.out.println(c.getMember().getName());
			System.out.println(c.getDate());
		}
	}

}
