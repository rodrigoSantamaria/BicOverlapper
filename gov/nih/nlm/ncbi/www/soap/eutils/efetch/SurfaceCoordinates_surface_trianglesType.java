/**
 * SurfaceCoordinates_surface_trianglesType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class SurfaceCoordinates_surface_trianglesType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.TrianglesType triangles;

    public SurfaceCoordinates_surface_trianglesType() {
    }

    public SurfaceCoordinates_surface_trianglesType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.TrianglesType triangles) {
           this.triangles = triangles;
    }


    /**
     * Gets the triangles value for this SurfaceCoordinates_surface_trianglesType.
     * 
     * @return triangles
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.TrianglesType getTriangles() {
        return triangles;
    }


    /**
     * Sets the triangles value for this SurfaceCoordinates_surface_trianglesType.
     * 
     * @param triangles
     */
    public void setTriangles(gov.nih.nlm.ncbi.www.soap.eutils.efetch.TrianglesType triangles) {
        this.triangles = triangles;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SurfaceCoordinates_surface_trianglesType)) return false;
        SurfaceCoordinates_surface_trianglesType other = (SurfaceCoordinates_surface_trianglesType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.triangles==null && other.getTriangles()==null) || 
             (this.triangles!=null &&
              this.triangles.equals(other.getTriangles())));
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
        if (getTriangles() != null) {
            _hashCode += getTriangles().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SurfaceCoordinates_surface_trianglesType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Surface-coordinates_surface_trianglesType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("triangles");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Triangles"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "TrianglesType"));
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
