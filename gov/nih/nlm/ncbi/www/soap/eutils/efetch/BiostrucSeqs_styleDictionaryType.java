/**
 * BiostrucSeqs_styleDictionaryType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class BiostrucSeqs_styleDictionaryType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DStyleDictionaryType cn3DStyleDictionary;

    public BiostrucSeqs_styleDictionaryType() {
    }

    public BiostrucSeqs_styleDictionaryType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DStyleDictionaryType cn3DStyleDictionary) {
           this.cn3DStyleDictionary = cn3DStyleDictionary;
    }


    /**
     * Gets the cn3DStyleDictionary value for this BiostrucSeqs_styleDictionaryType.
     * 
     * @return cn3DStyleDictionary
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DStyleDictionaryType getCn3DStyleDictionary() {
        return cn3DStyleDictionary;
    }


    /**
     * Sets the cn3DStyleDictionary value for this BiostrucSeqs_styleDictionaryType.
     * 
     * @param cn3DStyleDictionary
     */
    public void setCn3DStyleDictionary(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DStyleDictionaryType cn3DStyleDictionary) {
        this.cn3DStyleDictionary = cn3DStyleDictionary;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BiostrucSeqs_styleDictionaryType)) return false;
        BiostrucSeqs_styleDictionaryType other = (BiostrucSeqs_styleDictionaryType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cn3DStyleDictionary==null && other.getCn3DStyleDictionary()==null) || 
             (this.cn3DStyleDictionary!=null &&
              this.cn3DStyleDictionary.equals(other.getCn3DStyleDictionary())));
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
        if (getCn3DStyleDictionary() != null) {
            _hashCode += getCn3DStyleDictionary().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BiostrucSeqs_styleDictionaryType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-seqs_style-dictionaryType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cn3DStyleDictionary");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-style-dictionary"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-style-dictionaryType"));
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
