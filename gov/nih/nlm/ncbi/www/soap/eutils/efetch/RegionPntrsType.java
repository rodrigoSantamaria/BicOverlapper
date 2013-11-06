/**
 * RegionPntrsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class RegionPntrsType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.RegionPntrs_modelIdType regionPntrs_modelId;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.RegionPntrs_regionType regionPntrs_region;

    public RegionPntrsType() {
    }

    public RegionPntrsType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.RegionPntrs_modelIdType regionPntrs_modelId,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.RegionPntrs_regionType regionPntrs_region) {
           this.regionPntrs_modelId = regionPntrs_modelId;
           this.regionPntrs_region = regionPntrs_region;
    }


    /**
     * Gets the regionPntrs_modelId value for this RegionPntrsType.
     * 
     * @return regionPntrs_modelId
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.RegionPntrs_modelIdType getRegionPntrs_modelId() {
        return regionPntrs_modelId;
    }


    /**
     * Sets the regionPntrs_modelId value for this RegionPntrsType.
     * 
     * @param regionPntrs_modelId
     */
    public void setRegionPntrs_modelId(gov.nih.nlm.ncbi.www.soap.eutils.efetch.RegionPntrs_modelIdType regionPntrs_modelId) {
        this.regionPntrs_modelId = regionPntrs_modelId;
    }


    /**
     * Gets the regionPntrs_region value for this RegionPntrsType.
     * 
     * @return regionPntrs_region
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.RegionPntrs_regionType getRegionPntrs_region() {
        return regionPntrs_region;
    }


    /**
     * Sets the regionPntrs_region value for this RegionPntrsType.
     * 
     * @param regionPntrs_region
     */
    public void setRegionPntrs_region(gov.nih.nlm.ncbi.www.soap.eutils.efetch.RegionPntrs_regionType regionPntrs_region) {
        this.regionPntrs_region = regionPntrs_region;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RegionPntrsType)) return false;
        RegionPntrsType other = (RegionPntrsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.regionPntrs_modelId==null && other.getRegionPntrs_modelId()==null) || 
             (this.regionPntrs_modelId!=null &&
              this.regionPntrs_modelId.equals(other.getRegionPntrs_modelId()))) &&
            ((this.regionPntrs_region==null && other.getRegionPntrs_region()==null) || 
             (this.regionPntrs_region!=null &&
              this.regionPntrs_region.equals(other.getRegionPntrs_region())));
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
        if (getRegionPntrs_modelId() != null) {
            _hashCode += getRegionPntrs_modelId().hashCode();
        }
        if (getRegionPntrs_region() != null) {
            _hashCode += getRegionPntrs_region().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RegionPntrsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Region-pntrsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regionPntrs_modelId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Region-pntrs_model-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Region-pntrs_model-idType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regionPntrs_region");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Region-pntrs_region"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Region-pntrs_regionType"));
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
