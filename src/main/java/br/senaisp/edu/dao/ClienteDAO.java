package br.senaisp.edu.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

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

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (ps != null) {
					ps.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

	public List<Cliente> getClientes() throws ClassNotFoundException {
		String sql = "select * from clientes";

		PreparedStatement ps = null;

		ResultSet rset = null;

		List<Cliente> clientes = new ArrayList<Cliente>();

		try {
			ps = dao.conexao().prepareStatement(sql);

			rset = ps.executeQuery();

			while (rset.next()) {

				Cliente cliente = new Cliente();
				
				cliente.setId(rset.getInt("id"));
				
				cliente.setNome(rset.getString("nome"));

				cliente.setTel(rset.getString("telefone"));

				cliente.setRua(rset.getString("rua"));

				cliente.setNumero(rset.getInt("numero"));

				cliente.setBairro(rset.getString("bairro"));

				clientes.add(cliente);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rset != null) {
					rset.close();
				}
				if (ps != null) {
					ps.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		return clientes;
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

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (ps != null) {
					ps.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
	
	public void deleteCliente(Integer id) throws ClassNotFoundException {

		String sql = "delete from clientes where id = ?";

		PreparedStatement ps = null;

		try {
			ps = dao.conexao().prepareStatement(sql);

			ps.setInt(1, id);
			
			ps.execute();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (ps != null) {
					ps.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
