/**
 * GBSeq_referencesType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class GBSeq_referencesType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.GBReferenceType[] GBReference;

    public GBSeq_referencesType() {
    }

    public GBSeq_referencesType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.GBReferenceType[] GBReference) {
           this.GBReference = GBReference;
    }


    /**
     * Gets the GBReference value for this GBSeq_referencesType.
     * 
     * @return GBReference
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.GBReferenceType[] getGBReference() {
        return GBReference;
    }


    /**
     * Sets the GBReference value for this GBSeq_referencesType.
     * 
     * @param GBReference
     */
    public void setGBReference(gov.nih.nlm.ncbi.www.soap.eutils.efetch.GBReferenceType[] GBReference) {
        this.GBReference = GBReference;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.GBReferenceType getGBReference(int i) {
        return this.GBReference[i];
    }

    public void setGBReference(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.GBReferenceType _value) {
        this.GBReference[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GBSeq_referencesType)) return false;
        GBSeq_referencesType other = (GBSeq_referencesType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.GBReference==null && other.getGBReference()==null) || 
             (this.GBReference!=null &&
              java.util.Arrays.equals(this.GBReference, other.getGBReference())));
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
        if (getGBReference() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGBReference());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGBReference(), i);
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
        new org.apache.axis.description.TypeDesc(GBSeq_referencesType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "GBSeq_referencesType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GBReference");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "GBReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "GBReferenceType"));
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
