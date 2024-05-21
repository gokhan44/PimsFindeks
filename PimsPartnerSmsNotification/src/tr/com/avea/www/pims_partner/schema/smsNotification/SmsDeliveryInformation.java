/**
 * SmsDeliveryInformation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tr.com.avea.www.pims_partner.schema.smsNotification;

public class SmsDeliveryInformation  implements java.io.Serializable {
    private tr.com.avea.www.pims.schema_common.Address address;

    private tr.com.avea.www.pims_partner.schema.smsNotification.SmsDeliveryStatus smsDeliveryStatus;

    public SmsDeliveryInformation() {
    }

    public SmsDeliveryInformation(
           tr.com.avea.www.pims.schema_common.Address address,
           tr.com.avea.www.pims_partner.schema.smsNotification.SmsDeliveryStatus smsDeliveryStatus) {
           this.address = address;
           this.smsDeliveryStatus = smsDeliveryStatus;
    }


    /**
     * Gets the address value for this SmsDeliveryInformation.
     * 
     * @return address
     */
    public tr.com.avea.www.pims.schema_common.Address getAddress() {
        return address;
    }


    /**
     * Sets the address value for this SmsDeliveryInformation.
     * 
     * @param address
     */
    public void setAddress(tr.com.avea.www.pims.schema_common.Address address) {
        this.address = address;
    }


    /**
     * Gets the smsDeliveryStatus value for this SmsDeliveryInformation.
     * 
     * @return smsDeliveryStatus
     */
    public tr.com.avea.www.pims_partner.schema.smsNotification.SmsDeliveryStatus getSmsDeliveryStatus() {
        return smsDeliveryStatus;
    }


    /**
     * Sets the smsDeliveryStatus value for this SmsDeliveryInformation.
     * 
     * @param smsDeliveryStatus
     */
    public void setSmsDeliveryStatus(tr.com.avea.www.pims_partner.schema.smsNotification.SmsDeliveryStatus smsDeliveryStatus) {
        this.smsDeliveryStatus = smsDeliveryStatus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SmsDeliveryInformation)) return false;
        SmsDeliveryInformation other = (SmsDeliveryInformation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.address==null && other.getAddress()==null) || 
             (this.address!=null &&
              this.address.equals(other.getAddress()))) &&
            ((this.smsDeliveryStatus==null && other.getSmsDeliveryStatus()==null) || 
             (this.smsDeliveryStatus!=null &&
              this.smsDeliveryStatus.equals(other.getSmsDeliveryStatus())));
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
        if (getAddress() != null) {
            _hashCode += getAddress().hashCode();
        }
        if (getSmsDeliveryStatus() != null) {
            _hashCode += getSmsDeliveryStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SmsDeliveryInformation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.avea.com.tr/pims-partner/schema/smsNotification", "SmsDeliveryInformation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Address"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.avea.com.tr/pims/schema-common", "Address"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("smsDeliveryStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SmsDeliveryStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.avea.com.tr/pims-partner/schema/smsNotification", "SmsDeliveryStatus"));
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
