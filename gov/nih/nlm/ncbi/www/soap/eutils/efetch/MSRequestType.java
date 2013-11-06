/**
 * MSRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class MSRequestType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSRequest_spectraType MSRequest_spectra;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSRequest_settingsType MSRequest_settings;

    private java.lang.String MSRequest_rid;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSRequest_moresettingsType MSRequest_moresettings;

    public MSRequestType() {
    }

    public MSRequestType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSRequest_spectraType MSRequest_spectra,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSRequest_settingsType MSRequest_settings,
           java.lang.String MSRequest_rid,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSRequest_moresettingsType MSRequest_moresettings) {
           this.MSRequest_spectra = MSRequest_spectra;
           this.MSRequest_settings = MSRequest_settings;
           this.MSRequest_rid = MSRequest_rid;
           this.MSRequest_moresettings = MSRequest_moresettings;
    }


    /**
     * Gets the MSRequest_spectra value for this MSRequestType.
     * 
     * @return MSRequest_spectra
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSRequest_spectraType getMSRequest_spectra() {
        return MSRequest_spectra;
    }


    /**
     * Sets the MSRequest_spectra value for this MSRequestType.
     * 
     * @param MSRequest_spectra
     */
    public void setMSRequest_spectra(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSRequest_spectraType MSRequest_spectra) {
        this.MSRequest_spectra = MSRequest_spectra;
    }


    /**
     * Gets the MSRequest_settings value for this MSRequestType.
     * 
     * @return MSRequest_settings
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSRequest_settingsType getMSRequest_settings() {
        return MSRequest_settings;
    }


    /**
     * Sets the MSRequest_settings value for this MSRequestType.
     * 
     * @param MSRequest_settings
     */
    public void setMSRequest_settings(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSRequest_settingsType MSRequest_settings) {
        this.MSRequest_settings = MSRequest_settings;
    }


    /**
     * Gets the MSRequest_rid value for this MSRequestType.
     * 
     * @return MSRequest_rid
     */
    public java.lang.String getMSRequest_rid() {
        return MSRequest_rid;
    }


    /**
     * Sets the MSRequest_rid value for this MSRequestType.
     * 
     * @param MSRequest_rid
     */
    public void setMSRequest_rid(java.lang.String MSRequest_rid) {
        this.MSRequest_rid = MSRequest_rid;
    }


    /**
     * Gets the MSRequest_moresettings value for this MSRequestType.
     * 
     * @return MSRequest_moresettings
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSRequest_moresettingsType getMSRequest_moresettings() {
        return MSRequest_moresettings;
    }


    /**
     * Sets the MSRequest_moresettings value for this MSRequestType.
     * 
     * @param MSRequest_moresettings
     */
    public void setMSRequest_moresettings(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSRequest_moresettingsType MSRequest_moresettings) {
        this.MSRequest_moresettings = MSRequest_moresettings;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MSRequestType)) return false;
        MSRequestType other = (MSRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.MSRequest_spectra==null && other.getMSRequest_spectra()==null) || 
             (this.MSRequest_spectra!=null &&
              this.MSRequest_spectra.equals(other.getMSRequest_spectra()))) &&
            ((this.MSRequest_settings==null && other.getMSRequest_settings()==null) || 
             (this.MSRequest_settings!=null &&
              this.MSRequest_settings.equals(other.getMSRequest_settings()))) &&
            ((this.MSRequest_rid==null && other.getMSRequest_rid()==null) || 
             (this.MSRequest_rid!=null &&
              this.MSRequest_rid.equals(other.getMSRequest_rid()))) &&
            ((this.MSRequest_moresettings==null && other.getMSRequest_moresettings()==null) || 
             (this.MSRequest_moresettings!=null &&
              this.MSRequest_moresettings.equals(other.getMSRequest_moresettings())));
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
        if (getMSRequest_spectra() != null) {
            _hashCode += getMSRequest_spectra().hashCode();
        }
        if (getMSRequest_settings() != null) {
            _hashCode += getMSRequest_settings().hashCode();
        }
        if (getMSRequest_rid() != null) {
            _hashCode += getMSRequest_rid().hashCode();
        }
        if (getMSRequest_moresettings() != null) {
            _hashCode += getMSRequest_moresettings().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MSRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSRequest_spectra");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSRequest_spectra"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSRequest_spectraType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSRequest_settings");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSRequest_settings"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSRequest_settingsType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSRequest_rid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSRequest_rid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSRequest_moresettings");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSRequest_moresettings"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSRequest_moresettingsType"));
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
