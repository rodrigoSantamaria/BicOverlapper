/**
 * PersonGroup.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class PersonGroup  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Aff aff;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Etal etal;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Collab collab;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Name name;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.StringName stringName;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.X x;

    private java.lang.String personGroupType;  // attribute

    public PersonGroup() {
    }

    public PersonGroup(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Aff aff,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Etal etal,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Collab collab,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Name name,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.StringName stringName,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.X x,
           java.lang.String personGroupType) {
           this.aff = aff;
           this.etal = etal;
           this.collab = collab;
           this.name = name;
           this.stringName = stringName;
           this.x = x;
           this.personGroupType = personGroupType;
    }


    /**
     * Gets the aff value for this PersonGroup.
     * 
     * @return aff
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Aff getAff() {
        return aff;
    }


    /**
     * Sets the aff value for this PersonGroup.
     * 
     * @param aff
     */
    public void setAff(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Aff aff) {
        this.aff = aff;
    }


    /**
     * Gets the etal value for this PersonGroup.
     * 
     * @return etal
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Etal getEtal() {
        return etal;
    }


    /**
     * Sets the etal value for this PersonGroup.
     * 
     * @param etal
     */
    public void setEtal(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Etal etal) {
        this.etal = etal;
    }


    /**
     * Gets the collab value for this PersonGroup.
     * 
     * @return collab
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Collab getCollab() {
        return collab;
    }


    /**
     * Sets the collab value for this PersonGroup.
     * 
     * @param collab
     */
    public void setCollab(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Collab collab) {
        this.collab = collab;
    }


    /**
     * Gets the name value for this PersonGroup.
     * 
     * @return name
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Name getName() {
        return name;
    }


    /**
     * Sets the name value for this PersonGroup.
     * 
     * @param name
     */
    public void setName(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Name name) {
        this.name = name;
    }


    /**
     * Gets the stringName value for this PersonGroup.
     * 
     * @return stringName
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.StringName getStringName() {
        return stringName;
    }


    /**
     * Sets the stringName value for this PersonGroup.
     * 
     * @param stringName
     */
    public void setStringName(gov.nih.nlm.ncbi.www.soap.eutils.efetch.StringName stringName) {
        this.stringName = stringName;
    }


    /**
     * Gets the x value for this PersonGroup.
     * 
     * @return x
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.X getX() {
        return x;
    }


    /**
     * Sets the x value for this PersonGroup.
     * 
     * @param x
     */
    public void setX(gov.nih.nlm.ncbi.www.soap.eutils.efetch.X x) {
        this.x = x;
    }


    /**
     * Gets the personGroupType value for this PersonGroup.
     * 
     * @return personGroupType
     */
    public java.lang.String getPersonGroupType() {
        return personGroupType;
    }


    /**
     * Sets the personGroupType value for this PersonGroup.
     * 
     * @param personGroupType
     */
    public void setPersonGroupType(java.lang.String personGroupType) {
        this.personGroupType = personGroupType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PersonGroup)) return false;
        PersonGroup other = (PersonGroup) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.aff==null && other.getAff()==null) || 
             (this.aff!=null &&
              this.aff.equals(other.getAff()))) &&
            ((this.etal==null && other.getEtal()==null) || 
             (this.etal!=null &&
              this.etal.equals(other.getEtal()))) &&
            ((this.collab==null && other.getCollab()==null) || 
             (this.collab!=null &&
              this.collab.equals(other.getCollab()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.stringName==null && other.getStringName()==null) || 
             (this.stringName!=null &&
              this.stringName.equals(other.getStringName()))) &&
            ((this.x==null && other.getX()==null) || 
             (this.x!=null &&
              this.x.equals(other.getX()))) &&
            ((this.personGroupType==null && other.getPersonGroupType()==null) || 
             (this.personGroupType!=null &&
              this.personGroupType.equals(other.getPersonGroupType())));
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
        if (getAff() != null) {
            _hashCode += getAff().hashCode();
        }
        if (getEtal() != null) {
            _hashCode += getEtal().hashCode();
        }
        if (getCollab() != null) {
            _hashCode += getCollab().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getStringName() != null) {
            _hashCode += getStringName().hashCode();
        }
        if (getX() != null) {
            _hashCode += getX().hashCode();
        }
        if (getPersonGroupType() != null) {
            _hashCode += getPersonGroupType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PersonGroup.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">person-group"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("personGroupType");
        attrField.setXmlName(new javax.xml.namespace.QName("", "person-group-type"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aff");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "aff"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">aff"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("etal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "etal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">etal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("collab");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "collab"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">collab"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">name"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stringName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "string-name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">string-name"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("x");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "x"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">x"));
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
