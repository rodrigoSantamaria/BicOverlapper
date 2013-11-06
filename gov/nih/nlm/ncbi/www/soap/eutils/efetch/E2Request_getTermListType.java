/**
 * E2Request_getTermListType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class E2Request_getTermListType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2TermPosType entrez2TermPos;

    public E2Request_getTermListType() {
    }

    public E2Request_getTermListType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2TermPosType entrez2TermPos) {
           this.entrez2TermPos = entrez2TermPos;
    }


    /**
     * Gets the entrez2TermPos value for this E2Request_getTermListType.
     * 
     * @return entrez2TermPos
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2TermPosType getEntrez2TermPos() {
        return entrez2TermPos;
    }


    /**
     * Sets the entrez2TermPos value for this E2Request_getTermListType.
     * 
     * @param entrez2TermPos
     */
    public void setEntrez2TermPos(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2TermPosType entrez2TermPos) {
        this.entrez2TermPos = entrez2TermPos;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof E2Request_getTermListType)) return false;
        E2Request_getTermListType other = (E2Request_getTermListType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.entrez2TermPos==null && other.getEntrez2TermPos()==null) || 
             (this.entrez2TermPos!=null &&
              this.entrez2TermPos.equals(other.getEntrez2TermPos())));
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
        if (getEntrez2TermPos() != null) {
            _hashCode += getEntrez2TermPos().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(E2Request_getTermListType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "E2Request_get-term-listType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entrez2TermPos");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-term-pos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-term-posType"));
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
