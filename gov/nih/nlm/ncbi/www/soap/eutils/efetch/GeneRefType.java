/**
 * GeneRefType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class GeneRefType  implements java.io.Serializable {
    private java.lang.String geneRef_locus;

    private java.lang.String geneRef_allele;

    private java.lang.String geneRef_desc;

    private java.lang.String geneRef_maploc;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.GeneRef_pseudoType geneRef_pseudo;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.GeneRef_dbType geneRef_db;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.GeneRef_synType geneRef_syn;

    private java.lang.String geneRef_locusTag;

    public GeneRefType() {
    }

    public GeneRefType(
           java.lang.String geneRef_locus,
           java.lang.String geneRef_allele,
           java.lang.String geneRef_desc,
           java.lang.String geneRef_maploc,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.GeneRef_pseudoType geneRef_pseudo,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.GeneRef_dbType geneRef_db,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.GeneRef_synType geneRef_syn,
           java.lang.String geneRef_locusTag) {
           this.geneRef_locus = geneRef_locus;
           this.geneRef_allele = geneRef_allele;
           this.geneRef_desc = geneRef_desc;
           this.geneRef_maploc = geneRef_maploc;
           this.geneRef_pseudo = geneRef_pseudo;
           this.geneRef_db = geneRef_db;
           this.geneRef_syn = geneRef_syn;
           this.geneRef_locusTag = geneRef_locusTag;
    }


    /**
     * Gets the geneRef_locus value for this GeneRefType.
     * 
     * @return geneRef_locus
     */
    public java.lang.String getGeneRef_locus() {
        return geneRef_locus;
    }


    /**
     * Sets the geneRef_locus value for this GeneRefType.
     * 
     * @param geneRef_locus
     */
    public void setGeneRef_locus(java.lang.String geneRef_locus) {
        this.geneRef_locus = geneRef_locus;
    }


    /**
     * Gets the geneRef_allele value for this GeneRefType.
     * 
     * @return geneRef_allele
     */
    public java.lang.String getGeneRef_allele() {
        return geneRef_allele;
    }


    /**
     * Sets the geneRef_allele value for this GeneRefType.
     * 
     * @param geneRef_allele
     */
    public void setGeneRef_allele(java.lang.String geneRef_allele) {
        this.geneRef_allele = geneRef_allele;
    }


    /**
     * Gets the geneRef_desc value for this GeneRefType.
     * 
     * @return geneRef_desc
     */
    public java.lang.String getGeneRef_desc() {
        return geneRef_desc;
    }


    /**
     * Sets the geneRef_desc value for this GeneRefType.
     * 
     * @param geneRef_desc
     */
    public void setGeneRef_desc(java.lang.String geneRef_desc) {
        this.geneRef_desc = geneRef_desc;
    }


    /**
     * Gets the geneRef_maploc value for this GeneRefType.
     * 
     * @return geneRef_maploc
     */
    public java.lang.String getGeneRef_maploc() {
        return geneRef_maploc;
    }


    /**
     * Sets the geneRef_maploc value for this GeneRefType.
     * 
     * @param geneRef_maploc
     */
    public void setGeneRef_maploc(java.lang.String geneRef_maploc) {
        this.geneRef_maploc = geneRef_maploc;
    }


    /**
     * Gets the geneRef_pseudo value for this GeneRefType.
     * 
     * @return geneRef_pseudo
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.GeneRef_pseudoType getGeneRef_pseudo() {
        return geneRef_pseudo;
    }


    /**
     * Sets the geneRef_pseudo value for this GeneRefType.
     * 
     * @param geneRef_pseudo
     */
    public void setGeneRef_pseudo(gov.nih.nlm.ncbi.www.soap.eutils.efetch.GeneRef_pseudoType geneRef_pseudo) {
        this.geneRef_pseudo = geneRef_pseudo;
    }


    /**
     * Gets the geneRef_db value for this GeneRefType.
     * 
     * @return geneRef_db
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.GeneRef_dbType getGeneRef_db() {
        return geneRef_db;
    }


    /**
     * Sets the geneRef_db value for this GeneRefType.
     * 
     * @param geneRef_db
     */
    public void setGeneRef_db(gov.nih.nlm.ncbi.www.soap.eutils.efetch.GeneRef_dbType geneRef_db) {
        this.geneRef_db = geneRef_db;
    }


    /**
     * Gets the geneRef_syn value for this GeneRefType.
     * 
     * @return geneRef_syn
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.GeneRef_synType getGeneRef_syn() {
        return geneRef_syn;
    }


    /**
     * Sets the geneRef_syn value for this GeneRefType.
     * 
     * @param geneRef_syn
     */
    public void setGeneRef_syn(gov.nih.nlm.ncbi.www.soap.eutils.efetch.GeneRef_synType geneRef_syn) {
        this.geneRef_syn = geneRef_syn;
    }


    /**
     * Gets the geneRef_locusTag value for this GeneRefType.
     * 
     * @return geneRef_locusTag
     */
    public java.lang.String getGeneRef_locusTag() {
        return geneRef_locusTag;
    }


    /**
     * Sets the geneRef_locusTag value for this GeneRefType.
     * 
     * @param geneRef_locusTag
     */
    public void setGeneRef_locusTag(java.lang.String geneRef_locusTag) {
        this.geneRef_locusTag = geneRef_locusTag;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GeneRefType)) return false;
        GeneRefType other = (GeneRefType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.geneRef_locus==null && other.getGeneRef_locus()==null) || 
             (this.geneRef_locus!=null &&
              this.geneRef_locus.equals(other.getGeneRef_locus()))) &&
            ((this.geneRef_allele==null && other.getGeneRef_allele()==null) || 
             (this.geneRef_allele!=null &&
              this.geneRef_allele.equals(other.getGeneRef_allele()))) &&
            ((this.geneRef_desc==null && other.getGeneRef_desc()==null) || 
             (this.geneRef_desc!=null &&
              this.geneRef_desc.equals(other.getGeneRef_desc()))) &&
            ((this.geneRef_maploc==null && other.getGeneRef_maploc()==null) || 
             (this.geneRef_maploc!=null &&
              this.geneRef_maploc.equals(other.getGeneRef_maploc()))) &&
            ((this.geneRef_pseudo==null && other.getGeneRef_pseudo()==null) || 
             (this.geneRef_pseudo!=null &&
              this.geneRef_pseudo.equals(other.getGeneRef_pseudo()))) &&
            ((this.geneRef_db==null && other.getGeneRef_db()==null) || 
             (this.geneRef_db!=null &&
              this.geneRef_db.equals(other.getGeneRef_db()))) &&
            ((this.geneRef_syn==null && other.getGeneRef_syn()==null) || 
             (this.geneRef_syn!=null &&
              this.geneRef_syn.equals(other.getGeneRef_syn()))) &&
            ((this.geneRef_locusTag==null && other.getGeneRef_locusTag()==null) || 
             (this.geneRef_locusTag!=null &&
              this.geneRef_locusTag.equals(other.getGeneRef_locusTag())));
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
        if (getGeneRef_locus() != null) {
            _hashCode += getGeneRef_locus().hashCode();
        }
        if (getGeneRef_allele() != null) {
            _hashCode += getGeneRef_allele().hashCode();
        }
        if (getGeneRef_desc() != null) {
            _hashCode += getGeneRef_desc().hashCode();
        }
        if (getGeneRef_maploc() != null) {
            _hashCode += getGeneRef_maploc().hashCode();
        }
        if (getGeneRef_pseudo() != null) {
            _hashCode += getGeneRef_pseudo().hashCode();
        }
        if (getGeneRef_db() != null) {
            _hashCode += getGeneRef_db().hashCode();
        }
        if (getGeneRef_syn() != null) {
            _hashCode += getGeneRef_syn().hashCode();
        }
        if (getGeneRef_locusTag() != null) {
            _hashCode += getGeneRef_locusTag().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GeneRefType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Gene-refType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("geneRef_locus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Gene-ref_locus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("geneRef_allele");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Gene-ref_allele"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("geneRef_desc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Gene-ref_desc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("geneRef_maploc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Gene-ref_maploc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("geneRef_pseudo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Gene-ref_pseudo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Gene-ref_pseudoType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("geneRef_db");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Gene-ref_db"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Gene-ref_dbType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("geneRef_syn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Gene-ref_syn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Gene-ref_synType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("geneRef_locusTag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Gene-ref_locus-tag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
