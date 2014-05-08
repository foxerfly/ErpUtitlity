package com.edwin.my;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.sql.SQLException;

import org.junit.BeforeClass;
import org.junit.Test;

import com.edwin.QueryErpImp;
import com.edwin.out;

public class InvmbTest {

	private static QueryErpImp qei;

	@BeforeClass
	public static void init() {
		qei = new QueryErpImp();
	}

	@Test
	public void testGetMb110() throws ClassNotFoundException, SQLException {

		Invmb a = new Invmb();
		String s = a.getMb110();
//		assertNotNull(s);
		assertNull(s);

	}

}
