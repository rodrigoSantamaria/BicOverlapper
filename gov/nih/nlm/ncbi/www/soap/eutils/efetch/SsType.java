/**
 * SsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class SsType  implements java.io.Serializable {
    private java.lang.String ss_ssId;

    private java.lang.String ss_handle;

    private java.lang.String ss_batchId;

    private java.lang.String ss_locSnpId;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Ss_subSnpClassType ss_subSnpClass;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Ss_orientType ss_orient;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Ss_strandType ss_strand;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Ss_molTypeType ss_molType;

    private java.lang.String ss_buildId;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Ss_methodClassType ss_methodClass;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Ss_validatedType ss_validated;

    private java.lang.String ss_linkoutUrl;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Ss_sequenceType ss_sequence;

    public SsType() {
    }

    public SsType(
           java.lang.String ss_ssId,
           java.lang.String ss_handle,
           java.lang.String ss_batchId,
           java.lang.String ss_locSnpId,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Ss_subSnpClassType ss_subSnpClass,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Ss_orientType ss_orient,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Ss_strandType ss_strand,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Ss_molTypeType ss_molType,
           java.lang.String ss_buildId,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Ss_methodClassType ss_methodClass,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Ss_validatedType ss_validated,
           java.lang.String ss_linkoutUrl,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Ss_sequenceType ss_sequence) {
           this.ss_ssId = ss_ssId;
           this.ss_handle = ss_handle;
           this.ss_batchId = ss_batchId;
           this.ss_locSnpId = ss_locSnpId;
           this.ss_subSnpClass = ss_subSnpClass;
           this.ss_orient = ss_orient;
           this.ss_strand = ss_strand;
           this.ss_molType = ss_molType;
           this.ss_buildId = ss_buildId;
           this.ss_methodClass = ss_methodClass;
           this.ss_validated = ss_validated;
           this.ss_linkoutUrl = ss_linkoutUrl;
           this.ss_sequence = ss_sequence;
    }


    /**
     * Gets the ss_ssId value for this SsType.
     * 
     * @return ss_ssId
     */
    public java.lang.String getSs_ssId() {
        return ss_ssId;
    }


    /**
     * Sets the ss_ssId value for this SsType.
     * 
     * @param ss_ssId
     */
    public void setSs_ssId(java.lang.String ss_ssId) {
        this.ss_ssId = ss_ssId;
    }


    /**
     * Gets the ss_handle value for this SsType.
     * 
     * @return ss_handle
     */
    public java.lang.String getSs_handle() {
        return ss_handle;
    }


    /**
     * Sets the ss_handle value for this SsType.
     * 
     * @param ss_handle
     */
    public void setSs_handle(java.lang.String ss_handle) {
        this.ss_handle = ss_handle;
    }


    /**
     * Gets the ss_batchId value for this SsType.
     * 
     * @return ss_batchId
     */
    public java.lang.String getSs_batchId() {
        return ss_batchId;
    }


    /**
     * Sets the ss_batchId value for this SsType.
     * 
     * @param ss_batchId
     */
    public void setSs_batchId(java.lang.String ss_batchId) {
        this.ss_batchId = ss_batchId;
    }


    /**
     * Gets the ss_locSnpId value for this SsType.
     * 
     * @return ss_locSnpId
     */
    public java.lang.String getSs_locSnpId() {
        return ss_locSnpId;
    }


    /**
     * Sets the ss_locSnpId value for this SsType.
     * 
     * @param ss_locSnpId
     */
    public void setSs_locSnpId(java.lang.String ss_locSnpId) {
        this.ss_locSnpId = ss_locSnpId;
    }


    /**
     * Gets the ss_subSnpClass value for this SsType.
     * 
     * @return ss_subSnpClass
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Ss_subSnpClassType getSs_subSnpClass() {
        return ss_subSnpClass;
    }


    /**
     * Sets the ss_subSnpClass value for this SsType.
     * 
     * @param ss_subSnpClass
     */
    public void setSs_subSnpClass(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Ss_subSnpClassType ss_subSnpClass) {
        this.ss_subSnpClass = ss_subSnpClass;
    }


    /**
     * Gets the ss_orient value for this SsType.
     * 
     * @return ss_orient
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Ss_orientType getSs_orient() {
        return ss_orient;
    }


    /**
     * Sets the ss_orient value for this SsType.
     * 
     * @param ss_orient
     */
    public void setSs_orient(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Ss_orientType ss_orient) {
        this.ss_orient = ss_orient;
    }


    /**
     * Gets the ss_strand value for this SsType.
     * 
     * @return ss_strand
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Ss_strandType getSs_strand() {
        return ss_strand;
    }


    /**
     * Sets the ss_strand value for this SsType.
     * 
     * @param ss_strand
     */
    public void setSs_strand(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Ss_strandType ss_strand) {
        this.ss_strand = ss_strand;
    }


    /**
     * Gets the ss_molType value for this SsType.
     * 
     * @return ss_molType
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Ss_molTypeType getSs_molType() {
        return ss_molType;
    }


    /**
     * Sets the ss_molType value for this SsType.
     * 
     * @param ss_molType
     */
    public void setSs_molType(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Ss_molTypeType ss_molType) {
        this.ss_molType = ss_molType;
    }


    /**
     * Gets the ss_buildId value for this SsType.
     * 
     * @return ss_buildId
     */
    public java.lang.String getSs_buildId() {
        return ss_buildId;
    }


    /**
     * Sets the ss_buildId value for this SsType.
     * 
     * @param ss_buildId
     */
    public void setSs_buildId(java.lang.String ss_buildId) {
        this.ss_buildId = ss_buildId;
    }


    /**
     * Gets the ss_methodClass value for this SsType.
     * 
     * @return ss_methodClass
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Ss_methodClassType getSs_methodClass() {
        return ss_methodClass;
    }


    /**
     * Sets the ss_methodClass value for this SsType.
     * 
     * @param ss_methodClass
     */
    public void setSs_methodClass(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Ss_methodClassType ss_methodClass) {
        this.ss_methodClass = ss_methodClass;
    }


    /**
     * Gets the ss_validated value for this SsType.
     * 
     * @return ss_validated
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Ss_validatedType getSs_validated() {
        return ss_validated;
    }


    /**
     * Sets the ss_validated value for this SsType.
     * 
     * @param ss_validated
     */
    public void setSs_validated(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Ss_validatedType ss_validated) {
        this.ss_validated = ss_validated;
    }


    /**
     * Gets the ss_linkoutUrl value for this SsType.
     * 
     * @return ss_linkoutUrl
     */
    public java.lang.String getSs_linkoutUrl() {
        return ss_linkoutUrl;
    }


    /**
     * Sets the ss_linkoutUrl value for this SsType.
     * 
     * @param ss_linkoutUrl
     */
    public void setSs_linkoutUrl(java.lang.String ss_linkoutUrl) {
        this.ss_linkoutUrl = ss_linkoutUrl;
    }


    /**
     * Gets the ss_sequence value for this SsType.
     * 
     * @return ss_sequence
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Ss_sequenceType getSs_sequence() {
        return ss_sequence;
    }


    /**
     * Sets the ss_sequence value for this SsType.
     * 
     * @param ss_sequence
     */
    public void setSs_sequence(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Ss_sequenceType ss_sequence) {
        this.ss_sequence = ss_sequence;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SsType)) return false;
        SsType other = (SsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ss_ssId==null && other.getSs_ssId()==null) || 
             (this.ss_ssId!=null &&
              this.ss_ssId.equals(other.getSs_ssId()))) &&
            ((this.ss_handle==null && other.getSs_handle()==null) || 
             (this.ss_handle!=null &&
              this.ss_handle.equals(other.getSs_handle()))) &&
            ((this.ss_batchId==null && other.getSs_batchId()==null) || 
             (this.ss_batchId!=null &&
              this.ss_batchId.equals(other.getSs_batchId()))) &&
            ((this.ss_locSnpId==null && other.getSs_locSnpId()==null) || 
             (this.ss_locSnpId!=null &&
              this.ss_locSnpId.equals(other.getSs_locSnpId()))) &&
            ((this.ss_subSnpClass==null && other.getSs_subSnpClass()==null) || 
             (this.ss_subSnpClass!=null &&
              this.ss_subSnpClass.equals(other.getSs_subSnpClass()))) &&
            ((this.ss_orient==null && other.getSs_orient()==null) || 
             (this.ss_orient!=null &&
              this.ss_orient.equals(other.getSs_orient()))) &&
            ((this.ss_strand==null && other.getSs_strand()==null) || 
             (this.ss_strand!=null &&
              this.ss_strand.equals(other.getSs_strand()))) &&
            ((this.ss_molType==null && other.getSs_molType()==null) || 
             (this.ss_molType!=null &&
              this.ss_molType.equals(other.getSs_molType()))) &&
            ((this.ss_buildId==null && other.getSs_buildId()==null) || 
             (this.ss_buildId!=null &&
              this.ss_buildId.equals(other.getSs_buildId()))) &&
            ((this.ss_methodClass==null && other.getSs_methodClass()==null) || 
             (this.ss_methodClass!=null &&
              this.ss_methodClass.equals(other.getSs_methodClass()))) &&
            ((this.ss_validated==null && other.getSs_validated()==null) || 
             (this.ss_validated!=null &&
              this.ss_validated.equals(other.getSs_validated()))) &&
            ((this.ss_linkoutUrl==null && other.getSs_linkoutUrl()==null) || 
             (this.ss_linkoutUrl!=null &&
              this.ss_linkoutUrl.equals(other.getSs_linkoutUrl()))) &&
            ((this.ss_sequence==null && other.getSs_sequence()==null) || 
             (this.ss_sequence!=null &&
              this.ss_sequence.equals(other.getSs_sequence())));
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
        if (getSs_ssId() != null) {
            _hashCode += getSs_ssId().hashCode();
        }
        if (getSs_handle() != null) {
            _hashCode += getSs_handle().hashCode();
        }
        if (getSs_batchId() != null) {
            _hashCode += getSs_batchId().hashCode();
        }
        if (getSs_locSnpId() != null) {
            _hashCode += getSs_locSnpId().hashCode();
        }
        if (getSs_subSnpClass() != null) {
            _hashCode += getSs_subSnpClass().hashCode();
        }
        if (getSs_orient() != null) {
            _hashCode += getSs_orient().hashCode();
        }
        if (getSs_strand() != null) {
            _hashCode += getSs_strand().hashCode();
        }
        if (getSs_molType() != null) {
            _hashCode += getSs_molType().hashCode();
        }
        if (getSs_buildId() != null) {
            _hashCode += getSs_buildId().hashCode();
        }
        if (getSs_methodClass() != null) {
            _hashCode += getSs_methodClass().hashCode();
        }
        if (getSs_validated() != null) {
            _hashCode += getSs_validated().hashCode();
        }
        if (getSs_linkoutUrl() != null) {
            _hashCode += getSs_linkoutUrl().hashCode();
        }
        if (getSs_sequence() != null) {
            _hashCode += getSs_sequence().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "SsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ss_ssId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Ss_ssId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ss_handle");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Ss_handle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ss_batchId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Ss_batchId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ss_locSnpId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Ss_locSnpId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ss_subSnpClass");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Ss_subSnpClass"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Ss_subSnpClassType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ss_orient");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Ss_orient"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Ss_orientType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ss_strand");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Ss_strand"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Ss_strandType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ss_molType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Ss_molType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Ss_molTypeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ss_buildId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Ss_buildId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ss_methodClass");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Ss_methodClass"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Ss_methodClassType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ss_validated");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Ss_validated"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Ss_validatedType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ss_linkoutUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Ss_linkoutUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ss_sequence");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Ss_sequence"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Ss_sequenceType"));
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
