package com.blog.files.dao;

import java.io.Closeable;
import java.io.IOException;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import com.blog.files.entitties.User;
import com.blog.files.helper.SessionUtility;

public class UserDao implements Closeable {

    private Session session;
    private org.hibernate.Transaction trx;

    public UserDao() {
	try {
	    session = SessionUtility.getSessionFactory().openSession();
	    trx = session.beginTransaction();
	} catch (HibernateException e) {
	    e.printStackTrace();
	    trx.rollback();
	}
    }

    public User getUser(Integer id) {
	return session.get(User.class, id);
    }

    public User getUserByEmailAndPassword(String email, String password) {
	User user = null;
	return user;
    }

    public void saveOrUpdateUser(User user) {
	session.saveOrUpdate(user);
	trx.commit();
    }

    public void deleteUser(User user) {
	session.delete(user);
	trx.commit();
    }

    @Override
    public void close() throws IOException {

	session.close();
    }

}
