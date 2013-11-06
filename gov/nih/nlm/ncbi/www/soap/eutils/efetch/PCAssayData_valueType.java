/**
 * PCAssayData_valueType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class PCAssayData_valueType  implements java.io.Serializable {
    private java.lang.String PCAssayData_value_ival;

    private java.lang.String PCAssayData_value_fval;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCAssayData_value_bvalType PCAssayData_value_bval;

    private java.lang.String PCAssayData_value_sval;

    public PCAssayData_valueType() {
    }

    public PCAssayData_valueType(
           java.lang.String PCAssayData_value_ival,
           java.lang.String PCAssayData_value_fval,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCAssayData_value_bvalType PCAssayData_value_bval,
           java.lang.String PCAssayData_value_sval) {
           this.PCAssayData_value_ival = PCAssayData_value_ival;
           this.PCAssayData_value_fval = PCAssayData_value_fval;
           this.PCAssayData_value_bval = PCAssayData_value_bval;
           this.PCAssayData_value_sval = PCAssayData_value_sval;
    }


    /**
     * Gets the PCAssayData_value_ival value for this PCAssayData_valueType.
     * 
     * @return PCAssayData_value_ival
     */
    public java.lang.String getPCAssayData_value_ival() {
        return PCAssayData_value_ival;
    }


    /**
     * Sets the PCAssayData_value_ival value for this PCAssayData_valueType.
     * 
     * @param PCAssayData_value_ival
     */
    public void setPCAssayData_value_ival(java.lang.String PCAssayData_value_ival) {
        this.PCAssayData_value_ival = PCAssayData_value_ival;
    }


    /**
     * Gets the PCAssayData_value_fval value for this PCAssayData_valueType.
     * 
     * @return PCAssayData_value_fval
     */
    public java.lang.String getPCAssayData_value_fval() {
        return PCAssayData_value_fval;
    }


    /**
     * Sets the PCAssayData_value_fval value for this PCAssayData_valueType.
     * 
     * @param PCAssayData_value_fval
     */
    public void setPCAssayData_value_fval(java.lang.String PCAssayData_value_fval) {
        this.PCAssayData_value_fval = PCAssayData_value_fval;
    }


    /**
     * Gets the PCAssayData_value_bval value for this PCAssayData_valueType.
     * 
     * @return PCAssayData_value_bval
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCAssayData_value_bvalType getPCAssayData_value_bval() {
        return PCAssayData_value_bval;
    }


    /**
     * Sets the PCAssayData_value_bval value for this PCAssayData_valueType.
     * 
     * @param PCAssayData_value_bval
     */
    public void setPCAssayData_value_bval(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCAssayData_value_bvalType PCAssayData_value_bval) {
        this.PCAssayData_value_bval = PCAssayData_value_bval;
    }


    /**
     * Gets the PCAssayData_value_sval value for this PCAssayData_valueType.
     * 
     * @return PCAssayData_value_sval
     */
    public java.lang.String getPCAssayData_value_sval() {
        return PCAssayData_value_sval;
    }


    /**
     * Sets the PCAssayData_value_sval value for this PCAssayData_valueType.
     * 
     * @param PCAssayData_value_sval
     */
    public void setPCAssayData_value_sval(java.lang.String PCAssayData_value_sval) {
        this.PCAssayData_value_sval = PCAssayData_value_sval;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PCAssayData_valueType)) return false;
        PCAssayData_valueType other = (PCAssayData_valueType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.PCAssayData_value_ival==null && other.getPCAssayData_value_ival()==null) || 
             (this.PCAssayData_value_ival!=null &&
              this.PCAssayData_value_ival.equals(other.getPCAssayData_value_ival()))) &&
            ((this.PCAssayData_value_fval==null && other.getPCAssayData_value_fval()==null) || 
             (this.PCAssayData_value_fval!=null &&
              this.PCAssayData_value_fval.equals(other.getPCAssayData_value_fval()))) &&
            ((this.PCAssayData_value_bval==null && other.getPCAssayData_value_bval()==null) || 
             (this.PCAssayData_value_bval!=null &&
              this.PCAssayData_value_bval.equals(other.getPCAssayData_value_bval()))) &&
            ((this.PCAssayData_value_sval==null && other.getPCAssayData_value_sval()==null) || 
             (this.PCAssayData_value_sval!=null &&
              this.PCAssayData_value_sval.equals(other.getPCAssayData_value_sval())));
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
        if (getPCAssayData_value_ival() != null) {
            _hashCode += getPCAssayData_value_ival().hashCode();
        }
        if (getPCAssayData_value_fval() != null) {
            _hashCode += getPCAssayData_value_fval().hashCode();
        }
        if (getPCAssayData_value_bval() != null) {
            _hashCode += getPCAssayData_value_bval().hashCode();
        }
        if (getPCAssayData_value_sval() != null) {
            _hashCode += getPCAssayData_value_sval().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PCAssayData_valueType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-AssayData_valueType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCAssayData_value_ival");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-AssayData_value_ival"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCAssayData_value_fval");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-AssayData_value_fval"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCAssayData_value_bval");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-AssayData_value_bval"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-AssayData_value_bvalType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCAssayData_value_sval");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-AssayData_value_sval"));
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
