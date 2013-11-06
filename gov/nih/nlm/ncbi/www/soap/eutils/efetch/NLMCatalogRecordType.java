/**
 * NLMCatalogRecordType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class NLMCatalogRecordType  implements java.io.Serializable {
    private java.lang.String nlmUniqueID;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.DateCreatedType dateCreated;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.DateRevisedType dateRevised;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.DateAuthorizedType dateAuthorized;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.DateCompletedType dateCompleted;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.DateRevisedMajorType dateRevisedMajor;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.CollaborativePartnerDateType[] collaborativePartnerDate;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.TitleMainType titleMain;

    private java.lang.String medlineTA;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.TitleOtherType[] titleOther;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.AuthorListType authorList;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.InvestigatorListType investigatorList;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ResourceInfoType resourceInfo;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PublicationTypeListType publicationTypeList;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.GenreListType genreList;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PublicationInfoType publicationInfo;

    private java.lang.String[] language;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.LanguageAlternateType[] languageAlternate;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PhysicalDescriptionType physicalDescription;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.AbstractType _abstract;

    private java.lang.String affiliation;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.OtherAbstractType[] otherAbstract;

    private java.lang.String[] contentsNote;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.IndexingSourceListType indexingSourceList;

    private java.lang.String[] NLMIndexNote;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.GeneralNoteType[] generalNote;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.LocalNoteType[] localNote;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PersonalNameSubjectListType personalNameSubjectList;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MeshHeadingListType meshHeadingList;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.OtherSubjectListType[] otherSubjectList;

    private java.lang.String[] spaceFlightMission;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.KeywordListType[] keywordList;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.BroadJournalHeadingListType broadJournalHeadingList;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ChemicalListType chemicalList;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ClassificationType[] classification;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.GovDocClassNumberType[] govDocClassNumber;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ElectronicAccessListType electronicAccessList;

    private java.lang.String[] host;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.LCCNType[] LCCN;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ISBNType[] ISBN;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ISSNType[] ISSN;

    private java.lang.String[] NCBIIssnAlias;

    private java.lang.String[] STRN;

    private java.lang.String[] coden;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.OtherIDType[] otherID;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.AcquisitionInfoListType acquisitionInfoList;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ReportNumberType[] reportNumber;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.NLMCatalogRecordTypeOwner owner;  // attribute

    private java.lang.String status;  // attribute

    public NLMCatalogRecordType() {
    }

    public NLMCatalogRecordType(
           java.lang.String nlmUniqueID,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.DateCreatedType dateCreated,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.DateRevisedType dateRevised,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.DateAuthorizedType dateAuthorized,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.DateCompletedType dateCompleted,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.DateRevisedMajorType dateRevisedMajor,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.CollaborativePartnerDateType[] collaborativePartnerDate,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.TitleMainType titleMain,
           java.lang.String medlineTA,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.TitleOtherType[] titleOther,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.AuthorListType authorList,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.InvestigatorListType investigatorList,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ResourceInfoType resourceInfo,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PublicationTypeListType publicationTypeList,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.GenreListType genreList,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PublicationInfoType publicationInfo,
           java.lang.String[] language,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.LanguageAlternateType[] languageAlternate,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PhysicalDescriptionType physicalDescription,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.AbstractType _abstract,
           java.lang.String affiliation,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.OtherAbstractType[] otherAbstract,
           java.lang.String[] contentsNote,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.IndexingSourceListType indexingSourceList,
           java.lang.String[] NLMIndexNote,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.GeneralNoteType[] generalNote,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.LocalNoteType[] localNote,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PersonalNameSubjectListType personalNameSubjectList,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MeshHeadingListType meshHeadingList,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.OtherSubjectListType[] otherSubjectList,
           java.lang.String[] spaceFlightMission,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.KeywordListType[] keywordList,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.BroadJournalHeadingListType broadJournalHeadingList,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ChemicalListType chemicalList,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ClassificationType[] classification,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.GovDocClassNumberType[] govDocClassNumber,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ElectronicAccessListType electronicAccessList,
           java.lang.String[] host,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.LCCNType[] LCCN,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ISBNType[] ISBN,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ISSNType[] ISSN,
           java.lang.String[] NCBIIssnAlias,
           java.lang.String[] STRN,
           java.lang.String[] coden,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.OtherIDType[] otherID,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.AcquisitionInfoListType acquisitionInfoList,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ReportNumberType[] reportNumber,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.NLMCatalogRecordTypeOwner owner,
           java.lang.String status) {
           this.nlmUniqueID = nlmUniqueID;
           this.dateCreated = dateCreated;
           this.dateRevised = dateRevised;
           this.dateAuthorized = dateAuthorized;
           this.dateCompleted = dateCompleted;
           this.dateRevisedMajor = dateRevisedMajor;
           this.collaborativePartnerDate = collaborativePartnerDate;
           this.titleMain = titleMain;
           this.medlineTA = medlineTA;
           this.titleOther = titleOther;
           this.authorList = authorList;
           this.investigatorList = investigatorList;
           this.resourceInfo = resourceInfo;
           this.publicationTypeList = publicationTypeList;
           this.genreList = genreList;
           this.publicationInfo = publicationInfo;
           this.language = language;
           this.languageAlternate = languageAlternate;
           this.physicalDescription = physicalDescription;
           this._abstract = _abstract;
           this.affiliation = affiliation;
           this.otherAbstract = otherAbstract;
           this.contentsNote = contentsNote;
           this.indexingSourceList = indexingSourceList;
           this.NLMIndexNote = NLMIndexNote;
           this.generalNote = generalNote;
           this.localNote = localNote;
           this.personalNameSubjectList = personalNameSubjectList;
           this.meshHeadingList = meshHeadingList;
           this.otherSubjectList = otherSubjectList;
           this.spaceFlightMission = spaceFlightMission;
           this.keywordList = keywordList;
           this.broadJournalHeadingList = broadJournalHeadingList;
           this.chemicalList = chemicalList;
           this.classification = classification;
           this.govDocClassNumber = govDocClassNumber;
           this.electronicAccessList = electronicAccessList;
           this.host = host;
           this.LCCN = LCCN;
           this.ISBN = ISBN;
           this.ISSN = ISSN;
           this.NCBIIssnAlias = NCBIIssnAlias;
           this.STRN = STRN;
           this.coden = coden;
           this.otherID = otherID;
           this.acquisitionInfoList = acquisitionInfoList;
           this.reportNumber = reportNumber;
           this.owner = owner;
           this.status = status;
    }


    /**
     * Gets the nlmUniqueID value for this NLMCatalogRecordType.
     * 
     * @return nlmUniqueID
     */
    public java.lang.String getNlmUniqueID() {
        return nlmUniqueID;
    }


    /**
     * Sets the nlmUniqueID value for this NLMCatalogRecordType.
     * 
     * @param nlmUniqueID
     */
    public void setNlmUniqueID(java.lang.String nlmUniqueID) {
        this.nlmUniqueID = nlmUniqueID;
    }


    /**
     * Gets the dateCreated value for this NLMCatalogRecordType.
     * 
     * @return dateCreated
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.DateCreatedType getDateCreated() {
        return dateCreated;
    }


    /**
     * Sets the dateCreated value for this NLMCatalogRecordType.
     * 
     * @param dateCreated
     */
    public void setDateCreated(gov.nih.nlm.ncbi.www.soap.eutils.efetch.DateCreatedType dateCreated) {
        this.dateCreated = dateCreated;
    }


    /**
     * Gets the dateRevised value for this NLMCatalogRecordType.
     * 
     * @return dateRevised
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.DateRevisedType getDateRevised() {
        return dateRevised;
    }


    /**
     * Sets the dateRevised value for this NLMCatalogRecordType.
     * 
     * @param dateRevised
     */
    public void setDateRevised(gov.nih.nlm.ncbi.www.soap.eutils.efetch.DateRevisedType dateRevised) {
        this.dateRevised = dateRevised;
    }


    /**
     * Gets the dateAuthorized value for this NLMCatalogRecordType.
     * 
     * @return dateAuthorized
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.DateAuthorizedType getDateAuthorized() {
        return dateAuthorized;
    }


    /**
     * Sets the dateAuthorized value for this NLMCatalogRecordType.
     * 
     * @param dateAuthorized
     */
    public void setDateAuthorized(gov.nih.nlm.ncbi.www.soap.eutils.efetch.DateAuthorizedType dateAuthorized) {
        this.dateAuthorized = dateAuthorized;
    }


    /**
     * Gets the dateCompleted value for this NLMCatalogRecordType.
     * 
     * @return dateCompleted
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.DateCompletedType getDateCompleted() {
        return dateCompleted;
    }


    /**
     * Sets the dateCompleted value for this NLMCatalogRecordType.
     * 
     * @param dateCompleted
     */
    public void setDateCompleted(gov.nih.nlm.ncbi.www.soap.eutils.efetch.DateCompletedType dateCompleted) {
        this.dateCompleted = dateCompleted;
    }


    /**
     * Gets the dateRevisedMajor value for this NLMCatalogRecordType.
     * 
     * @return dateRevisedMajor
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.DateRevisedMajorType getDateRevisedMajor() {
        return dateRevisedMajor;
    }


    /**
     * Sets the dateRevisedMajor value for this NLMCatalogRecordType.
     * 
     * @param dateRevisedMajor
     */
    public void setDateRevisedMajor(gov.nih.nlm.ncbi.www.soap.eutils.efetch.DateRevisedMajorType dateRevisedMajor) {
        this.dateRevisedMajor = dateRevisedMajor;
    }


    /**
     * Gets the collaborativePartnerDate value for this NLMCatalogRecordType.
     * 
     * @return collaborativePartnerDate
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.CollaborativePartnerDateType[] getCollaborativePartnerDate() {
        return collaborativePartnerDate;
    }


    /**
     * Sets the collaborativePartnerDate value for this NLMCatalogRecordType.
     * 
     * @param collaborativePartnerDate
     */
    public void setCollaborativePartnerDate(gov.nih.nlm.ncbi.www.soap.eutils.efetch.CollaborativePartnerDateType[] collaborativePartnerDate) {
        this.collaborativePartnerDate = collaborativePartnerDate;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.CollaborativePartnerDateType getCollaborativePartnerDate(int i) {
        return this.collaborativePartnerDate[i];
    }

    public void setCollaborativePartnerDate(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.CollaborativePartnerDateType _value) {
        this.collaborativePartnerDate[i] = _value;
    }


    /**
     * Gets the titleMain value for this NLMCatalogRecordType.
     * 
     * @return titleMain
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.TitleMainType getTitleMain() {
        return titleMain;
    }


    /**
     * Sets the titleMain value for this NLMCatalogRecordType.
     * 
     * @param titleMain
     */
    public void setTitleMain(gov.nih.nlm.ncbi.www.soap.eutils.efetch.TitleMainType titleMain) {
        this.titleMain = titleMain;
    }


    /**
     * Gets the medlineTA value for this NLMCatalogRecordType.
     * 
     * @return medlineTA
     */
    public java.lang.String getMedlineTA() {
        return medlineTA;
    }


    /**
     * Sets the medlineTA value for this NLMCatalogRecordType.
     * 
     * @param medlineTA
     */
    public void setMedlineTA(java.lang.String medlineTA) {
        this.medlineTA = medlineTA;
    }


    /**
     * Gets the titleOther value for this NLMCatalogRecordType.
     * 
     * @return titleOther
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.TitleOtherType[] getTitleOther() {
        return titleOther;
    }


    /**
     * Sets the titleOther value for this NLMCatalogRecordType.
     * 
     * @param titleOther
     */
    public void setTitleOther(gov.nih.nlm.ncbi.www.soap.eutils.efetch.TitleOtherType[] titleOther) {
        this.titleOther = titleOther;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.TitleOtherType getTitleOther(int i) {
        return this.titleOther[i];
    }

    public void setTitleOther(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.TitleOtherType _value) {
        this.titleOther[i] = _value;
    }


    /**
     * Gets the authorList value for this NLMCatalogRecordType.
     * 
     * @return authorList
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.AuthorListType getAuthorList() {
        return authorList;
    }


    /**
     * Sets the authorList value for this NLMCatalogRecordType.
     * 
     * @param authorList
     */
    public void setAuthorList(gov.nih.nlm.ncbi.www.soap.eutils.efetch.AuthorListType authorList) {
        this.authorList = authorList;
    }


    /**
     * Gets the investigatorList value for this NLMCatalogRecordType.
     * 
     * @return investigatorList
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.InvestigatorListType getInvestigatorList() {
        return investigatorList;
    }


    /**
     * Sets the investigatorList value for this NLMCatalogRecordType.
     * 
     * @param investigatorList
     */
    public void setInvestigatorList(gov.nih.nlm.ncbi.www.soap.eutils.efetch.InvestigatorListType investigatorList) {
        this.investigatorList = investigatorList;
    }


    /**
     * Gets the resourceInfo value for this NLMCatalogRecordType.
     * 
     * @return resourceInfo
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ResourceInfoType getResourceInfo() {
        return resourceInfo;
    }


    /**
     * Sets the resourceInfo value for this NLMCatalogRecordType.
     * 
     * @param resourceInfo
     */
    public void setResourceInfo(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ResourceInfoType resourceInfo) {
        this.resourceInfo = resourceInfo;
    }


    /**
     * Gets the publicationTypeList value for this NLMCatalogRecordType.
     * 
     * @return publicationTypeList
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PublicationTypeListType getPublicationTypeList() {
        return publicationTypeList;
    }


    /**
     * Sets the publicationTypeList value for this NLMCatalogRecordType.
     * 
     * @param publicationTypeList
     */
    public void setPublicationTypeList(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PublicationTypeListType publicationTypeList) {
        this.publicationTypeList = publicationTypeList;
    }


    /**
     * Gets the genreList value for this NLMCatalogRecordType.
     * 
     * @return genreList
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.GenreListType getGenreList() {
        return genreList;
    }


    /**
     * Sets the genreList value for this NLMCatalogRecordType.
     * 
     * @param genreList
     */
    public void setGenreList(gov.nih.nlm.ncbi.www.soap.eutils.efetch.GenreListType genreList) {
        this.genreList = genreList;
    }


    /**
     * Gets the publicationInfo value for this NLMCatalogRecordType.
     * 
     * @return publicationInfo
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PublicationInfoType getPublicationInfo() {
        return publicationInfo;
    }


    /**
     * Sets the publicationInfo value for this NLMCatalogRecordType.
     * 
     * @param publicationInfo
     */
    public void setPublicationInfo(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PublicationInfoType publicationInfo) {
        this.publicationInfo = publicationInfo;
    }


    /**
     * Gets the language value for this NLMCatalogRecordType.
     * 
     * @return language
     */
    public java.lang.String[] getLanguage() {
        return language;
    }


    /**
     * Sets the language value for this NLMCatalogRecordType.
     * 
     * @param language
     */
    public void setLanguage(java.lang.String[] language) {
        this.language = language;
    }

    public java.lang.String getLanguage(int i) {
        return this.language[i];
    }

    public void setLanguage(int i, java.lang.String _value) {
        this.language[i] = _value;
    }


    /**
     * Gets the languageAlternate value for this NLMCatalogRecordType.
     * 
     * @return languageAlternate
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.LanguageAlternateType[] getLanguageAlternate() {
        return languageAlternate;
    }


    /**
     * Sets the languageAlternate value for this NLMCatalogRecordType.
     * 
     * @param languageAlternate
     */
    public void setLanguageAlternate(gov.nih.nlm.ncbi.www.soap.eutils.efetch.LanguageAlternateType[] languageAlternate) {
        this.languageAlternate = languageAlternate;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.LanguageAlternateType getLanguageAlternate(int i) {
        return this.languageAlternate[i];
    }

    public void setLanguageAlternate(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.LanguageAlternateType _value) {
        this.languageAlternate[i] = _value;
    }


    /**
     * Gets the physicalDescription value for this NLMCatalogRecordType.
     * 
     * @return physicalDescription
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PhysicalDescriptionType getPhysicalDescription() {
        return physicalDescription;
    }


    /**
     * Sets the physicalDescription value for this NLMCatalogRecordType.
     * 
     * @param physicalDescription
     */
    public void setPhysicalDescription(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PhysicalDescriptionType physicalDescription) {
        this.physicalDescription = physicalDescription;
    }


    /**
     * Gets the _abstract value for this NLMCatalogRecordType.
     * 
     * @return _abstract
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.AbstractType get_abstract() {
        return _abstract;
    }


    /**
     * Sets the _abstract value for this NLMCatalogRecordType.
     * 
     * @param _abstract
     */
    public void set_abstract(gov.nih.nlm.ncbi.www.soap.eutils.efetch.AbstractType _abstract) {
        this._abstract = _abstract;
    }


    /**
     * Gets the affiliation value for this NLMCatalogRecordType.
     * 
     * @return affiliation
     */
    public java.lang.String getAffiliation() {
        return affiliation;
    }


    /**
     * Sets the affiliation value for this NLMCatalogRecordType.
     * 
     * @param affiliation
     */
    public void setAffiliation(java.lang.String affiliation) {
        this.affiliation = affiliation;
    }


    /**
     * Gets the otherAbstract value for this NLMCatalogRecordType.
     * 
     * @return otherAbstract
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.OtherAbstractType[] getOtherAbstract() {
        return otherAbstract;
    }


    /**
     * Sets the otherAbstract value for this NLMCatalogRecordType.
     * 
     * @param otherAbstract
     */
    public void setOtherAbstract(gov.nih.nlm.ncbi.www.soap.eutils.efetch.OtherAbstractType[] otherAbstract) {
        this.otherAbstract = otherAbstract;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.OtherAbstractType getOtherAbstract(int i) {
        return this.otherAbstract[i];
    }

    public void setOtherAbstract(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.OtherAbstractType _value) {
        this.otherAbstract[i] = _value;
    }


    /**
     * Gets the contentsNote value for this NLMCatalogRecordType.
     * 
     * @return contentsNote
     */
    public java.lang.String[] getContentsNote() {
        return contentsNote;
    }


    /**
     * Sets the contentsNote value for this NLMCatalogRecordType.
     * 
     * @param contentsNote
     */
    public void setContentsNote(java.lang.String[] contentsNote) {
        this.contentsNote = contentsNote;
    }

    public java.lang.String getContentsNote(int i) {
        return this.contentsNote[i];
    }

    public void setContentsNote(int i, java.lang.String _value) {
        this.contentsNote[i] = _value;
    }


    /**
     * Gets the indexingSourceList value for this NLMCatalogRecordType.
     * 
     * @return indexingSourceList
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.IndexingSourceListType getIndexingSourceList() {
        return indexingSourceList;
    }


    /**
     * Sets the indexingSourceList value for this NLMCatalogRecordType.
     * 
     * @param indexingSourceList
     */
    public void setIndexingSourceList(gov.nih.nlm.ncbi.www.soap.eutils.efetch.IndexingSourceListType indexingSourceList) {
        this.indexingSourceList = indexingSourceList;
    }


    /**
     * Gets the NLMIndexNote value for this NLMCatalogRecordType.
     * 
     * @return NLMIndexNote
     */
    public java.lang.String[] getNLMIndexNote() {
        return NLMIndexNote;
    }


    /**
     * Sets the NLMIndexNote value for this NLMCatalogRecordType.
     * 
     * @param NLMIndexNote
     */
    public void setNLMIndexNote(java.lang.String[] NLMIndexNote) {
        this.NLMIndexNote = NLMIndexNote;
    }

    public java.lang.String getNLMIndexNote(int i) {
        return this.NLMIndexNote[i];
    }

    public void setNLMIndexNote(int i, java.lang.String _value) {
        this.NLMIndexNote[i] = _value;
    }


    /**
     * Gets the generalNote value for this NLMCatalogRecordType.
     * 
     * @return generalNote
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.GeneralNoteType[] getGeneralNote() {
        return generalNote;
    }


    /**
     * Sets the generalNote value for this NLMCatalogRecordType.
     * 
     * @param generalNote
     */
    public void setGeneralNote(gov.nih.nlm.ncbi.www.soap.eutils.efetch.GeneralNoteType[] generalNote) {
        this.generalNote = generalNote;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.GeneralNoteType getGeneralNote(int i) {
        return this.generalNote[i];
    }

    public void setGeneralNote(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.GeneralNoteType _value) {
        this.generalNote[i] = _value;
    }


    /**
     * Gets the localNote value for this NLMCatalogRecordType.
     * 
     * @return localNote
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.LocalNoteType[] getLocalNote() {
        return localNote;
    }


    /**
     * Sets the localNote value for this NLMCatalogRecordType.
     * 
     * @param localNote
     */
    public void setLocalNote(gov.nih.nlm.ncbi.www.soap.eutils.efetch.LocalNoteType[] localNote) {
        this.localNote = localNote;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.LocalNoteType getLocalNote(int i) {
        return this.localNote[i];
    }

    public void setLocalNote(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.LocalNoteType _value) {
        this.localNote[i] = _value;
    }


    /**
     * Gets the personalNameSubjectList value for this NLMCatalogRecordType.
     * 
     * @return personalNameSubjectList
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PersonalNameSubjectListType getPersonalNameSubjectList() {
        return personalNameSubjectList;
    }


    /**
     * Sets the personalNameSubjectList value for this NLMCatalogRecordType.
     * 
     * @param personalNameSubjectList
     */
    public void setPersonalNameSubjectList(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PersonalNameSubjectListType personalNameSubjectList) {
        this.personalNameSubjectList = personalNameSubjectList;
    }


    /**
     * Gets the meshHeadingList value for this NLMCatalogRecordType.
     * 
     * @return meshHeadingList
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MeshHeadingListType getMeshHeadingList() {
        return meshHeadingList;
    }


    /**
     * Sets the meshHeadingList value for this NLMCatalogRecordType.
     * 
     * @param meshHeadingList
     */
    public void setMeshHeadingList(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MeshHeadingListType meshHeadingList) {
        this.meshHeadingList = meshHeadingList;
    }


    /**
     * Gets the otherSubjectList value for this NLMCatalogRecordType.
     * 
     * @return otherSubjectList
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.OtherSubjectListType[] getOtherSubjectList() {
        return otherSubjectList;
    }


    /**
     * Sets the otherSubjectList value for this NLMCatalogRecordType.
     * 
     * @param otherSubjectList
     */
    public void setOtherSubjectList(gov.nih.nlm.ncbi.www.soap.eutils.efetch.OtherSubjectListType[] otherSubjectList) {
        this.otherSubjectList = otherSubjectList;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.OtherSubjectListType getOtherSubjectList(int i) {
        return this.otherSubjectList[i];
    }

    public void setOtherSubjectList(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.OtherSubjectListType _value) {
        this.otherSubjectList[i] = _value;
    }


    /**
     * Gets the spaceFlightMission value for this NLMCatalogRecordType.
     * 
     * @return spaceFlightMission
     */
    public java.lang.String[] getSpaceFlightMission() {
        return spaceFlightMission;
    }


    /**
     * Sets the spaceFlightMission value for this NLMCatalogRecordType.
     * 
     * @param spaceFlightMission
     */
    public void setSpaceFlightMission(java.lang.String[] spaceFlightMission) {
        this.spaceFlightMission = spaceFlightMission;
    }

    public java.lang.String getSpaceFlightMission(int i) {
        return this.spaceFlightMission[i];
    }

    public void setSpaceFlightMission(int i, java.lang.String _value) {
        this.spaceFlightMission[i] = _value;
    }


    /**
     * Gets the keywordList value for this NLMCatalogRecordType.
     * 
     * @return keywordList
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.KeywordListType[] getKeywordList() {
        return keywordList;
    }


    /**
     * Sets the keywordList value for this NLMCatalogRecordType.
     * 
     * @param keywordList
     */
    public void setKeywordList(gov.nih.nlm.ncbi.www.soap.eutils.efetch.KeywordListType[] keywordList) {
        this.keywordList = keywordList;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.KeywordListType getKeywordList(int i) {
        return this.keywordList[i];
    }

    public void setKeywordList(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.KeywordListType _value) {
        this.keywordList[i] = _value;
    }


    /**
     * Gets the broadJournalHeadingList value for this NLMCatalogRecordType.
     * 
     * @return broadJournalHeadingList
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.BroadJournalHeadingListType getBroadJournalHeadingList() {
        return broadJournalHeadingList;
    }


    /**
     * Sets the broadJournalHeadingList value for this NLMCatalogRecordType.
     * 
     * @param broadJournalHeadingList
     */
    public void setBroadJournalHeadingList(gov.nih.nlm.ncbi.www.soap.eutils.efetch.BroadJournalHeadingListType broadJournalHeadingList) {
        this.broadJournalHeadingList = broadJournalHeadingList;
    }


    /**
     * Gets the chemicalList value for this NLMCatalogRecordType.
     * 
     * @return chemicalList
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ChemicalListType getChemicalList() {
        return chemicalList;
    }


    /**
     * Sets the chemicalList value for this NLMCatalogRecordType.
     * 
     * @param chemicalList
     */
    public void setChemicalList(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ChemicalListType chemicalList) {
        this.chemicalList = chemicalList;
    }


    /**
     * Gets the classification value for this NLMCatalogRecordType.
     * 
     * @return classification
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ClassificationType[] getClassification() {
        return classification;
    }


    /**
     * Sets the classification value for this NLMCatalogRecordType.
     * 
     * @param classification
     */
    public void setClassification(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ClassificationType[] classification) {
        this.classification = classification;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ClassificationType getClassification(int i) {
        return this.classification[i];
    }

    public void setClassification(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.ClassificationType _value) {
        this.classification[i] = _value;
    }


    /**
     * Gets the govDocClassNumber value for this NLMCatalogRecordType.
     * 
     * @return govDocClassNumber
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.GovDocClassNumberType[] getGovDocClassNumber() {
        return govDocClassNumber;
    }


    /**
     * Sets the govDocClassNumber value for this NLMCatalogRecordType.
     * 
     * @param govDocClassNumber
     */
    public void setGovDocClassNumber(gov.nih.nlm.ncbi.www.soap.eutils.efetch.GovDocClassNumberType[] govDocClassNumber) {
        this.govDocClassNumber = govDocClassNumber;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.GovDocClassNumberType getGovDocClassNumber(int i) {
        return this.govDocClassNumber[i];
    }

    public void setGovDocClassNumber(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.GovDocClassNumberType _value) {
        this.govDocClassNumber[i] = _value;
    }


    /**
     * Gets the electronicAccessList value for this NLMCatalogRecordType.
     * 
     * @return electronicAccessList
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ElectronicAccessListType getElectronicAccessList() {
        return electronicAccessList;
    }


    /**
     * Sets the electronicAccessList value for this NLMCatalogRecordType.
     * 
     * @param electronicAccessList
     */
    public void setElectronicAccessList(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ElectronicAccessListType electronicAccessList) {
        this.electronicAccessList = electronicAccessList;
    }


    /**
     * Gets the host value for this NLMCatalogRecordType.
     * 
     * @return host
     */
    public java.lang.String[] getHost() {
        return host;
    }


    /**
     * Sets the host value for this NLMCatalogRecordType.
     * 
     * @param host
     */
    public void setHost(java.lang.String[] host) {
        this.host = host;
    }

    public java.lang.String getHost(int i) {
        return this.host[i];
    }

    public void setHost(int i, java.lang.String _value) {
        this.host[i] = _value;
    }


    /**
     * Gets the LCCN value for this NLMCatalogRecordType.
     * 
     * @return LCCN
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.LCCNType[] getLCCN() {
        return LCCN;
    }


    /**
     * Sets the LCCN value for this NLMCatalogRecordType.
     * 
     * @param LCCN
     */
    public void setLCCN(gov.nih.nlm.ncbi.www.soap.eutils.efetch.LCCNType[] LCCN) {
        this.LCCN = LCCN;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.LCCNType getLCCN(int i) {
        return this.LCCN[i];
    }

    public void setLCCN(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.LCCNType _value) {
        this.LCCN[i] = _value;
    }


    /**
     * Gets the ISBN value for this NLMCatalogRecordType.
     * 
     * @return ISBN
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ISBNType[] getISBN() {
        return ISBN;
    }


    /**
     * Sets the ISBN value for this NLMCatalogRecordType.
     * 
     * @param ISBN
     */
    public void setISBN(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ISBNType[] ISBN) {
        this.ISBN = ISBN;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ISBNType getISBN(int i) {
        return this.ISBN[i];
    }

    public void setISBN(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.ISBNType _value) {
        this.ISBN[i] = _value;
    }


    /**
     * Gets the ISSN value for this NLMCatalogRecordType.
     * 
     * @return ISSN
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ISSNType[] getISSN() {
        return ISSN;
    }


    /**
     * Sets the ISSN value for this NLMCatalogRecordType.
     * 
     * @param ISSN
     */
    public void setISSN(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ISSNType[] ISSN) {
        this.ISSN = ISSN;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ISSNType getISSN(int i) {
        return this.ISSN[i];
    }

    public void setISSN(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.ISSNType _value) {
        this.ISSN[i] = _value;
    }


    /**
     * Gets the NCBIIssnAlias value for this NLMCatalogRecordType.
     * 
     * @return NCBIIssnAlias
     */
    public java.lang.String[] getNCBIIssnAlias() {
        return NCBIIssnAlias;
    }


    /**
     * Sets the NCBIIssnAlias value for this NLMCatalogRecordType.
     * 
     * @param NCBIIssnAlias
     */
    public void setNCBIIssnAlias(java.lang.String[] NCBIIssnAlias) {
        this.NCBIIssnAlias = NCBIIssnAlias;
    }

    public java.lang.String getNCBIIssnAlias(int i) {
        return this.NCBIIssnAlias[i];
    }

    public void setNCBIIssnAlias(int i, java.lang.String _value) {
        this.NCBIIssnAlias[i] = _value;
    }


    /**
     * Gets the STRN value for this NLMCatalogRecordType.
     * 
     * @return STRN
     */
    public java.lang.String[] getSTRN() {
        return STRN;
    }


    /**
     * Sets the STRN value for this NLMCatalogRecordType.
     * 
     * @param STRN
     */
    public void setSTRN(java.lang.String[] STRN) {
        this.STRN = STRN;
    }

    public java.lang.String getSTRN(int i) {
        return this.STRN[i];
    }

    public void setSTRN(int i, java.lang.String _value) {
        this.STRN[i] = _value;
    }


    /**
     * Gets the coden value for this NLMCatalogRecordType.
     * 
     * @return coden
     */
    public java.lang.String[] getCoden() {
        return coden;
    }


    /**
     * Sets the coden value for this NLMCatalogRecordType.
     * 
     * @param coden
     */
    public void setCoden(java.lang.String[] coden) {
        this.coden = coden;
    }

    public java.lang.String getCoden(int i) {
        return this.coden[i];
    }

    public void setCoden(int i, java.lang.String _value) {
        this.coden[i] = _value;
    }


    /**
     * Gets the otherID value for this NLMCatalogRecordType.
     * 
     * @return otherID
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.OtherIDType[] getOtherID() {
        return otherID;
    }


    /**
     * Sets the otherID value for this NLMCatalogRecordType.
     * 
     * @param otherID
     */
    public void setOtherID(gov.nih.nlm.ncbi.www.soap.eutils.efetch.OtherIDType[] otherID) {
        this.otherID = otherID;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.OtherIDType getOtherID(int i) {
        return this.otherID[i];
    }

    public void setOtherID(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.OtherIDType _value) {
        this.otherID[i] = _value;
    }


    /**
     * Gets the acquisitionInfoList value for this NLMCatalogRecordType.
     * 
     * @return acquisitionInfoList
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.AcquisitionInfoListType getAcquisitionInfoList() {
        return acquisitionInfoList;
    }


    /**
     * Sets the acquisitionInfoList value for this NLMCatalogRecordType.
     * 
     * @param acquisitionInfoList
     */
    public void setAcquisitionInfoList(gov.nih.nlm.ncbi.www.soap.eutils.efetch.AcquisitionInfoListType acquisitionInfoList) {
        this.acquisitionInfoList = acquisitionInfoList;
    }


    /**
     * Gets the reportNumber value for this NLMCatalogRecordType.
     * 
     * @return reportNumber
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ReportNumberType[] getReportNumber() {
        return reportNumber;
    }


    /**
     * Sets the reportNumber value for this NLMCatalogRecordType.
     * 
     * @param reportNumber
     */
    public void setReportNumber(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ReportNumberType[] reportNumber) {
        this.reportNumber = reportNumber;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ReportNumberType getReportNumber(int i) {
        return this.reportNumber[i];
    }

    public void setReportNumber(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.ReportNumberType _value) {
        this.reportNumber[i] = _value;
    }


    /**
     * Gets the owner value for this NLMCatalogRecordType.
     * 
     * @return owner
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.NLMCatalogRecordTypeOwner getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this NLMCatalogRecordType.
     * 
     * @param owner
     */
    public void setOwner(gov.nih.nlm.ncbi.www.soap.eutils.efetch.NLMCatalogRecordTypeOwner owner) {
        this.owner = owner;
    }


    /**
     * Gets the status value for this NLMCatalogRecordType.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this NLMCatalogRecordType.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NLMCatalogRecordType)) return false;
        NLMCatalogRecordType other = (NLMCatalogRecordType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.nlmUniqueID==null && other.getNlmUniqueID()==null) || 
             (this.nlmUniqueID!=null &&
              this.nlmUniqueID.equals(other.getNlmUniqueID()))) &&
            ((this.dateCreated==null && other.getDateCreated()==null) || 
             (this.dateCreated!=null &&
              this.dateCreated.equals(other.getDateCreated()))) &&
            ((this.dateRevised==null && other.getDateRevised()==null) || 
             (this.dateRevised!=null &&
              this.dateRevised.equals(other.getDateRevised()))) &&
            ((this.dateAuthorized==null && other.getDateAuthorized()==null) || 
             (this.dateAuthorized!=null &&
              this.dateAuthorized.equals(other.getDateAuthorized()))) &&
            ((this.dateCompleted==null && other.getDateCompleted()==null) || 
             (this.dateCompleted!=null &&
              this.dateCompleted.equals(other.getDateCompleted()))) &&
            ((this.dateRevisedMajor==null && other.getDateRevisedMajor()==null) || 
             (this.dateRevisedMajor!=null &&
              this.dateRevisedMajor.equals(other.getDateRevisedMajor()))) &&
            ((this.collaborativePartnerDate==null && other.getCollaborativePartnerDate()==null) || 
             (this.collaborativePartnerDate!=null &&
              java.util.Arrays.equals(this.collaborativePartnerDate, other.getCollaborativePartnerDate()))) &&
            ((this.titleMain==null && other.getTitleMain()==null) || 
             (this.titleMain!=null &&
              this.titleMain.equals(other.getTitleMain()))) &&
            ((this.medlineTA==null && other.getMedlineTA()==null) || 
             (this.medlineTA!=null &&
              this.medlineTA.equals(other.getMedlineTA()))) &&
            ((this.titleOther==null && other.getTitleOther()==null) || 
             (this.titleOther!=null &&
              java.util.Arrays.equals(this.titleOther, other.getTitleOther()))) &&
            ((this.authorList==null && other.getAuthorList()==null) || 
             (this.authorList!=null &&
              this.authorList.equals(other.getAuthorList()))) &&
            ((this.investigatorList==null && other.getInvestigatorList()==null) || 
             (this.investigatorList!=null &&
              this.investigatorList.equals(other.getInvestigatorList()))) &&
            ((this.resourceInfo==null && other.getResourceInfo()==null) || 
             (this.resourceInfo!=null &&
              this.resourceInfo.equals(other.getResourceInfo()))) &&
            ((this.publicationTypeList==null && other.getPublicationTypeList()==null) || 
             (this.publicationTypeList!=null &&
              this.publicationTypeList.equals(other.getPublicationTypeList()))) &&
            ((this.genreList==null && other.getGenreList()==null) || 
             (this.genreList!=null &&
              this.genreList.equals(other.getGenreList()))) &&
            ((this.publicationInfo==null && other.getPublicationInfo()==null) || 
             (this.publicationInfo!=null &&
              this.publicationInfo.equals(other.getPublicationInfo()))) &&
            ((this.language==null && other.getLanguage()==null) || 
             (this.language!=null &&
              java.util.Arrays.equals(this.language, other.getLanguage()))) &&
            ((this.languageAlternate==null && other.getLanguageAlternate()==null) || 
             (this.languageAlternate!=null &&
              java.util.Arrays.equals(this.languageAlternate, other.getLanguageAlternate()))) &&
            ((this.physicalDescription==null && other.getPhysicalDescription()==null) || 
             (this.physicalDescription!=null &&
              this.physicalDescription.equals(other.getPhysicalDescription()))) &&
            ((this._abstract==null && other.get_abstract()==null) || 
             (this._abstract!=null &&
              this._abstract.equals(other.get_abstract()))) &&
            ((this.affiliation==null && other.getAffiliation()==null) || 
             (this.affiliation!=null &&
              this.affiliation.equals(other.getAffiliation()))) &&
            ((this.otherAbstract==null && other.getOtherAbstract()==null) || 
             (this.otherAbstract!=null &&
              java.util.Arrays.equals(this.otherAbstract, other.getOtherAbstract()))) &&
            ((this.contentsNote==null && other.getContentsNote()==null) || 
             (this.contentsNote!=null &&
              java.util.Arrays.equals(this.contentsNote, other.getContentsNote()))) &&
            ((this.indexingSourceList==null && other.getIndexingSourceList()==null) || 
             (this.indexingSourceList!=null &&
              this.indexingSourceList.equals(other.getIndexingSourceList()))) &&
            ((this.NLMIndexNote==null && other.getNLMIndexNote()==null) || 
             (this.NLMIndexNote!=null &&
              java.util.Arrays.equals(this.NLMIndexNote, other.getNLMIndexNote()))) &&
            ((this.generalNote==null && other.getGeneralNote()==null) || 
             (this.generalNote!=null &&
              java.util.Arrays.equals(this.generalNote, other.getGeneralNote()))) &&
            ((this.localNote==null && other.getLocalNote()==null) || 
             (this.localNote!=null &&
              java.util.Arrays.equals(this.localNote, other.getLocalNote()))) &&
            ((this.personalNameSubjectList==null && other.getPersonalNameSubjectList()==null) || 
             (this.personalNameSubjectList!=null &&
              this.personalNameSubjectList.equals(other.getPersonalNameSubjectList()))) &&
            ((this.meshHeadingList==null && other.getMeshHeadingList()==null) || 
             (this.meshHeadingList!=null &&
              this.meshHeadingList.equals(other.getMeshHeadingList()))) &&
            ((this.otherSubjectList==null && other.getOtherSubjectList()==null) || 
             (this.otherSubjectList!=null &&
              java.util.Arrays.equals(this.otherSubjectList, other.getOtherSubjectList()))) &&
            ((this.spaceFlightMission==null && other.getSpaceFlightMission()==null) || 
             (this.spaceFlightMission!=null &&
              java.util.Arrays.equals(this.spaceFlightMission, other.getSpaceFlightMission()))) &&
            ((this.keywordList==null && other.getKeywordList()==null) || 
             (this.keywordList!=null &&
              java.util.Arrays.equals(this.keywordList, other.getKeywordList()))) &&
            ((this.broadJournalHeadingList==null && other.getBroadJournalHeadingList()==null) || 
             (this.broadJournalHeadingList!=null &&
              this.broadJournalHeadingList.equals(other.getBroadJournalHeadingList()))) &&
            ((this.chemicalList==null && other.getChemicalList()==null) || 
             (this.chemicalList!=null &&
              this.chemicalList.equals(other.getChemicalList()))) &&
            ((this.classification==null && other.getClassification()==null) || 
             (this.classification!=null &&
              java.util.Arrays.equals(this.classification, other.getClassification()))) &&
            ((this.govDocClassNumber==null && other.getGovDocClassNumber()==null) || 
             (this.govDocClassNumber!=null &&
              java.util.Arrays.equals(this.govDocClassNumber, other.getGovDocClassNumber()))) &&
            ((this.electronicAccessList==null && other.getElectronicAccessList()==null) || 
             (this.electronicAccessList!=null &&
              this.electronicAccessList.equals(other.getElectronicAccessList()))) &&
            ((this.host==null && other.getHost()==null) || 
             (this.host!=null &&
              java.util.Arrays.equals(this.host, other.getHost()))) &&
            ((this.LCCN==null && other.getLCCN()==null) || 
             (this.LCCN!=null &&
              java.util.Arrays.equals(this.LCCN, other.getLCCN()))) &&
            ((this.ISBN==null && other.getISBN()==null) || 
             (this.ISBN!=null &&
              java.util.Arrays.equals(this.ISBN, other.getISBN()))) &&
            ((this.ISSN==null && other.getISSN()==null) || 
             (this.ISSN!=null &&
              java.util.Arrays.equals(this.ISSN, other.getISSN()))) &&
            ((this.NCBIIssnAlias==null && other.getNCBIIssnAlias()==null) || 
             (this.NCBIIssnAlias!=null &&
              java.util.Arrays.equals(this.NCBIIssnAlias, other.getNCBIIssnAlias()))) &&
            ((this.STRN==null && other.getSTRN()==null) || 
             (this.STRN!=null &&
              java.util.Arrays.equals(this.STRN, other.getSTRN()))) &&
            ((this.coden==null && other.getCoden()==null) || 
             (this.coden!=null &&
              java.util.Arrays.equals(this.coden, other.getCoden()))) &&
            ((this.otherID==null && other.getOtherID()==null) || 
             (this.otherID!=null &&
              java.util.Arrays.equals(this.otherID, other.getOtherID()))) &&
            ((this.acquisitionInfoList==null && other.getAcquisitionInfoList()==null) || 
             (this.acquisitionInfoList!=null &&
              this.acquisitionInfoList.equals(other.getAcquisitionInfoList()))) &&
            ((this.reportNumber==null && other.getReportNumber()==null) || 
             (this.reportNumber!=null &&
              java.util.Arrays.equals(this.reportNumber, other.getReportNumber()))) &&
            ((this.owner==null && other.getOwner()==null) || 
             (this.owner!=null &&
              this.owner.equals(other.getOwner()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus())));
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
        if (getNlmUniqueID() != null) {
            _hashCode += getNlmUniqueID().hashCode();
        }
        if (getDateCreated() != null) {
            _hashCode += getDateCreated().hashCode();
        }
        if (getDateRevised() != null) {
            _hashCode += getDateRevised().hashCode();
        }
        if (getDateAuthorized() != null) {
            _hashCode += getDateAuthorized().hashCode();
        }
        if (getDateCompleted() != null) {
            _hashCode += getDateCompleted().hashCode();
        }
        if (getDateRevisedMajor() != null) {
            _hashCode += getDateRevisedMajor().hashCode();
        }
        if (getCollaborativePartnerDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCollaborativePartnerDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCollaborativePartnerDate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTitleMain() != null) {
            _hashCode += getTitleMain().hashCode();
        }
        if (getMedlineTA() != null) {
            _hashCode += getMedlineTA().hashCode();
        }
        if (getTitleOther() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTitleOther());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTitleOther(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAuthorList() != null) {
            _hashCode += getAuthorList().hashCode();
        }
        if (getInvestigatorList() != null) {
            _hashCode += getInvestigatorList().hashCode();
        }
        if (getResourceInfo() != null) {
            _hashCode += getResourceInfo().hashCode();
        }
        if (getPublicationTypeList() != null) {
            _hashCode += getPublicationTypeList().hashCode();
        }
        if (getGenreList() != null) {
            _hashCode += getGenreList().hashCode();
        }
        if (getPublicationInfo() != null) {
            _hashCode += getPublicationInfo().hashCode();
        }
        if (getLanguage() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLanguage());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLanguage(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLanguageAlternate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLanguageAlternate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLanguageAlternate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPhysicalDescription() != null) {
            _hashCode += getPhysicalDescription().hashCode();
        }
        if (get_abstract() != null) {
            _hashCode += get_abstract().hashCode();
        }
        if (getAffiliation() != null) {
            _hashCode += getAffiliation().hashCode();
        }
        if (getOtherAbstract() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOtherAbstract());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOtherAbstract(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getContentsNote() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getContentsNote());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getContentsNote(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIndexingSourceList() != null) {
            _hashCode += getIndexingSourceList().hashCode();
        }
        if (getNLMIndexNote() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNLMIndexNote());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNLMIndexNote(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGeneralNote() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGeneralNote());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGeneralNote(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLocalNote() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLocalNote());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLocalNote(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPersonalNameSubjectList() != null) {
            _hashCode += getPersonalNameSubjectList().hashCode();
        }
        if (getMeshHeadingList() != null) {
            _hashCode += getMeshHeadingList().hashCode();
        }
        if (getOtherSubjectList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOtherSubjectList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOtherSubjectList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSpaceFlightMission() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSpaceFlightMission());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSpaceFlightMission(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getKeywordList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getKeywordList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getKeywordList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBroadJournalHeadingList() != null) {
            _hashCode += getBroadJournalHeadingList().hashCode();
        }
        if (getChemicalList() != null) {
            _hashCode += getChemicalList().hashCode();
        }
        if (getClassification() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getClassification());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getClassification(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGovDocClassNumber() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGovDocClassNumber());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGovDocClassNumber(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getElectronicAccessList() != null) {
            _hashCode += getElectronicAccessList().hashCode();
        }
        if (getHost() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHost());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHost(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLCCN() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLCCN());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLCCN(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getISBN() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getISBN());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getISBN(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getISSN() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getISSN());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getISSN(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNCBIIssnAlias() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNCBIIssnAlias());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNCBIIssnAlias(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSTRN() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSTRN());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSTRN(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCoden() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCoden());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCoden(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOtherID() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOtherID());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOtherID(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAcquisitionInfoList() != null) {
            _hashCode += getAcquisitionInfoList().hashCode();
        }
        if (getReportNumber() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getReportNumber());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getReportNumber(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOwner() != null) {
            _hashCode += getOwner().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NLMCatalogRecordType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "NLMCatalogRecordType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("owner");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Owner"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">NLMCatalogRecordType>Owner"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("status");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Status"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nlmUniqueID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "NlmUniqueID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateCreated");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "DateCreated"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "DateCreatedType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateRevised");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "DateRevised"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "DateRevisedType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateAuthorized");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "DateAuthorized"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "DateAuthorizedType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateCompleted");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "DateCompleted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "DateCompletedType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateRevisedMajor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "DateRevisedMajor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "DateRevisedMajorType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("collaborativePartnerDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "CollaborativePartnerDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "CollaborativePartnerDateType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("titleMain");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "TitleMain"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "TitleMainType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("medlineTA");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MedlineTA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("titleOther");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "TitleOther"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "TitleOtherType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authorList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "AuthorList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "AuthorListType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("investigatorList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "InvestigatorList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "InvestigatorListType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resourceInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ResourceInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ResourceInfoType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("publicationTypeList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PublicationTypeList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PublicationTypeListType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("genreList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "GenreList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "GenreListType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("publicationInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PublicationInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PublicationInfoType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("language");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Language"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Language"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("languageAlternate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "LanguageAlternate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "LanguageAlternateType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("physicalDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PhysicalDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PhysicalDescriptionType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_abstract");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Abstract"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "AbstractType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("affiliation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Affiliation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("otherAbstract");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "OtherAbstract"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "OtherAbstractType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contentsNote");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ContentsNote"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ContentsNote"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indexingSourceList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "IndexingSourceList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "IndexingSourceListType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NLMIndexNote");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "NLMIndexNote"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "NLMIndexNote"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("generalNote");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "GeneralNote"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "GeneralNoteType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("localNote");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "LocalNote"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "LocalNoteType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personalNameSubjectList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PersonalNameSubjectList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PersonalNameSubjectListType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("meshHeadingList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MeshHeadingList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MeshHeadingListType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("otherSubjectList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "OtherSubjectList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "OtherSubjectListType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("spaceFlightMission");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "SpaceFlightMission"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "SpaceFlightMission"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keywordList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "KeywordList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "KeywordListType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("broadJournalHeadingList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "BroadJournalHeadingList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "BroadJournalHeadingListType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chemicalList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ChemicalList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ChemicalListType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("classification");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Classification"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ClassificationType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("govDocClassNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "GovDocClassNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "GovDocClassNumberType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("electronicAccessList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ElectronicAccessList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ElectronicAccessListType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("host");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Host"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Host"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LCCN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "LCCN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "LCCNType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ISBN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ISBN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ISBNType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ISSN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ISSN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ISSNType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NCBIIssnAlias");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "NCBIIssnAlias"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "NCBIIssnAlias"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("STRN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "STRN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "STRN"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coden");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Coden"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Coden"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("otherID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "OtherID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "OtherIDType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acquisitionInfoList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "AcquisitionInfoList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "AcquisitionInfoListType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reportNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ReportNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ReportNumberType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
