/**
 * RegionPntrs_region_siteType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class RegionPntrs_region_siteType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.RegionCoordinatesType[] regionCoordinates;

    public RegionPntrs_region_siteType() {
    }

    public RegionPntrs_region_siteType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.RegionCoordinatesType[] regionCoordinates) {
           this.regionCoordinates = regionCoordinates;
    }


    /**
     * Gets the regionCoordinates value for this RegionPntrs_region_siteType.
     * 
     * @return regionCoordinates
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.RegionCoordinatesType[] getRegionCoordinates() {
        return regionCoordinates;
    }


    /**
     * Sets the regionCoordinates value for this RegionPntrs_region_siteType.
     * 
     * @param regionCoordinates
     */
    public void setRegionCoordinates(gov.nih.nlm.ncbi.www.soap.eutils.efetch.RegionCoordinatesType[] regionCoordinates) {
        this.regionCoordinates = regionCoordinates;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.RegionCoordinatesType getRegionCoordinates(int i) {
        return this.regionCoordinates[i];
    }

    public void setRegionCoordinates(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.RegionCoordinatesType _value) {
        this.regionCoordinates[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RegionPntrs_region_siteType)) return false;
        RegionPntrs_region_siteType other = (RegionPntrs_region_siteType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.regionCoordinates==null && other.getRegionCoordinates()==null) || 
             (this.regionCoordinates!=null &&
              java.util.Arrays.equals(this.regionCoordinates, other.getRegionCoordinates())));
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
        if (getRegionCoordinates() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRegionCoordinates());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRegionCoordinates(), i);
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
        new org.apache.axis.description.TypeDesc(RegionPntrs_region_siteType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Region-pntrs_region_siteType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regionCoordinates");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Region-coordinates"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Region-coordinatesType"));
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
