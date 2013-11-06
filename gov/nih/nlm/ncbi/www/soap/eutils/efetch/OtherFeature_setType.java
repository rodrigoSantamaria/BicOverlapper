/**
 * OtherFeature_setType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class OtherFeature_setType  implements java.io.Serializable {
    private java.lang.String biostrucFeatureSetId;

    public OtherFeature_setType() {
    }

    public OtherFeature_setType(
           java.lang.String biostrucFeatureSetId) {
           this.biostrucFeatureSetId = biostrucFeatureSetId;
    }


    /**
     * Gets the biostrucFeatureSetId value for this OtherFeature_setType.
     * 
     * @return biostrucFeatureSetId
     */
    public java.lang.String getBiostrucFeatureSetId() {
        return biostrucFeatureSetId;
    }


    /**
     * Sets the biostrucFeatureSetId value for this OtherFeature_setType.
     * 
     * @param biostrucFeatureSetId
     */
    public void setBiostrucFeatureSetId(java.lang.String biostrucFeatureSetId) {
        this.biostrucFeatureSetId = biostrucFeatureSetId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OtherFeature_setType)) return false;
        OtherFeature_setType other = (OtherFeature_setType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.biostrucFeatureSetId==null && other.getBiostrucFeatureSetId()==null) || 
             (this.biostrucFeatureSetId!=null &&
              this.biostrucFeatureSetId.equals(other.getBiostrucFeatureSetId())));
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
        if (getBiostrucFeatureSetId() != null) {
            _hashCode += getBiostrucFeatureSetId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OtherFeature_setType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Other-feature_setType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("biostrucFeatureSetId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-feature-set-id"));
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
