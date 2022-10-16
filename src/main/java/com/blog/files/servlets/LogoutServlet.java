package com.blog.files.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.blog.files.dao.UserDao;
import com.blog.files.entities.User;

@WebServlet("/logout")
public class LogoutServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    private UserDao dao;

    public LogoutServlet() {
	dao = new UserDao();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	HttpSession session = req.getSession();
	Integer id = Integer.parseInt(req.getParameter("activeUser"));
	User user = dao.getUserById(id);
	user.setLoginStatus(false);
	dao.saveOrUpdateUser(user);
	session.removeAttribute("activeUser");

	resp.sendRedirect("index.jsp");
    }

}
