/**
 * TableWrapGroup.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class TableWrapGroup  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Label label;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Caption caption;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.AltText altText;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.LongDesc longDesc;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Email email;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ExtLink extLink;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Uri uri;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.TableWrap[] tableWrap;

    private org.apache.axis.types.Id id;  // attribute

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.TableWrapGroupPosition position;  // attribute

    public TableWrapGroup() {
    }

    public TableWrapGroup(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Label label,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Caption caption,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.AltText altText,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.LongDesc longDesc,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Email email,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ExtLink extLink,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Uri uri,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.TableWrap[] tableWrap,
           org.apache.axis.types.Id id,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.TableWrapGroupPosition position) {
           this.label = label;
           this.caption = caption;
           this.altText = altText;
           this.longDesc = longDesc;
           this.email = email;
           this.extLink = extLink;
           this.uri = uri;
           this.tableWrap = tableWrap;
           this.id = id;
           this.position = position;
    }


    /**
     * Gets the label value for this TableWrapGroup.
     * 
     * @return label
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Label getLabel() {
        return label;
    }


    /**
     * Sets the label value for this TableWrapGroup.
     * 
     * @param label
     */
    public void setLabel(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Label label) {
        this.label = label;
    }


    /**
     * Gets the caption value for this TableWrapGroup.
     * 
     * @return caption
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Caption getCaption() {
        return caption;
    }


    /**
     * Sets the caption value for this TableWrapGroup.
     * 
     * @param caption
     */
    public void setCaption(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Caption caption) {
        this.caption = caption;
    }


    /**
     * Gets the altText value for this TableWrapGroup.
     * 
     * @return altText
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.AltText getAltText() {
        return altText;
    }


    /**
     * Sets the altText value for this TableWrapGroup.
     * 
     * @param altText
     */
    public void setAltText(gov.nih.nlm.ncbi.www.soap.eutils.efetch.AltText altText) {
        this.altText = altText;
    }


    /**
     * Gets the longDesc value for this TableWrapGroup.
     * 
     * @return longDesc
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.LongDesc getLongDesc() {
        return longDesc;
    }


    /**
     * Sets the longDesc value for this TableWrapGroup.
     * 
     * @param longDesc
     */
    public void setLongDesc(gov.nih.nlm.ncbi.www.soap.eutils.efetch.LongDesc longDesc) {
        this.longDesc = longDesc;
    }


    /**
     * Gets the email value for this TableWrapGroup.
     * 
     * @return email
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Email getEmail() {
        return email;
    }


    /**
     * Sets the email value for this TableWrapGroup.
     * 
     * @param email
     */
    public void setEmail(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Email email) {
        this.email = email;
    }


    /**
     * Gets the extLink value for this TableWrapGroup.
     * 
     * @return extLink
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ExtLink getExtLink() {
        return extLink;
    }


    /**
     * Sets the extLink value for this TableWrapGroup.
     * 
     * @param extLink
     */
    public void setExtLink(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ExtLink extLink) {
        this.extLink = extLink;
    }


    /**
     * Gets the uri value for this TableWrapGroup.
     * 
     * @return uri
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Uri getUri() {
        return uri;
    }


    /**
     * Sets the uri value for this TableWrapGroup.
     * 
     * @param uri
     */
    public void setUri(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Uri uri) {
        this.uri = uri;
    }


    /**
     * Gets the tableWrap value for this TableWrapGroup.
     * 
     * @return tableWrap
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.TableWrap[] getTableWrap() {
        return tableWrap;
    }


    /**
     * Sets the tableWrap value for this TableWrapGroup.
     * 
     * @param tableWrap
     */
    public void setTableWrap(gov.nih.nlm.ncbi.www.soap.eutils.efetch.TableWrap[] tableWrap) {
        this.tableWrap = tableWrap;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.TableWrap getTableWrap(int i) {
        return this.tableWrap[i];
    }

    public void setTableWrap(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.TableWrap _value) {
        this.tableWrap[i] = _value;
    }


    /**
     * Gets the id value for this TableWrapGroup.
     * 
     * @return id
     */
    public org.apache.axis.types.Id getId() {
        return id;
    }


    /**
     * Sets the id value for this TableWrapGroup.
     * 
     * @param id
     */
    public void setId(org.apache.axis.types.Id id) {
        this.id = id;
    }


    /**
     * Gets the position value for this TableWrapGroup.
     * 
     * @return position
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.TableWrapGroupPosition getPosition() {
        return position;
    }


    /**
     * Sets the position value for this TableWrapGroup.
     * 
     * @param position
     */
    public void setPosition(gov.nih.nlm.ncbi.www.soap.eutils.efetch.TableWrapGroupPosition position) {
        this.position = position;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TableWrapGroup)) return false;
        TableWrapGroup other = (TableWrapGroup) obj;
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
            ((this.caption==null && other.getCaption()==null) || 
             (this.caption!=null &&
              this.caption.equals(other.getCaption()))) &&
            ((this.altText==null && other.getAltText()==null) || 
             (this.altText!=null &&
              this.altText.equals(other.getAltText()))) &&
            ((this.longDesc==null && other.getLongDesc()==null) || 
             (this.longDesc!=null &&
              this.longDesc.equals(other.getLongDesc()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.extLink==null && other.getExtLink()==null) || 
             (this.extLink!=null &&
              this.extLink.equals(other.getExtLink()))) &&
            ((this.uri==null && other.getUri()==null) || 
             (this.uri!=null &&
              this.uri.equals(other.getUri()))) &&
            ((this.tableWrap==null && other.getTableWrap()==null) || 
             (this.tableWrap!=null &&
              java.util.Arrays.equals(this.tableWrap, other.getTableWrap()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.position==null && other.getPosition()==null) || 
             (this.position!=null &&
              this.position.equals(other.getPosition())));
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
        if (getCaption() != null) {
            _hashCode += getCaption().hashCode();
        }
        if (getAltText() != null) {
            _hashCode += getAltText().hashCode();
        }
        if (getLongDesc() != null) {
            _hashCode += getLongDesc().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getExtLink() != null) {
            _hashCode += getExtLink().hashCode();
        }
        if (getUri() != null) {
            _hashCode += getUri().hashCode();
        }
        if (getTableWrap() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTableWrap());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTableWrap(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getPosition() != null) {
            _hashCode += getPosition().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TableWrapGroup.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">table-wrap-group"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("id");
        attrField.setXmlName(new javax.xml.namespace.QName("", "id"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "ID"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("position");
        attrField.setXmlName(new javax.xml.namespace.QName("", "position"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">>table-wrap-group>position"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("label");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "label"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">label"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caption");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "caption"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">caption"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("altText");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "alt-text"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">alt-text"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("longDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "long-desc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">long-desc"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">email"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extLink");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ext-link"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">ext-link"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uri");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "uri"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">uri"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tableWrap");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "table-wrap"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "table-wrap"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
