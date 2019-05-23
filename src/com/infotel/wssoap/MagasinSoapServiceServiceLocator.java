/**
 * MagasinSoapServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.infotel.wssoap;

public class MagasinSoapServiceServiceLocator extends org.apache.axis.client.Service implements com.infotel.wssoap.MagasinSoapServiceService {

    public MagasinSoapServiceServiceLocator() {
    }


    public MagasinSoapServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public MagasinSoapServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for MagasinSoapServicePort
    private java.lang.String MagasinSoapServicePort_address = "http://localhost:8080/synthese-serveur-ejb-ws-equipe-3.1/MagasinSoapService";

    public java.lang.String getMagasinSoapServicePortAddress() {
        return MagasinSoapServicePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String MagasinSoapServicePortWSDDServiceName = "MagasinSoapServicePort";

    public java.lang.String getMagasinSoapServicePortWSDDServiceName() {
        return MagasinSoapServicePortWSDDServiceName;
    }

    public void setMagasinSoapServicePortWSDDServiceName(java.lang.String name) {
        MagasinSoapServicePortWSDDServiceName = name;
    }

    public com.infotel.wssoap.MagasinSoapService getMagasinSoapServicePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(MagasinSoapServicePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getMagasinSoapServicePort(endpoint);
    }

    public com.infotel.wssoap.MagasinSoapService getMagasinSoapServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.infotel.wssoap.MagasinSoapServiceServiceSoapBindingStub _stub = new com.infotel.wssoap.MagasinSoapServiceServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getMagasinSoapServicePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setMagasinSoapServicePortEndpointAddress(java.lang.String address) {
        MagasinSoapServicePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.infotel.wssoap.MagasinSoapService.class.isAssignableFrom(serviceEndpointInterface)) {
                com.infotel.wssoap.MagasinSoapServiceServiceSoapBindingStub _stub = new com.infotel.wssoap.MagasinSoapServiceServiceSoapBindingStub(new java.net.URL(MagasinSoapServicePort_address), this);
                _stub.setPortName(getMagasinSoapServicePortWSDDServiceName());
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
        if ("MagasinSoapServicePort".equals(inputPortName)) {
            return getMagasinSoapServicePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://wssoap.infotel.com/", "MagasinSoapServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://wssoap.infotel.com/", "MagasinSoapServicePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("MagasinSoapServicePort".equals(portName)) {
            setMagasinSoapServicePortEndpointAddress(address);
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
