/**
 * ArticleCategories.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ArticleCategories  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.SubjGroup[] subjGroup;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeriesTitle[] seriesTitle;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeriesText seriesText;

    public ArticleCategories() {
    }

    public ArticleCategories(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.SubjGroup[] subjGroup,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeriesTitle[] seriesTitle,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeriesText seriesText) {
           this.subjGroup = subjGroup;
           this.seriesTitle = seriesTitle;
           this.seriesText = seriesText;
    }


    /**
     * Gets the subjGroup value for this ArticleCategories.
     * 
     * @return subjGroup
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SubjGroup[] getSubjGroup() {
        return subjGroup;
    }


    /**
     * Sets the subjGroup value for this ArticleCategories.
     * 
     * @param subjGroup
     */
    public void setSubjGroup(gov.nih.nlm.ncbi.www.soap.eutils.efetch.SubjGroup[] subjGroup) {
        this.subjGroup = subjGroup;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SubjGroup getSubjGroup(int i) {
        return this.subjGroup[i];
    }

    public void setSubjGroup(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.SubjGroup _value) {
        this.subjGroup[i] = _value;
    }


    /**
     * Gets the seriesTitle value for this ArticleCategories.
     * 
     * @return seriesTitle
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeriesTitle[] getSeriesTitle() {
        return seriesTitle;
    }


    /**
     * Sets the seriesTitle value for this ArticleCategories.
     * 
     * @param seriesTitle
     */
    public void setSeriesTitle(gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeriesTitle[] seriesTitle) {
        this.seriesTitle = seriesTitle;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeriesTitle getSeriesTitle(int i) {
        return this.seriesTitle[i];
    }

    public void setSeriesTitle(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeriesTitle _value) {
        this.seriesTitle[i] = _value;
    }


    /**
     * Gets the seriesText value for this ArticleCategories.
     * 
     * @return seriesText
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeriesText getSeriesText() {
        return seriesText;
    }


    /**
     * Sets the seriesText value for this ArticleCategories.
     * 
     * @param seriesText
     */
    public void setSeriesText(gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeriesText seriesText) {
        this.seriesText = seriesText;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArticleCategories)) return false;
        ArticleCategories other = (ArticleCategories) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.subjGroup==null && other.getSubjGroup()==null) || 
             (this.subjGroup!=null &&
              java.util.Arrays.equals(this.subjGroup, other.getSubjGroup()))) &&
            ((this.seriesTitle==null && other.getSeriesTitle()==null) || 
             (this.seriesTitle!=null &&
              java.util.Arrays.equals(this.seriesTitle, other.getSeriesTitle()))) &&
            ((this.seriesText==null && other.getSeriesText()==null) || 
             (this.seriesText!=null &&
              this.seriesText.equals(other.getSeriesText())));
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
        if (getSubjGroup() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSubjGroup());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSubjGroup(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSeriesTitle() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSeriesTitle());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSeriesTitle(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSeriesText() != null) {
            _hashCode += getSeriesText().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ArticleCategories.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">article-categories"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subjGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "subj-group"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "subj-group"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seriesTitle");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "series-title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "series-title"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seriesText");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "series-text"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">series-text"));
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
