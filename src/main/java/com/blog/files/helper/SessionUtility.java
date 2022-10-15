package com.blog.files.helper;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionUtility {
    private static SessionFactory sessionFactory;

    private static void buildSession() {
	Configuration config = new Configuration();
	config.configure("hibernate.cfg.xml");
	sessionFactory = config.buildSessionFactory();
    }

    public static SessionFactory getSessionFactory() {
	if (sessionFactory == null)
	    buildSession();

	return sessionFactory;
    }
}
