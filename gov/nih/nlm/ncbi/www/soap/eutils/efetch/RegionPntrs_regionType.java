/**
 * RegionPntrs_regionType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class RegionPntrs_regionType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.RegionPntrs_region_siteType regionPntrs_region_site;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.RegionPntrs_region_boundaryType regionPntrs_region_boundary;

    public RegionPntrs_regionType() {
    }

    public RegionPntrs_regionType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.RegionPntrs_region_siteType regionPntrs_region_site,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.RegionPntrs_region_boundaryType regionPntrs_region_boundary) {
           this.regionPntrs_region_site = regionPntrs_region_site;
           this.regionPntrs_region_boundary = regionPntrs_region_boundary;
    }


    /**
     * Gets the regionPntrs_region_site value for this RegionPntrs_regionType.
     * 
     * @return regionPntrs_region_site
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.RegionPntrs_region_siteType getRegionPntrs_region_site() {
        return regionPntrs_region_site;
    }


    /**
     * Sets the regionPntrs_region_site value for this RegionPntrs_regionType.
     * 
     * @param regionPntrs_region_site
     */
    public void setRegionPntrs_region_site(gov.nih.nlm.ncbi.www.soap.eutils.efetch.RegionPntrs_region_siteType regionPntrs_region_site) {
        this.regionPntrs_region_site = regionPntrs_region_site;
    }


    /**
     * Gets the regionPntrs_region_boundary value for this RegionPntrs_regionType.
     * 
     * @return regionPntrs_region_boundary
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.RegionPntrs_region_boundaryType getRegionPntrs_region_boundary() {
        return regionPntrs_region_boundary;
    }


    /**
     * Sets the regionPntrs_region_boundary value for this RegionPntrs_regionType.
     * 
     * @param regionPntrs_region_boundary
     */
    public void setRegionPntrs_region_boundary(gov.nih.nlm.ncbi.www.soap.eutils.efetch.RegionPntrs_region_boundaryType regionPntrs_region_boundary) {
        this.regionPntrs_region_boundary = regionPntrs_region_boundary;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RegionPntrs_regionType)) return false;
        RegionPntrs_regionType other = (RegionPntrs_regionType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.regionPntrs_region_site==null && other.getRegionPntrs_region_site()==null) || 
             (this.regionPntrs_region_site!=null &&
              this.regionPntrs_region_site.equals(other.getRegionPntrs_region_site()))) &&
            ((this.regionPntrs_region_boundary==null && other.getRegionPntrs_region_boundary()==null) || 
             (this.regionPntrs_region_boundary!=null &&
              this.regionPntrs_region_boundary.equals(other.getRegionPntrs_region_boundary())));
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
        if (getRegionPntrs_region_site() != null) {
            _hashCode += getRegionPntrs_region_site().hashCode();
        }
        if (getRegionPntrs_region_boundary() != null) {
            _hashCode += getRegionPntrs_region_boundary().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RegionPntrs_regionType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Region-pntrs_regionType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regionPntrs_region_site");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Region-pntrs_region_site"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Region-pntrs_region_siteType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regionPntrs_region_boundary");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Region-pntrs_region_boundary"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Region-pntrs_region_boundaryType"));
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
