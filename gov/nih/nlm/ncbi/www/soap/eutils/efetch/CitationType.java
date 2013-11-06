/**
 * CitationType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class CitationType  implements java.io.Serializable {
    private java.lang.String citId;

    private java.lang.String citKey;

    private java.lang.String citUrl;

    private java.lang.String citText;

    private java.lang.String citPubmedId;

    private java.lang.String citMedlineId;

    public CitationType() {
    }

    public CitationType(
           java.lang.String citId,
           java.lang.String citKey,
           java.lang.String citUrl,
           java.lang.String citText,
           java.lang.String citPubmedId,
           java.lang.String citMedlineId) {
           this.citId = citId;
           this.citKey = citKey;
           this.citUrl = citUrl;
           this.citText = citText;
           this.citPubmedId = citPubmedId;
           this.citMedlineId = citMedlineId;
    }


    /**
     * Gets the citId value for this CitationType.
     * 
     * @return citId
     */
    public java.lang.String getCitId() {
        return citId;
    }


    /**
     * Sets the citId value for this CitationType.
     * 
     * @param citId
     */
    public void setCitId(java.lang.String citId) {
        this.citId = citId;
    }


    /**
     * Gets the citKey value for this CitationType.
     * 
     * @return citKey
     */
    public java.lang.String getCitKey() {
        return citKey;
    }


    /**
     * Sets the citKey value for this CitationType.
     * 
     * @param citKey
     */
    public void setCitKey(java.lang.String citKey) {
        this.citKey = citKey;
    }


    /**
     * Gets the citUrl value for this CitationType.
     * 
     * @return citUrl
     */
    public java.lang.String getCitUrl() {
        return citUrl;
    }


    /**
     * Sets the citUrl value for this CitationType.
     * 
     * @param citUrl
     */
    public void setCitUrl(java.lang.String citUrl) {
        this.citUrl = citUrl;
    }


    /**
     * Gets the citText value for this CitationType.
     * 
     * @return citText
     */
    public java.lang.String getCitText() {
        return citText;
    }


    /**
     * Sets the citText value for this CitationType.
     * 
     * @param citText
     */
    public void setCitText(java.lang.String citText) {
        this.citText = citText;
    }


    /**
     * Gets the citPubmedId value for this CitationType.
     * 
     * @return citPubmedId
     */
    public java.lang.String getCitPubmedId() {
        return citPubmedId;
    }


    /**
     * Sets the citPubmedId value for this CitationType.
     * 
     * @param citPubmedId
     */
    public void setCitPubmedId(java.lang.String citPubmedId) {
        this.citPubmedId = citPubmedId;
    }


    /**
     * Gets the citMedlineId value for this CitationType.
     * 
     * @return citMedlineId
     */
    public java.lang.String getCitMedlineId() {
        return citMedlineId;
    }


    /**
     * Sets the citMedlineId value for this CitationType.
     * 
     * @param citMedlineId
     */
    public void setCitMedlineId(java.lang.String citMedlineId) {
        this.citMedlineId = citMedlineId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CitationType)) return false;
        CitationType other = (CitationType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.citId==null && other.getCitId()==null) || 
             (this.citId!=null &&
              this.citId.equals(other.getCitId()))) &&
            ((this.citKey==null && other.getCitKey()==null) || 
             (this.citKey!=null &&
              this.citKey.equals(other.getCitKey()))) &&
            ((this.citUrl==null && other.getCitUrl()==null) || 
             (this.citUrl!=null &&
              this.citUrl.equals(other.getCitUrl()))) &&
            ((this.citText==null && other.getCitText()==null) || 
             (this.citText!=null &&
              this.citText.equals(other.getCitText()))) &&
            ((this.citPubmedId==null && other.getCitPubmedId()==null) || 
             (this.citPubmedId!=null &&
              this.citPubmedId.equals(other.getCitPubmedId()))) &&
            ((this.citMedlineId==null && other.getCitMedlineId()==null) || 
             (this.citMedlineId!=null &&
              this.citMedlineId.equals(other.getCitMedlineId())));
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
        if (getCitId() != null) {
            _hashCode += getCitId().hashCode();
        }
        if (getCitKey() != null) {
            _hashCode += getCitKey().hashCode();
        }
        if (getCitUrl() != null) {
            _hashCode += getCitUrl().hashCode();
        }
        if (getCitText() != null) {
            _hashCode += getCitText().hashCode();
        }
        if (getCitPubmedId() != null) {
            _hashCode += getCitPubmedId().hashCode();
        }
        if (getCitMedlineId() != null) {
            _hashCode += getCitMedlineId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CitationType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "CitationType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("citId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "CitId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("citKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "CitKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("citUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "CitUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("citText");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "CitText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("citPubmedId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "CitPubmedId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("citMedlineId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "CitMedlineId"));
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
