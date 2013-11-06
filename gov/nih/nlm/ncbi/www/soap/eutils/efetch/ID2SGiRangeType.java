/**
 * ID2SGiRangeType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ID2SGiRangeType  implements java.io.Serializable {
    private java.lang.String ID2SGiRange_start;

    private java.lang.String ID2SGiRange_count;

    public ID2SGiRangeType() {
    }

    public ID2SGiRangeType(
           java.lang.String ID2SGiRange_start,
           java.lang.String ID2SGiRange_count) {
           this.ID2SGiRange_start = ID2SGiRange_start;
           this.ID2SGiRange_count = ID2SGiRange_count;
    }


    /**
     * Gets the ID2SGiRange_start value for this ID2SGiRangeType.
     * 
     * @return ID2SGiRange_start
     */
    public java.lang.String getID2SGiRange_start() {
        return ID2SGiRange_start;
    }


    /**
     * Sets the ID2SGiRange_start value for this ID2SGiRangeType.
     * 
     * @param ID2SGiRange_start
     */
    public void setID2SGiRange_start(java.lang.String ID2SGiRange_start) {
        this.ID2SGiRange_start = ID2SGiRange_start;
    }


    /**
     * Gets the ID2SGiRange_count value for this ID2SGiRangeType.
     * 
     * @return ID2SGiRange_count
     */
    public java.lang.String getID2SGiRange_count() {
        return ID2SGiRange_count;
    }


    /**
     * Sets the ID2SGiRange_count value for this ID2SGiRangeType.
     * 
     * @param ID2SGiRange_count
     */
    public void setID2SGiRange_count(java.lang.String ID2SGiRange_count) {
        this.ID2SGiRange_count = ID2SGiRange_count;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ID2SGiRangeType)) return false;
        ID2SGiRangeType other = (ID2SGiRangeType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ID2SGiRange_start==null && other.getID2SGiRange_start()==null) || 
             (this.ID2SGiRange_start!=null &&
              this.ID2SGiRange_start.equals(other.getID2SGiRange_start()))) &&
            ((this.ID2SGiRange_count==null && other.getID2SGiRange_count()==null) || 
             (this.ID2SGiRange_count!=null &&
              this.ID2SGiRange_count.equals(other.getID2SGiRange_count())));
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
        if (getID2SGiRange_start() != null) {
            _hashCode += getID2SGiRange_start().hashCode();
        }
        if (getID2SGiRange_count() != null) {
            _hashCode += getID2SGiRange_count().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ID2SGiRangeType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Gi-RangeType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2SGiRange_start");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Gi-Range_start"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2SGiRange_count");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Gi-Range_count"));
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
