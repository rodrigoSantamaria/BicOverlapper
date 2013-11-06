/**
 * TaxonType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class TaxonType  implements java.io.Serializable {
    private java.lang.String taxId;

    private java.lang.String scientificName;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.OtherNamesType otherNames;

    private java.lang.String parentTaxId;

    private java.lang.String rank;

    private java.lang.String division;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.GeneticCode_Type geneticCode;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MitoGeneticCodeType mitoGeneticCode;

    private java.lang.String lineage;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.LineageExType lineageEx;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.CitationsType citations;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ModifiersType modifiers;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PropertiesType properties;

    private java.lang.String createDate;

    private java.lang.String updateDate;

    private java.lang.String pubDate;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.AkaTaxIdsType akaTaxIds;

    public TaxonType() {
    }

    public TaxonType(
           java.lang.String taxId,
           java.lang.String scientificName,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.OtherNamesType otherNames,
           java.lang.String parentTaxId,
           java.lang.String rank,
           java.lang.String division,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.GeneticCode_Type geneticCode,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MitoGeneticCodeType mitoGeneticCode,
           java.lang.String lineage,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.LineageExType lineageEx,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.CitationsType citations,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ModifiersType modifiers,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PropertiesType properties,
           java.lang.String createDate,
           java.lang.String updateDate,
           java.lang.String pubDate,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.AkaTaxIdsType akaTaxIds) {
           this.taxId = taxId;
           this.scientificName = scientificName;
           this.otherNames = otherNames;
           this.parentTaxId = parentTaxId;
           this.rank = rank;
           this.division = division;
           this.geneticCode = geneticCode;
           this.mitoGeneticCode = mitoGeneticCode;
           this.lineage = lineage;
           this.lineageEx = lineageEx;
           this.citations = citations;
           this.modifiers = modifiers;
           this.properties = properties;
           this.createDate = createDate;
           this.updateDate = updateDate;
           this.pubDate = pubDate;
           this.akaTaxIds = akaTaxIds;
    }


    /**
     * Gets the taxId value for this TaxonType.
     * 
     * @return taxId
     */
    public java.lang.String getTaxId() {
        return taxId;
    }


    /**
     * Sets the taxId value for this TaxonType.
     * 
     * @param taxId
     */
    public void setTaxId(java.lang.String taxId) {
        this.taxId = taxId;
    }


    /**
     * Gets the scientificName value for this TaxonType.
     * 
     * @return scientificName
     */
    public java.lang.String getScientificName() {
        return scientificName;
    }


    /**
     * Sets the scientificName value for this TaxonType.
     * 
     * @param scientificName
     */
    public void setScientificName(java.lang.String scientificName) {
        this.scientificName = scientificName;
    }


    /**
     * Gets the otherNames value for this TaxonType.
     * 
     * @return otherNames
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.OtherNamesType getOtherNames() {
        return otherNames;
    }


    /**
     * Sets the otherNames value for this TaxonType.
     * 
     * @param otherNames
     */
    public void setOtherNames(gov.nih.nlm.ncbi.www.soap.eutils.efetch.OtherNamesType otherNames) {
        this.otherNames = otherNames;
    }


    /**
     * Gets the parentTaxId value for this TaxonType.
     * 
     * @return parentTaxId
     */
    public java.lang.String getParentTaxId() {
        return parentTaxId;
    }


    /**
     * Sets the parentTaxId value for this TaxonType.
     * 
     * @param parentTaxId
     */
    public void setParentTaxId(java.lang.String parentTaxId) {
        this.parentTaxId = parentTaxId;
    }


    /**
     * Gets the rank value for this TaxonType.
     * 
     * @return rank
     */
    public java.lang.String getRank() {
        return rank;
    }


    /**
     * Sets the rank value for this TaxonType.
     * 
     * @param rank
     */
    public void setRank(java.lang.String rank) {
        this.rank = rank;
    }


    /**
     * Gets the division value for this TaxonType.
     * 
     * @return division
     */
    public java.lang.String getDivision() {
        return division;
    }


    /**
     * Sets the division value for this TaxonType.
     * 
     * @param division
     */
    public void setDivision(java.lang.String division) {
        this.division = division;
    }


    /**
     * Gets the geneticCode value for this TaxonType.
     * 
     * @return geneticCode
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.GeneticCode_Type getGeneticCode() {
        return geneticCode;
    }


    /**
     * Sets the geneticCode value for this TaxonType.
     * 
     * @param geneticCode
     */
    public void setGeneticCode(gov.nih.nlm.ncbi.www.soap.eutils.efetch.GeneticCode_Type geneticCode) {
        this.geneticCode = geneticCode;
    }


    /**
     * Gets the mitoGeneticCode value for this TaxonType.
     * 
     * @return mitoGeneticCode
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MitoGeneticCodeType getMitoGeneticCode() {
        return mitoGeneticCode;
    }


    /**
     * Sets the mitoGeneticCode value for this TaxonType.
     * 
     * @param mitoGeneticCode
     */
    public void setMitoGeneticCode(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MitoGeneticCodeType mitoGeneticCode) {
        this.mitoGeneticCode = mitoGeneticCode;
    }


    /**
     * Gets the lineage value for this TaxonType.
     * 
     * @return lineage
     */
    public java.lang.String getLineage() {
        return lineage;
    }


    /**
     * Sets the lineage value for this TaxonType.
     * 
     * @param lineage
     */
    public void setLineage(java.lang.String lineage) {
        this.lineage = lineage;
    }


    /**
     * Gets the lineageEx value for this TaxonType.
     * 
     * @return lineageEx
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.LineageExType getLineageEx() {
        return lineageEx;
    }


    /**
     * Sets the lineageEx value for this TaxonType.
     * 
     * @param lineageEx
     */
    public void setLineageEx(gov.nih.nlm.ncbi.www.soap.eutils.efetch.LineageExType lineageEx) {
        this.lineageEx = lineageEx;
    }


    /**
     * Gets the citations value for this TaxonType.
     * 
     * @return citations
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.CitationsType getCitations() {
        return citations;
    }


    /**
     * Sets the citations value for this TaxonType.
     * 
     * @param citations
     */
    public void setCitations(gov.nih.nlm.ncbi.www.soap.eutils.efetch.CitationsType citations) {
        this.citations = citations;
    }


    /**
     * Gets the modifiers value for this TaxonType.
     * 
     * @return modifiers
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ModifiersType getModifiers() {
        return modifiers;
    }


    /**
     * Sets the modifiers value for this TaxonType.
     * 
     * @param modifiers
     */
    public void setModifiers(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ModifiersType modifiers) {
        this.modifiers = modifiers;
    }


    /**
     * Gets the properties value for this TaxonType.
     * 
     * @return properties
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PropertiesType getProperties() {
        return properties;
    }


    /**
     * Sets the properties value for this TaxonType.
     * 
     * @param properties
     */
    public void setProperties(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PropertiesType properties) {
        this.properties = properties;
    }


    /**
     * Gets the createDate value for this TaxonType.
     * 
     * @return createDate
     */
    public java.lang.String getCreateDate() {
        return createDate;
    }


    /**
     * Sets the createDate value for this TaxonType.
     * 
     * @param createDate
     */
    public void setCreateDate(java.lang.String createDate) {
        this.createDate = createDate;
    }


    /**
     * Gets the updateDate value for this TaxonType.
     * 
     * @return updateDate
     */
    public java.lang.String getUpdateDate() {
        return updateDate;
    }


    /**
     * Sets the updateDate value for this TaxonType.
     * 
     * @param updateDate
     */
    public void setUpdateDate(java.lang.String updateDate) {
        this.updateDate = updateDate;
    }


    /**
     * Gets the pubDate value for this TaxonType.
     * 
     * @return pubDate
     */
    public java.lang.String getPubDate() {
        return pubDate;
    }


    /**
     * Sets the pubDate value for this TaxonType.
     * 
     * @param pubDate
     */
    public void setPubDate(java.lang.String pubDate) {
        this.pubDate = pubDate;
    }


    /**
     * Gets the akaTaxIds value for this TaxonType.
     * 
     * @return akaTaxIds
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.AkaTaxIdsType getAkaTaxIds() {
        return akaTaxIds;
    }


    /**
     * Sets the akaTaxIds value for this TaxonType.
     * 
     * @param akaTaxIds
     */
    public void setAkaTaxIds(gov.nih.nlm.ncbi.www.soap.eutils.efetch.AkaTaxIdsType akaTaxIds) {
        this.akaTaxIds = akaTaxIds;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TaxonType)) return false;
        TaxonType other = (TaxonType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.taxId==null && other.getTaxId()==null) || 
             (this.taxId!=null &&
              this.taxId.equals(other.getTaxId()))) &&
            ((this.scientificName==null && other.getScientificName()==null) || 
             (this.scientificName!=null &&
              this.scientificName.equals(other.getScientificName()))) &&
            ((this.otherNames==null && other.getOtherNames()==null) || 
             (this.otherNames!=null &&
              this.otherNames.equals(other.getOtherNames()))) &&
            ((this.parentTaxId==null && other.getParentTaxId()==null) || 
             (this.parentTaxId!=null &&
              this.parentTaxId.equals(other.getParentTaxId()))) &&
            ((this.rank==null && other.getRank()==null) || 
             (this.rank!=null &&
              this.rank.equals(other.getRank()))) &&
            ((this.division==null && other.getDivision()==null) || 
             (this.division!=null &&
              this.division.equals(other.getDivision()))) &&
            ((this.geneticCode==null && other.getGeneticCode()==null) || 
             (this.geneticCode!=null &&
              this.geneticCode.equals(other.getGeneticCode()))) &&
            ((this.mitoGeneticCode==null && other.getMitoGeneticCode()==null) || 
             (this.mitoGeneticCode!=null &&
              this.mitoGeneticCode.equals(other.getMitoGeneticCode()))) &&
            ((this.lineage==null && other.getLineage()==null) || 
             (this.lineage!=null &&
              this.lineage.equals(other.getLineage()))) &&
            ((this.lineageEx==null && other.getLineageEx()==null) || 
             (this.lineageEx!=null &&
              this.lineageEx.equals(other.getLineageEx()))) &&
            ((this.citations==null && other.getCitations()==null) || 
             (this.citations!=null &&
              this.citations.equals(other.getCitations()))) &&
            ((this.modifiers==null && other.getModifiers()==null) || 
             (this.modifiers!=null &&
              this.modifiers.equals(other.getModifiers()))) &&
            ((this.properties==null && other.getProperties()==null) || 
             (this.properties!=null &&
              this.properties.equals(other.getProperties()))) &&
            ((this.createDate==null && other.getCreateDate()==null) || 
             (this.createDate!=null &&
              this.createDate.equals(other.getCreateDate()))) &&
            ((this.updateDate==null && other.getUpdateDate()==null) || 
             (this.updateDate!=null &&
              this.updateDate.equals(other.getUpdateDate()))) &&
            ((this.pubDate==null && other.getPubDate()==null) || 
             (this.pubDate!=null &&
              this.pubDate.equals(other.getPubDate()))) &&
            ((this.akaTaxIds==null && other.getAkaTaxIds()==null) || 
             (this.akaTaxIds!=null &&
              this.akaTaxIds.equals(other.getAkaTaxIds())));
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
        if (getTaxId() != null) {
            _hashCode += getTaxId().hashCode();
        }
        if (getScientificName() != null) {
            _hashCode += getScientificName().hashCode();
        }
        if (getOtherNames() != null) {
            _hashCode += getOtherNames().hashCode();
        }
        if (getParentTaxId() != null) {
            _hashCode += getParentTaxId().hashCode();
        }
        if (getRank() != null) {
            _hashCode += getRank().hashCode();
        }
        if (getDivision() != null) {
            _hashCode += getDivision().hashCode();
        }
        if (getGeneticCode() != null) {
            _hashCode += getGeneticCode().hashCode();
        }
        if (getMitoGeneticCode() != null) {
            _hashCode += getMitoGeneticCode().hashCode();
        }
        if (getLineage() != null) {
            _hashCode += getLineage().hashCode();
        }
        if (getLineageEx() != null) {
            _hashCode += getLineageEx().hashCode();
        }
        if (getCitations() != null) {
            _hashCode += getCitations().hashCode();
        }
        if (getModifiers() != null) {
            _hashCode += getModifiers().hashCode();
        }
        if (getProperties() != null) {
            _hashCode += getProperties().hashCode();
        }
        if (getCreateDate() != null) {
            _hashCode += getCreateDate().hashCode();
        }
        if (getUpdateDate() != null) {
            _hashCode += getUpdateDate().hashCode();
        }
        if (getPubDate() != null) {
            _hashCode += getPubDate().hashCode();
        }
        if (getAkaTaxIds() != null) {
            _hashCode += getAkaTaxIds().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TaxonType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "TaxonType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "TaxId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scientificName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ScientificName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("otherNames");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "OtherNames"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "OtherNamesType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentTaxId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ParentTaxId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rank");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Rank"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("division");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Division"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("geneticCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "GeneticCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "GeneticCode_Type"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mitoGeneticCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MitoGeneticCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MitoGeneticCodeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Lineage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineageEx");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "LineageEx"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "LineageExType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("citations");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Citations"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "CitationsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modifiers");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Modifiers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ModifiersType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("properties");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Properties"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PropertiesType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "CreateDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updateDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "UpdateDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pubDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PubDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("akaTaxIds");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "AkaTaxIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "AkaTaxIdsType"));
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
