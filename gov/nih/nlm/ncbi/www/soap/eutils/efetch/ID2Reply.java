/**
 * ID2Reply.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ID2Reply  implements java.io.Serializable {
    private java.lang.String ID2Reply_serialNumber;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2Reply_paramsType ID2Reply_params;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2Reply_errorType ID2Reply_error;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2Reply_endOfReply ID2Reply_endOfReply;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2Reply_replyType ID2Reply_reply;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2Reply_discardType ID2Reply_discard;

    public ID2Reply() {
    }

    public ID2Reply(
           java.lang.String ID2Reply_serialNumber,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2Reply_paramsType ID2Reply_params,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2Reply_errorType ID2Reply_error,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2Reply_endOfReply ID2Reply_endOfReply,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2Reply_replyType ID2Reply_reply,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2Reply_discardType ID2Reply_discard) {
           this.ID2Reply_serialNumber = ID2Reply_serialNumber;
           this.ID2Reply_params = ID2Reply_params;
           this.ID2Reply_error = ID2Reply_error;
           this.ID2Reply_endOfReply = ID2Reply_endOfReply;
           this.ID2Reply_reply = ID2Reply_reply;
           this.ID2Reply_discard = ID2Reply_discard;
    }


    /**
     * Gets the ID2Reply_serialNumber value for this ID2Reply.
     * 
     * @return ID2Reply_serialNumber
     */
    public java.lang.String getID2Reply_serialNumber() {
        return ID2Reply_serialNumber;
    }


    /**
     * Sets the ID2Reply_serialNumber value for this ID2Reply.
     * 
     * @param ID2Reply_serialNumber
     */
    public void setID2Reply_serialNumber(java.lang.String ID2Reply_serialNumber) {
        this.ID2Reply_serialNumber = ID2Reply_serialNumber;
    }


    /**
     * Gets the ID2Reply_params value for this ID2Reply.
     * 
     * @return ID2Reply_params
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2Reply_paramsType getID2Reply_params() {
        return ID2Reply_params;
    }


    /**
     * Sets the ID2Reply_params value for this ID2Reply.
     * 
     * @param ID2Reply_params
     */
    public void setID2Reply_params(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2Reply_paramsType ID2Reply_params) {
        this.ID2Reply_params = ID2Reply_params;
    }


    /**
     * Gets the ID2Reply_error value for this ID2Reply.
     * 
     * @return ID2Reply_error
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2Reply_errorType getID2Reply_error() {
        return ID2Reply_error;
    }


    /**
     * Sets the ID2Reply_error value for this ID2Reply.
     * 
     * @param ID2Reply_error
     */
    public void setID2Reply_error(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2Reply_errorType ID2Reply_error) {
        this.ID2Reply_error = ID2Reply_error;
    }


    /**
     * Gets the ID2Reply_endOfReply value for this ID2Reply.
     * 
     * @return ID2Reply_endOfReply
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2Reply_endOfReply getID2Reply_endOfReply() {
        return ID2Reply_endOfReply;
    }


    /**
     * Sets the ID2Reply_endOfReply value for this ID2Reply.
     * 
     * @param ID2Reply_endOfReply
     */
    public void setID2Reply_endOfReply(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2Reply_endOfReply ID2Reply_endOfReply) {
        this.ID2Reply_endOfReply = ID2Reply_endOfReply;
    }


    /**
     * Gets the ID2Reply_reply value for this ID2Reply.
     * 
     * @return ID2Reply_reply
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2Reply_replyType getID2Reply_reply() {
        return ID2Reply_reply;
    }


    /**
     * Sets the ID2Reply_reply value for this ID2Reply.
     * 
     * @param ID2Reply_reply
     */
    public void setID2Reply_reply(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2Reply_replyType ID2Reply_reply) {
        this.ID2Reply_reply = ID2Reply_reply;
    }


    /**
     * Gets the ID2Reply_discard value for this ID2Reply.
     * 
     * @return ID2Reply_discard
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2Reply_discardType getID2Reply_discard() {
        return ID2Reply_discard;
    }


    /**
     * Sets the ID2Reply_discard value for this ID2Reply.
     * 
     * @param ID2Reply_discard
     */
    public void setID2Reply_discard(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2Reply_discardType ID2Reply_discard) {
        this.ID2Reply_discard = ID2Reply_discard;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ID2Reply)) return false;
        ID2Reply other = (ID2Reply) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ID2Reply_serialNumber==null && other.getID2Reply_serialNumber()==null) || 
             (this.ID2Reply_serialNumber!=null &&
              this.ID2Reply_serialNumber.equals(other.getID2Reply_serialNumber()))) &&
            ((this.ID2Reply_params==null && other.getID2Reply_params()==null) || 
             (this.ID2Reply_params!=null &&
              this.ID2Reply_params.equals(other.getID2Reply_params()))) &&
            ((this.ID2Reply_error==null && other.getID2Reply_error()==null) || 
             (this.ID2Reply_error!=null &&
              this.ID2Reply_error.equals(other.getID2Reply_error()))) &&
            ((this.ID2Reply_endOfReply==null && other.getID2Reply_endOfReply()==null) || 
             (this.ID2Reply_endOfReply!=null &&
              this.ID2Reply_endOfReply.equals(other.getID2Reply_endOfReply()))) &&
            ((this.ID2Reply_reply==null && other.getID2Reply_reply()==null) || 
             (this.ID2Reply_reply!=null &&
              this.ID2Reply_reply.equals(other.getID2Reply_reply()))) &&
            ((this.ID2Reply_discard==null && other.getID2Reply_discard()==null) || 
             (this.ID2Reply_discard!=null &&
              this.ID2Reply_discard.equals(other.getID2Reply_discard())));
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
        if (getID2Reply_serialNumber() != null) {
            _hashCode += getID2Reply_serialNumber().hashCode();
        }
        if (getID2Reply_params() != null) {
            _hashCode += getID2Reply_params().hashCode();
        }
        if (getID2Reply_error() != null) {
            _hashCode += getID2Reply_error().hashCode();
        }
        if (getID2Reply_endOfReply() != null) {
            _hashCode += getID2Reply_endOfReply().hashCode();
        }
        if (getID2Reply_reply() != null) {
            _hashCode += getID2Reply_reply().hashCode();
        }
        if (getID2Reply_discard() != null) {
            _hashCode += getID2Reply_discard().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ID2Reply.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">ID2-Reply"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2Reply_serialNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Reply_serial-number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2Reply_params");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Reply_params"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Reply_paramsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2Reply_error");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Reply_error"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Reply_errorType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2Reply_endOfReply");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Reply_end-of-reply"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">ID2-Reply_end-of-reply"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2Reply_reply");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Reply_reply"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Reply_replyType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2Reply_discard");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Reply_discard"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Reply_discardType"));
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
