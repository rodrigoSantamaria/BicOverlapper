/**
 * RegionCoordinatesType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class RegionCoordinatesType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.RegionCoordinates_modelCoordSetIdType regionCoordinates_modelCoordSetId;

    private java.lang.String regionCoordinates_numberOfCoords;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.RegionCoordinates_coordinateIndicesType regionCoordinates_coordinateIndices;

    public RegionCoordinatesType() {
    }

    public RegionCoordinatesType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.RegionCoordinates_modelCoordSetIdType regionCoordinates_modelCoordSetId,
           java.lang.String regionCoordinates_numberOfCoords,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.RegionCoordinates_coordinateIndicesType regionCoordinates_coordinateIndices) {
           this.regionCoordinates_modelCoordSetId = regionCoordinates_modelCoordSetId;
           this.regionCoordinates_numberOfCoords = regionCoordinates_numberOfCoords;
           this.regionCoordinates_coordinateIndices = regionCoordinates_coordinateIndices;
    }


    /**
     * Gets the regionCoordinates_modelCoordSetId value for this RegionCoordinatesType.
     * 
     * @return regionCoordinates_modelCoordSetId
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.RegionCoordinates_modelCoordSetIdType getRegionCoordinates_modelCoordSetId() {
        return regionCoordinates_modelCoordSetId;
    }


    /**
     * Sets the regionCoordinates_modelCoordSetId value for this RegionCoordinatesType.
     * 
     * @param regionCoordinates_modelCoordSetId
     */
    public void setRegionCoordinates_modelCoordSetId(gov.nih.nlm.ncbi.www.soap.eutils.efetch.RegionCoordinates_modelCoordSetIdType regionCoordinates_modelCoordSetId) {
        this.regionCoordinates_modelCoordSetId = regionCoordinates_modelCoordSetId;
    }


    /**
     * Gets the regionCoordinates_numberOfCoords value for this RegionCoordinatesType.
     * 
     * @return regionCoordinates_numberOfCoords
     */
    public java.lang.String getRegionCoordinates_numberOfCoords() {
        return regionCoordinates_numberOfCoords;
    }


    /**
     * Sets the regionCoordinates_numberOfCoords value for this RegionCoordinatesType.
     * 
     * @param regionCoordinates_numberOfCoords
     */
    public void setRegionCoordinates_numberOfCoords(java.lang.String regionCoordinates_numberOfCoords) {
        this.regionCoordinates_numberOfCoords = regionCoordinates_numberOfCoords;
    }


    /**
     * Gets the regionCoordinates_coordinateIndices value for this RegionCoordinatesType.
     * 
     * @return regionCoordinates_coordinateIndices
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.RegionCoordinates_coordinateIndicesType getRegionCoordinates_coordinateIndices() {
        return regionCoordinates_coordinateIndices;
    }


    /**
     * Sets the regionCoordinates_coordinateIndices value for this RegionCoordinatesType.
     * 
     * @param regionCoordinates_coordinateIndices
     */
    public void setRegionCoordinates_coordinateIndices(gov.nih.nlm.ncbi.www.soap.eutils.efetch.RegionCoordinates_coordinateIndicesType regionCoordinates_coordinateIndices) {
        this.regionCoordinates_coordinateIndices = regionCoordinates_coordinateIndices;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RegionCoordinatesType)) return false;
        RegionCoordinatesType other = (RegionCoordinatesType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.regionCoordinates_modelCoordSetId==null && other.getRegionCoordinates_modelCoordSetId()==null) || 
             (this.regionCoordinates_modelCoordSetId!=null &&
              this.regionCoordinates_modelCoordSetId.equals(other.getRegionCoordinates_modelCoordSetId()))) &&
            ((this.regionCoordinates_numberOfCoords==null && other.getRegionCoordinates_numberOfCoords()==null) || 
             (this.regionCoordinates_numberOfCoords!=null &&
              this.regionCoordinates_numberOfCoords.equals(other.getRegionCoordinates_numberOfCoords()))) &&
            ((this.regionCoordinates_coordinateIndices==null && other.getRegionCoordinates_coordinateIndices()==null) || 
             (this.regionCoordinates_coordinateIndices!=null &&
              this.regionCoordinates_coordinateIndices.equals(other.getRegionCoordinates_coordinateIndices())));
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
        if (getRegionCoordinates_modelCoordSetId() != null) {
            _hashCode += getRegionCoordinates_modelCoordSetId().hashCode();
        }
        if (getRegionCoordinates_numberOfCoords() != null) {
            _hashCode += getRegionCoordinates_numberOfCoords().hashCode();
        }
        if (getRegionCoordinates_coordinateIndices() != null) {
            _hashCode += getRegionCoordinates_coordinateIndices().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RegionCoordinatesType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Region-coordinatesType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regionCoordinates_modelCoordSetId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Region-coordinates_model-coord-set-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Region-coordinates_model-coord-set-idType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regionCoordinates_numberOfCoords");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Region-coordinates_number-of-coords"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regionCoordinates_coordinateIndices");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Region-coordinates_coordinate-indices"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Region-coordinates_coordinate-indicesType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
