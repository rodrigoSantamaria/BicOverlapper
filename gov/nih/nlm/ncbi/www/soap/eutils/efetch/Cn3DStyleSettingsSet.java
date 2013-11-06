/**
 * Cn3DStyleSettingsSet.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Cn3DStyleSettingsSet  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DStyleSettingsType[] cn3DStyleSettings;

    public Cn3DStyleSettingsSet() {
    }

    public Cn3DStyleSettingsSet(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DStyleSettingsType[] cn3DStyleSettings) {
           this.cn3DStyleSettings = cn3DStyleSettings;
    }


    /**
     * Gets the cn3DStyleSettings value for this Cn3DStyleSettingsSet.
     * 
     * @return cn3DStyleSettings
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DStyleSettingsType[] getCn3DStyleSettings() {
        return cn3DStyleSettings;
    }


    /**
     * Sets the cn3DStyleSettings value for this Cn3DStyleSettingsSet.
     * 
     * @param cn3DStyleSettings
     */
    public void setCn3DStyleSettings(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DStyleSettingsType[] cn3DStyleSettings) {
        this.cn3DStyleSettings = cn3DStyleSettings;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DStyleSettingsType getCn3DStyleSettings(int i) {
        return this.cn3DStyleSettings[i];
    }

    public void setCn3DStyleSettings(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DStyleSettingsType _value) {
        this.cn3DStyleSettings[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Cn3DStyleSettingsSet)) return false;
        Cn3DStyleSettingsSet other = (Cn3DStyleSettingsSet) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cn3DStyleSettings==null && other.getCn3DStyleSettings()==null) || 
             (this.cn3DStyleSettings!=null &&
              java.util.Arrays.equals(this.cn3DStyleSettings, other.getCn3DStyleSettings())));
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
        if (getCn3DStyleSettings() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCn3DStyleSettings());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCn3DStyleSettings(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Cn3DStyleSettingsSet.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">Cn3d-style-settings-set"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cn3DStyleSettings");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-style-settings"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-style-settingsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
