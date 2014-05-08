package com.edwin;

import java.sql.SQLException;

import javax.xml.namespace.QName;

import org.apache.axis2.AxisFault;
import org.apache.axis2.addressing.EndpointReference;
import org.apache.axis2.client.Options;
import org.apache.axis2.rpc.client.RPCServiceClient;

import com.edwin.my.Invmb;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException,
			SQLException, AxisFault {

		String url = "http://127.0.0.1:9080/WebServiceProject/services/INVMB";

		String method = "getMb110";

		RPCServiceClient serviceClient = new RPCServiceClient();
		Options options = serviceClient.getOptions();

		EndpointReference targetEPR = new EndpointReference(url);
		options.setTo(targetEPR);

		QName opAddEntry = new QName("http://my.edwin.com", method);

		Object[] opAddEntryArgs = new Object[] {""};

		Class[] classes = new Class[] { String.class };

		serviceClient.getOptions().setTimeOutInMilliSeconds(600000L);
		out.Out(serviceClient.invokeBlocking(opAddEntry, opAddEntryArgs,
				classes)[0]);
		
		
//		Invmb i=new Invmb();
//		out.Out(i.getMb110("1"));
		
		
		
//		String url = "http://localhost:9080/WebServiceProject/services/AxisTWB";
//
//		String method = "sayHello";
//
//		RPCServiceClient serviceClient = new RPCServiceClient();
//		Options options = serviceClient.getOptions();
//
//		EndpointReference targetEPR = new EndpointReference(url);
//		options.setTo(targetEPR);
//
//		QName opAddEntry = new QName("http://my.edwin.com", method);
//
//		Object[] opAddEntryArgs = new Object[] {"ddd"};
//
//		Class[] classes = new Class[] { String.class };
//
//		out.Out(serviceClient.invokeBlocking(opAddEntry, opAddEntryArgs,
//				classes)[0]);
		

	}
}
