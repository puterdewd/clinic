
package edu.stevens.cs548.clinic.service.web.soap;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ProviderWebService", targetNamespace = "http://cs548.stevens.edu/clinic/service/web/soap", wsdlLocation = "file:/C:/Users/Brad/Documents/assignment7Stripped/ClinicSoapWebServiceClient/src/main/resources/ProviderWebService.wsdl")
public class ProviderWebService
    extends Service
{

    private final static URL PROVIDERWEBSERVICE_WSDL_LOCATION;
    private final static WebServiceException PROVIDERWEBSERVICE_EXCEPTION;
    private final static QName PROVIDERWEBSERVICE_QNAME = new QName("http://cs548.stevens.edu/clinic/service/web/soap", "ProviderWebService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/C:/Users/Brad/Documents/assignment7Stripped/ClinicSoapWebServiceClient/src/main/resources/ProviderWebService.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        PROVIDERWEBSERVICE_WSDL_LOCATION = url;
        PROVIDERWEBSERVICE_EXCEPTION = e;
    }

    public ProviderWebService() {
        super(__getWsdlLocation(), PROVIDERWEBSERVICE_QNAME);
    }

    public ProviderWebService(WebServiceFeature... features) {
        super(__getWsdlLocation(), PROVIDERWEBSERVICE_QNAME, features);
    }

    public ProviderWebService(URL wsdlLocation) {
        super(wsdlLocation, PROVIDERWEBSERVICE_QNAME);
    }

    public ProviderWebService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, PROVIDERWEBSERVICE_QNAME, features);
    }

    public ProviderWebService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ProviderWebService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns IProviderWebPort
     */
    @WebEndpoint(name = "ProviderWebPort")
    public IProviderWebPort getProviderWebPort() {
        return super.getPort(new QName("http://cs548.stevens.edu/clinic/service/web/soap", "ProviderWebPort"), IProviderWebPort.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IProviderWebPort
     */
    @WebEndpoint(name = "ProviderWebPort")
    public IProviderWebPort getProviderWebPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://cs548.stevens.edu/clinic/service/web/soap", "ProviderWebPort"), IProviderWebPort.class, features);
    }

    private static URL __getWsdlLocation() {
        if (PROVIDERWEBSERVICE_EXCEPTION!= null) {
            throw PROVIDERWEBSERVICE_EXCEPTION;
        }
        return PROVIDERWEBSERVICE_WSDL_LOCATION;
    }

}
