/**
 * DensityCoordinates_densityType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class DensityCoordinates_densityType  implements java.io.Serializable {
    private java.lang.String[] densityCoordinates_density_E;

    public DensityCoordinates_densityType() {
    }

    public DensityCoordinates_densityType(
           java.lang.String[] densityCoordinates_density_E) {
           this.densityCoordinates_density_E = densityCoordinates_density_E;
    }


    /**
     * Gets the densityCoordinates_density_E value for this DensityCoordinates_densityType.
     * 
     * @return densityCoordinates_density_E
     */
    public java.lang.String[] getDensityCoordinates_density_E() {
        return densityCoordinates_density_E;
    }


    /**
     * Sets the densityCoordinates_density_E value for this DensityCoordinates_densityType.
     * 
     * @param densityCoordinates_density_E
     */
    public void setDensityCoordinates_density_E(java.lang.String[] densityCoordinates_density_E) {
        this.densityCoordinates_density_E = densityCoordinates_density_E;
    }

    public java.lang.String getDensityCoordinates_density_E(int i) {
        return this.densityCoordinates_density_E[i];
    }

    public void setDensityCoordinates_density_E(int i, java.lang.String _value) {
        this.densityCoordinates_density_E[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DensityCoordinates_densityType)) return false;
        DensityCoordinates_densityType other = (DensityCoordinates_densityType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.densityCoordinates_density_E==null && other.getDensityCoordinates_density_E()==null) || 
             (this.densityCoordinates_density_E!=null &&
              java.util.Arrays.equals(this.densityCoordinates_density_E, other.getDensityCoordinates_density_E())));
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
        if (getDensityCoordinates_density_E() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDensityCoordinates_density_E());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDensityCoordinates_density_E(), i);
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
        new org.apache.axis.description.TypeDesc(DensityCoordinates_densityType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Density-coordinates_densityType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("densityCoordinates_density_E");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Density-coordinates_density_E"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Density-coordinates_density_E"));
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
