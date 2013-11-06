/**
 * RegionCoordinates_coordinateIndicesType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class RegionCoordinates_coordinateIndicesType  implements java.io.Serializable {
    private java.lang.String[] regionCoordinates_coordinateIndices_E;

    public RegionCoordinates_coordinateIndicesType() {
    }

    public RegionCoordinates_coordinateIndicesType(
           java.lang.String[] regionCoordinates_coordinateIndices_E) {
           this.regionCoordinates_coordinateIndices_E = regionCoordinates_coordinateIndices_E;
    }


    /**
     * Gets the regionCoordinates_coordinateIndices_E value for this RegionCoordinates_coordinateIndicesType.
     * 
     * @return regionCoordinates_coordinateIndices_E
     */
    public java.lang.String[] getRegionCoordinates_coordinateIndices_E() {
        return regionCoordinates_coordinateIndices_E;
    }


    /**
     * Sets the regionCoordinates_coordinateIndices_E value for this RegionCoordinates_coordinateIndicesType.
     * 
     * @param regionCoordinates_coordinateIndices_E
     */
    public void setRegionCoordinates_coordinateIndices_E(java.lang.String[] regionCoordinates_coordinateIndices_E) {
        this.regionCoordinates_coordinateIndices_E = regionCoordinates_coordinateIndices_E;
    }

    public java.lang.String getRegionCoordinates_coordinateIndices_E(int i) {
        return this.regionCoordinates_coordinateIndices_E[i];
    }

    public void setRegionCoordinates_coordinateIndices_E(int i, java.lang.String _value) {
        this.regionCoordinates_coordinateIndices_E[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RegionCoordinates_coordinateIndicesType)) return false;
        RegionCoordinates_coordinateIndicesType other = (RegionCoordinates_coordinateIndicesType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.regionCoordinates_coordinateIndices_E==null && other.getRegionCoordinates_coordinateIndices_E()==null) || 
             (this.regionCoordinates_coordinateIndices_E!=null &&
              java.util.Arrays.equals(this.regionCoordinates_coordinateIndices_E, other.getRegionCoordinates_coordinateIndices_E())));
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
        if (getRegionCoordinates_coordinateIndices_E() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRegionCoordinates_coordinateIndices_E());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRegionCoordinates_coordinateIndices_E(), i);
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
        new org.apache.axis.description.TypeDesc(RegionCoordinates_coordinateIndicesType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Region-coordinates_coordinate-indicesType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regionCoordinates_coordinateIndices_E");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Region-coordinates_coordinate-indices_E"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Region-coordinates_coordinate-indices_E"));
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
