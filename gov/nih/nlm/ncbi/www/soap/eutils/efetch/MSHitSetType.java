/**
 * MSHitSetType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class MSHitSetType  implements java.io.Serializable {
    private java.lang.String MSHitSet_number;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSHitSet_errorType MSHitSet_error;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSHitSet_hitsType MSHitSet_hits;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSHitSet_idsType MSHitSet_ids;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSHitSet_namevalueType MSHitSet_namevalue;

    private java.lang.String MSHitSet_settingid;

    public MSHitSetType() {
    }

    public MSHitSetType(
           java.lang.String MSHitSet_number,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSHitSet_errorType MSHitSet_error,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSHitSet_hitsType MSHitSet_hits,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSHitSet_idsType MSHitSet_ids,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSHitSet_namevalueType MSHitSet_namevalue,
           java.lang.String MSHitSet_settingid) {
           this.MSHitSet_number = MSHitSet_number;
           this.MSHitSet_error = MSHitSet_error;
           this.MSHitSet_hits = MSHitSet_hits;
           this.MSHitSet_ids = MSHitSet_ids;
           this.MSHitSet_namevalue = MSHitSet_namevalue;
           this.MSHitSet_settingid = MSHitSet_settingid;
    }


    /**
     * Gets the MSHitSet_number value for this MSHitSetType.
     * 
     * @return MSHitSet_number
     */
    public java.lang.String getMSHitSet_number() {
        return MSHitSet_number;
    }


    /**
     * Sets the MSHitSet_number value for this MSHitSetType.
     * 
     * @param MSHitSet_number
     */
    public void setMSHitSet_number(java.lang.String MSHitSet_number) {
        this.MSHitSet_number = MSHitSet_number;
    }


    /**
     * Gets the MSHitSet_error value for this MSHitSetType.
     * 
     * @return MSHitSet_error
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSHitSet_errorType getMSHitSet_error() {
        return MSHitSet_error;
    }


    /**
     * Sets the MSHitSet_error value for this MSHitSetType.
     * 
     * @param MSHitSet_error
     */
    public void setMSHitSet_error(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSHitSet_errorType MSHitSet_error) {
        this.MSHitSet_error = MSHitSet_error;
    }


    /**
     * Gets the MSHitSet_hits value for this MSHitSetType.
     * 
     * @return MSHitSet_hits
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSHitSet_hitsType getMSHitSet_hits() {
        return MSHitSet_hits;
    }


    /**
     * Sets the MSHitSet_hits value for this MSHitSetType.
     * 
     * @param MSHitSet_hits
     */
    public void setMSHitSet_hits(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSHitSet_hitsType MSHitSet_hits) {
        this.MSHitSet_hits = MSHitSet_hits;
    }


    /**
     * Gets the MSHitSet_ids value for this MSHitSetType.
     * 
     * @return MSHitSet_ids
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSHitSet_idsType getMSHitSet_ids() {
        return MSHitSet_ids;
    }


    /**
     * Sets the MSHitSet_ids value for this MSHitSetType.
     * 
     * @param MSHitSet_ids
     */
    public void setMSHitSet_ids(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSHitSet_idsType MSHitSet_ids) {
        this.MSHitSet_ids = MSHitSet_ids;
    }


    /**
     * Gets the MSHitSet_namevalue value for this MSHitSetType.
     * 
     * @return MSHitSet_namevalue
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSHitSet_namevalueType getMSHitSet_namevalue() {
        return MSHitSet_namevalue;
    }


    /**
     * Sets the MSHitSet_namevalue value for this MSHitSetType.
     * 
     * @param MSHitSet_namevalue
     */
    public void setMSHitSet_namevalue(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSHitSet_namevalueType MSHitSet_namevalue) {
        this.MSHitSet_namevalue = MSHitSet_namevalue;
    }


    /**
     * Gets the MSHitSet_settingid value for this MSHitSetType.
     * 
     * @return MSHitSet_settingid
     */
    public java.lang.String getMSHitSet_settingid() {
        return MSHitSet_settingid;
    }


    /**
     * Sets the MSHitSet_settingid value for this MSHitSetType.
     * 
     * @param MSHitSet_settingid
     */
    public void setMSHitSet_settingid(java.lang.String MSHitSet_settingid) {
        this.MSHitSet_settingid = MSHitSet_settingid;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MSHitSetType)) return false;
        MSHitSetType other = (MSHitSetType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.MSHitSet_number==null && other.getMSHitSet_number()==null) || 
             (this.MSHitSet_number!=null &&
              this.MSHitSet_number.equals(other.getMSHitSet_number()))) &&
            ((this.MSHitSet_error==null && other.getMSHitSet_error()==null) || 
             (this.MSHitSet_error!=null &&
              this.MSHitSet_error.equals(other.getMSHitSet_error()))) &&
            ((this.MSHitSet_hits==null && other.getMSHitSet_hits()==null) || 
             (this.MSHitSet_hits!=null &&
              this.MSHitSet_hits.equals(other.getMSHitSet_hits()))) &&
            ((this.MSHitSet_ids==null && other.getMSHitSet_ids()==null) || 
             (this.MSHitSet_ids!=null &&
              this.MSHitSet_ids.equals(other.getMSHitSet_ids()))) &&
            ((this.MSHitSet_namevalue==null && other.getMSHitSet_namevalue()==null) || 
             (this.MSHitSet_namevalue!=null &&
              this.MSHitSet_namevalue.equals(other.getMSHitSet_namevalue()))) &&
            ((this.MSHitSet_settingid==null && other.getMSHitSet_settingid()==null) || 
             (this.MSHitSet_settingid!=null &&
              this.MSHitSet_settingid.equals(other.getMSHitSet_settingid())));
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
        if (getMSHitSet_number() != null) {
            _hashCode += getMSHitSet_number().hashCode();
        }
        if (getMSHitSet_error() != null) {
            _hashCode += getMSHitSet_error().hashCode();
        }
        if (getMSHitSet_hits() != null) {
            _hashCode += getMSHitSet_hits().hashCode();
        }
        if (getMSHitSet_ids() != null) {
            _hashCode += getMSHitSet_ids().hashCode();
        }
        if (getMSHitSet_namevalue() != null) {
            _hashCode += getMSHitSet_namevalue().hashCode();
        }
        if (getMSHitSet_settingid() != null) {
            _hashCode += getMSHitSet_settingid().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MSHitSetType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSHitSetType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSHitSet_number");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSHitSet_number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSHitSet_error");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSHitSet_error"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSHitSet_errorType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSHitSet_hits");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSHitSet_hits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSHitSet_hitsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSHitSet_ids");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSHitSet_ids"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSHitSet_idsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSHitSet_namevalue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSHitSet_namevalue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSHitSet_namevalueType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSHitSet_settingid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSHitSet_settingid"));
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
