/**
 * NumRefType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class NumRefType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.NumRef_typeType numRef_type;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.NumRef_alignsType numRef_aligns;

    public NumRefType() {
    }

    public NumRefType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.NumRef_typeType numRef_type,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.NumRef_alignsType numRef_aligns) {
           this.numRef_type = numRef_type;
           this.numRef_aligns = numRef_aligns;
    }


    /**
     * Gets the numRef_type value for this NumRefType.
     * 
     * @return numRef_type
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.NumRef_typeType getNumRef_type() {
        return numRef_type;
    }


    /**
     * Sets the numRef_type value for this NumRefType.
     * 
     * @param numRef_type
     */
    public void setNumRef_type(gov.nih.nlm.ncbi.www.soap.eutils.efetch.NumRef_typeType numRef_type) {
        this.numRef_type = numRef_type;
    }


    /**
     * Gets the numRef_aligns value for this NumRefType.
     * 
     * @return numRef_aligns
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.NumRef_alignsType getNumRef_aligns() {
        return numRef_aligns;
    }


    /**
     * Sets the numRef_aligns value for this NumRefType.
     * 
     * @param numRef_aligns
     */
    public void setNumRef_aligns(gov.nih.nlm.ncbi.www.soap.eutils.efetch.NumRef_alignsType numRef_aligns) {
        this.numRef_aligns = numRef_aligns;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NumRefType)) return false;
        NumRefType other = (NumRefType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.numRef_type==null && other.getNumRef_type()==null) || 
             (this.numRef_type!=null &&
              this.numRef_type.equals(other.getNumRef_type()))) &&
            ((this.numRef_aligns==null && other.getNumRef_aligns()==null) || 
             (this.numRef_aligns!=null &&
              this.numRef_aligns.equals(other.getNumRef_aligns())));
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
        if (getNumRef_type() != null) {
            _hashCode += getNumRef_type().hashCode();
        }
        if (getNumRef_aligns() != null) {
            _hashCode += getNumRef_aligns().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NumRefType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Num-refType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numRef_type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Num-ref_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Num-ref_typeType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numRef_aligns");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Num-ref_aligns"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Num-ref_alignsType"));
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
