
/**
 * InvmbClassNotFoundExceptionException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package com.edwin.invmb;

public class InvmbClassNotFoundExceptionException extends java.lang.Exception{

    private static final long serialVersionUID = 1398651257968L;
    
    private InvmbStub.InvmbClassNotFoundException faultMessage;

    
        public InvmbClassNotFoundExceptionException() {
            super("InvmbClassNotFoundExceptionException");
        }

        public InvmbClassNotFoundExceptionException(java.lang.String s) {
           super(s);
        }

        public InvmbClassNotFoundExceptionException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public InvmbClassNotFoundExceptionException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(InvmbStub.InvmbClassNotFoundException msg){
       faultMessage = msg;
    }
    
    public InvmbStub.InvmbClassNotFoundException getFaultMessage(){
       return faultMessage;
    }
}
    