
package edu.stevens.cs548.clinic.service.web.soap;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "PatientNotFoundExn", targetNamespace = "http://cs548.stevens.edu/clinic/service/web/soap")
public class PatientNotFoundExn_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private PatientNotFoundExn faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public PatientNotFoundExn_Exception(String message, PatientNotFoundExn faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public PatientNotFoundExn_Exception(String message, PatientNotFoundExn faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: edu.stevens.cs548.clinic.service.web.soap.PatientNotFoundExn
     */
    public PatientNotFoundExn getFaultInfo() {
        return faultInfo;
    }

}
