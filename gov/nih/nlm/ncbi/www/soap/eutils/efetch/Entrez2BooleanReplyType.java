/**
 * Entrez2BooleanReplyType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Entrez2BooleanReplyType  implements java.io.Serializable {
    private java.lang.String entrez2BooleanReply_count;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2BooleanReply_uidsType entrez2BooleanReply_uids;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2BooleanReply_queryType entrez2BooleanReply_query;

    public Entrez2BooleanReplyType() {
    }

    public Entrez2BooleanReplyType(
           java.lang.String entrez2BooleanReply_count,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2BooleanReply_uidsType entrez2BooleanReply_uids,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2BooleanReply_queryType entrez2BooleanReply_query) {
           this.entrez2BooleanReply_count = entrez2BooleanReply_count;
           this.entrez2BooleanReply_uids = entrez2BooleanReply_uids;
           this.entrez2BooleanReply_query = entrez2BooleanReply_query;
    }


    /**
     * Gets the entrez2BooleanReply_count value for this Entrez2BooleanReplyType.
     * 
     * @return entrez2BooleanReply_count
     */
    public java.lang.String getEntrez2BooleanReply_count() {
        return entrez2BooleanReply_count;
    }


    /**
     * Sets the entrez2BooleanReply_count value for this Entrez2BooleanReplyType.
     * 
     * @param entrez2BooleanReply_count
     */
    public void setEntrez2BooleanReply_count(java.lang.String entrez2BooleanReply_count) {
        this.entrez2BooleanReply_count = entrez2BooleanReply_count;
    }


    /**
     * Gets the entrez2BooleanReply_uids value for this Entrez2BooleanReplyType.
     * 
     * @return entrez2BooleanReply_uids
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2BooleanReply_uidsType getEntrez2BooleanReply_uids() {
        return entrez2BooleanReply_uids;
    }


    /**
     * Sets the entrez2BooleanReply_uids value for this Entrez2BooleanReplyType.
     * 
     * @param entrez2BooleanReply_uids
     */
    public void setEntrez2BooleanReply_uids(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2BooleanReply_uidsType entrez2BooleanReply_uids) {
        this.entrez2BooleanReply_uids = entrez2BooleanReply_uids;
    }


    /**
     * Gets the entrez2BooleanReply_query value for this Entrez2BooleanReplyType.
     * 
     * @return entrez2BooleanReply_query
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2BooleanReply_queryType getEntrez2BooleanReply_query() {
        return entrez2BooleanReply_query;
    }


    /**
     * Sets the entrez2BooleanReply_query value for this Entrez2BooleanReplyType.
     * 
     * @param entrez2BooleanReply_query
     */
    public void setEntrez2BooleanReply_query(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2BooleanReply_queryType entrez2BooleanReply_query) {
        this.entrez2BooleanReply_query = entrez2BooleanReply_query;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Entrez2BooleanReplyType)) return false;
        Entrez2BooleanReplyType other = (Entrez2BooleanReplyType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.entrez2BooleanReply_count==null && other.getEntrez2BooleanReply_count()==null) || 
             (this.entrez2BooleanReply_count!=null &&
              this.entrez2BooleanReply_count.equals(other.getEntrez2BooleanReply_count()))) &&
            ((this.entrez2BooleanReply_uids==null && other.getEntrez2BooleanReply_uids()==null) || 
             (this.entrez2BooleanReply_uids!=null &&
              this.entrez2BooleanReply_uids.equals(other.getEntrez2BooleanReply_uids()))) &&
            ((this.entrez2BooleanReply_query==null && other.getEntrez2BooleanReply_query()==null) || 
             (this.entrez2BooleanReply_query!=null &&
              this.entrez2BooleanReply_query.equals(other.getEntrez2BooleanReply_query())));
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
        if (getEntrez2BooleanReply_count() != null) {
            _hashCode += getEntrez2BooleanReply_count().hashCode();
        }
        if (getEntrez2BooleanReply_uids() != null) {
            _hashCode += getEntrez2BooleanReply_uids().hashCode();
        }
        if (getEntrez2BooleanReply_query() != null) {
            _hashCode += getEntrez2BooleanReply_query().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Entrez2BooleanReplyType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-boolean-replyType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entrez2BooleanReply_count");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-boolean-reply_count"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entrez2BooleanReply_uids");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-boolean-reply_uids"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-boolean-reply_uidsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entrez2BooleanReply_query");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-boolean-reply_query"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-boolean-reply_queryType"));
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
