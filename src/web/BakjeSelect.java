package web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Mancala;

public class BakjeSelect extends HttpServlet { //SERVLET
	
	public void doPost(HttpServletRequest request,
			HttpServletResponse response)
			throws IOException, ServletException {
		
		HttpSession session = request.getSession();
		Mancala spel = (Mancala)session.getAttribute("spel");
		String input = request.getParameter("bakje");
		
		String[] splittedInput = input.split("p");
		
		int bakNummer = Integer.parseInt(splittedInput[0]);
		int speler = Integer.parseInt(splittedInput[1]);

		spel.input(bakNummer, speler);
		
		ArrayList<Integer> veldContent = new ArrayList<Integer>();
		for (int i=0;i<14;i++){
			veldContent.add(spel.getBakje(i));
		}
		
		request.setAttribute("bakjes", veldContent);
		session.setAttribute("spel", spel);
		RequestDispatcher view = request.getRequestDispatcher("Game.jsp");
		
		view.forward(request, response);
	}
}