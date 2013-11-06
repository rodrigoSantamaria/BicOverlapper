/**
 * Entrez2Reply.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Entrez2Reply  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2Reply_replyType entrez2Reply_reply;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2Reply_dtType entrez2Reply_dt;

    private java.lang.String entrez2Reply_server;

    private java.lang.String entrez2Reply_msg;

    private java.lang.String entrez2Reply_key;

    private java.lang.String entrez2Reply_cookie;

    public Entrez2Reply() {
    }

    public Entrez2Reply(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2Reply_replyType entrez2Reply_reply,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2Reply_dtType entrez2Reply_dt,
           java.lang.String entrez2Reply_server,
           java.lang.String entrez2Reply_msg,
           java.lang.String entrez2Reply_key,
           java.lang.String entrez2Reply_cookie) {
           this.entrez2Reply_reply = entrez2Reply_reply;
           this.entrez2Reply_dt = entrez2Reply_dt;
           this.entrez2Reply_server = entrez2Reply_server;
           this.entrez2Reply_msg = entrez2Reply_msg;
           this.entrez2Reply_key = entrez2Reply_key;
           this.entrez2Reply_cookie = entrez2Reply_cookie;
    }


    /**
     * Gets the entrez2Reply_reply value for this Entrez2Reply.
     * 
     * @return entrez2Reply_reply
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2Reply_replyType getEntrez2Reply_reply() {
        return entrez2Reply_reply;
    }


    /**
     * Sets the entrez2Reply_reply value for this Entrez2Reply.
     * 
     * @param entrez2Reply_reply
     */
    public void setEntrez2Reply_reply(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2Reply_replyType entrez2Reply_reply) {
        this.entrez2Reply_reply = entrez2Reply_reply;
    }


    /**
     * Gets the entrez2Reply_dt value for this Entrez2Reply.
     * 
     * @return entrez2Reply_dt
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2Reply_dtType getEntrez2Reply_dt() {
        return entrez2Reply_dt;
    }


    /**
     * Sets the entrez2Reply_dt value for this Entrez2Reply.
     * 
     * @param entrez2Reply_dt
     */
    public void setEntrez2Reply_dt(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2Reply_dtType entrez2Reply_dt) {
        this.entrez2Reply_dt = entrez2Reply_dt;
    }


    /**
     * Gets the entrez2Reply_server value for this Entrez2Reply.
     * 
     * @return entrez2Reply_server
     */
    public java.lang.String getEntrez2Reply_server() {
        return entrez2Reply_server;
    }


    /**
     * Sets the entrez2Reply_server value for this Entrez2Reply.
     * 
     * @param entrez2Reply_server
     */
    public void setEntrez2Reply_server(java.lang.String entrez2Reply_server) {
        this.entrez2Reply_server = entrez2Reply_server;
    }


    /**
     * Gets the entrez2Reply_msg value for this Entrez2Reply.
     * 
     * @return entrez2Reply_msg
     */
    public java.lang.String getEntrez2Reply_msg() {
        return entrez2Reply_msg;
    }


    /**
     * Sets the entrez2Reply_msg value for this Entrez2Reply.
     * 
     * @param entrez2Reply_msg
     */
    public void setEntrez2Reply_msg(java.lang.String entrez2Reply_msg) {
        this.entrez2Reply_msg = entrez2Reply_msg;
    }


    /**
     * Gets the entrez2Reply_key value for this Entrez2Reply.
     * 
     * @return entrez2Reply_key
     */
    public java.lang.String getEntrez2Reply_key() {
        return entrez2Reply_key;
    }


    /**
     * Sets the entrez2Reply_key value for this Entrez2Reply.
     * 
     * @param entrez2Reply_key
     */
    public void setEntrez2Reply_key(java.lang.String entrez2Reply_key) {
        this.entrez2Reply_key = entrez2Reply_key;
    }


    /**
     * Gets the entrez2Reply_cookie value for this Entrez2Reply.
     * 
     * @return entrez2Reply_cookie
     */
    public java.lang.String getEntrez2Reply_cookie() {
        return entrez2Reply_cookie;
    }


    /**
     * Sets the entrez2Reply_cookie value for this Entrez2Reply.
     * 
     * @param entrez2Reply_cookie
     */
    public void setEntrez2Reply_cookie(java.lang.String entrez2Reply_cookie) {
        this.entrez2Reply_cookie = entrez2Reply_cookie;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Entrez2Reply)) return false;
        Entrez2Reply other = (Entrez2Reply) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.entrez2Reply_reply==null && other.getEntrez2Reply_reply()==null) || 
             (this.entrez2Reply_reply!=null &&
              this.entrez2Reply_reply.equals(other.getEntrez2Reply_reply()))) &&
            ((this.entrez2Reply_dt==null && other.getEntrez2Reply_dt()==null) || 
             (this.entrez2Reply_dt!=null &&
              this.entrez2Reply_dt.equals(other.getEntrez2Reply_dt()))) &&
            ((this.entrez2Reply_server==null && other.getEntrez2Reply_server()==null) || 
             (this.entrez2Reply_server!=null &&
              this.entrez2Reply_server.equals(other.getEntrez2Reply_server()))) &&
            ((this.entrez2Reply_msg==null && other.getEntrez2Reply_msg()==null) || 
             (this.entrez2Reply_msg!=null &&
              this.entrez2Reply_msg.equals(other.getEntrez2Reply_msg()))) &&
            ((this.entrez2Reply_key==null && other.getEntrez2Reply_key()==null) || 
             (this.entrez2Reply_key!=null &&
              this.entrez2Reply_key.equals(other.getEntrez2Reply_key()))) &&
            ((this.entrez2Reply_cookie==null && other.getEntrez2Reply_cookie()==null) || 
             (this.entrez2Reply_cookie!=null &&
              this.entrez2Reply_cookie.equals(other.getEntrez2Reply_cookie())));
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
        if (getEntrez2Reply_reply() != null) {
            _hashCode += getEntrez2Reply_reply().hashCode();
        }
        if (getEntrez2Reply_dt() != null) {
            _hashCode += getEntrez2Reply_dt().hashCode();
        }
        if (getEntrez2Reply_server() != null) {
            _hashCode += getEntrez2Reply_server().hashCode();
        }
        if (getEntrez2Reply_msg() != null) {
            _hashCode += getEntrez2Reply_msg().hashCode();
        }
        if (getEntrez2Reply_key() != null) {
            _hashCode += getEntrez2Reply_key().hashCode();
        }
        if (getEntrez2Reply_cookie() != null) {
            _hashCode += getEntrez2Reply_cookie().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Entrez2Reply.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">Entrez2-reply"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entrez2Reply_reply");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-reply_reply"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-reply_replyType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entrez2Reply_dt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-reply_dt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-reply_dtType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entrez2Reply_server");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-reply_server"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entrez2Reply_msg");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-reply_msg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entrez2Reply_key");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-reply_key"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entrez2Reply_cookie");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-reply_cookie"));
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
