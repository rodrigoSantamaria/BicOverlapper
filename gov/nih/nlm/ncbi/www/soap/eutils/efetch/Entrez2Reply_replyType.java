/**
 * Entrez2Reply_replyType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Entrez2Reply_replyType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.E2ReplyType e2Reply;

    public Entrez2Reply_replyType() {
    }

    public Entrez2Reply_replyType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.E2ReplyType e2Reply) {
           this.e2Reply = e2Reply;
    }


    /**
     * Gets the e2Reply value for this Entrez2Reply_replyType.
     * 
     * @return e2Reply
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.E2ReplyType getE2Reply() {
        return e2Reply;
    }


    /**
     * Sets the e2Reply value for this Entrez2Reply_replyType.
     * 
     * @param e2Reply
     */
    public void setE2Reply(gov.nih.nlm.ncbi.www.soap.eutils.efetch.E2ReplyType e2Reply) {
        this.e2Reply = e2Reply;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Entrez2Reply_replyType)) return false;
        Entrez2Reply_replyType other = (Entrez2Reply_replyType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.e2Reply==null && other.getE2Reply()==null) || 
             (this.e2Reply!=null &&
              this.e2Reply.equals(other.getE2Reply())));
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
        if (getE2Reply() != null) {
            _hashCode += getE2Reply().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Entrez2Reply_replyType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-reply_replyType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("e2Reply");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "E2Reply"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "E2ReplyType"));
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
