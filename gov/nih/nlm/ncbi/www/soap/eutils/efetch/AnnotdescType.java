/**
 * AnnotdescType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class AnnotdescType  implements java.io.Serializable {
    private java.lang.String annotdesc_name;

    private java.lang.String annotdesc_title;

    private java.lang.String annotdesc_comment;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Annotdesc_pubType annotdesc_pub;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Annotdesc_userType annotdesc_user;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Annotdesc_createDateType annotdesc_createDate;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Annotdesc_updateDateType annotdesc_updateDate;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Annotdesc_srcType annotdesc_src;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Annotdesc_alignType annotdesc_align;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Annotdesc_regionType annotdesc_region;

    public AnnotdescType() {
    }

    public AnnotdescType(
           java.lang.String annotdesc_name,
           java.lang.String annotdesc_title,
           java.lang.String annotdesc_comment,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Annotdesc_pubType annotdesc_pub,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Annotdesc_userType annotdesc_user,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Annotdesc_createDateType annotdesc_createDate,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Annotdesc_updateDateType annotdesc_updateDate,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Annotdesc_srcType annotdesc_src,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Annotdesc_alignType annotdesc_align,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Annotdesc_regionType annotdesc_region) {
           this.annotdesc_name = annotdesc_name;
           this.annotdesc_title = annotdesc_title;
           this.annotdesc_comment = annotdesc_comment;
           this.annotdesc_pub = annotdesc_pub;
           this.annotdesc_user = annotdesc_user;
           this.annotdesc_createDate = annotdesc_createDate;
           this.annotdesc_updateDate = annotdesc_updateDate;
           this.annotdesc_src = annotdesc_src;
           this.annotdesc_align = annotdesc_align;
           this.annotdesc_region = annotdesc_region;
    }


    /**
     * Gets the annotdesc_name value for this AnnotdescType.
     * 
     * @return annotdesc_name
     */
    public java.lang.String getAnnotdesc_name() {
        return annotdesc_name;
    }


    /**
     * Sets the annotdesc_name value for this AnnotdescType.
     * 
     * @param annotdesc_name
     */
    public void setAnnotdesc_name(java.lang.String annotdesc_name) {
        this.annotdesc_name = annotdesc_name;
    }


    /**
     * Gets the annotdesc_title value for this AnnotdescType.
     * 
     * @return annotdesc_title
     */
    public java.lang.String getAnnotdesc_title() {
        return annotdesc_title;
    }


    /**
     * Sets the annotdesc_title value for this AnnotdescType.
     * 
     * @param annotdesc_title
     */
    public void setAnnotdesc_title(java.lang.String annotdesc_title) {
        this.annotdesc_title = annotdesc_title;
    }


    /**
     * Gets the annotdesc_comment value for this AnnotdescType.
     * 
     * @return annotdesc_comment
     */
    public java.lang.String getAnnotdesc_comment() {
        return annotdesc_comment;
    }


    /**
     * Sets the annotdesc_comment value for this AnnotdescType.
     * 
     * @param annotdesc_comment
     */
    public void setAnnotdesc_comment(java.lang.String annotdesc_comment) {
        this.annotdesc_comment = annotdesc_comment;
    }


    /**
     * Gets the annotdesc_pub value for this AnnotdescType.
     * 
     * @return annotdesc_pub
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Annotdesc_pubType getAnnotdesc_pub() {
        return annotdesc_pub;
    }


    /**
     * Sets the annotdesc_pub value for this AnnotdescType.
     * 
     * @param annotdesc_pub
     */
    public void setAnnotdesc_pub(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Annotdesc_pubType annotdesc_pub) {
        this.annotdesc_pub = annotdesc_pub;
    }


    /**
     * Gets the annotdesc_user value for this AnnotdescType.
     * 
     * @return annotdesc_user
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Annotdesc_userType getAnnotdesc_user() {
        return annotdesc_user;
    }


    /**
     * Sets the annotdesc_user value for this AnnotdescType.
     * 
     * @param annotdesc_user
     */
    public void setAnnotdesc_user(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Annotdesc_userType annotdesc_user) {
        this.annotdesc_user = annotdesc_user;
    }


    /**
     * Gets the annotdesc_createDate value for this AnnotdescType.
     * 
     * @return annotdesc_createDate
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Annotdesc_createDateType getAnnotdesc_createDate() {
        return annotdesc_createDate;
    }


    /**
     * Sets the annotdesc_createDate value for this AnnotdescType.
     * 
     * @param annotdesc_createDate
     */
    public void setAnnotdesc_createDate(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Annotdesc_createDateType annotdesc_createDate) {
        this.annotdesc_createDate = annotdesc_createDate;
    }


    /**
     * Gets the annotdesc_updateDate value for this AnnotdescType.
     * 
     * @return annotdesc_updateDate
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Annotdesc_updateDateType getAnnotdesc_updateDate() {
        return annotdesc_updateDate;
    }


    /**
     * Sets the annotdesc_updateDate value for this AnnotdescType.
     * 
     * @param annotdesc_updateDate
     */
    public void setAnnotdesc_updateDate(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Annotdesc_updateDateType annotdesc_updateDate) {
        this.annotdesc_updateDate = annotdesc_updateDate;
    }


    /**
     * Gets the annotdesc_src value for this AnnotdescType.
     * 
     * @return annotdesc_src
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Annotdesc_srcType getAnnotdesc_src() {
        return annotdesc_src;
    }


    /**
     * Sets the annotdesc_src value for this AnnotdescType.
     * 
     * @param annotdesc_src
     */
    public void setAnnotdesc_src(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Annotdesc_srcType annotdesc_src) {
        this.annotdesc_src = annotdesc_src;
    }


    /**
     * Gets the annotdesc_align value for this AnnotdescType.
     * 
     * @return annotdesc_align
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Annotdesc_alignType getAnnotdesc_align() {
        return annotdesc_align;
    }


    /**
     * Sets the annotdesc_align value for this AnnotdescType.
     * 
     * @param annotdesc_align
     */
    public void setAnnotdesc_align(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Annotdesc_alignType annotdesc_align) {
        this.annotdesc_align = annotdesc_align;
    }


    /**
     * Gets the annotdesc_region value for this AnnotdescType.
     * 
     * @return annotdesc_region
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Annotdesc_regionType getAnnotdesc_region() {
        return annotdesc_region;
    }


    /**
     * Sets the annotdesc_region value for this AnnotdescType.
     * 
     * @param annotdesc_region
     */
    public void setAnnotdesc_region(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Annotdesc_regionType annotdesc_region) {
        this.annotdesc_region = annotdesc_region;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AnnotdescType)) return false;
        AnnotdescType other = (AnnotdescType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.annotdesc_name==null && other.getAnnotdesc_name()==null) || 
             (this.annotdesc_name!=null &&
              this.annotdesc_name.equals(other.getAnnotdesc_name()))) &&
            ((this.annotdesc_title==null && other.getAnnotdesc_title()==null) || 
             (this.annotdesc_title!=null &&
              this.annotdesc_title.equals(other.getAnnotdesc_title()))) &&
            ((this.annotdesc_comment==null && other.getAnnotdesc_comment()==null) || 
             (this.annotdesc_comment!=null &&
              this.annotdesc_comment.equals(other.getAnnotdesc_comment()))) &&
            ((this.annotdesc_pub==null && other.getAnnotdesc_pub()==null) || 
             (this.annotdesc_pub!=null &&
              this.annotdesc_pub.equals(other.getAnnotdesc_pub()))) &&
            ((this.annotdesc_user==null && other.getAnnotdesc_user()==null) || 
             (this.annotdesc_user!=null &&
              this.annotdesc_user.equals(other.getAnnotdesc_user()))) &&
            ((this.annotdesc_createDate==null && other.getAnnotdesc_createDate()==null) || 
             (this.annotdesc_createDate!=null &&
              this.annotdesc_createDate.equals(other.getAnnotdesc_createDate()))) &&
            ((this.annotdesc_updateDate==null && other.getAnnotdesc_updateDate()==null) || 
             (this.annotdesc_updateDate!=null &&
              this.annotdesc_updateDate.equals(other.getAnnotdesc_updateDate()))) &&
            ((this.annotdesc_src==null && other.getAnnotdesc_src()==null) || 
             (this.annotdesc_src!=null &&
              this.annotdesc_src.equals(other.getAnnotdesc_src()))) &&
            ((this.annotdesc_align==null && other.getAnnotdesc_align()==null) || 
             (this.annotdesc_align!=null &&
              this.annotdesc_align.equals(other.getAnnotdesc_align()))) &&
            ((this.annotdesc_region==null && other.getAnnotdesc_region()==null) || 
             (this.annotdesc_region!=null &&
              this.annotdesc_region.equals(other.getAnnotdesc_region())));
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
        if (getAnnotdesc_name() != null) {
            _hashCode += getAnnotdesc_name().hashCode();
        }
        if (getAnnotdesc_title() != null) {
            _hashCode += getAnnotdesc_title().hashCode();
        }
        if (getAnnotdesc_comment() != null) {
            _hashCode += getAnnotdesc_comment().hashCode();
        }
        if (getAnnotdesc_pub() != null) {
            _hashCode += getAnnotdesc_pub().hashCode();
        }
        if (getAnnotdesc_user() != null) {
            _hashCode += getAnnotdesc_user().hashCode();
        }
        if (getAnnotdesc_createDate() != null) {
            _hashCode += getAnnotdesc_createDate().hashCode();
        }
        if (getAnnotdesc_updateDate() != null) {
            _hashCode += getAnnotdesc_updateDate().hashCode();
        }
        if (getAnnotdesc_src() != null) {
            _hashCode += getAnnotdesc_src().hashCode();
        }
        if (getAnnotdesc_align() != null) {
            _hashCode += getAnnotdesc_align().hashCode();
        }
        if (getAnnotdesc_region() != null) {
            _hashCode += getAnnotdesc_region().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AnnotdescType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "AnnotdescType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("annotdesc_name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Annotdesc_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("annotdesc_title");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Annotdesc_title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("annotdesc_comment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Annotdesc_comment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("annotdesc_pub");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Annotdesc_pub"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Annotdesc_pubType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("annotdesc_user");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Annotdesc_user"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Annotdesc_userType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("annotdesc_createDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Annotdesc_create-date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Annotdesc_create-dateType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("annotdesc_updateDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Annotdesc_update-date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Annotdesc_update-dateType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("annotdesc_src");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Annotdesc_src"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Annotdesc_srcType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("annotdesc_align");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Annotdesc_align"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Annotdesc_alignType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("annotdesc_region");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Annotdesc_region"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Annotdesc_regionType"));
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
