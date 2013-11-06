/**
 * GBBlockType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class GBBlockType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.GBBlock_extraAccessionsType GBBlock_extraAccessions;

    private java.lang.String GBBlock_source;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.GBBlock_keywordsType GBBlock_keywords;

    private java.lang.String GBBlock_origin;

    private java.lang.String GBBlock_date;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.GBBlock_entryDateType GBBlock_entryDate;

    private java.lang.String GBBlock_div;

    private java.lang.String GBBlock_taxonomy;

    public GBBlockType() {
    }

    public GBBlockType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.GBBlock_extraAccessionsType GBBlock_extraAccessions,
           java.lang.String GBBlock_source,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.GBBlock_keywordsType GBBlock_keywords,
           java.lang.String GBBlock_origin,
           java.lang.String GBBlock_date,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.GBBlock_entryDateType GBBlock_entryDate,
           java.lang.String GBBlock_div,
           java.lang.String GBBlock_taxonomy) {
           this.GBBlock_extraAccessions = GBBlock_extraAccessions;
           this.GBBlock_source = GBBlock_source;
           this.GBBlock_keywords = GBBlock_keywords;
           this.GBBlock_origin = GBBlock_origin;
           this.GBBlock_date = GBBlock_date;
           this.GBBlock_entryDate = GBBlock_entryDate;
           this.GBBlock_div = GBBlock_div;
           this.GBBlock_taxonomy = GBBlock_taxonomy;
    }


    /**
     * Gets the GBBlock_extraAccessions value for this GBBlockType.
     * 
     * @return GBBlock_extraAccessions
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.GBBlock_extraAccessionsType getGBBlock_extraAccessions() {
        return GBBlock_extraAccessions;
    }


    /**
     * Sets the GBBlock_extraAccessions value for this GBBlockType.
     * 
     * @param GBBlock_extraAccessions
     */
    public void setGBBlock_extraAccessions(gov.nih.nlm.ncbi.www.soap.eutils.efetch.GBBlock_extraAccessionsType GBBlock_extraAccessions) {
        this.GBBlock_extraAccessions = GBBlock_extraAccessions;
    }


    /**
     * Gets the GBBlock_source value for this GBBlockType.
     * 
     * @return GBBlock_source
     */
    public java.lang.String getGBBlock_source() {
        return GBBlock_source;
    }


    /**
     * Sets the GBBlock_source value for this GBBlockType.
     * 
     * @param GBBlock_source
     */
    public void setGBBlock_source(java.lang.String GBBlock_source) {
        this.GBBlock_source = GBBlock_source;
    }


    /**
     * Gets the GBBlock_keywords value for this GBBlockType.
     * 
     * @return GBBlock_keywords
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.GBBlock_keywordsType getGBBlock_keywords() {
        return GBBlock_keywords;
    }


    /**
     * Sets the GBBlock_keywords value for this GBBlockType.
     * 
     * @param GBBlock_keywords
     */
    public void setGBBlock_keywords(gov.nih.nlm.ncbi.www.soap.eutils.efetch.GBBlock_keywordsType GBBlock_keywords) {
        this.GBBlock_keywords = GBBlock_keywords;
    }


    /**
     * Gets the GBBlock_origin value for this GBBlockType.
     * 
     * @return GBBlock_origin
     */
    public java.lang.String getGBBlock_origin() {
        return GBBlock_origin;
    }


    /**
     * Sets the GBBlock_origin value for this GBBlockType.
     * 
     * @param GBBlock_origin
     */
    public void setGBBlock_origin(java.lang.String GBBlock_origin) {
        this.GBBlock_origin = GBBlock_origin;
    }


    /**
     * Gets the GBBlock_date value for this GBBlockType.
     * 
     * @return GBBlock_date
     */
    public java.lang.String getGBBlock_date() {
        return GBBlock_date;
    }


    /**
     * Sets the GBBlock_date value for this GBBlockType.
     * 
     * @param GBBlock_date
     */
    public void setGBBlock_date(java.lang.String GBBlock_date) {
        this.GBBlock_date = GBBlock_date;
    }


    /**
     * Gets the GBBlock_entryDate value for this GBBlockType.
     * 
     * @return GBBlock_entryDate
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.GBBlock_entryDateType getGBBlock_entryDate() {
        return GBBlock_entryDate;
    }


    /**
     * Sets the GBBlock_entryDate value for this GBBlockType.
     * 
     * @param GBBlock_entryDate
     */
    public void setGBBlock_entryDate(gov.nih.nlm.ncbi.www.soap.eutils.efetch.GBBlock_entryDateType GBBlock_entryDate) {
        this.GBBlock_entryDate = GBBlock_entryDate;
    }


    /**
     * Gets the GBBlock_div value for this GBBlockType.
     * 
     * @return GBBlock_div
     */
    public java.lang.String getGBBlock_div() {
        return GBBlock_div;
    }


    /**
     * Sets the GBBlock_div value for this GBBlockType.
     * 
     * @param GBBlock_div
     */
    public void setGBBlock_div(java.lang.String GBBlock_div) {
        this.GBBlock_div = GBBlock_div;
    }


    /**
     * Gets the GBBlock_taxonomy value for this GBBlockType.
     * 
     * @return GBBlock_taxonomy
     */
    public java.lang.String getGBBlock_taxonomy() {
        return GBBlock_taxonomy;
    }


    /**
     * Sets the GBBlock_taxonomy value for this GBBlockType.
     * 
     * @param GBBlock_taxonomy
     */
    public void setGBBlock_taxonomy(java.lang.String GBBlock_taxonomy) {
        this.GBBlock_taxonomy = GBBlock_taxonomy;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GBBlockType)) return false;
        GBBlockType other = (GBBlockType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.GBBlock_extraAccessions==null && other.getGBBlock_extraAccessions()==null) || 
             (this.GBBlock_extraAccessions!=null &&
              this.GBBlock_extraAccessions.equals(other.getGBBlock_extraAccessions()))) &&
            ((this.GBBlock_source==null && other.getGBBlock_source()==null) || 
             (this.GBBlock_source!=null &&
              this.GBBlock_source.equals(other.getGBBlock_source()))) &&
            ((this.GBBlock_keywords==null && other.getGBBlock_keywords()==null) || 
             (this.GBBlock_keywords!=null &&
              this.GBBlock_keywords.equals(other.getGBBlock_keywords()))) &&
            ((this.GBBlock_origin==null && other.getGBBlock_origin()==null) || 
             (this.GBBlock_origin!=null &&
              this.GBBlock_origin.equals(other.getGBBlock_origin()))) &&
            ((this.GBBlock_date==null && other.getGBBlock_date()==null) || 
             (this.GBBlock_date!=null &&
              this.GBBlock_date.equals(other.getGBBlock_date()))) &&
            ((this.GBBlock_entryDate==null && other.getGBBlock_entryDate()==null) || 
             (this.GBBlock_entryDate!=null &&
              this.GBBlock_entryDate.equals(other.getGBBlock_entryDate()))) &&
            ((this.GBBlock_div==null && other.getGBBlock_div()==null) || 
             (this.GBBlock_div!=null &&
              this.GBBlock_div.equals(other.getGBBlock_div()))) &&
            ((this.GBBlock_taxonomy==null && other.getGBBlock_taxonomy()==null) || 
             (this.GBBlock_taxonomy!=null &&
              this.GBBlock_taxonomy.equals(other.getGBBlock_taxonomy())));
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
        if (getGBBlock_extraAccessions() != null) {
            _hashCode += getGBBlock_extraAccessions().hashCode();
        }
        if (getGBBlock_source() != null) {
            _hashCode += getGBBlock_source().hashCode();
        }
        if (getGBBlock_keywords() != null) {
            _hashCode += getGBBlock_keywords().hashCode();
        }
        if (getGBBlock_origin() != null) {
            _hashCode += getGBBlock_origin().hashCode();
        }
        if (getGBBlock_date() != null) {
            _hashCode += getGBBlock_date().hashCode();
        }
        if (getGBBlock_entryDate() != null) {
            _hashCode += getGBBlock_entryDate().hashCode();
        }
        if (getGBBlock_div() != null) {
            _hashCode += getGBBlock_div().hashCode();
        }
        if (getGBBlock_taxonomy() != null) {
            _hashCode += getGBBlock_taxonomy().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GBBlockType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "GB-blockType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GBBlock_extraAccessions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "GB-block_extra-accessions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "GB-block_extra-accessionsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GBBlock_source");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "GB-block_source"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GBBlock_keywords");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "GB-block_keywords"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "GB-block_keywordsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GBBlock_origin");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "GB-block_origin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GBBlock_date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "GB-block_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GBBlock_entryDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "GB-block_entry-date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "GB-block_entry-dateType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GBBlock_div");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "GB-block_div"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GBBlock_taxonomy");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "GB-block_taxonomy"));
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
