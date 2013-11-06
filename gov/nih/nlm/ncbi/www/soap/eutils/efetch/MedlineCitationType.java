/**
 * MedlineCitationType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class MedlineCitationType  implements java.io.Serializable {
    private java.lang.String nlmDcmsID;

    private java.lang.String PMID;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.DateCreatedType dateCreated;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.DateCompletedType dateCompleted;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.DateRevisedType dateRevised;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ArticleType article;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MedlineJournalInfoType medlineJournalInfo;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ChemicalListType chemicalList;

    private java.lang.String[] citationSubset;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.CommentsCorrectionsType commentsCorrections;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.GeneSymbolListType geneSymbolList;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MeshHeadingListType meshHeadingList;

    private java.lang.String numberOfReferences;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PersonalNameSubjectListType personalNameSubjectList;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.OtherIDType[] otherID;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.OtherAbstractType[] otherAbstract;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.KeywordListType[] keywordList;

    private java.lang.String[] spaceFlightMission;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.InvestigatorListType investigatorList;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.GeneralNoteType[] generalNote;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MedlineCitationTypeOwner owner;  // attribute

    private java.lang.String status;  // attribute

    public MedlineCitationType() {
    }

    public MedlineCitationType(
           java.lang.String nlmDcmsID,
           java.lang.String PMID,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.DateCreatedType dateCreated,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.DateCompletedType dateCompleted,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.DateRevisedType dateRevised,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ArticleType article,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MedlineJournalInfoType medlineJournalInfo,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ChemicalListType chemicalList,
           java.lang.String[] citationSubset,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.CommentsCorrectionsType commentsCorrections,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.GeneSymbolListType geneSymbolList,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MeshHeadingListType meshHeadingList,
           java.lang.String numberOfReferences,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PersonalNameSubjectListType personalNameSubjectList,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.OtherIDType[] otherID,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.OtherAbstractType[] otherAbstract,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.KeywordListType[] keywordList,
           java.lang.String[] spaceFlightMission,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.InvestigatorListType investigatorList,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.GeneralNoteType[] generalNote,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MedlineCitationTypeOwner owner,
           java.lang.String status) {
           this.nlmDcmsID = nlmDcmsID;
           this.PMID = PMID;
           this.dateCreated = dateCreated;
           this.dateCompleted = dateCompleted;
           this.dateRevised = dateRevised;
           this.article = article;
           this.medlineJournalInfo = medlineJournalInfo;
           this.chemicalList = chemicalList;
           this.citationSubset = citationSubset;
           this.commentsCorrections = commentsCorrections;
           this.geneSymbolList = geneSymbolList;
           this.meshHeadingList = meshHeadingList;
           this.numberOfReferences = numberOfReferences;
           this.personalNameSubjectList = personalNameSubjectList;
           this.otherID = otherID;
           this.otherAbstract = otherAbstract;
           this.keywordList = keywordList;
           this.spaceFlightMission = spaceFlightMission;
           this.investigatorList = investigatorList;
           this.generalNote = generalNote;
           this.owner = owner;
           this.status = status;
    }


    /**
     * Gets the nlmDcmsID value for this MedlineCitationType.
     * 
     * @return nlmDcmsID
     */
    public java.lang.String getNlmDcmsID() {
        return nlmDcmsID;
    }


    /**
     * Sets the nlmDcmsID value for this MedlineCitationType.
     * 
     * @param nlmDcmsID
     */
    public void setNlmDcmsID(java.lang.String nlmDcmsID) {
        this.nlmDcmsID = nlmDcmsID;
    }


    /**
     * Gets the PMID value for this MedlineCitationType.
     * 
     * @return PMID
     */
    public java.lang.String getPMID() {
        return PMID;
    }


    /**
     * Sets the PMID value for this MedlineCitationType.
     * 
     * @param PMID
     */
    public void setPMID(java.lang.String PMID) {
        this.PMID = PMID;
    }


    /**
     * Gets the dateCreated value for this MedlineCitationType.
     * 
     * @return dateCreated
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.DateCreatedType getDateCreated() {
        return dateCreated;
    }


    /**
     * Sets the dateCreated value for this MedlineCitationType.
     * 
     * @param dateCreated
     */
    public void setDateCreated(gov.nih.nlm.ncbi.www.soap.eutils.efetch.DateCreatedType dateCreated) {
        this.dateCreated = dateCreated;
    }


    /**
     * Gets the dateCompleted value for this MedlineCitationType.
     * 
     * @return dateCompleted
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.DateCompletedType getDateCompleted() {
        return dateCompleted;
    }


    /**
     * Sets the dateCompleted value for this MedlineCitationType.
     * 
     * @param dateCompleted
     */
    public void setDateCompleted(gov.nih.nlm.ncbi.www.soap.eutils.efetch.DateCompletedType dateCompleted) {
        this.dateCompleted = dateCompleted;
    }


    /**
     * Gets the dateRevised value for this MedlineCitationType.
     * 
     * @return dateRevised
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.DateRevisedType getDateRevised() {
        return dateRevised;
    }


    /**
     * Sets the dateRevised value for this MedlineCitationType.
     * 
     * @param dateRevised
     */
    public void setDateRevised(gov.nih.nlm.ncbi.www.soap.eutils.efetch.DateRevisedType dateRevised) {
        this.dateRevised = dateRevised;
    }


    /**
     * Gets the article value for this MedlineCitationType.
     * 
     * @return article
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ArticleType getArticle() {
        return article;
    }


    /**
     * Sets the article value for this MedlineCitationType.
     * 
     * @param article
     */
    public void setArticle(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ArticleType article) {
        this.article = article;
    }


    /**
     * Gets the medlineJournalInfo value for this MedlineCitationType.
     * 
     * @return medlineJournalInfo
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MedlineJournalInfoType getMedlineJournalInfo() {
        return medlineJournalInfo;
    }


    /**
     * Sets the medlineJournalInfo value for this MedlineCitationType.
     * 
     * @param medlineJournalInfo
     */
    public void setMedlineJournalInfo(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MedlineJournalInfoType medlineJournalInfo) {
        this.medlineJournalInfo = medlineJournalInfo;
    }


    /**
     * Gets the chemicalList value for this MedlineCitationType.
     * 
     * @return chemicalList
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ChemicalListType getChemicalList() {
        return chemicalList;
    }


    /**
     * Sets the chemicalList value for this MedlineCitationType.
     * 
     * @param chemicalList
     */
    public void setChemicalList(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ChemicalListType chemicalList) {
        this.chemicalList = chemicalList;
    }


    /**
     * Gets the citationSubset value for this MedlineCitationType.
     * 
     * @return citationSubset
     */
    public java.lang.String[] getCitationSubset() {
        return citationSubset;
    }


    /**
     * Sets the citationSubset value for this MedlineCitationType.
     * 
     * @param citationSubset
     */
    public void setCitationSubset(java.lang.String[] citationSubset) {
        this.citationSubset = citationSubset;
    }

    public java.lang.String getCitationSubset(int i) {
        return this.citationSubset[i];
    }

    public void setCitationSubset(int i, java.lang.String _value) {
        this.citationSubset[i] = _value;
    }


    /**
     * Gets the commentsCorrections value for this MedlineCitationType.
     * 
     * @return commentsCorrections
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.CommentsCorrectionsType getCommentsCorrections() {
        return commentsCorrections;
    }


    /**
     * Sets the commentsCorrections value for this MedlineCitationType.
     * 
     * @param commentsCorrections
     */
    public void setCommentsCorrections(gov.nih.nlm.ncbi.www.soap.eutils.efetch.CommentsCorrectionsType commentsCorrections) {
        this.commentsCorrections = commentsCorrections;
    }


    /**
     * Gets the geneSymbolList value for this MedlineCitationType.
     * 
     * @return geneSymbolList
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.GeneSymbolListType getGeneSymbolList() {
        return geneSymbolList;
    }


    /**
     * Sets the geneSymbolList value for this MedlineCitationType.
     * 
     * @param geneSymbolList
     */
    public void setGeneSymbolList(gov.nih.nlm.ncbi.www.soap.eutils.efetch.GeneSymbolListType geneSymbolList) {
        this.geneSymbolList = geneSymbolList;
    }


    /**
     * Gets the meshHeadingList value for this MedlineCitationType.
     * 
     * @return meshHeadingList
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MeshHeadingListType getMeshHeadingList() {
        return meshHeadingList;
    }


    /**
     * Sets the meshHeadingList value for this MedlineCitationType.
     * 
     * @param meshHeadingList
     */
    public void setMeshHeadingList(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MeshHeadingListType meshHeadingList) {
        this.meshHeadingList = meshHeadingList;
    }


    /**
     * Gets the numberOfReferences value for this MedlineCitationType.
     * 
     * @return numberOfReferences
     */
    public java.lang.String getNumberOfReferences() {
        return numberOfReferences;
    }


    /**
     * Sets the numberOfReferences value for this MedlineCitationType.
     * 
     * @param numberOfReferences
     */
    public void setNumberOfReferences(java.lang.String numberOfReferences) {
        this.numberOfReferences = numberOfReferences;
    }


    /**
     * Gets the personalNameSubjectList value for this MedlineCitationType.
     * 
     * @return personalNameSubjectList
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PersonalNameSubjectListType getPersonalNameSubjectList() {
        return personalNameSubjectList;
    }


    /**
     * Sets the personalNameSubjectList value for this MedlineCitationType.
     * 
     * @param personalNameSubjectList
     */
    public void setPersonalNameSubjectList(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PersonalNameSubjectListType personalNameSubjectList) {
        this.personalNameSubjectList = personalNameSubjectList;
    }


    /**
     * Gets the otherID value for this MedlineCitationType.
     * 
     * @return otherID
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.OtherIDType[] getOtherID() {
        return otherID;
    }


    /**
     * Sets the otherID value for this MedlineCitationType.
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
     * Gets the otherAbstract value for this MedlineCitationType.
     * 
     * @return otherAbstract
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.OtherAbstractType[] getOtherAbstract() {
        return otherAbstract;
    }


    /**
     * Sets the otherAbstract value for this MedlineCitationType.
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
     * Gets the keywordList value for this MedlineCitationType.
     * 
     * @return keywordList
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.KeywordListType[] getKeywordList() {
        return keywordList;
    }


    /**
     * Sets the keywordList value for this MedlineCitationType.
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
     * Gets the spaceFlightMission value for this MedlineCitationType.
     * 
     * @return spaceFlightMission
     */
    public java.lang.String[] getSpaceFlightMission() {
        return spaceFlightMission;
    }


    /**
     * Sets the spaceFlightMission value for this MedlineCitationType.
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
     * Gets the investigatorList value for this MedlineCitationType.
     * 
     * @return investigatorList
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.InvestigatorListType getInvestigatorList() {
        return investigatorList;
    }


    /**
     * Sets the investigatorList value for this MedlineCitationType.
     * 
     * @param investigatorList
     */
    public void setInvestigatorList(gov.nih.nlm.ncbi.www.soap.eutils.efetch.InvestigatorListType investigatorList) {
        this.investigatorList = investigatorList;
    }


    /**
     * Gets the generalNote value for this MedlineCitationType.
     * 
     * @return generalNote
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.GeneralNoteType[] getGeneralNote() {
        return generalNote;
    }


    /**
     * Sets the generalNote value for this MedlineCitationType.
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
     * Gets the owner value for this MedlineCitationType.
     * 
     * @return owner
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MedlineCitationTypeOwner getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this MedlineCitationType.
     * 
     * @param owner
     */
    public void setOwner(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MedlineCitationTypeOwner owner) {
        this.owner = owner;
    }


    /**
     * Gets the status value for this MedlineCitationType.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this MedlineCitationType.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MedlineCitationType)) return false;
        MedlineCitationType other = (MedlineCitationType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.nlmDcmsID==null && other.getNlmDcmsID()==null) || 
             (this.nlmDcmsID!=null &&
              this.nlmDcmsID.equals(other.getNlmDcmsID()))) &&
            ((this.PMID==null && other.getPMID()==null) || 
             (this.PMID!=null &&
              this.PMID.equals(other.getPMID()))) &&
            ((this.dateCreated==null && other.getDateCreated()==null) || 
             (this.dateCreated!=null &&
              this.dateCreated.equals(other.getDateCreated()))) &&
            ((this.dateCompleted==null && other.getDateCompleted()==null) || 
             (this.dateCompleted!=null &&
              this.dateCompleted.equals(other.getDateCompleted()))) &&
            ((this.dateRevised==null && other.getDateRevised()==null) || 
             (this.dateRevised!=null &&
              this.dateRevised.equals(other.getDateRevised()))) &&
            ((this.article==null && other.getArticle()==null) || 
             (this.article!=null &&
              this.article.equals(other.getArticle()))) &&
            ((this.medlineJournalInfo==null && other.getMedlineJournalInfo()==null) || 
             (this.medlineJournalInfo!=null &&
              this.medlineJournalInfo.equals(other.getMedlineJournalInfo()))) &&
            ((this.chemicalList==null && other.getChemicalList()==null) || 
             (this.chemicalList!=null &&
              this.chemicalList.equals(other.getChemicalList()))) &&
            ((this.citationSubset==null && other.getCitationSubset()==null) || 
             (this.citationSubset!=null &&
              java.util.Arrays.equals(this.citationSubset, other.getCitationSubset()))) &&
            ((this.commentsCorrections==null && other.getCommentsCorrections()==null) || 
             (this.commentsCorrections!=null &&
              this.commentsCorrections.equals(other.getCommentsCorrections()))) &&
            ((this.geneSymbolList==null && other.getGeneSymbolList()==null) || 
             (this.geneSymbolList!=null &&
              this.geneSymbolList.equals(other.getGeneSymbolList()))) &&
            ((this.meshHeadingList==null && other.getMeshHeadingList()==null) || 
             (this.meshHeadingList!=null &&
              this.meshHeadingList.equals(other.getMeshHeadingList()))) &&
            ((this.numberOfReferences==null && other.getNumberOfReferences()==null) || 
             (this.numberOfReferences!=null &&
              this.numberOfReferences.equals(other.getNumberOfReferences()))) &&
            ((this.personalNameSubjectList==null && other.getPersonalNameSubjectList()==null) || 
             (this.personalNameSubjectList!=null &&
              this.personalNameSubjectList.equals(other.getPersonalNameSubjectList()))) &&
            ((this.otherID==null && other.getOtherID()==null) || 
             (this.otherID!=null &&
              java.util.Arrays.equals(this.otherID, other.getOtherID()))) &&
            ((this.otherAbstract==null && other.getOtherAbstract()==null) || 
             (this.otherAbstract!=null &&
              java.util.Arrays.equals(this.otherAbstract, other.getOtherAbstract()))) &&
            ((this.keywordList==null && other.getKeywordList()==null) || 
             (this.keywordList!=null &&
              java.util.Arrays.equals(this.keywordList, other.getKeywordList()))) &&
            ((this.spaceFlightMission==null && other.getSpaceFlightMission()==null) || 
             (this.spaceFlightMission!=null &&
              java.util.Arrays.equals(this.spaceFlightMission, other.getSpaceFlightMission()))) &&
            ((this.investigatorList==null && other.getInvestigatorList()==null) || 
             (this.investigatorList!=null &&
              this.investigatorList.equals(other.getInvestigatorList()))) &&
            ((this.generalNote==null && other.getGeneralNote()==null) || 
             (this.generalNote!=null &&
              java.util.Arrays.equals(this.generalNote, other.getGeneralNote()))) &&
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
        if (getNlmDcmsID() != null) {
            _hashCode += getNlmDcmsID().hashCode();
        }
        if (getPMID() != null) {
            _hashCode += getPMID().hashCode();
        }
        if (getDateCreated() != null) {
            _hashCode += getDateCreated().hashCode();
        }
        if (getDateCompleted() != null) {
            _hashCode += getDateCompleted().hashCode();
        }
        if (getDateRevised() != null) {
            _hashCode += getDateRevised().hashCode();
        }
        if (getArticle() != null) {
            _hashCode += getArticle().hashCode();
        }
        if (getMedlineJournalInfo() != null) {
            _hashCode += getMedlineJournalInfo().hashCode();
        }
        if (getChemicalList() != null) {
            _hashCode += getChemicalList().hashCode();
        }
        if (getCitationSubset() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCitationSubset());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCitationSubset(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCommentsCorrections() != null) {
            _hashCode += getCommentsCorrections().hashCode();
        }
        if (getGeneSymbolList() != null) {
            _hashCode += getGeneSymbolList().hashCode();
        }
        if (getMeshHeadingList() != null) {
            _hashCode += getMeshHeadingList().hashCode();
        }
        if (getNumberOfReferences() != null) {
            _hashCode += getNumberOfReferences().hashCode();
        }
        if (getPersonalNameSubjectList() != null) {
            _hashCode += getPersonalNameSubjectList().hashCode();
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
        if (getInvestigatorList() != null) {
            _hashCode += getInvestigatorList().hashCode();
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
        new org.apache.axis.description.TypeDesc(MedlineCitationType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MedlineCitationType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("owner");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Owner"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">MedlineCitationType>Owner"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("status");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Status"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nlmDcmsID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "NlmDcmsID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PMID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PMID"));
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
        elemField.setFieldName("dateCompleted");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "DateCompleted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "DateCompletedType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateRevised");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "DateRevised"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "DateRevisedType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("article");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Article"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ArticleType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("medlineJournalInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MedlineJournalInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MedlineJournalInfoType"));
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
        elemField.setFieldName("citationSubset");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "CitationSubset"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "CitationSubset"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commentsCorrections");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "CommentsCorrections"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "CommentsCorrectionsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("geneSymbolList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "GeneSymbolList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "GeneSymbolListType"));
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
        elemField.setFieldName("numberOfReferences");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "NumberOfReferences"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personalNameSubjectList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PersonalNameSubjectList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PersonalNameSubjectListType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
        elemField.setFieldName("otherAbstract");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "OtherAbstract"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "OtherAbstractType"));
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
        elemField.setFieldName("spaceFlightMission");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "SpaceFlightMission"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "SpaceFlightMission"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("investigatorList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "InvestigatorList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "InvestigatorListType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("generalNote");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "GeneralNote"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "GeneralNoteType"));
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
