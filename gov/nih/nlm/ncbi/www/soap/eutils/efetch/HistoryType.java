/**
 * HistoryType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class HistoryType  implements java.io.Serializable, org.apache.axis.encoding.AnyContentType {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PubMedPubDateType[] pubMedPubDate;

    private org.apache.axis.message.MessageElement [] _any;

    public HistoryType() {
    }

    public HistoryType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PubMedPubDateType[] pubMedPubDate,
           org.apache.axis.message.MessageElement [] _any) {
           this.pubMedPubDate = pubMedPubDate;
           this._any = _any;
    }


    /**
     * Gets the pubMedPubDate value for this HistoryType.
     * 
     * @return pubMedPubDate
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PubMedPubDateType[] getPubMedPubDate() {
        return pubMedPubDate;
    }


    /**
     * Sets the pubMedPubDate value for this HistoryType.
     * 
     * @param pubMedPubDate
     */
    public void setPubMedPubDate(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PubMedPubDateType[] pubMedPubDate) {
        this.pubMedPubDate = pubMedPubDate;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PubMedPubDateType getPubMedPubDate(int i) {
        return this.pubMedPubDate[i];
    }

    public void setPubMedPubDate(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.PubMedPubDateType _value) {
        this.pubMedPubDate[i] = _value;
    }


    /**
     * Gets the _any value for this HistoryType.
     * 
     * @return _any
     */
    public org.apache.axis.message.MessageElement [] get_any() {
        return _any;
    }


    /**
     * Sets the _any value for this HistoryType.
     * 
     * @param _any
     */
    public void set_any(org.apache.axis.message.MessageElement [] _any) {
        this._any = _any;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HistoryType)) return false;
        HistoryType other = (HistoryType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.pubMedPubDate==null && other.getPubMedPubDate()==null) || 
             (this.pubMedPubDate!=null &&
              java.util.Arrays.equals(this.pubMedPubDate, other.getPubMedPubDate()))) &&
            ((this._any==null && other.get_any()==null) || 
             (this._any!=null &&
              java.util.Arrays.equals(this._any, other.get_any())));
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
        if (getPubMedPubDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPubMedPubDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPubMedPubDate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (get_any() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(get_any());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(get_any(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HistoryType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "HistoryType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pubMedPubDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PubMedPubDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PubMedPubDateType"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
