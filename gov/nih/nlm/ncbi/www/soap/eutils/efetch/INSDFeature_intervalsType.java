/**
 * INSDFeature_intervalsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class INSDFeature_intervalsType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.INSDIntervalType[] INSDInterval;

    public INSDFeature_intervalsType() {
    }

    public INSDFeature_intervalsType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.INSDIntervalType[] INSDInterval) {
           this.INSDInterval = INSDInterval;
    }


    /**
     * Gets the INSDInterval value for this INSDFeature_intervalsType.
     * 
     * @return INSDInterval
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.INSDIntervalType[] getINSDInterval() {
        return INSDInterval;
    }


    /**
     * Sets the INSDInterval value for this INSDFeature_intervalsType.
     * 
     * @param INSDInterval
     */
    public void setINSDInterval(gov.nih.nlm.ncbi.www.soap.eutils.efetch.INSDIntervalType[] INSDInterval) {
        this.INSDInterval = INSDInterval;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.INSDIntervalType getINSDInterval(int i) {
        return this.INSDInterval[i];
    }

    public void setINSDInterval(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.INSDIntervalType _value) {
        this.INSDInterval[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof INSDFeature_intervalsType)) return false;
        INSDFeature_intervalsType other = (INSDFeature_intervalsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.INSDInterval==null && other.getINSDInterval()==null) || 
             (this.INSDInterval!=null &&
              java.util.Arrays.equals(this.INSDInterval, other.getINSDInterval())));
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
        if (getINSDInterval() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getINSDInterval());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getINSDInterval(), i);
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
        new org.apache.axis.description.TypeDesc(INSDFeature_intervalsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "INSDFeature_intervalsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("INSDInterval");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "INSDInterval"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "INSDIntervalType"));
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
