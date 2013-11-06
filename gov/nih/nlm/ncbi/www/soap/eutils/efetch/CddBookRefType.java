/**
 * CddBookRefType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class CddBookRefType  implements java.io.Serializable {
    private java.lang.String cddBookRef_bookname;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.CddBookRef_textelementType cddBookRef_textelement;

    private java.lang.String cddBookRef_elementid;

    private java.lang.String cddBookRef_subelementid;

    private java.lang.String cddBookRef_celementid;

    private java.lang.String cddBookRef_csubelementid;

    public CddBookRefType() {
    }

    public CddBookRefType(
           java.lang.String cddBookRef_bookname,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.CddBookRef_textelementType cddBookRef_textelement,
           java.lang.String cddBookRef_elementid,
           java.lang.String cddBookRef_subelementid,
           java.lang.String cddBookRef_celementid,
           java.lang.String cddBookRef_csubelementid) {
           this.cddBookRef_bookname = cddBookRef_bookname;
           this.cddBookRef_textelement = cddBookRef_textelement;
           this.cddBookRef_elementid = cddBookRef_elementid;
           this.cddBookRef_subelementid = cddBookRef_subelementid;
           this.cddBookRef_celementid = cddBookRef_celementid;
           this.cddBookRef_csubelementid = cddBookRef_csubelementid;
    }


    /**
     * Gets the cddBookRef_bookname value for this CddBookRefType.
     * 
     * @return cddBookRef_bookname
     */
    public java.lang.String getCddBookRef_bookname() {
        return cddBookRef_bookname;
    }


    /**
     * Sets the cddBookRef_bookname value for this CddBookRefType.
     * 
     * @param cddBookRef_bookname
     */
    public void setCddBookRef_bookname(java.lang.String cddBookRef_bookname) {
        this.cddBookRef_bookname = cddBookRef_bookname;
    }


    /**
     * Gets the cddBookRef_textelement value for this CddBookRefType.
     * 
     * @return cddBookRef_textelement
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.CddBookRef_textelementType getCddBookRef_textelement() {
        return cddBookRef_textelement;
    }


    /**
     * Sets the cddBookRef_textelement value for this CddBookRefType.
     * 
     * @param cddBookRef_textelement
     */
    public void setCddBookRef_textelement(gov.nih.nlm.ncbi.www.soap.eutils.efetch.CddBookRef_textelementType cddBookRef_textelement) {
        this.cddBookRef_textelement = cddBookRef_textelement;
    }


    /**
     * Gets the cddBookRef_elementid value for this CddBookRefType.
     * 
     * @return cddBookRef_elementid
     */
    public java.lang.String getCddBookRef_elementid() {
        return cddBookRef_elementid;
    }


    /**
     * Sets the cddBookRef_elementid value for this CddBookRefType.
     * 
     * @param cddBookRef_elementid
     */
    public void setCddBookRef_elementid(java.lang.String cddBookRef_elementid) {
        this.cddBookRef_elementid = cddBookRef_elementid;
    }


    /**
     * Gets the cddBookRef_subelementid value for this CddBookRefType.
     * 
     * @return cddBookRef_subelementid
     */
    public java.lang.String getCddBookRef_subelementid() {
        return cddBookRef_subelementid;
    }


    /**
     * Sets the cddBookRef_subelementid value for this CddBookRefType.
     * 
     * @param cddBookRef_subelementid
     */
    public void setCddBookRef_subelementid(java.lang.String cddBookRef_subelementid) {
        this.cddBookRef_subelementid = cddBookRef_subelementid;
    }


    /**
     * Gets the cddBookRef_celementid value for this CddBookRefType.
     * 
     * @return cddBookRef_celementid
     */
    public java.lang.String getCddBookRef_celementid() {
        return cddBookRef_celementid;
    }


    /**
     * Sets the cddBookRef_celementid value for this CddBookRefType.
     * 
     * @param cddBookRef_celementid
     */
    public void setCddBookRef_celementid(java.lang.String cddBookRef_celementid) {
        this.cddBookRef_celementid = cddBookRef_celementid;
    }


    /**
     * Gets the cddBookRef_csubelementid value for this CddBookRefType.
     * 
     * @return cddBookRef_csubelementid
     */
    public java.lang.String getCddBookRef_csubelementid() {
        return cddBookRef_csubelementid;
    }


    /**
     * Sets the cddBookRef_csubelementid value for this CddBookRefType.
     * 
     * @param cddBookRef_csubelementid
     */
    public void setCddBookRef_csubelementid(java.lang.String cddBookRef_csubelementid) {
        this.cddBookRef_csubelementid = cddBookRef_csubelementid;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CddBookRefType)) return false;
        CddBookRefType other = (CddBookRefType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cddBookRef_bookname==null && other.getCddBookRef_bookname()==null) || 
             (this.cddBookRef_bookname!=null &&
              this.cddBookRef_bookname.equals(other.getCddBookRef_bookname()))) &&
            ((this.cddBookRef_textelement==null && other.getCddBookRef_textelement()==null) || 
             (this.cddBookRef_textelement!=null &&
              this.cddBookRef_textelement.equals(other.getCddBookRef_textelement()))) &&
            ((this.cddBookRef_elementid==null && other.getCddBookRef_elementid()==null) || 
             (this.cddBookRef_elementid!=null &&
              this.cddBookRef_elementid.equals(other.getCddBookRef_elementid()))) &&
            ((this.cddBookRef_subelementid==null && other.getCddBookRef_subelementid()==null) || 
             (this.cddBookRef_subelementid!=null &&
              this.cddBookRef_subelementid.equals(other.getCddBookRef_subelementid()))) &&
            ((this.cddBookRef_celementid==null && other.getCddBookRef_celementid()==null) || 
             (this.cddBookRef_celementid!=null &&
              this.cddBookRef_celementid.equals(other.getCddBookRef_celementid()))) &&
            ((this.cddBookRef_csubelementid==null && other.getCddBookRef_csubelementid()==null) || 
             (this.cddBookRef_csubelementid!=null &&
              this.cddBookRef_csubelementid.equals(other.getCddBookRef_csubelementid())));
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
        if (getCddBookRef_bookname() != null) {
            _hashCode += getCddBookRef_bookname().hashCode();
        }
        if (getCddBookRef_textelement() != null) {
            _hashCode += getCddBookRef_textelement().hashCode();
        }
        if (getCddBookRef_elementid() != null) {
            _hashCode += getCddBookRef_elementid().hashCode();
        }
        if (getCddBookRef_subelementid() != null) {
            _hashCode += getCddBookRef_subelementid().hashCode();
        }
        if (getCddBookRef_celementid() != null) {
            _hashCode += getCddBookRef_celementid().hashCode();
        }
        if (getCddBookRef_csubelementid() != null) {
            _hashCode += getCddBookRef_csubelementid().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CddBookRefType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdd-book-refType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cddBookRef_bookname");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdd-book-ref_bookname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cddBookRef_textelement");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdd-book-ref_textelement"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdd-book-ref_textelementType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cddBookRef_elementid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdd-book-ref_elementid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cddBookRef_subelementid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdd-book-ref_subelementid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cddBookRef_celementid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdd-book-ref_celementid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cddBookRef_csubelementid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdd-book-ref_csubelementid"));
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
