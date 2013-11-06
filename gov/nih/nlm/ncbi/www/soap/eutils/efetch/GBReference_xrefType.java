/**
 * GBReference_xrefType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class GBReference_xrefType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.GBXrefType[] GBXref;

    public GBReference_xrefType() {
    }

    public GBReference_xrefType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.GBXrefType[] GBXref) {
           this.GBXref = GBXref;
    }


    /**
     * Gets the GBXref value for this GBReference_xrefType.
     * 
     * @return GBXref
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.GBXrefType[] getGBXref() {
        return GBXref;
    }


    /**
     * Sets the GBXref value for this GBReference_xrefType.
     * 
     * @param GBXref
     */
    public void setGBXref(gov.nih.nlm.ncbi.www.soap.eutils.efetch.GBXrefType[] GBXref) {
        this.GBXref = GBXref;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.GBXrefType getGBXref(int i) {
        return this.GBXref[i];
    }

    public void setGBXref(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.GBXrefType _value) {
        this.GBXref[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GBReference_xrefType)) return false;
        GBReference_xrefType other = (GBReference_xrefType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.GBXref==null && other.getGBXref()==null) || 
             (this.GBXref!=null &&
              java.util.Arrays.equals(this.GBXref, other.getGBXref())));
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
        if (getGBXref() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGBXref());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGBXref(), i);
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
        new org.apache.axis.description.TypeDesc(GBReference_xrefType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "GBReference_xrefType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GBXref");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "GBXref"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "GBXrefType"));
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
