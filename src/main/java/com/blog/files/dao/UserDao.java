package com.blog.files.dao;

import java.io.Closeable;
import java.io.IOException;

import org.hibernate.Session;

import com.blog.files.entities.User;
import com.blog.files.helper.SessionUtility;

public class UserDao implements Closeable {

    private Session session;
    private org.hibernate.Transaction trx;

    public UserDao() {
	session = SessionUtility.getSessionFactory().openSession();
    }

    public User getUserById(Long id) {
	return session.get(User.class, id);
    }

    public User getUserByEmailAndPassword(String email, String password) {
	User user = session.byNaturalId(User.class).using("email", email).load();

	if (user != null && !user.getPassword().equals(password)) {
	    return null;
	}
	return user;
    }

    public boolean saveOrUpdateUser(User user) {
	boolean flag = false;
	try {
	    trx = session.beginTransaction();
	    session.saveOrUpdate(user);
	    session.flush();
	    session.clear();
	    trx.commit();
	    flag = true;
	} catch (Exception e) {
	    if (trx != null) {
		trx.rollback();
	    }
	    e.printStackTrace();
	}
	return flag;
    }

    public boolean deleteUser(User user) {
	boolean flag = false;
	try {
	    trx = session.beginTransaction();
	    session.delete(user);
	    session.flush();
	    session.clear();
	    trx.commit();
	    flag = true;
	} catch (Exception e) {
	    if (trx != null) {
		trx.rollback();
	    }
	    e.printStackTrace();
	}
	return flag;
    }

    @Override
    public void close() throws IOException {
	session.close();
    }
}
