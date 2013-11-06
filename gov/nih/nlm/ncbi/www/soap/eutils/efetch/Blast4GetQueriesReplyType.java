/**
 * Blast4GetQueriesReplyType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Blast4GetQueriesReplyType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4GetQueriesReply_queriesType blast4GetQueriesReply_queries;

    public Blast4GetQueriesReplyType() {
    }

    public Blast4GetQueriesReplyType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4GetQueriesReply_queriesType blast4GetQueriesReply_queries) {
           this.blast4GetQueriesReply_queries = blast4GetQueriesReply_queries;
    }


    /**
     * Gets the blast4GetQueriesReply_queries value for this Blast4GetQueriesReplyType.
     * 
     * @return blast4GetQueriesReply_queries
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4GetQueriesReply_queriesType getBlast4GetQueriesReply_queries() {
        return blast4GetQueriesReply_queries;
    }


    /**
     * Sets the blast4GetQueriesReply_queries value for this Blast4GetQueriesReplyType.
     * 
     * @param blast4GetQueriesReply_queries
     */
    public void setBlast4GetQueriesReply_queries(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4GetQueriesReply_queriesType blast4GetQueriesReply_queries) {
        this.blast4GetQueriesReply_queries = blast4GetQueriesReply_queries;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Blast4GetQueriesReplyType)) return false;
        Blast4GetQueriesReplyType other = (Blast4GetQueriesReplyType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.blast4GetQueriesReply_queries==null && other.getBlast4GetQueriesReply_queries()==null) || 
             (this.blast4GetQueriesReply_queries!=null &&
              this.blast4GetQueriesReply_queries.equals(other.getBlast4GetQueriesReply_queries())));
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
        if (getBlast4GetQueriesReply_queries() != null) {
            _hashCode += getBlast4GetQueriesReply_queries().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Blast4GetQueriesReplyType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-get-queries-replyType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blast4GetQueriesReply_queries");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-get-queries-reply_queries"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-get-queries-reply_queriesType"));
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
