/**
 * VerseGroup.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class VerseGroup  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.VerseLine verseLine;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.VerseGroup verseGroup;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Attrib attrib;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.CopyrightStatement copyrightStatement;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Permissions permissions;

    private org.apache.axis.types.Id id;  // attribute

    public VerseGroup() {
    }

    public VerseGroup(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.VerseLine verseLine,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.VerseGroup verseGroup,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Attrib attrib,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.CopyrightStatement copyrightStatement,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Permissions permissions,
           org.apache.axis.types.Id id) {
           this.verseLine = verseLine;
           this.verseGroup = verseGroup;
           this.attrib = attrib;
           this.copyrightStatement = copyrightStatement;
           this.permissions = permissions;
           this.id = id;
    }


    /**
     * Gets the verseLine value for this VerseGroup.
     * 
     * @return verseLine
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.VerseLine getVerseLine() {
        return verseLine;
    }


    /**
     * Sets the verseLine value for this VerseGroup.
     * 
     * @param verseLine
     */
    public void setVerseLine(gov.nih.nlm.ncbi.www.soap.eutils.efetch.VerseLine verseLine) {
        this.verseLine = verseLine;
    }


    /**
     * Gets the verseGroup value for this VerseGroup.
     * 
     * @return verseGroup
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.VerseGroup getVerseGroup() {
        return verseGroup;
    }


    /**
     * Sets the verseGroup value for this VerseGroup.
     * 
     * @param verseGroup
     */
    public void setVerseGroup(gov.nih.nlm.ncbi.www.soap.eutils.efetch.VerseGroup verseGroup) {
        this.verseGroup = verseGroup;
    }


    /**
     * Gets the attrib value for this VerseGroup.
     * 
     * @return attrib
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Attrib getAttrib() {
        return attrib;
    }


    /**
     * Sets the attrib value for this VerseGroup.
     * 
     * @param attrib
     */
    public void setAttrib(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Attrib attrib) {
        this.attrib = attrib;
    }


    /**
     * Gets the copyrightStatement value for this VerseGroup.
     * 
     * @return copyrightStatement
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.CopyrightStatement getCopyrightStatement() {
        return copyrightStatement;
    }


    /**
     * Sets the copyrightStatement value for this VerseGroup.
     * 
     * @param copyrightStatement
     */
    public void setCopyrightStatement(gov.nih.nlm.ncbi.www.soap.eutils.efetch.CopyrightStatement copyrightStatement) {
        this.copyrightStatement = copyrightStatement;
    }


    /**
     * Gets the permissions value for this VerseGroup.
     * 
     * @return permissions
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Permissions getPermissions() {
        return permissions;
    }


    /**
     * Sets the permissions value for this VerseGroup.
     * 
     * @param permissions
     */
    public void setPermissions(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Permissions permissions) {
        this.permissions = permissions;
    }


    /**
     * Gets the id value for this VerseGroup.
     * 
     * @return id
     */
    public org.apache.axis.types.Id getId() {
        return id;
    }


    /**
     * Sets the id value for this VerseGroup.
     * 
     * @param id
     */
    public void setId(org.apache.axis.types.Id id) {
        this.id = id;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VerseGroup)) return false;
        VerseGroup other = (VerseGroup) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.verseLine==null && other.getVerseLine()==null) || 
             (this.verseLine!=null &&
              this.verseLine.equals(other.getVerseLine()))) &&
            ((this.verseGroup==null && other.getVerseGroup()==null) || 
             (this.verseGroup!=null &&
              this.verseGroup.equals(other.getVerseGroup()))) &&
            ((this.attrib==null && other.getAttrib()==null) || 
             (this.attrib!=null &&
              this.attrib.equals(other.getAttrib()))) &&
            ((this.copyrightStatement==null && other.getCopyrightStatement()==null) || 
             (this.copyrightStatement!=null &&
              this.copyrightStatement.equals(other.getCopyrightStatement()))) &&
            ((this.permissions==null && other.getPermissions()==null) || 
             (this.permissions!=null &&
              this.permissions.equals(other.getPermissions()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId())));
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
        if (getVerseLine() != null) {
            _hashCode += getVerseLine().hashCode();
        }
        if (getVerseGroup() != null) {
            _hashCode += getVerseGroup().hashCode();
        }
        if (getAttrib() != null) {
            _hashCode += getAttrib().hashCode();
        }
        if (getCopyrightStatement() != null) {
            _hashCode += getCopyrightStatement().hashCode();
        }
        if (getPermissions() != null) {
            _hashCode += getPermissions().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VerseGroup.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">verse-group"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("id");
        attrField.setXmlName(new javax.xml.namespace.QName("", "id"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "ID"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("verseLine");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "verse-line"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">verse-line"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("verseGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "verse-group"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">verse-group"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attrib");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "attrib"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">attrib"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("copyrightStatement");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "copyright-statement"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">copyright-statement"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "permissions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">permissions"));
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
