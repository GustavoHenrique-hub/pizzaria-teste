package br.senaisp.edu.servlet;

import java.io.IOException;

import br.senaisp.edu.dao.ClienteDAO;
import br.senaisp.edu.model.Cliente;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/selectCliente")
public class ServClientSelect extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		try {
			
			ClienteDAO cliDAO = new ClienteDAO();
				
			for(Cliente c : cliDAO.getClientes()) {
				res.getWriter().append("<html><h1>" + c +"</h1></html>");
			}
			
			
			
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}
