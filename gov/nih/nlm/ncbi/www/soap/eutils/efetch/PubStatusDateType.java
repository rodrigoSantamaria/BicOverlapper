/**
 * PubStatusDateType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class PubStatusDateType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PubStatusDate_pubstatusType pubStatusDate_pubstatus;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PubStatusDate_dateType pubStatusDate_date;

    public PubStatusDateType() {
    }

    public PubStatusDateType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PubStatusDate_pubstatusType pubStatusDate_pubstatus,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PubStatusDate_dateType pubStatusDate_date) {
           this.pubStatusDate_pubstatus = pubStatusDate_pubstatus;
           this.pubStatusDate_date = pubStatusDate_date;
    }


    /**
     * Gets the pubStatusDate_pubstatus value for this PubStatusDateType.
     * 
     * @return pubStatusDate_pubstatus
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PubStatusDate_pubstatusType getPubStatusDate_pubstatus() {
        return pubStatusDate_pubstatus;
    }


    /**
     * Sets the pubStatusDate_pubstatus value for this PubStatusDateType.
     * 
     * @param pubStatusDate_pubstatus
     */
    public void setPubStatusDate_pubstatus(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PubStatusDate_pubstatusType pubStatusDate_pubstatus) {
        this.pubStatusDate_pubstatus = pubStatusDate_pubstatus;
    }


    /**
     * Gets the pubStatusDate_date value for this PubStatusDateType.
     * 
     * @return pubStatusDate_date
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PubStatusDate_dateType getPubStatusDate_date() {
        return pubStatusDate_date;
    }


    /**
     * Sets the pubStatusDate_date value for this PubStatusDateType.
     * 
     * @param pubStatusDate_date
     */
    public void setPubStatusDate_date(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PubStatusDate_dateType pubStatusDate_date) {
        this.pubStatusDate_date = pubStatusDate_date;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PubStatusDateType)) return false;
        PubStatusDateType other = (PubStatusDateType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.pubStatusDate_pubstatus==null && other.getPubStatusDate_pubstatus()==null) || 
             (this.pubStatusDate_pubstatus!=null &&
              this.pubStatusDate_pubstatus.equals(other.getPubStatusDate_pubstatus()))) &&
            ((this.pubStatusDate_date==null && other.getPubStatusDate_date()==null) || 
             (this.pubStatusDate_date!=null &&
              this.pubStatusDate_date.equals(other.getPubStatusDate_date())));
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
        if (getPubStatusDate_pubstatus() != null) {
            _hashCode += getPubStatusDate_pubstatus().hashCode();
        }
        if (getPubStatusDate_date() != null) {
            _hashCode += getPubStatusDate_date().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PubStatusDateType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PubStatusDateType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pubStatusDate_pubstatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PubStatusDate_pubstatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PubStatusDate_pubstatusType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pubStatusDate_date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PubStatusDate_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PubStatusDate_dateType"));
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
