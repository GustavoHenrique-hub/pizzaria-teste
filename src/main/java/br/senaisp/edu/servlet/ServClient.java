package br.senaisp.edu.servlet;

import java.io.IOException;

import br.senaisp.edu.dao.ClienteDAO;
import br.senaisp.edu.model.Cliente;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/clienteCad")
public class ServClient extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		try {
			String name = req.getParameter("NAME");
			String desc = req.getParameter("TEL");
			String rua = req.getParameter("STREET");
			Integer number = Integer.parseInt(req.getParameter("NUMBER"));
			String neihbor= req.getParameter("NEIGHBOR");
			
			
			Cliente cli1 = new Cliente(name, desc, rua, number, neihbor);
			
			ClienteDAO cliDAO = new ClienteDAO();
			
			cliDAO.novoCliente(cli1);
		
			for(Cliente c : cliDAO.getClientes()) {
				res.getWriter().append("<html><h1>" + c +"</h1></html>");
			}
			
			
		}catch(Exception e) {
			System.out.print("<html><h1> " + e + "</h1></html>");
		}
	}
}
