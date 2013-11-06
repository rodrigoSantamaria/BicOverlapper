/**
 * INSDSeqType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class INSDSeqType  implements java.io.Serializable {
    private java.lang.String INSDSeq_locus;

    private java.lang.String INSDSeq_length;

    private java.lang.String INSDSeq_strandedness;

    private java.lang.String INSDSeq_moltype;

    private java.lang.String INSDSeq_topology;

    private java.lang.String INSDSeq_division;

    private java.lang.String INSDSeq_updateDate;

    private java.lang.String INSDSeq_createDate;

    private java.lang.String INSDSeq_updateRelease;

    private java.lang.String INSDSeq_createRelease;

    private java.lang.String INSDSeq_definition;

    private java.lang.String INSDSeq_primaryAccession;

    private java.lang.String INSDSeq_entryVersion;

    private java.lang.String INSDSeq_accessionVersion;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.INSDSeq_otherSeqidsType INSDSeq_otherSeqids;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.INSDSeq_secondaryAccessionsType INSDSeq_secondaryAccessions;

    private java.lang.String INSDSeq_project;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.INSDSeq_keywordsType INSDSeq_keywords;

    private java.lang.String INSDSeq_segment;

    private java.lang.String INSDSeq_source;

    private java.lang.String INSDSeq_organism;

    private java.lang.String INSDSeq_taxonomy;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.INSDSeq_referencesType INSDSeq_references;

    private java.lang.String INSDSeq_comment;

    private java.lang.String INSDSeq_primary;

    private java.lang.String INSDSeq_sourceDb;

    private java.lang.String INSDSeq_databaseReference;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.INSDSeq_featureTableType INSDSeq_featureTable;

    private java.lang.String INSDSeq_sequence;

    private java.lang.String INSDSeq_contig;

    public INSDSeqType() {
    }

    public INSDSeqType(
           java.lang.String INSDSeq_locus,
           java.lang.String INSDSeq_length,
           java.lang.String INSDSeq_strandedness,
           java.lang.String INSDSeq_moltype,
           java.lang.String INSDSeq_topology,
           java.lang.String INSDSeq_division,
           java.lang.String INSDSeq_updateDate,
           java.lang.String INSDSeq_createDate,
           java.lang.String INSDSeq_updateRelease,
           java.lang.String INSDSeq_createRelease,
           java.lang.String INSDSeq_definition,
           java.lang.String INSDSeq_primaryAccession,
           java.lang.String INSDSeq_entryVersion,
           java.lang.String INSDSeq_accessionVersion,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.INSDSeq_otherSeqidsType INSDSeq_otherSeqids,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.INSDSeq_secondaryAccessionsType INSDSeq_secondaryAccessions,
           java.lang.String INSDSeq_project,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.INSDSeq_keywordsType INSDSeq_keywords,
           java.lang.String INSDSeq_segment,
           java.lang.String INSDSeq_source,
           java.lang.String INSDSeq_organism,
           java.lang.String INSDSeq_taxonomy,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.INSDSeq_referencesType INSDSeq_references,
           java.lang.String INSDSeq_comment,
           java.lang.String INSDSeq_primary,
           java.lang.String INSDSeq_sourceDb,
           java.lang.String INSDSeq_databaseReference,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.INSDSeq_featureTableType INSDSeq_featureTable,
           java.lang.String INSDSeq_sequence,
           java.lang.String INSDSeq_contig) {
           this.INSDSeq_locus = INSDSeq_locus;
           this.INSDSeq_length = INSDSeq_length;
           this.INSDSeq_strandedness = INSDSeq_strandedness;
           this.INSDSeq_moltype = INSDSeq_moltype;
           this.INSDSeq_topology = INSDSeq_topology;
           this.INSDSeq_division = INSDSeq_division;
           this.INSDSeq_updateDate = INSDSeq_updateDate;
           this.INSDSeq_createDate = INSDSeq_createDate;
           this.INSDSeq_updateRelease = INSDSeq_updateRelease;
           this.INSDSeq_createRelease = INSDSeq_createRelease;
           this.INSDSeq_definition = INSDSeq_definition;
           this.INSDSeq_primaryAccession = INSDSeq_primaryAccession;
           this.INSDSeq_entryVersion = INSDSeq_entryVersion;
           this.INSDSeq_accessionVersion = INSDSeq_accessionVersion;
           this.INSDSeq_otherSeqids = INSDSeq_otherSeqids;
           this.INSDSeq_secondaryAccessions = INSDSeq_secondaryAccessions;
           this.INSDSeq_project = INSDSeq_project;
           this.INSDSeq_keywords = INSDSeq_keywords;
           this.INSDSeq_segment = INSDSeq_segment;
           this.INSDSeq_source = INSDSeq_source;
           this.INSDSeq_organism = INSDSeq_organism;
           this.INSDSeq_taxonomy = INSDSeq_taxonomy;
           this.INSDSeq_references = INSDSeq_references;
           this.INSDSeq_comment = INSDSeq_comment;
           this.INSDSeq_primary = INSDSeq_primary;
           this.INSDSeq_sourceDb = INSDSeq_sourceDb;
           this.INSDSeq_databaseReference = INSDSeq_databaseReference;
           this.INSDSeq_featureTable = INSDSeq_featureTable;
           this.INSDSeq_sequence = INSDSeq_sequence;
           this.INSDSeq_contig = INSDSeq_contig;
    }


    /**
     * Gets the INSDSeq_locus value for this INSDSeqType.
     * 
     * @return INSDSeq_locus
     */
    public java.lang.String getINSDSeq_locus() {
        return INSDSeq_locus;
    }


    /**
     * Sets the INSDSeq_locus value for this INSDSeqType.
     * 
     * @param INSDSeq_locus
     */
    public void setINSDSeq_locus(java.lang.String INSDSeq_locus) {
        this.INSDSeq_locus = INSDSeq_locus;
    }


    /**
     * Gets the INSDSeq_length value for this INSDSeqType.
     * 
     * @return INSDSeq_length
     */
    public java.lang.String getINSDSeq_length() {
        return INSDSeq_length;
    }


    /**
     * Sets the INSDSeq_length value for this INSDSeqType.
     * 
     * @param INSDSeq_length
     */
    public void setINSDSeq_length(java.lang.String INSDSeq_length) {
        this.INSDSeq_length = INSDSeq_length;
    }


    /**
     * Gets the INSDSeq_strandedness value for this INSDSeqType.
     * 
     * @return INSDSeq_strandedness
     */
    public java.lang.String getINSDSeq_strandedness() {
        return INSDSeq_strandedness;
    }


    /**
     * Sets the INSDSeq_strandedness value for this INSDSeqType.
     * 
     * @param INSDSeq_strandedness
     */
    public void setINSDSeq_strandedness(java.lang.String INSDSeq_strandedness) {
        this.INSDSeq_strandedness = INSDSeq_strandedness;
    }


    /**
     * Gets the INSDSeq_moltype value for this INSDSeqType.
     * 
     * @return INSDSeq_moltype
     */
    public java.lang.String getINSDSeq_moltype() {
        return INSDSeq_moltype;
    }


    /**
     * Sets the INSDSeq_moltype value for this INSDSeqType.
     * 
     * @param INSDSeq_moltype
     */
    public void setINSDSeq_moltype(java.lang.String INSDSeq_moltype) {
        this.INSDSeq_moltype = INSDSeq_moltype;
    }


    /**
     * Gets the INSDSeq_topology value for this INSDSeqType.
     * 
     * @return INSDSeq_topology
     */
    public java.lang.String getINSDSeq_topology() {
        return INSDSeq_topology;
    }


    /**
     * Sets the INSDSeq_topology value for this INSDSeqType.
     * 
     * @param INSDSeq_topology
     */
    public void setINSDSeq_topology(java.lang.String INSDSeq_topology) {
        this.INSDSeq_topology = INSDSeq_topology;
    }


    /**
     * Gets the INSDSeq_division value for this INSDSeqType.
     * 
     * @return INSDSeq_division
     */
    public java.lang.String getINSDSeq_division() {
        return INSDSeq_division;
    }


    /**
     * Sets the INSDSeq_division value for this INSDSeqType.
     * 
     * @param INSDSeq_division
     */
    public void setINSDSeq_division(java.lang.String INSDSeq_division) {
        this.INSDSeq_division = INSDSeq_division;
    }


    /**
     * Gets the INSDSeq_updateDate value for this INSDSeqType.
     * 
     * @return INSDSeq_updateDate
     */
    public java.lang.String getINSDSeq_updateDate() {
        return INSDSeq_updateDate;
    }


    /**
     * Sets the INSDSeq_updateDate value for this INSDSeqType.
     * 
     * @param INSDSeq_updateDate
     */
    public void setINSDSeq_updateDate(java.lang.String INSDSeq_updateDate) {
        this.INSDSeq_updateDate = INSDSeq_updateDate;
    }


    /**
     * Gets the INSDSeq_createDate value for this INSDSeqType.
     * 
     * @return INSDSeq_createDate
     */
    public java.lang.String getINSDSeq_createDate() {
        return INSDSeq_createDate;
    }


    /**
     * Sets the INSDSeq_createDate value for this INSDSeqType.
     * 
     * @param INSDSeq_createDate
     */
    public void setINSDSeq_createDate(java.lang.String INSDSeq_createDate) {
        this.INSDSeq_createDate = INSDSeq_createDate;
    }


    /**
     * Gets the INSDSeq_updateRelease value for this INSDSeqType.
     * 
     * @return INSDSeq_updateRelease
     */
    public java.lang.String getINSDSeq_updateRelease() {
        return INSDSeq_updateRelease;
    }


    /**
     * Sets the INSDSeq_updateRelease value for this INSDSeqType.
     * 
     * @param INSDSeq_updateRelease
     */
    public void setINSDSeq_updateRelease(java.lang.String INSDSeq_updateRelease) {
        this.INSDSeq_updateRelease = INSDSeq_updateRelease;
    }


    /**
     * Gets the INSDSeq_createRelease value for this INSDSeqType.
     * 
     * @return INSDSeq_createRelease
     */
    public java.lang.String getINSDSeq_createRelease() {
        return INSDSeq_createRelease;
    }


    /**
     * Sets the INSDSeq_createRelease value for this INSDSeqType.
     * 
     * @param INSDSeq_createRelease
     */
    public void setINSDSeq_createRelease(java.lang.String INSDSeq_createRelease) {
        this.INSDSeq_createRelease = INSDSeq_createRelease;
    }


    /**
     * Gets the INSDSeq_definition value for this INSDSeqType.
     * 
     * @return INSDSeq_definition
     */
    public java.lang.String getINSDSeq_definition() {
        return INSDSeq_definition;
    }


    /**
     * Sets the INSDSeq_definition value for this INSDSeqType.
     * 
     * @param INSDSeq_definition
     */
    public void setINSDSeq_definition(java.lang.String INSDSeq_definition) {
        this.INSDSeq_definition = INSDSeq_definition;
    }


    /**
     * Gets the INSDSeq_primaryAccession value for this INSDSeqType.
     * 
     * @return INSDSeq_primaryAccession
     */
    public java.lang.String getINSDSeq_primaryAccession() {
        return INSDSeq_primaryAccession;
    }


    /**
     * Sets the INSDSeq_primaryAccession value for this INSDSeqType.
     * 
     * @param INSDSeq_primaryAccession
     */
    public void setINSDSeq_primaryAccession(java.lang.String INSDSeq_primaryAccession) {
        this.INSDSeq_primaryAccession = INSDSeq_primaryAccession;
    }


    /**
     * Gets the INSDSeq_entryVersion value for this INSDSeqType.
     * 
     * @return INSDSeq_entryVersion
     */
    public java.lang.String getINSDSeq_entryVersion() {
        return INSDSeq_entryVersion;
    }


    /**
     * Sets the INSDSeq_entryVersion value for this INSDSeqType.
     * 
     * @param INSDSeq_entryVersion
     */
    public void setINSDSeq_entryVersion(java.lang.String INSDSeq_entryVersion) {
        this.INSDSeq_entryVersion = INSDSeq_entryVersion;
    }


    /**
     * Gets the INSDSeq_accessionVersion value for this INSDSeqType.
     * 
     * @return INSDSeq_accessionVersion
     */
    public java.lang.String getINSDSeq_accessionVersion() {
        return INSDSeq_accessionVersion;
    }


    /**
     * Sets the INSDSeq_accessionVersion value for this INSDSeqType.
     * 
     * @param INSDSeq_accessionVersion
     */
    public void setINSDSeq_accessionVersion(java.lang.String INSDSeq_accessionVersion) {
        this.INSDSeq_accessionVersion = INSDSeq_accessionVersion;
    }


    /**
     * Gets the INSDSeq_otherSeqids value for this INSDSeqType.
     * 
     * @return INSDSeq_otherSeqids
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.INSDSeq_otherSeqidsType getINSDSeq_otherSeqids() {
        return INSDSeq_otherSeqids;
    }


    /**
     * Sets the INSDSeq_otherSeqids value for this INSDSeqType.
     * 
     * @param INSDSeq_otherSeqids
     */
    public void setINSDSeq_otherSeqids(gov.nih.nlm.ncbi.www.soap.eutils.efetch.INSDSeq_otherSeqidsType INSDSeq_otherSeqids) {
        this.INSDSeq_otherSeqids = INSDSeq_otherSeqids;
    }


    /**
     * Gets the INSDSeq_secondaryAccessions value for this INSDSeqType.
     * 
     * @return INSDSeq_secondaryAccessions
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.INSDSeq_secondaryAccessionsType getINSDSeq_secondaryAccessions() {
        return INSDSeq_secondaryAccessions;
    }


    /**
     * Sets the INSDSeq_secondaryAccessions value for this INSDSeqType.
     * 
     * @param INSDSeq_secondaryAccessions
     */
    public void setINSDSeq_secondaryAccessions(gov.nih.nlm.ncbi.www.soap.eutils.efetch.INSDSeq_secondaryAccessionsType INSDSeq_secondaryAccessions) {
        this.INSDSeq_secondaryAccessions = INSDSeq_secondaryAccessions;
    }


    /**
     * Gets the INSDSeq_project value for this INSDSeqType.
     * 
     * @return INSDSeq_project
     */
    public java.lang.String getINSDSeq_project() {
        return INSDSeq_project;
    }


    /**
     * Sets the INSDSeq_project value for this INSDSeqType.
     * 
     * @param INSDSeq_project
     */
    public void setINSDSeq_project(java.lang.String INSDSeq_project) {
        this.INSDSeq_project = INSDSeq_project;
    }


    /**
     * Gets the INSDSeq_keywords value for this INSDSeqType.
     * 
     * @return INSDSeq_keywords
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.INSDSeq_keywordsType getINSDSeq_keywords() {
        return INSDSeq_keywords;
    }


    /**
     * Sets the INSDSeq_keywords value for this INSDSeqType.
     * 
     * @param INSDSeq_keywords
     */
    public void setINSDSeq_keywords(gov.nih.nlm.ncbi.www.soap.eutils.efetch.INSDSeq_keywordsType INSDSeq_keywords) {
        this.INSDSeq_keywords = INSDSeq_keywords;
    }


    /**
     * Gets the INSDSeq_segment value for this INSDSeqType.
     * 
     * @return INSDSeq_segment
     */
    public java.lang.String getINSDSeq_segment() {
        return INSDSeq_segment;
    }


    /**
     * Sets the INSDSeq_segment value for this INSDSeqType.
     * 
     * @param INSDSeq_segment
     */
    public void setINSDSeq_segment(java.lang.String INSDSeq_segment) {
        this.INSDSeq_segment = INSDSeq_segment;
    }


    /**
     * Gets the INSDSeq_source value for this INSDSeqType.
     * 
     * @return INSDSeq_source
     */
    public java.lang.String getINSDSeq_source() {
        return INSDSeq_source;
    }


    /**
     * Sets the INSDSeq_source value for this INSDSeqType.
     * 
     * @param INSDSeq_source
     */
    public void setINSDSeq_source(java.lang.String INSDSeq_source) {
        this.INSDSeq_source = INSDSeq_source;
    }


    /**
     * Gets the INSDSeq_organism value for this INSDSeqType.
     * 
     * @return INSDSeq_organism
     */
    public java.lang.String getINSDSeq_organism() {
        return INSDSeq_organism;
    }


    /**
     * Sets the INSDSeq_organism value for this INSDSeqType.
     * 
     * @param INSDSeq_organism
     */
    public void setINSDSeq_organism(java.lang.String INSDSeq_organism) {
        this.INSDSeq_organism = INSDSeq_organism;
    }


    /**
     * Gets the INSDSeq_taxonomy value for this INSDSeqType.
     * 
     * @return INSDSeq_taxonomy
     */
    public java.lang.String getINSDSeq_taxonomy() {
        return INSDSeq_taxonomy;
    }


    /**
     * Sets the INSDSeq_taxonomy value for this INSDSeqType.
     * 
     * @param INSDSeq_taxonomy
     */
    public void setINSDSeq_taxonomy(java.lang.String INSDSeq_taxonomy) {
        this.INSDSeq_taxonomy = INSDSeq_taxonomy;
    }


    /**
     * Gets the INSDSeq_references value for this INSDSeqType.
     * 
     * @return INSDSeq_references
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.INSDSeq_referencesType getINSDSeq_references() {
        return INSDSeq_references;
    }


    /**
     * Sets the INSDSeq_references value for this INSDSeqType.
     * 
     * @param INSDSeq_references
     */
    public void setINSDSeq_references(gov.nih.nlm.ncbi.www.soap.eutils.efetch.INSDSeq_referencesType INSDSeq_references) {
        this.INSDSeq_references = INSDSeq_references;
    }


    /**
     * Gets the INSDSeq_comment value for this INSDSeqType.
     * 
     * @return INSDSeq_comment
     */
    public java.lang.String getINSDSeq_comment() {
        return INSDSeq_comment;
    }


    /**
     * Sets the INSDSeq_comment value for this INSDSeqType.
     * 
     * @param INSDSeq_comment
     */
    public void setINSDSeq_comment(java.lang.String INSDSeq_comment) {
        this.INSDSeq_comment = INSDSeq_comment;
    }


    /**
     * Gets the INSDSeq_primary value for this INSDSeqType.
     * 
     * @return INSDSeq_primary
     */
    public java.lang.String getINSDSeq_primary() {
        return INSDSeq_primary;
    }


    /**
     * Sets the INSDSeq_primary value for this INSDSeqType.
     * 
     * @param INSDSeq_primary
     */
    public void setINSDSeq_primary(java.lang.String INSDSeq_primary) {
        this.INSDSeq_primary = INSDSeq_primary;
    }


    /**
     * Gets the INSDSeq_sourceDb value for this INSDSeqType.
     * 
     * @return INSDSeq_sourceDb
     */
    public java.lang.String getINSDSeq_sourceDb() {
        return INSDSeq_sourceDb;
    }


    /**
     * Sets the INSDSeq_sourceDb value for this INSDSeqType.
     * 
     * @param INSDSeq_sourceDb
     */
    public void setINSDSeq_sourceDb(java.lang.String INSDSeq_sourceDb) {
        this.INSDSeq_sourceDb = INSDSeq_sourceDb;
    }


    /**
     * Gets the INSDSeq_databaseReference value for this INSDSeqType.
     * 
     * @return INSDSeq_databaseReference
     */
    public java.lang.String getINSDSeq_databaseReference() {
        return INSDSeq_databaseReference;
    }


    /**
     * Sets the INSDSeq_databaseReference value for this INSDSeqType.
     * 
     * @param INSDSeq_databaseReference
     */
    public void setINSDSeq_databaseReference(java.lang.String INSDSeq_databaseReference) {
        this.INSDSeq_databaseReference = INSDSeq_databaseReference;
    }


    /**
     * Gets the INSDSeq_featureTable value for this INSDSeqType.
     * 
     * @return INSDSeq_featureTable
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.INSDSeq_featureTableType getINSDSeq_featureTable() {
        return INSDSeq_featureTable;
    }


    /**
     * Sets the INSDSeq_featureTable value for this INSDSeqType.
     * 
     * @param INSDSeq_featureTable
     */
    public void setINSDSeq_featureTable(gov.nih.nlm.ncbi.www.soap.eutils.efetch.INSDSeq_featureTableType INSDSeq_featureTable) {
        this.INSDSeq_featureTable = INSDSeq_featureTable;
    }


    /**
     * Gets the INSDSeq_sequence value for this INSDSeqType.
     * 
     * @return INSDSeq_sequence
     */
    public java.lang.String getINSDSeq_sequence() {
        return INSDSeq_sequence;
    }


    /**
     * Sets the INSDSeq_sequence value for this INSDSeqType.
     * 
     * @param INSDSeq_sequence
     */
    public void setINSDSeq_sequence(java.lang.String INSDSeq_sequence) {
        this.INSDSeq_sequence = INSDSeq_sequence;
    }


    /**
     * Gets the INSDSeq_contig value for this INSDSeqType.
     * 
     * @return INSDSeq_contig
     */
    public java.lang.String getINSDSeq_contig() {
        return INSDSeq_contig;
    }


    /**
     * Sets the INSDSeq_contig value for this INSDSeqType.
     * 
     * @param INSDSeq_contig
     */
    public void setINSDSeq_contig(java.lang.String INSDSeq_contig) {
        this.INSDSeq_contig = INSDSeq_contig;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof INSDSeqType)) return false;
        INSDSeqType other = (INSDSeqType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.INSDSeq_locus==null && other.getINSDSeq_locus()==null) || 
             (this.INSDSeq_locus!=null &&
              this.INSDSeq_locus.equals(other.getINSDSeq_locus()))) &&
            ((this.INSDSeq_length==null && other.getINSDSeq_length()==null) || 
             (this.INSDSeq_length!=null &&
              this.INSDSeq_length.equals(other.getINSDSeq_length()))) &&
            ((this.INSDSeq_strandedness==null && other.getINSDSeq_strandedness()==null) || 
             (this.INSDSeq_strandedness!=null &&
              this.INSDSeq_strandedness.equals(other.getINSDSeq_strandedness()))) &&
            ((this.INSDSeq_moltype==null && other.getINSDSeq_moltype()==null) || 
             (this.INSDSeq_moltype!=null &&
              this.INSDSeq_moltype.equals(other.getINSDSeq_moltype()))) &&
            ((this.INSDSeq_topology==null && other.getINSDSeq_topology()==null) || 
             (this.INSDSeq_topology!=null &&
              this.INSDSeq_topology.equals(other.getINSDSeq_topology()))) &&
            ((this.INSDSeq_division==null && other.getINSDSeq_division()==null) || 
             (this.INSDSeq_division!=null &&
              this.INSDSeq_division.equals(other.getINSDSeq_division()))) &&
            ((this.INSDSeq_updateDate==null && other.getINSDSeq_updateDate()==null) || 
             (this.INSDSeq_updateDate!=null &&
              this.INSDSeq_updateDate.equals(other.getINSDSeq_updateDate()))) &&
            ((this.INSDSeq_createDate==null && other.getINSDSeq_createDate()==null) || 
             (this.INSDSeq_createDate!=null &&
              this.INSDSeq_createDate.equals(other.getINSDSeq_createDate()))) &&
            ((this.INSDSeq_updateRelease==null && other.getINSDSeq_updateRelease()==null) || 
             (this.INSDSeq_updateRelease!=null &&
              this.INSDSeq_updateRelease.equals(other.getINSDSeq_updateRelease()))) &&
            ((this.INSDSeq_createRelease==null && other.getINSDSeq_createRelease()==null) || 
             (this.INSDSeq_createRelease!=null &&
              this.INSDSeq_createRelease.equals(other.getINSDSeq_createRelease()))) &&
            ((this.INSDSeq_definition==null && other.getINSDSeq_definition()==null) || 
             (this.INSDSeq_definition!=null &&
              this.INSDSeq_definition.equals(other.getINSDSeq_definition()))) &&
            ((this.INSDSeq_primaryAccession==null && other.getINSDSeq_primaryAccession()==null) || 
             (this.INSDSeq_primaryAccession!=null &&
              this.INSDSeq_primaryAccession.equals(other.getINSDSeq_primaryAccession()))) &&
            ((this.INSDSeq_entryVersion==null && other.getINSDSeq_entryVersion()==null) || 
             (this.INSDSeq_entryVersion!=null &&
              this.INSDSeq_entryVersion.equals(other.getINSDSeq_entryVersion()))) &&
            ((this.INSDSeq_accessionVersion==null && other.getINSDSeq_accessionVersion()==null) || 
             (this.INSDSeq_accessionVersion!=null &&
              this.INSDSeq_accessionVersion.equals(other.getINSDSeq_accessionVersion()))) &&
            ((this.INSDSeq_otherSeqids==null && other.getINSDSeq_otherSeqids()==null) || 
             (this.INSDSeq_otherSeqids!=null &&
              this.INSDSeq_otherSeqids.equals(other.getINSDSeq_otherSeqids()))) &&
            ((this.INSDSeq_secondaryAccessions==null && other.getINSDSeq_secondaryAccessions()==null) || 
             (this.INSDSeq_secondaryAccessions!=null &&
              this.INSDSeq_secondaryAccessions.equals(other.getINSDSeq_secondaryAccessions()))) &&
            ((this.INSDSeq_project==null && other.getINSDSeq_project()==null) || 
             (this.INSDSeq_project!=null &&
              this.INSDSeq_project.equals(other.getINSDSeq_project()))) &&
            ((this.INSDSeq_keywords==null && other.getINSDSeq_keywords()==null) || 
             (this.INSDSeq_keywords!=null &&
              this.INSDSeq_keywords.equals(other.getINSDSeq_keywords()))) &&
            ((this.INSDSeq_segment==null && other.getINSDSeq_segment()==null) || 
             (this.INSDSeq_segment!=null &&
              this.INSDSeq_segment.equals(other.getINSDSeq_segment()))) &&
            ((this.INSDSeq_source==null && other.getINSDSeq_source()==null) || 
             (this.INSDSeq_source!=null &&
              this.INSDSeq_source.equals(other.getINSDSeq_source()))) &&
            ((this.INSDSeq_organism==null && other.getINSDSeq_organism()==null) || 
             (this.INSDSeq_organism!=null &&
              this.INSDSeq_organism.equals(other.getINSDSeq_organism()))) &&
            ((this.INSDSeq_taxonomy==null && other.getINSDSeq_taxonomy()==null) || 
             (this.INSDSeq_taxonomy!=null &&
              this.INSDSeq_taxonomy.equals(other.getINSDSeq_taxonomy()))) &&
            ((this.INSDSeq_references==null && other.getINSDSeq_references()==null) || 
             (this.INSDSeq_references!=null &&
              this.INSDSeq_references.equals(other.getINSDSeq_references()))) &&
            ((this.INSDSeq_comment==null && other.getINSDSeq_comment()==null) || 
             (this.INSDSeq_comment!=null &&
              this.INSDSeq_comment.equals(other.getINSDSeq_comment()))) &&
            ((this.INSDSeq_primary==null && other.getINSDSeq_primary()==null) || 
             (this.INSDSeq_primary!=null &&
              this.INSDSeq_primary.equals(other.getINSDSeq_primary()))) &&
            ((this.INSDSeq_sourceDb==null && other.getINSDSeq_sourceDb()==null) || 
             (this.INSDSeq_sourceDb!=null &&
              this.INSDSeq_sourceDb.equals(other.getINSDSeq_sourceDb()))) &&
            ((this.INSDSeq_databaseReference==null && other.getINSDSeq_databaseReference()==null) || 
             (this.INSDSeq_databaseReference!=null &&
              this.INSDSeq_databaseReference.equals(other.getINSDSeq_databaseReference()))) &&
            ((this.INSDSeq_featureTable==null && other.getINSDSeq_featureTable()==null) || 
             (this.INSDSeq_featureTable!=null &&
              this.INSDSeq_featureTable.equals(other.getINSDSeq_featureTable()))) &&
            ((this.INSDSeq_sequence==null && other.getINSDSeq_sequence()==null) || 
             (this.INSDSeq_sequence!=null &&
              this.INSDSeq_sequence.equals(other.getINSDSeq_sequence()))) &&
            ((this.INSDSeq_contig==null && other.getINSDSeq_contig()==null) || 
             (this.INSDSeq_contig!=null &&
              this.INSDSeq_contig.equals(other.getINSDSeq_contig())));
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
        if (getINSDSeq_locus() != null) {
            _hashCode += getINSDSeq_locus().hashCode();
        }
        if (getINSDSeq_length() != null) {
            _hashCode += getINSDSeq_length().hashCode();
        }
        if (getINSDSeq_strandedness() != null) {
            _hashCode += getINSDSeq_strandedness().hashCode();
        }
        if (getINSDSeq_moltype() != null) {
            _hashCode += getINSDSeq_moltype().hashCode();
        }
        if (getINSDSeq_topology() != null) {
            _hashCode += getINSDSeq_topology().hashCode();
        }
        if (getINSDSeq_division() != null) {
            _hashCode += getINSDSeq_division().hashCode();
        }
        if (getINSDSeq_updateDate() != null) {
            _hashCode += getINSDSeq_updateDate().hashCode();
        }
        if (getINSDSeq_createDate() != null) {
            _hashCode += getINSDSeq_createDate().hashCode();
        }
        if (getINSDSeq_updateRelease() != null) {
            _hashCode += getINSDSeq_updateRelease().hashCode();
        }
        if (getINSDSeq_createRelease() != null) {
            _hashCode += getINSDSeq_createRelease().hashCode();
        }
        if (getINSDSeq_definition() != null) {
            _hashCode += getINSDSeq_definition().hashCode();
        }
        if (getINSDSeq_primaryAccession() != null) {
            _hashCode += getINSDSeq_primaryAccession().hashCode();
        }
        if (getINSDSeq_entryVersion() != null) {
            _hashCode += getINSDSeq_entryVersion().hashCode();
        }
        if (getINSDSeq_accessionVersion() != null) {
            _hashCode += getINSDSeq_accessionVersion().hashCode();
        }
        if (getINSDSeq_otherSeqids() != null) {
            _hashCode += getINSDSeq_otherSeqids().hashCode();
        }
        if (getINSDSeq_secondaryAccessions() != null) {
            _hashCode += getINSDSeq_secondaryAccessions().hashCode();
        }
        if (getINSDSeq_project() != null) {
            _hashCode += getINSDSeq_project().hashCode();
        }
        if (getINSDSeq_keywords() != null) {
            _hashCode += getINSDSeq_keywords().hashCode();
        }
        if (getINSDSeq_segment() != null) {
            _hashCode += getINSDSeq_segment().hashCode();
        }
        if (getINSDSeq_source() != null) {
            _hashCode += getINSDSeq_source().hashCode();
        }
        if (getINSDSeq_organism() != null) {
            _hashCode += getINSDSeq_organism().hashCode();
        }
        if (getINSDSeq_taxonomy() != null) {
            _hashCode += getINSDSeq_taxonomy().hashCode();
        }
        if (getINSDSeq_references() != null) {
            _hashCode += getINSDSeq_references().hashCode();
        }
        if (getINSDSeq_comment() != null) {
            _hashCode += getINSDSeq_comment().hashCode();
        }
        if (getINSDSeq_primary() != null) {
            _hashCode += getINSDSeq_primary().hashCode();
        }
        if (getINSDSeq_sourceDb() != null) {
            _hashCode += getINSDSeq_sourceDb().hashCode();
        }
        if (getINSDSeq_databaseReference() != null) {
            _hashCode += getINSDSeq_databaseReference().hashCode();
        }
        if (getINSDSeq_featureTable() != null) {
            _hashCode += getINSDSeq_featureTable().hashCode();
        }
        if (getINSDSeq_sequence() != null) {
            _hashCode += getINSDSeq_sequence().hashCode();
        }
        if (getINSDSeq_contig() != null) {
            _hashCode += getINSDSeq_contig().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(INSDSeqType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "INSDSeqType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("INSDSeq_locus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "INSDSeq_locus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("INSDSeq_length");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "INSDSeq_length"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("INSDSeq_strandedness");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "INSDSeq_strandedness"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("INSDSeq_moltype");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "INSDSeq_moltype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("INSDSeq_topology");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "INSDSeq_topology"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("INSDSeq_division");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "INSDSeq_division"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("INSDSeq_updateDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "INSDSeq_update-date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("INSDSeq_createDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "INSDSeq_create-date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("INSDSeq_updateRelease");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "INSDSeq_update-release"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("INSDSeq_createRelease");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "INSDSeq_create-release"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("INSDSeq_definition");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "INSDSeq_definition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("INSDSeq_primaryAccession");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "INSDSeq_primary-accession"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("INSDSeq_entryVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "INSDSeq_entry-version"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("INSDSeq_accessionVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "INSDSeq_accession-version"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("INSDSeq_otherSeqids");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "INSDSeq_other-seqids"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "INSDSeq_other-seqidsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("INSDSeq_secondaryAccessions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "INSDSeq_secondary-accessions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "INSDSeq_secondary-accessionsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("INSDSeq_project");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "INSDSeq_project"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("INSDSeq_keywords");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "INSDSeq_keywords"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "INSDSeq_keywordsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("INSDSeq_segment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "INSDSeq_segment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("INSDSeq_source");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "INSDSeq_source"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("INSDSeq_organism");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "INSDSeq_organism"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("INSDSeq_taxonomy");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "INSDSeq_taxonomy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("INSDSeq_references");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "INSDSeq_references"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "INSDSeq_referencesType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("INSDSeq_comment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "INSDSeq_comment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("INSDSeq_primary");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "INSDSeq_primary"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("INSDSeq_sourceDb");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "INSDSeq_source-db"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("INSDSeq_databaseReference");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "INSDSeq_database-reference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("INSDSeq_featureTable");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "INSDSeq_feature-table"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "INSDSeq_feature-tableType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("INSDSeq_sequence");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "INSDSeq_sequence"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("INSDSeq_contig");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "INSDSeq_contig"));
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
