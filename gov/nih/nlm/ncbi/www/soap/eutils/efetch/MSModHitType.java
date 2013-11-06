/**
 * MSModHitType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class MSModHitType  implements java.io.Serializable {
    private java.lang.String MSModHit_site;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSModHit_modtypeType MSModHit_modtype;

    public MSModHitType() {
    }

    public MSModHitType(
           java.lang.String MSModHit_site,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSModHit_modtypeType MSModHit_modtype) {
           this.MSModHit_site = MSModHit_site;
           this.MSModHit_modtype = MSModHit_modtype;
    }


    /**
     * Gets the MSModHit_site value for this MSModHitType.
     * 
     * @return MSModHit_site
     */
    public java.lang.String getMSModHit_site() {
        return MSModHit_site;
    }


    /**
     * Sets the MSModHit_site value for this MSModHitType.
     * 
     * @param MSModHit_site
     */
    public void setMSModHit_site(java.lang.String MSModHit_site) {
        this.MSModHit_site = MSModHit_site;
    }


    /**
     * Gets the MSModHit_modtype value for this MSModHitType.
     * 
     * @return MSModHit_modtype
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSModHit_modtypeType getMSModHit_modtype() {
        return MSModHit_modtype;
    }


    /**
     * Sets the MSModHit_modtype value for this MSModHitType.
     * 
     * @param MSModHit_modtype
     */
    public void setMSModHit_modtype(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSModHit_modtypeType MSModHit_modtype) {
        this.MSModHit_modtype = MSModHit_modtype;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MSModHitType)) return false;
        MSModHitType other = (MSModHitType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.MSModHit_site==null && other.getMSModHit_site()==null) || 
             (this.MSModHit_site!=null &&
              this.MSModHit_site.equals(other.getMSModHit_site()))) &&
            ((this.MSModHit_modtype==null && other.getMSModHit_modtype()==null) || 
             (this.MSModHit_modtype!=null &&
              this.MSModHit_modtype.equals(other.getMSModHit_modtype())));
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
        if (getMSModHit_site() != null) {
            _hashCode += getMSModHit_site().hashCode();
        }
        if (getMSModHit_modtype() != null) {
            _hashCode += getMSModHit_modtype().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MSModHitType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSModHitType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSModHit_site");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSModHit_site"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSModHit_modtype");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSModHit_modtype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSModHit_modtypeType"));
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
