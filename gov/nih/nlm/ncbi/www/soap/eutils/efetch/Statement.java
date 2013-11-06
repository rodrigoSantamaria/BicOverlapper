/**
 * Statement.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Statement  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Label label;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Title title;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.P[] p;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Attrib attrib;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.CopyrightStatement copyrightStatement;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Permissions permissions;

    private org.apache.axis.types.Id id;  // attribute

    private java.lang.String contentType;  // attribute

    public Statement() {
    }

    public Statement(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Label label,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Title title,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.P[] p,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Attrib attrib,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.CopyrightStatement copyrightStatement,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Permissions permissions,
           org.apache.axis.types.Id id,
           java.lang.String contentType) {
           this.label = label;
           this.title = title;
           this.p = p;
           this.attrib = attrib;
           this.copyrightStatement = copyrightStatement;
           this.permissions = permissions;
           this.id = id;
           this.contentType = contentType;
    }


    /**
     * Gets the label value for this Statement.
     * 
     * @return label
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Label getLabel() {
        return label;
    }


    /**
     * Sets the label value for this Statement.
     * 
     * @param label
     */
    public void setLabel(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Label label) {
        this.label = label;
    }


    /**
     * Gets the title value for this Statement.
     * 
     * @return title
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Title getTitle() {
        return title;
    }


    /**
     * Sets the title value for this Statement.
     * 
     * @param title
     */
    public void setTitle(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Title title) {
        this.title = title;
    }


    /**
     * Gets the p value for this Statement.
     * 
     * @return p
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.P[] getP() {
        return p;
    }


    /**
     * Sets the p value for this Statement.
     * 
     * @param p
     */
    public void setP(gov.nih.nlm.ncbi.www.soap.eutils.efetch.P[] p) {
        this.p = p;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.P getP(int i) {
        return this.p[i];
    }

    public void setP(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.P _value) {
        this.p[i] = _value;
    }


    /**
     * Gets the attrib value for this Statement.
     * 
     * @return attrib
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Attrib getAttrib() {
        return attrib;
    }


    /**
     * Sets the attrib value for this Statement.
     * 
     * @param attrib
     */
    public void setAttrib(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Attrib attrib) {
        this.attrib = attrib;
    }


    /**
     * Gets the copyrightStatement value for this Statement.
     * 
     * @return copyrightStatement
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.CopyrightStatement getCopyrightStatement() {
        return copyrightStatement;
    }


    /**
     * Sets the copyrightStatement value for this Statement.
     * 
     * @param copyrightStatement
     */
    public void setCopyrightStatement(gov.nih.nlm.ncbi.www.soap.eutils.efetch.CopyrightStatement copyrightStatement) {
        this.copyrightStatement = copyrightStatement;
    }


    /**
     * Gets the permissions value for this Statement.
     * 
     * @return permissions
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Permissions getPermissions() {
        return permissions;
    }


    /**
     * Sets the permissions value for this Statement.
     * 
     * @param permissions
     */
    public void setPermissions(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Permissions permissions) {
        this.permissions = permissions;
    }


    /**
     * Gets the id value for this Statement.
     * 
     * @return id
     */
    public org.apache.axis.types.Id getId() {
        return id;
    }


    /**
     * Sets the id value for this Statement.
     * 
     * @param id
     */
    public void setId(org.apache.axis.types.Id id) {
        this.id = id;
    }


    /**
     * Gets the contentType value for this Statement.
     * 
     * @return contentType
     */
    public java.lang.String getContentType() {
        return contentType;
    }


    /**
     * Sets the contentType value for this Statement.
     * 
     * @param contentType
     */
    public void setContentType(java.lang.String contentType) {
        this.contentType = contentType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Statement)) return false;
        Statement other = (Statement) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.label==null && other.getLabel()==null) || 
             (this.label!=null &&
              this.label.equals(other.getLabel()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            ((this.p==null && other.getP()==null) || 
             (this.p!=null &&
              java.util.Arrays.equals(this.p, other.getP()))) &&
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
              this.id.equals(other.getId()))) &&
            ((this.contentType==null && other.getContentType()==null) || 
             (this.contentType!=null &&
              this.contentType.equals(other.getContentType())));
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
        if (getLabel() != null) {
            _hashCode += getLabel().hashCode();
        }
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        if (getP() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getP());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getP(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
        if (getContentType() != null) {
            _hashCode += getContentType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Statement.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">statement"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("id");
        attrField.setXmlName(new javax.xml.namespace.QName("", "id"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "ID"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("contentType");
        attrField.setXmlName(new javax.xml.namespace.QName("", "content-type"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("label");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "label"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">label"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">title"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("p");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "p"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "p"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
