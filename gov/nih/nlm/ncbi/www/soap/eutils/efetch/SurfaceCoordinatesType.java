/**
 * SurfaceCoordinatesType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class SurfaceCoordinatesType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.SurfaceCoordinates_contentsType surfaceCoordinates_contents;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.SurfaceCoordinates_surfaceType surfaceCoordinates_surface;

    public SurfaceCoordinatesType() {
    }

    public SurfaceCoordinatesType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.SurfaceCoordinates_contentsType surfaceCoordinates_contents,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.SurfaceCoordinates_surfaceType surfaceCoordinates_surface) {
           this.surfaceCoordinates_contents = surfaceCoordinates_contents;
           this.surfaceCoordinates_surface = surfaceCoordinates_surface;
    }


    /**
     * Gets the surfaceCoordinates_contents value for this SurfaceCoordinatesType.
     * 
     * @return surfaceCoordinates_contents
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SurfaceCoordinates_contentsType getSurfaceCoordinates_contents() {
        return surfaceCoordinates_contents;
    }


    /**
     * Sets the surfaceCoordinates_contents value for this SurfaceCoordinatesType.
     * 
     * @param surfaceCoordinates_contents
     */
    public void setSurfaceCoordinates_contents(gov.nih.nlm.ncbi.www.soap.eutils.efetch.SurfaceCoordinates_contentsType surfaceCoordinates_contents) {
        this.surfaceCoordinates_contents = surfaceCoordinates_contents;
    }


    /**
     * Gets the surfaceCoordinates_surface value for this SurfaceCoordinatesType.
     * 
     * @return surfaceCoordinates_surface
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SurfaceCoordinates_surfaceType getSurfaceCoordinates_surface() {
        return surfaceCoordinates_surface;
    }


    /**
     * Sets the surfaceCoordinates_surface value for this SurfaceCoordinatesType.
     * 
     * @param surfaceCoordinates_surface
     */
    public void setSurfaceCoordinates_surface(gov.nih.nlm.ncbi.www.soap.eutils.efetch.SurfaceCoordinates_surfaceType surfaceCoordinates_surface) {
        this.surfaceCoordinates_surface = surfaceCoordinates_surface;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SurfaceCoordinatesType)) return false;
        SurfaceCoordinatesType other = (SurfaceCoordinatesType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.surfaceCoordinates_contents==null && other.getSurfaceCoordinates_contents()==null) || 
             (this.surfaceCoordinates_contents!=null &&
              this.surfaceCoordinates_contents.equals(other.getSurfaceCoordinates_contents()))) &&
            ((this.surfaceCoordinates_surface==null && other.getSurfaceCoordinates_surface()==null) || 
             (this.surfaceCoordinates_surface!=null &&
              this.surfaceCoordinates_surface.equals(other.getSurfaceCoordinates_surface())));
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
        if (getSurfaceCoordinates_contents() != null) {
            _hashCode += getSurfaceCoordinates_contents().hashCode();
        }
        if (getSurfaceCoordinates_surface() != null) {
            _hashCode += getSurfaceCoordinates_surface().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SurfaceCoordinatesType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Surface-coordinatesType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("surfaceCoordinates_contents");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Surface-coordinates_contents"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Surface-coordinates_contentsType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("surfaceCoordinates_surface");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Surface-coordinates_surface"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Surface-coordinates_surfaceType"));
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
