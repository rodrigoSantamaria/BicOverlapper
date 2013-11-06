/**
 * DocRefType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class DocRefType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.DocRef_typeType docRef_type;

    private java.lang.String docRef_uid;

    public DocRefType() {
    }

    public DocRefType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.DocRef_typeType docRef_type,
           java.lang.String docRef_uid) {
           this.docRef_type = docRef_type;
           this.docRef_uid = docRef_uid;
    }


    /**
     * Gets the docRef_type value for this DocRefType.
     * 
     * @return docRef_type
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.DocRef_typeType getDocRef_type() {
        return docRef_type;
    }


    /**
     * Sets the docRef_type value for this DocRefType.
     * 
     * @param docRef_type
     */
    public void setDocRef_type(gov.nih.nlm.ncbi.www.soap.eutils.efetch.DocRef_typeType docRef_type) {
        this.docRef_type = docRef_type;
    }


    /**
     * Gets the docRef_uid value for this DocRefType.
     * 
     * @return docRef_uid
     */
    public java.lang.String getDocRef_uid() {
        return docRef_uid;
    }


    /**
     * Sets the docRef_uid value for this DocRefType.
     * 
     * @param docRef_uid
     */
    public void setDocRef_uid(java.lang.String docRef_uid) {
        this.docRef_uid = docRef_uid;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DocRefType)) return false;
        DocRefType other = (DocRefType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.docRef_type==null && other.getDocRef_type()==null) || 
             (this.docRef_type!=null &&
              this.docRef_type.equals(other.getDocRef_type()))) &&
            ((this.docRef_uid==null && other.getDocRef_uid()==null) || 
             (this.docRef_uid!=null &&
              this.docRef_uid.equals(other.getDocRef_uid())));
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
        if (getDocRef_type() != null) {
            _hashCode += getDocRef_type().hashCode();
        }
        if (getDocRef_uid() != null) {
            _hashCode += getDocRef_uid().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DocRefType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "DocRefType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("docRef_type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "DocRef_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "DocRef_typeType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("docRef_uid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "DocRef_uid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
