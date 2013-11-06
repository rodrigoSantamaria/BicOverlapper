/**
 * CitLetType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class CitLetType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.CitLet_citType citLet_cit;

    private java.lang.String citLet_manId;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.CitLet_typeType citLet_type;

    public CitLetType() {
    }

    public CitLetType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.CitLet_citType citLet_cit,
           java.lang.String citLet_manId,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.CitLet_typeType citLet_type) {
           this.citLet_cit = citLet_cit;
           this.citLet_manId = citLet_manId;
           this.citLet_type = citLet_type;
    }


    /**
     * Gets the citLet_cit value for this CitLetType.
     * 
     * @return citLet_cit
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.CitLet_citType getCitLet_cit() {
        return citLet_cit;
    }


    /**
     * Sets the citLet_cit value for this CitLetType.
     * 
     * @param citLet_cit
     */
    public void setCitLet_cit(gov.nih.nlm.ncbi.www.soap.eutils.efetch.CitLet_citType citLet_cit) {
        this.citLet_cit = citLet_cit;
    }


    /**
     * Gets the citLet_manId value for this CitLetType.
     * 
     * @return citLet_manId
     */
    public java.lang.String getCitLet_manId() {
        return citLet_manId;
    }


    /**
     * Sets the citLet_manId value for this CitLetType.
     * 
     * @param citLet_manId
     */
    public void setCitLet_manId(java.lang.String citLet_manId) {
        this.citLet_manId = citLet_manId;
    }


    /**
     * Gets the citLet_type value for this CitLetType.
     * 
     * @return citLet_type
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.CitLet_typeType getCitLet_type() {
        return citLet_type;
    }


    /**
     * Sets the citLet_type value for this CitLetType.
     * 
     * @param citLet_type
     */
    public void setCitLet_type(gov.nih.nlm.ncbi.www.soap.eutils.efetch.CitLet_typeType citLet_type) {
        this.citLet_type = citLet_type;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CitLetType)) return false;
        CitLetType other = (CitLetType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.citLet_cit==null && other.getCitLet_cit()==null) || 
             (this.citLet_cit!=null &&
              this.citLet_cit.equals(other.getCitLet_cit()))) &&
            ((this.citLet_manId==null && other.getCitLet_manId()==null) || 
             (this.citLet_manId!=null &&
              this.citLet_manId.equals(other.getCitLet_manId()))) &&
            ((this.citLet_type==null && other.getCitLet_type()==null) || 
             (this.citLet_type!=null &&
              this.citLet_type.equals(other.getCitLet_type())));
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
        if (getCitLet_cit() != null) {
            _hashCode += getCitLet_cit().hashCode();
        }
        if (getCitLet_manId() != null) {
            _hashCode += getCitLet_manId().hashCode();
        }
        if (getCitLet_type() != null) {
            _hashCode += getCitLet_type().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CitLetType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cit-letType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("citLet_cit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cit-let_cit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cit-let_citType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("citLet_manId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cit-let_man-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("citLet_type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cit-let_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cit-let_typeType"));
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
