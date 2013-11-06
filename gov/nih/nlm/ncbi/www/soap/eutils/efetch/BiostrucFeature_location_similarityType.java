/**
 * BiostrucFeature_location_similarityType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class BiostrucFeature_location_similarityType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.RegionSimilarityType regionSimilarity;

    public BiostrucFeature_location_similarityType() {
    }

    public BiostrucFeature_location_similarityType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.RegionSimilarityType regionSimilarity) {
           this.regionSimilarity = regionSimilarity;
    }


    /**
     * Gets the regionSimilarity value for this BiostrucFeature_location_similarityType.
     * 
     * @return regionSimilarity
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.RegionSimilarityType getRegionSimilarity() {
        return regionSimilarity;
    }


    /**
     * Sets the regionSimilarity value for this BiostrucFeature_location_similarityType.
     * 
     * @param regionSimilarity
     */
    public void setRegionSimilarity(gov.nih.nlm.ncbi.www.soap.eutils.efetch.RegionSimilarityType regionSimilarity) {
        this.regionSimilarity = regionSimilarity;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BiostrucFeature_location_similarityType)) return false;
        BiostrucFeature_location_similarityType other = (BiostrucFeature_location_similarityType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.regionSimilarity==null && other.getRegionSimilarity()==null) || 
             (this.regionSimilarity!=null &&
              this.regionSimilarity.equals(other.getRegionSimilarity())));
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
        if (getRegionSimilarity() != null) {
            _hashCode += getRegionSimilarity().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BiostrucFeature_location_similarityType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-feature_location_similarityType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regionSimilarity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Region-similarity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Region-similarityType"));
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
