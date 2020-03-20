package swingtest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Pieni luokka MySQL -tietokannan hallintaan. Luokalla ominaisuuksina
 * tietokantayhteyteen vaaditut muuttujat.
 * 
 * 25.10.2012
 * 
 * @author em
 * 
 */
public class MyVeryOwnDatabase {
	/**
	 * Luokan attribuutit
	 */
	private String dbServer;
	private String dbUser;
	private String dbPass;
	private String dbName;
	private Connection conn;
	private Statement statement;

	/**
	 * Rakennin joka luo tietokantayhteyden.
	 * 
	 * @param dbServer
	 * @param dbUser
	 * @param dbPass
	 * @param dbName
	 */
	public MyVeryOwnDatabase(String dbServer, String dbUser, String dbPass,
			String dbName) {
		this.dbName = dbName;
		this.dbUser = dbUser;
		this.dbPass = dbPass;
		this.dbServer = dbServer;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://" + this.dbServer
					+ "/" + this.dbName + "?user=" + this.dbUser + "&password="
					+ this.dbPass);
			statement = conn.createStatement();
		} catch (Exception ex) {
			System.out.println("Exception: " + ex);
		}
	}

	/**
	 * SQL INSERT/DELETE/UPDATE -komentojen suorittaminen, palauttaa false
	 * mikäli SQL-komento ei onnistunut.
	 * 
	 * @param sql
	 *            syötteenä saatu sql-käsky
	 * @return true mikäli suorittaminen onnistui, muutoin false
	 */
	public boolean executeSQL(String sql) {
		boolean success = false;

		try {
			success = statement.executeUpdate(sql) != Statement.EXECUTE_FAILED;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return success;

	}

	/**
	 * Suorittaa SQL SELECT -lauseen ja palauttaa tuloksena saatavan ResultSet
	 * -objektin.
	 * 
	 * @param sql
	 *            syötteenä saatu sql-käsky
	 * @return tietokannasta luettu ResultSet
	 */
	public ResultSet getResultSet(String sql) {
		ResultSet rs = null;

		try {
			rs = statement.executeQuery(sql);

		} catch (Exception ex) {
			System.out.println("Exception: " + ex);
		}

		return rs;
	}
	
	/**
	 * Tietokannan sulkeminen
	 */
	public void close() {
		try {
			this.conn.close();
			this.statement.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}