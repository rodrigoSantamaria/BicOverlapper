/**
 * SurfaceCoordinates_surface_sphereType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class SurfaceCoordinates_surface_sphereType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.SphereType sphere;

    public SurfaceCoordinates_surface_sphereType() {
    }

    public SurfaceCoordinates_surface_sphereType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.SphereType sphere) {
           this.sphere = sphere;
    }


    /**
     * Gets the sphere value for this SurfaceCoordinates_surface_sphereType.
     * 
     * @return sphere
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SphereType getSphere() {
        return sphere;
    }


    /**
     * Sets the sphere value for this SurfaceCoordinates_surface_sphereType.
     * 
     * @param sphere
     */
    public void setSphere(gov.nih.nlm.ncbi.www.soap.eutils.efetch.SphereType sphere) {
        this.sphere = sphere;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SurfaceCoordinates_surface_sphereType)) return false;
        SurfaceCoordinates_surface_sphereType other = (SurfaceCoordinates_surface_sphereType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sphere==null && other.getSphere()==null) || 
             (this.sphere!=null &&
              this.sphere.equals(other.getSphere())));
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
        if (getSphere() != null) {
            _hashCode += getSphere().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SurfaceCoordinates_surface_sphereType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Surface-coordinates_surface_sphereType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sphere");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Sphere"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "SphereType"));
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
