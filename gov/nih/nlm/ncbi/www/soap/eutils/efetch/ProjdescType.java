/**
 * ProjdescType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ProjdescType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Projdesc_pubType projdesc_pub;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Projdesc_dateType projdesc_date;

    private java.lang.String projdesc_comment;

    private java.lang.String projdesc_title;

    public ProjdescType() {
    }

    public ProjdescType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Projdesc_pubType projdesc_pub,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Projdesc_dateType projdesc_date,
           java.lang.String projdesc_comment,
           java.lang.String projdesc_title) {
           this.projdesc_pub = projdesc_pub;
           this.projdesc_date = projdesc_date;
           this.projdesc_comment = projdesc_comment;
           this.projdesc_title = projdesc_title;
    }


    /**
     * Gets the projdesc_pub value for this ProjdescType.
     * 
     * @return projdesc_pub
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Projdesc_pubType getProjdesc_pub() {
        return projdesc_pub;
    }


    /**
     * Sets the projdesc_pub value for this ProjdescType.
     * 
     * @param projdesc_pub
     */
    public void setProjdesc_pub(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Projdesc_pubType projdesc_pub) {
        this.projdesc_pub = projdesc_pub;
    }


    /**
     * Gets the projdesc_date value for this ProjdescType.
     * 
     * @return projdesc_date
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Projdesc_dateType getProjdesc_date() {
        return projdesc_date;
    }


    /**
     * Sets the projdesc_date value for this ProjdescType.
     * 
     * @param projdesc_date
     */
    public void setProjdesc_date(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Projdesc_dateType projdesc_date) {
        this.projdesc_date = projdesc_date;
    }


    /**
     * Gets the projdesc_comment value for this ProjdescType.
     * 
     * @return projdesc_comment
     */
    public java.lang.String getProjdesc_comment() {
        return projdesc_comment;
    }


    /**
     * Sets the projdesc_comment value for this ProjdescType.
     * 
     * @param projdesc_comment
     */
    public void setProjdesc_comment(java.lang.String projdesc_comment) {
        this.projdesc_comment = projdesc_comment;
    }


    /**
     * Gets the projdesc_title value for this ProjdescType.
     * 
     * @return projdesc_title
     */
    public java.lang.String getProjdesc_title() {
        return projdesc_title;
    }


    /**
     * Sets the projdesc_title value for this ProjdescType.
     * 
     * @param projdesc_title
     */
    public void setProjdesc_title(java.lang.String projdesc_title) {
        this.projdesc_title = projdesc_title;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProjdescType)) return false;
        ProjdescType other = (ProjdescType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.projdesc_pub==null && other.getProjdesc_pub()==null) || 
             (this.projdesc_pub!=null &&
              this.projdesc_pub.equals(other.getProjdesc_pub()))) &&
            ((this.projdesc_date==null && other.getProjdesc_date()==null) || 
             (this.projdesc_date!=null &&
              this.projdesc_date.equals(other.getProjdesc_date()))) &&
            ((this.projdesc_comment==null && other.getProjdesc_comment()==null) || 
             (this.projdesc_comment!=null &&
              this.projdesc_comment.equals(other.getProjdesc_comment()))) &&
            ((this.projdesc_title==null && other.getProjdesc_title()==null) || 
             (this.projdesc_title!=null &&
              this.projdesc_title.equals(other.getProjdesc_title())));
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
        if (getProjdesc_pub() != null) {
            _hashCode += getProjdesc_pub().hashCode();
        }
        if (getProjdesc_date() != null) {
            _hashCode += getProjdesc_date().hashCode();
        }
        if (getProjdesc_comment() != null) {
            _hashCode += getProjdesc_comment().hashCode();
        }
        if (getProjdesc_title() != null) {
            _hashCode += getProjdesc_title().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProjdescType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ProjdescType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("projdesc_pub");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Projdesc_pub"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Projdesc_pubType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("projdesc_date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Projdesc_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Projdesc_dateType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("projdesc_comment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Projdesc_comment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("projdesc_title");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Projdesc_title"));
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
