/**
 * GBFeature_intervalsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class GBFeature_intervalsType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.GBIntervalType[] GBInterval;

    public GBFeature_intervalsType() {
    }

    public GBFeature_intervalsType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.GBIntervalType[] GBInterval) {
           this.GBInterval = GBInterval;
    }


    /**
     * Gets the GBInterval value for this GBFeature_intervalsType.
     * 
     * @return GBInterval
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.GBIntervalType[] getGBInterval() {
        return GBInterval;
    }


    /**
     * Sets the GBInterval value for this GBFeature_intervalsType.
     * 
     * @param GBInterval
     */
    public void setGBInterval(gov.nih.nlm.ncbi.www.soap.eutils.efetch.GBIntervalType[] GBInterval) {
        this.GBInterval = GBInterval;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.GBIntervalType getGBInterval(int i) {
        return this.GBInterval[i];
    }

    public void setGBInterval(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.GBIntervalType _value) {
        this.GBInterval[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GBFeature_intervalsType)) return false;
        GBFeature_intervalsType other = (GBFeature_intervalsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.GBInterval==null && other.getGBInterval()==null) || 
             (this.GBInterval!=null &&
              java.util.Arrays.equals(this.GBInterval, other.getGBInterval())));
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
        if (getGBInterval() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGBInterval());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGBInterval(), i);
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
        new org.apache.axis.description.TypeDesc(GBFeature_intervalsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "GBFeature_intervalsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GBInterval");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "GBInterval"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "GBIntervalType"));
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
