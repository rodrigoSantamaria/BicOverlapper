/**
 * OtherSubjectType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class OtherSubjectType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.OtherSubjectNameType otherSubjectName;

    private java.lang.String otherInformation;

    private java.lang.String titleAssociatedWithName;

    public OtherSubjectType() {
    }

    public OtherSubjectType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.OtherSubjectNameType otherSubjectName,
           java.lang.String otherInformation,
           java.lang.String titleAssociatedWithName) {
           this.otherSubjectName = otherSubjectName;
           this.otherInformation = otherInformation;
           this.titleAssociatedWithName = titleAssociatedWithName;
    }


    /**
     * Gets the otherSubjectName value for this OtherSubjectType.
     * 
     * @return otherSubjectName
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.OtherSubjectNameType getOtherSubjectName() {
        return otherSubjectName;
    }


    /**
     * Sets the otherSubjectName value for this OtherSubjectType.
     * 
     * @param otherSubjectName
     */
    public void setOtherSubjectName(gov.nih.nlm.ncbi.www.soap.eutils.efetch.OtherSubjectNameType otherSubjectName) {
        this.otherSubjectName = otherSubjectName;
    }


    /**
     * Gets the otherInformation value for this OtherSubjectType.
     * 
     * @return otherInformation
     */
    public java.lang.String getOtherInformation() {
        return otherInformation;
    }


    /**
     * Sets the otherInformation value for this OtherSubjectType.
     * 
     * @param otherInformation
     */
    public void setOtherInformation(java.lang.String otherInformation) {
        this.otherInformation = otherInformation;
    }


    /**
     * Gets the titleAssociatedWithName value for this OtherSubjectType.
     * 
     * @return titleAssociatedWithName
     */
    public java.lang.String getTitleAssociatedWithName() {
        return titleAssociatedWithName;
    }


    /**
     * Sets the titleAssociatedWithName value for this OtherSubjectType.
     * 
     * @param titleAssociatedWithName
     */
    public void setTitleAssociatedWithName(java.lang.String titleAssociatedWithName) {
        this.titleAssociatedWithName = titleAssociatedWithName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OtherSubjectType)) return false;
        OtherSubjectType other = (OtherSubjectType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.otherSubjectName==null && other.getOtherSubjectName()==null) || 
             (this.otherSubjectName!=null &&
              this.otherSubjectName.equals(other.getOtherSubjectName()))) &&
            ((this.otherInformation==null && other.getOtherInformation()==null) || 
             (this.otherInformation!=null &&
              this.otherInformation.equals(other.getOtherInformation()))) &&
            ((this.titleAssociatedWithName==null && other.getTitleAssociatedWithName()==null) || 
             (this.titleAssociatedWithName!=null &&
              this.titleAssociatedWithName.equals(other.getTitleAssociatedWithName())));
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
        if (getOtherSubjectName() != null) {
            _hashCode += getOtherSubjectName().hashCode();
        }
        if (getOtherInformation() != null) {
            _hashCode += getOtherInformation().hashCode();
        }
        if (getTitleAssociatedWithName() != null) {
            _hashCode += getTitleAssociatedWithName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OtherSubjectType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "OtherSubjectType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("otherSubjectName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "OtherSubjectName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "OtherSubjectNameType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("otherInformation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "OtherInformation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("titleAssociatedWithName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "TitleAssociatedWithName"));
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
