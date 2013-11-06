/**
 * RMRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class RMRequestType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.RMRequest_remapType RMRequest_remap;

    private java.lang.String RMRequest_mapsToBuilds;

    private java.lang.String RMRequest_mapsFromBuilds;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.RMRequest_allBuilds RMRequest_allBuilds;

    public RMRequestType() {
    }

    public RMRequestType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.RMRequest_remapType RMRequest_remap,
           java.lang.String RMRequest_mapsToBuilds,
           java.lang.String RMRequest_mapsFromBuilds,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.RMRequest_allBuilds RMRequest_allBuilds) {
           this.RMRequest_remap = RMRequest_remap;
           this.RMRequest_mapsToBuilds = RMRequest_mapsToBuilds;
           this.RMRequest_mapsFromBuilds = RMRequest_mapsFromBuilds;
           this.RMRequest_allBuilds = RMRequest_allBuilds;
    }


    /**
     * Gets the RMRequest_remap value for this RMRequestType.
     * 
     * @return RMRequest_remap
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.RMRequest_remapType getRMRequest_remap() {
        return RMRequest_remap;
    }


    /**
     * Sets the RMRequest_remap value for this RMRequestType.
     * 
     * @param RMRequest_remap
     */
    public void setRMRequest_remap(gov.nih.nlm.ncbi.www.soap.eutils.efetch.RMRequest_remapType RMRequest_remap) {
        this.RMRequest_remap = RMRequest_remap;
    }


    /**
     * Gets the RMRequest_mapsToBuilds value for this RMRequestType.
     * 
     * @return RMRequest_mapsToBuilds
     */
    public java.lang.String getRMRequest_mapsToBuilds() {
        return RMRequest_mapsToBuilds;
    }


    /**
     * Sets the RMRequest_mapsToBuilds value for this RMRequestType.
     * 
     * @param RMRequest_mapsToBuilds
     */
    public void setRMRequest_mapsToBuilds(java.lang.String RMRequest_mapsToBuilds) {
        this.RMRequest_mapsToBuilds = RMRequest_mapsToBuilds;
    }


    /**
     * Gets the RMRequest_mapsFromBuilds value for this RMRequestType.
     * 
     * @return RMRequest_mapsFromBuilds
     */
    public java.lang.String getRMRequest_mapsFromBuilds() {
        return RMRequest_mapsFromBuilds;
    }


    /**
     * Sets the RMRequest_mapsFromBuilds value for this RMRequestType.
     * 
     * @param RMRequest_mapsFromBuilds
     */
    public void setRMRequest_mapsFromBuilds(java.lang.String RMRequest_mapsFromBuilds) {
        this.RMRequest_mapsFromBuilds = RMRequest_mapsFromBuilds;
    }


    /**
     * Gets the RMRequest_allBuilds value for this RMRequestType.
     * 
     * @return RMRequest_allBuilds
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.RMRequest_allBuilds getRMRequest_allBuilds() {
        return RMRequest_allBuilds;
    }


    /**
     * Sets the RMRequest_allBuilds value for this RMRequestType.
     * 
     * @param RMRequest_allBuilds
     */
    public void setRMRequest_allBuilds(gov.nih.nlm.ncbi.www.soap.eutils.efetch.RMRequest_allBuilds RMRequest_allBuilds) {
        this.RMRequest_allBuilds = RMRequest_allBuilds;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RMRequestType)) return false;
        RMRequestType other = (RMRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.RMRequest_remap==null && other.getRMRequest_remap()==null) || 
             (this.RMRequest_remap!=null &&
              this.RMRequest_remap.equals(other.getRMRequest_remap()))) &&
            ((this.RMRequest_mapsToBuilds==null && other.getRMRequest_mapsToBuilds()==null) || 
             (this.RMRequest_mapsToBuilds!=null &&
              this.RMRequest_mapsToBuilds.equals(other.getRMRequest_mapsToBuilds()))) &&
            ((this.RMRequest_mapsFromBuilds==null && other.getRMRequest_mapsFromBuilds()==null) || 
             (this.RMRequest_mapsFromBuilds!=null &&
              this.RMRequest_mapsFromBuilds.equals(other.getRMRequest_mapsFromBuilds()))) &&
            ((this.RMRequest_allBuilds==null && other.getRMRequest_allBuilds()==null) || 
             (this.RMRequest_allBuilds!=null &&
              this.RMRequest_allBuilds.equals(other.getRMRequest_allBuilds())));
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
        if (getRMRequest_remap() != null) {
            _hashCode += getRMRequest_remap().hashCode();
        }
        if (getRMRequest_mapsToBuilds() != null) {
            _hashCode += getRMRequest_mapsToBuilds().hashCode();
        }
        if (getRMRequest_mapsFromBuilds() != null) {
            _hashCode += getRMRequest_mapsFromBuilds().hashCode();
        }
        if (getRMRequest_allBuilds() != null) {
            _hashCode += getRMRequest_allBuilds().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RMRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "RMRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RMRequest_remap");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "RMRequest_remap"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "RMRequest_remapType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RMRequest_mapsToBuilds");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "RMRequest_maps-to-builds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RMRequest_mapsFromBuilds");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "RMRequest_maps-from-builds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RMRequest_allBuilds");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "RMRequest_all-builds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">RMRequest_all-builds"));
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
