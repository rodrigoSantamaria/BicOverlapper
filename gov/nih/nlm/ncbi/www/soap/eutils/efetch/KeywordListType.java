/**
 * KeywordListType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class KeywordListType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.KeywordType[] keyword;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.KeywordListTypeOwner owner;  // attribute

    public KeywordListType() {
    }

    public KeywordListType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.KeywordType[] keyword,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.KeywordListTypeOwner owner) {
           this.keyword = keyword;
           this.owner = owner;
    }


    /**
     * Gets the keyword value for this KeywordListType.
     * 
     * @return keyword
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.KeywordType[] getKeyword() {
        return keyword;
    }


    /**
     * Sets the keyword value for this KeywordListType.
     * 
     * @param keyword
     */
    public void setKeyword(gov.nih.nlm.ncbi.www.soap.eutils.efetch.KeywordType[] keyword) {
        this.keyword = keyword;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.KeywordType getKeyword(int i) {
        return this.keyword[i];
    }

    public void setKeyword(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.KeywordType _value) {
        this.keyword[i] = _value;
    }


    /**
     * Gets the owner value for this KeywordListType.
     * 
     * @return owner
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.KeywordListTypeOwner getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this KeywordListType.
     * 
     * @param owner
     */
    public void setOwner(gov.nih.nlm.ncbi.www.soap.eutils.efetch.KeywordListTypeOwner owner) {
        this.owner = owner;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof KeywordListType)) return false;
        KeywordListType other = (KeywordListType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.keyword==null && other.getKeyword()==null) || 
             (this.keyword!=null &&
              java.util.Arrays.equals(this.keyword, other.getKeyword()))) &&
            ((this.owner==null && other.getOwner()==null) || 
             (this.owner!=null &&
              this.owner.equals(other.getOwner())));
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
        if (getKeyword() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getKeyword());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getKeyword(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOwner() != null) {
            _hashCode += getOwner().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(KeywordListType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "KeywordListType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("owner");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Owner"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">KeywordListType>Owner"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keyword");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Keyword"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "KeywordType"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
