/**
 * TextseqIdType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class TextseqIdType  implements java.io.Serializable {
    private java.lang.String textseqId_name;

    private java.lang.String textseqId_accession;

    private java.lang.String textseqId_release;

    private java.lang.String textseqId_version;

    public TextseqIdType() {
    }

    public TextseqIdType(
           java.lang.String textseqId_name,
           java.lang.String textseqId_accession,
           java.lang.String textseqId_release,
           java.lang.String textseqId_version) {
           this.textseqId_name = textseqId_name;
           this.textseqId_accession = textseqId_accession;
           this.textseqId_release = textseqId_release;
           this.textseqId_version = textseqId_version;
    }


    /**
     * Gets the textseqId_name value for this TextseqIdType.
     * 
     * @return textseqId_name
     */
    public java.lang.String getTextseqId_name() {
        return textseqId_name;
    }


    /**
     * Sets the textseqId_name value for this TextseqIdType.
     * 
     * @param textseqId_name
     */
    public void setTextseqId_name(java.lang.String textseqId_name) {
        this.textseqId_name = textseqId_name;
    }


    /**
     * Gets the textseqId_accession value for this TextseqIdType.
     * 
     * @return textseqId_accession
     */
    public java.lang.String getTextseqId_accession() {
        return textseqId_accession;
    }


    /**
     * Sets the textseqId_accession value for this TextseqIdType.
     * 
     * @param textseqId_accession
     */
    public void setTextseqId_accession(java.lang.String textseqId_accession) {
        this.textseqId_accession = textseqId_accession;
    }


    /**
     * Gets the textseqId_release value for this TextseqIdType.
     * 
     * @return textseqId_release
     */
    public java.lang.String getTextseqId_release() {
        return textseqId_release;
    }


    /**
     * Sets the textseqId_release value for this TextseqIdType.
     * 
     * @param textseqId_release
     */
    public void setTextseqId_release(java.lang.String textseqId_release) {
        this.textseqId_release = textseqId_release;
    }


    /**
     * Gets the textseqId_version value for this TextseqIdType.
     * 
     * @return textseqId_version
     */
    public java.lang.String getTextseqId_version() {
        return textseqId_version;
    }


    /**
     * Sets the textseqId_version value for this TextseqIdType.
     * 
     * @param textseqId_version
     */
    public void setTextseqId_version(java.lang.String textseqId_version) {
        this.textseqId_version = textseqId_version;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TextseqIdType)) return false;
        TextseqIdType other = (TextseqIdType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.textseqId_name==null && other.getTextseqId_name()==null) || 
             (this.textseqId_name!=null &&
              this.textseqId_name.equals(other.getTextseqId_name()))) &&
            ((this.textseqId_accession==null && other.getTextseqId_accession()==null) || 
             (this.textseqId_accession!=null &&
              this.textseqId_accession.equals(other.getTextseqId_accession()))) &&
            ((this.textseqId_release==null && other.getTextseqId_release()==null) || 
             (this.textseqId_release!=null &&
              this.textseqId_release.equals(other.getTextseqId_release()))) &&
            ((this.textseqId_version==null && other.getTextseqId_version()==null) || 
             (this.textseqId_version!=null &&
              this.textseqId_version.equals(other.getTextseqId_version())));
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
        if (getTextseqId_name() != null) {
            _hashCode += getTextseqId_name().hashCode();
        }
        if (getTextseqId_accession() != null) {
            _hashCode += getTextseqId_accession().hashCode();
        }
        if (getTextseqId_release() != null) {
            _hashCode += getTextseqId_release().hashCode();
        }
        if (getTextseqId_version() != null) {
            _hashCode += getTextseqId_version().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TextseqIdType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Textseq-idType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("textseqId_name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Textseq-id_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("textseqId_accession");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Textseq-id_accession"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("textseqId_release");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Textseq-id_release"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("textseqId_version");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Textseq-id_version"));
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
