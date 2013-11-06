/**
 * FeatureEvidenceType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class FeatureEvidenceType  implements java.io.Serializable {
    private java.lang.String featureEvidence_comment;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.FeatureEvidence_referenceType featureEvidence_reference;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.FeatureEvidence_bsannotType featureEvidence_bsannot;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.FeatureEvidence_seqfeatType featureEvidence_seqfeat;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.FeatureEvidence_bookRefType featureEvidence_bookRef;

    public FeatureEvidenceType() {
    }

    public FeatureEvidenceType(
           java.lang.String featureEvidence_comment,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.FeatureEvidence_referenceType featureEvidence_reference,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.FeatureEvidence_bsannotType featureEvidence_bsannot,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.FeatureEvidence_seqfeatType featureEvidence_seqfeat,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.FeatureEvidence_bookRefType featureEvidence_bookRef) {
           this.featureEvidence_comment = featureEvidence_comment;
           this.featureEvidence_reference = featureEvidence_reference;
           this.featureEvidence_bsannot = featureEvidence_bsannot;
           this.featureEvidence_seqfeat = featureEvidence_seqfeat;
           this.featureEvidence_bookRef = featureEvidence_bookRef;
    }


    /**
     * Gets the featureEvidence_comment value for this FeatureEvidenceType.
     * 
     * @return featureEvidence_comment
     */
    public java.lang.String getFeatureEvidence_comment() {
        return featureEvidence_comment;
    }


    /**
     * Sets the featureEvidence_comment value for this FeatureEvidenceType.
     * 
     * @param featureEvidence_comment
     */
    public void setFeatureEvidence_comment(java.lang.String featureEvidence_comment) {
        this.featureEvidence_comment = featureEvidence_comment;
    }


    /**
     * Gets the featureEvidence_reference value for this FeatureEvidenceType.
     * 
     * @return featureEvidence_reference
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.FeatureEvidence_referenceType getFeatureEvidence_reference() {
        return featureEvidence_reference;
    }


    /**
     * Sets the featureEvidence_reference value for this FeatureEvidenceType.
     * 
     * @param featureEvidence_reference
     */
    public void setFeatureEvidence_reference(gov.nih.nlm.ncbi.www.soap.eutils.efetch.FeatureEvidence_referenceType featureEvidence_reference) {
        this.featureEvidence_reference = featureEvidence_reference;
    }


    /**
     * Gets the featureEvidence_bsannot value for this FeatureEvidenceType.
     * 
     * @return featureEvidence_bsannot
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.FeatureEvidence_bsannotType getFeatureEvidence_bsannot() {
        return featureEvidence_bsannot;
    }


    /**
     * Sets the featureEvidence_bsannot value for this FeatureEvidenceType.
     * 
     * @param featureEvidence_bsannot
     */
    public void setFeatureEvidence_bsannot(gov.nih.nlm.ncbi.www.soap.eutils.efetch.FeatureEvidence_bsannotType featureEvidence_bsannot) {
        this.featureEvidence_bsannot = featureEvidence_bsannot;
    }


    /**
     * Gets the featureEvidence_seqfeat value for this FeatureEvidenceType.
     * 
     * @return featureEvidence_seqfeat
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.FeatureEvidence_seqfeatType getFeatureEvidence_seqfeat() {
        return featureEvidence_seqfeat;
    }


    /**
     * Sets the featureEvidence_seqfeat value for this FeatureEvidenceType.
     * 
     * @param featureEvidence_seqfeat
     */
    public void setFeatureEvidence_seqfeat(gov.nih.nlm.ncbi.www.soap.eutils.efetch.FeatureEvidence_seqfeatType featureEvidence_seqfeat) {
        this.featureEvidence_seqfeat = featureEvidence_seqfeat;
    }


    /**
     * Gets the featureEvidence_bookRef value for this FeatureEvidenceType.
     * 
     * @return featureEvidence_bookRef
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.FeatureEvidence_bookRefType getFeatureEvidence_bookRef() {
        return featureEvidence_bookRef;
    }


    /**
     * Sets the featureEvidence_bookRef value for this FeatureEvidenceType.
     * 
     * @param featureEvidence_bookRef
     */
    public void setFeatureEvidence_bookRef(gov.nih.nlm.ncbi.www.soap.eutils.efetch.FeatureEvidence_bookRefType featureEvidence_bookRef) {
        this.featureEvidence_bookRef = featureEvidence_bookRef;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FeatureEvidenceType)) return false;
        FeatureEvidenceType other = (FeatureEvidenceType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.featureEvidence_comment==null && other.getFeatureEvidence_comment()==null) || 
             (this.featureEvidence_comment!=null &&
              this.featureEvidence_comment.equals(other.getFeatureEvidence_comment()))) &&
            ((this.featureEvidence_reference==null && other.getFeatureEvidence_reference()==null) || 
             (this.featureEvidence_reference!=null &&
              this.featureEvidence_reference.equals(other.getFeatureEvidence_reference()))) &&
            ((this.featureEvidence_bsannot==null && other.getFeatureEvidence_bsannot()==null) || 
             (this.featureEvidence_bsannot!=null &&
              this.featureEvidence_bsannot.equals(other.getFeatureEvidence_bsannot()))) &&
            ((this.featureEvidence_seqfeat==null && other.getFeatureEvidence_seqfeat()==null) || 
             (this.featureEvidence_seqfeat!=null &&
              this.featureEvidence_seqfeat.equals(other.getFeatureEvidence_seqfeat()))) &&
            ((this.featureEvidence_bookRef==null && other.getFeatureEvidence_bookRef()==null) || 
             (this.featureEvidence_bookRef!=null &&
              this.featureEvidence_bookRef.equals(other.getFeatureEvidence_bookRef())));
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
        if (getFeatureEvidence_comment() != null) {
            _hashCode += getFeatureEvidence_comment().hashCode();
        }
        if (getFeatureEvidence_reference() != null) {
            _hashCode += getFeatureEvidence_reference().hashCode();
        }
        if (getFeatureEvidence_bsannot() != null) {
            _hashCode += getFeatureEvidence_bsannot().hashCode();
        }
        if (getFeatureEvidence_seqfeat() != null) {
            _hashCode += getFeatureEvidence_seqfeat().hashCode();
        }
        if (getFeatureEvidence_bookRef() != null) {
            _hashCode += getFeatureEvidence_bookRef().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FeatureEvidenceType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Feature-evidenceType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("featureEvidence_comment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Feature-evidence_comment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("featureEvidence_reference");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Feature-evidence_reference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Feature-evidence_referenceType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("featureEvidence_bsannot");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Feature-evidence_bsannot"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Feature-evidence_bsannotType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("featureEvidence_seqfeat");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Feature-evidence_seqfeat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Feature-evidence_seqfeatType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("featureEvidence_bookRef");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Feature-evidence_book-ref"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Feature-evidence_book-refType"));
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
