/**
 * INSDSeq_featureTableType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class INSDSeq_featureTableType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.INSDFeatureType[] INSDFeature;

    public INSDSeq_featureTableType() {
    }

    public INSDSeq_featureTableType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.INSDFeatureType[] INSDFeature) {
           this.INSDFeature = INSDFeature;
    }


    /**
     * Gets the INSDFeature value for this INSDSeq_featureTableType.
     * 
     * @return INSDFeature
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.INSDFeatureType[] getINSDFeature() {
        return INSDFeature;
    }


    /**
     * Sets the INSDFeature value for this INSDSeq_featureTableType.
     * 
     * @param INSDFeature
     */
    public void setINSDFeature(gov.nih.nlm.ncbi.www.soap.eutils.efetch.INSDFeatureType[] INSDFeature) {
        this.INSDFeature = INSDFeature;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.INSDFeatureType getINSDFeature(int i) {
        return this.INSDFeature[i];
    }

    public void setINSDFeature(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.INSDFeatureType _value) {
        this.INSDFeature[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof INSDSeq_featureTableType)) return false;
        INSDSeq_featureTableType other = (INSDSeq_featureTableType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.INSDFeature==null && other.getINSDFeature()==null) || 
             (this.INSDFeature!=null &&
              java.util.Arrays.equals(this.INSDFeature, other.getINSDFeature())));
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
        if (getINSDFeature() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getINSDFeature());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getINSDFeature(), i);
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
        new org.apache.axis.description.TypeDesc(INSDSeq_featureTableType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "INSDSeq_feature-tableType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("INSDFeature");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "INSDFeature"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "INSDFeatureType"));
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
