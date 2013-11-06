/**
 * SphereType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class SphereType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Sphere_centerType sphere_center;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Sphere_radiusType sphere_radius;

    public SphereType() {
    }

    public SphereType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Sphere_centerType sphere_center,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Sphere_radiusType sphere_radius) {
           this.sphere_center = sphere_center;
           this.sphere_radius = sphere_radius;
    }


    /**
     * Gets the sphere_center value for this SphereType.
     * 
     * @return sphere_center
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Sphere_centerType getSphere_center() {
        return sphere_center;
    }


    /**
     * Sets the sphere_center value for this SphereType.
     * 
     * @param sphere_center
     */
    public void setSphere_center(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Sphere_centerType sphere_center) {
        this.sphere_center = sphere_center;
    }


    /**
     * Gets the sphere_radius value for this SphereType.
     * 
     * @return sphere_radius
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Sphere_radiusType getSphere_radius() {
        return sphere_radius;
    }


    /**
     * Sets the sphere_radius value for this SphereType.
     * 
     * @param sphere_radius
     */
    public void setSphere_radius(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Sphere_radiusType sphere_radius) {
        this.sphere_radius = sphere_radius;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SphereType)) return false;
        SphereType other = (SphereType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sphere_center==null && other.getSphere_center()==null) || 
             (this.sphere_center!=null &&
              this.sphere_center.equals(other.getSphere_center()))) &&
            ((this.sphere_radius==null && other.getSphere_radius()==null) || 
             (this.sphere_radius!=null &&
              this.sphere_radius.equals(other.getSphere_radius())));
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
        if (getSphere_center() != null) {
            _hashCode += getSphere_center().hashCode();
        }
        if (getSphere_radius() != null) {
            _hashCode += getSphere_radius().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SphereType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "SphereType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sphere_center");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Sphere_center"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Sphere_centerType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sphere_radius");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Sphere_radius"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Sphere_radiusType"));
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
