package com.im.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.im.model.Member;

public class Demo {
	public static void main(String[] args){
		Member member = new Member();
		//member.setId(1);
		member.setName("Buwaneka Sudheera");
		member.setAddress("Godaparagaha watta, Yatalamatta, Galle");
		member.setTelephone("0716041473");
		
		Configuration config = new Configuration();
		SessionFactory sf = config.configure().buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		session.save(member);
		session.getTransaction().commit();

	}
}
