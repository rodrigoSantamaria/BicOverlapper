/**
 * PCCoordinates_aidType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class PCCoordinates_aidType  implements java.io.Serializable {
    private java.lang.String[] PCCoordinates_aid_E;

    public PCCoordinates_aidType() {
    }

    public PCCoordinates_aidType(
           java.lang.String[] PCCoordinates_aid_E) {
           this.PCCoordinates_aid_E = PCCoordinates_aid_E;
    }


    /**
     * Gets the PCCoordinates_aid_E value for this PCCoordinates_aidType.
     * 
     * @return PCCoordinates_aid_E
     */
    public java.lang.String[] getPCCoordinates_aid_E() {
        return PCCoordinates_aid_E;
    }


    /**
     * Sets the PCCoordinates_aid_E value for this PCCoordinates_aidType.
     * 
     * @param PCCoordinates_aid_E
     */
    public void setPCCoordinates_aid_E(java.lang.String[] PCCoordinates_aid_E) {
        this.PCCoordinates_aid_E = PCCoordinates_aid_E;
    }

    public java.lang.String getPCCoordinates_aid_E(int i) {
        return this.PCCoordinates_aid_E[i];
    }

    public void setPCCoordinates_aid_E(int i, java.lang.String _value) {
        this.PCCoordinates_aid_E[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PCCoordinates_aidType)) return false;
        PCCoordinates_aidType other = (PCCoordinates_aidType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.PCCoordinates_aid_E==null && other.getPCCoordinates_aid_E()==null) || 
             (this.PCCoordinates_aid_E!=null &&
              java.util.Arrays.equals(this.PCCoordinates_aid_E, other.getPCCoordinates_aid_E())));
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
        if (getPCCoordinates_aid_E() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPCCoordinates_aid_E());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPCCoordinates_aid_E(), i);
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
        new org.apache.axis.description.TypeDesc(PCCoordinates_aidType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-Coordinates_aidType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCCoordinates_aid_E");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-Coordinates_aid_E"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-Coordinates_aid_E"));
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
