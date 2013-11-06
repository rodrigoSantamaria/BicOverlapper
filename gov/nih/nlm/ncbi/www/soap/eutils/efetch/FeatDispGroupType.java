/**
 * FeatDispGroupType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class FeatDispGroupType  implements java.io.Serializable {
    private java.lang.String featDispGroup_groupkey;

    private java.lang.String featDispGroup_groupname;

    public FeatDispGroupType() {
    }

    public FeatDispGroupType(
           java.lang.String featDispGroup_groupkey,
           java.lang.String featDispGroup_groupname) {
           this.featDispGroup_groupkey = featDispGroup_groupkey;
           this.featDispGroup_groupname = featDispGroup_groupname;
    }


    /**
     * Gets the featDispGroup_groupkey value for this FeatDispGroupType.
     * 
     * @return featDispGroup_groupkey
     */
    public java.lang.String getFeatDispGroup_groupkey() {
        return featDispGroup_groupkey;
    }


    /**
     * Sets the featDispGroup_groupkey value for this FeatDispGroupType.
     * 
     * @param featDispGroup_groupkey
     */
    public void setFeatDispGroup_groupkey(java.lang.String featDispGroup_groupkey) {
        this.featDispGroup_groupkey = featDispGroup_groupkey;
    }


    /**
     * Gets the featDispGroup_groupname value for this FeatDispGroupType.
     * 
     * @return featDispGroup_groupname
     */
    public java.lang.String getFeatDispGroup_groupname() {
        return featDispGroup_groupname;
    }


    /**
     * Sets the featDispGroup_groupname value for this FeatDispGroupType.
     * 
     * @param featDispGroup_groupname
     */
    public void setFeatDispGroup_groupname(java.lang.String featDispGroup_groupname) {
        this.featDispGroup_groupname = featDispGroup_groupname;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FeatDispGroupType)) return false;
        FeatDispGroupType other = (FeatDispGroupType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.featDispGroup_groupkey==null && other.getFeatDispGroup_groupkey()==null) || 
             (this.featDispGroup_groupkey!=null &&
              this.featDispGroup_groupkey.equals(other.getFeatDispGroup_groupkey()))) &&
            ((this.featDispGroup_groupname==null && other.getFeatDispGroup_groupname()==null) || 
             (this.featDispGroup_groupname!=null &&
              this.featDispGroup_groupname.equals(other.getFeatDispGroup_groupname())));
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
        if (getFeatDispGroup_groupkey() != null) {
            _hashCode += getFeatDispGroup_groupkey().hashCode();
        }
        if (getFeatDispGroup_groupname() != null) {
            _hashCode += getFeatDispGroup_groupname().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FeatDispGroupType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "FeatDispGroupType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("featDispGroup_groupkey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "FeatDispGroup_groupkey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("featDispGroup_groupname");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "FeatDispGroup_groupname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
