/**
 * Coordinates_surfaceType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Coordinates_surfaceType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.SurfaceCoordinatesType surfaceCoordinates;

    public Coordinates_surfaceType() {
    }

    public Coordinates_surfaceType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.SurfaceCoordinatesType surfaceCoordinates) {
           this.surfaceCoordinates = surfaceCoordinates;
    }


    /**
     * Gets the surfaceCoordinates value for this Coordinates_surfaceType.
     * 
     * @return surfaceCoordinates
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SurfaceCoordinatesType getSurfaceCoordinates() {
        return surfaceCoordinates;
    }


    /**
     * Sets the surfaceCoordinates value for this Coordinates_surfaceType.
     * 
     * @param surfaceCoordinates
     */
    public void setSurfaceCoordinates(gov.nih.nlm.ncbi.www.soap.eutils.efetch.SurfaceCoordinatesType surfaceCoordinates) {
        this.surfaceCoordinates = surfaceCoordinates;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Coordinates_surfaceType)) return false;
        Coordinates_surfaceType other = (Coordinates_surfaceType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.surfaceCoordinates==null && other.getSurfaceCoordinates()==null) || 
             (this.surfaceCoordinates!=null &&
              this.surfaceCoordinates.equals(other.getSurfaceCoordinates())));
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
        if (getSurfaceCoordinates() != null) {
            _hashCode += getSurfaceCoordinates().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Coordinates_surfaceType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Coordinates_surfaceType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("surfaceCoordinates");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Surface-coordinates"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Surface-coordinatesType"));
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
