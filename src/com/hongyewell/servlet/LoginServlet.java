package com.hongyewell.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		if (username.equals("miying")&&password.equals("123")) {
			//登录成功
			HttpSession session = request.getSession();
			session.setAttribute("username", username);
			response.sendRedirect(request.getContextPath()+"/main.jsp");
			
		}else{
			//登录失败
			response.sendRedirect(request.getContextPath()+"/fail.jsp");
			
		}
		
		
	}

}
