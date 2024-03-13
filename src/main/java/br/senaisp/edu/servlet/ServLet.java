package br.senaisp.edu.servlet;

import java.io.IOException;

import br.senaisp.edu.dao.SaborDAO;
import br.senaisp.edu.model.Sabor;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = "/cadastrar")
public class ServLet extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		try {
			String name = req.getParameter("NAME");
			String desc = req.getParameter("DESC");
			Double price = Double.parseDouble(req.getParameter("PRICE"));
			
			Sabor sab1 = new Sabor(name, desc, price);
			
			String resp = "<html><h1> " + sab1 + "</h1></html>";
			
			new SaborDAO().novoSabor(sab1);
			
			res.getWriter().append(resp);
			
		}catch(Exception e) {
			System.out.print("<html><h1> " + e + "</h1></html>");
		}
		
		
		
	}
	
	
	
}



