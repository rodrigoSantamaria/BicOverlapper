/**
 * ArticleType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ArticleType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.JournalType journal;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.BookType book;

    private java.lang.String articleTitle;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PaginationType pagination;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.AbstractType _abstract;

    private java.lang.String affiliation;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.AuthorListType authorList;

    private java.lang.String[] language;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.DataBankListType dataBankList;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.GrantListType grantList;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PublicationTypeListType publicationTypeList;

    private java.lang.String vernacularTitle;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ArticleDateType[] articleDate;

    public ArticleType() {
    }

    public ArticleType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.JournalType journal,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.BookType book,
           java.lang.String articleTitle,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PaginationType pagination,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.AbstractType _abstract,
           java.lang.String affiliation,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.AuthorListType authorList,
           java.lang.String[] language,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.DataBankListType dataBankList,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.GrantListType grantList,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PublicationTypeListType publicationTypeList,
           java.lang.String vernacularTitle,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ArticleDateType[] articleDate) {
           this.journal = journal;
           this.book = book;
           this.articleTitle = articleTitle;
           this.pagination = pagination;
           this._abstract = _abstract;
           this.affiliation = affiliation;
           this.authorList = authorList;
           this.language = language;
           this.dataBankList = dataBankList;
           this.grantList = grantList;
           this.publicationTypeList = publicationTypeList;
           this.vernacularTitle = vernacularTitle;
           this.articleDate = articleDate;
    }


    /**
     * Gets the journal value for this ArticleType.
     * 
     * @return journal
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.JournalType getJournal() {
        return journal;
    }


    /**
     * Sets the journal value for this ArticleType.
     * 
     * @param journal
     */
    public void setJournal(gov.nih.nlm.ncbi.www.soap.eutils.efetch.JournalType journal) {
        this.journal = journal;
    }


    /**
     * Gets the book value for this ArticleType.
     * 
     * @return book
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.BookType getBook() {
        return book;
    }


    /**
     * Sets the book value for this ArticleType.
     * 
     * @param book
     */
    public void setBook(gov.nih.nlm.ncbi.www.soap.eutils.efetch.BookType book) {
        this.book = book;
    }


    /**
     * Gets the articleTitle value for this ArticleType.
     * 
     * @return articleTitle
     */
    public java.lang.String getArticleTitle() {
        return articleTitle;
    }


    /**
     * Sets the articleTitle value for this ArticleType.
     * 
     * @param articleTitle
     */
    public void setArticleTitle(java.lang.String articleTitle) {
        this.articleTitle = articleTitle;
    }


    /**
     * Gets the pagination value for this ArticleType.
     * 
     * @return pagination
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PaginationType getPagination() {
        return pagination;
    }


    /**
     * Sets the pagination value for this ArticleType.
     * 
     * @param pagination
     */
    public void setPagination(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PaginationType pagination) {
        this.pagination = pagination;
    }


    /**
     * Gets the _abstract value for this ArticleType.
     * 
     * @return _abstract
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.AbstractType get_abstract() {
        return _abstract;
    }


    /**
     * Sets the _abstract value for this ArticleType.
     * 
     * @param _abstract
     */
    public void set_abstract(gov.nih.nlm.ncbi.www.soap.eutils.efetch.AbstractType _abstract) {
        this._abstract = _abstract;
    }


    /**
     * Gets the affiliation value for this ArticleType.
     * 
     * @return affiliation
     */
    public java.lang.String getAffiliation() {
        return affiliation;
    }


    /**
     * Sets the affiliation value for this ArticleType.
     * 
     * @param affiliation
     */
    public void setAffiliation(java.lang.String affiliation) {
        this.affiliation = affiliation;
    }


    /**
     * Gets the authorList value for this ArticleType.
     * 
     * @return authorList
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.AuthorListType getAuthorList() {
        return authorList;
    }


    /**
     * Sets the authorList value for this ArticleType.
     * 
     * @param authorList
     */
    public void setAuthorList(gov.nih.nlm.ncbi.www.soap.eutils.efetch.AuthorListType authorList) {
        this.authorList = authorList;
    }


    /**
     * Gets the language value for this ArticleType.
     * 
     * @return language
     */
    public java.lang.String[] getLanguage() {
        return language;
    }


    /**
     * Sets the language value for this ArticleType.
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
     * Gets the dataBankList value for this ArticleType.
     * 
     * @return dataBankList
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.DataBankListType getDataBankList() {
        return dataBankList;
    }


    /**
     * Sets the dataBankList value for this ArticleType.
     * 
     * @param dataBankList
     */
    public void setDataBankList(gov.nih.nlm.ncbi.www.soap.eutils.efetch.DataBankListType dataBankList) {
        this.dataBankList = dataBankList;
    }


    /**
     * Gets the grantList value for this ArticleType.
     * 
     * @return grantList
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.GrantListType getGrantList() {
        return grantList;
    }


    /**
     * Sets the grantList value for this ArticleType.
     * 
     * @param grantList
     */
    public void setGrantList(gov.nih.nlm.ncbi.www.soap.eutils.efetch.GrantListType grantList) {
        this.grantList = grantList;
    }


    /**
     * Gets the publicationTypeList value for this ArticleType.
     * 
     * @return publicationTypeList
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PublicationTypeListType getPublicationTypeList() {
        return publicationTypeList;
    }


    /**
     * Sets the publicationTypeList value for this ArticleType.
     * 
     * @param publicationTypeList
     */
    public void setPublicationTypeList(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PublicationTypeListType publicationTypeList) {
        this.publicationTypeList = publicationTypeList;
    }


    /**
     * Gets the vernacularTitle value for this ArticleType.
     * 
     * @return vernacularTitle
     */
    public java.lang.String getVernacularTitle() {
        return vernacularTitle;
    }


    /**
     * Sets the vernacularTitle value for this ArticleType.
     * 
     * @param vernacularTitle
     */
    public void setVernacularTitle(java.lang.String vernacularTitle) {
        this.vernacularTitle = vernacularTitle;
    }


    /**
     * Gets the articleDate value for this ArticleType.
     * 
     * @return articleDate
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ArticleDateType[] getArticleDate() {
        return articleDate;
    }


    /**
     * Sets the articleDate value for this ArticleType.
     * 
     * @param articleDate
     */
    public void setArticleDate(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ArticleDateType[] articleDate) {
        this.articleDate = articleDate;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ArticleDateType getArticleDate(int i) {
        return this.articleDate[i];
    }

    public void setArticleDate(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.ArticleDateType _value) {
        this.articleDate[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArticleType)) return false;
        ArticleType other = (ArticleType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.journal==null && other.getJournal()==null) || 
             (this.journal!=null &&
              this.journal.equals(other.getJournal()))) &&
            ((this.book==null && other.getBook()==null) || 
             (this.book!=null &&
              this.book.equals(other.getBook()))) &&
            ((this.articleTitle==null && other.getArticleTitle()==null) || 
             (this.articleTitle!=null &&
              this.articleTitle.equals(other.getArticleTitle()))) &&
            ((this.pagination==null && other.getPagination()==null) || 
             (this.pagination!=null &&
              this.pagination.equals(other.getPagination()))) &&
            ((this._abstract==null && other.get_abstract()==null) || 
             (this._abstract!=null &&
              this._abstract.equals(other.get_abstract()))) &&
            ((this.affiliation==null && other.getAffiliation()==null) || 
             (this.affiliation!=null &&
              this.affiliation.equals(other.getAffiliation()))) &&
            ((this.authorList==null && other.getAuthorList()==null) || 
             (this.authorList!=null &&
              this.authorList.equals(other.getAuthorList()))) &&
            ((this.language==null && other.getLanguage()==null) || 
             (this.language!=null &&
              java.util.Arrays.equals(this.language, other.getLanguage()))) &&
            ((this.dataBankList==null && other.getDataBankList()==null) || 
             (this.dataBankList!=null &&
              this.dataBankList.equals(other.getDataBankList()))) &&
            ((this.grantList==null && other.getGrantList()==null) || 
             (this.grantList!=null &&
              this.grantList.equals(other.getGrantList()))) &&
            ((this.publicationTypeList==null && other.getPublicationTypeList()==null) || 
             (this.publicationTypeList!=null &&
              this.publicationTypeList.equals(other.getPublicationTypeList()))) &&
            ((this.vernacularTitle==null && other.getVernacularTitle()==null) || 
             (this.vernacularTitle!=null &&
              this.vernacularTitle.equals(other.getVernacularTitle()))) &&
            ((this.articleDate==null && other.getArticleDate()==null) || 
             (this.articleDate!=null &&
              java.util.Arrays.equals(this.articleDate, other.getArticleDate())));
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
        if (getJournal() != null) {
            _hashCode += getJournal().hashCode();
        }
        if (getBook() != null) {
            _hashCode += getBook().hashCode();
        }
        if (getArticleTitle() != null) {
            _hashCode += getArticleTitle().hashCode();
        }
        if (getPagination() != null) {
            _hashCode += getPagination().hashCode();
        }
        if (get_abstract() != null) {
            _hashCode += get_abstract().hashCode();
        }
        if (getAffiliation() != null) {
            _hashCode += getAffiliation().hashCode();
        }
        if (getAuthorList() != null) {
            _hashCode += getAuthorList().hashCode();
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
        if (getDataBankList() != null) {
            _hashCode += getDataBankList().hashCode();
        }
        if (getGrantList() != null) {
            _hashCode += getGrantList().hashCode();
        }
        if (getPublicationTypeList() != null) {
            _hashCode += getPublicationTypeList().hashCode();
        }
        if (getVernacularTitle() != null) {
            _hashCode += getVernacularTitle().hashCode();
        }
        if (getArticleDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getArticleDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getArticleDate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ArticleType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ArticleType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("journal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Journal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "JournalType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("book");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Book"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "BookType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("articleTitle");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ArticleTitle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pagination");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Pagination"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PaginationType"));
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
        elemField.setFieldName("authorList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "AuthorList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "AuthorListType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("language");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Language"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Language"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataBankList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "DataBankList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "DataBankListType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("grantList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "GrantList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "GrantListType"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("vernacularTitle");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "VernacularTitle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("articleDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ArticleDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ArticleDateType"));
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
