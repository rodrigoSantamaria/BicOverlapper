/**
 * AssayType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class AssayType  implements java.io.Serializable {
    private java.lang.String assay_handle;

    private java.lang.String assay_batch;

    private java.lang.String assay_batchId;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Assay_batchTypeType assay_batchType;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Assay_molTypeType assay_molType;

    private java.lang.String assay_sampleSize;

    private java.lang.String assay_population;

    private java.lang.String assay_linkoutUrl;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Assay_methodType assay_method;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Assay_taxonomyType assay_taxonomy;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Assay_strainsType assay_strains;

    private java.lang.String assay_comment;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Assay_citationType assay_citation;

    public AssayType() {
    }

    public AssayType(
           java.lang.String assay_handle,
           java.lang.String assay_batch,
           java.lang.String assay_batchId,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Assay_batchTypeType assay_batchType,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Assay_molTypeType assay_molType,
           java.lang.String assay_sampleSize,
           java.lang.String assay_population,
           java.lang.String assay_linkoutUrl,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Assay_methodType assay_method,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Assay_taxonomyType assay_taxonomy,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Assay_strainsType assay_strains,
           java.lang.String assay_comment,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Assay_citationType assay_citation) {
           this.assay_handle = assay_handle;
           this.assay_batch = assay_batch;
           this.assay_batchId = assay_batchId;
           this.assay_batchType = assay_batchType;
           this.assay_molType = assay_molType;
           this.assay_sampleSize = assay_sampleSize;
           this.assay_population = assay_population;
           this.assay_linkoutUrl = assay_linkoutUrl;
           this.assay_method = assay_method;
           this.assay_taxonomy = assay_taxonomy;
           this.assay_strains = assay_strains;
           this.assay_comment = assay_comment;
           this.assay_citation = assay_citation;
    }


    /**
     * Gets the assay_handle value for this AssayType.
     * 
     * @return assay_handle
     */
    public java.lang.String getAssay_handle() {
        return assay_handle;
    }


    /**
     * Sets the assay_handle value for this AssayType.
     * 
     * @param assay_handle
     */
    public void setAssay_handle(java.lang.String assay_handle) {
        this.assay_handle = assay_handle;
    }


    /**
     * Gets the assay_batch value for this AssayType.
     * 
     * @return assay_batch
     */
    public java.lang.String getAssay_batch() {
        return assay_batch;
    }


    /**
     * Sets the assay_batch value for this AssayType.
     * 
     * @param assay_batch
     */
    public void setAssay_batch(java.lang.String assay_batch) {
        this.assay_batch = assay_batch;
    }


    /**
     * Gets the assay_batchId value for this AssayType.
     * 
     * @return assay_batchId
     */
    public java.lang.String getAssay_batchId() {
        return assay_batchId;
    }


    /**
     * Sets the assay_batchId value for this AssayType.
     * 
     * @param assay_batchId
     */
    public void setAssay_batchId(java.lang.String assay_batchId) {
        this.assay_batchId = assay_batchId;
    }


    /**
     * Gets the assay_batchType value for this AssayType.
     * 
     * @return assay_batchType
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Assay_batchTypeType getAssay_batchType() {
        return assay_batchType;
    }


    /**
     * Sets the assay_batchType value for this AssayType.
     * 
     * @param assay_batchType
     */
    public void setAssay_batchType(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Assay_batchTypeType assay_batchType) {
        this.assay_batchType = assay_batchType;
    }


    /**
     * Gets the assay_molType value for this AssayType.
     * 
     * @return assay_molType
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Assay_molTypeType getAssay_molType() {
        return assay_molType;
    }


    /**
     * Sets the assay_molType value for this AssayType.
     * 
     * @param assay_molType
     */
    public void setAssay_molType(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Assay_molTypeType assay_molType) {
        this.assay_molType = assay_molType;
    }


    /**
     * Gets the assay_sampleSize value for this AssayType.
     * 
     * @return assay_sampleSize
     */
    public java.lang.String getAssay_sampleSize() {
        return assay_sampleSize;
    }


    /**
     * Sets the assay_sampleSize value for this AssayType.
     * 
     * @param assay_sampleSize
     */
    public void setAssay_sampleSize(java.lang.String assay_sampleSize) {
        this.assay_sampleSize = assay_sampleSize;
    }


    /**
     * Gets the assay_population value for this AssayType.
     * 
     * @return assay_population
     */
    public java.lang.String getAssay_population() {
        return assay_population;
    }


    /**
     * Sets the assay_population value for this AssayType.
     * 
     * @param assay_population
     */
    public void setAssay_population(java.lang.String assay_population) {
        this.assay_population = assay_population;
    }


    /**
     * Gets the assay_linkoutUrl value for this AssayType.
     * 
     * @return assay_linkoutUrl
     */
    public java.lang.String getAssay_linkoutUrl() {
        return assay_linkoutUrl;
    }


    /**
     * Sets the assay_linkoutUrl value for this AssayType.
     * 
     * @param assay_linkoutUrl
     */
    public void setAssay_linkoutUrl(java.lang.String assay_linkoutUrl) {
        this.assay_linkoutUrl = assay_linkoutUrl;
    }


    /**
     * Gets the assay_method value for this AssayType.
     * 
     * @return assay_method
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Assay_methodType getAssay_method() {
        return assay_method;
    }


    /**
     * Sets the assay_method value for this AssayType.
     * 
     * @param assay_method
     */
    public void setAssay_method(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Assay_methodType assay_method) {
        this.assay_method = assay_method;
    }


    /**
     * Gets the assay_taxonomy value for this AssayType.
     * 
     * @return assay_taxonomy
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Assay_taxonomyType getAssay_taxonomy() {
        return assay_taxonomy;
    }


    /**
     * Sets the assay_taxonomy value for this AssayType.
     * 
     * @param assay_taxonomy
     */
    public void setAssay_taxonomy(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Assay_taxonomyType assay_taxonomy) {
        this.assay_taxonomy = assay_taxonomy;
    }


    /**
     * Gets the assay_strains value for this AssayType.
     * 
     * @return assay_strains
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Assay_strainsType getAssay_strains() {
        return assay_strains;
    }


    /**
     * Sets the assay_strains value for this AssayType.
     * 
     * @param assay_strains
     */
    public void setAssay_strains(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Assay_strainsType assay_strains) {
        this.assay_strains = assay_strains;
    }


    /**
     * Gets the assay_comment value for this AssayType.
     * 
     * @return assay_comment
     */
    public java.lang.String getAssay_comment() {
        return assay_comment;
    }


    /**
     * Sets the assay_comment value for this AssayType.
     * 
     * @param assay_comment
     */
    public void setAssay_comment(java.lang.String assay_comment) {
        this.assay_comment = assay_comment;
    }


    /**
     * Gets the assay_citation value for this AssayType.
     * 
     * @return assay_citation
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Assay_citationType getAssay_citation() {
        return assay_citation;
    }


    /**
     * Sets the assay_citation value for this AssayType.
     * 
     * @param assay_citation
     */
    public void setAssay_citation(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Assay_citationType assay_citation) {
        this.assay_citation = assay_citation;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AssayType)) return false;
        AssayType other = (AssayType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.assay_handle==null && other.getAssay_handle()==null) || 
             (this.assay_handle!=null &&
              this.assay_handle.equals(other.getAssay_handle()))) &&
            ((this.assay_batch==null && other.getAssay_batch()==null) || 
             (this.assay_batch!=null &&
              this.assay_batch.equals(other.getAssay_batch()))) &&
            ((this.assay_batchId==null && other.getAssay_batchId()==null) || 
             (this.assay_batchId!=null &&
              this.assay_batchId.equals(other.getAssay_batchId()))) &&
            ((this.assay_batchType==null && other.getAssay_batchType()==null) || 
             (this.assay_batchType!=null &&
              this.assay_batchType.equals(other.getAssay_batchType()))) &&
            ((this.assay_molType==null && other.getAssay_molType()==null) || 
             (this.assay_molType!=null &&
              this.assay_molType.equals(other.getAssay_molType()))) &&
            ((this.assay_sampleSize==null && other.getAssay_sampleSize()==null) || 
             (this.assay_sampleSize!=null &&
              this.assay_sampleSize.equals(other.getAssay_sampleSize()))) &&
            ((this.assay_population==null && other.getAssay_population()==null) || 
             (this.assay_population!=null &&
              this.assay_population.equals(other.getAssay_population()))) &&
            ((this.assay_linkoutUrl==null && other.getAssay_linkoutUrl()==null) || 
             (this.assay_linkoutUrl!=null &&
              this.assay_linkoutUrl.equals(other.getAssay_linkoutUrl()))) &&
            ((this.assay_method==null && other.getAssay_method()==null) || 
             (this.assay_method!=null &&
              this.assay_method.equals(other.getAssay_method()))) &&
            ((this.assay_taxonomy==null && other.getAssay_taxonomy()==null) || 
             (this.assay_taxonomy!=null &&
              this.assay_taxonomy.equals(other.getAssay_taxonomy()))) &&
            ((this.assay_strains==null && other.getAssay_strains()==null) || 
             (this.assay_strains!=null &&
              this.assay_strains.equals(other.getAssay_strains()))) &&
            ((this.assay_comment==null && other.getAssay_comment()==null) || 
             (this.assay_comment!=null &&
              this.assay_comment.equals(other.getAssay_comment()))) &&
            ((this.assay_citation==null && other.getAssay_citation()==null) || 
             (this.assay_citation!=null &&
              this.assay_citation.equals(other.getAssay_citation())));
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
        if (getAssay_handle() != null) {
            _hashCode += getAssay_handle().hashCode();
        }
        if (getAssay_batch() != null) {
            _hashCode += getAssay_batch().hashCode();
        }
        if (getAssay_batchId() != null) {
            _hashCode += getAssay_batchId().hashCode();
        }
        if (getAssay_batchType() != null) {
            _hashCode += getAssay_batchType().hashCode();
        }
        if (getAssay_molType() != null) {
            _hashCode += getAssay_molType().hashCode();
        }
        if (getAssay_sampleSize() != null) {
            _hashCode += getAssay_sampleSize().hashCode();
        }
        if (getAssay_population() != null) {
            _hashCode += getAssay_population().hashCode();
        }
        if (getAssay_linkoutUrl() != null) {
            _hashCode += getAssay_linkoutUrl().hashCode();
        }
        if (getAssay_method() != null) {
            _hashCode += getAssay_method().hashCode();
        }
        if (getAssay_taxonomy() != null) {
            _hashCode += getAssay_taxonomy().hashCode();
        }
        if (getAssay_strains() != null) {
            _hashCode += getAssay_strains().hashCode();
        }
        if (getAssay_comment() != null) {
            _hashCode += getAssay_comment().hashCode();
        }
        if (getAssay_citation() != null) {
            _hashCode += getAssay_citation().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AssayType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "AssayType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assay_handle");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Assay_handle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assay_batch");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Assay_batch"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assay_batchId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Assay_batchId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assay_batchType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Assay_batchType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Assay_batchTypeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assay_molType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Assay_molType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Assay_molTypeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assay_sampleSize");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Assay_sampleSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assay_population");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Assay_population"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assay_linkoutUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Assay_linkoutUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assay_method");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Assay_method"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Assay_methodType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assay_taxonomy");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Assay_taxonomy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Assay_taxonomyType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assay_strains");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Assay_strains"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Assay_strainsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assay_comment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Assay_comment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assay_citation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Assay_citation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Assay_citationType"));
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
