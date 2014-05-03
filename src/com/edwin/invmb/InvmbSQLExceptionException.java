
/**
 * InvmbSQLExceptionException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package com.edwin.invmb;

public class InvmbSQLExceptionException extends java.lang.Exception{

    private static final long serialVersionUID = 1398651257991L;
    
    private InvmbStub.InvmbSQLException faultMessage;

    
        public InvmbSQLExceptionException() {
            super("InvmbSQLExceptionException");
        }

        public InvmbSQLExceptionException(java.lang.String s) {
           super(s);
        }

        public InvmbSQLExceptionException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public InvmbSQLExceptionException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(InvmbStub.InvmbSQLException msg){
       faultMessage = msg;
    }
    
    public InvmbStub.InvmbSQLException getFaultMessage(){
       return faultMessage;
    }
}
    