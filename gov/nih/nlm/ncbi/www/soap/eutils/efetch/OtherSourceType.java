/**
 * OtherSourceType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class OtherSourceType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.OtherSource_srcType otherSource_src;

    private java.lang.String otherSource_preText;

    private java.lang.String otherSource_anchor;

    private java.lang.String otherSource_url;

    private java.lang.String otherSource_postText;

    public OtherSourceType() {
    }

    public OtherSourceType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.OtherSource_srcType otherSource_src,
           java.lang.String otherSource_preText,
           java.lang.String otherSource_anchor,
           java.lang.String otherSource_url,
           java.lang.String otherSource_postText) {
           this.otherSource_src = otherSource_src;
           this.otherSource_preText = otherSource_preText;
           this.otherSource_anchor = otherSource_anchor;
           this.otherSource_url = otherSource_url;
           this.otherSource_postText = otherSource_postText;
    }


    /**
     * Gets the otherSource_src value for this OtherSourceType.
     * 
     * @return otherSource_src
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.OtherSource_srcType getOtherSource_src() {
        return otherSource_src;
    }


    /**
     * Sets the otherSource_src value for this OtherSourceType.
     * 
     * @param otherSource_src
     */
    public void setOtherSource_src(gov.nih.nlm.ncbi.www.soap.eutils.efetch.OtherSource_srcType otherSource_src) {
        this.otherSource_src = otherSource_src;
    }


    /**
     * Gets the otherSource_preText value for this OtherSourceType.
     * 
     * @return otherSource_preText
     */
    public java.lang.String getOtherSource_preText() {
        return otherSource_preText;
    }


    /**
     * Sets the otherSource_preText value for this OtherSourceType.
     * 
     * @param otherSource_preText
     */
    public void setOtherSource_preText(java.lang.String otherSource_preText) {
        this.otherSource_preText = otherSource_preText;
    }


    /**
     * Gets the otherSource_anchor value for this OtherSourceType.
     * 
     * @return otherSource_anchor
     */
    public java.lang.String getOtherSource_anchor() {
        return otherSource_anchor;
    }


    /**
     * Sets the otherSource_anchor value for this OtherSourceType.
     * 
     * @param otherSource_anchor
     */
    public void setOtherSource_anchor(java.lang.String otherSource_anchor) {
        this.otherSource_anchor = otherSource_anchor;
    }


    /**
     * Gets the otherSource_url value for this OtherSourceType.
     * 
     * @return otherSource_url
     */
    public java.lang.String getOtherSource_url() {
        return otherSource_url;
    }


    /**
     * Sets the otherSource_url value for this OtherSourceType.
     * 
     * @param otherSource_url
     */
    public void setOtherSource_url(java.lang.String otherSource_url) {
        this.otherSource_url = otherSource_url;
    }


    /**
     * Gets the otherSource_postText value for this OtherSourceType.
     * 
     * @return otherSource_postText
     */
    public java.lang.String getOtherSource_postText() {
        return otherSource_postText;
    }


    /**
     * Sets the otherSource_postText value for this OtherSourceType.
     * 
     * @param otherSource_postText
     */
    public void setOtherSource_postText(java.lang.String otherSource_postText) {
        this.otherSource_postText = otherSource_postText;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OtherSourceType)) return false;
        OtherSourceType other = (OtherSourceType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.otherSource_src==null && other.getOtherSource_src()==null) || 
             (this.otherSource_src!=null &&
              this.otherSource_src.equals(other.getOtherSource_src()))) &&
            ((this.otherSource_preText==null && other.getOtherSource_preText()==null) || 
             (this.otherSource_preText!=null &&
              this.otherSource_preText.equals(other.getOtherSource_preText()))) &&
            ((this.otherSource_anchor==null && other.getOtherSource_anchor()==null) || 
             (this.otherSource_anchor!=null &&
              this.otherSource_anchor.equals(other.getOtherSource_anchor()))) &&
            ((this.otherSource_url==null && other.getOtherSource_url()==null) || 
             (this.otherSource_url!=null &&
              this.otherSource_url.equals(other.getOtherSource_url()))) &&
            ((this.otherSource_postText==null && other.getOtherSource_postText()==null) || 
             (this.otherSource_postText!=null &&
              this.otherSource_postText.equals(other.getOtherSource_postText())));
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
        if (getOtherSource_src() != null) {
            _hashCode += getOtherSource_src().hashCode();
        }
        if (getOtherSource_preText() != null) {
            _hashCode += getOtherSource_preText().hashCode();
        }
        if (getOtherSource_anchor() != null) {
            _hashCode += getOtherSource_anchor().hashCode();
        }
        if (getOtherSource_url() != null) {
            _hashCode += getOtherSource_url().hashCode();
        }
        if (getOtherSource_postText() != null) {
            _hashCode += getOtherSource_postText().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OtherSourceType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Other-sourceType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("otherSource_src");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Other-source_src"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Other-source_srcType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("otherSource_preText");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Other-source_pre-text"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("otherSource_anchor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Other-source_anchor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("otherSource_url");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Other-source_url"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("otherSource_postText");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Other-source_post-text"));
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
