package com.edwin.my;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import com.edwin.QueryErpImp;

public class InvmbTest {

	private static QueryErpImp qei;

	@BeforeClass
	public static void init() {
		qei = new QueryErpImp();
	}

	@Test
	public void testGetMb110() {
		String symbol="A0301-122233-05001";
		String sql = "SELECT MB110 FROM INVMB WHERE MB001=?";
		
		
		
		
		
		
	}

}
