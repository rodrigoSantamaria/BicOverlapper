/**
 * BiostrucFeatureSet_featuresType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class BiostrucFeatureSet_featuresType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucFeatureType[] biostrucFeature;

    public BiostrucFeatureSet_featuresType() {
    }

    public BiostrucFeatureSet_featuresType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucFeatureType[] biostrucFeature) {
           this.biostrucFeature = biostrucFeature;
    }


    /**
     * Gets the biostrucFeature value for this BiostrucFeatureSet_featuresType.
     * 
     * @return biostrucFeature
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucFeatureType[] getBiostrucFeature() {
        return biostrucFeature;
    }


    /**
     * Sets the biostrucFeature value for this BiostrucFeatureSet_featuresType.
     * 
     * @param biostrucFeature
     */
    public void setBiostrucFeature(gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucFeatureType[] biostrucFeature) {
        this.biostrucFeature = biostrucFeature;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucFeatureType getBiostrucFeature(int i) {
        return this.biostrucFeature[i];
    }

    public void setBiostrucFeature(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucFeatureType _value) {
        this.biostrucFeature[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BiostrucFeatureSet_featuresType)) return false;
        BiostrucFeatureSet_featuresType other = (BiostrucFeatureSet_featuresType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.biostrucFeature==null && other.getBiostrucFeature()==null) || 
             (this.biostrucFeature!=null &&
              java.util.Arrays.equals(this.biostrucFeature, other.getBiostrucFeature())));
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
        if (getBiostrucFeature() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBiostrucFeature());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBiostrucFeature(), i);
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
        new org.apache.axis.description.TypeDesc(BiostrucFeatureSet_featuresType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-feature-set_featuresType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("biostrucFeature");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-feature"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-featureType"));
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
