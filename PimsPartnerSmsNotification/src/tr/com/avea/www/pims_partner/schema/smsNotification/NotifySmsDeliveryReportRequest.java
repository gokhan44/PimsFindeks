/**
 * NotifySmsDeliveryReportRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tr.com.avea.www.pims_partner.schema.smsNotification;

public class NotifySmsDeliveryReportRequest  implements java.io.Serializable {
    private java.lang.String sessionId;

    private java.lang.String messageKey;

    private tr.com.avea.www.pims_partner.schema.smsNotification.SmsDeliveryInformation deliveryInformation;

    private tr.com.avea.www.pims.schema_common.NamedParam[] namedParam;

    public NotifySmsDeliveryReportRequest() {
    }

    public NotifySmsDeliveryReportRequest(
           java.lang.String sessionId,
           java.lang.String messageKey,
           tr.com.avea.www.pims_partner.schema.smsNotification.SmsDeliveryInformation deliveryInformation,
           tr.com.avea.www.pims.schema_common.NamedParam[] namedParam) {
           this.sessionId = sessionId;
           this.messageKey = messageKey;
           this.deliveryInformation = deliveryInformation;
           this.namedParam = namedParam;
    }


    /**
     * Gets the sessionId value for this NotifySmsDeliveryReportRequest.
     * 
     * @return sessionId
     */
    public java.lang.String getSessionId() {
        return sessionId;
    }


    /**
     * Sets the sessionId value for this NotifySmsDeliveryReportRequest.
     * 
     * @param sessionId
     */
    public void setSessionId(java.lang.String sessionId) {
        this.sessionId = sessionId;
    }


    /**
     * Gets the messageKey value for this NotifySmsDeliveryReportRequest.
     * 
     * @return messageKey
     */
    public java.lang.String getMessageKey() {
        return messageKey;
    }


    /**
     * Sets the messageKey value for this NotifySmsDeliveryReportRequest.
     * 
     * @param messageKey
     */
    public void setMessageKey(java.lang.String messageKey) {
        this.messageKey = messageKey;
    }


    /**
     * Gets the deliveryInformation value for this NotifySmsDeliveryReportRequest.
     * 
     * @return deliveryInformation
     */
    public tr.com.avea.www.pims_partner.schema.smsNotification.SmsDeliveryInformation getDeliveryInformation() {
        return deliveryInformation;
    }


    /**
     * Sets the deliveryInformation value for this NotifySmsDeliveryReportRequest.
     * 
     * @param deliveryInformation
     */
    public void setDeliveryInformation(tr.com.avea.www.pims_partner.schema.smsNotification.SmsDeliveryInformation deliveryInformation) {
        this.deliveryInformation = deliveryInformation;
    }


    /**
     * Gets the namedParam value for this NotifySmsDeliveryReportRequest.
     * 
     * @return namedParam
     */
    public tr.com.avea.www.pims.schema_common.NamedParam[] getNamedParam() {
        return namedParam;
    }


    /**
     * Sets the namedParam value for this NotifySmsDeliveryReportRequest.
     * 
     * @param namedParam
     */
    public void setNamedParam(tr.com.avea.www.pims.schema_common.NamedParam[] namedParam) {
        this.namedParam = namedParam;
    }

    public tr.com.avea.www.pims.schema_common.NamedParam getNamedParam(int i) {
        return this.namedParam[i];
    }

    public void setNamedParam(int i, tr.com.avea.www.pims.schema_common.NamedParam _value) {
        this.namedParam[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NotifySmsDeliveryReportRequest)) return false;
        NotifySmsDeliveryReportRequest other = (NotifySmsDeliveryReportRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sessionId==null && other.getSessionId()==null) || 
             (this.sessionId!=null &&
              this.sessionId.equals(other.getSessionId()))) &&
            ((this.messageKey==null && other.getMessageKey()==null) || 
             (this.messageKey!=null &&
              this.messageKey.equals(other.getMessageKey()))) &&
            ((this.deliveryInformation==null && other.getDeliveryInformation()==null) || 
             (this.deliveryInformation!=null &&
              this.deliveryInformation.equals(other.getDeliveryInformation()))) &&
            ((this.namedParam==null && other.getNamedParam()==null) || 
             (this.namedParam!=null &&
              java.util.Arrays.equals(this.namedParam, other.getNamedParam())));
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
        if (getSessionId() != null) {
            _hashCode += getSessionId().hashCode();
        }
        if (getMessageKey() != null) {
            _hashCode += getMessageKey().hashCode();
        }
        if (getDeliveryInformation() != null) {
            _hashCode += getDeliveryInformation().hashCode();
        }
        if (getNamedParam() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNamedParam());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNamedParam(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NotifySmsDeliveryReportRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.avea.com.tr/pims-partner/schema/smsNotification", ">NotifySmsDeliveryReportRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SessionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messageKey");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MessageKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryInformation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DeliveryInformation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.avea.com.tr/pims-partner/schema/smsNotification", "SmsDeliveryInformation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("namedParam");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NamedParam"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.avea.com.tr/pims/schema-common", "NamedParam"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
