/**
 * BaseURLType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class BaseURLType  implements java.io.Serializable {
    private java.lang.String baseURL_urlId;

    private java.lang.String baseURL_resourceName;

    private java.lang.String baseURL_resourceId;

    private java.lang.String baseURL_baseURL;

    public BaseURLType() {
    }

    public BaseURLType(
           java.lang.String baseURL_urlId,
           java.lang.String baseURL_resourceName,
           java.lang.String baseURL_resourceId,
           java.lang.String baseURL_baseURL) {
           this.baseURL_urlId = baseURL_urlId;
           this.baseURL_resourceName = baseURL_resourceName;
           this.baseURL_resourceId = baseURL_resourceId;
           this.baseURL_baseURL = baseURL_baseURL;
    }


    /**
     * Gets the baseURL_urlId value for this BaseURLType.
     * 
     * @return baseURL_urlId
     */
    public java.lang.String getBaseURL_urlId() {
        return baseURL_urlId;
    }


    /**
     * Sets the baseURL_urlId value for this BaseURLType.
     * 
     * @param baseURL_urlId
     */
    public void setBaseURL_urlId(java.lang.String baseURL_urlId) {
        this.baseURL_urlId = baseURL_urlId;
    }


    /**
     * Gets the baseURL_resourceName value for this BaseURLType.
     * 
     * @return baseURL_resourceName
     */
    public java.lang.String getBaseURL_resourceName() {
        return baseURL_resourceName;
    }


    /**
     * Sets the baseURL_resourceName value for this BaseURLType.
     * 
     * @param baseURL_resourceName
     */
    public void setBaseURL_resourceName(java.lang.String baseURL_resourceName) {
        this.baseURL_resourceName = baseURL_resourceName;
    }


    /**
     * Gets the baseURL_resourceId value for this BaseURLType.
     * 
     * @return baseURL_resourceId
     */
    public java.lang.String getBaseURL_resourceId() {
        return baseURL_resourceId;
    }


    /**
     * Sets the baseURL_resourceId value for this BaseURLType.
     * 
     * @param baseURL_resourceId
     */
    public void setBaseURL_resourceId(java.lang.String baseURL_resourceId) {
        this.baseURL_resourceId = baseURL_resourceId;
    }


    /**
     * Gets the baseURL_baseURL value for this BaseURLType.
     * 
     * @return baseURL_baseURL
     */
    public java.lang.String getBaseURL_baseURL() {
        return baseURL_baseURL;
    }


    /**
     * Sets the baseURL_baseURL value for this BaseURLType.
     * 
     * @param baseURL_baseURL
     */
    public void setBaseURL_baseURL(java.lang.String baseURL_baseURL) {
        this.baseURL_baseURL = baseURL_baseURL;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BaseURLType)) return false;
        BaseURLType other = (BaseURLType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.baseURL_urlId==null && other.getBaseURL_urlId()==null) || 
             (this.baseURL_urlId!=null &&
              this.baseURL_urlId.equals(other.getBaseURL_urlId()))) &&
            ((this.baseURL_resourceName==null && other.getBaseURL_resourceName()==null) || 
             (this.baseURL_resourceName!=null &&
              this.baseURL_resourceName.equals(other.getBaseURL_resourceName()))) &&
            ((this.baseURL_resourceId==null && other.getBaseURL_resourceId()==null) || 
             (this.baseURL_resourceId!=null &&
              this.baseURL_resourceId.equals(other.getBaseURL_resourceId()))) &&
            ((this.baseURL_baseURL==null && other.getBaseURL_baseURL()==null) || 
             (this.baseURL_baseURL!=null &&
              this.baseURL_baseURL.equals(other.getBaseURL_baseURL())));
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
        if (getBaseURL_urlId() != null) {
            _hashCode += getBaseURL_urlId().hashCode();
        }
        if (getBaseURL_resourceName() != null) {
            _hashCode += getBaseURL_resourceName().hashCode();
        }
        if (getBaseURL_resourceId() != null) {
            _hashCode += getBaseURL_resourceId().hashCode();
        }
        if (getBaseURL_baseURL() != null) {
            _hashCode += getBaseURL_baseURL().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BaseURLType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "BaseURLType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("baseURL_urlId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "BaseURL_urlId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("baseURL_resourceName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "BaseURL_resourceName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("baseURL_resourceId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "BaseURL_resourceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("baseURL_baseURL");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "BaseURL_baseURL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
