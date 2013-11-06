/**
 * ID2SGiIntervalType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ID2SGiIntervalType  implements java.io.Serializable {
    private java.lang.String ID2SGiInterval_gi;

    private java.lang.String ID2SGiInterval_start;

    private java.lang.String ID2SGiInterval_length;

    public ID2SGiIntervalType() {
    }

    public ID2SGiIntervalType(
           java.lang.String ID2SGiInterval_gi,
           java.lang.String ID2SGiInterval_start,
           java.lang.String ID2SGiInterval_length) {
           this.ID2SGiInterval_gi = ID2SGiInterval_gi;
           this.ID2SGiInterval_start = ID2SGiInterval_start;
           this.ID2SGiInterval_length = ID2SGiInterval_length;
    }


    /**
     * Gets the ID2SGiInterval_gi value for this ID2SGiIntervalType.
     * 
     * @return ID2SGiInterval_gi
     */
    public java.lang.String getID2SGiInterval_gi() {
        return ID2SGiInterval_gi;
    }


    /**
     * Sets the ID2SGiInterval_gi value for this ID2SGiIntervalType.
     * 
     * @param ID2SGiInterval_gi
     */
    public void setID2SGiInterval_gi(java.lang.String ID2SGiInterval_gi) {
        this.ID2SGiInterval_gi = ID2SGiInterval_gi;
    }


    /**
     * Gets the ID2SGiInterval_start value for this ID2SGiIntervalType.
     * 
     * @return ID2SGiInterval_start
     */
    public java.lang.String getID2SGiInterval_start() {
        return ID2SGiInterval_start;
    }


    /**
     * Sets the ID2SGiInterval_start value for this ID2SGiIntervalType.
     * 
     * @param ID2SGiInterval_start
     */
    public void setID2SGiInterval_start(java.lang.String ID2SGiInterval_start) {
        this.ID2SGiInterval_start = ID2SGiInterval_start;
    }


    /**
     * Gets the ID2SGiInterval_length value for this ID2SGiIntervalType.
     * 
     * @return ID2SGiInterval_length
     */
    public java.lang.String getID2SGiInterval_length() {
        return ID2SGiInterval_length;
    }


    /**
     * Sets the ID2SGiInterval_length value for this ID2SGiIntervalType.
     * 
     * @param ID2SGiInterval_length
     */
    public void setID2SGiInterval_length(java.lang.String ID2SGiInterval_length) {
        this.ID2SGiInterval_length = ID2SGiInterval_length;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ID2SGiIntervalType)) return false;
        ID2SGiIntervalType other = (ID2SGiIntervalType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ID2SGiInterval_gi==null && other.getID2SGiInterval_gi()==null) || 
             (this.ID2SGiInterval_gi!=null &&
              this.ID2SGiInterval_gi.equals(other.getID2SGiInterval_gi()))) &&
            ((this.ID2SGiInterval_start==null && other.getID2SGiInterval_start()==null) || 
             (this.ID2SGiInterval_start!=null &&
              this.ID2SGiInterval_start.equals(other.getID2SGiInterval_start()))) &&
            ((this.ID2SGiInterval_length==null && other.getID2SGiInterval_length()==null) || 
             (this.ID2SGiInterval_length!=null &&
              this.ID2SGiInterval_length.equals(other.getID2SGiInterval_length())));
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
        if (getID2SGiInterval_gi() != null) {
            _hashCode += getID2SGiInterval_gi().hashCode();
        }
        if (getID2SGiInterval_start() != null) {
            _hashCode += getID2SGiInterval_start().hashCode();
        }
        if (getID2SGiInterval_length() != null) {
            _hashCode += getID2SGiInterval_length().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ID2SGiIntervalType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Gi-IntervalType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2SGiInterval_gi");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Gi-Interval_gi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2SGiInterval_start");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Gi-Interval_start"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2SGiInterval_length");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Gi-Interval_length"));
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
