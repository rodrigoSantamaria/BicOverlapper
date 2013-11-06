/**
 * PubdescType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class PubdescType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Pubdesc_pubType pubdesc_pub;

    private java.lang.String pubdesc_name;

    private java.lang.String pubdesc_fig;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Pubdesc_numType pubdesc_num;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Pubdesc_numexcType pubdesc_numexc;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Pubdesc_polyAType pubdesc_polyA;

    private java.lang.String pubdesc_maploc;

    private java.lang.String pubdesc_seqRaw;

    private java.lang.String pubdesc_alignGroup;

    private java.lang.String pubdesc_comment;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Pubdesc_reftypeType pubdesc_reftype;

    public PubdescType() {
    }

    public PubdescType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Pubdesc_pubType pubdesc_pub,
           java.lang.String pubdesc_name,
           java.lang.String pubdesc_fig,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Pubdesc_numType pubdesc_num,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Pubdesc_numexcType pubdesc_numexc,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Pubdesc_polyAType pubdesc_polyA,
           java.lang.String pubdesc_maploc,
           java.lang.String pubdesc_seqRaw,
           java.lang.String pubdesc_alignGroup,
           java.lang.String pubdesc_comment,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Pubdesc_reftypeType pubdesc_reftype) {
           this.pubdesc_pub = pubdesc_pub;
           this.pubdesc_name = pubdesc_name;
           this.pubdesc_fig = pubdesc_fig;
           this.pubdesc_num = pubdesc_num;
           this.pubdesc_numexc = pubdesc_numexc;
           this.pubdesc_polyA = pubdesc_polyA;
           this.pubdesc_maploc = pubdesc_maploc;
           this.pubdesc_seqRaw = pubdesc_seqRaw;
           this.pubdesc_alignGroup = pubdesc_alignGroup;
           this.pubdesc_comment = pubdesc_comment;
           this.pubdesc_reftype = pubdesc_reftype;
    }


    /**
     * Gets the pubdesc_pub value for this PubdescType.
     * 
     * @return pubdesc_pub
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Pubdesc_pubType getPubdesc_pub() {
        return pubdesc_pub;
    }


    /**
     * Sets the pubdesc_pub value for this PubdescType.
     * 
     * @param pubdesc_pub
     */
    public void setPubdesc_pub(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Pubdesc_pubType pubdesc_pub) {
        this.pubdesc_pub = pubdesc_pub;
    }


    /**
     * Gets the pubdesc_name value for this PubdescType.
     * 
     * @return pubdesc_name
     */
    public java.lang.String getPubdesc_name() {
        return pubdesc_name;
    }


    /**
     * Sets the pubdesc_name value for this PubdescType.
     * 
     * @param pubdesc_name
     */
    public void setPubdesc_name(java.lang.String pubdesc_name) {
        this.pubdesc_name = pubdesc_name;
    }


    /**
     * Gets the pubdesc_fig value for this PubdescType.
     * 
     * @return pubdesc_fig
     */
    public java.lang.String getPubdesc_fig() {
        return pubdesc_fig;
    }


    /**
     * Sets the pubdesc_fig value for this PubdescType.
     * 
     * @param pubdesc_fig
     */
    public void setPubdesc_fig(java.lang.String pubdesc_fig) {
        this.pubdesc_fig = pubdesc_fig;
    }


    /**
     * Gets the pubdesc_num value for this PubdescType.
     * 
     * @return pubdesc_num
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Pubdesc_numType getPubdesc_num() {
        return pubdesc_num;
    }


    /**
     * Sets the pubdesc_num value for this PubdescType.
     * 
     * @param pubdesc_num
     */
    public void setPubdesc_num(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Pubdesc_numType pubdesc_num) {
        this.pubdesc_num = pubdesc_num;
    }


    /**
     * Gets the pubdesc_numexc value for this PubdescType.
     * 
     * @return pubdesc_numexc
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Pubdesc_numexcType getPubdesc_numexc() {
        return pubdesc_numexc;
    }


    /**
     * Sets the pubdesc_numexc value for this PubdescType.
     * 
     * @param pubdesc_numexc
     */
    public void setPubdesc_numexc(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Pubdesc_numexcType pubdesc_numexc) {
        this.pubdesc_numexc = pubdesc_numexc;
    }


    /**
     * Gets the pubdesc_polyA value for this PubdescType.
     * 
     * @return pubdesc_polyA
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Pubdesc_polyAType getPubdesc_polyA() {
        return pubdesc_polyA;
    }


    /**
     * Sets the pubdesc_polyA value for this PubdescType.
     * 
     * @param pubdesc_polyA
     */
    public void setPubdesc_polyA(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Pubdesc_polyAType pubdesc_polyA) {
        this.pubdesc_polyA = pubdesc_polyA;
    }


    /**
     * Gets the pubdesc_maploc value for this PubdescType.
     * 
     * @return pubdesc_maploc
     */
    public java.lang.String getPubdesc_maploc() {
        return pubdesc_maploc;
    }


    /**
     * Sets the pubdesc_maploc value for this PubdescType.
     * 
     * @param pubdesc_maploc
     */
    public void setPubdesc_maploc(java.lang.String pubdesc_maploc) {
        this.pubdesc_maploc = pubdesc_maploc;
    }


    /**
     * Gets the pubdesc_seqRaw value for this PubdescType.
     * 
     * @return pubdesc_seqRaw
     */
    public java.lang.String getPubdesc_seqRaw() {
        return pubdesc_seqRaw;
    }


    /**
     * Sets the pubdesc_seqRaw value for this PubdescType.
     * 
     * @param pubdesc_seqRaw
     */
    public void setPubdesc_seqRaw(java.lang.String pubdesc_seqRaw) {
        this.pubdesc_seqRaw = pubdesc_seqRaw;
    }


    /**
     * Gets the pubdesc_alignGroup value for this PubdescType.
     * 
     * @return pubdesc_alignGroup
     */
    public java.lang.String getPubdesc_alignGroup() {
        return pubdesc_alignGroup;
    }


    /**
     * Sets the pubdesc_alignGroup value for this PubdescType.
     * 
     * @param pubdesc_alignGroup
     */
    public void setPubdesc_alignGroup(java.lang.String pubdesc_alignGroup) {
        this.pubdesc_alignGroup = pubdesc_alignGroup;
    }


    /**
     * Gets the pubdesc_comment value for this PubdescType.
     * 
     * @return pubdesc_comment
     */
    public java.lang.String getPubdesc_comment() {
        return pubdesc_comment;
    }


    /**
     * Sets the pubdesc_comment value for this PubdescType.
     * 
     * @param pubdesc_comment
     */
    public void setPubdesc_comment(java.lang.String pubdesc_comment) {
        this.pubdesc_comment = pubdesc_comment;
    }


    /**
     * Gets the pubdesc_reftype value for this PubdescType.
     * 
     * @return pubdesc_reftype
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Pubdesc_reftypeType getPubdesc_reftype() {
        return pubdesc_reftype;
    }


    /**
     * Sets the pubdesc_reftype value for this PubdescType.
     * 
     * @param pubdesc_reftype
     */
    public void setPubdesc_reftype(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Pubdesc_reftypeType pubdesc_reftype) {
        this.pubdesc_reftype = pubdesc_reftype;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PubdescType)) return false;
        PubdescType other = (PubdescType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.pubdesc_pub==null && other.getPubdesc_pub()==null) || 
             (this.pubdesc_pub!=null &&
              this.pubdesc_pub.equals(other.getPubdesc_pub()))) &&
            ((this.pubdesc_name==null && other.getPubdesc_name()==null) || 
             (this.pubdesc_name!=null &&
              this.pubdesc_name.equals(other.getPubdesc_name()))) &&
            ((this.pubdesc_fig==null && other.getPubdesc_fig()==null) || 
             (this.pubdesc_fig!=null &&
              this.pubdesc_fig.equals(other.getPubdesc_fig()))) &&
            ((this.pubdesc_num==null && other.getPubdesc_num()==null) || 
             (this.pubdesc_num!=null &&
              this.pubdesc_num.equals(other.getPubdesc_num()))) &&
            ((this.pubdesc_numexc==null && other.getPubdesc_numexc()==null) || 
             (this.pubdesc_numexc!=null &&
              this.pubdesc_numexc.equals(other.getPubdesc_numexc()))) &&
            ((this.pubdesc_polyA==null && other.getPubdesc_polyA()==null) || 
             (this.pubdesc_polyA!=null &&
              this.pubdesc_polyA.equals(other.getPubdesc_polyA()))) &&
            ((this.pubdesc_maploc==null && other.getPubdesc_maploc()==null) || 
             (this.pubdesc_maploc!=null &&
              this.pubdesc_maploc.equals(other.getPubdesc_maploc()))) &&
            ((this.pubdesc_seqRaw==null && other.getPubdesc_seqRaw()==null) || 
             (this.pubdesc_seqRaw!=null &&
              this.pubdesc_seqRaw.equals(other.getPubdesc_seqRaw()))) &&
            ((this.pubdesc_alignGroup==null && other.getPubdesc_alignGroup()==null) || 
             (this.pubdesc_alignGroup!=null &&
              this.pubdesc_alignGroup.equals(other.getPubdesc_alignGroup()))) &&
            ((this.pubdesc_comment==null && other.getPubdesc_comment()==null) || 
             (this.pubdesc_comment!=null &&
              this.pubdesc_comment.equals(other.getPubdesc_comment()))) &&
            ((this.pubdesc_reftype==null && other.getPubdesc_reftype()==null) || 
             (this.pubdesc_reftype!=null &&
              this.pubdesc_reftype.equals(other.getPubdesc_reftype())));
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
        if (getPubdesc_pub() != null) {
            _hashCode += getPubdesc_pub().hashCode();
        }
        if (getPubdesc_name() != null) {
            _hashCode += getPubdesc_name().hashCode();
        }
        if (getPubdesc_fig() != null) {
            _hashCode += getPubdesc_fig().hashCode();
        }
        if (getPubdesc_num() != null) {
            _hashCode += getPubdesc_num().hashCode();
        }
        if (getPubdesc_numexc() != null) {
            _hashCode += getPubdesc_numexc().hashCode();
        }
        if (getPubdesc_polyA() != null) {
            _hashCode += getPubdesc_polyA().hashCode();
        }
        if (getPubdesc_maploc() != null) {
            _hashCode += getPubdesc_maploc().hashCode();
        }
        if (getPubdesc_seqRaw() != null) {
            _hashCode += getPubdesc_seqRaw().hashCode();
        }
        if (getPubdesc_alignGroup() != null) {
            _hashCode += getPubdesc_alignGroup().hashCode();
        }
        if (getPubdesc_comment() != null) {
            _hashCode += getPubdesc_comment().hashCode();
        }
        if (getPubdesc_reftype() != null) {
            _hashCode += getPubdesc_reftype().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PubdescType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PubdescType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pubdesc_pub");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Pubdesc_pub"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Pubdesc_pubType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pubdesc_name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Pubdesc_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pubdesc_fig");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Pubdesc_fig"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pubdesc_num");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Pubdesc_num"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Pubdesc_numType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pubdesc_numexc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Pubdesc_numexc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Pubdesc_numexcType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pubdesc_polyA");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Pubdesc_poly-a"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Pubdesc_poly-aType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pubdesc_maploc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Pubdesc_maploc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pubdesc_seqRaw");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Pubdesc_seq-raw"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pubdesc_alignGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Pubdesc_align-group"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pubdesc_comment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Pubdesc_comment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pubdesc_reftype");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Pubdesc_reftype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Pubdesc_reftypeType"));
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
