/**
 * GBSeqType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class GBSeqType  implements java.io.Serializable {
    private java.lang.String GBSeq_locus;

    private java.lang.String GBSeq_length;

    private java.lang.String GBSeq_strandedness;

    private java.lang.String GBSeq_moltype;

    private java.lang.String GBSeq_topology;

    private java.lang.String GBSeq_division;

    private java.lang.String GBSeq_updateDate;

    private java.lang.String GBSeq_createDate;

    private java.lang.String GBSeq_updateRelease;

    private java.lang.String GBSeq_createRelease;

    private java.lang.String GBSeq_definition;

    private java.lang.String GBSeq_primaryAccession;

    private java.lang.String GBSeq_entryVersion;

    private java.lang.String GBSeq_accessionVersion;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.GBSeq_otherSeqidsType GBSeq_otherSeqids;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.GBSeq_secondaryAccessionsType GBSeq_secondaryAccessions;

    private java.lang.String GBSeq_project;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.GBSeq_keywordsType GBSeq_keywords;

    private java.lang.String GBSeq_segment;

    private java.lang.String GBSeq_source;

    private java.lang.String GBSeq_organism;

    private java.lang.String GBSeq_taxonomy;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.GBSeq_referencesType GBSeq_references;

    private java.lang.String GBSeq_comment;

    private java.lang.String GBSeq_primary;

    private java.lang.String GBSeq_sourceDb;

    private java.lang.String GBSeq_databaseReference;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.GBSeq_featureTableType GBSeq_featureTable;

    private java.lang.String GBSeq_sequence;

    private java.lang.String GBSeq_contig;

    public GBSeqType() {
    }

    public GBSeqType(
           java.lang.String GBSeq_locus,
           java.lang.String GBSeq_length,
           java.lang.String GBSeq_strandedness,
           java.lang.String GBSeq_moltype,
           java.lang.String GBSeq_topology,
           java.lang.String GBSeq_division,
           java.lang.String GBSeq_updateDate,
           java.lang.String GBSeq_createDate,
           java.lang.String GBSeq_updateRelease,
           java.lang.String GBSeq_createRelease,
           java.lang.String GBSeq_definition,
           java.lang.String GBSeq_primaryAccession,
           java.lang.String GBSeq_entryVersion,
           java.lang.String GBSeq_accessionVersion,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.GBSeq_otherSeqidsType GBSeq_otherSeqids,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.GBSeq_secondaryAccessionsType GBSeq_secondaryAccessions,
           java.lang.String GBSeq_project,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.GBSeq_keywordsType GBSeq_keywords,
           java.lang.String GBSeq_segment,
           java.lang.String GBSeq_source,
           java.lang.String GBSeq_organism,
           java.lang.String GBSeq_taxonomy,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.GBSeq_referencesType GBSeq_references,
           java.lang.String GBSeq_comment,
           java.lang.String GBSeq_primary,
           java.lang.String GBSeq_sourceDb,
           java.lang.String GBSeq_databaseReference,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.GBSeq_featureTableType GBSeq_featureTable,
           java.lang.String GBSeq_sequence,
           java.lang.String GBSeq_contig) {
           this.GBSeq_locus = GBSeq_locus;
           this.GBSeq_length = GBSeq_length;
           this.GBSeq_strandedness = GBSeq_strandedness;
           this.GBSeq_moltype = GBSeq_moltype;
           this.GBSeq_topology = GBSeq_topology;
           this.GBSeq_division = GBSeq_division;
           this.GBSeq_updateDate = GBSeq_updateDate;
           this.GBSeq_createDate = GBSeq_createDate;
           this.GBSeq_updateRelease = GBSeq_updateRelease;
           this.GBSeq_createRelease = GBSeq_createRelease;
           this.GBSeq_definition = GBSeq_definition;
           this.GBSeq_primaryAccession = GBSeq_primaryAccession;
           this.GBSeq_entryVersion = GBSeq_entryVersion;
           this.GBSeq_accessionVersion = GBSeq_accessionVersion;
           this.GBSeq_otherSeqids = GBSeq_otherSeqids;
           this.GBSeq_secondaryAccessions = GBSeq_secondaryAccessions;
           this.GBSeq_project = GBSeq_project;
           this.GBSeq_keywords = GBSeq_keywords;
           this.GBSeq_segment = GBSeq_segment;
           this.GBSeq_source = GBSeq_source;
           this.GBSeq_organism = GBSeq_organism;
           this.GBSeq_taxonomy = GBSeq_taxonomy;
           this.GBSeq_references = GBSeq_references;
           this.GBSeq_comment = GBSeq_comment;
           this.GBSeq_primary = GBSeq_primary;
           this.GBSeq_sourceDb = GBSeq_sourceDb;
           this.GBSeq_databaseReference = GBSeq_databaseReference;
           this.GBSeq_featureTable = GBSeq_featureTable;
           this.GBSeq_sequence = GBSeq_sequence;
           this.GBSeq_contig = GBSeq_contig;
    }


    /**
     * Gets the GBSeq_locus value for this GBSeqType.
     * 
     * @return GBSeq_locus
     */
    public java.lang.String getGBSeq_locus() {
        return GBSeq_locus;
    }


    /**
     * Sets the GBSeq_locus value for this GBSeqType.
     * 
     * @param GBSeq_locus
     */
    public void setGBSeq_locus(java.lang.String GBSeq_locus) {
        this.GBSeq_locus = GBSeq_locus;
    }


    /**
     * Gets the GBSeq_length value for this GBSeqType.
     * 
     * @return GBSeq_length
     */
    public java.lang.String getGBSeq_length() {
        return GBSeq_length;
    }


    /**
     * Sets the GBSeq_length value for this GBSeqType.
     * 
     * @param GBSeq_length
     */
    public void setGBSeq_length(java.lang.String GBSeq_length) {
        this.GBSeq_length = GBSeq_length;
    }


    /**
     * Gets the GBSeq_strandedness value for this GBSeqType.
     * 
     * @return GBSeq_strandedness
     */
    public java.lang.String getGBSeq_strandedness() {
        return GBSeq_strandedness;
    }


    /**
     * Sets the GBSeq_strandedness value for this GBSeqType.
     * 
     * @param GBSeq_strandedness
     */
    public void setGBSeq_strandedness(java.lang.String GBSeq_strandedness) {
        this.GBSeq_strandedness = GBSeq_strandedness;
    }


    /**
     * Gets the GBSeq_moltype value for this GBSeqType.
     * 
     * @return GBSeq_moltype
     */
    public java.lang.String getGBSeq_moltype() {
        return GBSeq_moltype;
    }


    /**
     * Sets the GBSeq_moltype value for this GBSeqType.
     * 
     * @param GBSeq_moltype
     */
    public void setGBSeq_moltype(java.lang.String GBSeq_moltype) {
        this.GBSeq_moltype = GBSeq_moltype;
    }


    /**
     * Gets the GBSeq_topology value for this GBSeqType.
     * 
     * @return GBSeq_topology
     */
    public java.lang.String getGBSeq_topology() {
        return GBSeq_topology;
    }


    /**
     * Sets the GBSeq_topology value for this GBSeqType.
     * 
     * @param GBSeq_topology
     */
    public void setGBSeq_topology(java.lang.String GBSeq_topology) {
        this.GBSeq_topology = GBSeq_topology;
    }


    /**
     * Gets the GBSeq_division value for this GBSeqType.
     * 
     * @return GBSeq_division
     */
    public java.lang.String getGBSeq_division() {
        return GBSeq_division;
    }


    /**
     * Sets the GBSeq_division value for this GBSeqType.
     * 
     * @param GBSeq_division
     */
    public void setGBSeq_division(java.lang.String GBSeq_division) {
        this.GBSeq_division = GBSeq_division;
    }


    /**
     * Gets the GBSeq_updateDate value for this GBSeqType.
     * 
     * @return GBSeq_updateDate
     */
    public java.lang.String getGBSeq_updateDate() {
        return GBSeq_updateDate;
    }


    /**
     * Sets the GBSeq_updateDate value for this GBSeqType.
     * 
     * @param GBSeq_updateDate
     */
    public void setGBSeq_updateDate(java.lang.String GBSeq_updateDate) {
        this.GBSeq_updateDate = GBSeq_updateDate;
    }


    /**
     * Gets the GBSeq_createDate value for this GBSeqType.
     * 
     * @return GBSeq_createDate
     */
    public java.lang.String getGBSeq_createDate() {
        return GBSeq_createDate;
    }


    /**
     * Sets the GBSeq_createDate value for this GBSeqType.
     * 
     * @param GBSeq_createDate
     */
    public void setGBSeq_createDate(java.lang.String GBSeq_createDate) {
        this.GBSeq_createDate = GBSeq_createDate;
    }


    /**
     * Gets the GBSeq_updateRelease value for this GBSeqType.
     * 
     * @return GBSeq_updateRelease
     */
    public java.lang.String getGBSeq_updateRelease() {
        return GBSeq_updateRelease;
    }


    /**
     * Sets the GBSeq_updateRelease value for this GBSeqType.
     * 
     * @param GBSeq_updateRelease
     */
    public void setGBSeq_updateRelease(java.lang.String GBSeq_updateRelease) {
        this.GBSeq_updateRelease = GBSeq_updateRelease;
    }


    /**
     * Gets the GBSeq_createRelease value for this GBSeqType.
     * 
     * @return GBSeq_createRelease
     */
    public java.lang.String getGBSeq_createRelease() {
        return GBSeq_createRelease;
    }


    /**
     * Sets the GBSeq_createRelease value for this GBSeqType.
     * 
     * @param GBSeq_createRelease
     */
    public void setGBSeq_createRelease(java.lang.String GBSeq_createRelease) {
        this.GBSeq_createRelease = GBSeq_createRelease;
    }


    /**
     * Gets the GBSeq_definition value for this GBSeqType.
     * 
     * @return GBSeq_definition
     */
    public java.lang.String getGBSeq_definition() {
        return GBSeq_definition;
    }


    /**
     * Sets the GBSeq_definition value for this GBSeqType.
     * 
     * @param GBSeq_definition
     */
    public void setGBSeq_definition(java.lang.String GBSeq_definition) {
        this.GBSeq_definition = GBSeq_definition;
    }


    /**
     * Gets the GBSeq_primaryAccession value for this GBSeqType.
     * 
     * @return GBSeq_primaryAccession
     */
    public java.lang.String getGBSeq_primaryAccession() {
        return GBSeq_primaryAccession;
    }


    /**
     * Sets the GBSeq_primaryAccession value for this GBSeqType.
     * 
     * @param GBSeq_primaryAccession
     */
    public void setGBSeq_primaryAccession(java.lang.String GBSeq_primaryAccession) {
        this.GBSeq_primaryAccession = GBSeq_primaryAccession;
    }


    /**
     * Gets the GBSeq_entryVersion value for this GBSeqType.
     * 
     * @return GBSeq_entryVersion
     */
    public java.lang.String getGBSeq_entryVersion() {
        return GBSeq_entryVersion;
    }


    /**
     * Sets the GBSeq_entryVersion value for this GBSeqType.
     * 
     * @param GBSeq_entryVersion
     */
    public void setGBSeq_entryVersion(java.lang.String GBSeq_entryVersion) {
        this.GBSeq_entryVersion = GBSeq_entryVersion;
    }


    /**
     * Gets the GBSeq_accessionVersion value for this GBSeqType.
     * 
     * @return GBSeq_accessionVersion
     */
    public java.lang.String getGBSeq_accessionVersion() {
        return GBSeq_accessionVersion;
    }


    /**
     * Sets the GBSeq_accessionVersion value for this GBSeqType.
     * 
     * @param GBSeq_accessionVersion
     */
    public void setGBSeq_accessionVersion(java.lang.String GBSeq_accessionVersion) {
        this.GBSeq_accessionVersion = GBSeq_accessionVersion;
    }


    /**
     * Gets the GBSeq_otherSeqids value for this GBSeqType.
     * 
     * @return GBSeq_otherSeqids
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.GBSeq_otherSeqidsType getGBSeq_otherSeqids() {
        return GBSeq_otherSeqids;
    }


    /**
     * Sets the GBSeq_otherSeqids value for this GBSeqType.
     * 
     * @param GBSeq_otherSeqids
     */
    public void setGBSeq_otherSeqids(gov.nih.nlm.ncbi.www.soap.eutils.efetch.GBSeq_otherSeqidsType GBSeq_otherSeqids) {
        this.GBSeq_otherSeqids = GBSeq_otherSeqids;
    }


    /**
     * Gets the GBSeq_secondaryAccessions value for this GBSeqType.
     * 
     * @return GBSeq_secondaryAccessions
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.GBSeq_secondaryAccessionsType getGBSeq_secondaryAccessions() {
        return GBSeq_secondaryAccessions;
    }


    /**
     * Sets the GBSeq_secondaryAccessions value for this GBSeqType.
     * 
     * @param GBSeq_secondaryAccessions
     */
    public void setGBSeq_secondaryAccessions(gov.nih.nlm.ncbi.www.soap.eutils.efetch.GBSeq_secondaryAccessionsType GBSeq_secondaryAccessions) {
        this.GBSeq_secondaryAccessions = GBSeq_secondaryAccessions;
    }


    /**
     * Gets the GBSeq_project value for this GBSeqType.
     * 
     * @return GBSeq_project
     */
    public java.lang.String getGBSeq_project() {
        return GBSeq_project;
    }


    /**
     * Sets the GBSeq_project value for this GBSeqType.
     * 
     * @param GBSeq_project
     */
    public void setGBSeq_project(java.lang.String GBSeq_project) {
        this.GBSeq_project = GBSeq_project;
    }


    /**
     * Gets the GBSeq_keywords value for this GBSeqType.
     * 
     * @return GBSeq_keywords
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.GBSeq_keywordsType getGBSeq_keywords() {
        return GBSeq_keywords;
    }


    /**
     * Sets the GBSeq_keywords value for this GBSeqType.
     * 
     * @param GBSeq_keywords
     */
    public void setGBSeq_keywords(gov.nih.nlm.ncbi.www.soap.eutils.efetch.GBSeq_keywordsType GBSeq_keywords) {
        this.GBSeq_keywords = GBSeq_keywords;
    }


    /**
     * Gets the GBSeq_segment value for this GBSeqType.
     * 
     * @return GBSeq_segment
     */
    public java.lang.String getGBSeq_segment() {
        return GBSeq_segment;
    }


    /**
     * Sets the GBSeq_segment value for this GBSeqType.
     * 
     * @param GBSeq_segment
     */
    public void setGBSeq_segment(java.lang.String GBSeq_segment) {
        this.GBSeq_segment = GBSeq_segment;
    }


    /**
     * Gets the GBSeq_source value for this GBSeqType.
     * 
     * @return GBSeq_source
     */
    public java.lang.String getGBSeq_source() {
        return GBSeq_source;
    }


    /**
     * Sets the GBSeq_source value for this GBSeqType.
     * 
     * @param GBSeq_source
     */
    public void setGBSeq_source(java.lang.String GBSeq_source) {
        this.GBSeq_source = GBSeq_source;
    }


    /**
     * Gets the GBSeq_organism value for this GBSeqType.
     * 
     * @return GBSeq_organism
     */
    public java.lang.String getGBSeq_organism() {
        return GBSeq_organism;
    }


    /**
     * Sets the GBSeq_organism value for this GBSeqType.
     * 
     * @param GBSeq_organism
     */
    public void setGBSeq_organism(java.lang.String GBSeq_organism) {
        this.GBSeq_organism = GBSeq_organism;
    }


    /**
     * Gets the GBSeq_taxonomy value for this GBSeqType.
     * 
     * @return GBSeq_taxonomy
     */
    public java.lang.String getGBSeq_taxonomy() {
        return GBSeq_taxonomy;
    }


    /**
     * Sets the GBSeq_taxonomy value for this GBSeqType.
     * 
     * @param GBSeq_taxonomy
     */
    public void setGBSeq_taxonomy(java.lang.String GBSeq_taxonomy) {
        this.GBSeq_taxonomy = GBSeq_taxonomy;
    }


    /**
     * Gets the GBSeq_references value for this GBSeqType.
     * 
     * @return GBSeq_references
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.GBSeq_referencesType getGBSeq_references() {
        return GBSeq_references;
    }


    /**
     * Sets the GBSeq_references value for this GBSeqType.
     * 
     * @param GBSeq_references
     */
    public void setGBSeq_references(gov.nih.nlm.ncbi.www.soap.eutils.efetch.GBSeq_referencesType GBSeq_references) {
        this.GBSeq_references = GBSeq_references;
    }


    /**
     * Gets the GBSeq_comment value for this GBSeqType.
     * 
     * @return GBSeq_comment
     */
    public java.lang.String getGBSeq_comment() {
        return GBSeq_comment;
    }


    /**
     * Sets the GBSeq_comment value for this GBSeqType.
     * 
     * @param GBSeq_comment
     */
    public void setGBSeq_comment(java.lang.String GBSeq_comment) {
        this.GBSeq_comment = GBSeq_comment;
    }


    /**
     * Gets the GBSeq_primary value for this GBSeqType.
     * 
     * @return GBSeq_primary
     */
    public java.lang.String getGBSeq_primary() {
        return GBSeq_primary;
    }


    /**
     * Sets the GBSeq_primary value for this GBSeqType.
     * 
     * @param GBSeq_primary
     */
    public void setGBSeq_primary(java.lang.String GBSeq_primary) {
        this.GBSeq_primary = GBSeq_primary;
    }


    /**
     * Gets the GBSeq_sourceDb value for this GBSeqType.
     * 
     * @return GBSeq_sourceDb
     */
    public java.lang.String getGBSeq_sourceDb() {
        return GBSeq_sourceDb;
    }


    /**
     * Sets the GBSeq_sourceDb value for this GBSeqType.
     * 
     * @param GBSeq_sourceDb
     */
    public void setGBSeq_sourceDb(java.lang.String GBSeq_sourceDb) {
        this.GBSeq_sourceDb = GBSeq_sourceDb;
    }


    /**
     * Gets the GBSeq_databaseReference value for this GBSeqType.
     * 
     * @return GBSeq_databaseReference
     */
    public java.lang.String getGBSeq_databaseReference() {
        return GBSeq_databaseReference;
    }


    /**
     * Sets the GBSeq_databaseReference value for this GBSeqType.
     * 
     * @param GBSeq_databaseReference
     */
    public void setGBSeq_databaseReference(java.lang.String GBSeq_databaseReference) {
        this.GBSeq_databaseReference = GBSeq_databaseReference;
    }


    /**
     * Gets the GBSeq_featureTable value for this GBSeqType.
     * 
     * @return GBSeq_featureTable
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.GBSeq_featureTableType getGBSeq_featureTable() {
        return GBSeq_featureTable;
    }


    /**
     * Sets the GBSeq_featureTable value for this GBSeqType.
     * 
     * @param GBSeq_featureTable
     */
    public void setGBSeq_featureTable(gov.nih.nlm.ncbi.www.soap.eutils.efetch.GBSeq_featureTableType GBSeq_featureTable) {
        this.GBSeq_featureTable = GBSeq_featureTable;
    }


    /**
     * Gets the GBSeq_sequence value for this GBSeqType.
     * 
     * @return GBSeq_sequence
     */
    public java.lang.String getGBSeq_sequence() {
        return GBSeq_sequence;
    }


    /**
     * Sets the GBSeq_sequence value for this GBSeqType.
     * 
     * @param GBSeq_sequence
     */
    public void setGBSeq_sequence(java.lang.String GBSeq_sequence) {
        this.GBSeq_sequence = GBSeq_sequence;
    }


    /**
     * Gets the GBSeq_contig value for this GBSeqType.
     * 
     * @return GBSeq_contig
     */
    public java.lang.String getGBSeq_contig() {
        return GBSeq_contig;
    }


    /**
     * Sets the GBSeq_contig value for this GBSeqType.
     * 
     * @param GBSeq_contig
     */
    public void setGBSeq_contig(java.lang.String GBSeq_contig) {
        this.GBSeq_contig = GBSeq_contig;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GBSeqType)) return false;
        GBSeqType other = (GBSeqType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.GBSeq_locus==null && other.getGBSeq_locus()==null) || 
             (this.GBSeq_locus!=null &&
              this.GBSeq_locus.equals(other.getGBSeq_locus()))) &&
            ((this.GBSeq_length==null && other.getGBSeq_length()==null) || 
             (this.GBSeq_length!=null &&
              this.GBSeq_length.equals(other.getGBSeq_length()))) &&
            ((this.GBSeq_strandedness==null && other.getGBSeq_strandedness()==null) || 
             (this.GBSeq_strandedness!=null &&
              this.GBSeq_strandedness.equals(other.getGBSeq_strandedness()))) &&
            ((this.GBSeq_moltype==null && other.getGBSeq_moltype()==null) || 
             (this.GBSeq_moltype!=null &&
              this.GBSeq_moltype.equals(other.getGBSeq_moltype()))) &&
            ((this.GBSeq_topology==null && other.getGBSeq_topology()==null) || 
             (this.GBSeq_topology!=null &&
              this.GBSeq_topology.equals(other.getGBSeq_topology()))) &&
            ((this.GBSeq_division==null && other.getGBSeq_division()==null) || 
             (this.GBSeq_division!=null &&
              this.GBSeq_division.equals(other.getGBSeq_division()))) &&
            ((this.GBSeq_updateDate==null && other.getGBSeq_updateDate()==null) || 
             (this.GBSeq_updateDate!=null &&
              this.GBSeq_updateDate.equals(other.getGBSeq_updateDate()))) &&
            ((this.GBSeq_createDate==null && other.getGBSeq_createDate()==null) || 
             (this.GBSeq_createDate!=null &&
              this.GBSeq_createDate.equals(other.getGBSeq_createDate()))) &&
            ((this.GBSeq_updateRelease==null && other.getGBSeq_updateRelease()==null) || 
             (this.GBSeq_updateRelease!=null &&
              this.GBSeq_updateRelease.equals(other.getGBSeq_updateRelease()))) &&
            ((this.GBSeq_createRelease==null && other.getGBSeq_createRelease()==null) || 
             (this.GBSeq_createRelease!=null &&
              this.GBSeq_createRelease.equals(other.getGBSeq_createRelease()))) &&
            ((this.GBSeq_definition==null && other.getGBSeq_definition()==null) || 
             (this.GBSeq_definition!=null &&
              this.GBSeq_definition.equals(other.getGBSeq_definition()))) &&
            ((this.GBSeq_primaryAccession==null && other.getGBSeq_primaryAccession()==null) || 
             (this.GBSeq_primaryAccession!=null &&
              this.GBSeq_primaryAccession.equals(other.getGBSeq_primaryAccession()))) &&
            ((this.GBSeq_entryVersion==null && other.getGBSeq_entryVersion()==null) || 
             (this.GBSeq_entryVersion!=null &&
              this.GBSeq_entryVersion.equals(other.getGBSeq_entryVersion()))) &&
            ((this.GBSeq_accessionVersion==null && other.getGBSeq_accessionVersion()==null) || 
             (this.GBSeq_accessionVersion!=null &&
              this.GBSeq_accessionVersion.equals(other.getGBSeq_accessionVersion()))) &&
            ((this.GBSeq_otherSeqids==null && other.getGBSeq_otherSeqids()==null) || 
             (this.GBSeq_otherSeqids!=null &&
              this.GBSeq_otherSeqids.equals(other.getGBSeq_otherSeqids()))) &&
            ((this.GBSeq_secondaryAccessions==null && other.getGBSeq_secondaryAccessions()==null) || 
             (this.GBSeq_secondaryAccessions!=null &&
              this.GBSeq_secondaryAccessions.equals(other.getGBSeq_secondaryAccessions()))) &&
            ((this.GBSeq_project==null && other.getGBSeq_project()==null) || 
             (this.GBSeq_project!=null &&
              this.GBSeq_project.equals(other.getGBSeq_project()))) &&
            ((this.GBSeq_keywords==null && other.getGBSeq_keywords()==null) || 
             (this.GBSeq_keywords!=null &&
              this.GBSeq_keywords.equals(other.getGBSeq_keywords()))) &&
            ((this.GBSeq_segment==null && other.getGBSeq_segment()==null) || 
             (this.GBSeq_segment!=null &&
              this.GBSeq_segment.equals(other.getGBSeq_segment()))) &&
            ((this.GBSeq_source==null && other.getGBSeq_source()==null) || 
             (this.GBSeq_source!=null &&
              this.GBSeq_source.equals(other.getGBSeq_source()))) &&
            ((this.GBSeq_organism==null && other.getGBSeq_organism()==null) || 
             (this.GBSeq_organism!=null &&
              this.GBSeq_organism.equals(other.getGBSeq_organism()))) &&
            ((this.GBSeq_taxonomy==null && other.getGBSeq_taxonomy()==null) || 
             (this.GBSeq_taxonomy!=null &&
              this.GBSeq_taxonomy.equals(other.getGBSeq_taxonomy()))) &&
            ((this.GBSeq_references==null && other.getGBSeq_references()==null) || 
             (this.GBSeq_references!=null &&
              this.GBSeq_references.equals(other.getGBSeq_references()))) &&
            ((this.GBSeq_comment==null && other.getGBSeq_comment()==null) || 
             (this.GBSeq_comment!=null &&
              this.GBSeq_comment.equals(other.getGBSeq_comment()))) &&
            ((this.GBSeq_primary==null && other.getGBSeq_primary()==null) || 
             (this.GBSeq_primary!=null &&
              this.GBSeq_primary.equals(other.getGBSeq_primary()))) &&
            ((this.GBSeq_sourceDb==null && other.getGBSeq_sourceDb()==null) || 
             (this.GBSeq_sourceDb!=null &&
              this.GBSeq_sourceDb.equals(other.getGBSeq_sourceDb()))) &&
            ((this.GBSeq_databaseReference==null && other.getGBSeq_databaseReference()==null) || 
             (this.GBSeq_databaseReference!=null &&
              this.GBSeq_databaseReference.equals(other.getGBSeq_databaseReference()))) &&
            ((this.GBSeq_featureTable==null && other.getGBSeq_featureTable()==null) || 
             (this.GBSeq_featureTable!=null &&
              this.GBSeq_featureTable.equals(other.getGBSeq_featureTable()))) &&
            ((this.GBSeq_sequence==null && other.getGBSeq_sequence()==null) || 
             (this.GBSeq_sequence!=null &&
              this.GBSeq_sequence.equals(other.getGBSeq_sequence()))) &&
            ((this.GBSeq_contig==null && other.getGBSeq_contig()==null) || 
             (this.GBSeq_contig!=null &&
              this.GBSeq_contig.equals(other.getGBSeq_contig())));
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
        if (getGBSeq_locus() != null) {
            _hashCode += getGBSeq_locus().hashCode();
        }
        if (getGBSeq_length() != null) {
            _hashCode += getGBSeq_length().hashCode();
        }
        if (getGBSeq_strandedness() != null) {
            _hashCode += getGBSeq_strandedness().hashCode();
        }
        if (getGBSeq_moltype() != null) {
            _hashCode += getGBSeq_moltype().hashCode();
        }
        if (getGBSeq_topology() != null) {
            _hashCode += getGBSeq_topology().hashCode();
        }
        if (getGBSeq_division() != null) {
            _hashCode += getGBSeq_division().hashCode();
        }
        if (getGBSeq_updateDate() != null) {
            _hashCode += getGBSeq_updateDate().hashCode();
        }
        if (getGBSeq_createDate() != null) {
            _hashCode += getGBSeq_createDate().hashCode();
        }
        if (getGBSeq_updateRelease() != null) {
            _hashCode += getGBSeq_updateRelease().hashCode();
        }
        if (getGBSeq_createRelease() != null) {
            _hashCode += getGBSeq_createRelease().hashCode();
        }
        if (getGBSeq_definition() != null) {
            _hashCode += getGBSeq_definition().hashCode();
        }
        if (getGBSeq_primaryAccession() != null) {
            _hashCode += getGBSeq_primaryAccession().hashCode();
        }
        if (getGBSeq_entryVersion() != null) {
            _hashCode += getGBSeq_entryVersion().hashCode();
        }
        if (getGBSeq_accessionVersion() != null) {
            _hashCode += getGBSeq_accessionVersion().hashCode();
        }
        if (getGBSeq_otherSeqids() != null) {
            _hashCode += getGBSeq_otherSeqids().hashCode();
        }
        if (getGBSeq_secondaryAccessions() != null) {
            _hashCode += getGBSeq_secondaryAccessions().hashCode();
        }
        if (getGBSeq_project() != null) {
            _hashCode += getGBSeq_project().hashCode();
        }
        if (getGBSeq_keywords() != null) {
            _hashCode += getGBSeq_keywords().hashCode();
        }
        if (getGBSeq_segment() != null) {
            _hashCode += getGBSeq_segment().hashCode();
        }
        if (getGBSeq_source() != null) {
            _hashCode += getGBSeq_source().hashCode();
        }
        if (getGBSeq_organism() != null) {
            _hashCode += getGBSeq_organism().hashCode();
        }
        if (getGBSeq_taxonomy() != null) {
            _hashCode += getGBSeq_taxonomy().hashCode();
        }
        if (getGBSeq_references() != null) {
            _hashCode += getGBSeq_references().hashCode();
        }
        if (getGBSeq_comment() != null) {
            _hashCode += getGBSeq_comment().hashCode();
        }
        if (getGBSeq_primary() != null) {
            _hashCode += getGBSeq_primary().hashCode();
        }
        if (getGBSeq_sourceDb() != null) {
            _hashCode += getGBSeq_sourceDb().hashCode();
        }
        if (getGBSeq_databaseReference() != null) {
            _hashCode += getGBSeq_databaseReference().hashCode();
        }
        if (getGBSeq_featureTable() != null) {
            _hashCode += getGBSeq_featureTable().hashCode();
        }
        if (getGBSeq_sequence() != null) {
            _hashCode += getGBSeq_sequence().hashCode();
        }
        if (getGBSeq_contig() != null) {
            _hashCode += getGBSeq_contig().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GBSeqType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "GBSeqType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GBSeq_locus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "GBSeq_locus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GBSeq_length");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "GBSeq_length"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GBSeq_strandedness");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "GBSeq_strandedness"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GBSeq_moltype");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "GBSeq_moltype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GBSeq_topology");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "GBSeq_topology"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GBSeq_division");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "GBSeq_division"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GBSeq_updateDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "GBSeq_update-date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GBSeq_createDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "GBSeq_create-date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GBSeq_updateRelease");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "GBSeq_update-release"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GBSeq_createRelease");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "GBSeq_create-release"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GBSeq_definition");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "GBSeq_definition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GBSeq_primaryAccession");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "GBSeq_primary-accession"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GBSeq_entryVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "GBSeq_entry-version"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GBSeq_accessionVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "GBSeq_accession-version"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GBSeq_otherSeqids");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "GBSeq_other-seqids"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "GBSeq_other-seqidsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GBSeq_secondaryAccessions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "GBSeq_secondary-accessions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "GBSeq_secondary-accessionsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GBSeq_project");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "GBSeq_project"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GBSeq_keywords");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "GBSeq_keywords"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "GBSeq_keywordsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GBSeq_segment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "GBSeq_segment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GBSeq_source");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "GBSeq_source"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GBSeq_organism");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "GBSeq_organism"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GBSeq_taxonomy");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "GBSeq_taxonomy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GBSeq_references");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "GBSeq_references"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "GBSeq_referencesType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GBSeq_comment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "GBSeq_comment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GBSeq_primary");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "GBSeq_primary"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GBSeq_sourceDb");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "GBSeq_source-db"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GBSeq_databaseReference");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "GBSeq_database-reference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GBSeq_featureTable");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "GBSeq_feature-table"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "GBSeq_feature-tableType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GBSeq_sequence");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "GBSeq_sequence"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GBSeq_contig");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "GBSeq_contig"));
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
