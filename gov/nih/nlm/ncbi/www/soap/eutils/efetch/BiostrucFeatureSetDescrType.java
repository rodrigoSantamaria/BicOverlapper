/**
 * BiostrucFeatureSetDescrType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class BiostrucFeatureSetDescrType  implements java.io.Serializable {
    private java.lang.String biostrucFeatureSetDescr_name;

    private java.lang.String biostrucFeatureSetDescr_pdbComment;

    private java.lang.String biostrucFeatureSetDescr_otherComment;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucFeatureSetDescr_attributionType biostrucFeatureSetDescr_attribution;

    public BiostrucFeatureSetDescrType() {
    }

    public BiostrucFeatureSetDescrType(
           java.lang.String biostrucFeatureSetDescr_name,
           java.lang.String biostrucFeatureSetDescr_pdbComment,
           java.lang.String biostrucFeatureSetDescr_otherComment,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucFeatureSetDescr_attributionType biostrucFeatureSetDescr_attribution) {
           this.biostrucFeatureSetDescr_name = biostrucFeatureSetDescr_name;
           this.biostrucFeatureSetDescr_pdbComment = biostrucFeatureSetDescr_pdbComment;
           this.biostrucFeatureSetDescr_otherComment = biostrucFeatureSetDescr_otherComment;
           this.biostrucFeatureSetDescr_attribution = biostrucFeatureSetDescr_attribution;
    }


    /**
     * Gets the biostrucFeatureSetDescr_name value for this BiostrucFeatureSetDescrType.
     * 
     * @return biostrucFeatureSetDescr_name
     */
    public java.lang.String getBiostrucFeatureSetDescr_name() {
        return biostrucFeatureSetDescr_name;
    }


    /**
     * Sets the biostrucFeatureSetDescr_name value for this BiostrucFeatureSetDescrType.
     * 
     * @param biostrucFeatureSetDescr_name
     */
    public void setBiostrucFeatureSetDescr_name(java.lang.String biostrucFeatureSetDescr_name) {
        this.biostrucFeatureSetDescr_name = biostrucFeatureSetDescr_name;
    }


    /**
     * Gets the biostrucFeatureSetDescr_pdbComment value for this BiostrucFeatureSetDescrType.
     * 
     * @return biostrucFeatureSetDescr_pdbComment
     */
    public java.lang.String getBiostrucFeatureSetDescr_pdbComment() {
        return biostrucFeatureSetDescr_pdbComment;
    }


    /**
     * Sets the biostrucFeatureSetDescr_pdbComment value for this BiostrucFeatureSetDescrType.
     * 
     * @param biostrucFeatureSetDescr_pdbComment
     */
    public void setBiostrucFeatureSetDescr_pdbComment(java.lang.String biostrucFeatureSetDescr_pdbComment) {
        this.biostrucFeatureSetDescr_pdbComment = biostrucFeatureSetDescr_pdbComment;
    }


    /**
     * Gets the biostrucFeatureSetDescr_otherComment value for this BiostrucFeatureSetDescrType.
     * 
     * @return biostrucFeatureSetDescr_otherComment
     */
    public java.lang.String getBiostrucFeatureSetDescr_otherComment() {
        return biostrucFeatureSetDescr_otherComment;
    }


    /**
     * Sets the biostrucFeatureSetDescr_otherComment value for this BiostrucFeatureSetDescrType.
     * 
     * @param biostrucFeatureSetDescr_otherComment
     */
    public void setBiostrucFeatureSetDescr_otherComment(java.lang.String biostrucFeatureSetDescr_otherComment) {
        this.biostrucFeatureSetDescr_otherComment = biostrucFeatureSetDescr_otherComment;
    }


    /**
     * Gets the biostrucFeatureSetDescr_attribution value for this BiostrucFeatureSetDescrType.
     * 
     * @return biostrucFeatureSetDescr_attribution
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucFeatureSetDescr_attributionType getBiostrucFeatureSetDescr_attribution() {
        return biostrucFeatureSetDescr_attribution;
    }


    /**
     * Sets the biostrucFeatureSetDescr_attribution value for this BiostrucFeatureSetDescrType.
     * 
     * @param biostrucFeatureSetDescr_attribution
     */
    public void setBiostrucFeatureSetDescr_attribution(gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucFeatureSetDescr_attributionType biostrucFeatureSetDescr_attribution) {
        this.biostrucFeatureSetDescr_attribution = biostrucFeatureSetDescr_attribution;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BiostrucFeatureSetDescrType)) return false;
        BiostrucFeatureSetDescrType other = (BiostrucFeatureSetDescrType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.biostrucFeatureSetDescr_name==null && other.getBiostrucFeatureSetDescr_name()==null) || 
             (this.biostrucFeatureSetDescr_name!=null &&
              this.biostrucFeatureSetDescr_name.equals(other.getBiostrucFeatureSetDescr_name()))) &&
            ((this.biostrucFeatureSetDescr_pdbComment==null && other.getBiostrucFeatureSetDescr_pdbComment()==null) || 
             (this.biostrucFeatureSetDescr_pdbComment!=null &&
              this.biostrucFeatureSetDescr_pdbComment.equals(other.getBiostrucFeatureSetDescr_pdbComment()))) &&
            ((this.biostrucFeatureSetDescr_otherComment==null && other.getBiostrucFeatureSetDescr_otherComment()==null) || 
             (this.biostrucFeatureSetDescr_otherComment!=null &&
              this.biostrucFeatureSetDescr_otherComment.equals(other.getBiostrucFeatureSetDescr_otherComment()))) &&
            ((this.biostrucFeatureSetDescr_attribution==null && other.getBiostrucFeatureSetDescr_attribution()==null) || 
             (this.biostrucFeatureSetDescr_attribution!=null &&
              this.biostrucFeatureSetDescr_attribution.equals(other.getBiostrucFeatureSetDescr_attribution())));
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
        if (getBiostrucFeatureSetDescr_name() != null) {
            _hashCode += getBiostrucFeatureSetDescr_name().hashCode();
        }
        if (getBiostrucFeatureSetDescr_pdbComment() != null) {
            _hashCode += getBiostrucFeatureSetDescr_pdbComment().hashCode();
        }
        if (getBiostrucFeatureSetDescr_otherComment() != null) {
            _hashCode += getBiostrucFeatureSetDescr_otherComment().hashCode();
        }
        if (getBiostrucFeatureSetDescr_attribution() != null) {
            _hashCode += getBiostrucFeatureSetDescr_attribution().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BiostrucFeatureSetDescrType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-feature-set-descrType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("biostrucFeatureSetDescr_name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-feature-set-descr_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("biostrucFeatureSetDescr_pdbComment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-feature-set-descr_pdb-comment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("biostrucFeatureSetDescr_otherComment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-feature-set-descr_other-comment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("biostrucFeatureSetDescr_attribution");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-feature-set-descr_attribution"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-feature-set-descr_attributionType"));
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
