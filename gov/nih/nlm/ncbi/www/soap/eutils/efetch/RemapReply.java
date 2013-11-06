/**
 * RemapReply.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class RemapReply  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.RemapReply_replyType remapReply_reply;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.RemapReply_dtType remapReply_dt;

    private java.lang.String remapReply_server;

    private java.lang.String remapReply_msg;

    public RemapReply() {
    }

    public RemapReply(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.RemapReply_replyType remapReply_reply,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.RemapReply_dtType remapReply_dt,
           java.lang.String remapReply_server,
           java.lang.String remapReply_msg) {
           this.remapReply_reply = remapReply_reply;
           this.remapReply_dt = remapReply_dt;
           this.remapReply_server = remapReply_server;
           this.remapReply_msg = remapReply_msg;
    }


    /**
     * Gets the remapReply_reply value for this RemapReply.
     * 
     * @return remapReply_reply
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.RemapReply_replyType getRemapReply_reply() {
        return remapReply_reply;
    }


    /**
     * Sets the remapReply_reply value for this RemapReply.
     * 
     * @param remapReply_reply
     */
    public void setRemapReply_reply(gov.nih.nlm.ncbi.www.soap.eutils.efetch.RemapReply_replyType remapReply_reply) {
        this.remapReply_reply = remapReply_reply;
    }


    /**
     * Gets the remapReply_dt value for this RemapReply.
     * 
     * @return remapReply_dt
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.RemapReply_dtType getRemapReply_dt() {
        return remapReply_dt;
    }


    /**
     * Sets the remapReply_dt value for this RemapReply.
     * 
     * @param remapReply_dt
     */
    public void setRemapReply_dt(gov.nih.nlm.ncbi.www.soap.eutils.efetch.RemapReply_dtType remapReply_dt) {
        this.remapReply_dt = remapReply_dt;
    }


    /**
     * Gets the remapReply_server value for this RemapReply.
     * 
     * @return remapReply_server
     */
    public java.lang.String getRemapReply_server() {
        return remapReply_server;
    }


    /**
     * Sets the remapReply_server value for this RemapReply.
     * 
     * @param remapReply_server
     */
    public void setRemapReply_server(java.lang.String remapReply_server) {
        this.remapReply_server = remapReply_server;
    }


    /**
     * Gets the remapReply_msg value for this RemapReply.
     * 
     * @return remapReply_msg
     */
    public java.lang.String getRemapReply_msg() {
        return remapReply_msg;
    }


    /**
     * Sets the remapReply_msg value for this RemapReply.
     * 
     * @param remapReply_msg
     */
    public void setRemapReply_msg(java.lang.String remapReply_msg) {
        this.remapReply_msg = remapReply_msg;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RemapReply)) return false;
        RemapReply other = (RemapReply) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.remapReply_reply==null && other.getRemapReply_reply()==null) || 
             (this.remapReply_reply!=null &&
              this.remapReply_reply.equals(other.getRemapReply_reply()))) &&
            ((this.remapReply_dt==null && other.getRemapReply_dt()==null) || 
             (this.remapReply_dt!=null &&
              this.remapReply_dt.equals(other.getRemapReply_dt()))) &&
            ((this.remapReply_server==null && other.getRemapReply_server()==null) || 
             (this.remapReply_server!=null &&
              this.remapReply_server.equals(other.getRemapReply_server()))) &&
            ((this.remapReply_msg==null && other.getRemapReply_msg()==null) || 
             (this.remapReply_msg!=null &&
              this.remapReply_msg.equals(other.getRemapReply_msg())));
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
        if (getRemapReply_reply() != null) {
            _hashCode += getRemapReply_reply().hashCode();
        }
        if (getRemapReply_dt() != null) {
            _hashCode += getRemapReply_dt().hashCode();
        }
        if (getRemapReply_server() != null) {
            _hashCode += getRemapReply_server().hashCode();
        }
        if (getRemapReply_msg() != null) {
            _hashCode += getRemapReply_msg().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RemapReply.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">Remap-reply"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remapReply_reply");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Remap-reply_reply"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Remap-reply_replyType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remapReply_dt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Remap-reply_dt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Remap-reply_dtType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remapReply_server");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Remap-reply_server"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remapReply_msg");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Remap-reply_msg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
