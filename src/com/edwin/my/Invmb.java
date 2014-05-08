package com.edwin.my;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.edwin.QueryErp;
import com.edwin.QueryErpImp;

public class Invmb {

	public String getMb110() throws ClassNotFoundException,
			SQLException {
		QueryErpImp qr = new QueryErpImp();
		String sql = "SELECT TOP 2 MB001,MB002,MB003,MB004,MB009,"
				+ "MB110,MB025,MB109,MB017,MB090,MB148,MB149,MB008,MB014,MB027"
				+ "  FROM INVMB ORDER BY MB001";

		int columnCount = 0;
		JSONArray jsa = new JSONArray();

		ResultSet rs;
		rs = qr.rsErp(sql);

		ResultSetMetaData rsm = rs.getMetaData();
		columnCount = rsm.getColumnCount();

		while (rs.next()) {

			JSONObject jso = new JSONObject();
			for (int i = 1; i <= columnCount; i++) {

				String columnId = rsm.getColumnLabel(i);
//				out.Out(columnId);
				String value = rs.getString(columnId);
				jso.put(columnId, value);

			}

			jsa.add(jso);

		}
		return jsa.toString();
	}

}
