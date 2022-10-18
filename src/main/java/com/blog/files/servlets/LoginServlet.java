package com.blog.files.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.blog.files.dao.UserDao;
import com.blog.files.entities.Message;
import com.blog.files.entities.User;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;
    private UserDao dao;

    public LoginServlet() {
	dao = new UserDao();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String email = req.getParameter("email");
	String password = req.getParameter("password");

	User user = dao.getUserByEmailAndPassword(email, password);

	if (user == null) {
	    // Login Failed
	    Message msg = new Message("Bad Credentials, Please check your email and password.", "error",
		    "alert-danger");
	    HttpSession session = req.getSession();
	    session.setAttribute("message", msg);
	    resp.sendRedirect("login.jsp");
	    return;
	}

	// Login Success
	user.setLoginStatus(true);
	dao.saveOrUpdateUser(user);
	HttpSession session = req.getSession();
	session.setAttribute("activeUser", user);

	// On Login Success, redirecting to Profile page
	resp.sendRedirect("dashboard.jsp");

    }
}
