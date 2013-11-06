/**
 * PubSet_bookType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class PubSet_bookType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.CitBookType[] citBook;

    public PubSet_bookType() {
    }

    public PubSet_bookType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.CitBookType[] citBook) {
           this.citBook = citBook;
    }


    /**
     * Gets the citBook value for this PubSet_bookType.
     * 
     * @return citBook
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.CitBookType[] getCitBook() {
        return citBook;
    }


    /**
     * Sets the citBook value for this PubSet_bookType.
     * 
     * @param citBook
     */
    public void setCitBook(gov.nih.nlm.ncbi.www.soap.eutils.efetch.CitBookType[] citBook) {
        this.citBook = citBook;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.CitBookType getCitBook(int i) {
        return this.citBook[i];
    }

    public void setCitBook(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.CitBookType _value) {
        this.citBook[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PubSet_bookType)) return false;
        PubSet_bookType other = (PubSet_bookType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.citBook==null && other.getCitBook()==null) || 
             (this.citBook!=null &&
              java.util.Arrays.equals(this.citBook, other.getCitBook())));
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
        if (getCitBook() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCitBook());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCitBook(), i);
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
        new org.apache.axis.description.TypeDesc(PubSet_bookType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Pub-set_bookType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("citBook");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cit-book"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cit-bookType"));
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
