/**
 * ChemGraphAlignmentType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ChemGraphAlignmentType  implements java.io.Serializable {
    private java.lang.String chemGraphAlignment_dimension;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ChemGraphAlignment_biostrucIdsType chemGraphAlignment_biostrucIds;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ChemGraphAlignment_alignmentType chemGraphAlignment_alignment;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ChemGraphAlignment_domainType chemGraphAlignment_domain;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ChemGraphAlignment_transformType chemGraphAlignment_transform;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ChemGraphAlignment_aligndataType chemGraphAlignment_aligndata;

    public ChemGraphAlignmentType() {
    }

    public ChemGraphAlignmentType(
           java.lang.String chemGraphAlignment_dimension,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ChemGraphAlignment_biostrucIdsType chemGraphAlignment_biostrucIds,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ChemGraphAlignment_alignmentType chemGraphAlignment_alignment,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ChemGraphAlignment_domainType chemGraphAlignment_domain,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ChemGraphAlignment_transformType chemGraphAlignment_transform,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ChemGraphAlignment_aligndataType chemGraphAlignment_aligndata) {
           this.chemGraphAlignment_dimension = chemGraphAlignment_dimension;
           this.chemGraphAlignment_biostrucIds = chemGraphAlignment_biostrucIds;
           this.chemGraphAlignment_alignment = chemGraphAlignment_alignment;
           this.chemGraphAlignment_domain = chemGraphAlignment_domain;
           this.chemGraphAlignment_transform = chemGraphAlignment_transform;
           this.chemGraphAlignment_aligndata = chemGraphAlignment_aligndata;
    }


    /**
     * Gets the chemGraphAlignment_dimension value for this ChemGraphAlignmentType.
     * 
     * @return chemGraphAlignment_dimension
     */
    public java.lang.String getChemGraphAlignment_dimension() {
        return chemGraphAlignment_dimension;
    }


    /**
     * Sets the chemGraphAlignment_dimension value for this ChemGraphAlignmentType.
     * 
     * @param chemGraphAlignment_dimension
     */
    public void setChemGraphAlignment_dimension(java.lang.String chemGraphAlignment_dimension) {
        this.chemGraphAlignment_dimension = chemGraphAlignment_dimension;
    }


    /**
     * Gets the chemGraphAlignment_biostrucIds value for this ChemGraphAlignmentType.
     * 
     * @return chemGraphAlignment_biostrucIds
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ChemGraphAlignment_biostrucIdsType getChemGraphAlignment_biostrucIds() {
        return chemGraphAlignment_biostrucIds;
    }


    /**
     * Sets the chemGraphAlignment_biostrucIds value for this ChemGraphAlignmentType.
     * 
     * @param chemGraphAlignment_biostrucIds
     */
    public void setChemGraphAlignment_biostrucIds(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ChemGraphAlignment_biostrucIdsType chemGraphAlignment_biostrucIds) {
        this.chemGraphAlignment_biostrucIds = chemGraphAlignment_biostrucIds;
    }


    /**
     * Gets the chemGraphAlignment_alignment value for this ChemGraphAlignmentType.
     * 
     * @return chemGraphAlignment_alignment
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ChemGraphAlignment_alignmentType getChemGraphAlignment_alignment() {
        return chemGraphAlignment_alignment;
    }


    /**
     * Sets the chemGraphAlignment_alignment value for this ChemGraphAlignmentType.
     * 
     * @param chemGraphAlignment_alignment
     */
    public void setChemGraphAlignment_alignment(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ChemGraphAlignment_alignmentType chemGraphAlignment_alignment) {
        this.chemGraphAlignment_alignment = chemGraphAlignment_alignment;
    }


    /**
     * Gets the chemGraphAlignment_domain value for this ChemGraphAlignmentType.
     * 
     * @return chemGraphAlignment_domain
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ChemGraphAlignment_domainType getChemGraphAlignment_domain() {
        return chemGraphAlignment_domain;
    }


    /**
     * Sets the chemGraphAlignment_domain value for this ChemGraphAlignmentType.
     * 
     * @param chemGraphAlignment_domain
     */
    public void setChemGraphAlignment_domain(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ChemGraphAlignment_domainType chemGraphAlignment_domain) {
        this.chemGraphAlignment_domain = chemGraphAlignment_domain;
    }


    /**
     * Gets the chemGraphAlignment_transform value for this ChemGraphAlignmentType.
     * 
     * @return chemGraphAlignment_transform
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ChemGraphAlignment_transformType getChemGraphAlignment_transform() {
        return chemGraphAlignment_transform;
    }


    /**
     * Sets the chemGraphAlignment_transform value for this ChemGraphAlignmentType.
     * 
     * @param chemGraphAlignment_transform
     */
    public void setChemGraphAlignment_transform(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ChemGraphAlignment_transformType chemGraphAlignment_transform) {
        this.chemGraphAlignment_transform = chemGraphAlignment_transform;
    }


    /**
     * Gets the chemGraphAlignment_aligndata value for this ChemGraphAlignmentType.
     * 
     * @return chemGraphAlignment_aligndata
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ChemGraphAlignment_aligndataType getChemGraphAlignment_aligndata() {
        return chemGraphAlignment_aligndata;
    }


    /**
     * Sets the chemGraphAlignment_aligndata value for this ChemGraphAlignmentType.
     * 
     * @param chemGraphAlignment_aligndata
     */
    public void setChemGraphAlignment_aligndata(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ChemGraphAlignment_aligndataType chemGraphAlignment_aligndata) {
        this.chemGraphAlignment_aligndata = chemGraphAlignment_aligndata;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChemGraphAlignmentType)) return false;
        ChemGraphAlignmentType other = (ChemGraphAlignmentType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.chemGraphAlignment_dimension==null && other.getChemGraphAlignment_dimension()==null) || 
             (this.chemGraphAlignment_dimension!=null &&
              this.chemGraphAlignment_dimension.equals(other.getChemGraphAlignment_dimension()))) &&
            ((this.chemGraphAlignment_biostrucIds==null && other.getChemGraphAlignment_biostrucIds()==null) || 
             (this.chemGraphAlignment_biostrucIds!=null &&
              this.chemGraphAlignment_biostrucIds.equals(other.getChemGraphAlignment_biostrucIds()))) &&
            ((this.chemGraphAlignment_alignment==null && other.getChemGraphAlignment_alignment()==null) || 
             (this.chemGraphAlignment_alignment!=null &&
              this.chemGraphAlignment_alignment.equals(other.getChemGraphAlignment_alignment()))) &&
            ((this.chemGraphAlignment_domain==null && other.getChemGraphAlignment_domain()==null) || 
             (this.chemGraphAlignment_domain!=null &&
              this.chemGraphAlignment_domain.equals(other.getChemGraphAlignment_domain()))) &&
            ((this.chemGraphAlignment_transform==null && other.getChemGraphAlignment_transform()==null) || 
             (this.chemGraphAlignment_transform!=null &&
              this.chemGraphAlignment_transform.equals(other.getChemGraphAlignment_transform()))) &&
            ((this.chemGraphAlignment_aligndata==null && other.getChemGraphAlignment_aligndata()==null) || 
             (this.chemGraphAlignment_aligndata!=null &&
              this.chemGraphAlignment_aligndata.equals(other.getChemGraphAlignment_aligndata())));
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
        if (getChemGraphAlignment_dimension() != null) {
            _hashCode += getChemGraphAlignment_dimension().hashCode();
        }
        if (getChemGraphAlignment_biostrucIds() != null) {
            _hashCode += getChemGraphAlignment_biostrucIds().hashCode();
        }
        if (getChemGraphAlignment_alignment() != null) {
            _hashCode += getChemGraphAlignment_alignment().hashCode();
        }
        if (getChemGraphAlignment_domain() != null) {
            _hashCode += getChemGraphAlignment_domain().hashCode();
        }
        if (getChemGraphAlignment_transform() != null) {
            _hashCode += getChemGraphAlignment_transform().hashCode();
        }
        if (getChemGraphAlignment_aligndata() != null) {
            _hashCode += getChemGraphAlignment_aligndata().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChemGraphAlignmentType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Chem-graph-alignmentType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chemGraphAlignment_dimension");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Chem-graph-alignment_dimension"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chemGraphAlignment_biostrucIds");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Chem-graph-alignment_biostruc-ids"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Chem-graph-alignment_biostruc-idsType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chemGraphAlignment_alignment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Chem-graph-alignment_alignment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Chem-graph-alignment_alignmentType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chemGraphAlignment_domain");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Chem-graph-alignment_domain"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Chem-graph-alignment_domainType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chemGraphAlignment_transform");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Chem-graph-alignment_transform"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Chem-graph-alignment_transformType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chemGraphAlignment_aligndata");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Chem-graph-alignment_aligndata"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Chem-graph-alignment_aligndataType"));
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
