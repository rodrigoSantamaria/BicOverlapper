/**
 * GeneCommentaryType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class GeneCommentaryType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.GeneCommentary_typeType geneCommentary_type;

    private java.lang.String geneCommentary_heading;

    private java.lang.String geneCommentary_label;

    private java.lang.String geneCommentary_text;

    private java.lang.String geneCommentary_accession;

    private java.lang.String geneCommentary_version;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.GeneCommentary_xtraPropertiesType geneCommentary_xtraProperties;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.GeneCommentary_refsType geneCommentary_refs;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.GeneCommentary_sourceType geneCommentary_source;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.GeneCommentary_genomicCoordsType geneCommentary_genomicCoords;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.GeneCommentary_seqsType geneCommentary_seqs;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.GeneCommentary_productsType geneCommentary_products;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.GeneCommentary_propertiesType geneCommentary_properties;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.GeneCommentary_commentType geneCommentary_comment;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.GeneCommentary_createDateType geneCommentary_createDate;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.GeneCommentary_updateDateType geneCommentary_updateDate;

    public GeneCommentaryType() {
    }

    public GeneCommentaryType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.GeneCommentary_typeType geneCommentary_type,
           java.lang.String geneCommentary_heading,
           java.lang.String geneCommentary_label,
           java.lang.String geneCommentary_text,
           java.lang.String geneCommentary_accession,
           java.lang.String geneCommentary_version,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.GeneCommentary_xtraPropertiesType geneCommentary_xtraProperties,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.GeneCommentary_refsType geneCommentary_refs,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.GeneCommentary_sourceType geneCommentary_source,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.GeneCommentary_genomicCoordsType geneCommentary_genomicCoords,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.GeneCommentary_seqsType geneCommentary_seqs,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.GeneCommentary_productsType geneCommentary_products,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.GeneCommentary_propertiesType geneCommentary_properties,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.GeneCommentary_commentType geneCommentary_comment,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.GeneCommentary_createDateType geneCommentary_createDate,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.GeneCommentary_updateDateType geneCommentary_updateDate) {
           this.geneCommentary_type = geneCommentary_type;
           this.geneCommentary_heading = geneCommentary_heading;
           this.geneCommentary_label = geneCommentary_label;
           this.geneCommentary_text = geneCommentary_text;
           this.geneCommentary_accession = geneCommentary_accession;
           this.geneCommentary_version = geneCommentary_version;
           this.geneCommentary_xtraProperties = geneCommentary_xtraProperties;
           this.geneCommentary_refs = geneCommentary_refs;
           this.geneCommentary_source = geneCommentary_source;
           this.geneCommentary_genomicCoords = geneCommentary_genomicCoords;
           this.geneCommentary_seqs = geneCommentary_seqs;
           this.geneCommentary_products = geneCommentary_products;
           this.geneCommentary_properties = geneCommentary_properties;
           this.geneCommentary_comment = geneCommentary_comment;
           this.geneCommentary_createDate = geneCommentary_createDate;
           this.geneCommentary_updateDate = geneCommentary_updateDate;
    }


    /**
     * Gets the geneCommentary_type value for this GeneCommentaryType.
     * 
     * @return geneCommentary_type
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.GeneCommentary_typeType getGeneCommentary_type() {
        return geneCommentary_type;
    }


    /**
     * Sets the geneCommentary_type value for this GeneCommentaryType.
     * 
     * @param geneCommentary_type
     */
    public void setGeneCommentary_type(gov.nih.nlm.ncbi.www.soap.eutils.efetch.GeneCommentary_typeType geneCommentary_type) {
        this.geneCommentary_type = geneCommentary_type;
    }


    /**
     * Gets the geneCommentary_heading value for this GeneCommentaryType.
     * 
     * @return geneCommentary_heading
     */
    public java.lang.String getGeneCommentary_heading() {
        return geneCommentary_heading;
    }


    /**
     * Sets the geneCommentary_heading value for this GeneCommentaryType.
     * 
     * @param geneCommentary_heading
     */
    public void setGeneCommentary_heading(java.lang.String geneCommentary_heading) {
        this.geneCommentary_heading = geneCommentary_heading;
    }


    /**
     * Gets the geneCommentary_label value for this GeneCommentaryType.
     * 
     * @return geneCommentary_label
     */
    public java.lang.String getGeneCommentary_label() {
        return geneCommentary_label;
    }


    /**
     * Sets the geneCommentary_label value for this GeneCommentaryType.
     * 
     * @param geneCommentary_label
     */
    public void setGeneCommentary_label(java.lang.String geneCommentary_label) {
        this.geneCommentary_label = geneCommentary_label;
    }


    /**
     * Gets the geneCommentary_text value for this GeneCommentaryType.
     * 
     * @return geneCommentary_text
     */
    public java.lang.String getGeneCommentary_text() {
        return geneCommentary_text;
    }


    /**
     * Sets the geneCommentary_text value for this GeneCommentaryType.
     * 
     * @param geneCommentary_text
     */
    public void setGeneCommentary_text(java.lang.String geneCommentary_text) {
        this.geneCommentary_text = geneCommentary_text;
    }


    /**
     * Gets the geneCommentary_accession value for this GeneCommentaryType.
     * 
     * @return geneCommentary_accession
     */
    public java.lang.String getGeneCommentary_accession() {
        return geneCommentary_accession;
    }


    /**
     * Sets the geneCommentary_accession value for this GeneCommentaryType.
     * 
     * @param geneCommentary_accession
     */
    public void setGeneCommentary_accession(java.lang.String geneCommentary_accession) {
        this.geneCommentary_accession = geneCommentary_accession;
    }


    /**
     * Gets the geneCommentary_version value for this GeneCommentaryType.
     * 
     * @return geneCommentary_version
     */
    public java.lang.String getGeneCommentary_version() {
        return geneCommentary_version;
    }


    /**
     * Sets the geneCommentary_version value for this GeneCommentaryType.
     * 
     * @param geneCommentary_version
     */
    public void setGeneCommentary_version(java.lang.String geneCommentary_version) {
        this.geneCommentary_version = geneCommentary_version;
    }


    /**
     * Gets the geneCommentary_xtraProperties value for this GeneCommentaryType.
     * 
     * @return geneCommentary_xtraProperties
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.GeneCommentary_xtraPropertiesType getGeneCommentary_xtraProperties() {
        return geneCommentary_xtraProperties;
    }


    /**
     * Sets the geneCommentary_xtraProperties value for this GeneCommentaryType.
     * 
     * @param geneCommentary_xtraProperties
     */
    public void setGeneCommentary_xtraProperties(gov.nih.nlm.ncbi.www.soap.eutils.efetch.GeneCommentary_xtraPropertiesType geneCommentary_xtraProperties) {
        this.geneCommentary_xtraProperties = geneCommentary_xtraProperties;
    }


    /**
     * Gets the geneCommentary_refs value for this GeneCommentaryType.
     * 
     * @return geneCommentary_refs
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.GeneCommentary_refsType getGeneCommentary_refs() {
        return geneCommentary_refs;
    }


    /**
     * Sets the geneCommentary_refs value for this GeneCommentaryType.
     * 
     * @param geneCommentary_refs
     */
    public void setGeneCommentary_refs(gov.nih.nlm.ncbi.www.soap.eutils.efetch.GeneCommentary_refsType geneCommentary_refs) {
        this.geneCommentary_refs = geneCommentary_refs;
    }


    /**
     * Gets the geneCommentary_source value for this GeneCommentaryType.
     * 
     * @return geneCommentary_source
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.GeneCommentary_sourceType getGeneCommentary_source() {
        return geneCommentary_source;
    }


    /**
     * Sets the geneCommentary_source value for this GeneCommentaryType.
     * 
     * @param geneCommentary_source
     */
    public void setGeneCommentary_source(gov.nih.nlm.ncbi.www.soap.eutils.efetch.GeneCommentary_sourceType geneCommentary_source) {
        this.geneCommentary_source = geneCommentary_source;
    }


    /**
     * Gets the geneCommentary_genomicCoords value for this GeneCommentaryType.
     * 
     * @return geneCommentary_genomicCoords
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.GeneCommentary_genomicCoordsType getGeneCommentary_genomicCoords() {
        return geneCommentary_genomicCoords;
    }


    /**
     * Sets the geneCommentary_genomicCoords value for this GeneCommentaryType.
     * 
     * @param geneCommentary_genomicCoords
     */
    public void setGeneCommentary_genomicCoords(gov.nih.nlm.ncbi.www.soap.eutils.efetch.GeneCommentary_genomicCoordsType geneCommentary_genomicCoords) {
        this.geneCommentary_genomicCoords = geneCommentary_genomicCoords;
    }


    /**
     * Gets the geneCommentary_seqs value for this GeneCommentaryType.
     * 
     * @return geneCommentary_seqs
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.GeneCommentary_seqsType getGeneCommentary_seqs() {
        return geneCommentary_seqs;
    }


    /**
     * Sets the geneCommentary_seqs value for this GeneCommentaryType.
     * 
     * @param geneCommentary_seqs
     */
    public void setGeneCommentary_seqs(gov.nih.nlm.ncbi.www.soap.eutils.efetch.GeneCommentary_seqsType geneCommentary_seqs) {
        this.geneCommentary_seqs = geneCommentary_seqs;
    }


    /**
     * Gets the geneCommentary_products value for this GeneCommentaryType.
     * 
     * @return geneCommentary_products
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.GeneCommentary_productsType getGeneCommentary_products() {
        return geneCommentary_products;
    }


    /**
     * Sets the geneCommentary_products value for this GeneCommentaryType.
     * 
     * @param geneCommentary_products
     */
    public void setGeneCommentary_products(gov.nih.nlm.ncbi.www.soap.eutils.efetch.GeneCommentary_productsType geneCommentary_products) {
        this.geneCommentary_products = geneCommentary_products;
    }


    /**
     * Gets the geneCommentary_properties value for this GeneCommentaryType.
     * 
     * @return geneCommentary_properties
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.GeneCommentary_propertiesType getGeneCommentary_properties() {
        return geneCommentary_properties;
    }


    /**
     * Sets the geneCommentary_properties value for this GeneCommentaryType.
     * 
     * @param geneCommentary_properties
     */
    public void setGeneCommentary_properties(gov.nih.nlm.ncbi.www.soap.eutils.efetch.GeneCommentary_propertiesType geneCommentary_properties) {
        this.geneCommentary_properties = geneCommentary_properties;
    }


    /**
     * Gets the geneCommentary_comment value for this GeneCommentaryType.
     * 
     * @return geneCommentary_comment
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.GeneCommentary_commentType getGeneCommentary_comment() {
        return geneCommentary_comment;
    }


    /**
     * Sets the geneCommentary_comment value for this GeneCommentaryType.
     * 
     * @param geneCommentary_comment
     */
    public void setGeneCommentary_comment(gov.nih.nlm.ncbi.www.soap.eutils.efetch.GeneCommentary_commentType geneCommentary_comment) {
        this.geneCommentary_comment = geneCommentary_comment;
    }


    /**
     * Gets the geneCommentary_createDate value for this GeneCommentaryType.
     * 
     * @return geneCommentary_createDate
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.GeneCommentary_createDateType getGeneCommentary_createDate() {
        return geneCommentary_createDate;
    }


    /**
     * Sets the geneCommentary_createDate value for this GeneCommentaryType.
     * 
     * @param geneCommentary_createDate
     */
    public void setGeneCommentary_createDate(gov.nih.nlm.ncbi.www.soap.eutils.efetch.GeneCommentary_createDateType geneCommentary_createDate) {
        this.geneCommentary_createDate = geneCommentary_createDate;
    }


    /**
     * Gets the geneCommentary_updateDate value for this GeneCommentaryType.
     * 
     * @return geneCommentary_updateDate
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.GeneCommentary_updateDateType getGeneCommentary_updateDate() {
        return geneCommentary_updateDate;
    }


    /**
     * Sets the geneCommentary_updateDate value for this GeneCommentaryType.
     * 
     * @param geneCommentary_updateDate
     */
    public void setGeneCommentary_updateDate(gov.nih.nlm.ncbi.www.soap.eutils.efetch.GeneCommentary_updateDateType geneCommentary_updateDate) {
        this.geneCommentary_updateDate = geneCommentary_updateDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GeneCommentaryType)) return false;
        GeneCommentaryType other = (GeneCommentaryType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.geneCommentary_type==null && other.getGeneCommentary_type()==null) || 
             (this.geneCommentary_type!=null &&
              this.geneCommentary_type.equals(other.getGeneCommentary_type()))) &&
            ((this.geneCommentary_heading==null && other.getGeneCommentary_heading()==null) || 
             (this.geneCommentary_heading!=null &&
              this.geneCommentary_heading.equals(other.getGeneCommentary_heading()))) &&
            ((this.geneCommentary_label==null && other.getGeneCommentary_label()==null) || 
             (this.geneCommentary_label!=null &&
              this.geneCommentary_label.equals(other.getGeneCommentary_label()))) &&
            ((this.geneCommentary_text==null && other.getGeneCommentary_text()==null) || 
             (this.geneCommentary_text!=null &&
              this.geneCommentary_text.equals(other.getGeneCommentary_text()))) &&
            ((this.geneCommentary_accession==null && other.getGeneCommentary_accession()==null) || 
             (this.geneCommentary_accession!=null &&
              this.geneCommentary_accession.equals(other.getGeneCommentary_accession()))) &&
            ((this.geneCommentary_version==null && other.getGeneCommentary_version()==null) || 
             (this.geneCommentary_version!=null &&
              this.geneCommentary_version.equals(other.getGeneCommentary_version()))) &&
            ((this.geneCommentary_xtraProperties==null && other.getGeneCommentary_xtraProperties()==null) || 
             (this.geneCommentary_xtraProperties!=null &&
              this.geneCommentary_xtraProperties.equals(other.getGeneCommentary_xtraProperties()))) &&
            ((this.geneCommentary_refs==null && other.getGeneCommentary_refs()==null) || 
             (this.geneCommentary_refs!=null &&
              this.geneCommentary_refs.equals(other.getGeneCommentary_refs()))) &&
            ((this.geneCommentary_source==null && other.getGeneCommentary_source()==null) || 
             (this.geneCommentary_source!=null &&
              this.geneCommentary_source.equals(other.getGeneCommentary_source()))) &&
            ((this.geneCommentary_genomicCoords==null && other.getGeneCommentary_genomicCoords()==null) || 
             (this.geneCommentary_genomicCoords!=null &&
              this.geneCommentary_genomicCoords.equals(other.getGeneCommentary_genomicCoords()))) &&
            ((this.geneCommentary_seqs==null && other.getGeneCommentary_seqs()==null) || 
             (this.geneCommentary_seqs!=null &&
              this.geneCommentary_seqs.equals(other.getGeneCommentary_seqs()))) &&
            ((this.geneCommentary_products==null && other.getGeneCommentary_products()==null) || 
             (this.geneCommentary_products!=null &&
              this.geneCommentary_products.equals(other.getGeneCommentary_products()))) &&
            ((this.geneCommentary_properties==null && other.getGeneCommentary_properties()==null) || 
             (this.geneCommentary_properties!=null &&
              this.geneCommentary_properties.equals(other.getGeneCommentary_properties()))) &&
            ((this.geneCommentary_comment==null && other.getGeneCommentary_comment()==null) || 
             (this.geneCommentary_comment!=null &&
              this.geneCommentary_comment.equals(other.getGeneCommentary_comment()))) &&
            ((this.geneCommentary_createDate==null && other.getGeneCommentary_createDate()==null) || 
             (this.geneCommentary_createDate!=null &&
              this.geneCommentary_createDate.equals(other.getGeneCommentary_createDate()))) &&
            ((this.geneCommentary_updateDate==null && other.getGeneCommentary_updateDate()==null) || 
             (this.geneCommentary_updateDate!=null &&
              this.geneCommentary_updateDate.equals(other.getGeneCommentary_updateDate())));
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
        if (getGeneCommentary_type() != null) {
            _hashCode += getGeneCommentary_type().hashCode();
        }
        if (getGeneCommentary_heading() != null) {
            _hashCode += getGeneCommentary_heading().hashCode();
        }
        if (getGeneCommentary_label() != null) {
            _hashCode += getGeneCommentary_label().hashCode();
        }
        if (getGeneCommentary_text() != null) {
            _hashCode += getGeneCommentary_text().hashCode();
        }
        if (getGeneCommentary_accession() != null) {
            _hashCode += getGeneCommentary_accession().hashCode();
        }
        if (getGeneCommentary_version() != null) {
            _hashCode += getGeneCommentary_version().hashCode();
        }
        if (getGeneCommentary_xtraProperties() != null) {
            _hashCode += getGeneCommentary_xtraProperties().hashCode();
        }
        if (getGeneCommentary_refs() != null) {
            _hashCode += getGeneCommentary_refs().hashCode();
        }
        if (getGeneCommentary_source() != null) {
            _hashCode += getGeneCommentary_source().hashCode();
        }
        if (getGeneCommentary_genomicCoords() != null) {
            _hashCode += getGeneCommentary_genomicCoords().hashCode();
        }
        if (getGeneCommentary_seqs() != null) {
            _hashCode += getGeneCommentary_seqs().hashCode();
        }
        if (getGeneCommentary_products() != null) {
            _hashCode += getGeneCommentary_products().hashCode();
        }
        if (getGeneCommentary_properties() != null) {
            _hashCode += getGeneCommentary_properties().hashCode();
        }
        if (getGeneCommentary_comment() != null) {
            _hashCode += getGeneCommentary_comment().hashCode();
        }
        if (getGeneCommentary_createDate() != null) {
            _hashCode += getGeneCommentary_createDate().hashCode();
        }
        if (getGeneCommentary_updateDate() != null) {
            _hashCode += getGeneCommentary_updateDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GeneCommentaryType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Gene-commentaryType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("geneCommentary_type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Gene-commentary_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Gene-commentary_typeType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("geneCommentary_heading");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Gene-commentary_heading"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("geneCommentary_label");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Gene-commentary_label"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("geneCommentary_text");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Gene-commentary_text"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("geneCommentary_accession");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Gene-commentary_accession"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("geneCommentary_version");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Gene-commentary_version"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("geneCommentary_xtraProperties");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Gene-commentary_xtra-properties"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Gene-commentary_xtra-propertiesType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("geneCommentary_refs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Gene-commentary_refs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Gene-commentary_refsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("geneCommentary_source");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Gene-commentary_source"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Gene-commentary_sourceType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("geneCommentary_genomicCoords");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Gene-commentary_genomic-coords"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Gene-commentary_genomic-coordsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("geneCommentary_seqs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Gene-commentary_seqs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Gene-commentary_seqsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("geneCommentary_products");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Gene-commentary_products"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Gene-commentary_productsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("geneCommentary_properties");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Gene-commentary_properties"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Gene-commentary_propertiesType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("geneCommentary_comment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Gene-commentary_comment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Gene-commentary_commentType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("geneCommentary_createDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Gene-commentary_create-date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Gene-commentary_create-dateType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("geneCommentary_updateDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Gene-commentary_update-date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Gene-commentary_update-dateType"));
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
