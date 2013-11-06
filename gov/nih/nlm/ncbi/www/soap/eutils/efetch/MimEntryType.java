/**
 * MimEntryType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class MimEntryType  implements java.io.Serializable {
    private java.lang.String mimEntry_mimNumber;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimEntry_mimTypeType mimEntry_mimType;

    private java.lang.String mimEntry_title;

    private java.lang.String mimEntry_copyright;

    private java.lang.String mimEntry_symbol;

    private java.lang.String mimEntry_locus;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimEntry_synonymsType mimEntry_synonyms;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimEntry_aliasesType mimEntry_aliases;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimEntry_includedType mimEntry_included;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimEntry_seeAlsoType mimEntry_seeAlso;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimEntry_textType mimEntry_text;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimEntry_textfieldsType mimEntry_textfields;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimEntry_hasSummaryType mimEntry_hasSummary;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimEntry_summaryType mimEntry_summary;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimEntry_summaryAttributionType mimEntry_summaryAttribution;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimEntry_summaryEditHistoryType mimEntry_summaryEditHistory;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimEntry_summaryCreationDateType mimEntry_summaryCreationDate;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimEntry_allelicVariantsType mimEntry_allelicVariants;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimEntry_hasSynopsisType mimEntry_hasSynopsis;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimEntry_clinicalSynopsisType mimEntry_clinicalSynopsis;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimEntry_synopsisAttributionType mimEntry_synopsisAttribution;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimEntry_synopsisEditHistoryType mimEntry_synopsisEditHistory;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimEntry_synopsisCreationDateType mimEntry_synopsisCreationDate;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimEntry_editHistoryType mimEntry_editHistory;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimEntry_creationDateType mimEntry_creationDate;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimEntry_referencesType mimEntry_references;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimEntry_attributionType mimEntry_attribution;

    private java.lang.String mimEntry_numGeneMaps;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimEntry_medlineLinksType mimEntry_medlineLinks;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimEntry_proteinLinksType mimEntry_proteinLinks;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimEntry_nucleotideLinksType mimEntry_nucleotideLinks;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimEntry_structureLinksType mimEntry_structureLinks;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimEntry_genomeLinksType mimEntry_genomeLinks;

    public MimEntryType() {
    }

    public MimEntryType(
           java.lang.String mimEntry_mimNumber,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimEntry_mimTypeType mimEntry_mimType,
           java.lang.String mimEntry_title,
           java.lang.String mimEntry_copyright,
           java.lang.String mimEntry_symbol,
           java.lang.String mimEntry_locus,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimEntry_synonymsType mimEntry_synonyms,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimEntry_aliasesType mimEntry_aliases,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimEntry_includedType mimEntry_included,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimEntry_seeAlsoType mimEntry_seeAlso,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimEntry_textType mimEntry_text,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimEntry_textfieldsType mimEntry_textfields,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimEntry_hasSummaryType mimEntry_hasSummary,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimEntry_summaryType mimEntry_summary,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimEntry_summaryAttributionType mimEntry_summaryAttribution,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimEntry_summaryEditHistoryType mimEntry_summaryEditHistory,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimEntry_summaryCreationDateType mimEntry_summaryCreationDate,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimEntry_allelicVariantsType mimEntry_allelicVariants,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimEntry_hasSynopsisType mimEntry_hasSynopsis,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimEntry_clinicalSynopsisType mimEntry_clinicalSynopsis,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimEntry_synopsisAttributionType mimEntry_synopsisAttribution,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimEntry_synopsisEditHistoryType mimEntry_synopsisEditHistory,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimEntry_synopsisCreationDateType mimEntry_synopsisCreationDate,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimEntry_editHistoryType mimEntry_editHistory,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimEntry_creationDateType mimEntry_creationDate,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimEntry_referencesType mimEntry_references,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimEntry_attributionType mimEntry_attribution,
           java.lang.String mimEntry_numGeneMaps,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimEntry_medlineLinksType mimEntry_medlineLinks,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimEntry_proteinLinksType mimEntry_proteinLinks,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimEntry_nucleotideLinksType mimEntry_nucleotideLinks,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimEntry_structureLinksType mimEntry_structureLinks,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimEntry_genomeLinksType mimEntry_genomeLinks) {
           this.mimEntry_mimNumber = mimEntry_mimNumber;
           this.mimEntry_mimType = mimEntry_mimType;
           this.mimEntry_title = mimEntry_title;
           this.mimEntry_copyright = mimEntry_copyright;
           this.mimEntry_symbol = mimEntry_symbol;
           this.mimEntry_locus = mimEntry_locus;
           this.mimEntry_synonyms = mimEntry_synonyms;
           this.mimEntry_aliases = mimEntry_aliases;
           this.mimEntry_included = mimEntry_included;
           this.mimEntry_seeAlso = mimEntry_seeAlso;
           this.mimEntry_text = mimEntry_text;
           this.mimEntry_textfields = mimEntry_textfields;
           this.mimEntry_hasSummary = mimEntry_hasSummary;
           this.mimEntry_summary = mimEntry_summary;
           this.mimEntry_summaryAttribution = mimEntry_summaryAttribution;
           this.mimEntry_summaryEditHistory = mimEntry_summaryEditHistory;
           this.mimEntry_summaryCreationDate = mimEntry_summaryCreationDate;
           this.mimEntry_allelicVariants = mimEntry_allelicVariants;
           this.mimEntry_hasSynopsis = mimEntry_hasSynopsis;
           this.mimEntry_clinicalSynopsis = mimEntry_clinicalSynopsis;
           this.mimEntry_synopsisAttribution = mimEntry_synopsisAttribution;
           this.mimEntry_synopsisEditHistory = mimEntry_synopsisEditHistory;
           this.mimEntry_synopsisCreationDate = mimEntry_synopsisCreationDate;
           this.mimEntry_editHistory = mimEntry_editHistory;
           this.mimEntry_creationDate = mimEntry_creationDate;
           this.mimEntry_references = mimEntry_references;
           this.mimEntry_attribution = mimEntry_attribution;
           this.mimEntry_numGeneMaps = mimEntry_numGeneMaps;
           this.mimEntry_medlineLinks = mimEntry_medlineLinks;
           this.mimEntry_proteinLinks = mimEntry_proteinLinks;
           this.mimEntry_nucleotideLinks = mimEntry_nucleotideLinks;
           this.mimEntry_structureLinks = mimEntry_structureLinks;
           this.mimEntry_genomeLinks = mimEntry_genomeLinks;
    }


    /**
     * Gets the mimEntry_mimNumber value for this MimEntryType.
     * 
     * @return mimEntry_mimNumber
     */
    public java.lang.String getMimEntry_mimNumber() {
        return mimEntry_mimNumber;
    }


    /**
     * Sets the mimEntry_mimNumber value for this MimEntryType.
     * 
     * @param mimEntry_mimNumber
     */
    public void setMimEntry_mimNumber(java.lang.String mimEntry_mimNumber) {
        this.mimEntry_mimNumber = mimEntry_mimNumber;
    }


    /**
     * Gets the mimEntry_mimType value for this MimEntryType.
     * 
     * @return mimEntry_mimType
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimEntry_mimTypeType getMimEntry_mimType() {
        return mimEntry_mimType;
    }


    /**
     * Sets the mimEntry_mimType value for this MimEntryType.
     * 
     * @param mimEntry_mimType
     */
    public void setMimEntry_mimType(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimEntry_mimTypeType mimEntry_mimType) {
        this.mimEntry_mimType = mimEntry_mimType;
    }


    /**
     * Gets the mimEntry_title value for this MimEntryType.
     * 
     * @return mimEntry_title
     */
    public java.lang.String getMimEntry_title() {
        return mimEntry_title;
    }


    /**
     * Sets the mimEntry_title value for this MimEntryType.
     * 
     * @param mimEntry_title
     */
    public void setMimEntry_title(java.lang.String mimEntry_title) {
        this.mimEntry_title = mimEntry_title;
    }


    /**
     * Gets the mimEntry_copyright value for this MimEntryType.
     * 
     * @return mimEntry_copyright
     */
    public java.lang.String getMimEntry_copyright() {
        return mimEntry_copyright;
    }


    /**
     * Sets the mimEntry_copyright value for this MimEntryType.
     * 
     * @param mimEntry_copyright
     */
    public void setMimEntry_copyright(java.lang.String mimEntry_copyright) {
        this.mimEntry_copyright = mimEntry_copyright;
    }


    /**
     * Gets the mimEntry_symbol value for this MimEntryType.
     * 
     * @return mimEntry_symbol
     */
    public java.lang.String getMimEntry_symbol() {
        return mimEntry_symbol;
    }


    /**
     * Sets the mimEntry_symbol value for this MimEntryType.
     * 
     * @param mimEntry_symbol
     */
    public void setMimEntry_symbol(java.lang.String mimEntry_symbol) {
        this.mimEntry_symbol = mimEntry_symbol;
    }


    /**
     * Gets the mimEntry_locus value for this MimEntryType.
     * 
     * @return mimEntry_locus
     */
    public java.lang.String getMimEntry_locus() {
        return mimEntry_locus;
    }


    /**
     * Sets the mimEntry_locus value for this MimEntryType.
     * 
     * @param mimEntry_locus
     */
    public void setMimEntry_locus(java.lang.String mimEntry_locus) {
        this.mimEntry_locus = mimEntry_locus;
    }


    /**
     * Gets the mimEntry_synonyms value for this MimEntryType.
     * 
     * @return mimEntry_synonyms
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimEntry_synonymsType getMimEntry_synonyms() {
        return mimEntry_synonyms;
    }


    /**
     * Sets the mimEntry_synonyms value for this MimEntryType.
     * 
     * @param mimEntry_synonyms
     */
    public void setMimEntry_synonyms(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimEntry_synonymsType mimEntry_synonyms) {
        this.mimEntry_synonyms = mimEntry_synonyms;
    }


    /**
     * Gets the mimEntry_aliases value for this MimEntryType.
     * 
     * @return mimEntry_aliases
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimEntry_aliasesType getMimEntry_aliases() {
        return mimEntry_aliases;
    }


    /**
     * Sets the mimEntry_aliases value for this MimEntryType.
     * 
     * @param mimEntry_aliases
     */
    public void setMimEntry_aliases(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimEntry_aliasesType mimEntry_aliases) {
        this.mimEntry_aliases = mimEntry_aliases;
    }


    /**
     * Gets the mimEntry_included value for this MimEntryType.
     * 
     * @return mimEntry_included
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimEntry_includedType getMimEntry_included() {
        return mimEntry_included;
    }


    /**
     * Sets the mimEntry_included value for this MimEntryType.
     * 
     * @param mimEntry_included
     */
    public void setMimEntry_included(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimEntry_includedType mimEntry_included) {
        this.mimEntry_included = mimEntry_included;
    }


    /**
     * Gets the mimEntry_seeAlso value for this MimEntryType.
     * 
     * @return mimEntry_seeAlso
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimEntry_seeAlsoType getMimEntry_seeAlso() {
        return mimEntry_seeAlso;
    }


    /**
     * Sets the mimEntry_seeAlso value for this MimEntryType.
     * 
     * @param mimEntry_seeAlso
     */
    public void setMimEntry_seeAlso(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimEntry_seeAlsoType mimEntry_seeAlso) {
        this.mimEntry_seeAlso = mimEntry_seeAlso;
    }


    /**
     * Gets the mimEntry_text value for this MimEntryType.
     * 
     * @return mimEntry_text
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimEntry_textType getMimEntry_text() {
        return mimEntry_text;
    }


    /**
     * Sets the mimEntry_text value for this MimEntryType.
     * 
     * @param mimEntry_text
     */
    public void setMimEntry_text(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimEntry_textType mimEntry_text) {
        this.mimEntry_text = mimEntry_text;
    }


    /**
     * Gets the mimEntry_textfields value for this MimEntryType.
     * 
     * @return mimEntry_textfields
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimEntry_textfieldsType getMimEntry_textfields() {
        return mimEntry_textfields;
    }


    /**
     * Sets the mimEntry_textfields value for this MimEntryType.
     * 
     * @param mimEntry_textfields
     */
    public void setMimEntry_textfields(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimEntry_textfieldsType mimEntry_textfields) {
        this.mimEntry_textfields = mimEntry_textfields;
    }


    /**
     * Gets the mimEntry_hasSummary value for this MimEntryType.
     * 
     * @return mimEntry_hasSummary
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimEntry_hasSummaryType getMimEntry_hasSummary() {
        return mimEntry_hasSummary;
    }


    /**
     * Sets the mimEntry_hasSummary value for this MimEntryType.
     * 
     * @param mimEntry_hasSummary
     */
    public void setMimEntry_hasSummary(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimEntry_hasSummaryType mimEntry_hasSummary) {
        this.mimEntry_hasSummary = mimEntry_hasSummary;
    }


    /**
     * Gets the mimEntry_summary value for this MimEntryType.
     * 
     * @return mimEntry_summary
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimEntry_summaryType getMimEntry_summary() {
        return mimEntry_summary;
    }


    /**
     * Sets the mimEntry_summary value for this MimEntryType.
     * 
     * @param mimEntry_summary
     */
    public void setMimEntry_summary(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimEntry_summaryType mimEntry_summary) {
        this.mimEntry_summary = mimEntry_summary;
    }


    /**
     * Gets the mimEntry_summaryAttribution value for this MimEntryType.
     * 
     * @return mimEntry_summaryAttribution
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimEntry_summaryAttributionType getMimEntry_summaryAttribution() {
        return mimEntry_summaryAttribution;
    }


    /**
     * Sets the mimEntry_summaryAttribution value for this MimEntryType.
     * 
     * @param mimEntry_summaryAttribution
     */
    public void setMimEntry_summaryAttribution(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimEntry_summaryAttributionType mimEntry_summaryAttribution) {
        this.mimEntry_summaryAttribution = mimEntry_summaryAttribution;
    }


    /**
     * Gets the mimEntry_summaryEditHistory value for this MimEntryType.
     * 
     * @return mimEntry_summaryEditHistory
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimEntry_summaryEditHistoryType getMimEntry_summaryEditHistory() {
        return mimEntry_summaryEditHistory;
    }


    /**
     * Sets the mimEntry_summaryEditHistory value for this MimEntryType.
     * 
     * @param mimEntry_summaryEditHistory
     */
    public void setMimEntry_summaryEditHistory(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimEntry_summaryEditHistoryType mimEntry_summaryEditHistory) {
        this.mimEntry_summaryEditHistory = mimEntry_summaryEditHistory;
    }


    /**
     * Gets the mimEntry_summaryCreationDate value for this MimEntryType.
     * 
     * @return mimEntry_summaryCreationDate
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimEntry_summaryCreationDateType getMimEntry_summaryCreationDate() {
        return mimEntry_summaryCreationDate;
    }


    /**
     * Sets the mimEntry_summaryCreationDate value for this MimEntryType.
     * 
     * @param mimEntry_summaryCreationDate
     */
    public void setMimEntry_summaryCreationDate(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimEntry_summaryCreationDateType mimEntry_summaryCreationDate) {
        this.mimEntry_summaryCreationDate = mimEntry_summaryCreationDate;
    }


    /**
     * Gets the mimEntry_allelicVariants value for this MimEntryType.
     * 
     * @return mimEntry_allelicVariants
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimEntry_allelicVariantsType getMimEntry_allelicVariants() {
        return mimEntry_allelicVariants;
    }


    /**
     * Sets the mimEntry_allelicVariants value for this MimEntryType.
     * 
     * @param mimEntry_allelicVariants
     */
    public void setMimEntry_allelicVariants(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimEntry_allelicVariantsType mimEntry_allelicVariants) {
        this.mimEntry_allelicVariants = mimEntry_allelicVariants;
    }


    /**
     * Gets the mimEntry_hasSynopsis value for this MimEntryType.
     * 
     * @return mimEntry_hasSynopsis
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimEntry_hasSynopsisType getMimEntry_hasSynopsis() {
        return mimEntry_hasSynopsis;
    }


    /**
     * Sets the mimEntry_hasSynopsis value for this MimEntryType.
     * 
     * @param mimEntry_hasSynopsis
     */
    public void setMimEntry_hasSynopsis(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimEntry_hasSynopsisType mimEntry_hasSynopsis) {
        this.mimEntry_hasSynopsis = mimEntry_hasSynopsis;
    }


    /**
     * Gets the mimEntry_clinicalSynopsis value for this MimEntryType.
     * 
     * @return mimEntry_clinicalSynopsis
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimEntry_clinicalSynopsisType getMimEntry_clinicalSynopsis() {
        return mimEntry_clinicalSynopsis;
    }


    /**
     * Sets the mimEntry_clinicalSynopsis value for this MimEntryType.
     * 
     * @param mimEntry_clinicalSynopsis
     */
    public void setMimEntry_clinicalSynopsis(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimEntry_clinicalSynopsisType mimEntry_clinicalSynopsis) {
        this.mimEntry_clinicalSynopsis = mimEntry_clinicalSynopsis;
    }


    /**
     * Gets the mimEntry_synopsisAttribution value for this MimEntryType.
     * 
     * @return mimEntry_synopsisAttribution
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimEntry_synopsisAttributionType getMimEntry_synopsisAttribution() {
        return mimEntry_synopsisAttribution;
    }


    /**
     * Sets the mimEntry_synopsisAttribution value for this MimEntryType.
     * 
     * @param mimEntry_synopsisAttribution
     */
    public void setMimEntry_synopsisAttribution(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimEntry_synopsisAttributionType mimEntry_synopsisAttribution) {
        this.mimEntry_synopsisAttribution = mimEntry_synopsisAttribution;
    }


    /**
     * Gets the mimEntry_synopsisEditHistory value for this MimEntryType.
     * 
     * @return mimEntry_synopsisEditHistory
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimEntry_synopsisEditHistoryType getMimEntry_synopsisEditHistory() {
        return mimEntry_synopsisEditHistory;
    }


    /**
     * Sets the mimEntry_synopsisEditHistory value for this MimEntryType.
     * 
     * @param mimEntry_synopsisEditHistory
     */
    public void setMimEntry_synopsisEditHistory(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimEntry_synopsisEditHistoryType mimEntry_synopsisEditHistory) {
        this.mimEntry_synopsisEditHistory = mimEntry_synopsisEditHistory;
    }


    /**
     * Gets the mimEntry_synopsisCreationDate value for this MimEntryType.
     * 
     * @return mimEntry_synopsisCreationDate
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimEntry_synopsisCreationDateType getMimEntry_synopsisCreationDate() {
        return mimEntry_synopsisCreationDate;
    }


    /**
     * Sets the mimEntry_synopsisCreationDate value for this MimEntryType.
     * 
     * @param mimEntry_synopsisCreationDate
     */
    public void setMimEntry_synopsisCreationDate(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimEntry_synopsisCreationDateType mimEntry_synopsisCreationDate) {
        this.mimEntry_synopsisCreationDate = mimEntry_synopsisCreationDate;
    }


    /**
     * Gets the mimEntry_editHistory value for this MimEntryType.
     * 
     * @return mimEntry_editHistory
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimEntry_editHistoryType getMimEntry_editHistory() {
        return mimEntry_editHistory;
    }


    /**
     * Sets the mimEntry_editHistory value for this MimEntryType.
     * 
     * @param mimEntry_editHistory
     */
    public void setMimEntry_editHistory(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimEntry_editHistoryType mimEntry_editHistory) {
        this.mimEntry_editHistory = mimEntry_editHistory;
    }


    /**
     * Gets the mimEntry_creationDate value for this MimEntryType.
     * 
     * @return mimEntry_creationDate
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimEntry_creationDateType getMimEntry_creationDate() {
        return mimEntry_creationDate;
    }


    /**
     * Sets the mimEntry_creationDate value for this MimEntryType.
     * 
     * @param mimEntry_creationDate
     */
    public void setMimEntry_creationDate(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimEntry_creationDateType mimEntry_creationDate) {
        this.mimEntry_creationDate = mimEntry_creationDate;
    }


    /**
     * Gets the mimEntry_references value for this MimEntryType.
     * 
     * @return mimEntry_references
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimEntry_referencesType getMimEntry_references() {
        return mimEntry_references;
    }


    /**
     * Sets the mimEntry_references value for this MimEntryType.
     * 
     * @param mimEntry_references
     */
    public void setMimEntry_references(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimEntry_referencesType mimEntry_references) {
        this.mimEntry_references = mimEntry_references;
    }


    /**
     * Gets the mimEntry_attribution value for this MimEntryType.
     * 
     * @return mimEntry_attribution
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimEntry_attributionType getMimEntry_attribution() {
        return mimEntry_attribution;
    }


    /**
     * Sets the mimEntry_attribution value for this MimEntryType.
     * 
     * @param mimEntry_attribution
     */
    public void setMimEntry_attribution(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimEntry_attributionType mimEntry_attribution) {
        this.mimEntry_attribution = mimEntry_attribution;
    }


    /**
     * Gets the mimEntry_numGeneMaps value for this MimEntryType.
     * 
     * @return mimEntry_numGeneMaps
     */
    public java.lang.String getMimEntry_numGeneMaps() {
        return mimEntry_numGeneMaps;
    }


    /**
     * Sets the mimEntry_numGeneMaps value for this MimEntryType.
     * 
     * @param mimEntry_numGeneMaps
     */
    public void setMimEntry_numGeneMaps(java.lang.String mimEntry_numGeneMaps) {
        this.mimEntry_numGeneMaps = mimEntry_numGeneMaps;
    }


    /**
     * Gets the mimEntry_medlineLinks value for this MimEntryType.
     * 
     * @return mimEntry_medlineLinks
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimEntry_medlineLinksType getMimEntry_medlineLinks() {
        return mimEntry_medlineLinks;
    }


    /**
     * Sets the mimEntry_medlineLinks value for this MimEntryType.
     * 
     * @param mimEntry_medlineLinks
     */
    public void setMimEntry_medlineLinks(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimEntry_medlineLinksType mimEntry_medlineLinks) {
        this.mimEntry_medlineLinks = mimEntry_medlineLinks;
    }


    /**
     * Gets the mimEntry_proteinLinks value for this MimEntryType.
     * 
     * @return mimEntry_proteinLinks
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimEntry_proteinLinksType getMimEntry_proteinLinks() {
        return mimEntry_proteinLinks;
    }


    /**
     * Sets the mimEntry_proteinLinks value for this MimEntryType.
     * 
     * @param mimEntry_proteinLinks
     */
    public void setMimEntry_proteinLinks(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimEntry_proteinLinksType mimEntry_proteinLinks) {
        this.mimEntry_proteinLinks = mimEntry_proteinLinks;
    }


    /**
     * Gets the mimEntry_nucleotideLinks value for this MimEntryType.
     * 
     * @return mimEntry_nucleotideLinks
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimEntry_nucleotideLinksType getMimEntry_nucleotideLinks() {
        return mimEntry_nucleotideLinks;
    }


    /**
     * Sets the mimEntry_nucleotideLinks value for this MimEntryType.
     * 
     * @param mimEntry_nucleotideLinks
     */
    public void setMimEntry_nucleotideLinks(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimEntry_nucleotideLinksType mimEntry_nucleotideLinks) {
        this.mimEntry_nucleotideLinks = mimEntry_nucleotideLinks;
    }


    /**
     * Gets the mimEntry_structureLinks value for this MimEntryType.
     * 
     * @return mimEntry_structureLinks
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimEntry_structureLinksType getMimEntry_structureLinks() {
        return mimEntry_structureLinks;
    }


    /**
     * Sets the mimEntry_structureLinks value for this MimEntryType.
     * 
     * @param mimEntry_structureLinks
     */
    public void setMimEntry_structureLinks(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimEntry_structureLinksType mimEntry_structureLinks) {
        this.mimEntry_structureLinks = mimEntry_structureLinks;
    }


    /**
     * Gets the mimEntry_genomeLinks value for this MimEntryType.
     * 
     * @return mimEntry_genomeLinks
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimEntry_genomeLinksType getMimEntry_genomeLinks() {
        return mimEntry_genomeLinks;
    }


    /**
     * Sets the mimEntry_genomeLinks value for this MimEntryType.
     * 
     * @param mimEntry_genomeLinks
     */
    public void setMimEntry_genomeLinks(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimEntry_genomeLinksType mimEntry_genomeLinks) {
        this.mimEntry_genomeLinks = mimEntry_genomeLinks;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MimEntryType)) return false;
        MimEntryType other = (MimEntryType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.mimEntry_mimNumber==null && other.getMimEntry_mimNumber()==null) || 
             (this.mimEntry_mimNumber!=null &&
              this.mimEntry_mimNumber.equals(other.getMimEntry_mimNumber()))) &&
            ((this.mimEntry_mimType==null && other.getMimEntry_mimType()==null) || 
             (this.mimEntry_mimType!=null &&
              this.mimEntry_mimType.equals(other.getMimEntry_mimType()))) &&
            ((this.mimEntry_title==null && other.getMimEntry_title()==null) || 
             (this.mimEntry_title!=null &&
              this.mimEntry_title.equals(other.getMimEntry_title()))) &&
            ((this.mimEntry_copyright==null && other.getMimEntry_copyright()==null) || 
             (this.mimEntry_copyright!=null &&
              this.mimEntry_copyright.equals(other.getMimEntry_copyright()))) &&
            ((this.mimEntry_symbol==null && other.getMimEntry_symbol()==null) || 
             (this.mimEntry_symbol!=null &&
              this.mimEntry_symbol.equals(other.getMimEntry_symbol()))) &&
            ((this.mimEntry_locus==null && other.getMimEntry_locus()==null) || 
             (this.mimEntry_locus!=null &&
              this.mimEntry_locus.equals(other.getMimEntry_locus()))) &&
            ((this.mimEntry_synonyms==null && other.getMimEntry_synonyms()==null) || 
             (this.mimEntry_synonyms!=null &&
              this.mimEntry_synonyms.equals(other.getMimEntry_synonyms()))) &&
            ((this.mimEntry_aliases==null && other.getMimEntry_aliases()==null) || 
             (this.mimEntry_aliases!=null &&
              this.mimEntry_aliases.equals(other.getMimEntry_aliases()))) &&
            ((this.mimEntry_included==null && other.getMimEntry_included()==null) || 
             (this.mimEntry_included!=null &&
              this.mimEntry_included.equals(other.getMimEntry_included()))) &&
            ((this.mimEntry_seeAlso==null && other.getMimEntry_seeAlso()==null) || 
             (this.mimEntry_seeAlso!=null &&
              this.mimEntry_seeAlso.equals(other.getMimEntry_seeAlso()))) &&
            ((this.mimEntry_text==null && other.getMimEntry_text()==null) || 
             (this.mimEntry_text!=null &&
              this.mimEntry_text.equals(other.getMimEntry_text()))) &&
            ((this.mimEntry_textfields==null && other.getMimEntry_textfields()==null) || 
             (this.mimEntry_textfields!=null &&
              this.mimEntry_textfields.equals(other.getMimEntry_textfields()))) &&
            ((this.mimEntry_hasSummary==null && other.getMimEntry_hasSummary()==null) || 
             (this.mimEntry_hasSummary!=null &&
              this.mimEntry_hasSummary.equals(other.getMimEntry_hasSummary()))) &&
            ((this.mimEntry_summary==null && other.getMimEntry_summary()==null) || 
             (this.mimEntry_summary!=null &&
              this.mimEntry_summary.equals(other.getMimEntry_summary()))) &&
            ((this.mimEntry_summaryAttribution==null && other.getMimEntry_summaryAttribution()==null) || 
             (this.mimEntry_summaryAttribution!=null &&
              this.mimEntry_summaryAttribution.equals(other.getMimEntry_summaryAttribution()))) &&
            ((this.mimEntry_summaryEditHistory==null && other.getMimEntry_summaryEditHistory()==null) || 
             (this.mimEntry_summaryEditHistory!=null &&
              this.mimEntry_summaryEditHistory.equals(other.getMimEntry_summaryEditHistory()))) &&
            ((this.mimEntry_summaryCreationDate==null && other.getMimEntry_summaryCreationDate()==null) || 
             (this.mimEntry_summaryCreationDate!=null &&
              this.mimEntry_summaryCreationDate.equals(other.getMimEntry_summaryCreationDate()))) &&
            ((this.mimEntry_allelicVariants==null && other.getMimEntry_allelicVariants()==null) || 
             (this.mimEntry_allelicVariants!=null &&
              this.mimEntry_allelicVariants.equals(other.getMimEntry_allelicVariants()))) &&
            ((this.mimEntry_hasSynopsis==null && other.getMimEntry_hasSynopsis()==null) || 
             (this.mimEntry_hasSynopsis!=null &&
              this.mimEntry_hasSynopsis.equals(other.getMimEntry_hasSynopsis()))) &&
            ((this.mimEntry_clinicalSynopsis==null && other.getMimEntry_clinicalSynopsis()==null) || 
             (this.mimEntry_clinicalSynopsis!=null &&
              this.mimEntry_clinicalSynopsis.equals(other.getMimEntry_clinicalSynopsis()))) &&
            ((this.mimEntry_synopsisAttribution==null && other.getMimEntry_synopsisAttribution()==null) || 
             (this.mimEntry_synopsisAttribution!=null &&
              this.mimEntry_synopsisAttribution.equals(other.getMimEntry_synopsisAttribution()))) &&
            ((this.mimEntry_synopsisEditHistory==null && other.getMimEntry_synopsisEditHistory()==null) || 
             (this.mimEntry_synopsisEditHistory!=null &&
              this.mimEntry_synopsisEditHistory.equals(other.getMimEntry_synopsisEditHistory()))) &&
            ((this.mimEntry_synopsisCreationDate==null && other.getMimEntry_synopsisCreationDate()==null) || 
             (this.mimEntry_synopsisCreationDate!=null &&
              this.mimEntry_synopsisCreationDate.equals(other.getMimEntry_synopsisCreationDate()))) &&
            ((this.mimEntry_editHistory==null && other.getMimEntry_editHistory()==null) || 
             (this.mimEntry_editHistory!=null &&
              this.mimEntry_editHistory.equals(other.getMimEntry_editHistory()))) &&
            ((this.mimEntry_creationDate==null && other.getMimEntry_creationDate()==null) || 
             (this.mimEntry_creationDate!=null &&
              this.mimEntry_creationDate.equals(other.getMimEntry_creationDate()))) &&
            ((this.mimEntry_references==null && other.getMimEntry_references()==null) || 
             (this.mimEntry_references!=null &&
              this.mimEntry_references.equals(other.getMimEntry_references()))) &&
            ((this.mimEntry_attribution==null && other.getMimEntry_attribution()==null) || 
             (this.mimEntry_attribution!=null &&
              this.mimEntry_attribution.equals(other.getMimEntry_attribution()))) &&
            ((this.mimEntry_numGeneMaps==null && other.getMimEntry_numGeneMaps()==null) || 
             (this.mimEntry_numGeneMaps!=null &&
              this.mimEntry_numGeneMaps.equals(other.getMimEntry_numGeneMaps()))) &&
            ((this.mimEntry_medlineLinks==null && other.getMimEntry_medlineLinks()==null) || 
             (this.mimEntry_medlineLinks!=null &&
              this.mimEntry_medlineLinks.equals(other.getMimEntry_medlineLinks()))) &&
            ((this.mimEntry_proteinLinks==null && other.getMimEntry_proteinLinks()==null) || 
             (this.mimEntry_proteinLinks!=null &&
              this.mimEntry_proteinLinks.equals(other.getMimEntry_proteinLinks()))) &&
            ((this.mimEntry_nucleotideLinks==null && other.getMimEntry_nucleotideLinks()==null) || 
             (this.mimEntry_nucleotideLinks!=null &&
              this.mimEntry_nucleotideLinks.equals(other.getMimEntry_nucleotideLinks()))) &&
            ((this.mimEntry_structureLinks==null && other.getMimEntry_structureLinks()==null) || 
             (this.mimEntry_structureLinks!=null &&
              this.mimEntry_structureLinks.equals(other.getMimEntry_structureLinks()))) &&
            ((this.mimEntry_genomeLinks==null && other.getMimEntry_genomeLinks()==null) || 
             (this.mimEntry_genomeLinks!=null &&
              this.mimEntry_genomeLinks.equals(other.getMimEntry_genomeLinks())));
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
        if (getMimEntry_mimNumber() != null) {
            _hashCode += getMimEntry_mimNumber().hashCode();
        }
        if (getMimEntry_mimType() != null) {
            _hashCode += getMimEntry_mimType().hashCode();
        }
        if (getMimEntry_title() != null) {
            _hashCode += getMimEntry_title().hashCode();
        }
        if (getMimEntry_copyright() != null) {
            _hashCode += getMimEntry_copyright().hashCode();
        }
        if (getMimEntry_symbol() != null) {
            _hashCode += getMimEntry_symbol().hashCode();
        }
        if (getMimEntry_locus() != null) {
            _hashCode += getMimEntry_locus().hashCode();
        }
        if (getMimEntry_synonyms() != null) {
            _hashCode += getMimEntry_synonyms().hashCode();
        }
        if (getMimEntry_aliases() != null) {
            _hashCode += getMimEntry_aliases().hashCode();
        }
        if (getMimEntry_included() != null) {
            _hashCode += getMimEntry_included().hashCode();
        }
        if (getMimEntry_seeAlso() != null) {
            _hashCode += getMimEntry_seeAlso().hashCode();
        }
        if (getMimEntry_text() != null) {
            _hashCode += getMimEntry_text().hashCode();
        }
        if (getMimEntry_textfields() != null) {
            _hashCode += getMimEntry_textfields().hashCode();
        }
        if (getMimEntry_hasSummary() != null) {
            _hashCode += getMimEntry_hasSummary().hashCode();
        }
        if (getMimEntry_summary() != null) {
            _hashCode += getMimEntry_summary().hashCode();
        }
        if (getMimEntry_summaryAttribution() != null) {
            _hashCode += getMimEntry_summaryAttribution().hashCode();
        }
        if (getMimEntry_summaryEditHistory() != null) {
            _hashCode += getMimEntry_summaryEditHistory().hashCode();
        }
        if (getMimEntry_summaryCreationDate() != null) {
            _hashCode += getMimEntry_summaryCreationDate().hashCode();
        }
        if (getMimEntry_allelicVariants() != null) {
            _hashCode += getMimEntry_allelicVariants().hashCode();
        }
        if (getMimEntry_hasSynopsis() != null) {
            _hashCode += getMimEntry_hasSynopsis().hashCode();
        }
        if (getMimEntry_clinicalSynopsis() != null) {
            _hashCode += getMimEntry_clinicalSynopsis().hashCode();
        }
        if (getMimEntry_synopsisAttribution() != null) {
            _hashCode += getMimEntry_synopsisAttribution().hashCode();
        }
        if (getMimEntry_synopsisEditHistory() != null) {
            _hashCode += getMimEntry_synopsisEditHistory().hashCode();
        }
        if (getMimEntry_synopsisCreationDate() != null) {
            _hashCode += getMimEntry_synopsisCreationDate().hashCode();
        }
        if (getMimEntry_editHistory() != null) {
            _hashCode += getMimEntry_editHistory().hashCode();
        }
        if (getMimEntry_creationDate() != null) {
            _hashCode += getMimEntry_creationDate().hashCode();
        }
        if (getMimEntry_references() != null) {
            _hashCode += getMimEntry_references().hashCode();
        }
        if (getMimEntry_attribution() != null) {
            _hashCode += getMimEntry_attribution().hashCode();
        }
        if (getMimEntry_numGeneMaps() != null) {
            _hashCode += getMimEntry_numGeneMaps().hashCode();
        }
        if (getMimEntry_medlineLinks() != null) {
            _hashCode += getMimEntry_medlineLinks().hashCode();
        }
        if (getMimEntry_proteinLinks() != null) {
            _hashCode += getMimEntry_proteinLinks().hashCode();
        }
        if (getMimEntry_nucleotideLinks() != null) {
            _hashCode += getMimEntry_nucleotideLinks().hashCode();
        }
        if (getMimEntry_structureLinks() != null) {
            _hashCode += getMimEntry_structureLinks().hashCode();
        }
        if (getMimEntry_genomeLinks() != null) {
            _hashCode += getMimEntry_genomeLinks().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MimEntryType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-entryType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mimEntry_mimNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-entry_mimNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mimEntry_mimType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-entry_mimType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-entry_mimTypeType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mimEntry_title");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-entry_title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mimEntry_copyright");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-entry_copyright"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mimEntry_symbol");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-entry_symbol"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mimEntry_locus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-entry_locus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mimEntry_synonyms");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-entry_synonyms"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-entry_synonymsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mimEntry_aliases");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-entry_aliases"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-entry_aliasesType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mimEntry_included");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-entry_included"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-entry_includedType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mimEntry_seeAlso");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-entry_seeAlso"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-entry_seeAlsoType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mimEntry_text");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-entry_text"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-entry_textType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mimEntry_textfields");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-entry_textfields"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-entry_textfieldsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mimEntry_hasSummary");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-entry_hasSummary"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-entry_hasSummaryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mimEntry_summary");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-entry_summary"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-entry_summaryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mimEntry_summaryAttribution");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-entry_summaryAttribution"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-entry_summaryAttributionType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mimEntry_summaryEditHistory");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-entry_summaryEditHistory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-entry_summaryEditHistoryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mimEntry_summaryCreationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-entry_summaryCreationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-entry_summaryCreationDateType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mimEntry_allelicVariants");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-entry_allelicVariants"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-entry_allelicVariantsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mimEntry_hasSynopsis");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-entry_hasSynopsis"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-entry_hasSynopsisType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mimEntry_clinicalSynopsis");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-entry_clinicalSynopsis"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-entry_clinicalSynopsisType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mimEntry_synopsisAttribution");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-entry_synopsisAttribution"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-entry_synopsisAttributionType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mimEntry_synopsisEditHistory");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-entry_synopsisEditHistory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-entry_synopsisEditHistoryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mimEntry_synopsisCreationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-entry_synopsisCreationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-entry_synopsisCreationDateType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mimEntry_editHistory");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-entry_editHistory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-entry_editHistoryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mimEntry_creationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-entry_creationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-entry_creationDateType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mimEntry_references");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-entry_references"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-entry_referencesType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mimEntry_attribution");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-entry_attribution"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-entry_attributionType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mimEntry_numGeneMaps");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-entry_numGeneMaps"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mimEntry_medlineLinks");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-entry_medlineLinks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-entry_medlineLinksType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mimEntry_proteinLinks");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-entry_proteinLinks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-entry_proteinLinksType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mimEntry_nucleotideLinks");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-entry_nucleotideLinks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-entry_nucleotideLinksType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mimEntry_structureLinks");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-entry_structureLinks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-entry_structureLinksType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mimEntry_genomeLinks");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-entry_genomeLinks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-entry_genomeLinksType"));
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
