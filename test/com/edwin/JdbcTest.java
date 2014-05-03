package com.edwin;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.BeforeClass;
import org.junit.Test;

public class JdbcTest {

	private static Jdbc jc;

	@BeforeClass
	public static void init() {

		jc = new Jdbc();
	}

	@Test
	public void testConnErp() {

		Connection conn = jc.connErp();

		assertNotNull(conn);
	}

	@Test
	public void testRsErp() {
		String sql = "SELECT MB110 FROM INVMB WHERE MB001='A0301-122233-05001' ";
		ResultSet rs=null;
		try {
			rs = jc.rsErp(sql);
			assertNotNull(rs);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
