package com.example.demo;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.model.League;

/**
 * Servlet implementation class ListServlet
 */
public class ListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	private List<League> list=null;
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request,response);
	}
    protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		list=new ArrayList<League>();
		list.add(new League(UUID.randomUUID().toString(), "SUMMER", 2020, "Nirmal Cricket League"));
		list.add(new League(UUID.randomUUID().toString(), "Autumn", 2019, "Indian Premere League"));
		list.add(new League(UUID.randomUUID().toString(), "Winter", 2020, "Badminton League"));
		out.println("<html><head><title>list all league</title></head><body><table border='1'><tr><td>League ID</td>"
				+ "<td>League Title</td><td>League Year</td><td>Season</td></tr>");
		for(League l:list)
		{
			out.println("<tr><td>"+l.getLeagueID()+"</td><td>"+l.getTitle()+"</td><td>"
					+l.getYear()+"</td><td>"+l.getSeason()+"</td></tr>");
		}
		out.println("</table></body></html>");
		
		
		
	}

}
