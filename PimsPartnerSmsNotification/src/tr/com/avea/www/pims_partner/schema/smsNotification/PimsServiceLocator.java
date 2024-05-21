/**
 * PimsServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tr.com.avea.www.pims_partner.schema.smsNotification;

public class PimsServiceLocator extends org.apache.axis.client.Service implements tr.com.avea.www.pims_partner.schema.smsNotification.PimsService {

    public PimsServiceLocator() {
    }


    public PimsServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public PimsServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for PimsSoap11
    private java.lang.String PimsSoap11_address = "http://localhost:7001//wsps/services";

    public java.lang.String getPimsSoap11Address() {
        return PimsSoap11_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String PimsSoap11WSDDServiceName = "PimsSoap11";

    public java.lang.String getPimsSoap11WSDDServiceName() {
        return PimsSoap11WSDDServiceName;
    }

    public void setPimsSoap11WSDDServiceName(java.lang.String name) {
        PimsSoap11WSDDServiceName = name;
    }

    public tr.com.avea.www.pims_partner.schema.smsNotification.Pims getPimsSoap11() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(PimsSoap11_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getPimsSoap11(endpoint);
    }

    public tr.com.avea.www.pims_partner.schema.smsNotification.Pims getPimsSoap11(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            tr.com.avea.www.pims_partner.schema.smsNotification.PimsSoap11Stub _stub = new tr.com.avea.www.pims_partner.schema.smsNotification.PimsSoap11Stub(portAddress, this);
            _stub.setPortName(getPimsSoap11WSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setPimsSoap11EndpointAddress(java.lang.String address) {
        PimsSoap11_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (tr.com.avea.www.pims_partner.schema.smsNotification.Pims.class.isAssignableFrom(serviceEndpointInterface)) {
                tr.com.avea.www.pims_partner.schema.smsNotification.PimsSoap11Stub _stub = new tr.com.avea.www.pims_partner.schema.smsNotification.PimsSoap11Stub(new java.net.URL(PimsSoap11_address), this);
                _stub.setPortName(getPimsSoap11WSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("PimsSoap11".equals(inputPortName)) {
            return getPimsSoap11();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.avea.com.tr/pims-partner/schema/smsNotification", "PimsService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.avea.com.tr/pims-partner/schema/smsNotification", "PimsSoap11"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("PimsSoap11".equals(portName)) {
            setPimsSoap11EndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
