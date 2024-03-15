package br.senaisp.edu.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.senaisp.edu.model.Cliente;

public class ClienteDAO {
	public void novoCliente(Cliente cliente) throws ClassNotFoundException {

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

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void updateCliente(Cliente cliente) throws ClassNotFoundException {

		String sql = "update clientes set nome = ?, telefone = ?, rua = ?, numero = ?, bairro = ? where id = ?";

		PreparedStatement ps = null;

		try {
			ps = dao.conexao().prepareStatement(sql);

			ps.setString(1, cliente.getNome());
			ps.setString(2, cliente.getTel());
			ps.setString(3, cliente.getRua());
			ps.setInt(4, cliente.getNumero());
			ps.setString(5, cliente.getBairro());
			ps.setInt(6, cliente.getId());

			ps.execute();
			ps.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	public void selectCliente(Cliente cliente) throws ClassNotFoundException {

		String sql = "select * from clientes where id = ?";

		PreparedStatement ps = null;

		try {
			ps = dao.conexao().prepareStatement(sql);

			
			ps.setInt(1, cliente.getId());

			ps.execute();
			ps.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
