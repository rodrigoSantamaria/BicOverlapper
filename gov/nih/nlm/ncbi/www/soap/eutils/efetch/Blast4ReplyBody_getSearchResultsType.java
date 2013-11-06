/**
 * Blast4ReplyBody_getSearchResultsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Blast4ReplyBody_getSearchResultsType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4GetSearchResultsReplyType blast4GetSearchResultsReply;

    public Blast4ReplyBody_getSearchResultsType() {
    }

    public Blast4ReplyBody_getSearchResultsType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4GetSearchResultsReplyType blast4GetSearchResultsReply) {
           this.blast4GetSearchResultsReply = blast4GetSearchResultsReply;
    }


    /**
     * Gets the blast4GetSearchResultsReply value for this Blast4ReplyBody_getSearchResultsType.
     * 
     * @return blast4GetSearchResultsReply
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4GetSearchResultsReplyType getBlast4GetSearchResultsReply() {
        return blast4GetSearchResultsReply;
    }


    /**
     * Sets the blast4GetSearchResultsReply value for this Blast4ReplyBody_getSearchResultsType.
     * 
     * @param blast4GetSearchResultsReply
     */
    public void setBlast4GetSearchResultsReply(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4GetSearchResultsReplyType blast4GetSearchResultsReply) {
        this.blast4GetSearchResultsReply = blast4GetSearchResultsReply;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Blast4ReplyBody_getSearchResultsType)) return false;
        Blast4ReplyBody_getSearchResultsType other = (Blast4ReplyBody_getSearchResultsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.blast4GetSearchResultsReply==null && other.getBlast4GetSearchResultsReply()==null) || 
             (this.blast4GetSearchResultsReply!=null &&
              this.blast4GetSearchResultsReply.equals(other.getBlast4GetSearchResultsReply())));
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
        if (getBlast4GetSearchResultsReply() != null) {
            _hashCode += getBlast4GetSearchResultsReply().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Blast4ReplyBody_getSearchResultsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-reply-body_get-search-resultsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blast4GetSearchResultsReply");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-get-search-results-reply"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-get-search-results-replyType"));
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
