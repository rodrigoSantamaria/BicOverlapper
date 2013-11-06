/**
 * HGCommentaryType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class HGCommentaryType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.HGCommentary_linkType HGCommentary_link;

    private java.lang.String HGCommentary_description;

    private java.lang.String HGCommentary_caption;

    private java.lang.String HGCommentary_provider;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.HGCommentary_otherLinksType HGCommentary_otherLinks;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.HGCommentary_otherCommentariesType HGCommentary_otherCommentaries;

    private java.lang.String HGCommentary_taxid;

    private java.lang.String HGCommentary_geneid;

    public HGCommentaryType() {
    }

    public HGCommentaryType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.HGCommentary_linkType HGCommentary_link,
           java.lang.String HGCommentary_description,
           java.lang.String HGCommentary_caption,
           java.lang.String HGCommentary_provider,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.HGCommentary_otherLinksType HGCommentary_otherLinks,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.HGCommentary_otherCommentariesType HGCommentary_otherCommentaries,
           java.lang.String HGCommentary_taxid,
           java.lang.String HGCommentary_geneid) {
           this.HGCommentary_link = HGCommentary_link;
           this.HGCommentary_description = HGCommentary_description;
           this.HGCommentary_caption = HGCommentary_caption;
           this.HGCommentary_provider = HGCommentary_provider;
           this.HGCommentary_otherLinks = HGCommentary_otherLinks;
           this.HGCommentary_otherCommentaries = HGCommentary_otherCommentaries;
           this.HGCommentary_taxid = HGCommentary_taxid;
           this.HGCommentary_geneid = HGCommentary_geneid;
    }


    /**
     * Gets the HGCommentary_link value for this HGCommentaryType.
     * 
     * @return HGCommentary_link
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.HGCommentary_linkType getHGCommentary_link() {
        return HGCommentary_link;
    }


    /**
     * Sets the HGCommentary_link value for this HGCommentaryType.
     * 
     * @param HGCommentary_link
     */
    public void setHGCommentary_link(gov.nih.nlm.ncbi.www.soap.eutils.efetch.HGCommentary_linkType HGCommentary_link) {
        this.HGCommentary_link = HGCommentary_link;
    }


    /**
     * Gets the HGCommentary_description value for this HGCommentaryType.
     * 
     * @return HGCommentary_description
     */
    public java.lang.String getHGCommentary_description() {
        return HGCommentary_description;
    }


    /**
     * Sets the HGCommentary_description value for this HGCommentaryType.
     * 
     * @param HGCommentary_description
     */
    public void setHGCommentary_description(java.lang.String HGCommentary_description) {
        this.HGCommentary_description = HGCommentary_description;
    }


    /**
     * Gets the HGCommentary_caption value for this HGCommentaryType.
     * 
     * @return HGCommentary_caption
     */
    public java.lang.String getHGCommentary_caption() {
        return HGCommentary_caption;
    }


    /**
     * Sets the HGCommentary_caption value for this HGCommentaryType.
     * 
     * @param HGCommentary_caption
     */
    public void setHGCommentary_caption(java.lang.String HGCommentary_caption) {
        this.HGCommentary_caption = HGCommentary_caption;
    }


    /**
     * Gets the HGCommentary_provider value for this HGCommentaryType.
     * 
     * @return HGCommentary_provider
     */
    public java.lang.String getHGCommentary_provider() {
        return HGCommentary_provider;
    }


    /**
     * Sets the HGCommentary_provider value for this HGCommentaryType.
     * 
     * @param HGCommentary_provider
     */
    public void setHGCommentary_provider(java.lang.String HGCommentary_provider) {
        this.HGCommentary_provider = HGCommentary_provider;
    }


    /**
     * Gets the HGCommentary_otherLinks value for this HGCommentaryType.
     * 
     * @return HGCommentary_otherLinks
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.HGCommentary_otherLinksType getHGCommentary_otherLinks() {
        return HGCommentary_otherLinks;
    }


    /**
     * Sets the HGCommentary_otherLinks value for this HGCommentaryType.
     * 
     * @param HGCommentary_otherLinks
     */
    public void setHGCommentary_otherLinks(gov.nih.nlm.ncbi.www.soap.eutils.efetch.HGCommentary_otherLinksType HGCommentary_otherLinks) {
        this.HGCommentary_otherLinks = HGCommentary_otherLinks;
    }


    /**
     * Gets the HGCommentary_otherCommentaries value for this HGCommentaryType.
     * 
     * @return HGCommentary_otherCommentaries
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.HGCommentary_otherCommentariesType getHGCommentary_otherCommentaries() {
        return HGCommentary_otherCommentaries;
    }


    /**
     * Sets the HGCommentary_otherCommentaries value for this HGCommentaryType.
     * 
     * @param HGCommentary_otherCommentaries
     */
    public void setHGCommentary_otherCommentaries(gov.nih.nlm.ncbi.www.soap.eutils.efetch.HGCommentary_otherCommentariesType HGCommentary_otherCommentaries) {
        this.HGCommentary_otherCommentaries = HGCommentary_otherCommentaries;
    }


    /**
     * Gets the HGCommentary_taxid value for this HGCommentaryType.
     * 
     * @return HGCommentary_taxid
     */
    public java.lang.String getHGCommentary_taxid() {
        return HGCommentary_taxid;
    }


    /**
     * Sets the HGCommentary_taxid value for this HGCommentaryType.
     * 
     * @param HGCommentary_taxid
     */
    public void setHGCommentary_taxid(java.lang.String HGCommentary_taxid) {
        this.HGCommentary_taxid = HGCommentary_taxid;
    }


    /**
     * Gets the HGCommentary_geneid value for this HGCommentaryType.
     * 
     * @return HGCommentary_geneid
     */
    public java.lang.String getHGCommentary_geneid() {
        return HGCommentary_geneid;
    }


    /**
     * Sets the HGCommentary_geneid value for this HGCommentaryType.
     * 
     * @param HGCommentary_geneid
     */
    public void setHGCommentary_geneid(java.lang.String HGCommentary_geneid) {
        this.HGCommentary_geneid = HGCommentary_geneid;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HGCommentaryType)) return false;
        HGCommentaryType other = (HGCommentaryType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.HGCommentary_link==null && other.getHGCommentary_link()==null) || 
             (this.HGCommentary_link!=null &&
              this.HGCommentary_link.equals(other.getHGCommentary_link()))) &&
            ((this.HGCommentary_description==null && other.getHGCommentary_description()==null) || 
             (this.HGCommentary_description!=null &&
              this.HGCommentary_description.equals(other.getHGCommentary_description()))) &&
            ((this.HGCommentary_caption==null && other.getHGCommentary_caption()==null) || 
             (this.HGCommentary_caption!=null &&
              this.HGCommentary_caption.equals(other.getHGCommentary_caption()))) &&
            ((this.HGCommentary_provider==null && other.getHGCommentary_provider()==null) || 
             (this.HGCommentary_provider!=null &&
              this.HGCommentary_provider.equals(other.getHGCommentary_provider()))) &&
            ((this.HGCommentary_otherLinks==null && other.getHGCommentary_otherLinks()==null) || 
             (this.HGCommentary_otherLinks!=null &&
              this.HGCommentary_otherLinks.equals(other.getHGCommentary_otherLinks()))) &&
            ((this.HGCommentary_otherCommentaries==null && other.getHGCommentary_otherCommentaries()==null) || 
             (this.HGCommentary_otherCommentaries!=null &&
              this.HGCommentary_otherCommentaries.equals(other.getHGCommentary_otherCommentaries()))) &&
            ((this.HGCommentary_taxid==null && other.getHGCommentary_taxid()==null) || 
             (this.HGCommentary_taxid!=null &&
              this.HGCommentary_taxid.equals(other.getHGCommentary_taxid()))) &&
            ((this.HGCommentary_geneid==null && other.getHGCommentary_geneid()==null) || 
             (this.HGCommentary_geneid!=null &&
              this.HGCommentary_geneid.equals(other.getHGCommentary_geneid())));
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
        if (getHGCommentary_link() != null) {
            _hashCode += getHGCommentary_link().hashCode();
        }
        if (getHGCommentary_description() != null) {
            _hashCode += getHGCommentary_description().hashCode();
        }
        if (getHGCommentary_caption() != null) {
            _hashCode += getHGCommentary_caption().hashCode();
        }
        if (getHGCommentary_provider() != null) {
            _hashCode += getHGCommentary_provider().hashCode();
        }
        if (getHGCommentary_otherLinks() != null) {
            _hashCode += getHGCommentary_otherLinks().hashCode();
        }
        if (getHGCommentary_otherCommentaries() != null) {
            _hashCode += getHGCommentary_otherCommentaries().hashCode();
        }
        if (getHGCommentary_taxid() != null) {
            _hashCode += getHGCommentary_taxid().hashCode();
        }
        if (getHGCommentary_geneid() != null) {
            _hashCode += getHGCommentary_geneid().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HGCommentaryType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "HG-CommentaryType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("HGCommentary_link");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "HG-Commentary_link"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "HG-Commentary_linkType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("HGCommentary_description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "HG-Commentary_description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("HGCommentary_caption");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "HG-Commentary_caption"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("HGCommentary_provider");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "HG-Commentary_provider"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("HGCommentary_otherLinks");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "HG-Commentary_other-links"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "HG-Commentary_other-linksType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("HGCommentary_otherCommentaries");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "HG-Commentary_other-commentaries"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "HG-Commentary_other-commentariesType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("HGCommentary_taxid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "HG-Commentary_taxid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("HGCommentary_geneid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "HG-Commentary_geneid"));
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
