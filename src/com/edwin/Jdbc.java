package com.edwin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class Jdbc {

	private static Connection conn;

	private static final String forname = "com.microsoft.sqlserver.jdbc.SQLServerDriver";

	private static final String c_url = "jdbc:sqlserver://192.168.1.4:1433;databasename=fanski";
	private static final String c_name = "sa";
	private static final String c_password = "fanski=123";

	private static final String h_url = "jdbc:sqlserver://127.0.0.1:1433;databasename=fanski";
	private static final String h_name = "sa";
	private static final String h_password = "2222";

	public Jdbc() {
		connErp();
	}

	public static Connection connErp() {

		DriverManager.setLoginTimeout(5);
		// HibernateCFG CFG = Lookup.getDefault().lookup(HibernateCFG.class);
		// long time = System.currentTimeMillis();
		try {
			Class.forName(forname);
		} catch (ClassNotFoundException ex) {
			// Logger.getLogger(QueryErpImp.class.getName()).log(Level.SEVERE,
			// null, ex);
			JOptionPane.showMessageDialog(null, ex.getMessage().trim(), "警告",
					JOptionPane.ERROR_MESSAGE);
			JOptionPane.showMessageDialog(null, "aaaaaa");
			System.exit(1);
		}
		try {
			conn = DriverManager.getConnection(c_url, c_name, c_password);
			// out.Out(conn.getCatalog());
			// System.out.println(c_url);
			// System.out.println(c_name);
			// System.out.println(c_password);
			// CFG.SetconfigurationCFG("Chibernate.cfg.xml");

		} catch (SQLException ex) {
			try {
				// Logger.getLogger(QueryErpImp.class.getName()).log(Level.SEVERE,
				// null, ex);
				conn = DriverManager.getConnection(h_url, h_name, h_password);
				// CFG.SetconfigurationCFG("hibernate.cfg.xml");
			} catch (SQLException ex1) {
				// Logger.getLogger(QueryErpImp.class.getName()).log(Level.SEVERE,
				// null, ex1);
				JOptionPane.showMessageDialog(null, ex1.getMessage().trim(),
						"警告", JOptionPane.ERROR_MESSAGE);
				JOptionPane.showMessageDialog(null, "bbbbbb");
				System.exit(1);
			}
		}

		// System.out.println(CFG.getconfigurationCFG());
		// MyJdbc.setConn(conn);
		return conn;
	}

	public ResultSet rsErp(String sql) throws ClassNotFoundException,
			SQLException {
		ResultSet rs = null;
		PreparedStatement cstmt = null;
		// out.Out(sql );
		// out.Out(conn == null ? "false" : "true");
		cstmt = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE,
				ResultSet.CONCUR_READ_ONLY);
		rs = cstmt.executeQuery();
		return rs;
	}

}
