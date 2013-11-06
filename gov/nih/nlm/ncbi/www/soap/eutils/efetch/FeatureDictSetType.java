/**
 * FeatureDictSetType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class FeatureDictSetType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.FeatureDescrType[] featureDescr;

    public FeatureDictSetType() {
    }

    public FeatureDictSetType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.FeatureDescrType[] featureDescr) {
           this.featureDescr = featureDescr;
    }


    /**
     * Gets the featureDescr value for this FeatureDictSetType.
     * 
     * @return featureDescr
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.FeatureDescrType[] getFeatureDescr() {
        return featureDescr;
    }


    /**
     * Sets the featureDescr value for this FeatureDictSetType.
     * 
     * @param featureDescr
     */
    public void setFeatureDescr(gov.nih.nlm.ncbi.www.soap.eutils.efetch.FeatureDescrType[] featureDescr) {
        this.featureDescr = featureDescr;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.FeatureDescrType getFeatureDescr(int i) {
        return this.featureDescr[i];
    }

    public void setFeatureDescr(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.FeatureDescrType _value) {
        this.featureDescr[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FeatureDictSetType)) return false;
        FeatureDictSetType other = (FeatureDictSetType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.featureDescr==null && other.getFeatureDescr()==null) || 
             (this.featureDescr!=null &&
              java.util.Arrays.equals(this.featureDescr, other.getFeatureDescr())));
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
        if (getFeatureDescr() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFeatureDescr());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFeatureDescr(), i);
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
        new org.apache.axis.description.TypeDesc(FeatureDictSetType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "FeatureDictSetType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("featureDescr");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "FeatureDescr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "FeatureDescrType"));
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
