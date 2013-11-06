/**
 * AuthList_names_stdType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class AuthList_names_stdType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.AuthorType[] author;

    public AuthList_names_stdType() {
    }

    public AuthList_names_stdType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.AuthorType[] author) {
           this.author = author;
    }


    /**
     * Gets the author value for this AuthList_names_stdType.
     * 
     * @return author
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.AuthorType[] getAuthor() {
        return author;
    }


    /**
     * Sets the author value for this AuthList_names_stdType.
     * 
     * @param author
     */
    public void setAuthor(gov.nih.nlm.ncbi.www.soap.eutils.efetch.AuthorType[] author) {
        this.author = author;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.AuthorType getAuthor(int i) {
        return this.author[i];
    }

    public void setAuthor(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.AuthorType _value) {
        this.author[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AuthList_names_stdType)) return false;
        AuthList_names_stdType other = (AuthList_names_stdType) obj;
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
              java.util.Arrays.equals(this.author, other.getAuthor())));
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AuthList_names_stdType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Auth-list_names_stdType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("author");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Author"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "AuthorType"));
        elemField.setMinOccurs(0);
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
