/**
 * GBIntervalType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class GBIntervalType  implements java.io.Serializable {
    private java.lang.String GBInterval_from;

    private java.lang.String GBInterval_to;

    private java.lang.String GBInterval_point;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.GBInterval_iscompType GBInterval_iscomp;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.GBInterval_interbpType GBInterval_interbp;

    private java.lang.String GBInterval_accession;

    public GBIntervalType() {
    }

    public GBIntervalType(
           java.lang.String GBInterval_from,
           java.lang.String GBInterval_to,
           java.lang.String GBInterval_point,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.GBInterval_iscompType GBInterval_iscomp,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.GBInterval_interbpType GBInterval_interbp,
           java.lang.String GBInterval_accession) {
           this.GBInterval_from = GBInterval_from;
           this.GBInterval_to = GBInterval_to;
           this.GBInterval_point = GBInterval_point;
           this.GBInterval_iscomp = GBInterval_iscomp;
           this.GBInterval_interbp = GBInterval_interbp;
           this.GBInterval_accession = GBInterval_accession;
    }


    /**
     * Gets the GBInterval_from value for this GBIntervalType.
     * 
     * @return GBInterval_from
     */
    public java.lang.String getGBInterval_from() {
        return GBInterval_from;
    }


    /**
     * Sets the GBInterval_from value for this GBIntervalType.
     * 
     * @param GBInterval_from
     */
    public void setGBInterval_from(java.lang.String GBInterval_from) {
        this.GBInterval_from = GBInterval_from;
    }


    /**
     * Gets the GBInterval_to value for this GBIntervalType.
     * 
     * @return GBInterval_to
     */
    public java.lang.String getGBInterval_to() {
        return GBInterval_to;
    }


    /**
     * Sets the GBInterval_to value for this GBIntervalType.
     * 
     * @param GBInterval_to
     */
    public void setGBInterval_to(java.lang.String GBInterval_to) {
        this.GBInterval_to = GBInterval_to;
    }


    /**
     * Gets the GBInterval_point value for this GBIntervalType.
     * 
     * @return GBInterval_point
     */
    public java.lang.String getGBInterval_point() {
        return GBInterval_point;
    }


    /**
     * Sets the GBInterval_point value for this GBIntervalType.
     * 
     * @param GBInterval_point
     */
    public void setGBInterval_point(java.lang.String GBInterval_point) {
        this.GBInterval_point = GBInterval_point;
    }


    /**
     * Gets the GBInterval_iscomp value for this GBIntervalType.
     * 
     * @return GBInterval_iscomp
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.GBInterval_iscompType getGBInterval_iscomp() {
        return GBInterval_iscomp;
    }


    /**
     * Sets the GBInterval_iscomp value for this GBIntervalType.
     * 
     * @param GBInterval_iscomp
     */
    public void setGBInterval_iscomp(gov.nih.nlm.ncbi.www.soap.eutils.efetch.GBInterval_iscompType GBInterval_iscomp) {
        this.GBInterval_iscomp = GBInterval_iscomp;
    }


    /**
     * Gets the GBInterval_interbp value for this GBIntervalType.
     * 
     * @return GBInterval_interbp
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.GBInterval_interbpType getGBInterval_interbp() {
        return GBInterval_interbp;
    }


    /**
     * Sets the GBInterval_interbp value for this GBIntervalType.
     * 
     * @param GBInterval_interbp
     */
    public void setGBInterval_interbp(gov.nih.nlm.ncbi.www.soap.eutils.efetch.GBInterval_interbpType GBInterval_interbp) {
        this.GBInterval_interbp = GBInterval_interbp;
    }


    /**
     * Gets the GBInterval_accession value for this GBIntervalType.
     * 
     * @return GBInterval_accession
     */
    public java.lang.String getGBInterval_accession() {
        return GBInterval_accession;
    }


    /**
     * Sets the GBInterval_accession value for this GBIntervalType.
     * 
     * @param GBInterval_accession
     */
    public void setGBInterval_accession(java.lang.String GBInterval_accession) {
        this.GBInterval_accession = GBInterval_accession;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GBIntervalType)) return false;
        GBIntervalType other = (GBIntervalType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.GBInterval_from==null && other.getGBInterval_from()==null) || 
             (this.GBInterval_from!=null &&
              this.GBInterval_from.equals(other.getGBInterval_from()))) &&
            ((this.GBInterval_to==null && other.getGBInterval_to()==null) || 
             (this.GBInterval_to!=null &&
              this.GBInterval_to.equals(other.getGBInterval_to()))) &&
            ((this.GBInterval_point==null && other.getGBInterval_point()==null) || 
             (this.GBInterval_point!=null &&
              this.GBInterval_point.equals(other.getGBInterval_point()))) &&
            ((this.GBInterval_iscomp==null && other.getGBInterval_iscomp()==null) || 
             (this.GBInterval_iscomp!=null &&
              this.GBInterval_iscomp.equals(other.getGBInterval_iscomp()))) &&
            ((this.GBInterval_interbp==null && other.getGBInterval_interbp()==null) || 
             (this.GBInterval_interbp!=null &&
              this.GBInterval_interbp.equals(other.getGBInterval_interbp()))) &&
            ((this.GBInterval_accession==null && other.getGBInterval_accession()==null) || 
             (this.GBInterval_accession!=null &&
              this.GBInterval_accession.equals(other.getGBInterval_accession())));
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
        if (getGBInterval_from() != null) {
            _hashCode += getGBInterval_from().hashCode();
        }
        if (getGBInterval_to() != null) {
            _hashCode += getGBInterval_to().hashCode();
        }
        if (getGBInterval_point() != null) {
            _hashCode += getGBInterval_point().hashCode();
        }
        if (getGBInterval_iscomp() != null) {
            _hashCode += getGBInterval_iscomp().hashCode();
        }
        if (getGBInterval_interbp() != null) {
            _hashCode += getGBInterval_interbp().hashCode();
        }
        if (getGBInterval_accession() != null) {
            _hashCode += getGBInterval_accession().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GBIntervalType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "GBIntervalType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GBInterval_from");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "GBInterval_from"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GBInterval_to");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "GBInterval_to"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GBInterval_point");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "GBInterval_point"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GBInterval_iscomp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "GBInterval_iscomp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "GBInterval_iscompType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GBInterval_interbp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "GBInterval_interbp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "GBInterval_interbpType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GBInterval_accession");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "GBInterval_accession"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
