/**
 * HGCommentarySetType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class HGCommentarySetType  implements java.io.Serializable {
    private java.lang.String HGCommentarySet_hgId;

    private java.lang.String HGCommentarySet_title;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.HGCommentarySet_commentariesType HGCommentarySet_commentaries;

    public HGCommentarySetType() {
    }

    public HGCommentarySetType(
           java.lang.String HGCommentarySet_hgId,
           java.lang.String HGCommentarySet_title,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.HGCommentarySet_commentariesType HGCommentarySet_commentaries) {
           this.HGCommentarySet_hgId = HGCommentarySet_hgId;
           this.HGCommentarySet_title = HGCommentarySet_title;
           this.HGCommentarySet_commentaries = HGCommentarySet_commentaries;
    }


    /**
     * Gets the HGCommentarySet_hgId value for this HGCommentarySetType.
     * 
     * @return HGCommentarySet_hgId
     */
    public java.lang.String getHGCommentarySet_hgId() {
        return HGCommentarySet_hgId;
    }


    /**
     * Sets the HGCommentarySet_hgId value for this HGCommentarySetType.
     * 
     * @param HGCommentarySet_hgId
     */
    public void setHGCommentarySet_hgId(java.lang.String HGCommentarySet_hgId) {
        this.HGCommentarySet_hgId = HGCommentarySet_hgId;
    }


    /**
     * Gets the HGCommentarySet_title value for this HGCommentarySetType.
     * 
     * @return HGCommentarySet_title
     */
    public java.lang.String getHGCommentarySet_title() {
        return HGCommentarySet_title;
    }


    /**
     * Sets the HGCommentarySet_title value for this HGCommentarySetType.
     * 
     * @param HGCommentarySet_title
     */
    public void setHGCommentarySet_title(java.lang.String HGCommentarySet_title) {
        this.HGCommentarySet_title = HGCommentarySet_title;
    }


    /**
     * Gets the HGCommentarySet_commentaries value for this HGCommentarySetType.
     * 
     * @return HGCommentarySet_commentaries
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.HGCommentarySet_commentariesType getHGCommentarySet_commentaries() {
        return HGCommentarySet_commentaries;
    }


    /**
     * Sets the HGCommentarySet_commentaries value for this HGCommentarySetType.
     * 
     * @param HGCommentarySet_commentaries
     */
    public void setHGCommentarySet_commentaries(gov.nih.nlm.ncbi.www.soap.eutils.efetch.HGCommentarySet_commentariesType HGCommentarySet_commentaries) {
        this.HGCommentarySet_commentaries = HGCommentarySet_commentaries;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HGCommentarySetType)) return false;
        HGCommentarySetType other = (HGCommentarySetType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.HGCommentarySet_hgId==null && other.getHGCommentarySet_hgId()==null) || 
             (this.HGCommentarySet_hgId!=null &&
              this.HGCommentarySet_hgId.equals(other.getHGCommentarySet_hgId()))) &&
            ((this.HGCommentarySet_title==null && other.getHGCommentarySet_title()==null) || 
             (this.HGCommentarySet_title!=null &&
              this.HGCommentarySet_title.equals(other.getHGCommentarySet_title()))) &&
            ((this.HGCommentarySet_commentaries==null && other.getHGCommentarySet_commentaries()==null) || 
             (this.HGCommentarySet_commentaries!=null &&
              this.HGCommentarySet_commentaries.equals(other.getHGCommentarySet_commentaries())));
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
        if (getHGCommentarySet_hgId() != null) {
            _hashCode += getHGCommentarySet_hgId().hashCode();
        }
        if (getHGCommentarySet_title() != null) {
            _hashCode += getHGCommentarySet_title().hashCode();
        }
        if (getHGCommentarySet_commentaries() != null) {
            _hashCode += getHGCommentarySet_commentaries().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HGCommentarySetType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "HG-CommentarySetType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("HGCommentarySet_hgId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "HG-CommentarySet_hg-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("HGCommentarySet_title");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "HG-CommentarySet_title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("HGCommentarySet_commentaries");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "HG-CommentarySet_commentaries"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "HG-CommentarySet_commentariesType"));
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
