/**
 * RemapQueryType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class RemapQueryType  implements java.io.Serializable {
    private java.lang.String remapQuery_fromBuild;

    private java.lang.String remapQuery_toBuild;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.RemapQuery_locsType remapQuery_locs;

    public RemapQueryType() {
    }

    public RemapQueryType(
           java.lang.String remapQuery_fromBuild,
           java.lang.String remapQuery_toBuild,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.RemapQuery_locsType remapQuery_locs) {
           this.remapQuery_fromBuild = remapQuery_fromBuild;
           this.remapQuery_toBuild = remapQuery_toBuild;
           this.remapQuery_locs = remapQuery_locs;
    }


    /**
     * Gets the remapQuery_fromBuild value for this RemapQueryType.
     * 
     * @return remapQuery_fromBuild
     */
    public java.lang.String getRemapQuery_fromBuild() {
        return remapQuery_fromBuild;
    }


    /**
     * Sets the remapQuery_fromBuild value for this RemapQueryType.
     * 
     * @param remapQuery_fromBuild
     */
    public void setRemapQuery_fromBuild(java.lang.String remapQuery_fromBuild) {
        this.remapQuery_fromBuild = remapQuery_fromBuild;
    }


    /**
     * Gets the remapQuery_toBuild value for this RemapQueryType.
     * 
     * @return remapQuery_toBuild
     */
    public java.lang.String getRemapQuery_toBuild() {
        return remapQuery_toBuild;
    }


    /**
     * Sets the remapQuery_toBuild value for this RemapQueryType.
     * 
     * @param remapQuery_toBuild
     */
    public void setRemapQuery_toBuild(java.lang.String remapQuery_toBuild) {
        this.remapQuery_toBuild = remapQuery_toBuild;
    }


    /**
     * Gets the remapQuery_locs value for this RemapQueryType.
     * 
     * @return remapQuery_locs
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.RemapQuery_locsType getRemapQuery_locs() {
        return remapQuery_locs;
    }


    /**
     * Sets the remapQuery_locs value for this RemapQueryType.
     * 
     * @param remapQuery_locs
     */
    public void setRemapQuery_locs(gov.nih.nlm.ncbi.www.soap.eutils.efetch.RemapQuery_locsType remapQuery_locs) {
        this.remapQuery_locs = remapQuery_locs;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RemapQueryType)) return false;
        RemapQueryType other = (RemapQueryType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.remapQuery_fromBuild==null && other.getRemapQuery_fromBuild()==null) || 
             (this.remapQuery_fromBuild!=null &&
              this.remapQuery_fromBuild.equals(other.getRemapQuery_fromBuild()))) &&
            ((this.remapQuery_toBuild==null && other.getRemapQuery_toBuild()==null) || 
             (this.remapQuery_toBuild!=null &&
              this.remapQuery_toBuild.equals(other.getRemapQuery_toBuild()))) &&
            ((this.remapQuery_locs==null && other.getRemapQuery_locs()==null) || 
             (this.remapQuery_locs!=null &&
              this.remapQuery_locs.equals(other.getRemapQuery_locs())));
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
        if (getRemapQuery_fromBuild() != null) {
            _hashCode += getRemapQuery_fromBuild().hashCode();
        }
        if (getRemapQuery_toBuild() != null) {
            _hashCode += getRemapQuery_toBuild().hashCode();
        }
        if (getRemapQuery_locs() != null) {
            _hashCode += getRemapQuery_locs().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RemapQueryType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Remap-queryType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remapQuery_fromBuild");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Remap-query_from-build"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remapQuery_toBuild");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Remap-query_to-build"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remapQuery_locs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Remap-query_locs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Remap-query_locsType"));
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
