/**
 * PubType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class PubType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Pub_genType pub_gen;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Pub_subType pub_sub;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Pub_medlineType pub_medline;

    private java.lang.String pub_muid;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Pub_articleType pub_article;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Pub_journalType pub_journal;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Pub_bookType pub_book;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Pub_procType pub_proc;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Pub_patentType pub_patent;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Pub_patIdType pub_patId;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Pub_manType pub_man;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Pub_equivType pub_equiv;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Pub_pmidType pub_pmid;

    public PubType() {
    }

    public PubType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Pub_genType pub_gen,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Pub_subType pub_sub,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Pub_medlineType pub_medline,
           java.lang.String pub_muid,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Pub_articleType pub_article,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Pub_journalType pub_journal,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Pub_bookType pub_book,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Pub_procType pub_proc,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Pub_patentType pub_patent,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Pub_patIdType pub_patId,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Pub_manType pub_man,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Pub_equivType pub_equiv,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Pub_pmidType pub_pmid) {
           this.pub_gen = pub_gen;
           this.pub_sub = pub_sub;
           this.pub_medline = pub_medline;
           this.pub_muid = pub_muid;
           this.pub_article = pub_article;
           this.pub_journal = pub_journal;
           this.pub_book = pub_book;
           this.pub_proc = pub_proc;
           this.pub_patent = pub_patent;
           this.pub_patId = pub_patId;
           this.pub_man = pub_man;
           this.pub_equiv = pub_equiv;
           this.pub_pmid = pub_pmid;
    }


    /**
     * Gets the pub_gen value for this PubType.
     * 
     * @return pub_gen
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Pub_genType getPub_gen() {
        return pub_gen;
    }


    /**
     * Sets the pub_gen value for this PubType.
     * 
     * @param pub_gen
     */
    public void setPub_gen(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Pub_genType pub_gen) {
        this.pub_gen = pub_gen;
    }


    /**
     * Gets the pub_sub value for this PubType.
     * 
     * @return pub_sub
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Pub_subType getPub_sub() {
        return pub_sub;
    }


    /**
     * Sets the pub_sub value for this PubType.
     * 
     * @param pub_sub
     */
    public void setPub_sub(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Pub_subType pub_sub) {
        this.pub_sub = pub_sub;
    }


    /**
     * Gets the pub_medline value for this PubType.
     * 
     * @return pub_medline
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Pub_medlineType getPub_medline() {
        return pub_medline;
    }


    /**
     * Sets the pub_medline value for this PubType.
     * 
     * @param pub_medline
     */
    public void setPub_medline(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Pub_medlineType pub_medline) {
        this.pub_medline = pub_medline;
    }


    /**
     * Gets the pub_muid value for this PubType.
     * 
     * @return pub_muid
     */
    public java.lang.String getPub_muid() {
        return pub_muid;
    }


    /**
     * Sets the pub_muid value for this PubType.
     * 
     * @param pub_muid
     */
    public void setPub_muid(java.lang.String pub_muid) {
        this.pub_muid = pub_muid;
    }


    /**
     * Gets the pub_article value for this PubType.
     * 
     * @return pub_article
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Pub_articleType getPub_article() {
        return pub_article;
    }


    /**
     * Sets the pub_article value for this PubType.
     * 
     * @param pub_article
     */
    public void setPub_article(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Pub_articleType pub_article) {
        this.pub_article = pub_article;
    }


    /**
     * Gets the pub_journal value for this PubType.
     * 
     * @return pub_journal
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Pub_journalType getPub_journal() {
        return pub_journal;
    }


    /**
     * Sets the pub_journal value for this PubType.
     * 
     * @param pub_journal
     */
    public void setPub_journal(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Pub_journalType pub_journal) {
        this.pub_journal = pub_journal;
    }


    /**
     * Gets the pub_book value for this PubType.
     * 
     * @return pub_book
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Pub_bookType getPub_book() {
        return pub_book;
    }


    /**
     * Sets the pub_book value for this PubType.
     * 
     * @param pub_book
     */
    public void setPub_book(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Pub_bookType pub_book) {
        this.pub_book = pub_book;
    }


    /**
     * Gets the pub_proc value for this PubType.
     * 
     * @return pub_proc
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Pub_procType getPub_proc() {
        return pub_proc;
    }


    /**
     * Sets the pub_proc value for this PubType.
     * 
     * @param pub_proc
     */
    public void setPub_proc(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Pub_procType pub_proc) {
        this.pub_proc = pub_proc;
    }


    /**
     * Gets the pub_patent value for this PubType.
     * 
     * @return pub_patent
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Pub_patentType getPub_patent() {
        return pub_patent;
    }


    /**
     * Sets the pub_patent value for this PubType.
     * 
     * @param pub_patent
     */
    public void setPub_patent(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Pub_patentType pub_patent) {
        this.pub_patent = pub_patent;
    }


    /**
     * Gets the pub_patId value for this PubType.
     * 
     * @return pub_patId
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Pub_patIdType getPub_patId() {
        return pub_patId;
    }


    /**
     * Sets the pub_patId value for this PubType.
     * 
     * @param pub_patId
     */
    public void setPub_patId(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Pub_patIdType pub_patId) {
        this.pub_patId = pub_patId;
    }


    /**
     * Gets the pub_man value for this PubType.
     * 
     * @return pub_man
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Pub_manType getPub_man() {
        return pub_man;
    }


    /**
     * Sets the pub_man value for this PubType.
     * 
     * @param pub_man
     */
    public void setPub_man(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Pub_manType pub_man) {
        this.pub_man = pub_man;
    }


    /**
     * Gets the pub_equiv value for this PubType.
     * 
     * @return pub_equiv
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Pub_equivType getPub_equiv() {
        return pub_equiv;
    }


    /**
     * Sets the pub_equiv value for this PubType.
     * 
     * @param pub_equiv
     */
    public void setPub_equiv(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Pub_equivType pub_equiv) {
        this.pub_equiv = pub_equiv;
    }


    /**
     * Gets the pub_pmid value for this PubType.
     * 
     * @return pub_pmid
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Pub_pmidType getPub_pmid() {
        return pub_pmid;
    }


    /**
     * Sets the pub_pmid value for this PubType.
     * 
     * @param pub_pmid
     */
    public void setPub_pmid(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Pub_pmidType pub_pmid) {
        this.pub_pmid = pub_pmid;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PubType)) return false;
        PubType other = (PubType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.pub_gen==null && other.getPub_gen()==null) || 
             (this.pub_gen!=null &&
              this.pub_gen.equals(other.getPub_gen()))) &&
            ((this.pub_sub==null && other.getPub_sub()==null) || 
             (this.pub_sub!=null &&
              this.pub_sub.equals(other.getPub_sub()))) &&
            ((this.pub_medline==null && other.getPub_medline()==null) || 
             (this.pub_medline!=null &&
              this.pub_medline.equals(other.getPub_medline()))) &&
            ((this.pub_muid==null && other.getPub_muid()==null) || 
             (this.pub_muid!=null &&
              this.pub_muid.equals(other.getPub_muid()))) &&
            ((this.pub_article==null && other.getPub_article()==null) || 
             (this.pub_article!=null &&
              this.pub_article.equals(other.getPub_article()))) &&
            ((this.pub_journal==null && other.getPub_journal()==null) || 
             (this.pub_journal!=null &&
              this.pub_journal.equals(other.getPub_journal()))) &&
            ((this.pub_book==null && other.getPub_book()==null) || 
             (this.pub_book!=null &&
              this.pub_book.equals(other.getPub_book()))) &&
            ((this.pub_proc==null && other.getPub_proc()==null) || 
             (this.pub_proc!=null &&
              this.pub_proc.equals(other.getPub_proc()))) &&
            ((this.pub_patent==null && other.getPub_patent()==null) || 
             (this.pub_patent!=null &&
              this.pub_patent.equals(other.getPub_patent()))) &&
            ((this.pub_patId==null && other.getPub_patId()==null) || 
             (this.pub_patId!=null &&
              this.pub_patId.equals(other.getPub_patId()))) &&
            ((this.pub_man==null && other.getPub_man()==null) || 
             (this.pub_man!=null &&
              this.pub_man.equals(other.getPub_man()))) &&
            ((this.pub_equiv==null && other.getPub_equiv()==null) || 
             (this.pub_equiv!=null &&
              this.pub_equiv.equals(other.getPub_equiv()))) &&
            ((this.pub_pmid==null && other.getPub_pmid()==null) || 
             (this.pub_pmid!=null &&
              this.pub_pmid.equals(other.getPub_pmid())));
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
        if (getPub_gen() != null) {
            _hashCode += getPub_gen().hashCode();
        }
        if (getPub_sub() != null) {
            _hashCode += getPub_sub().hashCode();
        }
        if (getPub_medline() != null) {
            _hashCode += getPub_medline().hashCode();
        }
        if (getPub_muid() != null) {
            _hashCode += getPub_muid().hashCode();
        }
        if (getPub_article() != null) {
            _hashCode += getPub_article().hashCode();
        }
        if (getPub_journal() != null) {
            _hashCode += getPub_journal().hashCode();
        }
        if (getPub_book() != null) {
            _hashCode += getPub_book().hashCode();
        }
        if (getPub_proc() != null) {
            _hashCode += getPub_proc().hashCode();
        }
        if (getPub_patent() != null) {
            _hashCode += getPub_patent().hashCode();
        }
        if (getPub_patId() != null) {
            _hashCode += getPub_patId().hashCode();
        }
        if (getPub_man() != null) {
            _hashCode += getPub_man().hashCode();
        }
        if (getPub_equiv() != null) {
            _hashCode += getPub_equiv().hashCode();
        }
        if (getPub_pmid() != null) {
            _hashCode += getPub_pmid().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PubType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PubType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pub_gen");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Pub_gen"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Pub_genType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pub_sub");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Pub_sub"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Pub_subType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pub_medline");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Pub_medline"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Pub_medlineType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pub_muid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Pub_muid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pub_article");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Pub_article"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Pub_articleType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pub_journal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Pub_journal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Pub_journalType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pub_book");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Pub_book"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Pub_bookType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pub_proc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Pub_proc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Pub_procType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pub_patent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Pub_patent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Pub_patentType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pub_patId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Pub_pat-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Pub_pat-idType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pub_man");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Pub_man"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Pub_manType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pub_equiv");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Pub_equiv"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Pub_equivType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pub_pmid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Pub_pmid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Pub_pmidType"));
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
