/**
 * Cn3DUserAnnotations_viewType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Cn3DUserAnnotations_viewType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DViewSettingsType cn3DViewSettings;

    public Cn3DUserAnnotations_viewType() {
    }

    public Cn3DUserAnnotations_viewType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DViewSettingsType cn3DViewSettings) {
           this.cn3DViewSettings = cn3DViewSettings;
    }


    /**
     * Gets the cn3DViewSettings value for this Cn3DUserAnnotations_viewType.
     * 
     * @return cn3DViewSettings
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DViewSettingsType getCn3DViewSettings() {
        return cn3DViewSettings;
    }


    /**
     * Sets the cn3DViewSettings value for this Cn3DUserAnnotations_viewType.
     * 
     * @param cn3DViewSettings
     */
    public void setCn3DViewSettings(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DViewSettingsType cn3DViewSettings) {
        this.cn3DViewSettings = cn3DViewSettings;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Cn3DUserAnnotations_viewType)) return false;
        Cn3DUserAnnotations_viewType other = (Cn3DUserAnnotations_viewType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cn3DViewSettings==null && other.getCn3DViewSettings()==null) || 
             (this.cn3DViewSettings!=null &&
              this.cn3DViewSettings.equals(other.getCn3DViewSettings())));
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
        if (getCn3DViewSettings() != null) {
            _hashCode += getCn3DViewSettings().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Cn3DUserAnnotations_viewType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-user-annotations_viewType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cn3DViewSettings");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-view-settings"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-view-settingsType"));
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
