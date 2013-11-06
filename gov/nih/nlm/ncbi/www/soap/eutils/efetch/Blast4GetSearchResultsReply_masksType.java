/**
 * Blast4GetSearchResultsReply_masksType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Blast4GetSearchResultsReply_masksType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4MaskType[] blast4Mask;

    public Blast4GetSearchResultsReply_masksType() {
    }

    public Blast4GetSearchResultsReply_masksType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4MaskType[] blast4Mask) {
           this.blast4Mask = blast4Mask;
    }


    /**
     * Gets the blast4Mask value for this Blast4GetSearchResultsReply_masksType.
     * 
     * @return blast4Mask
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4MaskType[] getBlast4Mask() {
        return blast4Mask;
    }


    /**
     * Sets the blast4Mask value for this Blast4GetSearchResultsReply_masksType.
     * 
     * @param blast4Mask
     */
    public void setBlast4Mask(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4MaskType[] blast4Mask) {
        this.blast4Mask = blast4Mask;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4MaskType getBlast4Mask(int i) {
        return this.blast4Mask[i];
    }

    public void setBlast4Mask(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4MaskType _value) {
        this.blast4Mask[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Blast4GetSearchResultsReply_masksType)) return false;
        Blast4GetSearchResultsReply_masksType other = (Blast4GetSearchResultsReply_masksType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.blast4Mask==null && other.getBlast4Mask()==null) || 
             (this.blast4Mask!=null &&
              java.util.Arrays.equals(this.blast4Mask, other.getBlast4Mask())));
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
        if (getBlast4Mask() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBlast4Mask());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBlast4Mask(), i);
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
        new org.apache.axis.description.TypeDesc(Blast4GetSearchResultsReply_masksType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-get-search-results-reply_masksType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blast4Mask");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-mask"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-maskType"));
        elemField.setMinOccurs(0);
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
