package com.blog.files.dao;

import org.hibernate.Session;

import com.blog.files.entities.User;
import com.blog.files.helper.SessionUtility;

public class UserDao {

    private Session session = SessionUtility.getSessionFactory().openSession();
    private org.hibernate.Transaction trx;

    public UserDao() {
    }

    public User getUserById(Integer id) {
	return session.get(User.class, id);
    }

    public User getUserByEmailAndPassword(String email, String password) {
	User user = null;
	user = session.byNaturalId(User.class).using("email", email).load();

	if (user != null && !user.getPassword().equals(password)) {
	    System.out.println("Bad Credentials");
	}
	return user;
    }

    public void saveOrUpdateUser(User user) {
	trx = session.beginTransaction();
	session.saveOrUpdate(user);
	trx.commit();
	session.close();
    }

    public void deleteUser(User user) {
	trx = session.beginTransaction();
	session.delete(user);
	trx.commit();
	session.close();
    }

}
