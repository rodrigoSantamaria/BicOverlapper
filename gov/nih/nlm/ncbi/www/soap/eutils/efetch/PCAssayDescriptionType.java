/**
 * PCAssayDescriptionType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class PCAssayDescriptionType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCAssayDescription_aidType PCAssayDescription_aid;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCAssayDescription_aidSourceType PCAssayDescription_aidSource;

    private java.lang.String PCAssayDescription_name;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCAssayDescription_descriptionType PCAssayDescription_description;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCAssayDescription_protocolType PCAssayDescription_protocol;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCAssayDescription_commentType PCAssayDescription_comment;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCAssayDescription_xrefType PCAssayDescription_xref;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCAssayDescription_resultsType PCAssayDescription_results;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCAssayDescription_pubType PCAssayDescription_pub;

    private java.lang.String PCAssayDescription_revision;

    public PCAssayDescriptionType() {
    }

    public PCAssayDescriptionType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCAssayDescription_aidType PCAssayDescription_aid,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCAssayDescription_aidSourceType PCAssayDescription_aidSource,
           java.lang.String PCAssayDescription_name,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCAssayDescription_descriptionType PCAssayDescription_description,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCAssayDescription_protocolType PCAssayDescription_protocol,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCAssayDescription_commentType PCAssayDescription_comment,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCAssayDescription_xrefType PCAssayDescription_xref,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCAssayDescription_resultsType PCAssayDescription_results,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCAssayDescription_pubType PCAssayDescription_pub,
           java.lang.String PCAssayDescription_revision) {
           this.PCAssayDescription_aid = PCAssayDescription_aid;
           this.PCAssayDescription_aidSource = PCAssayDescription_aidSource;
           this.PCAssayDescription_name = PCAssayDescription_name;
           this.PCAssayDescription_description = PCAssayDescription_description;
           this.PCAssayDescription_protocol = PCAssayDescription_protocol;
           this.PCAssayDescription_comment = PCAssayDescription_comment;
           this.PCAssayDescription_xref = PCAssayDescription_xref;
           this.PCAssayDescription_results = PCAssayDescription_results;
           this.PCAssayDescription_pub = PCAssayDescription_pub;
           this.PCAssayDescription_revision = PCAssayDescription_revision;
    }


    /**
     * Gets the PCAssayDescription_aid value for this PCAssayDescriptionType.
     * 
     * @return PCAssayDescription_aid
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCAssayDescription_aidType getPCAssayDescription_aid() {
        return PCAssayDescription_aid;
    }


    /**
     * Sets the PCAssayDescription_aid value for this PCAssayDescriptionType.
     * 
     * @param PCAssayDescription_aid
     */
    public void setPCAssayDescription_aid(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCAssayDescription_aidType PCAssayDescription_aid) {
        this.PCAssayDescription_aid = PCAssayDescription_aid;
    }


    /**
     * Gets the PCAssayDescription_aidSource value for this PCAssayDescriptionType.
     * 
     * @return PCAssayDescription_aidSource
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCAssayDescription_aidSourceType getPCAssayDescription_aidSource() {
        return PCAssayDescription_aidSource;
    }


    /**
     * Sets the PCAssayDescription_aidSource value for this PCAssayDescriptionType.
     * 
     * @param PCAssayDescription_aidSource
     */
    public void setPCAssayDescription_aidSource(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCAssayDescription_aidSourceType PCAssayDescription_aidSource) {
        this.PCAssayDescription_aidSource = PCAssayDescription_aidSource;
    }


    /**
     * Gets the PCAssayDescription_name value for this PCAssayDescriptionType.
     * 
     * @return PCAssayDescription_name
     */
    public java.lang.String getPCAssayDescription_name() {
        return PCAssayDescription_name;
    }


    /**
     * Sets the PCAssayDescription_name value for this PCAssayDescriptionType.
     * 
     * @param PCAssayDescription_name
     */
    public void setPCAssayDescription_name(java.lang.String PCAssayDescription_name) {
        this.PCAssayDescription_name = PCAssayDescription_name;
    }


    /**
     * Gets the PCAssayDescription_description value for this PCAssayDescriptionType.
     * 
     * @return PCAssayDescription_description
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCAssayDescription_descriptionType getPCAssayDescription_description() {
        return PCAssayDescription_description;
    }


    /**
     * Sets the PCAssayDescription_description value for this PCAssayDescriptionType.
     * 
     * @param PCAssayDescription_description
     */
    public void setPCAssayDescription_description(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCAssayDescription_descriptionType PCAssayDescription_description) {
        this.PCAssayDescription_description = PCAssayDescription_description;
    }


    /**
     * Gets the PCAssayDescription_protocol value for this PCAssayDescriptionType.
     * 
     * @return PCAssayDescription_protocol
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCAssayDescription_protocolType getPCAssayDescription_protocol() {
        return PCAssayDescription_protocol;
    }


    /**
     * Sets the PCAssayDescription_protocol value for this PCAssayDescriptionType.
     * 
     * @param PCAssayDescription_protocol
     */
    public void setPCAssayDescription_protocol(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCAssayDescription_protocolType PCAssayDescription_protocol) {
        this.PCAssayDescription_protocol = PCAssayDescription_protocol;
    }


    /**
     * Gets the PCAssayDescription_comment value for this PCAssayDescriptionType.
     * 
     * @return PCAssayDescription_comment
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCAssayDescription_commentType getPCAssayDescription_comment() {
        return PCAssayDescription_comment;
    }


    /**
     * Sets the PCAssayDescription_comment value for this PCAssayDescriptionType.
     * 
     * @param PCAssayDescription_comment
     */
    public void setPCAssayDescription_comment(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCAssayDescription_commentType PCAssayDescription_comment) {
        this.PCAssayDescription_comment = PCAssayDescription_comment;
    }


    /**
     * Gets the PCAssayDescription_xref value for this PCAssayDescriptionType.
     * 
     * @return PCAssayDescription_xref
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCAssayDescription_xrefType getPCAssayDescription_xref() {
        return PCAssayDescription_xref;
    }


    /**
     * Sets the PCAssayDescription_xref value for this PCAssayDescriptionType.
     * 
     * @param PCAssayDescription_xref
     */
    public void setPCAssayDescription_xref(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCAssayDescription_xrefType PCAssayDescription_xref) {
        this.PCAssayDescription_xref = PCAssayDescription_xref;
    }


    /**
     * Gets the PCAssayDescription_results value for this PCAssayDescriptionType.
     * 
     * @return PCAssayDescription_results
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCAssayDescription_resultsType getPCAssayDescription_results() {
        return PCAssayDescription_results;
    }


    /**
     * Sets the PCAssayDescription_results value for this PCAssayDescriptionType.
     * 
     * @param PCAssayDescription_results
     */
    public void setPCAssayDescription_results(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCAssayDescription_resultsType PCAssayDescription_results) {
        this.PCAssayDescription_results = PCAssayDescription_results;
    }


    /**
     * Gets the PCAssayDescription_pub value for this PCAssayDescriptionType.
     * 
     * @return PCAssayDescription_pub
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCAssayDescription_pubType getPCAssayDescription_pub() {
        return PCAssayDescription_pub;
    }


    /**
     * Sets the PCAssayDescription_pub value for this PCAssayDescriptionType.
     * 
     * @param PCAssayDescription_pub
     */
    public void setPCAssayDescription_pub(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCAssayDescription_pubType PCAssayDescription_pub) {
        this.PCAssayDescription_pub = PCAssayDescription_pub;
    }


    /**
     * Gets the PCAssayDescription_revision value for this PCAssayDescriptionType.
     * 
     * @return PCAssayDescription_revision
     */
    public java.lang.String getPCAssayDescription_revision() {
        return PCAssayDescription_revision;
    }


    /**
     * Sets the PCAssayDescription_revision value for this PCAssayDescriptionType.
     * 
     * @param PCAssayDescription_revision
     */
    public void setPCAssayDescription_revision(java.lang.String PCAssayDescription_revision) {
        this.PCAssayDescription_revision = PCAssayDescription_revision;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PCAssayDescriptionType)) return false;
        PCAssayDescriptionType other = (PCAssayDescriptionType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.PCAssayDescription_aid==null && other.getPCAssayDescription_aid()==null) || 
             (this.PCAssayDescription_aid!=null &&
              this.PCAssayDescription_aid.equals(other.getPCAssayDescription_aid()))) &&
            ((this.PCAssayDescription_aidSource==null && other.getPCAssayDescription_aidSource()==null) || 
             (this.PCAssayDescription_aidSource!=null &&
              this.PCAssayDescription_aidSource.equals(other.getPCAssayDescription_aidSource()))) &&
            ((this.PCAssayDescription_name==null && other.getPCAssayDescription_name()==null) || 
             (this.PCAssayDescription_name!=null &&
              this.PCAssayDescription_name.equals(other.getPCAssayDescription_name()))) &&
            ((this.PCAssayDescription_description==null && other.getPCAssayDescription_description()==null) || 
             (this.PCAssayDescription_description!=null &&
              this.PCAssayDescription_description.equals(other.getPCAssayDescription_description()))) &&
            ((this.PCAssayDescription_protocol==null && other.getPCAssayDescription_protocol()==null) || 
             (this.PCAssayDescription_protocol!=null &&
              this.PCAssayDescription_protocol.equals(other.getPCAssayDescription_protocol()))) &&
            ((this.PCAssayDescription_comment==null && other.getPCAssayDescription_comment()==null) || 
             (this.PCAssayDescription_comment!=null &&
              this.PCAssayDescription_comment.equals(other.getPCAssayDescription_comment()))) &&
            ((this.PCAssayDescription_xref==null && other.getPCAssayDescription_xref()==null) || 
             (this.PCAssayDescription_xref!=null &&
              this.PCAssayDescription_xref.equals(other.getPCAssayDescription_xref()))) &&
            ((this.PCAssayDescription_results==null && other.getPCAssayDescription_results()==null) || 
             (this.PCAssayDescription_results!=null &&
              this.PCAssayDescription_results.equals(other.getPCAssayDescription_results()))) &&
            ((this.PCAssayDescription_pub==null && other.getPCAssayDescription_pub()==null) || 
             (this.PCAssayDescription_pub!=null &&
              this.PCAssayDescription_pub.equals(other.getPCAssayDescription_pub()))) &&
            ((this.PCAssayDescription_revision==null && other.getPCAssayDescription_revision()==null) || 
             (this.PCAssayDescription_revision!=null &&
              this.PCAssayDescription_revision.equals(other.getPCAssayDescription_revision())));
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
        if (getPCAssayDescription_aid() != null) {
            _hashCode += getPCAssayDescription_aid().hashCode();
        }
        if (getPCAssayDescription_aidSource() != null) {
            _hashCode += getPCAssayDescription_aidSource().hashCode();
        }
        if (getPCAssayDescription_name() != null) {
            _hashCode += getPCAssayDescription_name().hashCode();
        }
        if (getPCAssayDescription_description() != null) {
            _hashCode += getPCAssayDescription_description().hashCode();
        }
        if (getPCAssayDescription_protocol() != null) {
            _hashCode += getPCAssayDescription_protocol().hashCode();
        }
        if (getPCAssayDescription_comment() != null) {
            _hashCode += getPCAssayDescription_comment().hashCode();
        }
        if (getPCAssayDescription_xref() != null) {
            _hashCode += getPCAssayDescription_xref().hashCode();
        }
        if (getPCAssayDescription_results() != null) {
            _hashCode += getPCAssayDescription_results().hashCode();
        }
        if (getPCAssayDescription_pub() != null) {
            _hashCode += getPCAssayDescription_pub().hashCode();
        }
        if (getPCAssayDescription_revision() != null) {
            _hashCode += getPCAssayDescription_revision().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PCAssayDescriptionType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-AssayDescriptionType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCAssayDescription_aid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-AssayDescription_aid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-AssayDescription_aidType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCAssayDescription_aidSource");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-AssayDescription_aid-source"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-AssayDescription_aid-sourceType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCAssayDescription_name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-AssayDescription_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCAssayDescription_description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-AssayDescription_description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-AssayDescription_descriptionType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCAssayDescription_protocol");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-AssayDescription_protocol"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-AssayDescription_protocolType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCAssayDescription_comment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-AssayDescription_comment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-AssayDescription_commentType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCAssayDescription_xref");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-AssayDescription_xref"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-AssayDescription_xrefType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCAssayDescription_results");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-AssayDescription_results"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-AssayDescription_resultsType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCAssayDescription_pub");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-AssayDescription_pub"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-AssayDescription_pubType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCAssayDescription_revision");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-AssayDescription_revision"));
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
