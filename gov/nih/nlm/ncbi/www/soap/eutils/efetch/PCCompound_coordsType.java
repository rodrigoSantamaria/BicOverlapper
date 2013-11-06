/**
 * PCCompound_coordsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class PCCompound_coordsType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCCoordinatesType[] PCCoordinates;

    public PCCompound_coordsType() {
    }

    public PCCompound_coordsType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCCoordinatesType[] PCCoordinates) {
           this.PCCoordinates = PCCoordinates;
    }


    /**
     * Gets the PCCoordinates value for this PCCompound_coordsType.
     * 
     * @return PCCoordinates
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCCoordinatesType[] getPCCoordinates() {
        return PCCoordinates;
    }


    /**
     * Sets the PCCoordinates value for this PCCompound_coordsType.
     * 
     * @param PCCoordinates
     */
    public void setPCCoordinates(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCCoordinatesType[] PCCoordinates) {
        this.PCCoordinates = PCCoordinates;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCCoordinatesType getPCCoordinates(int i) {
        return this.PCCoordinates[i];
    }

    public void setPCCoordinates(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCCoordinatesType _value) {
        this.PCCoordinates[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PCCompound_coordsType)) return false;
        PCCompound_coordsType other = (PCCompound_coordsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.PCCoordinates==null && other.getPCCoordinates()==null) || 
             (this.PCCoordinates!=null &&
              java.util.Arrays.equals(this.PCCoordinates, other.getPCCoordinates())));
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
        if (getPCCoordinates() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPCCoordinates());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPCCoordinates(), i);
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
        new org.apache.axis.description.TypeDesc(PCCompound_coordsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-Compound_coordsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCCoordinates");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-Coordinates"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-CoordinatesType"));
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
