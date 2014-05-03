package com.edwin;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.BeforeClass;
import org.junit.Test;

public class QueryErpImpTest {

	private static QueryErpImp qei;

	@BeforeClass
	public static void init() {
		qei = new QueryErpImp();
	}

	@Test
	public void testConnErp() {
		Connection cnn = qei.connErp();
		assertNotNull(cnn);
	}

	@Test
	public void testRsErpStringSingle() {
		String sql = "SELECT MB110 FROM INVMB WHERE MB001='A0301-122233-05001' ";
		ResultSet rs;
		try {
			rs = qei.rsErp(sql);
			assertNotNull(rs);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Test
	public void testRsErpStringString() {

		String sql = "SELECT MB110 FROM INVMB WHERE MB001=?";
		String symbol = "A0301-122233-05001";
		ResultSet rs;
		try {
			assertNotNull(qei.rsErp(sql, symbol));
			assertTrue(qei.rsErp(sql, symbol).next());

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
