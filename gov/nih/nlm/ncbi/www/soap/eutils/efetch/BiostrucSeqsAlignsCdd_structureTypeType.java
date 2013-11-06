/**
 * BiostrucSeqsAlignsCdd_structureTypeType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class BiostrucSeqsAlignsCdd_structureTypeType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucSeqsAlignsCdd_structureTypeTypeValue value;  // attribute

    public BiostrucSeqsAlignsCdd_structureTypeType() {
    }

    public BiostrucSeqsAlignsCdd_structureTypeType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucSeqsAlignsCdd_structureTypeTypeValue value) {
           this.value = value;
    }


    /**
     * Gets the value value for this BiostrucSeqsAlignsCdd_structureTypeType.
     * 
     * @return value
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucSeqsAlignsCdd_structureTypeTypeValue getValue() {
        return value;
    }


    /**
     * Sets the value value for this BiostrucSeqsAlignsCdd_structureTypeType.
     * 
     * @param value
     */
    public void setValue(gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucSeqsAlignsCdd_structureTypeTypeValue value) {
        this.value = value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BiostrucSeqsAlignsCdd_structureTypeType)) return false;
        BiostrucSeqsAlignsCdd_structureTypeType other = (BiostrucSeqsAlignsCdd_structureTypeType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.value==null && other.getValue()==null) || 
             (this.value!=null &&
              this.value.equals(other.getValue())));
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
        if (getValue() != null) {
            _hashCode += getValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BiostrucSeqsAlignsCdd_structureTypeType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-seqs-aligns-cdd_structure-typeType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("value");
        attrField.setXmlName(new javax.xml.namespace.QName("", "value"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">Biostruc-seqs-aligns-cdd_structure-typeType>value"));
        typeDesc.addFieldDesc(attrField);
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
