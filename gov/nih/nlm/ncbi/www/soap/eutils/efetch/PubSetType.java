/**
 * PubSetType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class PubSetType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PubSet_pubType pubSet_pub;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PubSet_medlineType pubSet_medline;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PubSet_articleType pubSet_article;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PubSet_journalType pubSet_journal;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PubSet_bookType pubSet_book;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PubSet_procType pubSet_proc;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PubSet_patentType pubSet_patent;

    public PubSetType() {
    }

    public PubSetType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PubSet_pubType pubSet_pub,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PubSet_medlineType pubSet_medline,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PubSet_articleType pubSet_article,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PubSet_journalType pubSet_journal,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PubSet_bookType pubSet_book,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PubSet_procType pubSet_proc,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PubSet_patentType pubSet_patent) {
           this.pubSet_pub = pubSet_pub;
           this.pubSet_medline = pubSet_medline;
           this.pubSet_article = pubSet_article;
           this.pubSet_journal = pubSet_journal;
           this.pubSet_book = pubSet_book;
           this.pubSet_proc = pubSet_proc;
           this.pubSet_patent = pubSet_patent;
    }


    /**
     * Gets the pubSet_pub value for this PubSetType.
     * 
     * @return pubSet_pub
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PubSet_pubType getPubSet_pub() {
        return pubSet_pub;
    }


    /**
     * Sets the pubSet_pub value for this PubSetType.
     * 
     * @param pubSet_pub
     */
    public void setPubSet_pub(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PubSet_pubType pubSet_pub) {
        this.pubSet_pub = pubSet_pub;
    }


    /**
     * Gets the pubSet_medline value for this PubSetType.
     * 
     * @return pubSet_medline
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PubSet_medlineType getPubSet_medline() {
        return pubSet_medline;
    }


    /**
     * Sets the pubSet_medline value for this PubSetType.
     * 
     * @param pubSet_medline
     */
    public void setPubSet_medline(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PubSet_medlineType pubSet_medline) {
        this.pubSet_medline = pubSet_medline;
    }


    /**
     * Gets the pubSet_article value for this PubSetType.
     * 
     * @return pubSet_article
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PubSet_articleType getPubSet_article() {
        return pubSet_article;
    }


    /**
     * Sets the pubSet_article value for this PubSetType.
     * 
     * @param pubSet_article
     */
    public void setPubSet_article(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PubSet_articleType pubSet_article) {
        this.pubSet_article = pubSet_article;
    }


    /**
     * Gets the pubSet_journal value for this PubSetType.
     * 
     * @return pubSet_journal
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PubSet_journalType getPubSet_journal() {
        return pubSet_journal;
    }


    /**
     * Sets the pubSet_journal value for this PubSetType.
     * 
     * @param pubSet_journal
     */
    public void setPubSet_journal(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PubSet_journalType pubSet_journal) {
        this.pubSet_journal = pubSet_journal;
    }


    /**
     * Gets the pubSet_book value for this PubSetType.
     * 
     * @return pubSet_book
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PubSet_bookType getPubSet_book() {
        return pubSet_book;
    }


    /**
     * Sets the pubSet_book value for this PubSetType.
     * 
     * @param pubSet_book
     */
    public void setPubSet_book(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PubSet_bookType pubSet_book) {
        this.pubSet_book = pubSet_book;
    }


    /**
     * Gets the pubSet_proc value for this PubSetType.
     * 
     * @return pubSet_proc
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PubSet_procType getPubSet_proc() {
        return pubSet_proc;
    }


    /**
     * Sets the pubSet_proc value for this PubSetType.
     * 
     * @param pubSet_proc
     */
    public void setPubSet_proc(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PubSet_procType pubSet_proc) {
        this.pubSet_proc = pubSet_proc;
    }


    /**
     * Gets the pubSet_patent value for this PubSetType.
     * 
     * @return pubSet_patent
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PubSet_patentType getPubSet_patent() {
        return pubSet_patent;
    }


    /**
     * Sets the pubSet_patent value for this PubSetType.
     * 
     * @param pubSet_patent
     */
    public void setPubSet_patent(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PubSet_patentType pubSet_patent) {
        this.pubSet_patent = pubSet_patent;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PubSetType)) return false;
        PubSetType other = (PubSetType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.pubSet_pub==null && other.getPubSet_pub()==null) || 
             (this.pubSet_pub!=null &&
              this.pubSet_pub.equals(other.getPubSet_pub()))) &&
            ((this.pubSet_medline==null && other.getPubSet_medline()==null) || 
             (this.pubSet_medline!=null &&
              this.pubSet_medline.equals(other.getPubSet_medline()))) &&
            ((this.pubSet_article==null && other.getPubSet_article()==null) || 
             (this.pubSet_article!=null &&
              this.pubSet_article.equals(other.getPubSet_article()))) &&
            ((this.pubSet_journal==null && other.getPubSet_journal()==null) || 
             (this.pubSet_journal!=null &&
              this.pubSet_journal.equals(other.getPubSet_journal()))) &&
            ((this.pubSet_book==null && other.getPubSet_book()==null) || 
             (this.pubSet_book!=null &&
              this.pubSet_book.equals(other.getPubSet_book()))) &&
            ((this.pubSet_proc==null && other.getPubSet_proc()==null) || 
             (this.pubSet_proc!=null &&
              this.pubSet_proc.equals(other.getPubSet_proc()))) &&
            ((this.pubSet_patent==null && other.getPubSet_patent()==null) || 
             (this.pubSet_patent!=null &&
              this.pubSet_patent.equals(other.getPubSet_patent())));
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
        if (getPubSet_pub() != null) {
            _hashCode += getPubSet_pub().hashCode();
        }
        if (getPubSet_medline() != null) {
            _hashCode += getPubSet_medline().hashCode();
        }
        if (getPubSet_article() != null) {
            _hashCode += getPubSet_article().hashCode();
        }
        if (getPubSet_journal() != null) {
            _hashCode += getPubSet_journal().hashCode();
        }
        if (getPubSet_book() != null) {
            _hashCode += getPubSet_book().hashCode();
        }
        if (getPubSet_proc() != null) {
            _hashCode += getPubSet_proc().hashCode();
        }
        if (getPubSet_patent() != null) {
            _hashCode += getPubSet_patent().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PubSetType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Pub-setType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pubSet_pub");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Pub-set_pub"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Pub-set_pubType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pubSet_medline");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Pub-set_medline"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Pub-set_medlineType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pubSet_article");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Pub-set_article"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Pub-set_articleType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pubSet_journal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Pub-set_journal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Pub-set_journalType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pubSet_book");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Pub-set_book"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Pub-set_bookType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pubSet_proc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Pub-set_proc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Pub-set_procType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pubSet_patent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Pub-set_patent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Pub-set_patentType"));
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
