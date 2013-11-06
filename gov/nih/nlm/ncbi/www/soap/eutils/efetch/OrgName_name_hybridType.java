/**
 * OrgName_name_hybridType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class OrgName_name_hybridType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MultiOrgNameType multiOrgName;

    public OrgName_name_hybridType() {
    }

    public OrgName_name_hybridType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MultiOrgNameType multiOrgName) {
           this.multiOrgName = multiOrgName;
    }


    /**
     * Gets the multiOrgName value for this OrgName_name_hybridType.
     * 
     * @return multiOrgName
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MultiOrgNameType getMultiOrgName() {
        return multiOrgName;
    }


    /**
     * Sets the multiOrgName value for this OrgName_name_hybridType.
     * 
     * @param multiOrgName
     */
    public void setMultiOrgName(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MultiOrgNameType multiOrgName) {
        this.multiOrgName = multiOrgName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OrgName_name_hybridType)) return false;
        OrgName_name_hybridType other = (OrgName_name_hybridType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.multiOrgName==null && other.getMultiOrgName()==null) || 
             (this.multiOrgName!=null &&
              this.multiOrgName.equals(other.getMultiOrgName())));
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
        if (getMultiOrgName() != null) {
            _hashCode += getMultiOrgName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OrgName_name_hybridType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "OrgName_name_hybridType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("multiOrgName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MultiOrgName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MultiOrgNameType"));
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
