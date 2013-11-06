/**
 * Ss_sequenceType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Ss_sequenceType  implements java.io.Serializable {
    private java.lang.String ss_sequence_seq5;

    private java.lang.String ss_sequence_observed;

    private java.lang.String ss_sequence_seq3;

    public Ss_sequenceType() {
    }

    public Ss_sequenceType(
           java.lang.String ss_sequence_seq5,
           java.lang.String ss_sequence_observed,
           java.lang.String ss_sequence_seq3) {
           this.ss_sequence_seq5 = ss_sequence_seq5;
           this.ss_sequence_observed = ss_sequence_observed;
           this.ss_sequence_seq3 = ss_sequence_seq3;
    }


    /**
     * Gets the ss_sequence_seq5 value for this Ss_sequenceType.
     * 
     * @return ss_sequence_seq5
     */
    public java.lang.String getSs_sequence_seq5() {
        return ss_sequence_seq5;
    }


    /**
     * Sets the ss_sequence_seq5 value for this Ss_sequenceType.
     * 
     * @param ss_sequence_seq5
     */
    public void setSs_sequence_seq5(java.lang.String ss_sequence_seq5) {
        this.ss_sequence_seq5 = ss_sequence_seq5;
    }


    /**
     * Gets the ss_sequence_observed value for this Ss_sequenceType.
     * 
     * @return ss_sequence_observed
     */
    public java.lang.String getSs_sequence_observed() {
        return ss_sequence_observed;
    }


    /**
     * Sets the ss_sequence_observed value for this Ss_sequenceType.
     * 
     * @param ss_sequence_observed
     */
    public void setSs_sequence_observed(java.lang.String ss_sequence_observed) {
        this.ss_sequence_observed = ss_sequence_observed;
    }


    /**
     * Gets the ss_sequence_seq3 value for this Ss_sequenceType.
     * 
     * @return ss_sequence_seq3
     */
    public java.lang.String getSs_sequence_seq3() {
        return ss_sequence_seq3;
    }


    /**
     * Sets the ss_sequence_seq3 value for this Ss_sequenceType.
     * 
     * @param ss_sequence_seq3
     */
    public void setSs_sequence_seq3(java.lang.String ss_sequence_seq3) {
        this.ss_sequence_seq3 = ss_sequence_seq3;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Ss_sequenceType)) return false;
        Ss_sequenceType other = (Ss_sequenceType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ss_sequence_seq5==null && other.getSs_sequence_seq5()==null) || 
             (this.ss_sequence_seq5!=null &&
              this.ss_sequence_seq5.equals(other.getSs_sequence_seq5()))) &&
            ((this.ss_sequence_observed==null && other.getSs_sequence_observed()==null) || 
             (this.ss_sequence_observed!=null &&
              this.ss_sequence_observed.equals(other.getSs_sequence_observed()))) &&
            ((this.ss_sequence_seq3==null && other.getSs_sequence_seq3()==null) || 
             (this.ss_sequence_seq3!=null &&
              this.ss_sequence_seq3.equals(other.getSs_sequence_seq3())));
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
        if (getSs_sequence_seq5() != null) {
            _hashCode += getSs_sequence_seq5().hashCode();
        }
        if (getSs_sequence_observed() != null) {
            _hashCode += getSs_sequence_observed().hashCode();
        }
        if (getSs_sequence_seq3() != null) {
            _hashCode += getSs_sequence_seq3().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Ss_sequenceType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Ss_sequenceType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ss_sequence_seq5");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Ss_sequence_seq5"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ss_sequence_observed");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Ss_sequence_observed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ss_sequence_seq3");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Ss_sequence_seq3"));
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
