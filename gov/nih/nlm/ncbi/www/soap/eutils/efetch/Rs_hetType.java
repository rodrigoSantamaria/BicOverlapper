/**
 * Rs_hetType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Rs_hetType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Rs_het_typeType rs_het_type;

    private java.lang.String rs_het_value;

    private java.lang.String rs_het_stdError;

    public Rs_hetType() {
    }

    public Rs_hetType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Rs_het_typeType rs_het_type,
           java.lang.String rs_het_value,
           java.lang.String rs_het_stdError) {
           this.rs_het_type = rs_het_type;
           this.rs_het_value = rs_het_value;
           this.rs_het_stdError = rs_het_stdError;
    }


    /**
     * Gets the rs_het_type value for this Rs_hetType.
     * 
     * @return rs_het_type
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Rs_het_typeType getRs_het_type() {
        return rs_het_type;
    }


    /**
     * Sets the rs_het_type value for this Rs_hetType.
     * 
     * @param rs_het_type
     */
    public void setRs_het_type(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Rs_het_typeType rs_het_type) {
        this.rs_het_type = rs_het_type;
    }


    /**
     * Gets the rs_het_value value for this Rs_hetType.
     * 
     * @return rs_het_value
     */
    public java.lang.String getRs_het_value() {
        return rs_het_value;
    }


    /**
     * Sets the rs_het_value value for this Rs_hetType.
     * 
     * @param rs_het_value
     */
    public void setRs_het_value(java.lang.String rs_het_value) {
        this.rs_het_value = rs_het_value;
    }


    /**
     * Gets the rs_het_stdError value for this Rs_hetType.
     * 
     * @return rs_het_stdError
     */
    public java.lang.String getRs_het_stdError() {
        return rs_het_stdError;
    }


    /**
     * Sets the rs_het_stdError value for this Rs_hetType.
     * 
     * @param rs_het_stdError
     */
    public void setRs_het_stdError(java.lang.String rs_het_stdError) {
        this.rs_het_stdError = rs_het_stdError;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Rs_hetType)) return false;
        Rs_hetType other = (Rs_hetType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.rs_het_type==null && other.getRs_het_type()==null) || 
             (this.rs_het_type!=null &&
              this.rs_het_type.equals(other.getRs_het_type()))) &&
            ((this.rs_het_value==null && other.getRs_het_value()==null) || 
             (this.rs_het_value!=null &&
              this.rs_het_value.equals(other.getRs_het_value()))) &&
            ((this.rs_het_stdError==null && other.getRs_het_stdError()==null) || 
             (this.rs_het_stdError!=null &&
              this.rs_het_stdError.equals(other.getRs_het_stdError())));
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
        if (getRs_het_type() != null) {
            _hashCode += getRs_het_type().hashCode();
        }
        if (getRs_het_value() != null) {
            _hashCode += getRs_het_value().hashCode();
        }
        if (getRs_het_stdError() != null) {
            _hashCode += getRs_het_stdError().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Rs_hetType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Rs_hetType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rs_het_type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Rs_het_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Rs_het_typeType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rs_het_value");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Rs_het_value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rs_het_stdError");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Rs_het_stdError"));
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
