/**
 * TitleGroup.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class TitleGroup  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ArticleTitle articleTitle;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Subtitle[] subtitle;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.TransTitle transTitle;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.TransSubtitle transSubtitle;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.AltTitle[] altTitle;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.FnGroup fnGroup;

    public TitleGroup() {
    }

    public TitleGroup(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ArticleTitle articleTitle,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Subtitle[] subtitle,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.TransTitle transTitle,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.TransSubtitle transSubtitle,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.AltTitle[] altTitle,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.FnGroup fnGroup) {
           this.articleTitle = articleTitle;
           this.subtitle = subtitle;
           this.transTitle = transTitle;
           this.transSubtitle = transSubtitle;
           this.altTitle = altTitle;
           this.fnGroup = fnGroup;
    }


    /**
     * Gets the articleTitle value for this TitleGroup.
     * 
     * @return articleTitle
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ArticleTitle getArticleTitle() {
        return articleTitle;
    }


    /**
     * Sets the articleTitle value for this TitleGroup.
     * 
     * @param articleTitle
     */
    public void setArticleTitle(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ArticleTitle articleTitle) {
        this.articleTitle = articleTitle;
    }


    /**
     * Gets the subtitle value for this TitleGroup.
     * 
     * @return subtitle
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Subtitle[] getSubtitle() {
        return subtitle;
    }


    /**
     * Sets the subtitle value for this TitleGroup.
     * 
     * @param subtitle
     */
    public void setSubtitle(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Subtitle[] subtitle) {
        this.subtitle = subtitle;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Subtitle getSubtitle(int i) {
        return this.subtitle[i];
    }

    public void setSubtitle(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.Subtitle _value) {
        this.subtitle[i] = _value;
    }


    /**
     * Gets the transTitle value for this TitleGroup.
     * 
     * @return transTitle
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.TransTitle getTransTitle() {
        return transTitle;
    }


    /**
     * Sets the transTitle value for this TitleGroup.
     * 
     * @param transTitle
     */
    public void setTransTitle(gov.nih.nlm.ncbi.www.soap.eutils.efetch.TransTitle transTitle) {
        this.transTitle = transTitle;
    }


    /**
     * Gets the transSubtitle value for this TitleGroup.
     * 
     * @return transSubtitle
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.TransSubtitle getTransSubtitle() {
        return transSubtitle;
    }


    /**
     * Sets the transSubtitle value for this TitleGroup.
     * 
     * @param transSubtitle
     */
    public void setTransSubtitle(gov.nih.nlm.ncbi.www.soap.eutils.efetch.TransSubtitle transSubtitle) {
        this.transSubtitle = transSubtitle;
    }


    /**
     * Gets the altTitle value for this TitleGroup.
     * 
     * @return altTitle
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.AltTitle[] getAltTitle() {
        return altTitle;
    }


    /**
     * Sets the altTitle value for this TitleGroup.
     * 
     * @param altTitle
     */
    public void setAltTitle(gov.nih.nlm.ncbi.www.soap.eutils.efetch.AltTitle[] altTitle) {
        this.altTitle = altTitle;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.AltTitle getAltTitle(int i) {
        return this.altTitle[i];
    }

    public void setAltTitle(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.AltTitle _value) {
        this.altTitle[i] = _value;
    }


    /**
     * Gets the fnGroup value for this TitleGroup.
     * 
     * @return fnGroup
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.FnGroup getFnGroup() {
        return fnGroup;
    }


    /**
     * Sets the fnGroup value for this TitleGroup.
     * 
     * @param fnGroup
     */
    public void setFnGroup(gov.nih.nlm.ncbi.www.soap.eutils.efetch.FnGroup fnGroup) {
        this.fnGroup = fnGroup;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TitleGroup)) return false;
        TitleGroup other = (TitleGroup) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.articleTitle==null && other.getArticleTitle()==null) || 
             (this.articleTitle!=null &&
              this.articleTitle.equals(other.getArticleTitle()))) &&
            ((this.subtitle==null && other.getSubtitle()==null) || 
             (this.subtitle!=null &&
              java.util.Arrays.equals(this.subtitle, other.getSubtitle()))) &&
            ((this.transTitle==null && other.getTransTitle()==null) || 
             (this.transTitle!=null &&
              this.transTitle.equals(other.getTransTitle()))) &&
            ((this.transSubtitle==null && other.getTransSubtitle()==null) || 
             (this.transSubtitle!=null &&
              this.transSubtitle.equals(other.getTransSubtitle()))) &&
            ((this.altTitle==null && other.getAltTitle()==null) || 
             (this.altTitle!=null &&
              java.util.Arrays.equals(this.altTitle, other.getAltTitle()))) &&
            ((this.fnGroup==null && other.getFnGroup()==null) || 
             (this.fnGroup!=null &&
              this.fnGroup.equals(other.getFnGroup())));
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
        if (getArticleTitle() != null) {
            _hashCode += getArticleTitle().hashCode();
        }
        if (getSubtitle() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSubtitle());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSubtitle(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTransTitle() != null) {
            _hashCode += getTransTitle().hashCode();
        }
        if (getTransSubtitle() != null) {
            _hashCode += getTransSubtitle().hashCode();
        }
        if (getAltTitle() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAltTitle());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAltTitle(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFnGroup() != null) {
            _hashCode += getFnGroup().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TitleGroup.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">title-group"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("articleTitle");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "article-title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">article-title"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subtitle");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "subtitle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "subtitle"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transTitle");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "trans-title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">trans-title"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transSubtitle");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "trans-subtitle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">trans-subtitle"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("altTitle");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "alt-title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "alt-title"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fnGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "fn-group"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">fn-group"));
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
