/**
 * ELinkResultMS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.elink;

public class ELinkResultMS  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.elink.ELinkResultType eLinkResult;

    public ELinkResultMS() {
    }

    public ELinkResultMS(
           gov.nih.nlm.ncbi.www.soap.eutils.elink.ELinkResultType eLinkResult) {
           this.eLinkResult = eLinkResult;
    }


    /**
     * Gets the eLinkResult value for this ELinkResultMS.
     * 
     * @return eLinkResult
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.elink.ELinkResultType getELinkResult() {
        return eLinkResult;
    }


    /**
     * Sets the eLinkResult value for this ELinkResultMS.
     * 
     * @param eLinkResult
     */
    public void setELinkResult(gov.nih.nlm.ncbi.www.soap.eutils.elink.ELinkResultType eLinkResult) {
        this.eLinkResult = eLinkResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ELinkResultMS)) return false;
        ELinkResultMS other = (ELinkResultMS) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.eLinkResult==null && other.getELinkResult()==null) || 
             (this.eLinkResult!=null &&
              this.eLinkResult.equals(other.getELinkResult())));
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
        if (getELinkResult() != null) {
            _hashCode += getELinkResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ELinkResultMS.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/elink", ">eLinkResultMS"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ELinkResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/elink", "eLinkResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/elink", "eLinkResultType"));
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
