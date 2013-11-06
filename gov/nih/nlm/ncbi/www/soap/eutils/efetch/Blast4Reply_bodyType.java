/**
 * Blast4Reply_bodyType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Blast4Reply_bodyType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4ReplyBodyType blast4ReplyBody;

    public Blast4Reply_bodyType() {
    }

    public Blast4Reply_bodyType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4ReplyBodyType blast4ReplyBody) {
           this.blast4ReplyBody = blast4ReplyBody;
    }


    /**
     * Gets the blast4ReplyBody value for this Blast4Reply_bodyType.
     * 
     * @return blast4ReplyBody
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4ReplyBodyType getBlast4ReplyBody() {
        return blast4ReplyBody;
    }


    /**
     * Sets the blast4ReplyBody value for this Blast4Reply_bodyType.
     * 
     * @param blast4ReplyBody
     */
    public void setBlast4ReplyBody(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4ReplyBodyType blast4ReplyBody) {
        this.blast4ReplyBody = blast4ReplyBody;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Blast4Reply_bodyType)) return false;
        Blast4Reply_bodyType other = (Blast4Reply_bodyType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.blast4ReplyBody==null && other.getBlast4ReplyBody()==null) || 
             (this.blast4ReplyBody!=null &&
              this.blast4ReplyBody.equals(other.getBlast4ReplyBody())));
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
        if (getBlast4ReplyBody() != null) {
            _hashCode += getBlast4ReplyBody().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Blast4Reply_bodyType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-reply_bodyType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blast4ReplyBody");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-reply-body"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-reply-bodyType"));
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
