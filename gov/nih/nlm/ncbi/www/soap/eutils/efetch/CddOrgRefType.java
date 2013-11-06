/**
 * CddOrgRefType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class CddOrgRefType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.CddOrgRef_referenceType cddOrgRef_reference;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.CddOrgRef_activeType cddOrgRef_active;

    private java.lang.String cddOrgRef_parentTaxId;

    private java.lang.String cddOrgRef_rank;

    public CddOrgRefType() {
    }

    public CddOrgRefType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.CddOrgRef_referenceType cddOrgRef_reference,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.CddOrgRef_activeType cddOrgRef_active,
           java.lang.String cddOrgRef_parentTaxId,
           java.lang.String cddOrgRef_rank) {
           this.cddOrgRef_reference = cddOrgRef_reference;
           this.cddOrgRef_active = cddOrgRef_active;
           this.cddOrgRef_parentTaxId = cddOrgRef_parentTaxId;
           this.cddOrgRef_rank = cddOrgRef_rank;
    }


    /**
     * Gets the cddOrgRef_reference value for this CddOrgRefType.
     * 
     * @return cddOrgRef_reference
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.CddOrgRef_referenceType getCddOrgRef_reference() {
        return cddOrgRef_reference;
    }


    /**
     * Sets the cddOrgRef_reference value for this CddOrgRefType.
     * 
     * @param cddOrgRef_reference
     */
    public void setCddOrgRef_reference(gov.nih.nlm.ncbi.www.soap.eutils.efetch.CddOrgRef_referenceType cddOrgRef_reference) {
        this.cddOrgRef_reference = cddOrgRef_reference;
    }


    /**
     * Gets the cddOrgRef_active value for this CddOrgRefType.
     * 
     * @return cddOrgRef_active
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.CddOrgRef_activeType getCddOrgRef_active() {
        return cddOrgRef_active;
    }


    /**
     * Sets the cddOrgRef_active value for this CddOrgRefType.
     * 
     * @param cddOrgRef_active
     */
    public void setCddOrgRef_active(gov.nih.nlm.ncbi.www.soap.eutils.efetch.CddOrgRef_activeType cddOrgRef_active) {
        this.cddOrgRef_active = cddOrgRef_active;
    }


    /**
     * Gets the cddOrgRef_parentTaxId value for this CddOrgRefType.
     * 
     * @return cddOrgRef_parentTaxId
     */
    public java.lang.String getCddOrgRef_parentTaxId() {
        return cddOrgRef_parentTaxId;
    }


    /**
     * Sets the cddOrgRef_parentTaxId value for this CddOrgRefType.
     * 
     * @param cddOrgRef_parentTaxId
     */
    public void setCddOrgRef_parentTaxId(java.lang.String cddOrgRef_parentTaxId) {
        this.cddOrgRef_parentTaxId = cddOrgRef_parentTaxId;
    }


    /**
     * Gets the cddOrgRef_rank value for this CddOrgRefType.
     * 
     * @return cddOrgRef_rank
     */
    public java.lang.String getCddOrgRef_rank() {
        return cddOrgRef_rank;
    }


    /**
     * Sets the cddOrgRef_rank value for this CddOrgRefType.
     * 
     * @param cddOrgRef_rank
     */
    public void setCddOrgRef_rank(java.lang.String cddOrgRef_rank) {
        this.cddOrgRef_rank = cddOrgRef_rank;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CddOrgRefType)) return false;
        CddOrgRefType other = (CddOrgRefType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cddOrgRef_reference==null && other.getCddOrgRef_reference()==null) || 
             (this.cddOrgRef_reference!=null &&
              this.cddOrgRef_reference.equals(other.getCddOrgRef_reference()))) &&
            ((this.cddOrgRef_active==null && other.getCddOrgRef_active()==null) || 
             (this.cddOrgRef_active!=null &&
              this.cddOrgRef_active.equals(other.getCddOrgRef_active()))) &&
            ((this.cddOrgRef_parentTaxId==null && other.getCddOrgRef_parentTaxId()==null) || 
             (this.cddOrgRef_parentTaxId!=null &&
              this.cddOrgRef_parentTaxId.equals(other.getCddOrgRef_parentTaxId()))) &&
            ((this.cddOrgRef_rank==null && other.getCddOrgRef_rank()==null) || 
             (this.cddOrgRef_rank!=null &&
              this.cddOrgRef_rank.equals(other.getCddOrgRef_rank())));
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
        if (getCddOrgRef_reference() != null) {
            _hashCode += getCddOrgRef_reference().hashCode();
        }
        if (getCddOrgRef_active() != null) {
            _hashCode += getCddOrgRef_active().hashCode();
        }
        if (getCddOrgRef_parentTaxId() != null) {
            _hashCode += getCddOrgRef_parentTaxId().hashCode();
        }
        if (getCddOrgRef_rank() != null) {
            _hashCode += getCddOrgRef_rank().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CddOrgRefType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdd-org-refType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cddOrgRef_reference");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdd-org-ref_reference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdd-org-ref_referenceType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cddOrgRef_active");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdd-org-ref_active"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdd-org-ref_activeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cddOrgRef_parentTaxId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdd-org-ref_parent-tax-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cddOrgRef_rank");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdd-org-ref_rank"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
