package persist;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BD {

	public Connection connection = null;
	public Statement statement = null;
	public ResultSet resultSet = null;

	public boolean getConnection() {

		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			final String login = "Blafblaf";
			final String senha = "Blafblaf";
			final String banco = "Etec";
			final String servidor = "localhost";
			final String url = "jdbc:sqlserver://" + servidor
					+ ":1433;databasename=" + banco;

			try {
				connection = DriverManager.getConnection(url, login, senha);
				return true;
			}

			catch (SQLException e) {
				e.printStackTrace();
				return false;
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			return false;
		}

	}

	private void closeResultSet() {
		try {
			if (resultSet != null) {
				resultSet.close();
			}
		} catch (Exception erro) {
			erro.printStackTrace();
		}
	}

	private void closeStatement() {
		try {
			if (statement != null) {
				statement.close();
			}
		} catch (Exception erro) {
			erro.printStackTrace();
		}
	}

	private void closeConnection() {
		try {
			if (connection != null) {
				connection.close();
			}
		} catch (SQLException erro) {
			erro.printStackTrace();
		}
	}

	public void close() {
		closeResultSet();
		closeStatement();
		closeConnection();
	}
}
