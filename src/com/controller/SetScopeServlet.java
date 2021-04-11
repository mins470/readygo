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
@WebServlet("/SetScopeServlet")
public class SetScopeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		request.setAttribute("request", "홍길동");//request에 개발자 필요한 값을 저장할수있음, setAttribute("key", Object)
		System.out.println("SetServlet setting request : 홍길동");
//		String data = (String)request.getAttribute("req");//getAttribute 
//		System.out.println(request.getAttribute("req"));
//		System.out.println( data);
		
		
		 //Session Scope에 저장 - 사용브라우저 생기는 객체 : 30분 생성, - 브라우저 마다 여는 페이지에서 같은 하나의 세션을 사용
		HttpSession session = request.getSession(); // 1.세션객체 생성
		 session.setAttribute("session", "이순신"); //2.세션 객체에 key/value 설정
		 System.out.println("SetServlet session setting sess:이순신");
//		 System.out.println(session.getAttribute("sess"));
			
		 //application scope에 저장 : 서버구동하는 동안 context가 실행될때 context의 모든 서블릿이 같은 Context사용
			 ServletContext ctx =getServletContext(); //1. ServletContext 얻기
			 ctx.setAttribute("application","유관순"); //2.ServletContext에 setAttribute
//			 System.out.println("=================="+ ctx.getAttribute("application"));
			  
			 System.out.println("session : 이순신");
			 System.out.println("application : 유관순");
			
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
