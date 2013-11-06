/**
 * ID2ReplyGetSeqIdType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ID2ReplyGetSeqIdType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2ReplyGetSeqId_requestType ID2ReplyGetSeqId_request;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2ReplyGetSeqId_seqIdType ID2ReplyGetSeqId_seqId;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2ReplyGetSeqId_endOfReply ID2ReplyGetSeqId_endOfReply;

    public ID2ReplyGetSeqIdType() {
    }

    public ID2ReplyGetSeqIdType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2ReplyGetSeqId_requestType ID2ReplyGetSeqId_request,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2ReplyGetSeqId_seqIdType ID2ReplyGetSeqId_seqId,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2ReplyGetSeqId_endOfReply ID2ReplyGetSeqId_endOfReply) {
           this.ID2ReplyGetSeqId_request = ID2ReplyGetSeqId_request;
           this.ID2ReplyGetSeqId_seqId = ID2ReplyGetSeqId_seqId;
           this.ID2ReplyGetSeqId_endOfReply = ID2ReplyGetSeqId_endOfReply;
    }


    /**
     * Gets the ID2ReplyGetSeqId_request value for this ID2ReplyGetSeqIdType.
     * 
     * @return ID2ReplyGetSeqId_request
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2ReplyGetSeqId_requestType getID2ReplyGetSeqId_request() {
        return ID2ReplyGetSeqId_request;
    }


    /**
     * Sets the ID2ReplyGetSeqId_request value for this ID2ReplyGetSeqIdType.
     * 
     * @param ID2ReplyGetSeqId_request
     */
    public void setID2ReplyGetSeqId_request(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2ReplyGetSeqId_requestType ID2ReplyGetSeqId_request) {
        this.ID2ReplyGetSeqId_request = ID2ReplyGetSeqId_request;
    }


    /**
     * Gets the ID2ReplyGetSeqId_seqId value for this ID2ReplyGetSeqIdType.
     * 
     * @return ID2ReplyGetSeqId_seqId
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2ReplyGetSeqId_seqIdType getID2ReplyGetSeqId_seqId() {
        return ID2ReplyGetSeqId_seqId;
    }


    /**
     * Sets the ID2ReplyGetSeqId_seqId value for this ID2ReplyGetSeqIdType.
     * 
     * @param ID2ReplyGetSeqId_seqId
     */
    public void setID2ReplyGetSeqId_seqId(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2ReplyGetSeqId_seqIdType ID2ReplyGetSeqId_seqId) {
        this.ID2ReplyGetSeqId_seqId = ID2ReplyGetSeqId_seqId;
    }


    /**
     * Gets the ID2ReplyGetSeqId_endOfReply value for this ID2ReplyGetSeqIdType.
     * 
     * @return ID2ReplyGetSeqId_endOfReply
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2ReplyGetSeqId_endOfReply getID2ReplyGetSeqId_endOfReply() {
        return ID2ReplyGetSeqId_endOfReply;
    }


    /**
     * Sets the ID2ReplyGetSeqId_endOfReply value for this ID2ReplyGetSeqIdType.
     * 
     * @param ID2ReplyGetSeqId_endOfReply
     */
    public void setID2ReplyGetSeqId_endOfReply(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2ReplyGetSeqId_endOfReply ID2ReplyGetSeqId_endOfReply) {
        this.ID2ReplyGetSeqId_endOfReply = ID2ReplyGetSeqId_endOfReply;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ID2ReplyGetSeqIdType)) return false;
        ID2ReplyGetSeqIdType other = (ID2ReplyGetSeqIdType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ID2ReplyGetSeqId_request==null && other.getID2ReplyGetSeqId_request()==null) || 
             (this.ID2ReplyGetSeqId_request!=null &&
              this.ID2ReplyGetSeqId_request.equals(other.getID2ReplyGetSeqId_request()))) &&
            ((this.ID2ReplyGetSeqId_seqId==null && other.getID2ReplyGetSeqId_seqId()==null) || 
             (this.ID2ReplyGetSeqId_seqId!=null &&
              this.ID2ReplyGetSeqId_seqId.equals(other.getID2ReplyGetSeqId_seqId()))) &&
            ((this.ID2ReplyGetSeqId_endOfReply==null && other.getID2ReplyGetSeqId_endOfReply()==null) || 
             (this.ID2ReplyGetSeqId_endOfReply!=null &&
              this.ID2ReplyGetSeqId_endOfReply.equals(other.getID2ReplyGetSeqId_endOfReply())));
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
        if (getID2ReplyGetSeqId_request() != null) {
            _hashCode += getID2ReplyGetSeqId_request().hashCode();
        }
        if (getID2ReplyGetSeqId_seqId() != null) {
            _hashCode += getID2ReplyGetSeqId_seqId().hashCode();
        }
        if (getID2ReplyGetSeqId_endOfReply() != null) {
            _hashCode += getID2ReplyGetSeqId_endOfReply().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ID2ReplyGetSeqIdType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Reply-Get-Seq-idType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2ReplyGetSeqId_request");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Reply-Get-Seq-id_request"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Reply-Get-Seq-id_requestType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2ReplyGetSeqId_seqId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Reply-Get-Seq-id_seq-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Reply-Get-Seq-id_seq-idType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2ReplyGetSeqId_endOfReply");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Reply-Get-Seq-id_end-of-reply"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">ID2-Reply-Get-Seq-id_end-of-reply"));
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
