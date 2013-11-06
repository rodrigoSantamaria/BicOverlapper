/**
 * Entrez2LinkCount_linkTypeType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Entrez2LinkCount_linkTypeType  implements java.io.Serializable {
    private java.lang.String entrez2LinkId;

    public Entrez2LinkCount_linkTypeType() {
    }

    public Entrez2LinkCount_linkTypeType(
           java.lang.String entrez2LinkId) {
           this.entrez2LinkId = entrez2LinkId;
    }


    /**
     * Gets the entrez2LinkId value for this Entrez2LinkCount_linkTypeType.
     * 
     * @return entrez2LinkId
     */
    public java.lang.String getEntrez2LinkId() {
        return entrez2LinkId;
    }


    /**
     * Sets the entrez2LinkId value for this Entrez2LinkCount_linkTypeType.
     * 
     * @param entrez2LinkId
     */
    public void setEntrez2LinkId(java.lang.String entrez2LinkId) {
        this.entrez2LinkId = entrez2LinkId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Entrez2LinkCount_linkTypeType)) return false;
        Entrez2LinkCount_linkTypeType other = (Entrez2LinkCount_linkTypeType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.entrez2LinkId==null && other.getEntrez2LinkId()==null) || 
             (this.entrez2LinkId!=null &&
              this.entrez2LinkId.equals(other.getEntrez2LinkId())));
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
        if (getEntrez2LinkId() != null) {
            _hashCode += getEntrez2LinkId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Entrez2LinkCount_linkTypeType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-link-count_link-typeType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entrez2LinkId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-link-id"));
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
