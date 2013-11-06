/**
 * DomainParentType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class DomainParentType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.DomainParent_parentTypeType domainParent_parentType;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.DomainParent_parentidType domainParent_parentid;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.DomainParent_seqannotType domainParent_seqannot;

    public DomainParentType() {
    }

    public DomainParentType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.DomainParent_parentTypeType domainParent_parentType,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.DomainParent_parentidType domainParent_parentid,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.DomainParent_seqannotType domainParent_seqannot) {
           this.domainParent_parentType = domainParent_parentType;
           this.domainParent_parentid = domainParent_parentid;
           this.domainParent_seqannot = domainParent_seqannot;
    }


    /**
     * Gets the domainParent_parentType value for this DomainParentType.
     * 
     * @return domainParent_parentType
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.DomainParent_parentTypeType getDomainParent_parentType() {
        return domainParent_parentType;
    }


    /**
     * Sets the domainParent_parentType value for this DomainParentType.
     * 
     * @param domainParent_parentType
     */
    public void setDomainParent_parentType(gov.nih.nlm.ncbi.www.soap.eutils.efetch.DomainParent_parentTypeType domainParent_parentType) {
        this.domainParent_parentType = domainParent_parentType;
    }


    /**
     * Gets the domainParent_parentid value for this DomainParentType.
     * 
     * @return domainParent_parentid
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.DomainParent_parentidType getDomainParent_parentid() {
        return domainParent_parentid;
    }


    /**
     * Sets the domainParent_parentid value for this DomainParentType.
     * 
     * @param domainParent_parentid
     */
    public void setDomainParent_parentid(gov.nih.nlm.ncbi.www.soap.eutils.efetch.DomainParent_parentidType domainParent_parentid) {
        this.domainParent_parentid = domainParent_parentid;
    }


    /**
     * Gets the domainParent_seqannot value for this DomainParentType.
     * 
     * @return domainParent_seqannot
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.DomainParent_seqannotType getDomainParent_seqannot() {
        return domainParent_seqannot;
    }


    /**
     * Sets the domainParent_seqannot value for this DomainParentType.
     * 
     * @param domainParent_seqannot
     */
    public void setDomainParent_seqannot(gov.nih.nlm.ncbi.www.soap.eutils.efetch.DomainParent_seqannotType domainParent_seqannot) {
        this.domainParent_seqannot = domainParent_seqannot;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DomainParentType)) return false;
        DomainParentType other = (DomainParentType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.domainParent_parentType==null && other.getDomainParent_parentType()==null) || 
             (this.domainParent_parentType!=null &&
              this.domainParent_parentType.equals(other.getDomainParent_parentType()))) &&
            ((this.domainParent_parentid==null && other.getDomainParent_parentid()==null) || 
             (this.domainParent_parentid!=null &&
              this.domainParent_parentid.equals(other.getDomainParent_parentid()))) &&
            ((this.domainParent_seqannot==null && other.getDomainParent_seqannot()==null) || 
             (this.domainParent_seqannot!=null &&
              this.domainParent_seqannot.equals(other.getDomainParent_seqannot())));
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
        if (getDomainParent_parentType() != null) {
            _hashCode += getDomainParent_parentType().hashCode();
        }
        if (getDomainParent_parentid() != null) {
            _hashCode += getDomainParent_parentid().hashCode();
        }
        if (getDomainParent_seqannot() != null) {
            _hashCode += getDomainParent_seqannot().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DomainParentType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Domain-parentType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("domainParent_parentType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Domain-parent_parent-type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Domain-parent_parent-typeType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("domainParent_parentid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Domain-parent_parentid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Domain-parent_parentidType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("domainParent_seqannot");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Domain-parent_seqannot"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Domain-parent_seqannotType"));
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
