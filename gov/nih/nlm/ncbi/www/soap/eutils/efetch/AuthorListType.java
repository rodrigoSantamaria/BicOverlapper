/**
 * AuthorListType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class AuthorListType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.AuthorType_nlmc[] author;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.AuthorListTypeCompleteYN completeYN;  // attribute

    public AuthorListType() {
    }

    public AuthorListType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.AuthorType_nlmc[] author,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.AuthorListTypeCompleteYN completeYN) {
           this.author = author;
           this.completeYN = completeYN;
    }


    /**
     * Gets the author value for this AuthorListType.
     * 
     * @return author
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.AuthorType_nlmc[] getAuthor() {
        return author;
    }


    /**
     * Sets the author value for this AuthorListType.
     * 
     * @param author
     */
    public void setAuthor(gov.nih.nlm.ncbi.www.soap.eutils.efetch.AuthorType_nlmc[] author) {
        this.author = author;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.AuthorType_nlmc getAuthor(int i) {
        return this.author[i];
    }

    public void setAuthor(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.AuthorType_nlmc _value) {
        this.author[i] = _value;
    }


    /**
     * Gets the completeYN value for this AuthorListType.
     * 
     * @return completeYN
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.AuthorListTypeCompleteYN getCompleteYN() {
        return completeYN;
    }


    /**
     * Sets the completeYN value for this AuthorListType.
     * 
     * @param completeYN
     */
    public void setCompleteYN(gov.nih.nlm.ncbi.www.soap.eutils.efetch.AuthorListTypeCompleteYN completeYN) {
        this.completeYN = completeYN;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AuthorListType)) return false;
        AuthorListType other = (AuthorListType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.author==null && other.getAuthor()==null) || 
             (this.author!=null &&
              java.util.Arrays.equals(this.author, other.getAuthor()))) &&
            ((this.completeYN==null && other.getCompleteYN()==null) || 
             (this.completeYN!=null &&
              this.completeYN.equals(other.getCompleteYN())));
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
        if (getAuthor() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAuthor());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAuthor(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCompleteYN() != null) {
            _hashCode += getCompleteYN().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AuthorListType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "AuthorListType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("completeYN");
        attrField.setXmlName(new javax.xml.namespace.QName("", "CompleteYN"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">AuthorListType>CompleteYN"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("author");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Author"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "AuthorType_nlmc"));
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
