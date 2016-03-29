package com.arc.dao;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public final class HibernateSessionFactory {
	private static SessionFactory sessionFactory = null;
	
	private HibernateSessionFactory() {
		
	}
	
	public static SessionFactory getSessionFactory() {
		if(sessionFactory == null) {
			synchronized(HibernateSessionFactory.class) {
				if(sessionFactory == null)
					sessionFactory = new Configuration().configure().buildSessionFactory();
			}
		}
		return sessionFactory;
	}
}
