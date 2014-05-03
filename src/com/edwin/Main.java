package com.edwin;

import java.sql.SQLException;

import javax.xml.namespace.QName;

import org.apache.axis2.AxisFault;
import org.apache.axis2.addressing.EndpointReference;
import org.apache.axis2.client.Options;
import org.apache.axis2.rpc.client.RPCServiceClient;

import com.edwin.my.Invmb;

public class Main {

	public static void main(String[] args) throws AxisFault,
			ClassNotFoundException, SQLException {

		String url = "http://192.168.1.7:9080/WebServiceProject/services/Invmb";

		String method = "getMb110";

		RPCServiceClient serviceClient = new RPCServiceClient();
		Options options = serviceClient.getOptions();

		EndpointReference targetEPR = new EndpointReference(url);
		options.setTo(targetEPR);

		QName opAddEntry = new QName("http://my.edwin.com", method);

		Object[] opAddEntryArgs = new Object[] { "A0301-122233-05001" };

		Class[] classes = new Class[] { String.class };

		out.Out(serviceClient.invokeBlocking(opAddEntry, opAddEntryArgs,
				classes)[0]);

		Invmb i = new Invmb();
		out.Out(i.getMb110("A0301-122233-05001"));

	}
}
