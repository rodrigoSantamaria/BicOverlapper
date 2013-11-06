/**
 * MimCitType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class MimCitType  implements java.io.Serializable {
    private java.lang.String mimCit_number;

    private java.lang.String mimCit_author;

    private java.lang.String mimCit_others;

    private java.lang.String mimCit_year;

    public MimCitType() {
    }

    public MimCitType(
           java.lang.String mimCit_number,
           java.lang.String mimCit_author,
           java.lang.String mimCit_others,
           java.lang.String mimCit_year) {
           this.mimCit_number = mimCit_number;
           this.mimCit_author = mimCit_author;
           this.mimCit_others = mimCit_others;
           this.mimCit_year = mimCit_year;
    }


    /**
     * Gets the mimCit_number value for this MimCitType.
     * 
     * @return mimCit_number
     */
    public java.lang.String getMimCit_number() {
        return mimCit_number;
    }


    /**
     * Sets the mimCit_number value for this MimCitType.
     * 
     * @param mimCit_number
     */
    public void setMimCit_number(java.lang.String mimCit_number) {
        this.mimCit_number = mimCit_number;
    }


    /**
     * Gets the mimCit_author value for this MimCitType.
     * 
     * @return mimCit_author
     */
    public java.lang.String getMimCit_author() {
        return mimCit_author;
    }


    /**
     * Sets the mimCit_author value for this MimCitType.
     * 
     * @param mimCit_author
     */
    public void setMimCit_author(java.lang.String mimCit_author) {
        this.mimCit_author = mimCit_author;
    }


    /**
     * Gets the mimCit_others value for this MimCitType.
     * 
     * @return mimCit_others
     */
    public java.lang.String getMimCit_others() {
        return mimCit_others;
    }


    /**
     * Sets the mimCit_others value for this MimCitType.
     * 
     * @param mimCit_others
     */
    public void setMimCit_others(java.lang.String mimCit_others) {
        this.mimCit_others = mimCit_others;
    }


    /**
     * Gets the mimCit_year value for this MimCitType.
     * 
     * @return mimCit_year
     */
    public java.lang.String getMimCit_year() {
        return mimCit_year;
    }


    /**
     * Sets the mimCit_year value for this MimCitType.
     * 
     * @param mimCit_year
     */
    public void setMimCit_year(java.lang.String mimCit_year) {
        this.mimCit_year = mimCit_year;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MimCitType)) return false;
        MimCitType other = (MimCitType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.mimCit_number==null && other.getMimCit_number()==null) || 
             (this.mimCit_number!=null &&
              this.mimCit_number.equals(other.getMimCit_number()))) &&
            ((this.mimCit_author==null && other.getMimCit_author()==null) || 
             (this.mimCit_author!=null &&
              this.mimCit_author.equals(other.getMimCit_author()))) &&
            ((this.mimCit_others==null && other.getMimCit_others()==null) || 
             (this.mimCit_others!=null &&
              this.mimCit_others.equals(other.getMimCit_others()))) &&
            ((this.mimCit_year==null && other.getMimCit_year()==null) || 
             (this.mimCit_year!=null &&
              this.mimCit_year.equals(other.getMimCit_year())));
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
        if (getMimCit_number() != null) {
            _hashCode += getMimCit_number().hashCode();
        }
        if (getMimCit_author() != null) {
            _hashCode += getMimCit_author().hashCode();
        }
        if (getMimCit_others() != null) {
            _hashCode += getMimCit_others().hashCode();
        }
        if (getMimCit_year() != null) {
            _hashCode += getMimCit_year().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MimCitType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-citType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mimCit_number");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-cit_number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mimCit_author");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-cit_author"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mimCit_others");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-cit_others"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mimCit_year");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-cit_year"));
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
