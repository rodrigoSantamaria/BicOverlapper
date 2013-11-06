/**
 * HGEntryType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class HGEntryType  implements java.io.Serializable {
    private java.lang.String HGEntry_hgId;

    private java.lang.String HGEntry_version;

    private java.lang.String HGEntry_title;

    private java.lang.String HGEntry_caption;

    private java.lang.String HGEntry_taxid;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.HGEntry_genesType HGEntry_genes;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.HGEntry_crDateType HGEntry_crDate;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.HGEntry_upDateType HGEntry_upDate;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.HGEntry_distancesType HGEntry_distances;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.HGEntry_commentariesType HGEntry_commentaries;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.HGEntry_warningsType HGEntry_warnings;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.HGEntry_nodeType HGEntry_node;

    public HGEntryType() {
    }

    public HGEntryType(
           java.lang.String HGEntry_hgId,
           java.lang.String HGEntry_version,
           java.lang.String HGEntry_title,
           java.lang.String HGEntry_caption,
           java.lang.String HGEntry_taxid,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.HGEntry_genesType HGEntry_genes,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.HGEntry_crDateType HGEntry_crDate,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.HGEntry_upDateType HGEntry_upDate,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.HGEntry_distancesType HGEntry_distances,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.HGEntry_commentariesType HGEntry_commentaries,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.HGEntry_warningsType HGEntry_warnings,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.HGEntry_nodeType HGEntry_node) {
           this.HGEntry_hgId = HGEntry_hgId;
           this.HGEntry_version = HGEntry_version;
           this.HGEntry_title = HGEntry_title;
           this.HGEntry_caption = HGEntry_caption;
           this.HGEntry_taxid = HGEntry_taxid;
           this.HGEntry_genes = HGEntry_genes;
           this.HGEntry_crDate = HGEntry_crDate;
           this.HGEntry_upDate = HGEntry_upDate;
           this.HGEntry_distances = HGEntry_distances;
           this.HGEntry_commentaries = HGEntry_commentaries;
           this.HGEntry_warnings = HGEntry_warnings;
           this.HGEntry_node = HGEntry_node;
    }


    /**
     * Gets the HGEntry_hgId value for this HGEntryType.
     * 
     * @return HGEntry_hgId
     */
    public java.lang.String getHGEntry_hgId() {
        return HGEntry_hgId;
    }


    /**
     * Sets the HGEntry_hgId value for this HGEntryType.
     * 
     * @param HGEntry_hgId
     */
    public void setHGEntry_hgId(java.lang.String HGEntry_hgId) {
        this.HGEntry_hgId = HGEntry_hgId;
    }


    /**
     * Gets the HGEntry_version value for this HGEntryType.
     * 
     * @return HGEntry_version
     */
    public java.lang.String getHGEntry_version() {
        return HGEntry_version;
    }


    /**
     * Sets the HGEntry_version value for this HGEntryType.
     * 
     * @param HGEntry_version
     */
    public void setHGEntry_version(java.lang.String HGEntry_version) {
        this.HGEntry_version = HGEntry_version;
    }


    /**
     * Gets the HGEntry_title value for this HGEntryType.
     * 
     * @return HGEntry_title
     */
    public java.lang.String getHGEntry_title() {
        return HGEntry_title;
    }


    /**
     * Sets the HGEntry_title value for this HGEntryType.
     * 
     * @param HGEntry_title
     */
    public void setHGEntry_title(java.lang.String HGEntry_title) {
        this.HGEntry_title = HGEntry_title;
    }


    /**
     * Gets the HGEntry_caption value for this HGEntryType.
     * 
     * @return HGEntry_caption
     */
    public java.lang.String getHGEntry_caption() {
        return HGEntry_caption;
    }


    /**
     * Sets the HGEntry_caption value for this HGEntryType.
     * 
     * @param HGEntry_caption
     */
    public void setHGEntry_caption(java.lang.String HGEntry_caption) {
        this.HGEntry_caption = HGEntry_caption;
    }


    /**
     * Gets the HGEntry_taxid value for this HGEntryType.
     * 
     * @return HGEntry_taxid
     */
    public java.lang.String getHGEntry_taxid() {
        return HGEntry_taxid;
    }


    /**
     * Sets the HGEntry_taxid value for this HGEntryType.
     * 
     * @param HGEntry_taxid
     */
    public void setHGEntry_taxid(java.lang.String HGEntry_taxid) {
        this.HGEntry_taxid = HGEntry_taxid;
    }


    /**
     * Gets the HGEntry_genes value for this HGEntryType.
     * 
     * @return HGEntry_genes
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.HGEntry_genesType getHGEntry_genes() {
        return HGEntry_genes;
    }


    /**
     * Sets the HGEntry_genes value for this HGEntryType.
     * 
     * @param HGEntry_genes
     */
    public void setHGEntry_genes(gov.nih.nlm.ncbi.www.soap.eutils.efetch.HGEntry_genesType HGEntry_genes) {
        this.HGEntry_genes = HGEntry_genes;
    }


    /**
     * Gets the HGEntry_crDate value for this HGEntryType.
     * 
     * @return HGEntry_crDate
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.HGEntry_crDateType getHGEntry_crDate() {
        return HGEntry_crDate;
    }


    /**
     * Sets the HGEntry_crDate value for this HGEntryType.
     * 
     * @param HGEntry_crDate
     */
    public void setHGEntry_crDate(gov.nih.nlm.ncbi.www.soap.eutils.efetch.HGEntry_crDateType HGEntry_crDate) {
        this.HGEntry_crDate = HGEntry_crDate;
    }


    /**
     * Gets the HGEntry_upDate value for this HGEntryType.
     * 
     * @return HGEntry_upDate
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.HGEntry_upDateType getHGEntry_upDate() {
        return HGEntry_upDate;
    }


    /**
     * Sets the HGEntry_upDate value for this HGEntryType.
     * 
     * @param HGEntry_upDate
     */
    public void setHGEntry_upDate(gov.nih.nlm.ncbi.www.soap.eutils.efetch.HGEntry_upDateType HGEntry_upDate) {
        this.HGEntry_upDate = HGEntry_upDate;
    }


    /**
     * Gets the HGEntry_distances value for this HGEntryType.
     * 
     * @return HGEntry_distances
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.HGEntry_distancesType getHGEntry_distances() {
        return HGEntry_distances;
    }


    /**
     * Sets the HGEntry_distances value for this HGEntryType.
     * 
     * @param HGEntry_distances
     */
    public void setHGEntry_distances(gov.nih.nlm.ncbi.www.soap.eutils.efetch.HGEntry_distancesType HGEntry_distances) {
        this.HGEntry_distances = HGEntry_distances;
    }


    /**
     * Gets the HGEntry_commentaries value for this HGEntryType.
     * 
     * @return HGEntry_commentaries
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.HGEntry_commentariesType getHGEntry_commentaries() {
        return HGEntry_commentaries;
    }


    /**
     * Sets the HGEntry_commentaries value for this HGEntryType.
     * 
     * @param HGEntry_commentaries
     */
    public void setHGEntry_commentaries(gov.nih.nlm.ncbi.www.soap.eutils.efetch.HGEntry_commentariesType HGEntry_commentaries) {
        this.HGEntry_commentaries = HGEntry_commentaries;
    }


    /**
     * Gets the HGEntry_warnings value for this HGEntryType.
     * 
     * @return HGEntry_warnings
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.HGEntry_warningsType getHGEntry_warnings() {
        return HGEntry_warnings;
    }


    /**
     * Sets the HGEntry_warnings value for this HGEntryType.
     * 
     * @param HGEntry_warnings
     */
    public void setHGEntry_warnings(gov.nih.nlm.ncbi.www.soap.eutils.efetch.HGEntry_warningsType HGEntry_warnings) {
        this.HGEntry_warnings = HGEntry_warnings;
    }


    /**
     * Gets the HGEntry_node value for this HGEntryType.
     * 
     * @return HGEntry_node
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.HGEntry_nodeType getHGEntry_node() {
        return HGEntry_node;
    }


    /**
     * Sets the HGEntry_node value for this HGEntryType.
     * 
     * @param HGEntry_node
     */
    public void setHGEntry_node(gov.nih.nlm.ncbi.www.soap.eutils.efetch.HGEntry_nodeType HGEntry_node) {
        this.HGEntry_node = HGEntry_node;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HGEntryType)) return false;
        HGEntryType other = (HGEntryType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.HGEntry_hgId==null && other.getHGEntry_hgId()==null) || 
             (this.HGEntry_hgId!=null &&
              this.HGEntry_hgId.equals(other.getHGEntry_hgId()))) &&
            ((this.HGEntry_version==null && other.getHGEntry_version()==null) || 
             (this.HGEntry_version!=null &&
              this.HGEntry_version.equals(other.getHGEntry_version()))) &&
            ((this.HGEntry_title==null && other.getHGEntry_title()==null) || 
             (this.HGEntry_title!=null &&
              this.HGEntry_title.equals(other.getHGEntry_title()))) &&
            ((this.HGEntry_caption==null && other.getHGEntry_caption()==null) || 
             (this.HGEntry_caption!=null &&
              this.HGEntry_caption.equals(other.getHGEntry_caption()))) &&
            ((this.HGEntry_taxid==null && other.getHGEntry_taxid()==null) || 
             (this.HGEntry_taxid!=null &&
              this.HGEntry_taxid.equals(other.getHGEntry_taxid()))) &&
            ((this.HGEntry_genes==null && other.getHGEntry_genes()==null) || 
             (this.HGEntry_genes!=null &&
              this.HGEntry_genes.equals(other.getHGEntry_genes()))) &&
            ((this.HGEntry_crDate==null && other.getHGEntry_crDate()==null) || 
             (this.HGEntry_crDate!=null &&
              this.HGEntry_crDate.equals(other.getHGEntry_crDate()))) &&
            ((this.HGEntry_upDate==null && other.getHGEntry_upDate()==null) || 
             (this.HGEntry_upDate!=null &&
              this.HGEntry_upDate.equals(other.getHGEntry_upDate()))) &&
            ((this.HGEntry_distances==null && other.getHGEntry_distances()==null) || 
             (this.HGEntry_distances!=null &&
              this.HGEntry_distances.equals(other.getHGEntry_distances()))) &&
            ((this.HGEntry_commentaries==null && other.getHGEntry_commentaries()==null) || 
             (this.HGEntry_commentaries!=null &&
              this.HGEntry_commentaries.equals(other.getHGEntry_commentaries()))) &&
            ((this.HGEntry_warnings==null && other.getHGEntry_warnings()==null) || 
             (this.HGEntry_warnings!=null &&
              this.HGEntry_warnings.equals(other.getHGEntry_warnings()))) &&
            ((this.HGEntry_node==null && other.getHGEntry_node()==null) || 
             (this.HGEntry_node!=null &&
              this.HGEntry_node.equals(other.getHGEntry_node())));
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
        if (getHGEntry_hgId() != null) {
            _hashCode += getHGEntry_hgId().hashCode();
        }
        if (getHGEntry_version() != null) {
            _hashCode += getHGEntry_version().hashCode();
        }
        if (getHGEntry_title() != null) {
            _hashCode += getHGEntry_title().hashCode();
        }
        if (getHGEntry_caption() != null) {
            _hashCode += getHGEntry_caption().hashCode();
        }
        if (getHGEntry_taxid() != null) {
            _hashCode += getHGEntry_taxid().hashCode();
        }
        if (getHGEntry_genes() != null) {
            _hashCode += getHGEntry_genes().hashCode();
        }
        if (getHGEntry_crDate() != null) {
            _hashCode += getHGEntry_crDate().hashCode();
        }
        if (getHGEntry_upDate() != null) {
            _hashCode += getHGEntry_upDate().hashCode();
        }
        if (getHGEntry_distances() != null) {
            _hashCode += getHGEntry_distances().hashCode();
        }
        if (getHGEntry_commentaries() != null) {
            _hashCode += getHGEntry_commentaries().hashCode();
        }
        if (getHGEntry_warnings() != null) {
            _hashCode += getHGEntry_warnings().hashCode();
        }
        if (getHGEntry_node() != null) {
            _hashCode += getHGEntry_node().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HGEntryType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "HG-EntryType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("HGEntry_hgId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "HG-Entry_hg-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("HGEntry_version");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "HG-Entry_version"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("HGEntry_title");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "HG-Entry_title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("HGEntry_caption");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "HG-Entry_caption"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("HGEntry_taxid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "HG-Entry_taxid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("HGEntry_genes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "HG-Entry_genes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "HG-Entry_genesType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("HGEntry_crDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "HG-Entry_cr-date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "HG-Entry_cr-dateType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("HGEntry_upDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "HG-Entry_up-date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "HG-Entry_up-dateType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("HGEntry_distances");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "HG-Entry_distances"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "HG-Entry_distancesType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("HGEntry_commentaries");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "HG-Entry_commentaries"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "HG-Entry_commentariesType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("HGEntry_warnings");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "HG-Entry_warnings"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "HG-Entry_warningsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("HGEntry_node");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "HG-Entry_node"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "HG-Entry_nodeType"));
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
