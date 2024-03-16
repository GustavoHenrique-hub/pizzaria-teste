package br.senaisp.edu.servlet;

import java.io.IOException;

import br.senaisp.edu.dao.ClienteDAO;
import br.senaisp.edu.model.Cliente;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/clientUpdate")
public class ServClientUpdate extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		try {
		String name = req.getParameter("NAME");
		String tel = req.getParameter("TEL");
		String street = req.getParameter("STREET");
		Integer number =Integer.parseInt( req.getParameter("NUMBER"));
		String neighbor = req.getParameter("NEIGHBOR");
		Integer id =Integer.parseInt( req.getParameter("ID"));
		
		Cliente c1 = new Cliente(name, tel, street, number, neighbor);
		c1.setId(id);
		
		ClienteDAO cliDAO = new ClienteDAO();
		
		cliDAO.updateCliente(c1);
			
		for(Cliente c : cliDAO.getClientes()) {
			res.getWriter().append("<html><h1>" + c +"</h1></html>");
		}
		
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
