/**
 * RegionPntrs_region_boundaryType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class RegionPntrs_region_boundaryType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.RegionBoundaryType[] regionBoundary;

    public RegionPntrs_region_boundaryType() {
    }

    public RegionPntrs_region_boundaryType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.RegionBoundaryType[] regionBoundary) {
           this.regionBoundary = regionBoundary;
    }


    /**
     * Gets the regionBoundary value for this RegionPntrs_region_boundaryType.
     * 
     * @return regionBoundary
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.RegionBoundaryType[] getRegionBoundary() {
        return regionBoundary;
    }


    /**
     * Sets the regionBoundary value for this RegionPntrs_region_boundaryType.
     * 
     * @param regionBoundary
     */
    public void setRegionBoundary(gov.nih.nlm.ncbi.www.soap.eutils.efetch.RegionBoundaryType[] regionBoundary) {
        this.regionBoundary = regionBoundary;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.RegionBoundaryType getRegionBoundary(int i) {
        return this.regionBoundary[i];
    }

    public void setRegionBoundary(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.RegionBoundaryType _value) {
        this.regionBoundary[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RegionPntrs_region_boundaryType)) return false;
        RegionPntrs_region_boundaryType other = (RegionPntrs_region_boundaryType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.regionBoundary==null && other.getRegionBoundary()==null) || 
             (this.regionBoundary!=null &&
              java.util.Arrays.equals(this.regionBoundary, other.getRegionBoundary())));
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
        if (getRegionBoundary() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRegionBoundary());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRegionBoundary(), i);
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
        new org.apache.axis.description.TypeDesc(RegionPntrs_region_boundaryType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Region-pntrs_region_boundaryType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regionBoundary");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Region-boundary"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Region-boundaryType"));
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
