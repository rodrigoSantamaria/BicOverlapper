/**
 * MimEntry_referencesType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class MimEntry_referencesType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimReferenceType[] mimReference;

    public MimEntry_referencesType() {
    }

    public MimEntry_referencesType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimReferenceType[] mimReference) {
           this.mimReference = mimReference;
    }


    /**
     * Gets the mimReference value for this MimEntry_referencesType.
     * 
     * @return mimReference
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimReferenceType[] getMimReference() {
        return mimReference;
    }


    /**
     * Sets the mimReference value for this MimEntry_referencesType.
     * 
     * @param mimReference
     */
    public void setMimReference(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimReferenceType[] mimReference) {
        this.mimReference = mimReference;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimReferenceType getMimReference(int i) {
        return this.mimReference[i];
    }

    public void setMimReference(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimReferenceType _value) {
        this.mimReference[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MimEntry_referencesType)) return false;
        MimEntry_referencesType other = (MimEntry_referencesType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.mimReference==null && other.getMimReference()==null) || 
             (this.mimReference!=null &&
              java.util.Arrays.equals(this.mimReference, other.getMimReference())));
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
        if (getMimReference() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMimReference());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMimReference(), i);
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
        new org.apache.axis.description.TypeDesc(MimEntry_referencesType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-entry_referencesType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mimReference");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-reference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-referenceType"));
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
