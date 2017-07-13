package persist;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Funcionario;

public class FuncionarioDAO {

	BD bd = new BD();
	String men = "";

	public String incluir(Funcionario func) {
		if (bd.getConnection()) {
			try {
				PreparedStatement ps = bd.connection
						.prepareStatement("INSERT INTO funcionario VALUES (?)");
				// ps.setString(1,null);
				ps.setString(1, func.getNome());
				ps.executeUpdate();
				men = "Cadastro efetuado com sucesso";
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {

				try {
					bd.close();
				} catch (Exception e) {
					e.printStackTrace();
				}

			}
		}
		return men;
	}

	public String alterar(Funcionario func) {
		if (bd.getConnection()) {
			try {
				PreparedStatement ps = bd.connection
						.prepareStatement("update funcionario set nome = ? Where id = ?;");
				ps.setString(1, func.getNome());
				ps.setInt(2, func.getId());
				ps.executeUpdate();
				men = "Dados alterados com sucesso";
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				try {
					bd.close();
				} catch (Exception e) {

				}
			}
		}
		return men;
	}

	public String excluir(Funcionario func) {
		if (bd.getConnection()) {
			try {
				PreparedStatement ps = bd.connection
						.prepareStatement("delete from funcionario where id = ?;");
				ps.setString(1, Integer.toString(func.getId()));
				ps.executeUpdate();
				men = "Dados excluidos com sucesso";
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				try {
					bd.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		return men;
	}

	public Funcionario pesquisarId(Funcionario func) {
		if (bd.getConnection()) {
			try {
				PreparedStatement ps = bd.connection
						.prepareStatement("Select * from funcionario where id ="
								+ func.getId());
				bd.resultSet = ps.executeQuery();
				if (bd.resultSet.next() == true) {
					func.setId(bd.resultSet.getInt(1));
					func.setNome(bd.resultSet.getString(2));
				} else {
					func = null;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				try {
					bd.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		return func;

	}

	public List<Funcionario> listar() {
		List<Funcionario> lista = null;

		if (bd.getConnection()) {
			try {
				PreparedStatement stmt = bd.connection
						.prepareStatement("Select * from funcionario;");
				bd.resultSet = stmt.executeQuery();
				lista = new ArrayList<Funcionario>();
				while (bd.resultSet.next()) {
					Funcionario func = new Funcionario();
					func.setId(bd.resultSet.getInt(1));
					func.setNome(bd.resultSet.getString(2));
					lista.add(func);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				try {
					bd.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		return lista;
	}

}
