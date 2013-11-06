/**
 * ImprintType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ImprintType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Imprint_dateType imprint_date;

    private java.lang.String imprint_volume;

    private java.lang.String imprint_issue;

    private java.lang.String imprint_pages;

    private java.lang.String imprint_section;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Imprint_pubType imprint_pub;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Imprint_cprtType imprint_cprt;

    private java.lang.String imprint_partSup;

    private java.lang.String imprint_language;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Imprint_prepubType imprint_prepub;

    private java.lang.String imprint_partSupi;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Imprint_retractType imprint_retract;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Imprint_pubstatusType imprint_pubstatus;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Imprint_historyType imprint_history;

    public ImprintType() {
    }

    public ImprintType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Imprint_dateType imprint_date,
           java.lang.String imprint_volume,
           java.lang.String imprint_issue,
           java.lang.String imprint_pages,
           java.lang.String imprint_section,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Imprint_pubType imprint_pub,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Imprint_cprtType imprint_cprt,
           java.lang.String imprint_partSup,
           java.lang.String imprint_language,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Imprint_prepubType imprint_prepub,
           java.lang.String imprint_partSupi,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Imprint_retractType imprint_retract,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Imprint_pubstatusType imprint_pubstatus,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Imprint_historyType imprint_history) {
           this.imprint_date = imprint_date;
           this.imprint_volume = imprint_volume;
           this.imprint_issue = imprint_issue;
           this.imprint_pages = imprint_pages;
           this.imprint_section = imprint_section;
           this.imprint_pub = imprint_pub;
           this.imprint_cprt = imprint_cprt;
           this.imprint_partSup = imprint_partSup;
           this.imprint_language = imprint_language;
           this.imprint_prepub = imprint_prepub;
           this.imprint_partSupi = imprint_partSupi;
           this.imprint_retract = imprint_retract;
           this.imprint_pubstatus = imprint_pubstatus;
           this.imprint_history = imprint_history;
    }


    /**
     * Gets the imprint_date value for this ImprintType.
     * 
     * @return imprint_date
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Imprint_dateType getImprint_date() {
        return imprint_date;
    }


    /**
     * Sets the imprint_date value for this ImprintType.
     * 
     * @param imprint_date
     */
    public void setImprint_date(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Imprint_dateType imprint_date) {
        this.imprint_date = imprint_date;
    }


    /**
     * Gets the imprint_volume value for this ImprintType.
     * 
     * @return imprint_volume
     */
    public java.lang.String getImprint_volume() {
        return imprint_volume;
    }


    /**
     * Sets the imprint_volume value for this ImprintType.
     * 
     * @param imprint_volume
     */
    public void setImprint_volume(java.lang.String imprint_volume) {
        this.imprint_volume = imprint_volume;
    }


    /**
     * Gets the imprint_issue value for this ImprintType.
     * 
     * @return imprint_issue
     */
    public java.lang.String getImprint_issue() {
        return imprint_issue;
    }


    /**
     * Sets the imprint_issue value for this ImprintType.
     * 
     * @param imprint_issue
     */
    public void setImprint_issue(java.lang.String imprint_issue) {
        this.imprint_issue = imprint_issue;
    }


    /**
     * Gets the imprint_pages value for this ImprintType.
     * 
     * @return imprint_pages
     */
    public java.lang.String getImprint_pages() {
        return imprint_pages;
    }


    /**
     * Sets the imprint_pages value for this ImprintType.
     * 
     * @param imprint_pages
     */
    public void setImprint_pages(java.lang.String imprint_pages) {
        this.imprint_pages = imprint_pages;
    }


    /**
     * Gets the imprint_section value for this ImprintType.
     * 
     * @return imprint_section
     */
    public java.lang.String getImprint_section() {
        return imprint_section;
    }


    /**
     * Sets the imprint_section value for this ImprintType.
     * 
     * @param imprint_section
     */
    public void setImprint_section(java.lang.String imprint_section) {
        this.imprint_section = imprint_section;
    }


    /**
     * Gets the imprint_pub value for this ImprintType.
     * 
     * @return imprint_pub
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Imprint_pubType getImprint_pub() {
        return imprint_pub;
    }


    /**
     * Sets the imprint_pub value for this ImprintType.
     * 
     * @param imprint_pub
     */
    public void setImprint_pub(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Imprint_pubType imprint_pub) {
        this.imprint_pub = imprint_pub;
    }


    /**
     * Gets the imprint_cprt value for this ImprintType.
     * 
     * @return imprint_cprt
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Imprint_cprtType getImprint_cprt() {
        return imprint_cprt;
    }


    /**
     * Sets the imprint_cprt value for this ImprintType.
     * 
     * @param imprint_cprt
     */
    public void setImprint_cprt(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Imprint_cprtType imprint_cprt) {
        this.imprint_cprt = imprint_cprt;
    }


    /**
     * Gets the imprint_partSup value for this ImprintType.
     * 
     * @return imprint_partSup
     */
    public java.lang.String getImprint_partSup() {
        return imprint_partSup;
    }


    /**
     * Sets the imprint_partSup value for this ImprintType.
     * 
     * @param imprint_partSup
     */
    public void setImprint_partSup(java.lang.String imprint_partSup) {
        this.imprint_partSup = imprint_partSup;
    }


    /**
     * Gets the imprint_language value for this ImprintType.
     * 
     * @return imprint_language
     */
    public java.lang.String getImprint_language() {
        return imprint_language;
    }


    /**
     * Sets the imprint_language value for this ImprintType.
     * 
     * @param imprint_language
     */
    public void setImprint_language(java.lang.String imprint_language) {
        this.imprint_language = imprint_language;
    }


    /**
     * Gets the imprint_prepub value for this ImprintType.
     * 
     * @return imprint_prepub
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Imprint_prepubType getImprint_prepub() {
        return imprint_prepub;
    }


    /**
     * Sets the imprint_prepub value for this ImprintType.
     * 
     * @param imprint_prepub
     */
    public void setImprint_prepub(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Imprint_prepubType imprint_prepub) {
        this.imprint_prepub = imprint_prepub;
    }


    /**
     * Gets the imprint_partSupi value for this ImprintType.
     * 
     * @return imprint_partSupi
     */
    public java.lang.String getImprint_partSupi() {
        return imprint_partSupi;
    }


    /**
     * Sets the imprint_partSupi value for this ImprintType.
     * 
     * @param imprint_partSupi
     */
    public void setImprint_partSupi(java.lang.String imprint_partSupi) {
        this.imprint_partSupi = imprint_partSupi;
    }


    /**
     * Gets the imprint_retract value for this ImprintType.
     * 
     * @return imprint_retract
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Imprint_retractType getImprint_retract() {
        return imprint_retract;
    }


    /**
     * Sets the imprint_retract value for this ImprintType.
     * 
     * @param imprint_retract
     */
    public void setImprint_retract(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Imprint_retractType imprint_retract) {
        this.imprint_retract = imprint_retract;
    }


    /**
     * Gets the imprint_pubstatus value for this ImprintType.
     * 
     * @return imprint_pubstatus
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Imprint_pubstatusType getImprint_pubstatus() {
        return imprint_pubstatus;
    }


    /**
     * Sets the imprint_pubstatus value for this ImprintType.
     * 
     * @param imprint_pubstatus
     */
    public void setImprint_pubstatus(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Imprint_pubstatusType imprint_pubstatus) {
        this.imprint_pubstatus = imprint_pubstatus;
    }


    /**
     * Gets the imprint_history value for this ImprintType.
     * 
     * @return imprint_history
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Imprint_historyType getImprint_history() {
        return imprint_history;
    }


    /**
     * Sets the imprint_history value for this ImprintType.
     * 
     * @param imprint_history
     */
    public void setImprint_history(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Imprint_historyType imprint_history) {
        this.imprint_history = imprint_history;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ImprintType)) return false;
        ImprintType other = (ImprintType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.imprint_date==null && other.getImprint_date()==null) || 
             (this.imprint_date!=null &&
              this.imprint_date.equals(other.getImprint_date()))) &&
            ((this.imprint_volume==null && other.getImprint_volume()==null) || 
             (this.imprint_volume!=null &&
              this.imprint_volume.equals(other.getImprint_volume()))) &&
            ((this.imprint_issue==null && other.getImprint_issue()==null) || 
             (this.imprint_issue!=null &&
              this.imprint_issue.equals(other.getImprint_issue()))) &&
            ((this.imprint_pages==null && other.getImprint_pages()==null) || 
             (this.imprint_pages!=null &&
              this.imprint_pages.equals(other.getImprint_pages()))) &&
            ((this.imprint_section==null && other.getImprint_section()==null) || 
             (this.imprint_section!=null &&
              this.imprint_section.equals(other.getImprint_section()))) &&
            ((this.imprint_pub==null && other.getImprint_pub()==null) || 
             (this.imprint_pub!=null &&
              this.imprint_pub.equals(other.getImprint_pub()))) &&
            ((this.imprint_cprt==null && other.getImprint_cprt()==null) || 
             (this.imprint_cprt!=null &&
              this.imprint_cprt.equals(other.getImprint_cprt()))) &&
            ((this.imprint_partSup==null && other.getImprint_partSup()==null) || 
             (this.imprint_partSup!=null &&
              this.imprint_partSup.equals(other.getImprint_partSup()))) &&
            ((this.imprint_language==null && other.getImprint_language()==null) || 
             (this.imprint_language!=null &&
              this.imprint_language.equals(other.getImprint_language()))) &&
            ((this.imprint_prepub==null && other.getImprint_prepub()==null) || 
             (this.imprint_prepub!=null &&
              this.imprint_prepub.equals(other.getImprint_prepub()))) &&
            ((this.imprint_partSupi==null && other.getImprint_partSupi()==null) || 
             (this.imprint_partSupi!=null &&
              this.imprint_partSupi.equals(other.getImprint_partSupi()))) &&
            ((this.imprint_retract==null && other.getImprint_retract()==null) || 
             (this.imprint_retract!=null &&
              this.imprint_retract.equals(other.getImprint_retract()))) &&
            ((this.imprint_pubstatus==null && other.getImprint_pubstatus()==null) || 
             (this.imprint_pubstatus!=null &&
              this.imprint_pubstatus.equals(other.getImprint_pubstatus()))) &&
            ((this.imprint_history==null && other.getImprint_history()==null) || 
             (this.imprint_history!=null &&
              this.imprint_history.equals(other.getImprint_history())));
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
        if (getImprint_date() != null) {
            _hashCode += getImprint_date().hashCode();
        }
        if (getImprint_volume() != null) {
            _hashCode += getImprint_volume().hashCode();
        }
        if (getImprint_issue() != null) {
            _hashCode += getImprint_issue().hashCode();
        }
        if (getImprint_pages() != null) {
            _hashCode += getImprint_pages().hashCode();
        }
        if (getImprint_section() != null) {
            _hashCode += getImprint_section().hashCode();
        }
        if (getImprint_pub() != null) {
            _hashCode += getImprint_pub().hashCode();
        }
        if (getImprint_cprt() != null) {
            _hashCode += getImprint_cprt().hashCode();
        }
        if (getImprint_partSup() != null) {
            _hashCode += getImprint_partSup().hashCode();
        }
        if (getImprint_language() != null) {
            _hashCode += getImprint_language().hashCode();
        }
        if (getImprint_prepub() != null) {
            _hashCode += getImprint_prepub().hashCode();
        }
        if (getImprint_partSupi() != null) {
            _hashCode += getImprint_partSupi().hashCode();
        }
        if (getImprint_retract() != null) {
            _hashCode += getImprint_retract().hashCode();
        }
        if (getImprint_pubstatus() != null) {
            _hashCode += getImprint_pubstatus().hashCode();
        }
        if (getImprint_history() != null) {
            _hashCode += getImprint_history().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ImprintType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ImprintType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("imprint_date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Imprint_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Imprint_dateType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("imprint_volume");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Imprint_volume"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("imprint_issue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Imprint_issue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("imprint_pages");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Imprint_pages"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("imprint_section");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Imprint_section"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("imprint_pub");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Imprint_pub"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Imprint_pubType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("imprint_cprt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Imprint_cprt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Imprint_cprtType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("imprint_partSup");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Imprint_part-sup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("imprint_language");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Imprint_language"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("imprint_prepub");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Imprint_prepub"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Imprint_prepubType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("imprint_partSupi");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Imprint_part-supi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("imprint_retract");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Imprint_retract"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Imprint_retractType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("imprint_pubstatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Imprint_pubstatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Imprint_pubstatusType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("imprint_history");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Imprint_history"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Imprint_historyType"));
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
