package com.controller;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class GetScopeServlet
 */
@WebServlet("/GetScopeServlet")
public class GetScopeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String data = (String)request.getAttribute("req");//getAttribute 
		System.out.println("request======"+request.getAttribute("req"));
		
		HttpSession session = request.getSession();//세션얻기
		System.out.println("session======="+session.getAttribute("sess"));
		
		 ServletContext ctx =getServletContext(); //1. ServletContext 얻기
		 System.out.println("application========"+ ctx.getAttribute("application"));
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
