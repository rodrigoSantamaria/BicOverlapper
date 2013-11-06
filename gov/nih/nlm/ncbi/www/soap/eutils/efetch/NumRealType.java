/**
 * NumRealType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class NumRealType  implements java.io.Serializable {
    private java.lang.String numReal_a;

    private java.lang.String numReal_b;

    private java.lang.String numReal_units;

    public NumRealType() {
    }

    public NumRealType(
           java.lang.String numReal_a,
           java.lang.String numReal_b,
           java.lang.String numReal_units) {
           this.numReal_a = numReal_a;
           this.numReal_b = numReal_b;
           this.numReal_units = numReal_units;
    }


    /**
     * Gets the numReal_a value for this NumRealType.
     * 
     * @return numReal_a
     */
    public java.lang.String getNumReal_a() {
        return numReal_a;
    }


    /**
     * Sets the numReal_a value for this NumRealType.
     * 
     * @param numReal_a
     */
    public void setNumReal_a(java.lang.String numReal_a) {
        this.numReal_a = numReal_a;
    }


    /**
     * Gets the numReal_b value for this NumRealType.
     * 
     * @return numReal_b
     */
    public java.lang.String getNumReal_b() {
        return numReal_b;
    }


    /**
     * Sets the numReal_b value for this NumRealType.
     * 
     * @param numReal_b
     */
    public void setNumReal_b(java.lang.String numReal_b) {
        this.numReal_b = numReal_b;
    }


    /**
     * Gets the numReal_units value for this NumRealType.
     * 
     * @return numReal_units
     */
    public java.lang.String getNumReal_units() {
        return numReal_units;
    }


    /**
     * Sets the numReal_units value for this NumRealType.
     * 
     * @param numReal_units
     */
    public void setNumReal_units(java.lang.String numReal_units) {
        this.numReal_units = numReal_units;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NumRealType)) return false;
        NumRealType other = (NumRealType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.numReal_a==null && other.getNumReal_a()==null) || 
             (this.numReal_a!=null &&
              this.numReal_a.equals(other.getNumReal_a()))) &&
            ((this.numReal_b==null && other.getNumReal_b()==null) || 
             (this.numReal_b!=null &&
              this.numReal_b.equals(other.getNumReal_b()))) &&
            ((this.numReal_units==null && other.getNumReal_units()==null) || 
             (this.numReal_units!=null &&
              this.numReal_units.equals(other.getNumReal_units())));
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
        if (getNumReal_a() != null) {
            _hashCode += getNumReal_a().hashCode();
        }
        if (getNumReal_b() != null) {
            _hashCode += getNumReal_b().hashCode();
        }
        if (getNumReal_units() != null) {
            _hashCode += getNumReal_units().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NumRealType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Num-realType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numReal_a");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Num-real_a"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numReal_b");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Num-real_b"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numReal_units");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Num-real_units"));
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
