/**
 * E2Reply_evalBooleanType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class E2Reply_evalBooleanType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2BooleanReplyType entrez2BooleanReply;

    public E2Reply_evalBooleanType() {
    }

    public E2Reply_evalBooleanType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2BooleanReplyType entrez2BooleanReply) {
           this.entrez2BooleanReply = entrez2BooleanReply;
    }


    /**
     * Gets the entrez2BooleanReply value for this E2Reply_evalBooleanType.
     * 
     * @return entrez2BooleanReply
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2BooleanReplyType getEntrez2BooleanReply() {
        return entrez2BooleanReply;
    }


    /**
     * Sets the entrez2BooleanReply value for this E2Reply_evalBooleanType.
     * 
     * @param entrez2BooleanReply
     */
    public void setEntrez2BooleanReply(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2BooleanReplyType entrez2BooleanReply) {
        this.entrez2BooleanReply = entrez2BooleanReply;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof E2Reply_evalBooleanType)) return false;
        E2Reply_evalBooleanType other = (E2Reply_evalBooleanType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.entrez2BooleanReply==null && other.getEntrez2BooleanReply()==null) || 
             (this.entrez2BooleanReply!=null &&
              this.entrez2BooleanReply.equals(other.getEntrez2BooleanReply())));
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
        if (getEntrez2BooleanReply() != null) {
            _hashCode += getEntrez2BooleanReply().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(E2Reply_evalBooleanType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "E2Reply_eval-booleanType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entrez2BooleanReply");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-boolean-reply"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-boolean-replyType"));
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
