package com.controller;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class JetSkyServlet extends HttpServlet
{
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException
	{
		String username = request.getParameter("username");
        String password = request.getParameter("password");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String c = request.getParameter("cor");
		out.println("<h1>Cervejas</h1>");
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException
	{
		String username = request.getParameter("username");
        String password = request.getParameter("password");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String c = request.getParameter("cor");
		out.println("<h1>Refrigerante</h1>");
	}
	
}
