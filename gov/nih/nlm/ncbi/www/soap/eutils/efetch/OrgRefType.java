/**
 * OrgRefType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class OrgRefType  implements java.io.Serializable {
    private java.lang.String orgRef_taxname;

    private java.lang.String orgRef_common;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.OrgRef_modType orgRef_mod;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.OrgRef_dbType orgRef_db;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.OrgRef_synType orgRef_syn;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.OrgRef_orgnameType orgRef_orgname;

    public OrgRefType() {
    }

    public OrgRefType(
           java.lang.String orgRef_taxname,
           java.lang.String orgRef_common,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.OrgRef_modType orgRef_mod,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.OrgRef_dbType orgRef_db,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.OrgRef_synType orgRef_syn,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.OrgRef_orgnameType orgRef_orgname) {
           this.orgRef_taxname = orgRef_taxname;
           this.orgRef_common = orgRef_common;
           this.orgRef_mod = orgRef_mod;
           this.orgRef_db = orgRef_db;
           this.orgRef_syn = orgRef_syn;
           this.orgRef_orgname = orgRef_orgname;
    }


    /**
     * Gets the orgRef_taxname value for this OrgRefType.
     * 
     * @return orgRef_taxname
     */
    public java.lang.String getOrgRef_taxname() {
        return orgRef_taxname;
    }


    /**
     * Sets the orgRef_taxname value for this OrgRefType.
     * 
     * @param orgRef_taxname
     */
    public void setOrgRef_taxname(java.lang.String orgRef_taxname) {
        this.orgRef_taxname = orgRef_taxname;
    }


    /**
     * Gets the orgRef_common value for this OrgRefType.
     * 
     * @return orgRef_common
     */
    public java.lang.String getOrgRef_common() {
        return orgRef_common;
    }


    /**
     * Sets the orgRef_common value for this OrgRefType.
     * 
     * @param orgRef_common
     */
    public void setOrgRef_common(java.lang.String orgRef_common) {
        this.orgRef_common = orgRef_common;
    }


    /**
     * Gets the orgRef_mod value for this OrgRefType.
     * 
     * @return orgRef_mod
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.OrgRef_modType getOrgRef_mod() {
        return orgRef_mod;
    }


    /**
     * Sets the orgRef_mod value for this OrgRefType.
     * 
     * @param orgRef_mod
     */
    public void setOrgRef_mod(gov.nih.nlm.ncbi.www.soap.eutils.efetch.OrgRef_modType orgRef_mod) {
        this.orgRef_mod = orgRef_mod;
    }


    /**
     * Gets the orgRef_db value for this OrgRefType.
     * 
     * @return orgRef_db
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.OrgRef_dbType getOrgRef_db() {
        return orgRef_db;
    }


    /**
     * Sets the orgRef_db value for this OrgRefType.
     * 
     * @param orgRef_db
     */
    public void setOrgRef_db(gov.nih.nlm.ncbi.www.soap.eutils.efetch.OrgRef_dbType orgRef_db) {
        this.orgRef_db = orgRef_db;
    }


    /**
     * Gets the orgRef_syn value for this OrgRefType.
     * 
     * @return orgRef_syn
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.OrgRef_synType getOrgRef_syn() {
        return orgRef_syn;
    }


    /**
     * Sets the orgRef_syn value for this OrgRefType.
     * 
     * @param orgRef_syn
     */
    public void setOrgRef_syn(gov.nih.nlm.ncbi.www.soap.eutils.efetch.OrgRef_synType orgRef_syn) {
        this.orgRef_syn = orgRef_syn;
    }


    /**
     * Gets the orgRef_orgname value for this OrgRefType.
     * 
     * @return orgRef_orgname
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.OrgRef_orgnameType getOrgRef_orgname() {
        return orgRef_orgname;
    }


    /**
     * Sets the orgRef_orgname value for this OrgRefType.
     * 
     * @param orgRef_orgname
     */
    public void setOrgRef_orgname(gov.nih.nlm.ncbi.www.soap.eutils.efetch.OrgRef_orgnameType orgRef_orgname) {
        this.orgRef_orgname = orgRef_orgname;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OrgRefType)) return false;
        OrgRefType other = (OrgRefType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.orgRef_taxname==null && other.getOrgRef_taxname()==null) || 
             (this.orgRef_taxname!=null &&
              this.orgRef_taxname.equals(other.getOrgRef_taxname()))) &&
            ((this.orgRef_common==null && other.getOrgRef_common()==null) || 
             (this.orgRef_common!=null &&
              this.orgRef_common.equals(other.getOrgRef_common()))) &&
            ((this.orgRef_mod==null && other.getOrgRef_mod()==null) || 
             (this.orgRef_mod!=null &&
              this.orgRef_mod.equals(other.getOrgRef_mod()))) &&
            ((this.orgRef_db==null && other.getOrgRef_db()==null) || 
             (this.orgRef_db!=null &&
              this.orgRef_db.equals(other.getOrgRef_db()))) &&
            ((this.orgRef_syn==null && other.getOrgRef_syn()==null) || 
             (this.orgRef_syn!=null &&
              this.orgRef_syn.equals(other.getOrgRef_syn()))) &&
            ((this.orgRef_orgname==null && other.getOrgRef_orgname()==null) || 
             (this.orgRef_orgname!=null &&
              this.orgRef_orgname.equals(other.getOrgRef_orgname())));
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
        if (getOrgRef_taxname() != null) {
            _hashCode += getOrgRef_taxname().hashCode();
        }
        if (getOrgRef_common() != null) {
            _hashCode += getOrgRef_common().hashCode();
        }
        if (getOrgRef_mod() != null) {
            _hashCode += getOrgRef_mod().hashCode();
        }
        if (getOrgRef_db() != null) {
            _hashCode += getOrgRef_db().hashCode();
        }
        if (getOrgRef_syn() != null) {
            _hashCode += getOrgRef_syn().hashCode();
        }
        if (getOrgRef_orgname() != null) {
            _hashCode += getOrgRef_orgname().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OrgRefType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Org-refType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orgRef_taxname");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Org-ref_taxname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orgRef_common");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Org-ref_common"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orgRef_mod");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Org-ref_mod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Org-ref_modType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orgRef_db");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Org-ref_db"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Org-ref_dbType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orgRef_syn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Org-ref_syn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Org-ref_synType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orgRef_orgname");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Org-ref_orgname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Org-ref_orgnameType"));
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
