package br.senaisp.edu.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.senaisp.edu.model.Sabor;

public class SaborDAO {
	public void novoSabor(Sabor sabor) throws ClassNotFoundException {

		String sql = "INSERT INTO sabores (nome, descricao, preco) VALUES (?, ?, ?)";

        PreparedStatement ps = null;

        try {
            ps = dao.conexao().prepareStatement(sql);

            ps.setString(1, sabor.getName());
            ps.setString(2, sabor.getDesc());
            ps.setDouble(3, sabor.getPrice());

            ps.execute();
            ps.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
	}
}
