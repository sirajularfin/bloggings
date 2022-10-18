package com.blog.files.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import com.blog.files.dao.UserDao;
import com.blog.files.entities.User;

@MultipartConfig
@WebServlet("/update-profile")
public class UpdateProfileServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;
    private UserDao dao;

    public UpdateProfileServlet() {
	dao = new UserDao();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String firstName = req.getParameter("firstName");
	String lastName = req.getParameter("lastName");
	String dob = req.getParameter("dob");
	String email = req.getParameter("email");
	String password = req.getParameter("password");
	Part part = req.getPart("userImage");
	String imageName = part.getSubmittedFileName();

	HttpSession session = req.getSession();
	User user = (User) session.getAttribute("activeUser");
	user.setFirstName(firstName);
	user.setLastName(lastName);
	user.setDob(dob);
	user.setEmail(email);
	user.setPassword(password);
	user.setProfile(imageName);

	dao.saveOrUpdateUser(user);
    }

}
