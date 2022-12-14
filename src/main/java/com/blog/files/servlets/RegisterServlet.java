package com.blog.files.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.blog.files.dao.UserDao;
import com.blog.files.entities.User;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;
    private UserDao dao;

    public RegisterServlet() {
	dao = new UserDao();
    }

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

	String firstName = req.getParameter("firstName");
	String lastName = req.getParameter("lastName");
	String dob = req.getParameter("dob");
	String email = req.getParameter("email");
	String password = req.getParameter("password");
	String retypePassword = req.getParameter("retypePassword");

	if (!password.equals(retypePassword)) {
	    System.out.println("Password mismatch");
	    return;
	}

	User user = new User(firstName, lastName, dob, email, password);
	if (!user.validate()) {
	    System.out.println("INTERNAL SERVER ERROR");
	    return;
	}
	dao.saveOrUpdateUser(user);
	res.sendRedirect("login.jsp");
    }
}
