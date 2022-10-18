package com.blog.files.helper;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionUtility {
    private static SessionFactory session;

    private static void buildSession() {
	Configuration config = new Configuration();
	config.configure("hibernate.cfg.xml");
	session = config.buildSessionFactory();
    }

    public static SessionFactory getSessionFactory() {
	if (session == null) {
	    buildSession();
	}

	return session;
    }
}
