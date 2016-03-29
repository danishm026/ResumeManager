package com.arc.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class DB {
	public static void save(Object object){
		SessionFactory sessionfactory = HibernateSessionFactory.getSessionFactory();
		Session session = sessionfactory.openSession();
		session.beginTransaction();
		session.save(object);
		session.getTransaction().commit();
		session.close();
	}
	
	public static Object get(Class<?> clas, String rollNumber) {
		SessionFactory sessionfactory = HibernateSessionFactory.getSessionFactory();
		Session session = sessionfactory.openSession();
		session.beginTransaction();
		Object object = session.get(clas, rollNumber);
		session.getTransaction().commit();
		session.close();
		return object;
	}
	
	public static void update(Object object) {
		SessionFactory sessionFactory = HibernateSessionFactory.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.update(object);
		session.getTransaction().commit();
		session.close();
	}
	
	public static void delete(Object object) {
		SessionFactory sessionFactory = HibernateSessionFactory.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.delete(object);
		session.getTransaction().commit();
		session.close();
	}
}
