package com.Ont_To_One_Hybernate.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Ont_To_One_Hybernate.entity.Answer;
import com.Ont_To_One_Hybernate.entity.Question;

public class One_to_One_Main {
	
	
	public static void main(String[] args) {
	
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");
		
		SessionFactory factory = con.buildSessionFactory();
		Session session = factory.openSession();
		Transaction trans = session.beginTransaction();
		
		Question q1 = new Question(101, "What is XML", 10, null);
		Answer a1 = new Answer(501 , "Extensible Markup Language", 07, q1);
		
		q1.setAnswer(a1);
		a1.setQuestion(q1);
		
		session.save(q1);
		session.save(a1);
	
		trans.commit();
		session.close();
		session.close();
	}

}
