/**
 * HitType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class HitType  implements java.io.Serializable {
    private java.lang.String hit_num;

    private java.lang.String hit_id;

    private java.lang.String hit_def;

    private java.lang.String hit_accession;

    private java.lang.String hit_len;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Hit_hspsType hit_hsps;

    public HitType() {
    }

    public HitType(
           java.lang.String hit_num,
           java.lang.String hit_id,
           java.lang.String hit_def,
           java.lang.String hit_accession,
           java.lang.String hit_len,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Hit_hspsType hit_hsps) {
           this.hit_num = hit_num;
           this.hit_id = hit_id;
           this.hit_def = hit_def;
           this.hit_accession = hit_accession;
           this.hit_len = hit_len;
           this.hit_hsps = hit_hsps;
    }


    /**
     * Gets the hit_num value for this HitType.
     * 
     * @return hit_num
     */
    public java.lang.String getHit_num() {
        return hit_num;
    }


    /**
     * Sets the hit_num value for this HitType.
     * 
     * @param hit_num
     */
    public void setHit_num(java.lang.String hit_num) {
        this.hit_num = hit_num;
    }


    /**
     * Gets the hit_id value for this HitType.
     * 
     * @return hit_id
     */
    public java.lang.String getHit_id() {
        return hit_id;
    }


    /**
     * Sets the hit_id value for this HitType.
     * 
     * @param hit_id
     */
    public void setHit_id(java.lang.String hit_id) {
        this.hit_id = hit_id;
    }


    /**
     * Gets the hit_def value for this HitType.
     * 
     * @return hit_def
     */
    public java.lang.String getHit_def() {
        return hit_def;
    }


    /**
     * Sets the hit_def value for this HitType.
     * 
     * @param hit_def
     */
    public void setHit_def(java.lang.String hit_def) {
        this.hit_def = hit_def;
    }


    /**
     * Gets the hit_accession value for this HitType.
     * 
     * @return hit_accession
     */
    public java.lang.String getHit_accession() {
        return hit_accession;
    }


    /**
     * Sets the hit_accession value for this HitType.
     * 
     * @param hit_accession
     */
    public void setHit_accession(java.lang.String hit_accession) {
        this.hit_accession = hit_accession;
    }


    /**
     * Gets the hit_len value for this HitType.
     * 
     * @return hit_len
     */
    public java.lang.String getHit_len() {
        return hit_len;
    }


    /**
     * Sets the hit_len value for this HitType.
     * 
     * @param hit_len
     */
    public void setHit_len(java.lang.String hit_len) {
        this.hit_len = hit_len;
    }


    /**
     * Gets the hit_hsps value for this HitType.
     * 
     * @return hit_hsps
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Hit_hspsType getHit_hsps() {
        return hit_hsps;
    }


    /**
     * Sets the hit_hsps value for this HitType.
     * 
     * @param hit_hsps
     */
    public void setHit_hsps(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Hit_hspsType hit_hsps) {
        this.hit_hsps = hit_hsps;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HitType)) return false;
        HitType other = (HitType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.hit_num==null && other.getHit_num()==null) || 
             (this.hit_num!=null &&
              this.hit_num.equals(other.getHit_num()))) &&
            ((this.hit_id==null && other.getHit_id()==null) || 
             (this.hit_id!=null &&
              this.hit_id.equals(other.getHit_id()))) &&
            ((this.hit_def==null && other.getHit_def()==null) || 
             (this.hit_def!=null &&
              this.hit_def.equals(other.getHit_def()))) &&
            ((this.hit_accession==null && other.getHit_accession()==null) || 
             (this.hit_accession!=null &&
              this.hit_accession.equals(other.getHit_accession()))) &&
            ((this.hit_len==null && other.getHit_len()==null) || 
             (this.hit_len!=null &&
              this.hit_len.equals(other.getHit_len()))) &&
            ((this.hit_hsps==null && other.getHit_hsps()==null) || 
             (this.hit_hsps!=null &&
              this.hit_hsps.equals(other.getHit_hsps())));
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
        if (getHit_num() != null) {
            _hashCode += getHit_num().hashCode();
        }
        if (getHit_id() != null) {
            _hashCode += getHit_id().hashCode();
        }
        if (getHit_def() != null) {
            _hashCode += getHit_def().hashCode();
        }
        if (getHit_accession() != null) {
            _hashCode += getHit_accession().hashCode();
        }
        if (getHit_len() != null) {
            _hashCode += getHit_len().hashCode();
        }
        if (getHit_hsps() != null) {
            _hashCode += getHit_hsps().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HitType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "HitType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hit_num");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Hit_num"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hit_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Hit_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hit_def");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Hit_def"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hit_accession");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Hit_accession"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hit_len");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Hit_len"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hit_hsps");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Hit_hsps"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Hit_hspsType"));
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
