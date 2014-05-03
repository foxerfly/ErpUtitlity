package com.edwin.my;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.edwin.QueryErp;
import com.edwin.QueryErpImp;

public class Invmb {

	public String getMb110(String symbol) throws ClassNotFoundException,
			SQLException {
		QueryErp qr = new QueryErpImp();
		String sql = "SELECT MB110 FROM INVMB WHERE MB001=?";
		String result = "";
		ResultSet rs;
		rs = qr.rsErp(sql, symbol);

		while (rs.next()) {
			result = rs.getString("MB110");
		}
		return result;
	}

}
