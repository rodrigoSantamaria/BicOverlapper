/**
 * Entrez2BooleanReply_uidsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Entrez2BooleanReply_uidsType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2IdListType entrez2IdList;

    public Entrez2BooleanReply_uidsType() {
    }

    public Entrez2BooleanReply_uidsType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2IdListType entrez2IdList) {
           this.entrez2IdList = entrez2IdList;
    }


    /**
     * Gets the entrez2IdList value for this Entrez2BooleanReply_uidsType.
     * 
     * @return entrez2IdList
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2IdListType getEntrez2IdList() {
        return entrez2IdList;
    }


    /**
     * Sets the entrez2IdList value for this Entrez2BooleanReply_uidsType.
     * 
     * @param entrez2IdList
     */
    public void setEntrez2IdList(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2IdListType entrez2IdList) {
        this.entrez2IdList = entrez2IdList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Entrez2BooleanReply_uidsType)) return false;
        Entrez2BooleanReply_uidsType other = (Entrez2BooleanReply_uidsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.entrez2IdList==null && other.getEntrez2IdList()==null) || 
             (this.entrez2IdList!=null &&
              this.entrez2IdList.equals(other.getEntrez2IdList())));
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
        if (getEntrez2IdList() != null) {
            _hashCode += getEntrez2IdList().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Entrez2BooleanReply_uidsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-boolean-reply_uidsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entrez2IdList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-id-list"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-id-listType"));
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
