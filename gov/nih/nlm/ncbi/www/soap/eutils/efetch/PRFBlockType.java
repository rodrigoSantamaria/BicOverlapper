/**
 * PRFBlockType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class PRFBlockType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PRFBlock_extraSrcType PRFBlock_extraSrc;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PRFBlock_keywordsType PRFBlock_keywords;

    public PRFBlockType() {
    }

    public PRFBlockType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PRFBlock_extraSrcType PRFBlock_extraSrc,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PRFBlock_keywordsType PRFBlock_keywords) {
           this.PRFBlock_extraSrc = PRFBlock_extraSrc;
           this.PRFBlock_keywords = PRFBlock_keywords;
    }


    /**
     * Gets the PRFBlock_extraSrc value for this PRFBlockType.
     * 
     * @return PRFBlock_extraSrc
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PRFBlock_extraSrcType getPRFBlock_extraSrc() {
        return PRFBlock_extraSrc;
    }


    /**
     * Sets the PRFBlock_extraSrc value for this PRFBlockType.
     * 
     * @param PRFBlock_extraSrc
     */
    public void setPRFBlock_extraSrc(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PRFBlock_extraSrcType PRFBlock_extraSrc) {
        this.PRFBlock_extraSrc = PRFBlock_extraSrc;
    }


    /**
     * Gets the PRFBlock_keywords value for this PRFBlockType.
     * 
     * @return PRFBlock_keywords
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PRFBlock_keywordsType getPRFBlock_keywords() {
        return PRFBlock_keywords;
    }


    /**
     * Sets the PRFBlock_keywords value for this PRFBlockType.
     * 
     * @param PRFBlock_keywords
     */
    public void setPRFBlock_keywords(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PRFBlock_keywordsType PRFBlock_keywords) {
        this.PRFBlock_keywords = PRFBlock_keywords;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PRFBlockType)) return false;
        PRFBlockType other = (PRFBlockType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.PRFBlock_extraSrc==null && other.getPRFBlock_extraSrc()==null) || 
             (this.PRFBlock_extraSrc!=null &&
              this.PRFBlock_extraSrc.equals(other.getPRFBlock_extraSrc()))) &&
            ((this.PRFBlock_keywords==null && other.getPRFBlock_keywords()==null) || 
             (this.PRFBlock_keywords!=null &&
              this.PRFBlock_keywords.equals(other.getPRFBlock_keywords())));
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
        if (getPRFBlock_extraSrc() != null) {
            _hashCode += getPRFBlock_extraSrc().hashCode();
        }
        if (getPRFBlock_keywords() != null) {
            _hashCode += getPRFBlock_keywords().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PRFBlockType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PRF-blockType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PRFBlock_extraSrc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PRF-block_extra-src"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PRF-block_extra-srcType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PRFBlock_keywords");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PRF-block_keywords"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PRF-block_keywordsType"));
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
