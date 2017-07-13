package controll;

import java.sql.*;

public class Main {
	public static void main(String[] args) {
		// string de conexão...usando Windows Authentication
		String connectionUrl = "jdbc:sqlserver://Monteiros\\SQLFULL:1433;"
				+ "databaseName=Etec;integratedSecurity=true;";
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver")
					.newInstance();
			Connection conn = DriverManager.getConnection(connectionUrl);
			System.out.println("Conexão obtida com sucesso.");
		} catch (SQLException ex) {
			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("SQLState: " + ex.getSQLState());
			System.out.println("VendorError: " + ex.getErrorCode());
		} catch (Exception e) {
			System.out
					.println("Problemas ao tentar conectar com o banco de dados: "
							+ e);
		}
	}
}
