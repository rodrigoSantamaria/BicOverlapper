/**
 * GeneSourceType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class GeneSourceType  implements java.io.Serializable {
    private java.lang.String geneSource_src;

    private java.lang.String geneSource_srcInt;

    private java.lang.String geneSource_srcStr1;

    private java.lang.String geneSource_srcStr2;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.GeneSource_geneDisplayType geneSource_geneDisplay;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.GeneSource_locusDisplayType geneSource_locusDisplay;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.GeneSource_extraTermsType geneSource_extraTerms;

    public GeneSourceType() {
    }

    public GeneSourceType(
           java.lang.String geneSource_src,
           java.lang.String geneSource_srcInt,
           java.lang.String geneSource_srcStr1,
           java.lang.String geneSource_srcStr2,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.GeneSource_geneDisplayType geneSource_geneDisplay,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.GeneSource_locusDisplayType geneSource_locusDisplay,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.GeneSource_extraTermsType geneSource_extraTerms) {
           this.geneSource_src = geneSource_src;
           this.geneSource_srcInt = geneSource_srcInt;
           this.geneSource_srcStr1 = geneSource_srcStr1;
           this.geneSource_srcStr2 = geneSource_srcStr2;
           this.geneSource_geneDisplay = geneSource_geneDisplay;
           this.geneSource_locusDisplay = geneSource_locusDisplay;
           this.geneSource_extraTerms = geneSource_extraTerms;
    }


    /**
     * Gets the geneSource_src value for this GeneSourceType.
     * 
     * @return geneSource_src
     */
    public java.lang.String getGeneSource_src() {
        return geneSource_src;
    }


    /**
     * Sets the geneSource_src value for this GeneSourceType.
     * 
     * @param geneSource_src
     */
    public void setGeneSource_src(java.lang.String geneSource_src) {
        this.geneSource_src = geneSource_src;
    }


    /**
     * Gets the geneSource_srcInt value for this GeneSourceType.
     * 
     * @return geneSource_srcInt
     */
    public java.lang.String getGeneSource_srcInt() {
        return geneSource_srcInt;
    }


    /**
     * Sets the geneSource_srcInt value for this GeneSourceType.
     * 
     * @param geneSource_srcInt
     */
    public void setGeneSource_srcInt(java.lang.String geneSource_srcInt) {
        this.geneSource_srcInt = geneSource_srcInt;
    }


    /**
     * Gets the geneSource_srcStr1 value for this GeneSourceType.
     * 
     * @return geneSource_srcStr1
     */
    public java.lang.String getGeneSource_srcStr1() {
        return geneSource_srcStr1;
    }


    /**
     * Sets the geneSource_srcStr1 value for this GeneSourceType.
     * 
     * @param geneSource_srcStr1
     */
    public void setGeneSource_srcStr1(java.lang.String geneSource_srcStr1) {
        this.geneSource_srcStr1 = geneSource_srcStr1;
    }


    /**
     * Gets the geneSource_srcStr2 value for this GeneSourceType.
     * 
     * @return geneSource_srcStr2
     */
    public java.lang.String getGeneSource_srcStr2() {
        return geneSource_srcStr2;
    }


    /**
     * Sets the geneSource_srcStr2 value for this GeneSourceType.
     * 
     * @param geneSource_srcStr2
     */
    public void setGeneSource_srcStr2(java.lang.String geneSource_srcStr2) {
        this.geneSource_srcStr2 = geneSource_srcStr2;
    }


    /**
     * Gets the geneSource_geneDisplay value for this GeneSourceType.
     * 
     * @return geneSource_geneDisplay
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.GeneSource_geneDisplayType getGeneSource_geneDisplay() {
        return geneSource_geneDisplay;
    }


    /**
     * Sets the geneSource_geneDisplay value for this GeneSourceType.
     * 
     * @param geneSource_geneDisplay
     */
    public void setGeneSource_geneDisplay(gov.nih.nlm.ncbi.www.soap.eutils.efetch.GeneSource_geneDisplayType geneSource_geneDisplay) {
        this.geneSource_geneDisplay = geneSource_geneDisplay;
    }


    /**
     * Gets the geneSource_locusDisplay value for this GeneSourceType.
     * 
     * @return geneSource_locusDisplay
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.GeneSource_locusDisplayType getGeneSource_locusDisplay() {
        return geneSource_locusDisplay;
    }


    /**
     * Sets the geneSource_locusDisplay value for this GeneSourceType.
     * 
     * @param geneSource_locusDisplay
     */
    public void setGeneSource_locusDisplay(gov.nih.nlm.ncbi.www.soap.eutils.efetch.GeneSource_locusDisplayType geneSource_locusDisplay) {
        this.geneSource_locusDisplay = geneSource_locusDisplay;
    }


    /**
     * Gets the geneSource_extraTerms value for this GeneSourceType.
     * 
     * @return geneSource_extraTerms
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.GeneSource_extraTermsType getGeneSource_extraTerms() {
        return geneSource_extraTerms;
    }


    /**
     * Sets the geneSource_extraTerms value for this GeneSourceType.
     * 
     * @param geneSource_extraTerms
     */
    public void setGeneSource_extraTerms(gov.nih.nlm.ncbi.www.soap.eutils.efetch.GeneSource_extraTermsType geneSource_extraTerms) {
        this.geneSource_extraTerms = geneSource_extraTerms;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GeneSourceType)) return false;
        GeneSourceType other = (GeneSourceType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.geneSource_src==null && other.getGeneSource_src()==null) || 
             (this.geneSource_src!=null &&
              this.geneSource_src.equals(other.getGeneSource_src()))) &&
            ((this.geneSource_srcInt==null && other.getGeneSource_srcInt()==null) || 
             (this.geneSource_srcInt!=null &&
              this.geneSource_srcInt.equals(other.getGeneSource_srcInt()))) &&
            ((this.geneSource_srcStr1==null && other.getGeneSource_srcStr1()==null) || 
             (this.geneSource_srcStr1!=null &&
              this.geneSource_srcStr1.equals(other.getGeneSource_srcStr1()))) &&
            ((this.geneSource_srcStr2==null && other.getGeneSource_srcStr2()==null) || 
             (this.geneSource_srcStr2!=null &&
              this.geneSource_srcStr2.equals(other.getGeneSource_srcStr2()))) &&
            ((this.geneSource_geneDisplay==null && other.getGeneSource_geneDisplay()==null) || 
             (this.geneSource_geneDisplay!=null &&
              this.geneSource_geneDisplay.equals(other.getGeneSource_geneDisplay()))) &&
            ((this.geneSource_locusDisplay==null && other.getGeneSource_locusDisplay()==null) || 
             (this.geneSource_locusDisplay!=null &&
              this.geneSource_locusDisplay.equals(other.getGeneSource_locusDisplay()))) &&
            ((this.geneSource_extraTerms==null && other.getGeneSource_extraTerms()==null) || 
             (this.geneSource_extraTerms!=null &&
              this.geneSource_extraTerms.equals(other.getGeneSource_extraTerms())));
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
        if (getGeneSource_src() != null) {
            _hashCode += getGeneSource_src().hashCode();
        }
        if (getGeneSource_srcInt() != null) {
            _hashCode += getGeneSource_srcInt().hashCode();
        }
        if (getGeneSource_srcStr1() != null) {
            _hashCode += getGeneSource_srcStr1().hashCode();
        }
        if (getGeneSource_srcStr2() != null) {
            _hashCode += getGeneSource_srcStr2().hashCode();
        }
        if (getGeneSource_geneDisplay() != null) {
            _hashCode += getGeneSource_geneDisplay().hashCode();
        }
        if (getGeneSource_locusDisplay() != null) {
            _hashCode += getGeneSource_locusDisplay().hashCode();
        }
        if (getGeneSource_extraTerms() != null) {
            _hashCode += getGeneSource_extraTerms().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GeneSourceType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Gene-sourceType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("geneSource_src");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Gene-source_src"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("geneSource_srcInt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Gene-source_src-int"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("geneSource_srcStr1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Gene-source_src-str1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("geneSource_srcStr2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Gene-source_src-str2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("geneSource_geneDisplay");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Gene-source_gene-display"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Gene-source_gene-displayType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("geneSource_locusDisplay");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Gene-source_locus-display"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Gene-source_locus-displayType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("geneSource_extraTerms");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Gene-source_extra-terms"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Gene-source_extra-termsType"));
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
