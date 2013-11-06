/**
 * MimReferenceType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class MimReferenceType  implements java.io.Serializable {
    private java.lang.String mimReference_number;

    private java.lang.String mimReference_origNumber;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimReference_typeType mimReference_type;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimReference_authorsType mimReference_authors;

    private java.lang.String mimReference_primaryAuthor;

    private java.lang.String mimReference_otherAuthors;

    private java.lang.String mimReference_citationTitle;

    private java.lang.String mimReference_citationType;

    private java.lang.String mimReference_bookTitle;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimReference_editorsType mimReference_editors;

    private java.lang.String mimReference_volume;

    private java.lang.String mimReference_edition;

    private java.lang.String mimReference_journal;

    private java.lang.String mimReference_series;

    private java.lang.String mimReference_publisher;

    private java.lang.String mimReference_place;

    private java.lang.String mimReference_commNote;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimReference_pubDateType mimReference_pubDate;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimReference_pagesType mimReference_pages;

    private java.lang.String mimReference_miscInfo;

    private java.lang.String mimReference_pubmedUID;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimReference_ambiguousType mimReference_ambiguous;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimReference_noLinkType mimReference_noLink;

    public MimReferenceType() {
    }

    public MimReferenceType(
           java.lang.String mimReference_number,
           java.lang.String mimReference_origNumber,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimReference_typeType mimReference_type,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimReference_authorsType mimReference_authors,
           java.lang.String mimReference_primaryAuthor,
           java.lang.String mimReference_otherAuthors,
           java.lang.String mimReference_citationTitle,
           java.lang.String mimReference_citationType,
           java.lang.String mimReference_bookTitle,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimReference_editorsType mimReference_editors,
           java.lang.String mimReference_volume,
           java.lang.String mimReference_edition,
           java.lang.String mimReference_journal,
           java.lang.String mimReference_series,
           java.lang.String mimReference_publisher,
           java.lang.String mimReference_place,
           java.lang.String mimReference_commNote,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimReference_pubDateType mimReference_pubDate,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimReference_pagesType mimReference_pages,
           java.lang.String mimReference_miscInfo,
           java.lang.String mimReference_pubmedUID,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimReference_ambiguousType mimReference_ambiguous,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimReference_noLinkType mimReference_noLink) {
           this.mimReference_number = mimReference_number;
           this.mimReference_origNumber = mimReference_origNumber;
           this.mimReference_type = mimReference_type;
           this.mimReference_authors = mimReference_authors;
           this.mimReference_primaryAuthor = mimReference_primaryAuthor;
           this.mimReference_otherAuthors = mimReference_otherAuthors;
           this.mimReference_citationTitle = mimReference_citationTitle;
           this.mimReference_citationType = mimReference_citationType;
           this.mimReference_bookTitle = mimReference_bookTitle;
           this.mimReference_editors = mimReference_editors;
           this.mimReference_volume = mimReference_volume;
           this.mimReference_edition = mimReference_edition;
           this.mimReference_journal = mimReference_journal;
           this.mimReference_series = mimReference_series;
           this.mimReference_publisher = mimReference_publisher;
           this.mimReference_place = mimReference_place;
           this.mimReference_commNote = mimReference_commNote;
           this.mimReference_pubDate = mimReference_pubDate;
           this.mimReference_pages = mimReference_pages;
           this.mimReference_miscInfo = mimReference_miscInfo;
           this.mimReference_pubmedUID = mimReference_pubmedUID;
           this.mimReference_ambiguous = mimReference_ambiguous;
           this.mimReference_noLink = mimReference_noLink;
    }


    /**
     * Gets the mimReference_number value for this MimReferenceType.
     * 
     * @return mimReference_number
     */
    public java.lang.String getMimReference_number() {
        return mimReference_number;
    }


    /**
     * Sets the mimReference_number value for this MimReferenceType.
     * 
     * @param mimReference_number
     */
    public void setMimReference_number(java.lang.String mimReference_number) {
        this.mimReference_number = mimReference_number;
    }


    /**
     * Gets the mimReference_origNumber value for this MimReferenceType.
     * 
     * @return mimReference_origNumber
     */
    public java.lang.String getMimReference_origNumber() {
        return mimReference_origNumber;
    }


    /**
     * Sets the mimReference_origNumber value for this MimReferenceType.
     * 
     * @param mimReference_origNumber
     */
    public void setMimReference_origNumber(java.lang.String mimReference_origNumber) {
        this.mimReference_origNumber = mimReference_origNumber;
    }


    /**
     * Gets the mimReference_type value for this MimReferenceType.
     * 
     * @return mimReference_type
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimReference_typeType getMimReference_type() {
        return mimReference_type;
    }


    /**
     * Sets the mimReference_type value for this MimReferenceType.
     * 
     * @param mimReference_type
     */
    public void setMimReference_type(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimReference_typeType mimReference_type) {
        this.mimReference_type = mimReference_type;
    }


    /**
     * Gets the mimReference_authors value for this MimReferenceType.
     * 
     * @return mimReference_authors
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimReference_authorsType getMimReference_authors() {
        return mimReference_authors;
    }


    /**
     * Sets the mimReference_authors value for this MimReferenceType.
     * 
     * @param mimReference_authors
     */
    public void setMimReference_authors(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimReference_authorsType mimReference_authors) {
        this.mimReference_authors = mimReference_authors;
    }


    /**
     * Gets the mimReference_primaryAuthor value for this MimReferenceType.
     * 
     * @return mimReference_primaryAuthor
     */
    public java.lang.String getMimReference_primaryAuthor() {
        return mimReference_primaryAuthor;
    }


    /**
     * Sets the mimReference_primaryAuthor value for this MimReferenceType.
     * 
     * @param mimReference_primaryAuthor
     */
    public void setMimReference_primaryAuthor(java.lang.String mimReference_primaryAuthor) {
        this.mimReference_primaryAuthor = mimReference_primaryAuthor;
    }


    /**
     * Gets the mimReference_otherAuthors value for this MimReferenceType.
     * 
     * @return mimReference_otherAuthors
     */
    public java.lang.String getMimReference_otherAuthors() {
        return mimReference_otherAuthors;
    }


    /**
     * Sets the mimReference_otherAuthors value for this MimReferenceType.
     * 
     * @param mimReference_otherAuthors
     */
    public void setMimReference_otherAuthors(java.lang.String mimReference_otherAuthors) {
        this.mimReference_otherAuthors = mimReference_otherAuthors;
    }


    /**
     * Gets the mimReference_citationTitle value for this MimReferenceType.
     * 
     * @return mimReference_citationTitle
     */
    public java.lang.String getMimReference_citationTitle() {
        return mimReference_citationTitle;
    }


    /**
     * Sets the mimReference_citationTitle value for this MimReferenceType.
     * 
     * @param mimReference_citationTitle
     */
    public void setMimReference_citationTitle(java.lang.String mimReference_citationTitle) {
        this.mimReference_citationTitle = mimReference_citationTitle;
    }


    /**
     * Gets the mimReference_citationType value for this MimReferenceType.
     * 
     * @return mimReference_citationType
     */
    public java.lang.String getMimReference_citationType() {
        return mimReference_citationType;
    }


    /**
     * Sets the mimReference_citationType value for this MimReferenceType.
     * 
     * @param mimReference_citationType
     */
    public void setMimReference_citationType(java.lang.String mimReference_citationType) {
        this.mimReference_citationType = mimReference_citationType;
    }


    /**
     * Gets the mimReference_bookTitle value for this MimReferenceType.
     * 
     * @return mimReference_bookTitle
     */
    public java.lang.String getMimReference_bookTitle() {
        return mimReference_bookTitle;
    }


    /**
     * Sets the mimReference_bookTitle value for this MimReferenceType.
     * 
     * @param mimReference_bookTitle
     */
    public void setMimReference_bookTitle(java.lang.String mimReference_bookTitle) {
        this.mimReference_bookTitle = mimReference_bookTitle;
    }


    /**
     * Gets the mimReference_editors value for this MimReferenceType.
     * 
     * @return mimReference_editors
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimReference_editorsType getMimReference_editors() {
        return mimReference_editors;
    }


    /**
     * Sets the mimReference_editors value for this MimReferenceType.
     * 
     * @param mimReference_editors
     */
    public void setMimReference_editors(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimReference_editorsType mimReference_editors) {
        this.mimReference_editors = mimReference_editors;
    }


    /**
     * Gets the mimReference_volume value for this MimReferenceType.
     * 
     * @return mimReference_volume
     */
    public java.lang.String getMimReference_volume() {
        return mimReference_volume;
    }


    /**
     * Sets the mimReference_volume value for this MimReferenceType.
     * 
     * @param mimReference_volume
     */
    public void setMimReference_volume(java.lang.String mimReference_volume) {
        this.mimReference_volume = mimReference_volume;
    }


    /**
     * Gets the mimReference_edition value for this MimReferenceType.
     * 
     * @return mimReference_edition
     */
    public java.lang.String getMimReference_edition() {
        return mimReference_edition;
    }


    /**
     * Sets the mimReference_edition value for this MimReferenceType.
     * 
     * @param mimReference_edition
     */
    public void setMimReference_edition(java.lang.String mimReference_edition) {
        this.mimReference_edition = mimReference_edition;
    }


    /**
     * Gets the mimReference_journal value for this MimReferenceType.
     * 
     * @return mimReference_journal
     */
    public java.lang.String getMimReference_journal() {
        return mimReference_journal;
    }


    /**
     * Sets the mimReference_journal value for this MimReferenceType.
     * 
     * @param mimReference_journal
     */
    public void setMimReference_journal(java.lang.String mimReference_journal) {
        this.mimReference_journal = mimReference_journal;
    }


    /**
     * Gets the mimReference_series value for this MimReferenceType.
     * 
     * @return mimReference_series
     */
    public java.lang.String getMimReference_series() {
        return mimReference_series;
    }


    /**
     * Sets the mimReference_series value for this MimReferenceType.
     * 
     * @param mimReference_series
     */
    public void setMimReference_series(java.lang.String mimReference_series) {
        this.mimReference_series = mimReference_series;
    }


    /**
     * Gets the mimReference_publisher value for this MimReferenceType.
     * 
     * @return mimReference_publisher
     */
    public java.lang.String getMimReference_publisher() {
        return mimReference_publisher;
    }


    /**
     * Sets the mimReference_publisher value for this MimReferenceType.
     * 
     * @param mimReference_publisher
     */
    public void setMimReference_publisher(java.lang.String mimReference_publisher) {
        this.mimReference_publisher = mimReference_publisher;
    }


    /**
     * Gets the mimReference_place value for this MimReferenceType.
     * 
     * @return mimReference_place
     */
    public java.lang.String getMimReference_place() {
        return mimReference_place;
    }


    /**
     * Sets the mimReference_place value for this MimReferenceType.
     * 
     * @param mimReference_place
     */
    public void setMimReference_place(java.lang.String mimReference_place) {
        this.mimReference_place = mimReference_place;
    }


    /**
     * Gets the mimReference_commNote value for this MimReferenceType.
     * 
     * @return mimReference_commNote
     */
    public java.lang.String getMimReference_commNote() {
        return mimReference_commNote;
    }


    /**
     * Sets the mimReference_commNote value for this MimReferenceType.
     * 
     * @param mimReference_commNote
     */
    public void setMimReference_commNote(java.lang.String mimReference_commNote) {
        this.mimReference_commNote = mimReference_commNote;
    }


    /**
     * Gets the mimReference_pubDate value for this MimReferenceType.
     * 
     * @return mimReference_pubDate
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimReference_pubDateType getMimReference_pubDate() {
        return mimReference_pubDate;
    }


    /**
     * Sets the mimReference_pubDate value for this MimReferenceType.
     * 
     * @param mimReference_pubDate
     */
    public void setMimReference_pubDate(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimReference_pubDateType mimReference_pubDate) {
        this.mimReference_pubDate = mimReference_pubDate;
    }


    /**
     * Gets the mimReference_pages value for this MimReferenceType.
     * 
     * @return mimReference_pages
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimReference_pagesType getMimReference_pages() {
        return mimReference_pages;
    }


    /**
     * Sets the mimReference_pages value for this MimReferenceType.
     * 
     * @param mimReference_pages
     */
    public void setMimReference_pages(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimReference_pagesType mimReference_pages) {
        this.mimReference_pages = mimReference_pages;
    }


    /**
     * Gets the mimReference_miscInfo value for this MimReferenceType.
     * 
     * @return mimReference_miscInfo
     */
    public java.lang.String getMimReference_miscInfo() {
        return mimReference_miscInfo;
    }


    /**
     * Sets the mimReference_miscInfo value for this MimReferenceType.
     * 
     * @param mimReference_miscInfo
     */
    public void setMimReference_miscInfo(java.lang.String mimReference_miscInfo) {
        this.mimReference_miscInfo = mimReference_miscInfo;
    }


    /**
     * Gets the mimReference_pubmedUID value for this MimReferenceType.
     * 
     * @return mimReference_pubmedUID
     */
    public java.lang.String getMimReference_pubmedUID() {
        return mimReference_pubmedUID;
    }


    /**
     * Sets the mimReference_pubmedUID value for this MimReferenceType.
     * 
     * @param mimReference_pubmedUID
     */
    public void setMimReference_pubmedUID(java.lang.String mimReference_pubmedUID) {
        this.mimReference_pubmedUID = mimReference_pubmedUID;
    }


    /**
     * Gets the mimReference_ambiguous value for this MimReferenceType.
     * 
     * @return mimReference_ambiguous
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimReference_ambiguousType getMimReference_ambiguous() {
        return mimReference_ambiguous;
    }


    /**
     * Sets the mimReference_ambiguous value for this MimReferenceType.
     * 
     * @param mimReference_ambiguous
     */
    public void setMimReference_ambiguous(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimReference_ambiguousType mimReference_ambiguous) {
        this.mimReference_ambiguous = mimReference_ambiguous;
    }


    /**
     * Gets the mimReference_noLink value for this MimReferenceType.
     * 
     * @return mimReference_noLink
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimReference_noLinkType getMimReference_noLink() {
        return mimReference_noLink;
    }


    /**
     * Sets the mimReference_noLink value for this MimReferenceType.
     * 
     * @param mimReference_noLink
     */
    public void setMimReference_noLink(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimReference_noLinkType mimReference_noLink) {
        this.mimReference_noLink = mimReference_noLink;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MimReferenceType)) return false;
        MimReferenceType other = (MimReferenceType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.mimReference_number==null && other.getMimReference_number()==null) || 
             (this.mimReference_number!=null &&
              this.mimReference_number.equals(other.getMimReference_number()))) &&
            ((this.mimReference_origNumber==null && other.getMimReference_origNumber()==null) || 
             (this.mimReference_origNumber!=null &&
              this.mimReference_origNumber.equals(other.getMimReference_origNumber()))) &&
            ((this.mimReference_type==null && other.getMimReference_type()==null) || 
             (this.mimReference_type!=null &&
              this.mimReference_type.equals(other.getMimReference_type()))) &&
            ((this.mimReference_authors==null && other.getMimReference_authors()==null) || 
             (this.mimReference_authors!=null &&
              this.mimReference_authors.equals(other.getMimReference_authors()))) &&
            ((this.mimReference_primaryAuthor==null && other.getMimReference_primaryAuthor()==null) || 
             (this.mimReference_primaryAuthor!=null &&
              this.mimReference_primaryAuthor.equals(other.getMimReference_primaryAuthor()))) &&
            ((this.mimReference_otherAuthors==null && other.getMimReference_otherAuthors()==null) || 
             (this.mimReference_otherAuthors!=null &&
              this.mimReference_otherAuthors.equals(other.getMimReference_otherAuthors()))) &&
            ((this.mimReference_citationTitle==null && other.getMimReference_citationTitle()==null) || 
             (this.mimReference_citationTitle!=null &&
              this.mimReference_citationTitle.equals(other.getMimReference_citationTitle()))) &&
            ((this.mimReference_citationType==null && other.getMimReference_citationType()==null) || 
             (this.mimReference_citationType!=null &&
              this.mimReference_citationType.equals(other.getMimReference_citationType()))) &&
            ((this.mimReference_bookTitle==null && other.getMimReference_bookTitle()==null) || 
             (this.mimReference_bookTitle!=null &&
              this.mimReference_bookTitle.equals(other.getMimReference_bookTitle()))) &&
            ((this.mimReference_editors==null && other.getMimReference_editors()==null) || 
             (this.mimReference_editors!=null &&
              this.mimReference_editors.equals(other.getMimReference_editors()))) &&
            ((this.mimReference_volume==null && other.getMimReference_volume()==null) || 
             (this.mimReference_volume!=null &&
              this.mimReference_volume.equals(other.getMimReference_volume()))) &&
            ((this.mimReference_edition==null && other.getMimReference_edition()==null) || 
             (this.mimReference_edition!=null &&
              this.mimReference_edition.equals(other.getMimReference_edition()))) &&
            ((this.mimReference_journal==null && other.getMimReference_journal()==null) || 
             (this.mimReference_journal!=null &&
              this.mimReference_journal.equals(other.getMimReference_journal()))) &&
            ((this.mimReference_series==null && other.getMimReference_series()==null) || 
             (this.mimReference_series!=null &&
              this.mimReference_series.equals(other.getMimReference_series()))) &&
            ((this.mimReference_publisher==null && other.getMimReference_publisher()==null) || 
             (this.mimReference_publisher!=null &&
              this.mimReference_publisher.equals(other.getMimReference_publisher()))) &&
            ((this.mimReference_place==null && other.getMimReference_place()==null) || 
             (this.mimReference_place!=null &&
              this.mimReference_place.equals(other.getMimReference_place()))) &&
            ((this.mimReference_commNote==null && other.getMimReference_commNote()==null) || 
             (this.mimReference_commNote!=null &&
              this.mimReference_commNote.equals(other.getMimReference_commNote()))) &&
            ((this.mimReference_pubDate==null && other.getMimReference_pubDate()==null) || 
             (this.mimReference_pubDate!=null &&
              this.mimReference_pubDate.equals(other.getMimReference_pubDate()))) &&
            ((this.mimReference_pages==null && other.getMimReference_pages()==null) || 
             (this.mimReference_pages!=null &&
              this.mimReference_pages.equals(other.getMimReference_pages()))) &&
            ((this.mimReference_miscInfo==null && other.getMimReference_miscInfo()==null) || 
             (this.mimReference_miscInfo!=null &&
              this.mimReference_miscInfo.equals(other.getMimReference_miscInfo()))) &&
            ((this.mimReference_pubmedUID==null && other.getMimReference_pubmedUID()==null) || 
             (this.mimReference_pubmedUID!=null &&
              this.mimReference_pubmedUID.equals(other.getMimReference_pubmedUID()))) &&
            ((this.mimReference_ambiguous==null && other.getMimReference_ambiguous()==null) || 
             (this.mimReference_ambiguous!=null &&
              this.mimReference_ambiguous.equals(other.getMimReference_ambiguous()))) &&
            ((this.mimReference_noLink==null && other.getMimReference_noLink()==null) || 
             (this.mimReference_noLink!=null &&
              this.mimReference_noLink.equals(other.getMimReference_noLink())));
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
        if (getMimReference_number() != null) {
            _hashCode += getMimReference_number().hashCode();
        }
        if (getMimReference_origNumber() != null) {
            _hashCode += getMimReference_origNumber().hashCode();
        }
        if (getMimReference_type() != null) {
            _hashCode += getMimReference_type().hashCode();
        }
        if (getMimReference_authors() != null) {
            _hashCode += getMimReference_authors().hashCode();
        }
        if (getMimReference_primaryAuthor() != null) {
            _hashCode += getMimReference_primaryAuthor().hashCode();
        }
        if (getMimReference_otherAuthors() != null) {
            _hashCode += getMimReference_otherAuthors().hashCode();
        }
        if (getMimReference_citationTitle() != null) {
            _hashCode += getMimReference_citationTitle().hashCode();
        }
        if (getMimReference_citationType() != null) {
            _hashCode += getMimReference_citationType().hashCode();
        }
        if (getMimReference_bookTitle() != null) {
            _hashCode += getMimReference_bookTitle().hashCode();
        }
        if (getMimReference_editors() != null) {
            _hashCode += getMimReference_editors().hashCode();
        }
        if (getMimReference_volume() != null) {
            _hashCode += getMimReference_volume().hashCode();
        }
        if (getMimReference_edition() != null) {
            _hashCode += getMimReference_edition().hashCode();
        }
        if (getMimReference_journal() != null) {
            _hashCode += getMimReference_journal().hashCode();
        }
        if (getMimReference_series() != null) {
            _hashCode += getMimReference_series().hashCode();
        }
        if (getMimReference_publisher() != null) {
            _hashCode += getMimReference_publisher().hashCode();
        }
        if (getMimReference_place() != null) {
            _hashCode += getMimReference_place().hashCode();
        }
        if (getMimReference_commNote() != null) {
            _hashCode += getMimReference_commNote().hashCode();
        }
        if (getMimReference_pubDate() != null) {
            _hashCode += getMimReference_pubDate().hashCode();
        }
        if (getMimReference_pages() != null) {
            _hashCode += getMimReference_pages().hashCode();
        }
        if (getMimReference_miscInfo() != null) {
            _hashCode += getMimReference_miscInfo().hashCode();
        }
        if (getMimReference_pubmedUID() != null) {
            _hashCode += getMimReference_pubmedUID().hashCode();
        }
        if (getMimReference_ambiguous() != null) {
            _hashCode += getMimReference_ambiguous().hashCode();
        }
        if (getMimReference_noLink() != null) {
            _hashCode += getMimReference_noLink().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MimReferenceType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-referenceType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mimReference_number");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-reference_number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mimReference_origNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-reference_origNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mimReference_type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-reference_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-reference_typeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mimReference_authors");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-reference_authors"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-reference_authorsType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mimReference_primaryAuthor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-reference_primaryAuthor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mimReference_otherAuthors");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-reference_otherAuthors"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mimReference_citationTitle");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-reference_citationTitle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mimReference_citationType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-reference_citationType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mimReference_bookTitle");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-reference_bookTitle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mimReference_editors");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-reference_editors"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-reference_editorsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mimReference_volume");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-reference_volume"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mimReference_edition");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-reference_edition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mimReference_journal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-reference_journal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mimReference_series");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-reference_series"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mimReference_publisher");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-reference_publisher"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mimReference_place");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-reference_place"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mimReference_commNote");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-reference_commNote"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mimReference_pubDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-reference_pubDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-reference_pubDateType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mimReference_pages");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-reference_pages"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-reference_pagesType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mimReference_miscInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-reference_miscInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mimReference_pubmedUID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-reference_pubmedUID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mimReference_ambiguous");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-reference_ambiguous"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-reference_ambiguousType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mimReference_noLink");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-reference_noLink"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-reference_noLinkType"));
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
