/**
 * FeatIdType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class FeatIdType  implements java.io.Serializable {
    private java.lang.String featId_gibb;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.FeatId_giimType featId_giim;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.FeatId_localType featId_local;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.FeatId_generalType featId_general;

    public FeatIdType() {
    }

    public FeatIdType(
           java.lang.String featId_gibb,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.FeatId_giimType featId_giim,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.FeatId_localType featId_local,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.FeatId_generalType featId_general) {
           this.featId_gibb = featId_gibb;
           this.featId_giim = featId_giim;
           this.featId_local = featId_local;
           this.featId_general = featId_general;
    }


    /**
     * Gets the featId_gibb value for this FeatIdType.
     * 
     * @return featId_gibb
     */
    public java.lang.String getFeatId_gibb() {
        return featId_gibb;
    }


    /**
     * Sets the featId_gibb value for this FeatIdType.
     * 
     * @param featId_gibb
     */
    public void setFeatId_gibb(java.lang.String featId_gibb) {
        this.featId_gibb = featId_gibb;
    }


    /**
     * Gets the featId_giim value for this FeatIdType.
     * 
     * @return featId_giim
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.FeatId_giimType getFeatId_giim() {
        return featId_giim;
    }


    /**
     * Sets the featId_giim value for this FeatIdType.
     * 
     * @param featId_giim
     */
    public void setFeatId_giim(gov.nih.nlm.ncbi.www.soap.eutils.efetch.FeatId_giimType featId_giim) {
        this.featId_giim = featId_giim;
    }


    /**
     * Gets the featId_local value for this FeatIdType.
     * 
     * @return featId_local
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.FeatId_localType getFeatId_local() {
        return featId_local;
    }


    /**
     * Sets the featId_local value for this FeatIdType.
     * 
     * @param featId_local
     */
    public void setFeatId_local(gov.nih.nlm.ncbi.www.soap.eutils.efetch.FeatId_localType featId_local) {
        this.featId_local = featId_local;
    }


    /**
     * Gets the featId_general value for this FeatIdType.
     * 
     * @return featId_general
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.FeatId_generalType getFeatId_general() {
        return featId_general;
    }


    /**
     * Sets the featId_general value for this FeatIdType.
     * 
     * @param featId_general
     */
    public void setFeatId_general(gov.nih.nlm.ncbi.www.soap.eutils.efetch.FeatId_generalType featId_general) {
        this.featId_general = featId_general;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FeatIdType)) return false;
        FeatIdType other = (FeatIdType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.featId_gibb==null && other.getFeatId_gibb()==null) || 
             (this.featId_gibb!=null &&
              this.featId_gibb.equals(other.getFeatId_gibb()))) &&
            ((this.featId_giim==null && other.getFeatId_giim()==null) || 
             (this.featId_giim!=null &&
              this.featId_giim.equals(other.getFeatId_giim()))) &&
            ((this.featId_local==null && other.getFeatId_local()==null) || 
             (this.featId_local!=null &&
              this.featId_local.equals(other.getFeatId_local()))) &&
            ((this.featId_general==null && other.getFeatId_general()==null) || 
             (this.featId_general!=null &&
              this.featId_general.equals(other.getFeatId_general())));
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
        if (getFeatId_gibb() != null) {
            _hashCode += getFeatId_gibb().hashCode();
        }
        if (getFeatId_giim() != null) {
            _hashCode += getFeatId_giim().hashCode();
        }
        if (getFeatId_local() != null) {
            _hashCode += getFeatId_local().hashCode();
        }
        if (getFeatId_general() != null) {
            _hashCode += getFeatId_general().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FeatIdType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Feat-idType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("featId_gibb");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Feat-id_gibb"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("featId_giim");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Feat-id_giim"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Feat-id_giimType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("featId_local");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Feat-id_local"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Feat-id_localType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("featId_general");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Feat-id_general"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Feat-id_generalType"));
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
