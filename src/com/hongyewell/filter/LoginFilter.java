package com.hongyewell.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.ws.Response;

/**
* @className:LoginFilter.java
* @classDescription:
* @author:yeye
* @createTime:2015年9月16日 下午4:52:38
*/
public class LoginFilter implements Filter {

	@Override
	public void destroy() {
	

	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain filter)
			throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest) req;
		HttpServletResponse response = (HttpServletResponse) resp;
		HttpSession session = request.getSession();
		if (session.getAttribute("username")!=null) {
			
			filter.doFilter(req, resp);	
		}else {
			response.sendRedirect("login.jsp");
		}
		

	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		

	}

}
