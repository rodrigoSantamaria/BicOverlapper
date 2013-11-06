/**
 * Blast4ReplyBody_getDatabasesType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Blast4ReplyBody_getDatabasesType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4GetDatabasesReplyType blast4GetDatabasesReply;

    public Blast4ReplyBody_getDatabasesType() {
    }

    public Blast4ReplyBody_getDatabasesType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4GetDatabasesReplyType blast4GetDatabasesReply) {
           this.blast4GetDatabasesReply = blast4GetDatabasesReply;
    }


    /**
     * Gets the blast4GetDatabasesReply value for this Blast4ReplyBody_getDatabasesType.
     * 
     * @return blast4GetDatabasesReply
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4GetDatabasesReplyType getBlast4GetDatabasesReply() {
        return blast4GetDatabasesReply;
    }


    /**
     * Sets the blast4GetDatabasesReply value for this Blast4ReplyBody_getDatabasesType.
     * 
     * @param blast4GetDatabasesReply
     */
    public void setBlast4GetDatabasesReply(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4GetDatabasesReplyType blast4GetDatabasesReply) {
        this.blast4GetDatabasesReply = blast4GetDatabasesReply;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Blast4ReplyBody_getDatabasesType)) return false;
        Blast4ReplyBody_getDatabasesType other = (Blast4ReplyBody_getDatabasesType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.blast4GetDatabasesReply==null && other.getBlast4GetDatabasesReply()==null) || 
             (this.blast4GetDatabasesReply!=null &&
              this.blast4GetDatabasesReply.equals(other.getBlast4GetDatabasesReply())));
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
        if (getBlast4GetDatabasesReply() != null) {
            _hashCode += getBlast4GetDatabasesReply().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Blast4ReplyBody_getDatabasesType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-reply-body_get-databasesType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blast4GetDatabasesReply");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-get-databases-reply"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-get-databases-replyType"));
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
