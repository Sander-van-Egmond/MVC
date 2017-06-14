package web;

import model.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

public class StartGame extends HttpServlet { //SERVLET
	
	public void doPost(HttpServletRequest request,
			HttpServletResponse response)
			throws IOException, ServletException {
		HttpSession session = request.getSession();
		Mancala game = new Mancala();
		ArrayList<Integer> veldContent = new ArrayList<Integer>();
		for (int i=0;i<14;i++){
			veldContent.add(game.getBakje(i));
		}

		request.setAttribute("bakjes", veldContent);
		session.setAttribute("spel", game);
		
		RequestDispatcher view = request.getRequestDispatcher("Game.jsp");
		
		view.forward(request, response);
	}
}
