/**
 * FeatDefGroupSet.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class FeatDefGroupSet  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.FeatDefGroupSet_groupsType featDefGroupSet_groups;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.FeatDefGroupSet_defsType featDefGroupSet_defs;

    public FeatDefGroupSet() {
    }

    public FeatDefGroupSet(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.FeatDefGroupSet_groupsType featDefGroupSet_groups,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.FeatDefGroupSet_defsType featDefGroupSet_defs) {
           this.featDefGroupSet_groups = featDefGroupSet_groups;
           this.featDefGroupSet_defs = featDefGroupSet_defs;
    }


    /**
     * Gets the featDefGroupSet_groups value for this FeatDefGroupSet.
     * 
     * @return featDefGroupSet_groups
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.FeatDefGroupSet_groupsType getFeatDefGroupSet_groups() {
        return featDefGroupSet_groups;
    }


    /**
     * Sets the featDefGroupSet_groups value for this FeatDefGroupSet.
     * 
     * @param featDefGroupSet_groups
     */
    public void setFeatDefGroupSet_groups(gov.nih.nlm.ncbi.www.soap.eutils.efetch.FeatDefGroupSet_groupsType featDefGroupSet_groups) {
        this.featDefGroupSet_groups = featDefGroupSet_groups;
    }


    /**
     * Gets the featDefGroupSet_defs value for this FeatDefGroupSet.
     * 
     * @return featDefGroupSet_defs
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.FeatDefGroupSet_defsType getFeatDefGroupSet_defs() {
        return featDefGroupSet_defs;
    }


    /**
     * Sets the featDefGroupSet_defs value for this FeatDefGroupSet.
     * 
     * @param featDefGroupSet_defs
     */
    public void setFeatDefGroupSet_defs(gov.nih.nlm.ncbi.www.soap.eutils.efetch.FeatDefGroupSet_defsType featDefGroupSet_defs) {
        this.featDefGroupSet_defs = featDefGroupSet_defs;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FeatDefGroupSet)) return false;
        FeatDefGroupSet other = (FeatDefGroupSet) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.featDefGroupSet_groups==null && other.getFeatDefGroupSet_groups()==null) || 
             (this.featDefGroupSet_groups!=null &&
              this.featDefGroupSet_groups.equals(other.getFeatDefGroupSet_groups()))) &&
            ((this.featDefGroupSet_defs==null && other.getFeatDefGroupSet_defs()==null) || 
             (this.featDefGroupSet_defs!=null &&
              this.featDefGroupSet_defs.equals(other.getFeatDefGroupSet_defs())));
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
        if (getFeatDefGroupSet_groups() != null) {
            _hashCode += getFeatDefGroupSet_groups().hashCode();
        }
        if (getFeatDefGroupSet_defs() != null) {
            _hashCode += getFeatDefGroupSet_defs().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FeatDefGroupSet.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">FeatDefGroupSet"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("featDefGroupSet_groups");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "FeatDefGroupSet_groups"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "FeatDefGroupSet_groupsType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("featDefGroupSet_defs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "FeatDefGroupSet_defs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "FeatDefGroupSet_defsType"));
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
