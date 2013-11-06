/**
 * GeneCommentary_sourceType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class GeneCommentary_sourceType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.OtherSourceType[] otherSource;

    public GeneCommentary_sourceType() {
    }

    public GeneCommentary_sourceType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.OtherSourceType[] otherSource) {
           this.otherSource = otherSource;
    }


    /**
     * Gets the otherSource value for this GeneCommentary_sourceType.
     * 
     * @return otherSource
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.OtherSourceType[] getOtherSource() {
        return otherSource;
    }


    /**
     * Sets the otherSource value for this GeneCommentary_sourceType.
     * 
     * @param otherSource
     */
    public void setOtherSource(gov.nih.nlm.ncbi.www.soap.eutils.efetch.OtherSourceType[] otherSource) {
        this.otherSource = otherSource;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.OtherSourceType getOtherSource(int i) {
        return this.otherSource[i];
    }

    public void setOtherSource(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.OtherSourceType _value) {
        this.otherSource[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GeneCommentary_sourceType)) return false;
        GeneCommentary_sourceType other = (GeneCommentary_sourceType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.otherSource==null && other.getOtherSource()==null) || 
             (this.otherSource!=null &&
              java.util.Arrays.equals(this.otherSource, other.getOtherSource())));
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
        if (getOtherSource() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOtherSource());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOtherSource(), i);
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
        new org.apache.axis.description.TypeDesc(GeneCommentary_sourceType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Gene-commentary_sourceType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("otherSource");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Other-source"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Other-sourceType"));
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
