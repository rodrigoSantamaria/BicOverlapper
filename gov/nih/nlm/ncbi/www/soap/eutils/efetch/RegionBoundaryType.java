/**
 * RegionBoundaryType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class RegionBoundaryType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.RegionBoundary_sphereType regionBoundary_sphere;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.RegionBoundary_coneType regionBoundary_cone;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.RegionBoundary_cylinderType regionBoundary_cylinder;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.RegionBoundary_brickType regionBoundary_brick;

    public RegionBoundaryType() {
    }

    public RegionBoundaryType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.RegionBoundary_sphereType regionBoundary_sphere,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.RegionBoundary_coneType regionBoundary_cone,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.RegionBoundary_cylinderType regionBoundary_cylinder,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.RegionBoundary_brickType regionBoundary_brick) {
           this.regionBoundary_sphere = regionBoundary_sphere;
           this.regionBoundary_cone = regionBoundary_cone;
           this.regionBoundary_cylinder = regionBoundary_cylinder;
           this.regionBoundary_brick = regionBoundary_brick;
    }


    /**
     * Gets the regionBoundary_sphere value for this RegionBoundaryType.
     * 
     * @return regionBoundary_sphere
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.RegionBoundary_sphereType getRegionBoundary_sphere() {
        return regionBoundary_sphere;
    }


    /**
     * Sets the regionBoundary_sphere value for this RegionBoundaryType.
     * 
     * @param regionBoundary_sphere
     */
    public void setRegionBoundary_sphere(gov.nih.nlm.ncbi.www.soap.eutils.efetch.RegionBoundary_sphereType regionBoundary_sphere) {
        this.regionBoundary_sphere = regionBoundary_sphere;
    }


    /**
     * Gets the regionBoundary_cone value for this RegionBoundaryType.
     * 
     * @return regionBoundary_cone
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.RegionBoundary_coneType getRegionBoundary_cone() {
        return regionBoundary_cone;
    }


    /**
     * Sets the regionBoundary_cone value for this RegionBoundaryType.
     * 
     * @param regionBoundary_cone
     */
    public void setRegionBoundary_cone(gov.nih.nlm.ncbi.www.soap.eutils.efetch.RegionBoundary_coneType regionBoundary_cone) {
        this.regionBoundary_cone = regionBoundary_cone;
    }


    /**
     * Gets the regionBoundary_cylinder value for this RegionBoundaryType.
     * 
     * @return regionBoundary_cylinder
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.RegionBoundary_cylinderType getRegionBoundary_cylinder() {
        return regionBoundary_cylinder;
    }


    /**
     * Sets the regionBoundary_cylinder value for this RegionBoundaryType.
     * 
     * @param regionBoundary_cylinder
     */
    public void setRegionBoundary_cylinder(gov.nih.nlm.ncbi.www.soap.eutils.efetch.RegionBoundary_cylinderType regionBoundary_cylinder) {
        this.regionBoundary_cylinder = regionBoundary_cylinder;
    }


    /**
     * Gets the regionBoundary_brick value for this RegionBoundaryType.
     * 
     * @return regionBoundary_brick
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.RegionBoundary_brickType getRegionBoundary_brick() {
        return regionBoundary_brick;
    }


    /**
     * Sets the regionBoundary_brick value for this RegionBoundaryType.
     * 
     * @param regionBoundary_brick
     */
    public void setRegionBoundary_brick(gov.nih.nlm.ncbi.www.soap.eutils.efetch.RegionBoundary_brickType regionBoundary_brick) {
        this.regionBoundary_brick = regionBoundary_brick;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RegionBoundaryType)) return false;
        RegionBoundaryType other = (RegionBoundaryType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.regionBoundary_sphere==null && other.getRegionBoundary_sphere()==null) || 
             (this.regionBoundary_sphere!=null &&
              this.regionBoundary_sphere.equals(other.getRegionBoundary_sphere()))) &&
            ((this.regionBoundary_cone==null && other.getRegionBoundary_cone()==null) || 
             (this.regionBoundary_cone!=null &&
              this.regionBoundary_cone.equals(other.getRegionBoundary_cone()))) &&
            ((this.regionBoundary_cylinder==null && other.getRegionBoundary_cylinder()==null) || 
             (this.regionBoundary_cylinder!=null &&
              this.regionBoundary_cylinder.equals(other.getRegionBoundary_cylinder()))) &&
            ((this.regionBoundary_brick==null && other.getRegionBoundary_brick()==null) || 
             (this.regionBoundary_brick!=null &&
              this.regionBoundary_brick.equals(other.getRegionBoundary_brick())));
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
        if (getRegionBoundary_sphere() != null) {
            _hashCode += getRegionBoundary_sphere().hashCode();
        }
        if (getRegionBoundary_cone() != null) {
            _hashCode += getRegionBoundary_cone().hashCode();
        }
        if (getRegionBoundary_cylinder() != null) {
            _hashCode += getRegionBoundary_cylinder().hashCode();
        }
        if (getRegionBoundary_brick() != null) {
            _hashCode += getRegionBoundary_brick().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RegionBoundaryType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Region-boundaryType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regionBoundary_sphere");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Region-boundary_sphere"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Region-boundary_sphereType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regionBoundary_cone");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Region-boundary_cone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Region-boundary_coneType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regionBoundary_cylinder");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Region-boundary_cylinder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Region-boundary_cylinderType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regionBoundary_brick");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Region-boundary_brick"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Region-boundary_brickType"));
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
