/**
 * EntrezgeneType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class EntrezgeneType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrezgene_trackInfoType entrezgene_trackInfo;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrezgene_typeType entrezgene_type;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrezgene_sourceType entrezgene_source;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrezgene_geneType entrezgene_gene;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrezgene_protType entrezgene_prot;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrezgene_rnaType entrezgene_rna;

    private java.lang.String entrezgene_summary;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrezgene_locationType entrezgene_location;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrezgene_geneSourceType entrezgene_geneSource;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrezgene_locusType entrezgene_locus;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrezgene_propertiesType entrezgene_properties;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrezgene_refgeneType entrezgene_refgene;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrezgene_homologyType entrezgene_homology;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrezgene_commentsType entrezgene_comments;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrezgene_uniqueKeysType entrezgene_uniqueKeys;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrezgene_xtraIndexTermsType entrezgene_xtraIndexTerms;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrezgene_xtraPropertiesType entrezgene_xtraProperties;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrezgene_xtraIqType entrezgene_xtraIq;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrezgene_nonUniqueKeysType entrezgene_nonUniqueKeys;

    public EntrezgeneType() {
    }

    public EntrezgeneType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrezgene_trackInfoType entrezgene_trackInfo,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrezgene_typeType entrezgene_type,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrezgene_sourceType entrezgene_source,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrezgene_geneType entrezgene_gene,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrezgene_protType entrezgene_prot,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrezgene_rnaType entrezgene_rna,
           java.lang.String entrezgene_summary,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrezgene_locationType entrezgene_location,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrezgene_geneSourceType entrezgene_geneSource,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrezgene_locusType entrezgene_locus,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrezgene_propertiesType entrezgene_properties,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrezgene_refgeneType entrezgene_refgene,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrezgene_homologyType entrezgene_homology,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrezgene_commentsType entrezgene_comments,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrezgene_uniqueKeysType entrezgene_uniqueKeys,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrezgene_xtraIndexTermsType entrezgene_xtraIndexTerms,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrezgene_xtraPropertiesType entrezgene_xtraProperties,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrezgene_xtraIqType entrezgene_xtraIq,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrezgene_nonUniqueKeysType entrezgene_nonUniqueKeys) {
           this.entrezgene_trackInfo = entrezgene_trackInfo;
           this.entrezgene_type = entrezgene_type;
           this.entrezgene_source = entrezgene_source;
           this.entrezgene_gene = entrezgene_gene;
           this.entrezgene_prot = entrezgene_prot;
           this.entrezgene_rna = entrezgene_rna;
           this.entrezgene_summary = entrezgene_summary;
           this.entrezgene_location = entrezgene_location;
           this.entrezgene_geneSource = entrezgene_geneSource;
           this.entrezgene_locus = entrezgene_locus;
           this.entrezgene_properties = entrezgene_properties;
           this.entrezgene_refgene = entrezgene_refgene;
           this.entrezgene_homology = entrezgene_homology;
           this.entrezgene_comments = entrezgene_comments;
           this.entrezgene_uniqueKeys = entrezgene_uniqueKeys;
           this.entrezgene_xtraIndexTerms = entrezgene_xtraIndexTerms;
           this.entrezgene_xtraProperties = entrezgene_xtraProperties;
           this.entrezgene_xtraIq = entrezgene_xtraIq;
           this.entrezgene_nonUniqueKeys = entrezgene_nonUniqueKeys;
    }


    /**
     * Gets the entrezgene_trackInfo value for this EntrezgeneType.
     * 
     * @return entrezgene_trackInfo
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrezgene_trackInfoType getEntrezgene_trackInfo() {
        return entrezgene_trackInfo;
    }


    /**
     * Sets the entrezgene_trackInfo value for this EntrezgeneType.
     * 
     * @param entrezgene_trackInfo
     */
    public void setEntrezgene_trackInfo(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrezgene_trackInfoType entrezgene_trackInfo) {
        this.entrezgene_trackInfo = entrezgene_trackInfo;
    }


    /**
     * Gets the entrezgene_type value for this EntrezgeneType.
     * 
     * @return entrezgene_type
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrezgene_typeType getEntrezgene_type() {
        return entrezgene_type;
    }


    /**
     * Sets the entrezgene_type value for this EntrezgeneType.
     * 
     * @param entrezgene_type
     */
    public void setEntrezgene_type(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrezgene_typeType entrezgene_type) {
        this.entrezgene_type = entrezgene_type;
    }


    /**
     * Gets the entrezgene_source value for this EntrezgeneType.
     * 
     * @return entrezgene_source
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrezgene_sourceType getEntrezgene_source() {
        return entrezgene_source;
    }


    /**
     * Sets the entrezgene_source value for this EntrezgeneType.
     * 
     * @param entrezgene_source
     */
    public void setEntrezgene_source(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrezgene_sourceType entrezgene_source) {
        this.entrezgene_source = entrezgene_source;
    }


    /**
     * Gets the entrezgene_gene value for this EntrezgeneType.
     * 
     * @return entrezgene_gene
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrezgene_geneType getEntrezgene_gene() {
        return entrezgene_gene;
    }


    /**
     * Sets the entrezgene_gene value for this EntrezgeneType.
     * 
     * @param entrezgene_gene
     */
    public void setEntrezgene_gene(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrezgene_geneType entrezgene_gene) {
        this.entrezgene_gene = entrezgene_gene;
    }


    /**
     * Gets the entrezgene_prot value for this EntrezgeneType.
     * 
     * @return entrezgene_prot
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrezgene_protType getEntrezgene_prot() {
        return entrezgene_prot;
    }


    /**
     * Sets the entrezgene_prot value for this EntrezgeneType.
     * 
     * @param entrezgene_prot
     */
    public void setEntrezgene_prot(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrezgene_protType entrezgene_prot) {
        this.entrezgene_prot = entrezgene_prot;
    }


    /**
     * Gets the entrezgene_rna value for this EntrezgeneType.
     * 
     * @return entrezgene_rna
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrezgene_rnaType getEntrezgene_rna() {
        return entrezgene_rna;
    }


    /**
     * Sets the entrezgene_rna value for this EntrezgeneType.
     * 
     * @param entrezgene_rna
     */
    public void setEntrezgene_rna(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrezgene_rnaType entrezgene_rna) {
        this.entrezgene_rna = entrezgene_rna;
    }


    /**
     * Gets the entrezgene_summary value for this EntrezgeneType.
     * 
     * @return entrezgene_summary
     */
    public java.lang.String getEntrezgene_summary() {
        return entrezgene_summary;
    }


    /**
     * Sets the entrezgene_summary value for this EntrezgeneType.
     * 
     * @param entrezgene_summary
     */
    public void setEntrezgene_summary(java.lang.String entrezgene_summary) {
        this.entrezgene_summary = entrezgene_summary;
    }


    /**
     * Gets the entrezgene_location value for this EntrezgeneType.
     * 
     * @return entrezgene_location
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrezgene_locationType getEntrezgene_location() {
        return entrezgene_location;
    }


    /**
     * Sets the entrezgene_location value for this EntrezgeneType.
     * 
     * @param entrezgene_location
     */
    public void setEntrezgene_location(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrezgene_locationType entrezgene_location) {
        this.entrezgene_location = entrezgene_location;
    }


    /**
     * Gets the entrezgene_geneSource value for this EntrezgeneType.
     * 
     * @return entrezgene_geneSource
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrezgene_geneSourceType getEntrezgene_geneSource() {
        return entrezgene_geneSource;
    }


    /**
     * Sets the entrezgene_geneSource value for this EntrezgeneType.
     * 
     * @param entrezgene_geneSource
     */
    public void setEntrezgene_geneSource(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrezgene_geneSourceType entrezgene_geneSource) {
        this.entrezgene_geneSource = entrezgene_geneSource;
    }


    /**
     * Gets the entrezgene_locus value for this EntrezgeneType.
     * 
     * @return entrezgene_locus
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrezgene_locusType getEntrezgene_locus() {
        return entrezgene_locus;
    }


    /**
     * Sets the entrezgene_locus value for this EntrezgeneType.
     * 
     * @param entrezgene_locus
     */
    public void setEntrezgene_locus(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrezgene_locusType entrezgene_locus) {
        this.entrezgene_locus = entrezgene_locus;
    }


    /**
     * Gets the entrezgene_properties value for this EntrezgeneType.
     * 
     * @return entrezgene_properties
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrezgene_propertiesType getEntrezgene_properties() {
        return entrezgene_properties;
    }


    /**
     * Sets the entrezgene_properties value for this EntrezgeneType.
     * 
     * @param entrezgene_properties
     */
    public void setEntrezgene_properties(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrezgene_propertiesType entrezgene_properties) {
        this.entrezgene_properties = entrezgene_properties;
    }


    /**
     * Gets the entrezgene_refgene value for this EntrezgeneType.
     * 
     * @return entrezgene_refgene
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrezgene_refgeneType getEntrezgene_refgene() {
        return entrezgene_refgene;
    }


    /**
     * Sets the entrezgene_refgene value for this EntrezgeneType.
     * 
     * @param entrezgene_refgene
     */
    public void setEntrezgene_refgene(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrezgene_refgeneType entrezgene_refgene) {
        this.entrezgene_refgene = entrezgene_refgene;
    }


    /**
     * Gets the entrezgene_homology value for this EntrezgeneType.
     * 
     * @return entrezgene_homology
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrezgene_homologyType getEntrezgene_homology() {
        return entrezgene_homology;
    }


    /**
     * Sets the entrezgene_homology value for this EntrezgeneType.
     * 
     * @param entrezgene_homology
     */
    public void setEntrezgene_homology(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrezgene_homologyType entrezgene_homology) {
        this.entrezgene_homology = entrezgene_homology;
    }


    /**
     * Gets the entrezgene_comments value for this EntrezgeneType.
     * 
     * @return entrezgene_comments
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrezgene_commentsType getEntrezgene_comments() {
        return entrezgene_comments;
    }


    /**
     * Sets the entrezgene_comments value for this EntrezgeneType.
     * 
     * @param entrezgene_comments
     */
    public void setEntrezgene_comments(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrezgene_commentsType entrezgene_comments) {
        this.entrezgene_comments = entrezgene_comments;
    }


    /**
     * Gets the entrezgene_uniqueKeys value for this EntrezgeneType.
     * 
     * @return entrezgene_uniqueKeys
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrezgene_uniqueKeysType getEntrezgene_uniqueKeys() {
        return entrezgene_uniqueKeys;
    }


    /**
     * Sets the entrezgene_uniqueKeys value for this EntrezgeneType.
     * 
     * @param entrezgene_uniqueKeys
     */
    public void setEntrezgene_uniqueKeys(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrezgene_uniqueKeysType entrezgene_uniqueKeys) {
        this.entrezgene_uniqueKeys = entrezgene_uniqueKeys;
    }


    /**
     * Gets the entrezgene_xtraIndexTerms value for this EntrezgeneType.
     * 
     * @return entrezgene_xtraIndexTerms
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrezgene_xtraIndexTermsType getEntrezgene_xtraIndexTerms() {
        return entrezgene_xtraIndexTerms;
    }


    /**
     * Sets the entrezgene_xtraIndexTerms value for this EntrezgeneType.
     * 
     * @param entrezgene_xtraIndexTerms
     */
    public void setEntrezgene_xtraIndexTerms(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrezgene_xtraIndexTermsType entrezgene_xtraIndexTerms) {
        this.entrezgene_xtraIndexTerms = entrezgene_xtraIndexTerms;
    }


    /**
     * Gets the entrezgene_xtraProperties value for this EntrezgeneType.
     * 
     * @return entrezgene_xtraProperties
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrezgene_xtraPropertiesType getEntrezgene_xtraProperties() {
        return entrezgene_xtraProperties;
    }


    /**
     * Sets the entrezgene_xtraProperties value for this EntrezgeneType.
     * 
     * @param entrezgene_xtraProperties
     */
    public void setEntrezgene_xtraProperties(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrezgene_xtraPropertiesType entrezgene_xtraProperties) {
        this.entrezgene_xtraProperties = entrezgene_xtraProperties;
    }


    /**
     * Gets the entrezgene_xtraIq value for this EntrezgeneType.
     * 
     * @return entrezgene_xtraIq
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrezgene_xtraIqType getEntrezgene_xtraIq() {
        return entrezgene_xtraIq;
    }


    /**
     * Sets the entrezgene_xtraIq value for this EntrezgeneType.
     * 
     * @param entrezgene_xtraIq
     */
    public void setEntrezgene_xtraIq(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrezgene_xtraIqType entrezgene_xtraIq) {
        this.entrezgene_xtraIq = entrezgene_xtraIq;
    }


    /**
     * Gets the entrezgene_nonUniqueKeys value for this EntrezgeneType.
     * 
     * @return entrezgene_nonUniqueKeys
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrezgene_nonUniqueKeysType getEntrezgene_nonUniqueKeys() {
        return entrezgene_nonUniqueKeys;
    }


    /**
     * Sets the entrezgene_nonUniqueKeys value for this EntrezgeneType.
     * 
     * @param entrezgene_nonUniqueKeys
     */
    public void setEntrezgene_nonUniqueKeys(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrezgene_nonUniqueKeysType entrezgene_nonUniqueKeys) {
        this.entrezgene_nonUniqueKeys = entrezgene_nonUniqueKeys;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EntrezgeneType)) return false;
        EntrezgeneType other = (EntrezgeneType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.entrezgene_trackInfo==null && other.getEntrezgene_trackInfo()==null) || 
             (this.entrezgene_trackInfo!=null &&
              this.entrezgene_trackInfo.equals(other.getEntrezgene_trackInfo()))) &&
            ((this.entrezgene_type==null && other.getEntrezgene_type()==null) || 
             (this.entrezgene_type!=null &&
              this.entrezgene_type.equals(other.getEntrezgene_type()))) &&
            ((this.entrezgene_source==null && other.getEntrezgene_source()==null) || 
             (this.entrezgene_source!=null &&
              this.entrezgene_source.equals(other.getEntrezgene_source()))) &&
            ((this.entrezgene_gene==null && other.getEntrezgene_gene()==null) || 
             (this.entrezgene_gene!=null &&
              this.entrezgene_gene.equals(other.getEntrezgene_gene()))) &&
            ((this.entrezgene_prot==null && other.getEntrezgene_prot()==null) || 
             (this.entrezgene_prot!=null &&
              this.entrezgene_prot.equals(other.getEntrezgene_prot()))) &&
            ((this.entrezgene_rna==null && other.getEntrezgene_rna()==null) || 
             (this.entrezgene_rna!=null &&
              this.entrezgene_rna.equals(other.getEntrezgene_rna()))) &&
            ((this.entrezgene_summary==null && other.getEntrezgene_summary()==null) || 
             (this.entrezgene_summary!=null &&
              this.entrezgene_summary.equals(other.getEntrezgene_summary()))) &&
            ((this.entrezgene_location==null && other.getEntrezgene_location()==null) || 
             (this.entrezgene_location!=null &&
              this.entrezgene_location.equals(other.getEntrezgene_location()))) &&
            ((this.entrezgene_geneSource==null && other.getEntrezgene_geneSource()==null) || 
             (this.entrezgene_geneSource!=null &&
              this.entrezgene_geneSource.equals(other.getEntrezgene_geneSource()))) &&
            ((this.entrezgene_locus==null && other.getEntrezgene_locus()==null) || 
             (this.entrezgene_locus!=null &&
              this.entrezgene_locus.equals(other.getEntrezgene_locus()))) &&
            ((this.entrezgene_properties==null && other.getEntrezgene_properties()==null) || 
             (this.entrezgene_properties!=null &&
              this.entrezgene_properties.equals(other.getEntrezgene_properties()))) &&
            ((this.entrezgene_refgene==null && other.getEntrezgene_refgene()==null) || 
             (this.entrezgene_refgene!=null &&
              this.entrezgene_refgene.equals(other.getEntrezgene_refgene()))) &&
            ((this.entrezgene_homology==null && other.getEntrezgene_homology()==null) || 
             (this.entrezgene_homology!=null &&
              this.entrezgene_homology.equals(other.getEntrezgene_homology()))) &&
            ((this.entrezgene_comments==null && other.getEntrezgene_comments()==null) || 
             (this.entrezgene_comments!=null &&
              this.entrezgene_comments.equals(other.getEntrezgene_comments()))) &&
            ((this.entrezgene_uniqueKeys==null && other.getEntrezgene_uniqueKeys()==null) || 
             (this.entrezgene_uniqueKeys!=null &&
              this.entrezgene_uniqueKeys.equals(other.getEntrezgene_uniqueKeys()))) &&
            ((this.entrezgene_xtraIndexTerms==null && other.getEntrezgene_xtraIndexTerms()==null) || 
             (this.entrezgene_xtraIndexTerms!=null &&
              this.entrezgene_xtraIndexTerms.equals(other.getEntrezgene_xtraIndexTerms()))) &&
            ((this.entrezgene_xtraProperties==null && other.getEntrezgene_xtraProperties()==null) || 
             (this.entrezgene_xtraProperties!=null &&
              this.entrezgene_xtraProperties.equals(other.getEntrezgene_xtraProperties()))) &&
            ((this.entrezgene_xtraIq==null && other.getEntrezgene_xtraIq()==null) || 
             (this.entrezgene_xtraIq!=null &&
              this.entrezgene_xtraIq.equals(other.getEntrezgene_xtraIq()))) &&
            ((this.entrezgene_nonUniqueKeys==null && other.getEntrezgene_nonUniqueKeys()==null) || 
             (this.entrezgene_nonUniqueKeys!=null &&
              this.entrezgene_nonUniqueKeys.equals(other.getEntrezgene_nonUniqueKeys())));
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
        if (getEntrezgene_trackInfo() != null) {
            _hashCode += getEntrezgene_trackInfo().hashCode();
        }
        if (getEntrezgene_type() != null) {
            _hashCode += getEntrezgene_type().hashCode();
        }
        if (getEntrezgene_source() != null) {
            _hashCode += getEntrezgene_source().hashCode();
        }
        if (getEntrezgene_gene() != null) {
            _hashCode += getEntrezgene_gene().hashCode();
        }
        if (getEntrezgene_prot() != null) {
            _hashCode += getEntrezgene_prot().hashCode();
        }
        if (getEntrezgene_rna() != null) {
            _hashCode += getEntrezgene_rna().hashCode();
        }
        if (getEntrezgene_summary() != null) {
            _hashCode += getEntrezgene_summary().hashCode();
        }
        if (getEntrezgene_location() != null) {
            _hashCode += getEntrezgene_location().hashCode();
        }
        if (getEntrezgene_geneSource() != null) {
            _hashCode += getEntrezgene_geneSource().hashCode();
        }
        if (getEntrezgene_locus() != null) {
            _hashCode += getEntrezgene_locus().hashCode();
        }
        if (getEntrezgene_properties() != null) {
            _hashCode += getEntrezgene_properties().hashCode();
        }
        if (getEntrezgene_refgene() != null) {
            _hashCode += getEntrezgene_refgene().hashCode();
        }
        if (getEntrezgene_homology() != null) {
            _hashCode += getEntrezgene_homology().hashCode();
        }
        if (getEntrezgene_comments() != null) {
            _hashCode += getEntrezgene_comments().hashCode();
        }
        if (getEntrezgene_uniqueKeys() != null) {
            _hashCode += getEntrezgene_uniqueKeys().hashCode();
        }
        if (getEntrezgene_xtraIndexTerms() != null) {
            _hashCode += getEntrezgene_xtraIndexTerms().hashCode();
        }
        if (getEntrezgene_xtraProperties() != null) {
            _hashCode += getEntrezgene_xtraProperties().hashCode();
        }
        if (getEntrezgene_xtraIq() != null) {
            _hashCode += getEntrezgene_xtraIq().hashCode();
        }
        if (getEntrezgene_nonUniqueKeys() != null) {
            _hashCode += getEntrezgene_nonUniqueKeys().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EntrezgeneType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "EntrezgeneType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entrezgene_trackInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrezgene_track-info"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrezgene_track-infoType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entrezgene_type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrezgene_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrezgene_typeType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entrezgene_source");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrezgene_source"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrezgene_sourceType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entrezgene_gene");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrezgene_gene"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrezgene_geneType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entrezgene_prot");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrezgene_prot"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrezgene_protType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entrezgene_rna");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrezgene_rna"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrezgene_rnaType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entrezgene_summary");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrezgene_summary"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entrezgene_location");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrezgene_location"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrezgene_locationType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entrezgene_geneSource");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrezgene_gene-source"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrezgene_gene-sourceType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entrezgene_locus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrezgene_locus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrezgene_locusType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entrezgene_properties");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrezgene_properties"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrezgene_propertiesType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entrezgene_refgene");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrezgene_refgene"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrezgene_refgeneType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entrezgene_homology");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrezgene_homology"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrezgene_homologyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entrezgene_comments");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrezgene_comments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrezgene_commentsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entrezgene_uniqueKeys");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrezgene_unique-keys"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrezgene_unique-keysType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entrezgene_xtraIndexTerms");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrezgene_xtra-index-terms"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrezgene_xtra-index-termsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entrezgene_xtraProperties");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrezgene_xtra-properties"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrezgene_xtra-propertiesType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entrezgene_xtraIq");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrezgene_xtra-iq"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrezgene_xtra-iqType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entrezgene_nonUniqueKeys");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrezgene_non-unique-keys"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrezgene_non-unique-keysType"));
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
