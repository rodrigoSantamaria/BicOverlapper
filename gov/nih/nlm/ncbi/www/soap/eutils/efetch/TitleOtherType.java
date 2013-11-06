/**
 * TitleOtherType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class TitleOtherType  implements java.io.Serializable {
    private java.lang.String titleAlternate;

    private java.lang.String otherInformation;

    private java.lang.String sort;  // attribute

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.TitleOtherTypeOwner owner;  // attribute

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.TitleOtherTypeTitleType titleType;  // attribute

    public TitleOtherType() {
    }

    public TitleOtherType(
           java.lang.String titleAlternate,
           java.lang.String otherInformation,
           java.lang.String sort,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.TitleOtherTypeOwner owner,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.TitleOtherTypeTitleType titleType) {
           this.titleAlternate = titleAlternate;
           this.otherInformation = otherInformation;
           this.sort = sort;
           this.owner = owner;
           this.titleType = titleType;
    }


    /**
     * Gets the titleAlternate value for this TitleOtherType.
     * 
     * @return titleAlternate
     */
    public java.lang.String getTitleAlternate() {
        return titleAlternate;
    }


    /**
     * Sets the titleAlternate value for this TitleOtherType.
     * 
     * @param titleAlternate
     */
    public void setTitleAlternate(java.lang.String titleAlternate) {
        this.titleAlternate = titleAlternate;
    }


    /**
     * Gets the otherInformation value for this TitleOtherType.
     * 
     * @return otherInformation
     */
    public java.lang.String getOtherInformation() {
        return otherInformation;
    }


    /**
     * Sets the otherInformation value for this TitleOtherType.
     * 
     * @param otherInformation
     */
    public void setOtherInformation(java.lang.String otherInformation) {
        this.otherInformation = otherInformation;
    }


    /**
     * Gets the sort value for this TitleOtherType.
     * 
     * @return sort
     */
    public java.lang.String getSort() {
        return sort;
    }


    /**
     * Sets the sort value for this TitleOtherType.
     * 
     * @param sort
     */
    public void setSort(java.lang.String sort) {
        this.sort = sort;
    }


    /**
     * Gets the owner value for this TitleOtherType.
     * 
     * @return owner
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.TitleOtherTypeOwner getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this TitleOtherType.
     * 
     * @param owner
     */
    public void setOwner(gov.nih.nlm.ncbi.www.soap.eutils.efetch.TitleOtherTypeOwner owner) {
        this.owner = owner;
    }


    /**
     * Gets the titleType value for this TitleOtherType.
     * 
     * @return titleType
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.TitleOtherTypeTitleType getTitleType() {
        return titleType;
    }


    /**
     * Sets the titleType value for this TitleOtherType.
     * 
     * @param titleType
     */
    public void setTitleType(gov.nih.nlm.ncbi.www.soap.eutils.efetch.TitleOtherTypeTitleType titleType) {
        this.titleType = titleType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TitleOtherType)) return false;
        TitleOtherType other = (TitleOtherType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.titleAlternate==null && other.getTitleAlternate()==null) || 
             (this.titleAlternate!=null &&
              this.titleAlternate.equals(other.getTitleAlternate()))) &&
            ((this.otherInformation==null && other.getOtherInformation()==null) || 
             (this.otherInformation!=null &&
              this.otherInformation.equals(other.getOtherInformation()))) &&
            ((this.sort==null && other.getSort()==null) || 
             (this.sort!=null &&
              this.sort.equals(other.getSort()))) &&
            ((this.owner==null && other.getOwner()==null) || 
             (this.owner!=null &&
              this.owner.equals(other.getOwner()))) &&
            ((this.titleType==null && other.getTitleType()==null) || 
             (this.titleType!=null &&
              this.titleType.equals(other.getTitleType())));
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
        if (getTitleAlternate() != null) {
            _hashCode += getTitleAlternate().hashCode();
        }
        if (getOtherInformation() != null) {
            _hashCode += getOtherInformation().hashCode();
        }
        if (getSort() != null) {
            _hashCode += getSort().hashCode();
        }
        if (getOwner() != null) {
            _hashCode += getOwner().hashCode();
        }
        if (getTitleType() != null) {
            _hashCode += getTitleType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TitleOtherType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "TitleOtherType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("sort");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Sort"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("owner");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Owner"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">TitleOtherType>Owner"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("titleType");
        attrField.setXmlName(new javax.xml.namespace.QName("", "TitleType"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">TitleOtherType>TitleType"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("titleAlternate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "TitleAlternate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("otherInformation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "OtherInformation"));
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
