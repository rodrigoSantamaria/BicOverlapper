/**
 * INSDFeature_qualsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class INSDFeature_qualsType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.INSDQualifierType[] INSDQualifier;

    public INSDFeature_qualsType() {
    }

    public INSDFeature_qualsType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.INSDQualifierType[] INSDQualifier) {
           this.INSDQualifier = INSDQualifier;
    }


    /**
     * Gets the INSDQualifier value for this INSDFeature_qualsType.
     * 
     * @return INSDQualifier
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.INSDQualifierType[] getINSDQualifier() {
        return INSDQualifier;
    }


    /**
     * Sets the INSDQualifier value for this INSDFeature_qualsType.
     * 
     * @param INSDQualifier
     */
    public void setINSDQualifier(gov.nih.nlm.ncbi.www.soap.eutils.efetch.INSDQualifierType[] INSDQualifier) {
        this.INSDQualifier = INSDQualifier;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.INSDQualifierType getINSDQualifier(int i) {
        return this.INSDQualifier[i];
    }

    public void setINSDQualifier(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.INSDQualifierType _value) {
        this.INSDQualifier[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof INSDFeature_qualsType)) return false;
        INSDFeature_qualsType other = (INSDFeature_qualsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.INSDQualifier==null && other.getINSDQualifier()==null) || 
             (this.INSDQualifier!=null &&
              java.util.Arrays.equals(this.INSDQualifier, other.getINSDQualifier())));
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
        if (getINSDQualifier() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getINSDQualifier());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getINSDQualifier(), i);
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
        new org.apache.axis.description.TypeDesc(INSDFeature_qualsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "INSDFeature_qualsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("INSDQualifier");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "INSDQualifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "INSDQualifierType"));
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
