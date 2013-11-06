/**
 * ID2SIntervalType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ID2SIntervalType  implements java.io.Serializable {
    private java.lang.String ID2SInterval_start;

    private java.lang.String ID2SInterval_length;

    public ID2SIntervalType() {
    }

    public ID2SIntervalType(
           java.lang.String ID2SInterval_start,
           java.lang.String ID2SInterval_length) {
           this.ID2SInterval_start = ID2SInterval_start;
           this.ID2SInterval_length = ID2SInterval_length;
    }


    /**
     * Gets the ID2SInterval_start value for this ID2SIntervalType.
     * 
     * @return ID2SInterval_start
     */
    public java.lang.String getID2SInterval_start() {
        return ID2SInterval_start;
    }


    /**
     * Sets the ID2SInterval_start value for this ID2SIntervalType.
     * 
     * @param ID2SInterval_start
     */
    public void setID2SInterval_start(java.lang.String ID2SInterval_start) {
        this.ID2SInterval_start = ID2SInterval_start;
    }


    /**
     * Gets the ID2SInterval_length value for this ID2SIntervalType.
     * 
     * @return ID2SInterval_length
     */
    public java.lang.String getID2SInterval_length() {
        return ID2SInterval_length;
    }


    /**
     * Sets the ID2SInterval_length value for this ID2SIntervalType.
     * 
     * @param ID2SInterval_length
     */
    public void setID2SInterval_length(java.lang.String ID2SInterval_length) {
        this.ID2SInterval_length = ID2SInterval_length;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ID2SIntervalType)) return false;
        ID2SIntervalType other = (ID2SIntervalType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ID2SInterval_start==null && other.getID2SInterval_start()==null) || 
             (this.ID2SInterval_start!=null &&
              this.ID2SInterval_start.equals(other.getID2SInterval_start()))) &&
            ((this.ID2SInterval_length==null && other.getID2SInterval_length()==null) || 
             (this.ID2SInterval_length!=null &&
              this.ID2SInterval_length.equals(other.getID2SInterval_length())));
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
        if (getID2SInterval_start() != null) {
            _hashCode += getID2SInterval_start().hashCode();
        }
        if (getID2SInterval_length() != null) {
            _hashCode += getID2SInterval_length().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ID2SIntervalType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-IntervalType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2SInterval_start");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Interval_start"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2SInterval_length");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Interval_length"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
