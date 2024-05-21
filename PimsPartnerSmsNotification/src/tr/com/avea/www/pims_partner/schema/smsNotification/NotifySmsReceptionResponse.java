/**
 * NotifySmsReceptionResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tr.com.avea.www.pims_partner.schema.smsNotification;

public class NotifySmsReceptionResponse  implements java.io.Serializable {
    private tr.com.avea.www.pims_partner.schema.smsNotification.SmsNotificationServiceResultCode resultCode;

    public NotifySmsReceptionResponse() {
    }

    public NotifySmsReceptionResponse(
           tr.com.avea.www.pims_partner.schema.smsNotification.SmsNotificationServiceResultCode resultCode) {
           this.resultCode = resultCode;
    }


    /**
     * Gets the resultCode value for this NotifySmsReceptionResponse.
     * 
     * @return resultCode
     */
    public tr.com.avea.www.pims_partner.schema.smsNotification.SmsNotificationServiceResultCode getResultCode() {
        return resultCode;
    }


    /**
     * Sets the resultCode value for this NotifySmsReceptionResponse.
     * 
     * @param resultCode
     */
    public void setResultCode(tr.com.avea.www.pims_partner.schema.smsNotification.SmsNotificationServiceResultCode resultCode) {
        this.resultCode = resultCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NotifySmsReceptionResponse)) return false;
        NotifySmsReceptionResponse other = (NotifySmsReceptionResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.resultCode==null && other.getResultCode()==null) || 
             (this.resultCode!=null &&
              this.resultCode.equals(other.getResultCode())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getResultCode() != null) {
            _hashCode += getResultCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NotifySmsReceptionResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.avea.com.tr/pims-partner/schema/smsNotification", ">NotifySmsReceptionResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "resultCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.avea.com.tr/pims-partner/schema/smsNotification", "SmsNotificationServiceResultCode"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
