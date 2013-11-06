/**
 * EFetchResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class EFetchResult  implements java.io.Serializable {
    private java.lang.String ERROR;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.NLMCatalogRecordSetType NLMCatalogRecordSet;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PubmedArticleSetType pubmedArticleSet;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PmcArticlesetType pmcArticleset;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimEntries mimEntries;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.TaxaSetType taxaSet;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.TSeqSet TSeqSet;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.GBSet GBSet;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.BioseqSetType bioseqSet;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.EntrezgeneSet entrezgeneSet;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ExchangeSet exchangeSet;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.IdListType idList;

    public EFetchResult() {
    }

    public EFetchResult(
           java.lang.String ERROR,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.NLMCatalogRecordSetType NLMCatalogRecordSet,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PubmedArticleSetType pubmedArticleSet,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PmcArticlesetType pmcArticleset,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimEntries mimEntries,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.TaxaSetType taxaSet,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.TSeqSet TSeqSet,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.GBSet GBSet,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.BioseqSetType bioseqSet,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.EntrezgeneSet entrezgeneSet,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ExchangeSet exchangeSet,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.IdListType idList) {
           this.ERROR = ERROR;
           this.NLMCatalogRecordSet = NLMCatalogRecordSet;
           this.pubmedArticleSet = pubmedArticleSet;
           this.pmcArticleset = pmcArticleset;
           this.mimEntries = mimEntries;
           this.taxaSet = taxaSet;
           this.TSeqSet = TSeqSet;
           this.GBSet = GBSet;
           this.bioseqSet = bioseqSet;
           this.entrezgeneSet = entrezgeneSet;
           this.exchangeSet = exchangeSet;
           this.idList = idList;
    }


    /**
     * Gets the ERROR value for this EFetchResult.
     * 
     * @return ERROR
     */
    public java.lang.String getERROR() {
        return ERROR;
    }


    /**
     * Sets the ERROR value for this EFetchResult.
     * 
     * @param ERROR
     */
    public void setERROR(java.lang.String ERROR) {
        this.ERROR = ERROR;
    }


    /**
     * Gets the NLMCatalogRecordSet value for this EFetchResult.
     * 
     * @return NLMCatalogRecordSet
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.NLMCatalogRecordSetType getNLMCatalogRecordSet() {
        return NLMCatalogRecordSet;
    }


    /**
     * Sets the NLMCatalogRecordSet value for this EFetchResult.
     * 
     * @param NLMCatalogRecordSet
     */
    public void setNLMCatalogRecordSet(gov.nih.nlm.ncbi.www.soap.eutils.efetch.NLMCatalogRecordSetType NLMCatalogRecordSet) {
        this.NLMCatalogRecordSet = NLMCatalogRecordSet;
    }


    /**
     * Gets the pubmedArticleSet value for this EFetchResult.
     * 
     * @return pubmedArticleSet
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PubmedArticleSetType getPubmedArticleSet() {
        return pubmedArticleSet;
    }


    /**
     * Sets the pubmedArticleSet value for this EFetchResult.
     * 
     * @param pubmedArticleSet
     */
    public void setPubmedArticleSet(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PubmedArticleSetType pubmedArticleSet) {
        this.pubmedArticleSet = pubmedArticleSet;
    }


    /**
     * Gets the pmcArticleset value for this EFetchResult.
     * 
     * @return pmcArticleset
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PmcArticlesetType getPmcArticleset() {
        return pmcArticleset;
    }


    /**
     * Sets the pmcArticleset value for this EFetchResult.
     * 
     * @param pmcArticleset
     */
    public void setPmcArticleset(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PmcArticlesetType pmcArticleset) {
        this.pmcArticleset = pmcArticleset;
    }


    /**
     * Gets the mimEntries value for this EFetchResult.
     * 
     * @return mimEntries
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimEntries getMimEntries() {
        return mimEntries;
    }


    /**
     * Sets the mimEntries value for this EFetchResult.
     * 
     * @param mimEntries
     */
    public void setMimEntries(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimEntries mimEntries) {
        this.mimEntries = mimEntries;
    }


    /**
     * Gets the taxaSet value for this EFetchResult.
     * 
     * @return taxaSet
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.TaxaSetType getTaxaSet() {
        return taxaSet;
    }


    /**
     * Sets the taxaSet value for this EFetchResult.
     * 
     * @param taxaSet
     */
    public void setTaxaSet(gov.nih.nlm.ncbi.www.soap.eutils.efetch.TaxaSetType taxaSet) {
        this.taxaSet = taxaSet;
    }


    /**
     * Gets the TSeqSet value for this EFetchResult.
     * 
     * @return TSeqSet
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.TSeqSet getTSeqSet() {
        return TSeqSet;
    }


    /**
     * Sets the TSeqSet value for this EFetchResult.
     * 
     * @param TSeqSet
     */
    public void setTSeqSet(gov.nih.nlm.ncbi.www.soap.eutils.efetch.TSeqSet TSeqSet) {
        this.TSeqSet = TSeqSet;
    }


    /**
     * Gets the GBSet value for this EFetchResult.
     * 
     * @return GBSet
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.GBSet getGBSet() {
        return GBSet;
    }


    /**
     * Sets the GBSet value for this EFetchResult.
     * 
     * @param GBSet
     */
    public void setGBSet(gov.nih.nlm.ncbi.www.soap.eutils.efetch.GBSet GBSet) {
        this.GBSet = GBSet;
    }


    /**
     * Gets the bioseqSet value for this EFetchResult.
     * 
     * @return bioseqSet
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.BioseqSetType getBioseqSet() {
        return bioseqSet;
    }


    /**
     * Sets the bioseqSet value for this EFetchResult.
     * 
     * @param bioseqSet
     */
    public void setBioseqSet(gov.nih.nlm.ncbi.www.soap.eutils.efetch.BioseqSetType bioseqSet) {
        this.bioseqSet = bioseqSet;
    }


    /**
     * Gets the entrezgeneSet value for this EFetchResult.
     * 
     * @return entrezgeneSet
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.EntrezgeneSet getEntrezgeneSet() {
        return entrezgeneSet;
    }


    /**
     * Sets the entrezgeneSet value for this EFetchResult.
     * 
     * @param entrezgeneSet
     */
    public void setEntrezgeneSet(gov.nih.nlm.ncbi.www.soap.eutils.efetch.EntrezgeneSet entrezgeneSet) {
        this.entrezgeneSet = entrezgeneSet;
    }


    /**
     * Gets the exchangeSet value for this EFetchResult.
     * 
     * @return exchangeSet
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ExchangeSet getExchangeSet() {
        return exchangeSet;
    }


    /**
     * Sets the exchangeSet value for this EFetchResult.
     * 
     * @param exchangeSet
     */
    public void setExchangeSet(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ExchangeSet exchangeSet) {
        this.exchangeSet = exchangeSet;
    }


    /**
     * Gets the idList value for this EFetchResult.
     * 
     * @return idList
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.IdListType getIdList() {
        return idList;
    }


    /**
     * Sets the idList value for this EFetchResult.
     * 
     * @param idList
     */
    public void setIdList(gov.nih.nlm.ncbi.www.soap.eutils.efetch.IdListType idList) {
        this.idList = idList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EFetchResult)) return false;
        EFetchResult other = (EFetchResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ERROR==null && other.getERROR()==null) || 
             (this.ERROR!=null &&
              this.ERROR.equals(other.getERROR()))) &&
            ((this.NLMCatalogRecordSet==null && other.getNLMCatalogRecordSet()==null) || 
             (this.NLMCatalogRecordSet!=null &&
              this.NLMCatalogRecordSet.equals(other.getNLMCatalogRecordSet()))) &&
            ((this.pubmedArticleSet==null && other.getPubmedArticleSet()==null) || 
             (this.pubmedArticleSet!=null &&
              this.pubmedArticleSet.equals(other.getPubmedArticleSet()))) &&
            ((this.pmcArticleset==null && other.getPmcArticleset()==null) || 
             (this.pmcArticleset!=null &&
              this.pmcArticleset.equals(other.getPmcArticleset()))) &&
            ((this.mimEntries==null && other.getMimEntries()==null) || 
             (this.mimEntries!=null &&
              this.mimEntries.equals(other.getMimEntries()))) &&
            ((this.taxaSet==null && other.getTaxaSet()==null) || 
             (this.taxaSet!=null &&
              this.taxaSet.equals(other.getTaxaSet()))) &&
            ((this.TSeqSet==null && other.getTSeqSet()==null) || 
             (this.TSeqSet!=null &&
              this.TSeqSet.equals(other.getTSeqSet()))) &&
            ((this.GBSet==null && other.getGBSet()==null) || 
             (this.GBSet!=null &&
              this.GBSet.equals(other.getGBSet()))) &&
            ((this.bioseqSet==null && other.getBioseqSet()==null) || 
             (this.bioseqSet!=null &&
              this.bioseqSet.equals(other.getBioseqSet()))) &&
            ((this.entrezgeneSet==null && other.getEntrezgeneSet()==null) || 
             (this.entrezgeneSet!=null &&
              this.entrezgeneSet.equals(other.getEntrezgeneSet()))) &&
            ((this.exchangeSet==null && other.getExchangeSet()==null) || 
             (this.exchangeSet!=null &&
              this.exchangeSet.equals(other.getExchangeSet()))) &&
            ((this.idList==null && other.getIdList()==null) || 
             (this.idList!=null &&
              this.idList.equals(other.getIdList())));
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
        if (getERROR() != null) {
            _hashCode += getERROR().hashCode();
        }
        if (getNLMCatalogRecordSet() != null) {
            _hashCode += getNLMCatalogRecordSet().hashCode();
        }
        if (getPubmedArticleSet() != null) {
            _hashCode += getPubmedArticleSet().hashCode();
        }
        if (getPmcArticleset() != null) {
            _hashCode += getPmcArticleset().hashCode();
        }
        if (getMimEntries() != null) {
            _hashCode += getMimEntries().hashCode();
        }
        if (getTaxaSet() != null) {
            _hashCode += getTaxaSet().hashCode();
        }
        if (getTSeqSet() != null) {
            _hashCode += getTSeqSet().hashCode();
        }
        if (getGBSet() != null) {
            _hashCode += getGBSet().hashCode();
        }
        if (getBioseqSet() != null) {
            _hashCode += getBioseqSet().hashCode();
        }
        if (getEntrezgeneSet() != null) {
            _hashCode += getEntrezgeneSet().hashCode();
        }
        if (getExchangeSet() != null) {
            _hashCode += getExchangeSet().hashCode();
        }
        if (getIdList() != null) {
            _hashCode += getIdList().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EFetchResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">eFetchResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ERROR");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ERROR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NLMCatalogRecordSet");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "NLMCatalogRecordSet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "NLMCatalogRecordSetType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pubmedArticleSet");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PubmedArticleSet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PubmedArticleSetType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pmcArticleset");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "pmc-articleset"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "pmc-articlesetType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mimEntries");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-entries"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">Mim-entries"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxaSet");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "TaxaSet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "TaxaSetType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TSeqSet");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "TSeqSet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">TSeqSet"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GBSet");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "GBSet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">GBSet"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bioseqSet");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Bioseq-set"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Bioseq-setType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entrezgeneSet");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrezgene-Set"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">Entrezgene-Set"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exchangeSet");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ExchangeSet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">ExchangeSet"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "IdList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "IdListType"));
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
