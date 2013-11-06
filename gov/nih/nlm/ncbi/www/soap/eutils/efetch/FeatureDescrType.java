/**
 * FeatureDescrType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class FeatureDescrType  implements java.io.Serializable {
    private java.lang.String featureDescr_id;

    private java.lang.String featureDescr_name;

    public FeatureDescrType() {
    }

    public FeatureDescrType(
           java.lang.String featureDescr_id,
           java.lang.String featureDescr_name) {
           this.featureDescr_id = featureDescr_id;
           this.featureDescr_name = featureDescr_name;
    }


    /**
     * Gets the featureDescr_id value for this FeatureDescrType.
     * 
     * @return featureDescr_id
     */
    public java.lang.String getFeatureDescr_id() {
        return featureDescr_id;
    }


    /**
     * Sets the featureDescr_id value for this FeatureDescrType.
     * 
     * @param featureDescr_id
     */
    public void setFeatureDescr_id(java.lang.String featureDescr_id) {
        this.featureDescr_id = featureDescr_id;
    }


    /**
     * Gets the featureDescr_name value for this FeatureDescrType.
     * 
     * @return featureDescr_name
     */
    public java.lang.String getFeatureDescr_name() {
        return featureDescr_name;
    }


    /**
     * Sets the featureDescr_name value for this FeatureDescrType.
     * 
     * @param featureDescr_name
     */
    public void setFeatureDescr_name(java.lang.String featureDescr_name) {
        this.featureDescr_name = featureDescr_name;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FeatureDescrType)) return false;
        FeatureDescrType other = (FeatureDescrType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.featureDescr_id==null && other.getFeatureDescr_id()==null) || 
             (this.featureDescr_id!=null &&
              this.featureDescr_id.equals(other.getFeatureDescr_id()))) &&
            ((this.featureDescr_name==null && other.getFeatureDescr_name()==null) || 
             (this.featureDescr_name!=null &&
              this.featureDescr_name.equals(other.getFeatureDescr_name())));
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
        if (getFeatureDescr_id() != null) {
            _hashCode += getFeatureDescr_id().hashCode();
        }
        if (getFeatureDescr_name() != null) {
            _hashCode += getFeatureDescr_name().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FeatureDescrType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "FeatureDescrType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("featureDescr_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "FeatureDescr_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("featureDescr_name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "FeatureDescr_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
