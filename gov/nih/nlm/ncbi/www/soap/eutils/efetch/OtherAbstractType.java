/**
 * OtherAbstractType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class OtherAbstractType  implements java.io.Serializable {
    private java.lang.String abstractText;

    private java.lang.String copyrightInformation;

    private java.lang.String type;  // attribute

    public OtherAbstractType() {
    }

    public OtherAbstractType(
           java.lang.String abstractText,
           java.lang.String copyrightInformation,
           java.lang.String type) {
           this.abstractText = abstractText;
           this.copyrightInformation = copyrightInformation;
           this.type = type;
    }


    /**
     * Gets the abstractText value for this OtherAbstractType.
     * 
     * @return abstractText
     */
    public java.lang.String getAbstractText() {
        return abstractText;
    }


    /**
     * Sets the abstractText value for this OtherAbstractType.
     * 
     * @param abstractText
     */
    public void setAbstractText(java.lang.String abstractText) {
        this.abstractText = abstractText;
    }


    /**
     * Gets the copyrightInformation value for this OtherAbstractType.
     * 
     * @return copyrightInformation
     */
    public java.lang.String getCopyrightInformation() {
        return copyrightInformation;
    }


    /**
     * Sets the copyrightInformation value for this OtherAbstractType.
     * 
     * @param copyrightInformation
     */
    public void setCopyrightInformation(java.lang.String copyrightInformation) {
        this.copyrightInformation = copyrightInformation;
    }


    /**
     * Gets the type value for this OtherAbstractType.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this OtherAbstractType.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OtherAbstractType)) return false;
        OtherAbstractType other = (OtherAbstractType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.abstractText==null && other.getAbstractText()==null) || 
             (this.abstractText!=null &&
              this.abstractText.equals(other.getAbstractText()))) &&
            ((this.copyrightInformation==null && other.getCopyrightInformation()==null) || 
             (this.copyrightInformation!=null &&
              this.copyrightInformation.equals(other.getCopyrightInformation()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType())));
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
        if (getAbstractText() != null) {
            _hashCode += getAbstractText().hashCode();
        }
        if (getCopyrightInformation() != null) {
            _hashCode += getCopyrightInformation().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OtherAbstractType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "OtherAbstractType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("type");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Type"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("abstractText");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "AbstractText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("copyrightInformation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "CopyrightInformation"));
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
