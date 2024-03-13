package br.senaisp.edu.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.senaisp.edu.model.Cliente;

public class ClienteDAO {
	public void novoCliente(Cliente cliente) throws ClassNotFoundException{
		
		String sql = "insert into clientes(nome, telefone, rua, numero, bairro) values (?, ?, ?, ?, ?)";
		
		PreparedStatement ps = null;
		
		try {
			ps = dao.conexao().prepareStatement(sql);
			
			ps.setString(1, cliente.getNome());
			ps.setString(2, cliente.getTel());
			ps.setString(3, cliente.getRua());
			ps.setInt(4, cliente.getNumero());
			ps.setString(5, cliente.getBairro());
			
			ps.execute();
            ps.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
