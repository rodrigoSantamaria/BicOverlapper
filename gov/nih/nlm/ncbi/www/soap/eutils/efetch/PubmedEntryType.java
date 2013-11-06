/**
 * PubmedEntryType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class PubmedEntryType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PubmedEntry_pmidType pubmedEntry_pmid;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PubmedEntry_medentType pubmedEntry_medent;

    private java.lang.String pubmedEntry_publisher;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PubmedEntry_urlsType pubmedEntry_urls;

    private java.lang.String pubmedEntry_pubid;

    public PubmedEntryType() {
    }

    public PubmedEntryType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PubmedEntry_pmidType pubmedEntry_pmid,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PubmedEntry_medentType pubmedEntry_medent,
           java.lang.String pubmedEntry_publisher,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PubmedEntry_urlsType pubmedEntry_urls,
           java.lang.String pubmedEntry_pubid) {
           this.pubmedEntry_pmid = pubmedEntry_pmid;
           this.pubmedEntry_medent = pubmedEntry_medent;
           this.pubmedEntry_publisher = pubmedEntry_publisher;
           this.pubmedEntry_urls = pubmedEntry_urls;
           this.pubmedEntry_pubid = pubmedEntry_pubid;
    }


    /**
     * Gets the pubmedEntry_pmid value for this PubmedEntryType.
     * 
     * @return pubmedEntry_pmid
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PubmedEntry_pmidType getPubmedEntry_pmid() {
        return pubmedEntry_pmid;
    }


    /**
     * Sets the pubmedEntry_pmid value for this PubmedEntryType.
     * 
     * @param pubmedEntry_pmid
     */
    public void setPubmedEntry_pmid(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PubmedEntry_pmidType pubmedEntry_pmid) {
        this.pubmedEntry_pmid = pubmedEntry_pmid;
    }


    /**
     * Gets the pubmedEntry_medent value for this PubmedEntryType.
     * 
     * @return pubmedEntry_medent
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PubmedEntry_medentType getPubmedEntry_medent() {
        return pubmedEntry_medent;
    }


    /**
     * Sets the pubmedEntry_medent value for this PubmedEntryType.
     * 
     * @param pubmedEntry_medent
     */
    public void setPubmedEntry_medent(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PubmedEntry_medentType pubmedEntry_medent) {
        this.pubmedEntry_medent = pubmedEntry_medent;
    }


    /**
     * Gets the pubmedEntry_publisher value for this PubmedEntryType.
     * 
     * @return pubmedEntry_publisher
     */
    public java.lang.String getPubmedEntry_publisher() {
        return pubmedEntry_publisher;
    }


    /**
     * Sets the pubmedEntry_publisher value for this PubmedEntryType.
     * 
     * @param pubmedEntry_publisher
     */
    public void setPubmedEntry_publisher(java.lang.String pubmedEntry_publisher) {
        this.pubmedEntry_publisher = pubmedEntry_publisher;
    }


    /**
     * Gets the pubmedEntry_urls value for this PubmedEntryType.
     * 
     * @return pubmedEntry_urls
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PubmedEntry_urlsType getPubmedEntry_urls() {
        return pubmedEntry_urls;
    }


    /**
     * Sets the pubmedEntry_urls value for this PubmedEntryType.
     * 
     * @param pubmedEntry_urls
     */
    public void setPubmedEntry_urls(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PubmedEntry_urlsType pubmedEntry_urls) {
        this.pubmedEntry_urls = pubmedEntry_urls;
    }


    /**
     * Gets the pubmedEntry_pubid value for this PubmedEntryType.
     * 
     * @return pubmedEntry_pubid
     */
    public java.lang.String getPubmedEntry_pubid() {
        return pubmedEntry_pubid;
    }


    /**
     * Sets the pubmedEntry_pubid value for this PubmedEntryType.
     * 
     * @param pubmedEntry_pubid
     */
    public void setPubmedEntry_pubid(java.lang.String pubmedEntry_pubid) {
        this.pubmedEntry_pubid = pubmedEntry_pubid;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PubmedEntryType)) return false;
        PubmedEntryType other = (PubmedEntryType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.pubmedEntry_pmid==null && other.getPubmedEntry_pmid()==null) || 
             (this.pubmedEntry_pmid!=null &&
              this.pubmedEntry_pmid.equals(other.getPubmedEntry_pmid()))) &&
            ((this.pubmedEntry_medent==null && other.getPubmedEntry_medent()==null) || 
             (this.pubmedEntry_medent!=null &&
              this.pubmedEntry_medent.equals(other.getPubmedEntry_medent()))) &&
            ((this.pubmedEntry_publisher==null && other.getPubmedEntry_publisher()==null) || 
             (this.pubmedEntry_publisher!=null &&
              this.pubmedEntry_publisher.equals(other.getPubmedEntry_publisher()))) &&
            ((this.pubmedEntry_urls==null && other.getPubmedEntry_urls()==null) || 
             (this.pubmedEntry_urls!=null &&
              this.pubmedEntry_urls.equals(other.getPubmedEntry_urls()))) &&
            ((this.pubmedEntry_pubid==null && other.getPubmedEntry_pubid()==null) || 
             (this.pubmedEntry_pubid!=null &&
              this.pubmedEntry_pubid.equals(other.getPubmedEntry_pubid())));
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
        if (getPubmedEntry_pmid() != null) {
            _hashCode += getPubmedEntry_pmid().hashCode();
        }
        if (getPubmedEntry_medent() != null) {
            _hashCode += getPubmedEntry_medent().hashCode();
        }
        if (getPubmedEntry_publisher() != null) {
            _hashCode += getPubmedEntry_publisher().hashCode();
        }
        if (getPubmedEntry_urls() != null) {
            _hashCode += getPubmedEntry_urls().hashCode();
        }
        if (getPubmedEntry_pubid() != null) {
            _hashCode += getPubmedEntry_pubid().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PubmedEntryType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Pubmed-entryType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pubmedEntry_pmid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Pubmed-entry_pmid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Pubmed-entry_pmidType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pubmedEntry_medent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Pubmed-entry_medent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Pubmed-entry_medentType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pubmedEntry_publisher");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Pubmed-entry_publisher"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pubmedEntry_urls");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Pubmed-entry_urls"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Pubmed-entry_urlsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pubmedEntry_pubid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Pubmed-entry_pubid"));
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
