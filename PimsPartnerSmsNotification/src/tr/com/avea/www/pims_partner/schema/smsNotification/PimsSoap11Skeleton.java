/**
 * PimsSoap11Skeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tr.com.avea.www.pims_partner.schema.smsNotification;

public class PimsSoap11Skeleton implements tr.com.avea.www.pims_partner.schema.smsNotification.Pims, org.apache.axis.wsdl.Skeleton {
    private tr.com.avea.www.pims_partner.schema.smsNotification.Pims impl;
    private static java.util.Map _myOperations = new java.util.Hashtable();
    private static java.util.Collection _myOperationsList = new java.util.ArrayList();

    /**
    * Returns List of OperationDesc objects with this name
    */
    public static java.util.List getOperationDescByName(java.lang.String methodName) {
        return (java.util.List)_myOperations.get(methodName);
    }

    /**
    * Returns Collection of OperationDescs
    */
    public static java.util.Collection getOperationDescs() {
        return _myOperationsList;
    }

    static {
        org.apache.axis.description.OperationDesc _oper;
        org.apache.axis.description.FaultDesc _fault;
        org.apache.axis.description.ParameterDesc [] _params;
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.avea.com.tr/pims-partner/schema/smsNotification", "NotifySmsDeliveryReportRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.avea.com.tr/pims-partner/schema/smsNotification", ">NotifySmsDeliveryReportRequest"), tr.com.avea.www.pims_partner.schema.smsNotification.NotifySmsDeliveryReportRequest.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("notifySmsDeliveryReport", _params, new javax.xml.namespace.QName("http://www.avea.com.tr/pims-partner/schema/smsNotification", "NotifySmsDeliveryReportResponse"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.avea.com.tr/pims-partner/schema/smsNotification", ">NotifySmsDeliveryReportResponse"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "NotifySmsDeliveryReport"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("notifySmsDeliveryReport") == null) {
            _myOperations.put("notifySmsDeliveryReport", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("notifySmsDeliveryReport")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.avea.com.tr/pims-partner/schema/smsNotification", "NotifySmsReceptionRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.avea.com.tr/pims-partner/schema/smsNotification", ">NotifySmsReceptionRequest"), tr.com.avea.www.pims_partner.schema.smsNotification.NotifySmsReceptionRequest.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("notifySmsReception", _params, new javax.xml.namespace.QName("http://www.avea.com.tr/pims-partner/schema/smsNotification", "NotifySmsReceptionResponse"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.avea.com.tr/pims-partner/schema/smsNotification", ">NotifySmsReceptionResponse"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "NotifySmsReception"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("notifySmsReception") == null) {
            _myOperations.put("notifySmsReception", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("notifySmsReception")).add(_oper);
    }

    public PimsSoap11Skeleton() {
        this.impl = new tr.com.avea.www.pims_partner.schema.smsNotification.PimsSoap11Impl();
    }

    public PimsSoap11Skeleton(tr.com.avea.www.pims_partner.schema.smsNotification.Pims impl) {
        this.impl = impl;
    }
    public tr.com.avea.www.pims_partner.schema.smsNotification.NotifySmsDeliveryReportResponse notifySmsDeliveryReport(tr.com.avea.www.pims_partner.schema.smsNotification.NotifySmsDeliveryReportRequest notifySmsDeliveryReportRequest) throws java.rmi.RemoteException
    {
        tr.com.avea.www.pims_partner.schema.smsNotification.NotifySmsDeliveryReportResponse ret = impl.notifySmsDeliveryReport(notifySmsDeliveryReportRequest);
        return ret;
    }

    public tr.com.avea.www.pims_partner.schema.smsNotification.NotifySmsReceptionResponse notifySmsReception(tr.com.avea.www.pims_partner.schema.smsNotification.NotifySmsReceptionRequest notifySmsReceptionRequest) throws java.rmi.RemoteException
    {
        tr.com.avea.www.pims_partner.schema.smsNotification.NotifySmsReceptionResponse ret = impl.notifySmsReception(notifySmsReceptionRequest);
        return ret;
    }

}
