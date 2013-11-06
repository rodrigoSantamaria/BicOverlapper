/**
 * OrgNameType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class OrgNameType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.OrgName_nameType orgName_name;

    private java.lang.String orgName_attrib;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.OrgName_modType orgName_mod;

    private java.lang.String orgName_lineage;

    private java.lang.String orgName_gcode;

    private java.lang.String orgName_mgcode;

    private java.lang.String orgName_div;

    public OrgNameType() {
    }

    public OrgNameType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.OrgName_nameType orgName_name,
           java.lang.String orgName_attrib,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.OrgName_modType orgName_mod,
           java.lang.String orgName_lineage,
           java.lang.String orgName_gcode,
           java.lang.String orgName_mgcode,
           java.lang.String orgName_div) {
           this.orgName_name = orgName_name;
           this.orgName_attrib = orgName_attrib;
           this.orgName_mod = orgName_mod;
           this.orgName_lineage = orgName_lineage;
           this.orgName_gcode = orgName_gcode;
           this.orgName_mgcode = orgName_mgcode;
           this.orgName_div = orgName_div;
    }


    /**
     * Gets the orgName_name value for this OrgNameType.
     * 
     * @return orgName_name
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.OrgName_nameType getOrgName_name() {
        return orgName_name;
    }


    /**
     * Sets the orgName_name value for this OrgNameType.
     * 
     * @param orgName_name
     */
    public void setOrgName_name(gov.nih.nlm.ncbi.www.soap.eutils.efetch.OrgName_nameType orgName_name) {
        this.orgName_name = orgName_name;
    }


    /**
     * Gets the orgName_attrib value for this OrgNameType.
     * 
     * @return orgName_attrib
     */
    public java.lang.String getOrgName_attrib() {
        return orgName_attrib;
    }


    /**
     * Sets the orgName_attrib value for this OrgNameType.
     * 
     * @param orgName_attrib
     */
    public void setOrgName_attrib(java.lang.String orgName_attrib) {
        this.orgName_attrib = orgName_attrib;
    }


    /**
     * Gets the orgName_mod value for this OrgNameType.
     * 
     * @return orgName_mod
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.OrgName_modType getOrgName_mod() {
        return orgName_mod;
    }


    /**
     * Sets the orgName_mod value for this OrgNameType.
     * 
     * @param orgName_mod
     */
    public void setOrgName_mod(gov.nih.nlm.ncbi.www.soap.eutils.efetch.OrgName_modType orgName_mod) {
        this.orgName_mod = orgName_mod;
    }


    /**
     * Gets the orgName_lineage value for this OrgNameType.
     * 
     * @return orgName_lineage
     */
    public java.lang.String getOrgName_lineage() {
        return orgName_lineage;
    }


    /**
     * Sets the orgName_lineage value for this OrgNameType.
     * 
     * @param orgName_lineage
     */
    public void setOrgName_lineage(java.lang.String orgName_lineage) {
        this.orgName_lineage = orgName_lineage;
    }


    /**
     * Gets the orgName_gcode value for this OrgNameType.
     * 
     * @return orgName_gcode
     */
    public java.lang.String getOrgName_gcode() {
        return orgName_gcode;
    }


    /**
     * Sets the orgName_gcode value for this OrgNameType.
     * 
     * @param orgName_gcode
     */
    public void setOrgName_gcode(java.lang.String orgName_gcode) {
        this.orgName_gcode = orgName_gcode;
    }


    /**
     * Gets the orgName_mgcode value for this OrgNameType.
     * 
     * @return orgName_mgcode
     */
    public java.lang.String getOrgName_mgcode() {
        return orgName_mgcode;
    }


    /**
     * Sets the orgName_mgcode value for this OrgNameType.
     * 
     * @param orgName_mgcode
     */
    public void setOrgName_mgcode(java.lang.String orgName_mgcode) {
        this.orgName_mgcode = orgName_mgcode;
    }


    /**
     * Gets the orgName_div value for this OrgNameType.
     * 
     * @return orgName_div
     */
    public java.lang.String getOrgName_div() {
        return orgName_div;
    }


    /**
     * Sets the orgName_div value for this OrgNameType.
     * 
     * @param orgName_div
     */
    public void setOrgName_div(java.lang.String orgName_div) {
        this.orgName_div = orgName_div;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OrgNameType)) return false;
        OrgNameType other = (OrgNameType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.orgName_name==null && other.getOrgName_name()==null) || 
             (this.orgName_name!=null &&
              this.orgName_name.equals(other.getOrgName_name()))) &&
            ((this.orgName_attrib==null && other.getOrgName_attrib()==null) || 
             (this.orgName_attrib!=null &&
              this.orgName_attrib.equals(other.getOrgName_attrib()))) &&
            ((this.orgName_mod==null && other.getOrgName_mod()==null) || 
             (this.orgName_mod!=null &&
              this.orgName_mod.equals(other.getOrgName_mod()))) &&
            ((this.orgName_lineage==null && other.getOrgName_lineage()==null) || 
             (this.orgName_lineage!=null &&
              this.orgName_lineage.equals(other.getOrgName_lineage()))) &&
            ((this.orgName_gcode==null && other.getOrgName_gcode()==null) || 
             (this.orgName_gcode!=null &&
              this.orgName_gcode.equals(other.getOrgName_gcode()))) &&
            ((this.orgName_mgcode==null && other.getOrgName_mgcode()==null) || 
             (this.orgName_mgcode!=null &&
              this.orgName_mgcode.equals(other.getOrgName_mgcode()))) &&
            ((this.orgName_div==null && other.getOrgName_div()==null) || 
             (this.orgName_div!=null &&
              this.orgName_div.equals(other.getOrgName_div())));
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
        if (getOrgName_name() != null) {
            _hashCode += getOrgName_name().hashCode();
        }
        if (getOrgName_attrib() != null) {
            _hashCode += getOrgName_attrib().hashCode();
        }
        if (getOrgName_mod() != null) {
            _hashCode += getOrgName_mod().hashCode();
        }
        if (getOrgName_lineage() != null) {
            _hashCode += getOrgName_lineage().hashCode();
        }
        if (getOrgName_gcode() != null) {
            _hashCode += getOrgName_gcode().hashCode();
        }
        if (getOrgName_mgcode() != null) {
            _hashCode += getOrgName_mgcode().hashCode();
        }
        if (getOrgName_div() != null) {
            _hashCode += getOrgName_div().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OrgNameType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "OrgNameType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orgName_name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "OrgName_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "OrgName_nameType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orgName_attrib");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "OrgName_attrib"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orgName_mod");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "OrgName_mod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "OrgName_modType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orgName_lineage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "OrgName_lineage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orgName_gcode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "OrgName_gcode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orgName_mgcode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "OrgName_mgcode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orgName_div");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "OrgName_div"));
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
