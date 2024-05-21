/**
 * NotifySmsReceptionRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tr.com.avea.www.pims_partner.schema.smsNotification;

public class NotifySmsReceptionRequest  implements java.io.Serializable {
    private java.lang.String sessionId;

    private java.lang.String smsServiceActivationNumber;

    private tr.com.avea.www.pims.schema_common.Address senderAddress;

    private java.lang.String message;

    private java.lang.String messageKey;

    private java.lang.Integer partTotal;

    private java.lang.Integer partNo;

    private tr.com.avea.www.pims.schema_common.NamedParam[] namedParam;

    public NotifySmsReceptionRequest() {
    }

    public NotifySmsReceptionRequest(
           java.lang.String sessionId,
           java.lang.String smsServiceActivationNumber,
           tr.com.avea.www.pims.schema_common.Address senderAddress,
           java.lang.String message,
           java.lang.String messageKey,
           java.lang.Integer partTotal,
           java.lang.Integer partNo,
           tr.com.avea.www.pims.schema_common.NamedParam[] namedParam) {
           this.sessionId = sessionId;
           this.smsServiceActivationNumber = smsServiceActivationNumber;
           this.senderAddress = senderAddress;
           this.message = message;
           this.messageKey = messageKey;
           this.partTotal = partTotal;
           this.partNo = partNo;
           this.namedParam = namedParam;
    }


    /**
     * Gets the sessionId value for this NotifySmsReceptionRequest.
     * 
     * @return sessionId
     */
    public java.lang.String getSessionId() {
        return sessionId;
    }


    /**
     * Sets the sessionId value for this NotifySmsReceptionRequest.
     * 
     * @param sessionId
     */
    public void setSessionId(java.lang.String sessionId) {
        this.sessionId = sessionId;
    }


    /**
     * Gets the smsServiceActivationNumber value for this NotifySmsReceptionRequest.
     * 
     * @return smsServiceActivationNumber
     */
    public java.lang.String getSmsServiceActivationNumber() {
        return smsServiceActivationNumber;
    }


    /**
     * Sets the smsServiceActivationNumber value for this NotifySmsReceptionRequest.
     * 
     * @param smsServiceActivationNumber
     */
    public void setSmsServiceActivationNumber(java.lang.String smsServiceActivationNumber) {
        this.smsServiceActivationNumber = smsServiceActivationNumber;
    }


    /**
     * Gets the senderAddress value for this NotifySmsReceptionRequest.
     * 
     * @return senderAddress
     */
    public tr.com.avea.www.pims.schema_common.Address getSenderAddress() {
        return senderAddress;
    }


    /**
     * Sets the senderAddress value for this NotifySmsReceptionRequest.
     * 
     * @param senderAddress
     */
    public void setSenderAddress(tr.com.avea.www.pims.schema_common.Address senderAddress) {
        this.senderAddress = senderAddress;
    }


    /**
     * Gets the message value for this NotifySmsReceptionRequest.
     * 
     * @return message
     */
    public java.lang.String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this NotifySmsReceptionRequest.
     * 
     * @param message
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
    }


    /**
     * Gets the messageKey value for this NotifySmsReceptionRequest.
     * 
     * @return messageKey
     */
    public java.lang.String getMessageKey() {
        return messageKey;
    }


    /**
     * Sets the messageKey value for this NotifySmsReceptionRequest.
     * 
     * @param messageKey
     */
    public void setMessageKey(java.lang.String messageKey) {
        this.messageKey = messageKey;
    }


    /**
     * Gets the partTotal value for this NotifySmsReceptionRequest.
     * 
     * @return partTotal
     */
    public java.lang.Integer getPartTotal() {
        return partTotal;
    }


    /**
     * Sets the partTotal value for this NotifySmsReceptionRequest.
     * 
     * @param partTotal
     */
    public void setPartTotal(java.lang.Integer partTotal) {
        this.partTotal = partTotal;
    }


    /**
     * Gets the partNo value for this NotifySmsReceptionRequest.
     * 
     * @return partNo
     */
    public java.lang.Integer getPartNo() {
        return partNo;
    }


    /**
     * Sets the partNo value for this NotifySmsReceptionRequest.
     * 
     * @param partNo
     */
    public void setPartNo(java.lang.Integer partNo) {
        this.partNo = partNo;
    }


    /**
     * Gets the namedParam value for this NotifySmsReceptionRequest.
     * 
     * @return namedParam
     */
    public tr.com.avea.www.pims.schema_common.NamedParam[] getNamedParam() {
        return namedParam;
    }


    /**
     * Sets the namedParam value for this NotifySmsReceptionRequest.
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
        if (!(obj instanceof NotifySmsReceptionRequest)) return false;
        NotifySmsReceptionRequest other = (NotifySmsReceptionRequest) obj;
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
            ((this.smsServiceActivationNumber==null && other.getSmsServiceActivationNumber()==null) || 
             (this.smsServiceActivationNumber!=null &&
              this.smsServiceActivationNumber.equals(other.getSmsServiceActivationNumber()))) &&
            ((this.senderAddress==null && other.getSenderAddress()==null) || 
             (this.senderAddress!=null &&
              this.senderAddress.equals(other.getSenderAddress()))) &&
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              this.message.equals(other.getMessage()))) &&
            ((this.messageKey==null && other.getMessageKey()==null) || 
             (this.messageKey!=null &&
              this.messageKey.equals(other.getMessageKey()))) &&
            ((this.partTotal==null && other.getPartTotal()==null) || 
             (this.partTotal!=null &&
              this.partTotal.equals(other.getPartTotal()))) &&
            ((this.partNo==null && other.getPartNo()==null) || 
             (this.partNo!=null &&
              this.partNo.equals(other.getPartNo()))) &&
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
        if (getSmsServiceActivationNumber() != null) {
            _hashCode += getSmsServiceActivationNumber().hashCode();
        }
        if (getSenderAddress() != null) {
            _hashCode += getSenderAddress().hashCode();
        }
        if (getMessage() != null) {
            _hashCode += getMessage().hashCode();
        }
        if (getMessageKey() != null) {
            _hashCode += getMessageKey().hashCode();
        }
        if (getPartTotal() != null) {
            _hashCode += getPartTotal().hashCode();
        }
        if (getPartNo() != null) {
            _hashCode += getPartNo().hashCode();
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
        new org.apache.axis.description.TypeDesc(NotifySmsReceptionRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.avea.com.tr/pims-partner/schema/smsNotification", ">NotifySmsReceptionRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SessionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("smsServiceActivationNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SmsServiceActivationNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("senderAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SenderAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.avea.com.tr/pims/schema-common", "Address"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Message"));
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
        elemField.setFieldName("partTotal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PartTotal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partNo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PartNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
