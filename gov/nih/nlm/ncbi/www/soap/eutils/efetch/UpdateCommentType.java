/**
 * UpdateCommentType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class UpdateCommentType  implements java.io.Serializable {
    private java.lang.String updateComment_comment;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.UpdateComment_addthisType updateComment_addthis;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.UpdateComment_replacesType updateComment_replaces;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.UpdateComment_rejectLocType updateComment_rejectLoc;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.UpdateComment_referenceType updateComment_reference;

    public UpdateCommentType() {
    }

    public UpdateCommentType(
           java.lang.String updateComment_comment,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.UpdateComment_addthisType updateComment_addthis,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.UpdateComment_replacesType updateComment_replaces,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.UpdateComment_rejectLocType updateComment_rejectLoc,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.UpdateComment_referenceType updateComment_reference) {
           this.updateComment_comment = updateComment_comment;
           this.updateComment_addthis = updateComment_addthis;
           this.updateComment_replaces = updateComment_replaces;
           this.updateComment_rejectLoc = updateComment_rejectLoc;
           this.updateComment_reference = updateComment_reference;
    }


    /**
     * Gets the updateComment_comment value for this UpdateCommentType.
     * 
     * @return updateComment_comment
     */
    public java.lang.String getUpdateComment_comment() {
        return updateComment_comment;
    }


    /**
     * Sets the updateComment_comment value for this UpdateCommentType.
     * 
     * @param updateComment_comment
     */
    public void setUpdateComment_comment(java.lang.String updateComment_comment) {
        this.updateComment_comment = updateComment_comment;
    }


    /**
     * Gets the updateComment_addthis value for this UpdateCommentType.
     * 
     * @return updateComment_addthis
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.UpdateComment_addthisType getUpdateComment_addthis() {
        return updateComment_addthis;
    }


    /**
     * Sets the updateComment_addthis value for this UpdateCommentType.
     * 
     * @param updateComment_addthis
     */
    public void setUpdateComment_addthis(gov.nih.nlm.ncbi.www.soap.eutils.efetch.UpdateComment_addthisType updateComment_addthis) {
        this.updateComment_addthis = updateComment_addthis;
    }


    /**
     * Gets the updateComment_replaces value for this UpdateCommentType.
     * 
     * @return updateComment_replaces
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.UpdateComment_replacesType getUpdateComment_replaces() {
        return updateComment_replaces;
    }


    /**
     * Sets the updateComment_replaces value for this UpdateCommentType.
     * 
     * @param updateComment_replaces
     */
    public void setUpdateComment_replaces(gov.nih.nlm.ncbi.www.soap.eutils.efetch.UpdateComment_replacesType updateComment_replaces) {
        this.updateComment_replaces = updateComment_replaces;
    }


    /**
     * Gets the updateComment_rejectLoc value for this UpdateCommentType.
     * 
     * @return updateComment_rejectLoc
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.UpdateComment_rejectLocType getUpdateComment_rejectLoc() {
        return updateComment_rejectLoc;
    }


    /**
     * Sets the updateComment_rejectLoc value for this UpdateCommentType.
     * 
     * @param updateComment_rejectLoc
     */
    public void setUpdateComment_rejectLoc(gov.nih.nlm.ncbi.www.soap.eutils.efetch.UpdateComment_rejectLocType updateComment_rejectLoc) {
        this.updateComment_rejectLoc = updateComment_rejectLoc;
    }


    /**
     * Gets the updateComment_reference value for this UpdateCommentType.
     * 
     * @return updateComment_reference
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.UpdateComment_referenceType getUpdateComment_reference() {
        return updateComment_reference;
    }


    /**
     * Sets the updateComment_reference value for this UpdateCommentType.
     * 
     * @param updateComment_reference
     */
    public void setUpdateComment_reference(gov.nih.nlm.ncbi.www.soap.eutils.efetch.UpdateComment_referenceType updateComment_reference) {
        this.updateComment_reference = updateComment_reference;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateCommentType)) return false;
        UpdateCommentType other = (UpdateCommentType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.updateComment_comment==null && other.getUpdateComment_comment()==null) || 
             (this.updateComment_comment!=null &&
              this.updateComment_comment.equals(other.getUpdateComment_comment()))) &&
            ((this.updateComment_addthis==null && other.getUpdateComment_addthis()==null) || 
             (this.updateComment_addthis!=null &&
              this.updateComment_addthis.equals(other.getUpdateComment_addthis()))) &&
            ((this.updateComment_replaces==null && other.getUpdateComment_replaces()==null) || 
             (this.updateComment_replaces!=null &&
              this.updateComment_replaces.equals(other.getUpdateComment_replaces()))) &&
            ((this.updateComment_rejectLoc==null && other.getUpdateComment_rejectLoc()==null) || 
             (this.updateComment_rejectLoc!=null &&
              this.updateComment_rejectLoc.equals(other.getUpdateComment_rejectLoc()))) &&
            ((this.updateComment_reference==null && other.getUpdateComment_reference()==null) || 
             (this.updateComment_reference!=null &&
              this.updateComment_reference.equals(other.getUpdateComment_reference())));
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
        if (getUpdateComment_comment() != null) {
            _hashCode += getUpdateComment_comment().hashCode();
        }
        if (getUpdateComment_addthis() != null) {
            _hashCode += getUpdateComment_addthis().hashCode();
        }
        if (getUpdateComment_replaces() != null) {
            _hashCode += getUpdateComment_replaces().hashCode();
        }
        if (getUpdateComment_rejectLoc() != null) {
            _hashCode += getUpdateComment_rejectLoc().hashCode();
        }
        if (getUpdateComment_reference() != null) {
            _hashCode += getUpdateComment_reference().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdateCommentType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Update-commentType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updateComment_comment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Update-comment_comment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updateComment_addthis");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Update-comment_addthis"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Update-comment_addthisType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updateComment_replaces");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Update-comment_replaces"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Update-comment_replacesType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updateComment_rejectLoc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Update-comment_reject-loc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Update-comment_reject-locType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updateComment_reference");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Update-comment_reference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Update-comment_referenceType"));
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
