/**
 * CoreBlock_propertyType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class CoreBlock_propertyType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.BlockPropertyType[] blockProperty;

    public CoreBlock_propertyType() {
    }

    public CoreBlock_propertyType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.BlockPropertyType[] blockProperty) {
           this.blockProperty = blockProperty;
    }


    /**
     * Gets the blockProperty value for this CoreBlock_propertyType.
     * 
     * @return blockProperty
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.BlockPropertyType[] getBlockProperty() {
        return blockProperty;
    }


    /**
     * Sets the blockProperty value for this CoreBlock_propertyType.
     * 
     * @param blockProperty
     */
    public void setBlockProperty(gov.nih.nlm.ncbi.www.soap.eutils.efetch.BlockPropertyType[] blockProperty) {
        this.blockProperty = blockProperty;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.BlockPropertyType getBlockProperty(int i) {
        return this.blockProperty[i];
    }

    public void setBlockProperty(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.BlockPropertyType _value) {
        this.blockProperty[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CoreBlock_propertyType)) return false;
        CoreBlock_propertyType other = (CoreBlock_propertyType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.blockProperty==null && other.getBlockProperty()==null) || 
             (this.blockProperty!=null &&
              java.util.Arrays.equals(this.blockProperty, other.getBlockProperty())));
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
        if (getBlockProperty() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBlockProperty());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBlockProperty(), i);
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
        new org.apache.axis.description.TypeDesc(CoreBlock_propertyType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "CoreBlock_propertyType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blockProperty");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "BlockProperty"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "BlockPropertyType"));
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
