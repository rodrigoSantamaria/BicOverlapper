/**
 * RegionSimilarityType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class RegionSimilarityType  implements java.io.Serializable {
    private java.lang.String regionSimilarity_dimension;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.RegionSimilarity_biostrucIdsType regionSimilarity_biostrucIds;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.RegionSimilarity_similarityType regionSimilarity_similarity;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.RegionSimilarity_transformType regionSimilarity_transform;

    public RegionSimilarityType() {
    }

    public RegionSimilarityType(
           java.lang.String regionSimilarity_dimension,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.RegionSimilarity_biostrucIdsType regionSimilarity_biostrucIds,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.RegionSimilarity_similarityType regionSimilarity_similarity,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.RegionSimilarity_transformType regionSimilarity_transform) {
           this.regionSimilarity_dimension = regionSimilarity_dimension;
           this.regionSimilarity_biostrucIds = regionSimilarity_biostrucIds;
           this.regionSimilarity_similarity = regionSimilarity_similarity;
           this.regionSimilarity_transform = regionSimilarity_transform;
    }


    /**
     * Gets the regionSimilarity_dimension value for this RegionSimilarityType.
     * 
     * @return regionSimilarity_dimension
     */
    public java.lang.String getRegionSimilarity_dimension() {
        return regionSimilarity_dimension;
    }


    /**
     * Sets the regionSimilarity_dimension value for this RegionSimilarityType.
     * 
     * @param regionSimilarity_dimension
     */
    public void setRegionSimilarity_dimension(java.lang.String regionSimilarity_dimension) {
        this.regionSimilarity_dimension = regionSimilarity_dimension;
    }


    /**
     * Gets the regionSimilarity_biostrucIds value for this RegionSimilarityType.
     * 
     * @return regionSimilarity_biostrucIds
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.RegionSimilarity_biostrucIdsType getRegionSimilarity_biostrucIds() {
        return regionSimilarity_biostrucIds;
    }


    /**
     * Sets the regionSimilarity_biostrucIds value for this RegionSimilarityType.
     * 
     * @param regionSimilarity_biostrucIds
     */
    public void setRegionSimilarity_biostrucIds(gov.nih.nlm.ncbi.www.soap.eutils.efetch.RegionSimilarity_biostrucIdsType regionSimilarity_biostrucIds) {
        this.regionSimilarity_biostrucIds = regionSimilarity_biostrucIds;
    }


    /**
     * Gets the regionSimilarity_similarity value for this RegionSimilarityType.
     * 
     * @return regionSimilarity_similarity
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.RegionSimilarity_similarityType getRegionSimilarity_similarity() {
        return regionSimilarity_similarity;
    }


    /**
     * Sets the regionSimilarity_similarity value for this RegionSimilarityType.
     * 
     * @param regionSimilarity_similarity
     */
    public void setRegionSimilarity_similarity(gov.nih.nlm.ncbi.www.soap.eutils.efetch.RegionSimilarity_similarityType regionSimilarity_similarity) {
        this.regionSimilarity_similarity = regionSimilarity_similarity;
    }


    /**
     * Gets the regionSimilarity_transform value for this RegionSimilarityType.
     * 
     * @return regionSimilarity_transform
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.RegionSimilarity_transformType getRegionSimilarity_transform() {
        return regionSimilarity_transform;
    }


    /**
     * Sets the regionSimilarity_transform value for this RegionSimilarityType.
     * 
     * @param regionSimilarity_transform
     */
    public void setRegionSimilarity_transform(gov.nih.nlm.ncbi.www.soap.eutils.efetch.RegionSimilarity_transformType regionSimilarity_transform) {
        this.regionSimilarity_transform = regionSimilarity_transform;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RegionSimilarityType)) return false;
        RegionSimilarityType other = (RegionSimilarityType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.regionSimilarity_dimension==null && other.getRegionSimilarity_dimension()==null) || 
             (this.regionSimilarity_dimension!=null &&
              this.regionSimilarity_dimension.equals(other.getRegionSimilarity_dimension()))) &&
            ((this.regionSimilarity_biostrucIds==null && other.getRegionSimilarity_biostrucIds()==null) || 
             (this.regionSimilarity_biostrucIds!=null &&
              this.regionSimilarity_biostrucIds.equals(other.getRegionSimilarity_biostrucIds()))) &&
            ((this.regionSimilarity_similarity==null && other.getRegionSimilarity_similarity()==null) || 
             (this.regionSimilarity_similarity!=null &&
              this.regionSimilarity_similarity.equals(other.getRegionSimilarity_similarity()))) &&
            ((this.regionSimilarity_transform==null && other.getRegionSimilarity_transform()==null) || 
             (this.regionSimilarity_transform!=null &&
              this.regionSimilarity_transform.equals(other.getRegionSimilarity_transform())));
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
        if (getRegionSimilarity_dimension() != null) {
            _hashCode += getRegionSimilarity_dimension().hashCode();
        }
        if (getRegionSimilarity_biostrucIds() != null) {
            _hashCode += getRegionSimilarity_biostrucIds().hashCode();
        }
        if (getRegionSimilarity_similarity() != null) {
            _hashCode += getRegionSimilarity_similarity().hashCode();
        }
        if (getRegionSimilarity_transform() != null) {
            _hashCode += getRegionSimilarity_transform().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RegionSimilarityType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Region-similarityType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regionSimilarity_dimension");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Region-similarity_dimension"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regionSimilarity_biostrucIds");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Region-similarity_biostruc-ids"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Region-similarity_biostruc-idsType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regionSimilarity_similarity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Region-similarity_similarity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Region-similarity_similarityType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regionSimilarity_transform");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Region-similarity_transform"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Region-similarity_transformType"));
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
