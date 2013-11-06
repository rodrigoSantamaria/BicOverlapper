/**
 * RMReplyType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class RMReplyType  implements java.io.Serializable {
    private java.lang.String RMReply_error;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.RMReply_remapType RMReply_remap;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.RMReply_mapsToBuildsType RMReply_mapsToBuilds;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.RMReply_mapsFromBuildsType RMReply_mapsFromBuilds;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.RMReply_allBuildsType RMReply_allBuilds;

    public RMReplyType() {
    }

    public RMReplyType(
           java.lang.String RMReply_error,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.RMReply_remapType RMReply_remap,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.RMReply_mapsToBuildsType RMReply_mapsToBuilds,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.RMReply_mapsFromBuildsType RMReply_mapsFromBuilds,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.RMReply_allBuildsType RMReply_allBuilds) {
           this.RMReply_error = RMReply_error;
           this.RMReply_remap = RMReply_remap;
           this.RMReply_mapsToBuilds = RMReply_mapsToBuilds;
           this.RMReply_mapsFromBuilds = RMReply_mapsFromBuilds;
           this.RMReply_allBuilds = RMReply_allBuilds;
    }


    /**
     * Gets the RMReply_error value for this RMReplyType.
     * 
     * @return RMReply_error
     */
    public java.lang.String getRMReply_error() {
        return RMReply_error;
    }


    /**
     * Sets the RMReply_error value for this RMReplyType.
     * 
     * @param RMReply_error
     */
    public void setRMReply_error(java.lang.String RMReply_error) {
        this.RMReply_error = RMReply_error;
    }


    /**
     * Gets the RMReply_remap value for this RMReplyType.
     * 
     * @return RMReply_remap
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.RMReply_remapType getRMReply_remap() {
        return RMReply_remap;
    }


    /**
     * Sets the RMReply_remap value for this RMReplyType.
     * 
     * @param RMReply_remap
     */
    public void setRMReply_remap(gov.nih.nlm.ncbi.www.soap.eutils.efetch.RMReply_remapType RMReply_remap) {
        this.RMReply_remap = RMReply_remap;
    }


    /**
     * Gets the RMReply_mapsToBuilds value for this RMReplyType.
     * 
     * @return RMReply_mapsToBuilds
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.RMReply_mapsToBuildsType getRMReply_mapsToBuilds() {
        return RMReply_mapsToBuilds;
    }


    /**
     * Sets the RMReply_mapsToBuilds value for this RMReplyType.
     * 
     * @param RMReply_mapsToBuilds
     */
    public void setRMReply_mapsToBuilds(gov.nih.nlm.ncbi.www.soap.eutils.efetch.RMReply_mapsToBuildsType RMReply_mapsToBuilds) {
        this.RMReply_mapsToBuilds = RMReply_mapsToBuilds;
    }


    /**
     * Gets the RMReply_mapsFromBuilds value for this RMReplyType.
     * 
     * @return RMReply_mapsFromBuilds
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.RMReply_mapsFromBuildsType getRMReply_mapsFromBuilds() {
        return RMReply_mapsFromBuilds;
    }


    /**
     * Sets the RMReply_mapsFromBuilds value for this RMReplyType.
     * 
     * @param RMReply_mapsFromBuilds
     */
    public void setRMReply_mapsFromBuilds(gov.nih.nlm.ncbi.www.soap.eutils.efetch.RMReply_mapsFromBuildsType RMReply_mapsFromBuilds) {
        this.RMReply_mapsFromBuilds = RMReply_mapsFromBuilds;
    }


    /**
     * Gets the RMReply_allBuilds value for this RMReplyType.
     * 
     * @return RMReply_allBuilds
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.RMReply_allBuildsType getRMReply_allBuilds() {
        return RMReply_allBuilds;
    }


    /**
     * Sets the RMReply_allBuilds value for this RMReplyType.
     * 
     * @param RMReply_allBuilds
     */
    public void setRMReply_allBuilds(gov.nih.nlm.ncbi.www.soap.eutils.efetch.RMReply_allBuildsType RMReply_allBuilds) {
        this.RMReply_allBuilds = RMReply_allBuilds;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RMReplyType)) return false;
        RMReplyType other = (RMReplyType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.RMReply_error==null && other.getRMReply_error()==null) || 
             (this.RMReply_error!=null &&
              this.RMReply_error.equals(other.getRMReply_error()))) &&
            ((this.RMReply_remap==null && other.getRMReply_remap()==null) || 
             (this.RMReply_remap!=null &&
              this.RMReply_remap.equals(other.getRMReply_remap()))) &&
            ((this.RMReply_mapsToBuilds==null && other.getRMReply_mapsToBuilds()==null) || 
             (this.RMReply_mapsToBuilds!=null &&
              this.RMReply_mapsToBuilds.equals(other.getRMReply_mapsToBuilds()))) &&
            ((this.RMReply_mapsFromBuilds==null && other.getRMReply_mapsFromBuilds()==null) || 
             (this.RMReply_mapsFromBuilds!=null &&
              this.RMReply_mapsFromBuilds.equals(other.getRMReply_mapsFromBuilds()))) &&
            ((this.RMReply_allBuilds==null && other.getRMReply_allBuilds()==null) || 
             (this.RMReply_allBuilds!=null &&
              this.RMReply_allBuilds.equals(other.getRMReply_allBuilds())));
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
        if (getRMReply_error() != null) {
            _hashCode += getRMReply_error().hashCode();
        }
        if (getRMReply_remap() != null) {
            _hashCode += getRMReply_remap().hashCode();
        }
        if (getRMReply_mapsToBuilds() != null) {
            _hashCode += getRMReply_mapsToBuilds().hashCode();
        }
        if (getRMReply_mapsFromBuilds() != null) {
            _hashCode += getRMReply_mapsFromBuilds().hashCode();
        }
        if (getRMReply_allBuilds() != null) {
            _hashCode += getRMReply_allBuilds().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RMReplyType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "RMReplyType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RMReply_error");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "RMReply_error"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RMReply_remap");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "RMReply_remap"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "RMReply_remapType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RMReply_mapsToBuilds");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "RMReply_maps-to-builds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "RMReply_maps-to-buildsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RMReply_mapsFromBuilds");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "RMReply_maps-from-builds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "RMReply_maps-from-buildsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RMReply_allBuilds");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "RMReply_all-builds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "RMReply_all-buildsType"));
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
