/**
 * JournalMeta.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class JournalMeta  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.JournalId[] journalId;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.JournalTitle[] journalTitle;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.JournalSubtitle[] journalSubtitle;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.AbbrevJournalTitle[] abbrevJournalTitle;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Issn[] issn;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Publisher publisher;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Notes notes;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.CustomMetaWrap customMetaWrap;

    public JournalMeta() {
    }

    public JournalMeta(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.JournalId[] journalId,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.JournalTitle[] journalTitle,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.JournalSubtitle[] journalSubtitle,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.AbbrevJournalTitle[] abbrevJournalTitle,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Issn[] issn,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Publisher publisher,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Notes notes,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.CustomMetaWrap customMetaWrap) {
           this.journalId = journalId;
           this.journalTitle = journalTitle;
           this.journalSubtitle = journalSubtitle;
           this.abbrevJournalTitle = abbrevJournalTitle;
           this.issn = issn;
           this.publisher = publisher;
           this.notes = notes;
           this.customMetaWrap = customMetaWrap;
    }


    /**
     * Gets the journalId value for this JournalMeta.
     * 
     * @return journalId
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.JournalId[] getJournalId() {
        return journalId;
    }


    /**
     * Sets the journalId value for this JournalMeta.
     * 
     * @param journalId
     */
    public void setJournalId(gov.nih.nlm.ncbi.www.soap.eutils.efetch.JournalId[] journalId) {
        this.journalId = journalId;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.JournalId getJournalId(int i) {
        return this.journalId[i];
    }

    public void setJournalId(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.JournalId _value) {
        this.journalId[i] = _value;
    }


    /**
     * Gets the journalTitle value for this JournalMeta.
     * 
     * @return journalTitle
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.JournalTitle[] getJournalTitle() {
        return journalTitle;
    }


    /**
     * Sets the journalTitle value for this JournalMeta.
     * 
     * @param journalTitle
     */
    public void setJournalTitle(gov.nih.nlm.ncbi.www.soap.eutils.efetch.JournalTitle[] journalTitle) {
        this.journalTitle = journalTitle;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.JournalTitle getJournalTitle(int i) {
        return this.journalTitle[i];
    }

    public void setJournalTitle(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.JournalTitle _value) {
        this.journalTitle[i] = _value;
    }


    /**
     * Gets the journalSubtitle value for this JournalMeta.
     * 
     * @return journalSubtitle
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.JournalSubtitle[] getJournalSubtitle() {
        return journalSubtitle;
    }


    /**
     * Sets the journalSubtitle value for this JournalMeta.
     * 
     * @param journalSubtitle
     */
    public void setJournalSubtitle(gov.nih.nlm.ncbi.www.soap.eutils.efetch.JournalSubtitle[] journalSubtitle) {
        this.journalSubtitle = journalSubtitle;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.JournalSubtitle getJournalSubtitle(int i) {
        return this.journalSubtitle[i];
    }

    public void setJournalSubtitle(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.JournalSubtitle _value) {
        this.journalSubtitle[i] = _value;
    }


    /**
     * Gets the abbrevJournalTitle value for this JournalMeta.
     * 
     * @return abbrevJournalTitle
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.AbbrevJournalTitle[] getAbbrevJournalTitle() {
        return abbrevJournalTitle;
    }


    /**
     * Sets the abbrevJournalTitle value for this JournalMeta.
     * 
     * @param abbrevJournalTitle
     */
    public void setAbbrevJournalTitle(gov.nih.nlm.ncbi.www.soap.eutils.efetch.AbbrevJournalTitle[] abbrevJournalTitle) {
        this.abbrevJournalTitle = abbrevJournalTitle;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.AbbrevJournalTitle getAbbrevJournalTitle(int i) {
        return this.abbrevJournalTitle[i];
    }

    public void setAbbrevJournalTitle(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.AbbrevJournalTitle _value) {
        this.abbrevJournalTitle[i] = _value;
    }


    /**
     * Gets the issn value for this JournalMeta.
     * 
     * @return issn
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Issn[] getIssn() {
        return issn;
    }


    /**
     * Sets the issn value for this JournalMeta.
     * 
     * @param issn
     */
    public void setIssn(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Issn[] issn) {
        this.issn = issn;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Issn getIssn(int i) {
        return this.issn[i];
    }

    public void setIssn(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.Issn _value) {
        this.issn[i] = _value;
    }


    /**
     * Gets the publisher value for this JournalMeta.
     * 
     * @return publisher
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Publisher getPublisher() {
        return publisher;
    }


    /**
     * Sets the publisher value for this JournalMeta.
     * 
     * @param publisher
     */
    public void setPublisher(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Publisher publisher) {
        this.publisher = publisher;
    }


    /**
     * Gets the notes value for this JournalMeta.
     * 
     * @return notes
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Notes getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this JournalMeta.
     * 
     * @param notes
     */
    public void setNotes(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Notes notes) {
        this.notes = notes;
    }


    /**
     * Gets the customMetaWrap value for this JournalMeta.
     * 
     * @return customMetaWrap
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.CustomMetaWrap getCustomMetaWrap() {
        return customMetaWrap;
    }


    /**
     * Sets the customMetaWrap value for this JournalMeta.
     * 
     * @param customMetaWrap
     */
    public void setCustomMetaWrap(gov.nih.nlm.ncbi.www.soap.eutils.efetch.CustomMetaWrap customMetaWrap) {
        this.customMetaWrap = customMetaWrap;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof JournalMeta)) return false;
        JournalMeta other = (JournalMeta) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.journalId==null && other.getJournalId()==null) || 
             (this.journalId!=null &&
              java.util.Arrays.equals(this.journalId, other.getJournalId()))) &&
            ((this.journalTitle==null && other.getJournalTitle()==null) || 
             (this.journalTitle!=null &&
              java.util.Arrays.equals(this.journalTitle, other.getJournalTitle()))) &&
            ((this.journalSubtitle==null && other.getJournalSubtitle()==null) || 
             (this.journalSubtitle!=null &&
              java.util.Arrays.equals(this.journalSubtitle, other.getJournalSubtitle()))) &&
            ((this.abbrevJournalTitle==null && other.getAbbrevJournalTitle()==null) || 
             (this.abbrevJournalTitle!=null &&
              java.util.Arrays.equals(this.abbrevJournalTitle, other.getAbbrevJournalTitle()))) &&
            ((this.issn==null && other.getIssn()==null) || 
             (this.issn!=null &&
              java.util.Arrays.equals(this.issn, other.getIssn()))) &&
            ((this.publisher==null && other.getPublisher()==null) || 
             (this.publisher!=null &&
              this.publisher.equals(other.getPublisher()))) &&
            ((this.notes==null && other.getNotes()==null) || 
             (this.notes!=null &&
              this.notes.equals(other.getNotes()))) &&
            ((this.customMetaWrap==null && other.getCustomMetaWrap()==null) || 
             (this.customMetaWrap!=null &&
              this.customMetaWrap.equals(other.getCustomMetaWrap())));
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
        if (getJournalId() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getJournalId());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getJournalId(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getJournalTitle() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getJournalTitle());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getJournalTitle(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getJournalSubtitle() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getJournalSubtitle());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getJournalSubtitle(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAbbrevJournalTitle() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAbbrevJournalTitle());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAbbrevJournalTitle(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIssn() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIssn());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIssn(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPublisher() != null) {
            _hashCode += getPublisher().hashCode();
        }
        if (getNotes() != null) {
            _hashCode += getNotes().hashCode();
        }
        if (getCustomMetaWrap() != null) {
            _hashCode += getCustomMetaWrap().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(JournalMeta.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">journal-meta"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("journalId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "journal-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "journal-id"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("journalTitle");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "journal-title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "journal-title"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("journalSubtitle");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "journal-subtitle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "journal-subtitle"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("abbrevJournalTitle");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "abbrev-journal-title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "abbrev-journal-title"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("issn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "issn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "issn"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("publisher");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "publisher"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">publisher"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "notes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">notes"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customMetaWrap");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "custom-meta-wrap"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">custom-meta-wrap"));
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
