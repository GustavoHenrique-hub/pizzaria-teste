package br.senaisp.edu.servlet;

import java.io.IOException;

import br.senaisp.edu.dao.ClienteDAO;
import br.senaisp.edu.model.Cliente;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/deleteCliente")
public class ServClientDelete extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		try {
			Integer id = Integer.parseInt(req.getParameter("ID"));
			
			Cliente c1 = new Cliente();
			c1.setId(id);
			
			ClienteDAO cliDAO = new ClienteDAO();
			
			cliDAO.deleteCliente(c1.getId());
			
			for(Cliente c : cliDAO.getClientes()) {
				res.getWriter().append("<html><h1>" + c +"</h1></html>");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
