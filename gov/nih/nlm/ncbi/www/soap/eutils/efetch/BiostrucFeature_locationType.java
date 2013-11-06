/**
 * BiostrucFeature_locationType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class BiostrucFeature_locationType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucFeature_location_subgraphType biostrucFeature_location_subgraph;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucFeature_location_regionType biostrucFeature_location_region;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucFeature_location_alignmentType biostrucFeature_location_alignment;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucFeature_location_similarityType biostrucFeature_location_similarity;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucFeature_location_indirectType biostrucFeature_location_indirect;

    public BiostrucFeature_locationType() {
    }

    public BiostrucFeature_locationType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucFeature_location_subgraphType biostrucFeature_location_subgraph,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucFeature_location_regionType biostrucFeature_location_region,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucFeature_location_alignmentType biostrucFeature_location_alignment,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucFeature_location_similarityType biostrucFeature_location_similarity,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucFeature_location_indirectType biostrucFeature_location_indirect) {
           this.biostrucFeature_location_subgraph = biostrucFeature_location_subgraph;
           this.biostrucFeature_location_region = biostrucFeature_location_region;
           this.biostrucFeature_location_alignment = biostrucFeature_location_alignment;
           this.biostrucFeature_location_similarity = biostrucFeature_location_similarity;
           this.biostrucFeature_location_indirect = biostrucFeature_location_indirect;
    }


    /**
     * Gets the biostrucFeature_location_subgraph value for this BiostrucFeature_locationType.
     * 
     * @return biostrucFeature_location_subgraph
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucFeature_location_subgraphType getBiostrucFeature_location_subgraph() {
        return biostrucFeature_location_subgraph;
    }


    /**
     * Sets the biostrucFeature_location_subgraph value for this BiostrucFeature_locationType.
     * 
     * @param biostrucFeature_location_subgraph
     */
    public void setBiostrucFeature_location_subgraph(gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucFeature_location_subgraphType biostrucFeature_location_subgraph) {
        this.biostrucFeature_location_subgraph = biostrucFeature_location_subgraph;
    }


    /**
     * Gets the biostrucFeature_location_region value for this BiostrucFeature_locationType.
     * 
     * @return biostrucFeature_location_region
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucFeature_location_regionType getBiostrucFeature_location_region() {
        return biostrucFeature_location_region;
    }


    /**
     * Sets the biostrucFeature_location_region value for this BiostrucFeature_locationType.
     * 
     * @param biostrucFeature_location_region
     */
    public void setBiostrucFeature_location_region(gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucFeature_location_regionType biostrucFeature_location_region) {
        this.biostrucFeature_location_region = biostrucFeature_location_region;
    }


    /**
     * Gets the biostrucFeature_location_alignment value for this BiostrucFeature_locationType.
     * 
     * @return biostrucFeature_location_alignment
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucFeature_location_alignmentType getBiostrucFeature_location_alignment() {
        return biostrucFeature_location_alignment;
    }


    /**
     * Sets the biostrucFeature_location_alignment value for this BiostrucFeature_locationType.
     * 
     * @param biostrucFeature_location_alignment
     */
    public void setBiostrucFeature_location_alignment(gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucFeature_location_alignmentType biostrucFeature_location_alignment) {
        this.biostrucFeature_location_alignment = biostrucFeature_location_alignment;
    }


    /**
     * Gets the biostrucFeature_location_similarity value for this BiostrucFeature_locationType.
     * 
     * @return biostrucFeature_location_similarity
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucFeature_location_similarityType getBiostrucFeature_location_similarity() {
        return biostrucFeature_location_similarity;
    }


    /**
     * Sets the biostrucFeature_location_similarity value for this BiostrucFeature_locationType.
     * 
     * @param biostrucFeature_location_similarity
     */
    public void setBiostrucFeature_location_similarity(gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucFeature_location_similarityType biostrucFeature_location_similarity) {
        this.biostrucFeature_location_similarity = biostrucFeature_location_similarity;
    }


    /**
     * Gets the biostrucFeature_location_indirect value for this BiostrucFeature_locationType.
     * 
     * @return biostrucFeature_location_indirect
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucFeature_location_indirectType getBiostrucFeature_location_indirect() {
        return biostrucFeature_location_indirect;
    }


    /**
     * Sets the biostrucFeature_location_indirect value for this BiostrucFeature_locationType.
     * 
     * @param biostrucFeature_location_indirect
     */
    public void setBiostrucFeature_location_indirect(gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucFeature_location_indirectType biostrucFeature_location_indirect) {
        this.biostrucFeature_location_indirect = biostrucFeature_location_indirect;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BiostrucFeature_locationType)) return false;
        BiostrucFeature_locationType other = (BiostrucFeature_locationType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.biostrucFeature_location_subgraph==null && other.getBiostrucFeature_location_subgraph()==null) || 
             (this.biostrucFeature_location_subgraph!=null &&
              this.biostrucFeature_location_subgraph.equals(other.getBiostrucFeature_location_subgraph()))) &&
            ((this.biostrucFeature_location_region==null && other.getBiostrucFeature_location_region()==null) || 
             (this.biostrucFeature_location_region!=null &&
              this.biostrucFeature_location_region.equals(other.getBiostrucFeature_location_region()))) &&
            ((this.biostrucFeature_location_alignment==null && other.getBiostrucFeature_location_alignment()==null) || 
             (this.biostrucFeature_location_alignment!=null &&
              this.biostrucFeature_location_alignment.equals(other.getBiostrucFeature_location_alignment()))) &&
            ((this.biostrucFeature_location_similarity==null && other.getBiostrucFeature_location_similarity()==null) || 
             (this.biostrucFeature_location_similarity!=null &&
              this.biostrucFeature_location_similarity.equals(other.getBiostrucFeature_location_similarity()))) &&
            ((this.biostrucFeature_location_indirect==null && other.getBiostrucFeature_location_indirect()==null) || 
             (this.biostrucFeature_location_indirect!=null &&
              this.biostrucFeature_location_indirect.equals(other.getBiostrucFeature_location_indirect())));
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
        if (getBiostrucFeature_location_subgraph() != null) {
            _hashCode += getBiostrucFeature_location_subgraph().hashCode();
        }
        if (getBiostrucFeature_location_region() != null) {
            _hashCode += getBiostrucFeature_location_region().hashCode();
        }
        if (getBiostrucFeature_location_alignment() != null) {
            _hashCode += getBiostrucFeature_location_alignment().hashCode();
        }
        if (getBiostrucFeature_location_similarity() != null) {
            _hashCode += getBiostrucFeature_location_similarity().hashCode();
        }
        if (getBiostrucFeature_location_indirect() != null) {
            _hashCode += getBiostrucFeature_location_indirect().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BiostrucFeature_locationType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-feature_locationType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("biostrucFeature_location_subgraph");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-feature_location_subgraph"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-feature_location_subgraphType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("biostrucFeature_location_region");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-feature_location_region"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-feature_location_regionType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("biostrucFeature_location_alignment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-feature_location_alignment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-feature_location_alignmentType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("biostrucFeature_location_similarity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-feature_location_similarity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-feature_location_similarityType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("biostrucFeature_location_indirect");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-feature_location_indirect"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-feature_location_indirectType"));
        elemField.setMinOccurs(0);
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
