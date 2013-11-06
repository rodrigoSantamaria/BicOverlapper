/**
 * BiostrucDescrType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class BiostrucDescrType  implements java.io.Serializable {
    private java.lang.String biostrucDescr_name;

    private java.lang.String biostrucDescr_pdbComment;

    private java.lang.String biostrucDescr_otherComment;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucDescr_historyType biostrucDescr_history;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucDescr_attributionType biostrucDescr_attribution;

    public BiostrucDescrType() {
    }

    public BiostrucDescrType(
           java.lang.String biostrucDescr_name,
           java.lang.String biostrucDescr_pdbComment,
           java.lang.String biostrucDescr_otherComment,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucDescr_historyType biostrucDescr_history,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucDescr_attributionType biostrucDescr_attribution) {
           this.biostrucDescr_name = biostrucDescr_name;
           this.biostrucDescr_pdbComment = biostrucDescr_pdbComment;
           this.biostrucDescr_otherComment = biostrucDescr_otherComment;
           this.biostrucDescr_history = biostrucDescr_history;
           this.biostrucDescr_attribution = biostrucDescr_attribution;
    }


    /**
     * Gets the biostrucDescr_name value for this BiostrucDescrType.
     * 
     * @return biostrucDescr_name
     */
    public java.lang.String getBiostrucDescr_name() {
        return biostrucDescr_name;
    }


    /**
     * Sets the biostrucDescr_name value for this BiostrucDescrType.
     * 
     * @param biostrucDescr_name
     */
    public void setBiostrucDescr_name(java.lang.String biostrucDescr_name) {
        this.biostrucDescr_name = biostrucDescr_name;
    }


    /**
     * Gets the biostrucDescr_pdbComment value for this BiostrucDescrType.
     * 
     * @return biostrucDescr_pdbComment
     */
    public java.lang.String getBiostrucDescr_pdbComment() {
        return biostrucDescr_pdbComment;
    }


    /**
     * Sets the biostrucDescr_pdbComment value for this BiostrucDescrType.
     * 
     * @param biostrucDescr_pdbComment
     */
    public void setBiostrucDescr_pdbComment(java.lang.String biostrucDescr_pdbComment) {
        this.biostrucDescr_pdbComment = biostrucDescr_pdbComment;
    }


    /**
     * Gets the biostrucDescr_otherComment value for this BiostrucDescrType.
     * 
     * @return biostrucDescr_otherComment
     */
    public java.lang.String getBiostrucDescr_otherComment() {
        return biostrucDescr_otherComment;
    }


    /**
     * Sets the biostrucDescr_otherComment value for this BiostrucDescrType.
     * 
     * @param biostrucDescr_otherComment
     */
    public void setBiostrucDescr_otherComment(java.lang.String biostrucDescr_otherComment) {
        this.biostrucDescr_otherComment = biostrucDescr_otherComment;
    }


    /**
     * Gets the biostrucDescr_history value for this BiostrucDescrType.
     * 
     * @return biostrucDescr_history
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucDescr_historyType getBiostrucDescr_history() {
        return biostrucDescr_history;
    }


    /**
     * Sets the biostrucDescr_history value for this BiostrucDescrType.
     * 
     * @param biostrucDescr_history
     */
    public void setBiostrucDescr_history(gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucDescr_historyType biostrucDescr_history) {
        this.biostrucDescr_history = biostrucDescr_history;
    }


    /**
     * Gets the biostrucDescr_attribution value for this BiostrucDescrType.
     * 
     * @return biostrucDescr_attribution
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucDescr_attributionType getBiostrucDescr_attribution() {
        return biostrucDescr_attribution;
    }


    /**
     * Sets the biostrucDescr_attribution value for this BiostrucDescrType.
     * 
     * @param biostrucDescr_attribution
     */
    public void setBiostrucDescr_attribution(gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucDescr_attributionType biostrucDescr_attribution) {
        this.biostrucDescr_attribution = biostrucDescr_attribution;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BiostrucDescrType)) return false;
        BiostrucDescrType other = (BiostrucDescrType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.biostrucDescr_name==null && other.getBiostrucDescr_name()==null) || 
             (this.biostrucDescr_name!=null &&
              this.biostrucDescr_name.equals(other.getBiostrucDescr_name()))) &&
            ((this.biostrucDescr_pdbComment==null && other.getBiostrucDescr_pdbComment()==null) || 
             (this.biostrucDescr_pdbComment!=null &&
              this.biostrucDescr_pdbComment.equals(other.getBiostrucDescr_pdbComment()))) &&
            ((this.biostrucDescr_otherComment==null && other.getBiostrucDescr_otherComment()==null) || 
             (this.biostrucDescr_otherComment!=null &&
              this.biostrucDescr_otherComment.equals(other.getBiostrucDescr_otherComment()))) &&
            ((this.biostrucDescr_history==null && other.getBiostrucDescr_history()==null) || 
             (this.biostrucDescr_history!=null &&
              this.biostrucDescr_history.equals(other.getBiostrucDescr_history()))) &&
            ((this.biostrucDescr_attribution==null && other.getBiostrucDescr_attribution()==null) || 
             (this.biostrucDescr_attribution!=null &&
              this.biostrucDescr_attribution.equals(other.getBiostrucDescr_attribution())));
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
        if (getBiostrucDescr_name() != null) {
            _hashCode += getBiostrucDescr_name().hashCode();
        }
        if (getBiostrucDescr_pdbComment() != null) {
            _hashCode += getBiostrucDescr_pdbComment().hashCode();
        }
        if (getBiostrucDescr_otherComment() != null) {
            _hashCode += getBiostrucDescr_otherComment().hashCode();
        }
        if (getBiostrucDescr_history() != null) {
            _hashCode += getBiostrucDescr_history().hashCode();
        }
        if (getBiostrucDescr_attribution() != null) {
            _hashCode += getBiostrucDescr_attribution().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BiostrucDescrType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-descrType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("biostrucDescr_name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-descr_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("biostrucDescr_pdbComment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-descr_pdb-comment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("biostrucDescr_otherComment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-descr_other-comment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("biostrucDescr_history");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-descr_history"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-descr_historyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("biostrucDescr_attribution");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-descr_attribution"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-descr_attributionType"));
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
