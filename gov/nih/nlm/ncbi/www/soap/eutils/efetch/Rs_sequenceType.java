/**
 * Rs_sequenceType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Rs_sequenceType  implements java.io.Serializable {
    private java.lang.String rs_sequence_exemplarSs;

    private java.lang.String rs_sequence_seq5;

    private java.lang.String rs_sequence_observed;

    private java.lang.String rs_sequence_seq3;

    public Rs_sequenceType() {
    }

    public Rs_sequenceType(
           java.lang.String rs_sequence_exemplarSs,
           java.lang.String rs_sequence_seq5,
           java.lang.String rs_sequence_observed,
           java.lang.String rs_sequence_seq3) {
           this.rs_sequence_exemplarSs = rs_sequence_exemplarSs;
           this.rs_sequence_seq5 = rs_sequence_seq5;
           this.rs_sequence_observed = rs_sequence_observed;
           this.rs_sequence_seq3 = rs_sequence_seq3;
    }


    /**
     * Gets the rs_sequence_exemplarSs value for this Rs_sequenceType.
     * 
     * @return rs_sequence_exemplarSs
     */
    public java.lang.String getRs_sequence_exemplarSs() {
        return rs_sequence_exemplarSs;
    }


    /**
     * Sets the rs_sequence_exemplarSs value for this Rs_sequenceType.
     * 
     * @param rs_sequence_exemplarSs
     */
    public void setRs_sequence_exemplarSs(java.lang.String rs_sequence_exemplarSs) {
        this.rs_sequence_exemplarSs = rs_sequence_exemplarSs;
    }


    /**
     * Gets the rs_sequence_seq5 value for this Rs_sequenceType.
     * 
     * @return rs_sequence_seq5
     */
    public java.lang.String getRs_sequence_seq5() {
        return rs_sequence_seq5;
    }


    /**
     * Sets the rs_sequence_seq5 value for this Rs_sequenceType.
     * 
     * @param rs_sequence_seq5
     */
    public void setRs_sequence_seq5(java.lang.String rs_sequence_seq5) {
        this.rs_sequence_seq5 = rs_sequence_seq5;
    }


    /**
     * Gets the rs_sequence_observed value for this Rs_sequenceType.
     * 
     * @return rs_sequence_observed
     */
    public java.lang.String getRs_sequence_observed() {
        return rs_sequence_observed;
    }


    /**
     * Sets the rs_sequence_observed value for this Rs_sequenceType.
     * 
     * @param rs_sequence_observed
     */
    public void setRs_sequence_observed(java.lang.String rs_sequence_observed) {
        this.rs_sequence_observed = rs_sequence_observed;
    }


    /**
     * Gets the rs_sequence_seq3 value for this Rs_sequenceType.
     * 
     * @return rs_sequence_seq3
     */
    public java.lang.String getRs_sequence_seq3() {
        return rs_sequence_seq3;
    }


    /**
     * Sets the rs_sequence_seq3 value for this Rs_sequenceType.
     * 
     * @param rs_sequence_seq3
     */
    public void setRs_sequence_seq3(java.lang.String rs_sequence_seq3) {
        this.rs_sequence_seq3 = rs_sequence_seq3;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Rs_sequenceType)) return false;
        Rs_sequenceType other = (Rs_sequenceType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.rs_sequence_exemplarSs==null && other.getRs_sequence_exemplarSs()==null) || 
             (this.rs_sequence_exemplarSs!=null &&
              this.rs_sequence_exemplarSs.equals(other.getRs_sequence_exemplarSs()))) &&
            ((this.rs_sequence_seq5==null && other.getRs_sequence_seq5()==null) || 
             (this.rs_sequence_seq5!=null &&
              this.rs_sequence_seq5.equals(other.getRs_sequence_seq5()))) &&
            ((this.rs_sequence_observed==null && other.getRs_sequence_observed()==null) || 
             (this.rs_sequence_observed!=null &&
              this.rs_sequence_observed.equals(other.getRs_sequence_observed()))) &&
            ((this.rs_sequence_seq3==null && other.getRs_sequence_seq3()==null) || 
             (this.rs_sequence_seq3!=null &&
              this.rs_sequence_seq3.equals(other.getRs_sequence_seq3())));
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
        if (getRs_sequence_exemplarSs() != null) {
            _hashCode += getRs_sequence_exemplarSs().hashCode();
        }
        if (getRs_sequence_seq5() != null) {
            _hashCode += getRs_sequence_seq5().hashCode();
        }
        if (getRs_sequence_observed() != null) {
            _hashCode += getRs_sequence_observed().hashCode();
        }
        if (getRs_sequence_seq3() != null) {
            _hashCode += getRs_sequence_seq3().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Rs_sequenceType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Rs_sequenceType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rs_sequence_exemplarSs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Rs_sequence_exemplarSs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rs_sequence_seq5");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Rs_sequence_seq5"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rs_sequence_observed");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Rs_sequence_observed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rs_sequence_seq3");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Rs_sequence_seq3"));
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
