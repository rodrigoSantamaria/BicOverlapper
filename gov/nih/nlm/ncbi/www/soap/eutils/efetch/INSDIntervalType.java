/**
 * INSDIntervalType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class INSDIntervalType  implements java.io.Serializable {
    private java.lang.String INSDInterval_from;

    private java.lang.String INSDInterval_to;

    private java.lang.String INSDInterval_point;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.INSDInterval_iscompType INSDInterval_iscomp;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.INSDInterval_interbpType INSDInterval_interbp;

    private java.lang.String INSDInterval_accession;

    public INSDIntervalType() {
    }

    public INSDIntervalType(
           java.lang.String INSDInterval_from,
           java.lang.String INSDInterval_to,
           java.lang.String INSDInterval_point,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.INSDInterval_iscompType INSDInterval_iscomp,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.INSDInterval_interbpType INSDInterval_interbp,
           java.lang.String INSDInterval_accession) {
           this.INSDInterval_from = INSDInterval_from;
           this.INSDInterval_to = INSDInterval_to;
           this.INSDInterval_point = INSDInterval_point;
           this.INSDInterval_iscomp = INSDInterval_iscomp;
           this.INSDInterval_interbp = INSDInterval_interbp;
           this.INSDInterval_accession = INSDInterval_accession;
    }


    /**
     * Gets the INSDInterval_from value for this INSDIntervalType.
     * 
     * @return INSDInterval_from
     */
    public java.lang.String getINSDInterval_from() {
        return INSDInterval_from;
    }


    /**
     * Sets the INSDInterval_from value for this INSDIntervalType.
     * 
     * @param INSDInterval_from
     */
    public void setINSDInterval_from(java.lang.String INSDInterval_from) {
        this.INSDInterval_from = INSDInterval_from;
    }


    /**
     * Gets the INSDInterval_to value for this INSDIntervalType.
     * 
     * @return INSDInterval_to
     */
    public java.lang.String getINSDInterval_to() {
        return INSDInterval_to;
    }


    /**
     * Sets the INSDInterval_to value for this INSDIntervalType.
     * 
     * @param INSDInterval_to
     */
    public void setINSDInterval_to(java.lang.String INSDInterval_to) {
        this.INSDInterval_to = INSDInterval_to;
    }


    /**
     * Gets the INSDInterval_point value for this INSDIntervalType.
     * 
     * @return INSDInterval_point
     */
    public java.lang.String getINSDInterval_point() {
        return INSDInterval_point;
    }


    /**
     * Sets the INSDInterval_point value for this INSDIntervalType.
     * 
     * @param INSDInterval_point
     */
    public void setINSDInterval_point(java.lang.String INSDInterval_point) {
        this.INSDInterval_point = INSDInterval_point;
    }


    /**
     * Gets the INSDInterval_iscomp value for this INSDIntervalType.
     * 
     * @return INSDInterval_iscomp
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.INSDInterval_iscompType getINSDInterval_iscomp() {
        return INSDInterval_iscomp;
    }


    /**
     * Sets the INSDInterval_iscomp value for this INSDIntervalType.
     * 
     * @param INSDInterval_iscomp
     */
    public void setINSDInterval_iscomp(gov.nih.nlm.ncbi.www.soap.eutils.efetch.INSDInterval_iscompType INSDInterval_iscomp) {
        this.INSDInterval_iscomp = INSDInterval_iscomp;
    }


    /**
     * Gets the INSDInterval_interbp value for this INSDIntervalType.
     * 
     * @return INSDInterval_interbp
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.INSDInterval_interbpType getINSDInterval_interbp() {
        return INSDInterval_interbp;
    }


    /**
     * Sets the INSDInterval_interbp value for this INSDIntervalType.
     * 
     * @param INSDInterval_interbp
     */
    public void setINSDInterval_interbp(gov.nih.nlm.ncbi.www.soap.eutils.efetch.INSDInterval_interbpType INSDInterval_interbp) {
        this.INSDInterval_interbp = INSDInterval_interbp;
    }


    /**
     * Gets the INSDInterval_accession value for this INSDIntervalType.
     * 
     * @return INSDInterval_accession
     */
    public java.lang.String getINSDInterval_accession() {
        return INSDInterval_accession;
    }


    /**
     * Sets the INSDInterval_accession value for this INSDIntervalType.
     * 
     * @param INSDInterval_accession
     */
    public void setINSDInterval_accession(java.lang.String INSDInterval_accession) {
        this.INSDInterval_accession = INSDInterval_accession;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof INSDIntervalType)) return false;
        INSDIntervalType other = (INSDIntervalType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.INSDInterval_from==null && other.getINSDInterval_from()==null) || 
             (this.INSDInterval_from!=null &&
              this.INSDInterval_from.equals(other.getINSDInterval_from()))) &&
            ((this.INSDInterval_to==null && other.getINSDInterval_to()==null) || 
             (this.INSDInterval_to!=null &&
              this.INSDInterval_to.equals(other.getINSDInterval_to()))) &&
            ((this.INSDInterval_point==null && other.getINSDInterval_point()==null) || 
             (this.INSDInterval_point!=null &&
              this.INSDInterval_point.equals(other.getINSDInterval_point()))) &&
            ((this.INSDInterval_iscomp==null && other.getINSDInterval_iscomp()==null) || 
             (this.INSDInterval_iscomp!=null &&
              this.INSDInterval_iscomp.equals(other.getINSDInterval_iscomp()))) &&
            ((this.INSDInterval_interbp==null && other.getINSDInterval_interbp()==null) || 
             (this.INSDInterval_interbp!=null &&
              this.INSDInterval_interbp.equals(other.getINSDInterval_interbp()))) &&
            ((this.INSDInterval_accession==null && other.getINSDInterval_accession()==null) || 
             (this.INSDInterval_accession!=null &&
              this.INSDInterval_accession.equals(other.getINSDInterval_accession())));
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
        if (getINSDInterval_from() != null) {
            _hashCode += getINSDInterval_from().hashCode();
        }
        if (getINSDInterval_to() != null) {
            _hashCode += getINSDInterval_to().hashCode();
        }
        if (getINSDInterval_point() != null) {
            _hashCode += getINSDInterval_point().hashCode();
        }
        if (getINSDInterval_iscomp() != null) {
            _hashCode += getINSDInterval_iscomp().hashCode();
        }
        if (getINSDInterval_interbp() != null) {
            _hashCode += getINSDInterval_interbp().hashCode();
        }
        if (getINSDInterval_accession() != null) {
            _hashCode += getINSDInterval_accession().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(INSDIntervalType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "INSDIntervalType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("INSDInterval_from");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "INSDInterval_from"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("INSDInterval_to");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "INSDInterval_to"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("INSDInterval_point");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "INSDInterval_point"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("INSDInterval_iscomp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "INSDInterval_iscomp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "INSDInterval_iscompType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("INSDInterval_interbp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "INSDInterval_interbp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "INSDInterval_interbpType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("INSDInterval_accession");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "INSDInterval_accession"));
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
