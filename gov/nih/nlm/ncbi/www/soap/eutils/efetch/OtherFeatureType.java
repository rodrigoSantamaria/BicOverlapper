/**
 * OtherFeatureType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class OtherFeatureType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.OtherFeature_biostrucIdType otherFeature_biostrucId;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.OtherFeature_setType otherFeature_set;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.OtherFeature_featureType otherFeature_feature;

    public OtherFeatureType() {
    }

    public OtherFeatureType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.OtherFeature_biostrucIdType otherFeature_biostrucId,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.OtherFeature_setType otherFeature_set,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.OtherFeature_featureType otherFeature_feature) {
           this.otherFeature_biostrucId = otherFeature_biostrucId;
           this.otherFeature_set = otherFeature_set;
           this.otherFeature_feature = otherFeature_feature;
    }


    /**
     * Gets the otherFeature_biostrucId value for this OtherFeatureType.
     * 
     * @return otherFeature_biostrucId
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.OtherFeature_biostrucIdType getOtherFeature_biostrucId() {
        return otherFeature_biostrucId;
    }


    /**
     * Sets the otherFeature_biostrucId value for this OtherFeatureType.
     * 
     * @param otherFeature_biostrucId
     */
    public void setOtherFeature_biostrucId(gov.nih.nlm.ncbi.www.soap.eutils.efetch.OtherFeature_biostrucIdType otherFeature_biostrucId) {
        this.otherFeature_biostrucId = otherFeature_biostrucId;
    }


    /**
     * Gets the otherFeature_set value for this OtherFeatureType.
     * 
     * @return otherFeature_set
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.OtherFeature_setType getOtherFeature_set() {
        return otherFeature_set;
    }


    /**
     * Sets the otherFeature_set value for this OtherFeatureType.
     * 
     * @param otherFeature_set
     */
    public void setOtherFeature_set(gov.nih.nlm.ncbi.www.soap.eutils.efetch.OtherFeature_setType otherFeature_set) {
        this.otherFeature_set = otherFeature_set;
    }


    /**
     * Gets the otherFeature_feature value for this OtherFeatureType.
     * 
     * @return otherFeature_feature
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.OtherFeature_featureType getOtherFeature_feature() {
        return otherFeature_feature;
    }


    /**
     * Sets the otherFeature_feature value for this OtherFeatureType.
     * 
     * @param otherFeature_feature
     */
    public void setOtherFeature_feature(gov.nih.nlm.ncbi.www.soap.eutils.efetch.OtherFeature_featureType otherFeature_feature) {
        this.otherFeature_feature = otherFeature_feature;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OtherFeatureType)) return false;
        OtherFeatureType other = (OtherFeatureType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.otherFeature_biostrucId==null && other.getOtherFeature_biostrucId()==null) || 
             (this.otherFeature_biostrucId!=null &&
              this.otherFeature_biostrucId.equals(other.getOtherFeature_biostrucId()))) &&
            ((this.otherFeature_set==null && other.getOtherFeature_set()==null) || 
             (this.otherFeature_set!=null &&
              this.otherFeature_set.equals(other.getOtherFeature_set()))) &&
            ((this.otherFeature_feature==null && other.getOtherFeature_feature()==null) || 
             (this.otherFeature_feature!=null &&
              this.otherFeature_feature.equals(other.getOtherFeature_feature())));
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
        if (getOtherFeature_biostrucId() != null) {
            _hashCode += getOtherFeature_biostrucId().hashCode();
        }
        if (getOtherFeature_set() != null) {
            _hashCode += getOtherFeature_set().hashCode();
        }
        if (getOtherFeature_feature() != null) {
            _hashCode += getOtherFeature_feature().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OtherFeatureType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Other-featureType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("otherFeature_biostrucId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Other-feature_biostruc-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Other-feature_biostruc-idType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("otherFeature_set");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Other-feature_set"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Other-feature_setType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("otherFeature_feature");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Other-feature_feature"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Other-feature_featureType"));
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
