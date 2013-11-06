/**
 * Taxon1InfoType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Taxon1InfoType  implements java.io.Serializable {
    private java.lang.String taxon1Info_ival1;

    private java.lang.String taxon1Info_ival2;

    private java.lang.String taxon1Info_sval;

    public Taxon1InfoType() {
    }

    public Taxon1InfoType(
           java.lang.String taxon1Info_ival1,
           java.lang.String taxon1Info_ival2,
           java.lang.String taxon1Info_sval) {
           this.taxon1Info_ival1 = taxon1Info_ival1;
           this.taxon1Info_ival2 = taxon1Info_ival2;
           this.taxon1Info_sval = taxon1Info_sval;
    }


    /**
     * Gets the taxon1Info_ival1 value for this Taxon1InfoType.
     * 
     * @return taxon1Info_ival1
     */
    public java.lang.String getTaxon1Info_ival1() {
        return taxon1Info_ival1;
    }


    /**
     * Sets the taxon1Info_ival1 value for this Taxon1InfoType.
     * 
     * @param taxon1Info_ival1
     */
    public void setTaxon1Info_ival1(java.lang.String taxon1Info_ival1) {
        this.taxon1Info_ival1 = taxon1Info_ival1;
    }


    /**
     * Gets the taxon1Info_ival2 value for this Taxon1InfoType.
     * 
     * @return taxon1Info_ival2
     */
    public java.lang.String getTaxon1Info_ival2() {
        return taxon1Info_ival2;
    }


    /**
     * Sets the taxon1Info_ival2 value for this Taxon1InfoType.
     * 
     * @param taxon1Info_ival2
     */
    public void setTaxon1Info_ival2(java.lang.String taxon1Info_ival2) {
        this.taxon1Info_ival2 = taxon1Info_ival2;
    }


    /**
     * Gets the taxon1Info_sval value for this Taxon1InfoType.
     * 
     * @return taxon1Info_sval
     */
    public java.lang.String getTaxon1Info_sval() {
        return taxon1Info_sval;
    }


    /**
     * Sets the taxon1Info_sval value for this Taxon1InfoType.
     * 
     * @param taxon1Info_sval
     */
    public void setTaxon1Info_sval(java.lang.String taxon1Info_sval) {
        this.taxon1Info_sval = taxon1Info_sval;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Taxon1InfoType)) return false;
        Taxon1InfoType other = (Taxon1InfoType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.taxon1Info_ival1==null && other.getTaxon1Info_ival1()==null) || 
             (this.taxon1Info_ival1!=null &&
              this.taxon1Info_ival1.equals(other.getTaxon1Info_ival1()))) &&
            ((this.taxon1Info_ival2==null && other.getTaxon1Info_ival2()==null) || 
             (this.taxon1Info_ival2!=null &&
              this.taxon1Info_ival2.equals(other.getTaxon1Info_ival2()))) &&
            ((this.taxon1Info_sval==null && other.getTaxon1Info_sval()==null) || 
             (this.taxon1Info_sval!=null &&
              this.taxon1Info_sval.equals(other.getTaxon1Info_sval())));
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
        if (getTaxon1Info_ival1() != null) {
            _hashCode += getTaxon1Info_ival1().hashCode();
        }
        if (getTaxon1Info_ival2() != null) {
            _hashCode += getTaxon1Info_ival2().hashCode();
        }
        if (getTaxon1Info_sval() != null) {
            _hashCode += getTaxon1Info_sval().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Taxon1InfoType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Taxon1-infoType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxon1Info_ival1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Taxon1-info_ival1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxon1Info_ival2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Taxon1-info_ival2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxon1Info_sval");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Taxon1-info_sval"));
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
