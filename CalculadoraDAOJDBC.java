package pro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CalculadoraDAOJDBC implements CalculadoraDAO {
	Connection conn = null;

	public CalculadoraDAOJDBC() {
		try{try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String url = "jdbc:postgresql://localhost:5432/SistemaBancario"; // Nome
																			// da
		// base de
		// dados
		String user = "postgres"; //
		String password = "123"; //

		conn = DriverManager.getConnection(url, user, password);
	}catch (SQLException e) {

	}


	}

	@Override
	public void soma(float valor, float valor1) {
		float soma = valor + valor1;
		PreparedStatement st = null;
		try {// WALNEY
			st = conn.prepareStatement("INSERT INTO Soma" + "(valor1,valor2,soma)" + "VALUES " + "(?,?,?)");
			st.setFloat(1, valor);
			st.setFloat(2, valor1);
			st.setFloat(3, soma);

			st.executeQuery();

		} catch (SQLException e) {

		}

	}

	@Override
	public void multiplica(float valor, float valor1) {
		float soma = valor * valor1;
		PreparedStatement st = null;
		try {// WALNEY
			st = conn.prepareStatement("INSERT INTO Multiplica" + "(valor1,valor2,soma)" + "VALUES " + "(?,?,?)");
			st.setFloat(1, valor);
			st.setFloat(2, valor1);
			st.setFloat(3, soma);

			st.executeQuery();

		} catch (SQLException e) {

		}

	}

	

	@Override
	public void dividir(float valor, float valor1) {
		// TODO Auto-generated method stub
		float soma = valor / valor1;
		PreparedStatement st = null;
		try {// WALNEY
			st = conn.prepareStatement("INSERT INTO Dividir" + "(valor1,valor2,soma)" + "VALUES " + "(?,?,?)");
			st.setFloat(1, valor);
			st.setFloat(2, valor1);
			st.setFloat(3, soma);

			st.executeQuery();

		} catch (SQLException e) {

		}

	}

	

	@Override
	public void subtrai(float valor, float valor1) {
		float soma = valor - valor1;
		PreparedStatement st = null;
		try {// WALNEY
			st = conn.prepareStatement("INSERT INTO Subtrai" + "(valor1,valor2,soma)" + "VALUES " + "(?,?,?)");
			st.setFloat(1, valor);
			st.setFloat(2, valor1);
			st.setFloat(3, soma);

			st.executeQuery();

		} catch (SQLException e) {

		}

	}

	}

}
