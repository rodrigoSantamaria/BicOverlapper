/**
 * OrgModType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class OrgModType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.OrgMod_subtypeType orgMod_subtype;

    private java.lang.String orgMod_subname;

    private java.lang.String orgMod_attrib;

    public OrgModType() {
    }

    public OrgModType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.OrgMod_subtypeType orgMod_subtype,
           java.lang.String orgMod_subname,
           java.lang.String orgMod_attrib) {
           this.orgMod_subtype = orgMod_subtype;
           this.orgMod_subname = orgMod_subname;
           this.orgMod_attrib = orgMod_attrib;
    }


    /**
     * Gets the orgMod_subtype value for this OrgModType.
     * 
     * @return orgMod_subtype
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.OrgMod_subtypeType getOrgMod_subtype() {
        return orgMod_subtype;
    }


    /**
     * Sets the orgMod_subtype value for this OrgModType.
     * 
     * @param orgMod_subtype
     */
    public void setOrgMod_subtype(gov.nih.nlm.ncbi.www.soap.eutils.efetch.OrgMod_subtypeType orgMod_subtype) {
        this.orgMod_subtype = orgMod_subtype;
    }


    /**
     * Gets the orgMod_subname value for this OrgModType.
     * 
     * @return orgMod_subname
     */
    public java.lang.String getOrgMod_subname() {
        return orgMod_subname;
    }


    /**
     * Sets the orgMod_subname value for this OrgModType.
     * 
     * @param orgMod_subname
     */
    public void setOrgMod_subname(java.lang.String orgMod_subname) {
        this.orgMod_subname = orgMod_subname;
    }


    /**
     * Gets the orgMod_attrib value for this OrgModType.
     * 
     * @return orgMod_attrib
     */
    public java.lang.String getOrgMod_attrib() {
        return orgMod_attrib;
    }


    /**
     * Sets the orgMod_attrib value for this OrgModType.
     * 
     * @param orgMod_attrib
     */
    public void setOrgMod_attrib(java.lang.String orgMod_attrib) {
        this.orgMod_attrib = orgMod_attrib;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OrgModType)) return false;
        OrgModType other = (OrgModType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.orgMod_subtype==null && other.getOrgMod_subtype()==null) || 
             (this.orgMod_subtype!=null &&
              this.orgMod_subtype.equals(other.getOrgMod_subtype()))) &&
            ((this.orgMod_subname==null && other.getOrgMod_subname()==null) || 
             (this.orgMod_subname!=null &&
              this.orgMod_subname.equals(other.getOrgMod_subname()))) &&
            ((this.orgMod_attrib==null && other.getOrgMod_attrib()==null) || 
             (this.orgMod_attrib!=null &&
              this.orgMod_attrib.equals(other.getOrgMod_attrib())));
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
        if (getOrgMod_subtype() != null) {
            _hashCode += getOrgMod_subtype().hashCode();
        }
        if (getOrgMod_subname() != null) {
            _hashCode += getOrgMod_subname().hashCode();
        }
        if (getOrgMod_attrib() != null) {
            _hashCode += getOrgMod_attrib().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OrgModType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "OrgModType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orgMod_subtype");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "OrgMod_subtype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "OrgMod_subtypeType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orgMod_subname");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "OrgMod_subname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orgMod_attrib");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "OrgMod_attrib"));
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
