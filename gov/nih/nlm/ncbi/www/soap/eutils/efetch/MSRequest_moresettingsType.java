/**
 * MSRequest_moresettingsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class MSRequest_moresettingsType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSSearchSettingsSetType MSSearchSettingsSet;

    public MSRequest_moresettingsType() {
    }

    public MSRequest_moresettingsType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSSearchSettingsSetType MSSearchSettingsSet) {
           this.MSSearchSettingsSet = MSSearchSettingsSet;
    }


    /**
     * Gets the MSSearchSettingsSet value for this MSRequest_moresettingsType.
     * 
     * @return MSSearchSettingsSet
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSSearchSettingsSetType getMSSearchSettingsSet() {
        return MSSearchSettingsSet;
    }


    /**
     * Sets the MSSearchSettingsSet value for this MSRequest_moresettingsType.
     * 
     * @param MSSearchSettingsSet
     */
    public void setMSSearchSettingsSet(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSSearchSettingsSetType MSSearchSettingsSet) {
        this.MSSearchSettingsSet = MSSearchSettingsSet;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MSRequest_moresettingsType)) return false;
        MSRequest_moresettingsType other = (MSRequest_moresettingsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.MSSearchSettingsSet==null && other.getMSSearchSettingsSet()==null) || 
             (this.MSSearchSettingsSet!=null &&
              this.MSSearchSettingsSet.equals(other.getMSSearchSettingsSet())));
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
        if (getMSSearchSettingsSet() != null) {
            _hashCode += getMSSearchSettingsSet().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MSRequest_moresettingsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSRequest_moresettingsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSSearchSettingsSet");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSSearchSettingsSet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSSearchSettingsSetType"));
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
