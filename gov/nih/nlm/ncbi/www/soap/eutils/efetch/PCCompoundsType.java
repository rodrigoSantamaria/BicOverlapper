/**
 * PCCompoundsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class PCCompoundsType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCCompoundType[] PCCompound;

    public PCCompoundsType() {
    }

    public PCCompoundsType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCCompoundType[] PCCompound) {
           this.PCCompound = PCCompound;
    }


    /**
     * Gets the PCCompound value for this PCCompoundsType.
     * 
     * @return PCCompound
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCCompoundType[] getPCCompound() {
        return PCCompound;
    }


    /**
     * Sets the PCCompound value for this PCCompoundsType.
     * 
     * @param PCCompound
     */
    public void setPCCompound(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCCompoundType[] PCCompound) {
        this.PCCompound = PCCompound;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCCompoundType getPCCompound(int i) {
        return this.PCCompound[i];
    }

    public void setPCCompound(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCCompoundType _value) {
        this.PCCompound[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PCCompoundsType)) return false;
        PCCompoundsType other = (PCCompoundsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.PCCompound==null && other.getPCCompound()==null) || 
             (this.PCCompound!=null &&
              java.util.Arrays.equals(this.PCCompound, other.getPCCompound())));
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
        if (getPCCompound() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPCCompound());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPCCompound(), i);
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
        new org.apache.axis.description.TypeDesc(PCCompoundsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-CompoundsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCCompound");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-Compound"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-CompoundType"));
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
