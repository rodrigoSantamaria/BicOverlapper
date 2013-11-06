/**
 * BlastDefLineType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class BlastDefLineType  implements java.io.Serializable {
    private java.lang.String blastDefLine_title;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.BlastDefLine_seqidType blastDefLine_seqid;

    private java.lang.String blastDefLine_taxid;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.BlastDefLine_membershipsType blastDefLine_memberships;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.BlastDefLine_linksType blastDefLine_links;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.BlastDefLine_otherInfoType blastDefLine_otherInfo;

    public BlastDefLineType() {
    }

    public BlastDefLineType(
           java.lang.String blastDefLine_title,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.BlastDefLine_seqidType blastDefLine_seqid,
           java.lang.String blastDefLine_taxid,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.BlastDefLine_membershipsType blastDefLine_memberships,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.BlastDefLine_linksType blastDefLine_links,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.BlastDefLine_otherInfoType blastDefLine_otherInfo) {
           this.blastDefLine_title = blastDefLine_title;
           this.blastDefLine_seqid = blastDefLine_seqid;
           this.blastDefLine_taxid = blastDefLine_taxid;
           this.blastDefLine_memberships = blastDefLine_memberships;
           this.blastDefLine_links = blastDefLine_links;
           this.blastDefLine_otherInfo = blastDefLine_otherInfo;
    }


    /**
     * Gets the blastDefLine_title value for this BlastDefLineType.
     * 
     * @return blastDefLine_title
     */
    public java.lang.String getBlastDefLine_title() {
        return blastDefLine_title;
    }


    /**
     * Sets the blastDefLine_title value for this BlastDefLineType.
     * 
     * @param blastDefLine_title
     */
    public void setBlastDefLine_title(java.lang.String blastDefLine_title) {
        this.blastDefLine_title = blastDefLine_title;
    }


    /**
     * Gets the blastDefLine_seqid value for this BlastDefLineType.
     * 
     * @return blastDefLine_seqid
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.BlastDefLine_seqidType getBlastDefLine_seqid() {
        return blastDefLine_seqid;
    }


    /**
     * Sets the blastDefLine_seqid value for this BlastDefLineType.
     * 
     * @param blastDefLine_seqid
     */
    public void setBlastDefLine_seqid(gov.nih.nlm.ncbi.www.soap.eutils.efetch.BlastDefLine_seqidType blastDefLine_seqid) {
        this.blastDefLine_seqid = blastDefLine_seqid;
    }


    /**
     * Gets the blastDefLine_taxid value for this BlastDefLineType.
     * 
     * @return blastDefLine_taxid
     */
    public java.lang.String getBlastDefLine_taxid() {
        return blastDefLine_taxid;
    }


    /**
     * Sets the blastDefLine_taxid value for this BlastDefLineType.
     * 
     * @param blastDefLine_taxid
     */
    public void setBlastDefLine_taxid(java.lang.String blastDefLine_taxid) {
        this.blastDefLine_taxid = blastDefLine_taxid;
    }


    /**
     * Gets the blastDefLine_memberships value for this BlastDefLineType.
     * 
     * @return blastDefLine_memberships
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.BlastDefLine_membershipsType getBlastDefLine_memberships() {
        return blastDefLine_memberships;
    }


    /**
     * Sets the blastDefLine_memberships value for this BlastDefLineType.
     * 
     * @param blastDefLine_memberships
     */
    public void setBlastDefLine_memberships(gov.nih.nlm.ncbi.www.soap.eutils.efetch.BlastDefLine_membershipsType blastDefLine_memberships) {
        this.blastDefLine_memberships = blastDefLine_memberships;
    }


    /**
     * Gets the blastDefLine_links value for this BlastDefLineType.
     * 
     * @return blastDefLine_links
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.BlastDefLine_linksType getBlastDefLine_links() {
        return blastDefLine_links;
    }


    /**
     * Sets the blastDefLine_links value for this BlastDefLineType.
     * 
     * @param blastDefLine_links
     */
    public void setBlastDefLine_links(gov.nih.nlm.ncbi.www.soap.eutils.efetch.BlastDefLine_linksType blastDefLine_links) {
        this.blastDefLine_links = blastDefLine_links;
    }


    /**
     * Gets the blastDefLine_otherInfo value for this BlastDefLineType.
     * 
     * @return blastDefLine_otherInfo
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.BlastDefLine_otherInfoType getBlastDefLine_otherInfo() {
        return blastDefLine_otherInfo;
    }


    /**
     * Sets the blastDefLine_otherInfo value for this BlastDefLineType.
     * 
     * @param blastDefLine_otherInfo
     */
    public void setBlastDefLine_otherInfo(gov.nih.nlm.ncbi.www.soap.eutils.efetch.BlastDefLine_otherInfoType blastDefLine_otherInfo) {
        this.blastDefLine_otherInfo = blastDefLine_otherInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BlastDefLineType)) return false;
        BlastDefLineType other = (BlastDefLineType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.blastDefLine_title==null && other.getBlastDefLine_title()==null) || 
             (this.blastDefLine_title!=null &&
              this.blastDefLine_title.equals(other.getBlastDefLine_title()))) &&
            ((this.blastDefLine_seqid==null && other.getBlastDefLine_seqid()==null) || 
             (this.blastDefLine_seqid!=null &&
              this.blastDefLine_seqid.equals(other.getBlastDefLine_seqid()))) &&
            ((this.blastDefLine_taxid==null && other.getBlastDefLine_taxid()==null) || 
             (this.blastDefLine_taxid!=null &&
              this.blastDefLine_taxid.equals(other.getBlastDefLine_taxid()))) &&
            ((this.blastDefLine_memberships==null && other.getBlastDefLine_memberships()==null) || 
             (this.blastDefLine_memberships!=null &&
              this.blastDefLine_memberships.equals(other.getBlastDefLine_memberships()))) &&
            ((this.blastDefLine_links==null && other.getBlastDefLine_links()==null) || 
             (this.blastDefLine_links!=null &&
              this.blastDefLine_links.equals(other.getBlastDefLine_links()))) &&
            ((this.blastDefLine_otherInfo==null && other.getBlastDefLine_otherInfo()==null) || 
             (this.blastDefLine_otherInfo!=null &&
              this.blastDefLine_otherInfo.equals(other.getBlastDefLine_otherInfo())));
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
        if (getBlastDefLine_title() != null) {
            _hashCode += getBlastDefLine_title().hashCode();
        }
        if (getBlastDefLine_seqid() != null) {
            _hashCode += getBlastDefLine_seqid().hashCode();
        }
        if (getBlastDefLine_taxid() != null) {
            _hashCode += getBlastDefLine_taxid().hashCode();
        }
        if (getBlastDefLine_memberships() != null) {
            _hashCode += getBlastDefLine_memberships().hashCode();
        }
        if (getBlastDefLine_links() != null) {
            _hashCode += getBlastDefLine_links().hashCode();
        }
        if (getBlastDefLine_otherInfo() != null) {
            _hashCode += getBlastDefLine_otherInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BlastDefLineType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast-def-lineType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blastDefLine_title");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast-def-line_title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blastDefLine_seqid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast-def-line_seqid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast-def-line_seqidType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blastDefLine_taxid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast-def-line_taxid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blastDefLine_memberships");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast-def-line_memberships"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast-def-line_membershipsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blastDefLine_links");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast-def-line_links"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast-def-line_linksType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blastDefLine_otherInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast-def-line_other-info"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast-def-line_other-infoType"));
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
