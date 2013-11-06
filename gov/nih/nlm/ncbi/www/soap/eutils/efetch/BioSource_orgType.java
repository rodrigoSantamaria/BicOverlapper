/**
 * BioSource_orgType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class BioSource_orgType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.OrgRefType orgRef;

    public BioSource_orgType() {
    }

    public BioSource_orgType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.OrgRefType orgRef) {
           this.orgRef = orgRef;
    }


    /**
     * Gets the orgRef value for this BioSource_orgType.
     * 
     * @return orgRef
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.OrgRefType getOrgRef() {
        return orgRef;
    }


    /**
     * Sets the orgRef value for this BioSource_orgType.
     * 
     * @param orgRef
     */
    public void setOrgRef(gov.nih.nlm.ncbi.www.soap.eutils.efetch.OrgRefType orgRef) {
        this.orgRef = orgRef;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BioSource_orgType)) return false;
        BioSource_orgType other = (BioSource_orgType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.orgRef==null && other.getOrgRef()==null) || 
             (this.orgRef!=null &&
              this.orgRef.equals(other.getOrgRef())));
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
        if (getOrgRef() != null) {
            _hashCode += getOrgRef().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BioSource_orgType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "BioSource_orgType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orgRef");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Org-ref"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Org-refType"));
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
