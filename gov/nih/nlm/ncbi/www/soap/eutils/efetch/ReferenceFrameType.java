/**
 * ReferenceFrameType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ReferenceFrameType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ReferenceFrame_biostrucIdType referenceFrame_biostrucId;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ReferenceFrame_rotationTranslationType referenceFrame_rotationTranslation;

    public ReferenceFrameType() {
    }

    public ReferenceFrameType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ReferenceFrame_biostrucIdType referenceFrame_biostrucId,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ReferenceFrame_rotationTranslationType referenceFrame_rotationTranslation) {
           this.referenceFrame_biostrucId = referenceFrame_biostrucId;
           this.referenceFrame_rotationTranslation = referenceFrame_rotationTranslation;
    }


    /**
     * Gets the referenceFrame_biostrucId value for this ReferenceFrameType.
     * 
     * @return referenceFrame_biostrucId
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ReferenceFrame_biostrucIdType getReferenceFrame_biostrucId() {
        return referenceFrame_biostrucId;
    }


    /**
     * Sets the referenceFrame_biostrucId value for this ReferenceFrameType.
     * 
     * @param referenceFrame_biostrucId
     */
    public void setReferenceFrame_biostrucId(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ReferenceFrame_biostrucIdType referenceFrame_biostrucId) {
        this.referenceFrame_biostrucId = referenceFrame_biostrucId;
    }


    /**
     * Gets the referenceFrame_rotationTranslation value for this ReferenceFrameType.
     * 
     * @return referenceFrame_rotationTranslation
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ReferenceFrame_rotationTranslationType getReferenceFrame_rotationTranslation() {
        return referenceFrame_rotationTranslation;
    }


    /**
     * Sets the referenceFrame_rotationTranslation value for this ReferenceFrameType.
     * 
     * @param referenceFrame_rotationTranslation
     */
    public void setReferenceFrame_rotationTranslation(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ReferenceFrame_rotationTranslationType referenceFrame_rotationTranslation) {
        this.referenceFrame_rotationTranslation = referenceFrame_rotationTranslation;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReferenceFrameType)) return false;
        ReferenceFrameType other = (ReferenceFrameType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.referenceFrame_biostrucId==null && other.getReferenceFrame_biostrucId()==null) || 
             (this.referenceFrame_biostrucId!=null &&
              this.referenceFrame_biostrucId.equals(other.getReferenceFrame_biostrucId()))) &&
            ((this.referenceFrame_rotationTranslation==null && other.getReferenceFrame_rotationTranslation()==null) || 
             (this.referenceFrame_rotationTranslation!=null &&
              this.referenceFrame_rotationTranslation.equals(other.getReferenceFrame_rotationTranslation())));
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
        if (getReferenceFrame_biostrucId() != null) {
            _hashCode += getReferenceFrame_biostrucId().hashCode();
        }
        if (getReferenceFrame_rotationTranslation() != null) {
            _hashCode += getReferenceFrame_rotationTranslation().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReferenceFrameType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Reference-frameType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("referenceFrame_biostrucId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Reference-frame_biostruc-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Reference-frame_biostruc-idType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("referenceFrame_rotationTranslation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Reference-frame_rotation-translation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Reference-frame_rotation-translationType"));
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
