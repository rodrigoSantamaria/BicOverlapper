/**
 * CoordinatesType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class CoordinatesType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Coordinates_atomicType coordinates_atomic;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Coordinates_surfaceType coordinates_surface;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Coordinates_densityType coordinates_density;

    public CoordinatesType() {
    }

    public CoordinatesType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Coordinates_atomicType coordinates_atomic,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Coordinates_surfaceType coordinates_surface,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Coordinates_densityType coordinates_density) {
           this.coordinates_atomic = coordinates_atomic;
           this.coordinates_surface = coordinates_surface;
           this.coordinates_density = coordinates_density;
    }


    /**
     * Gets the coordinates_atomic value for this CoordinatesType.
     * 
     * @return coordinates_atomic
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Coordinates_atomicType getCoordinates_atomic() {
        return coordinates_atomic;
    }


    /**
     * Sets the coordinates_atomic value for this CoordinatesType.
     * 
     * @param coordinates_atomic
     */
    public void setCoordinates_atomic(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Coordinates_atomicType coordinates_atomic) {
        this.coordinates_atomic = coordinates_atomic;
    }


    /**
     * Gets the coordinates_surface value for this CoordinatesType.
     * 
     * @return coordinates_surface
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Coordinates_surfaceType getCoordinates_surface() {
        return coordinates_surface;
    }


    /**
     * Sets the coordinates_surface value for this CoordinatesType.
     * 
     * @param coordinates_surface
     */
    public void setCoordinates_surface(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Coordinates_surfaceType coordinates_surface) {
        this.coordinates_surface = coordinates_surface;
    }


    /**
     * Gets the coordinates_density value for this CoordinatesType.
     * 
     * @return coordinates_density
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Coordinates_densityType getCoordinates_density() {
        return coordinates_density;
    }


    /**
     * Sets the coordinates_density value for this CoordinatesType.
     * 
     * @param coordinates_density
     */
    public void setCoordinates_density(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Coordinates_densityType coordinates_density) {
        this.coordinates_density = coordinates_density;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CoordinatesType)) return false;
        CoordinatesType other = (CoordinatesType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.coordinates_atomic==null && other.getCoordinates_atomic()==null) || 
             (this.coordinates_atomic!=null &&
              this.coordinates_atomic.equals(other.getCoordinates_atomic()))) &&
            ((this.coordinates_surface==null && other.getCoordinates_surface()==null) || 
             (this.coordinates_surface!=null &&
              this.coordinates_surface.equals(other.getCoordinates_surface()))) &&
            ((this.coordinates_density==null && other.getCoordinates_density()==null) || 
             (this.coordinates_density!=null &&
              this.coordinates_density.equals(other.getCoordinates_density())));
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
        if (getCoordinates_atomic() != null) {
            _hashCode += getCoordinates_atomic().hashCode();
        }
        if (getCoordinates_surface() != null) {
            _hashCode += getCoordinates_surface().hashCode();
        }
        if (getCoordinates_density() != null) {
            _hashCode += getCoordinates_density().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CoordinatesType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "CoordinatesType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coordinates_atomic");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Coordinates_atomic"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Coordinates_atomicType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coordinates_surface");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Coordinates_surface"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Coordinates_surfaceType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coordinates_density");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Coordinates_density"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Coordinates_densityType"));
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
