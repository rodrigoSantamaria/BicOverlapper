/**
 * OrgName_nameType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class OrgName_nameType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.OrgName_name_binomialType orgName_name_binomial;

    private java.lang.String orgName_name_virus;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.OrgName_name_hybridType orgName_name_hybrid;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.OrgName_name_namedhybridType orgName_name_namedhybrid;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.OrgName_name_partialType orgName_name_partial;

    public OrgName_nameType() {
    }

    public OrgName_nameType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.OrgName_name_binomialType orgName_name_binomial,
           java.lang.String orgName_name_virus,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.OrgName_name_hybridType orgName_name_hybrid,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.OrgName_name_namedhybridType orgName_name_namedhybrid,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.OrgName_name_partialType orgName_name_partial) {
           this.orgName_name_binomial = orgName_name_binomial;
           this.orgName_name_virus = orgName_name_virus;
           this.orgName_name_hybrid = orgName_name_hybrid;
           this.orgName_name_namedhybrid = orgName_name_namedhybrid;
           this.orgName_name_partial = orgName_name_partial;
    }


    /**
     * Gets the orgName_name_binomial value for this OrgName_nameType.
     * 
     * @return orgName_name_binomial
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.OrgName_name_binomialType getOrgName_name_binomial() {
        return orgName_name_binomial;
    }


    /**
     * Sets the orgName_name_binomial value for this OrgName_nameType.
     * 
     * @param orgName_name_binomial
     */
    public void setOrgName_name_binomial(gov.nih.nlm.ncbi.www.soap.eutils.efetch.OrgName_name_binomialType orgName_name_binomial) {
        this.orgName_name_binomial = orgName_name_binomial;
    }


    /**
     * Gets the orgName_name_virus value for this OrgName_nameType.
     * 
     * @return orgName_name_virus
     */
    public java.lang.String getOrgName_name_virus() {
        return orgName_name_virus;
    }


    /**
     * Sets the orgName_name_virus value for this OrgName_nameType.
     * 
     * @param orgName_name_virus
     */
    public void setOrgName_name_virus(java.lang.String orgName_name_virus) {
        this.orgName_name_virus = orgName_name_virus;
    }


    /**
     * Gets the orgName_name_hybrid value for this OrgName_nameType.
     * 
     * @return orgName_name_hybrid
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.OrgName_name_hybridType getOrgName_name_hybrid() {
        return orgName_name_hybrid;
    }


    /**
     * Sets the orgName_name_hybrid value for this OrgName_nameType.
     * 
     * @param orgName_name_hybrid
     */
    public void setOrgName_name_hybrid(gov.nih.nlm.ncbi.www.soap.eutils.efetch.OrgName_name_hybridType orgName_name_hybrid) {
        this.orgName_name_hybrid = orgName_name_hybrid;
    }


    /**
     * Gets the orgName_name_namedhybrid value for this OrgName_nameType.
     * 
     * @return orgName_name_namedhybrid
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.OrgName_name_namedhybridType getOrgName_name_namedhybrid() {
        return orgName_name_namedhybrid;
    }


    /**
     * Sets the orgName_name_namedhybrid value for this OrgName_nameType.
     * 
     * @param orgName_name_namedhybrid
     */
    public void setOrgName_name_namedhybrid(gov.nih.nlm.ncbi.www.soap.eutils.efetch.OrgName_name_namedhybridType orgName_name_namedhybrid) {
        this.orgName_name_namedhybrid = orgName_name_namedhybrid;
    }


    /**
     * Gets the orgName_name_partial value for this OrgName_nameType.
     * 
     * @return orgName_name_partial
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.OrgName_name_partialType getOrgName_name_partial() {
        return orgName_name_partial;
    }


    /**
     * Sets the orgName_name_partial value for this OrgName_nameType.
     * 
     * @param orgName_name_partial
     */
    public void setOrgName_name_partial(gov.nih.nlm.ncbi.www.soap.eutils.efetch.OrgName_name_partialType orgName_name_partial) {
        this.orgName_name_partial = orgName_name_partial;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OrgName_nameType)) return false;
        OrgName_nameType other = (OrgName_nameType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.orgName_name_binomial==null && other.getOrgName_name_binomial()==null) || 
             (this.orgName_name_binomial!=null &&
              this.orgName_name_binomial.equals(other.getOrgName_name_binomial()))) &&
            ((this.orgName_name_virus==null && other.getOrgName_name_virus()==null) || 
             (this.orgName_name_virus!=null &&
              this.orgName_name_virus.equals(other.getOrgName_name_virus()))) &&
            ((this.orgName_name_hybrid==null && other.getOrgName_name_hybrid()==null) || 
             (this.orgName_name_hybrid!=null &&
              this.orgName_name_hybrid.equals(other.getOrgName_name_hybrid()))) &&
            ((this.orgName_name_namedhybrid==null && other.getOrgName_name_namedhybrid()==null) || 
             (this.orgName_name_namedhybrid!=null &&
              this.orgName_name_namedhybrid.equals(other.getOrgName_name_namedhybrid()))) &&
            ((this.orgName_name_partial==null && other.getOrgName_name_partial()==null) || 
             (this.orgName_name_partial!=null &&
              this.orgName_name_partial.equals(other.getOrgName_name_partial())));
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
        if (getOrgName_name_binomial() != null) {
            _hashCode += getOrgName_name_binomial().hashCode();
        }
        if (getOrgName_name_virus() != null) {
            _hashCode += getOrgName_name_virus().hashCode();
        }
        if (getOrgName_name_hybrid() != null) {
            _hashCode += getOrgName_name_hybrid().hashCode();
        }
        if (getOrgName_name_namedhybrid() != null) {
            _hashCode += getOrgName_name_namedhybrid().hashCode();
        }
        if (getOrgName_name_partial() != null) {
            _hashCode += getOrgName_name_partial().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OrgName_nameType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "OrgName_nameType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orgName_name_binomial");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "OrgName_name_binomial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "OrgName_name_binomialType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orgName_name_virus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "OrgName_name_virus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orgName_name_hybrid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "OrgName_name_hybrid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "OrgName_name_hybridType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orgName_name_namedhybrid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "OrgName_name_namedhybrid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "OrgName_name_namedhybridType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orgName_name_partial");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "OrgName_name_partial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "OrgName_name_partialType"));
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
