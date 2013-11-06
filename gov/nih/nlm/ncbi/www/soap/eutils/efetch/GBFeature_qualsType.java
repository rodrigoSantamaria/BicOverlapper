/**
 * GBFeature_qualsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class GBFeature_qualsType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.GBQualifierType[] GBQualifier;

    public GBFeature_qualsType() {
    }

    public GBFeature_qualsType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.GBQualifierType[] GBQualifier) {
           this.GBQualifier = GBQualifier;
    }


    /**
     * Gets the GBQualifier value for this GBFeature_qualsType.
     * 
     * @return GBQualifier
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.GBQualifierType[] getGBQualifier() {
        return GBQualifier;
    }


    /**
     * Sets the GBQualifier value for this GBFeature_qualsType.
     * 
     * @param GBQualifier
     */
    public void setGBQualifier(gov.nih.nlm.ncbi.www.soap.eutils.efetch.GBQualifierType[] GBQualifier) {
        this.GBQualifier = GBQualifier;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.GBQualifierType getGBQualifier(int i) {
        return this.GBQualifier[i];
    }

    public void setGBQualifier(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.GBQualifierType _value) {
        this.GBQualifier[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GBFeature_qualsType)) return false;
        GBFeature_qualsType other = (GBFeature_qualsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.GBQualifier==null && other.getGBQualifier()==null) || 
             (this.GBQualifier!=null &&
              java.util.Arrays.equals(this.GBQualifier, other.getGBQualifier())));
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
        if (getGBQualifier() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGBQualifier());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGBQualifier(), i);
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
        new org.apache.axis.description.TypeDesc(GBFeature_qualsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "GBFeature_qualsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GBQualifier");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "GBQualifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "GBQualifierType"));
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
