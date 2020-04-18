package com.example.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddLeague
 */
public class AddLeague extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}
	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		   response.setContentType("text/html");
		   PrintWriter out=response.getWriter();
		   String leagueName=request.getParameter("League_Title").toString();
		   String leagueYear=request.getParameter("League_Year").toString();
		   String leagueSeason=request.getParameter("League_Season").toString();
		   if((leagueName.equals("MPL") &&(leagueYear.equals("2020")&&(leagueSeason.equals("summer")||leagueSeason.equals("winter")||leagueSeason.equals("autumn")))))
			{
				RequestDispatcher view=request.getRequestDispatcher("sucess.html");
				view.forward(request, response);
			}
			else
			{
				RequestDispatcher view=request.getRequestDispatcher("error.html");
				view.forward(request, response);
			}
		   
				
	}

}
