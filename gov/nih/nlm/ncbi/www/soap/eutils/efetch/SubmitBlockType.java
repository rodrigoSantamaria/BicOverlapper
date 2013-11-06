/**
 * SubmitBlockType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class SubmitBlockType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.SubmitBlock_contactType submitBlock_contact;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.SubmitBlock_citType submitBlock_cit;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.SubmitBlock_hupType submitBlock_hup;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.SubmitBlock_reldateType submitBlock_reldate;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.SubmitBlock_subtypeType submitBlock_subtype;

    private java.lang.String submitBlock_tool;

    private java.lang.String submitBlock_userTag;

    private java.lang.String submitBlock_comment;

    public SubmitBlockType() {
    }

    public SubmitBlockType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.SubmitBlock_contactType submitBlock_contact,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.SubmitBlock_citType submitBlock_cit,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.SubmitBlock_hupType submitBlock_hup,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.SubmitBlock_reldateType submitBlock_reldate,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.SubmitBlock_subtypeType submitBlock_subtype,
           java.lang.String submitBlock_tool,
           java.lang.String submitBlock_userTag,
           java.lang.String submitBlock_comment) {
           this.submitBlock_contact = submitBlock_contact;
           this.submitBlock_cit = submitBlock_cit;
           this.submitBlock_hup = submitBlock_hup;
           this.submitBlock_reldate = submitBlock_reldate;
           this.submitBlock_subtype = submitBlock_subtype;
           this.submitBlock_tool = submitBlock_tool;
           this.submitBlock_userTag = submitBlock_userTag;
           this.submitBlock_comment = submitBlock_comment;
    }


    /**
     * Gets the submitBlock_contact value for this SubmitBlockType.
     * 
     * @return submitBlock_contact
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SubmitBlock_contactType getSubmitBlock_contact() {
        return submitBlock_contact;
    }


    /**
     * Sets the submitBlock_contact value for this SubmitBlockType.
     * 
     * @param submitBlock_contact
     */
    public void setSubmitBlock_contact(gov.nih.nlm.ncbi.www.soap.eutils.efetch.SubmitBlock_contactType submitBlock_contact) {
        this.submitBlock_contact = submitBlock_contact;
    }


    /**
     * Gets the submitBlock_cit value for this SubmitBlockType.
     * 
     * @return submitBlock_cit
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SubmitBlock_citType getSubmitBlock_cit() {
        return submitBlock_cit;
    }


    /**
     * Sets the submitBlock_cit value for this SubmitBlockType.
     * 
     * @param submitBlock_cit
     */
    public void setSubmitBlock_cit(gov.nih.nlm.ncbi.www.soap.eutils.efetch.SubmitBlock_citType submitBlock_cit) {
        this.submitBlock_cit = submitBlock_cit;
    }


    /**
     * Gets the submitBlock_hup value for this SubmitBlockType.
     * 
     * @return submitBlock_hup
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SubmitBlock_hupType getSubmitBlock_hup() {
        return submitBlock_hup;
    }


    /**
     * Sets the submitBlock_hup value for this SubmitBlockType.
     * 
     * @param submitBlock_hup
     */
    public void setSubmitBlock_hup(gov.nih.nlm.ncbi.www.soap.eutils.efetch.SubmitBlock_hupType submitBlock_hup) {
        this.submitBlock_hup = submitBlock_hup;
    }


    /**
     * Gets the submitBlock_reldate value for this SubmitBlockType.
     * 
     * @return submitBlock_reldate
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SubmitBlock_reldateType getSubmitBlock_reldate() {
        return submitBlock_reldate;
    }


    /**
     * Sets the submitBlock_reldate value for this SubmitBlockType.
     * 
     * @param submitBlock_reldate
     */
    public void setSubmitBlock_reldate(gov.nih.nlm.ncbi.www.soap.eutils.efetch.SubmitBlock_reldateType submitBlock_reldate) {
        this.submitBlock_reldate = submitBlock_reldate;
    }


    /**
     * Gets the submitBlock_subtype value for this SubmitBlockType.
     * 
     * @return submitBlock_subtype
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SubmitBlock_subtypeType getSubmitBlock_subtype() {
        return submitBlock_subtype;
    }


    /**
     * Sets the submitBlock_subtype value for this SubmitBlockType.
     * 
     * @param submitBlock_subtype
     */
    public void setSubmitBlock_subtype(gov.nih.nlm.ncbi.www.soap.eutils.efetch.SubmitBlock_subtypeType submitBlock_subtype) {
        this.submitBlock_subtype = submitBlock_subtype;
    }


    /**
     * Gets the submitBlock_tool value for this SubmitBlockType.
     * 
     * @return submitBlock_tool
     */
    public java.lang.String getSubmitBlock_tool() {
        return submitBlock_tool;
    }


    /**
     * Sets the submitBlock_tool value for this SubmitBlockType.
     * 
     * @param submitBlock_tool
     */
    public void setSubmitBlock_tool(java.lang.String submitBlock_tool) {
        this.submitBlock_tool = submitBlock_tool;
    }


    /**
     * Gets the submitBlock_userTag value for this SubmitBlockType.
     * 
     * @return submitBlock_userTag
     */
    public java.lang.String getSubmitBlock_userTag() {
        return submitBlock_userTag;
    }


    /**
     * Sets the submitBlock_userTag value for this SubmitBlockType.
     * 
     * @param submitBlock_userTag
     */
    public void setSubmitBlock_userTag(java.lang.String submitBlock_userTag) {
        this.submitBlock_userTag = submitBlock_userTag;
    }


    /**
     * Gets the submitBlock_comment value for this SubmitBlockType.
     * 
     * @return submitBlock_comment
     */
    public java.lang.String getSubmitBlock_comment() {
        return submitBlock_comment;
    }


    /**
     * Sets the submitBlock_comment value for this SubmitBlockType.
     * 
     * @param submitBlock_comment
     */
    public void setSubmitBlock_comment(java.lang.String submitBlock_comment) {
        this.submitBlock_comment = submitBlock_comment;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SubmitBlockType)) return false;
        SubmitBlockType other = (SubmitBlockType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.submitBlock_contact==null && other.getSubmitBlock_contact()==null) || 
             (this.submitBlock_contact!=null &&
              this.submitBlock_contact.equals(other.getSubmitBlock_contact()))) &&
            ((this.submitBlock_cit==null && other.getSubmitBlock_cit()==null) || 
             (this.submitBlock_cit!=null &&
              this.submitBlock_cit.equals(other.getSubmitBlock_cit()))) &&
            ((this.submitBlock_hup==null && other.getSubmitBlock_hup()==null) || 
             (this.submitBlock_hup!=null &&
              this.submitBlock_hup.equals(other.getSubmitBlock_hup()))) &&
            ((this.submitBlock_reldate==null && other.getSubmitBlock_reldate()==null) || 
             (this.submitBlock_reldate!=null &&
              this.submitBlock_reldate.equals(other.getSubmitBlock_reldate()))) &&
            ((this.submitBlock_subtype==null && other.getSubmitBlock_subtype()==null) || 
             (this.submitBlock_subtype!=null &&
              this.submitBlock_subtype.equals(other.getSubmitBlock_subtype()))) &&
            ((this.submitBlock_tool==null && other.getSubmitBlock_tool()==null) || 
             (this.submitBlock_tool!=null &&
              this.submitBlock_tool.equals(other.getSubmitBlock_tool()))) &&
            ((this.submitBlock_userTag==null && other.getSubmitBlock_userTag()==null) || 
             (this.submitBlock_userTag!=null &&
              this.submitBlock_userTag.equals(other.getSubmitBlock_userTag()))) &&
            ((this.submitBlock_comment==null && other.getSubmitBlock_comment()==null) || 
             (this.submitBlock_comment!=null &&
              this.submitBlock_comment.equals(other.getSubmitBlock_comment())));
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
        if (getSubmitBlock_contact() != null) {
            _hashCode += getSubmitBlock_contact().hashCode();
        }
        if (getSubmitBlock_cit() != null) {
            _hashCode += getSubmitBlock_cit().hashCode();
        }
        if (getSubmitBlock_hup() != null) {
            _hashCode += getSubmitBlock_hup().hashCode();
        }
        if (getSubmitBlock_reldate() != null) {
            _hashCode += getSubmitBlock_reldate().hashCode();
        }
        if (getSubmitBlock_subtype() != null) {
            _hashCode += getSubmitBlock_subtype().hashCode();
        }
        if (getSubmitBlock_tool() != null) {
            _hashCode += getSubmitBlock_tool().hashCode();
        }
        if (getSubmitBlock_userTag() != null) {
            _hashCode += getSubmitBlock_userTag().hashCode();
        }
        if (getSubmitBlock_comment() != null) {
            _hashCode += getSubmitBlock_comment().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SubmitBlockType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Submit-blockType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("submitBlock_contact");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Submit-block_contact"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Submit-block_contactType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("submitBlock_cit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Submit-block_cit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Submit-block_citType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("submitBlock_hup");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Submit-block_hup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Submit-block_hupType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("submitBlock_reldate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Submit-block_reldate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Submit-block_reldateType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("submitBlock_subtype");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Submit-block_subtype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Submit-block_subtypeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("submitBlock_tool");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Submit-block_tool"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("submitBlock_userTag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Submit-block_user-tag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("submitBlock_comment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Submit-block_comment"));
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
