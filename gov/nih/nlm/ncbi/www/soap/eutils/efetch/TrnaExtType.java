/**
 * TrnaExtType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class TrnaExtType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.TrnaExt_aaType trnaExt_aa;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.TrnaExt_codonType trnaExt_codon;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.TrnaExt_anticodonType trnaExt_anticodon;

    public TrnaExtType() {
    }

    public TrnaExtType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.TrnaExt_aaType trnaExt_aa,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.TrnaExt_codonType trnaExt_codon,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.TrnaExt_anticodonType trnaExt_anticodon) {
           this.trnaExt_aa = trnaExt_aa;
           this.trnaExt_codon = trnaExt_codon;
           this.trnaExt_anticodon = trnaExt_anticodon;
    }


    /**
     * Gets the trnaExt_aa value for this TrnaExtType.
     * 
     * @return trnaExt_aa
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.TrnaExt_aaType getTrnaExt_aa() {
        return trnaExt_aa;
    }


    /**
     * Sets the trnaExt_aa value for this TrnaExtType.
     * 
     * @param trnaExt_aa
     */
    public void setTrnaExt_aa(gov.nih.nlm.ncbi.www.soap.eutils.efetch.TrnaExt_aaType trnaExt_aa) {
        this.trnaExt_aa = trnaExt_aa;
    }


    /**
     * Gets the trnaExt_codon value for this TrnaExtType.
     * 
     * @return trnaExt_codon
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.TrnaExt_codonType getTrnaExt_codon() {
        return trnaExt_codon;
    }


    /**
     * Sets the trnaExt_codon value for this TrnaExtType.
     * 
     * @param trnaExt_codon
     */
    public void setTrnaExt_codon(gov.nih.nlm.ncbi.www.soap.eutils.efetch.TrnaExt_codonType trnaExt_codon) {
        this.trnaExt_codon = trnaExt_codon;
    }


    /**
     * Gets the trnaExt_anticodon value for this TrnaExtType.
     * 
     * @return trnaExt_anticodon
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.TrnaExt_anticodonType getTrnaExt_anticodon() {
        return trnaExt_anticodon;
    }


    /**
     * Sets the trnaExt_anticodon value for this TrnaExtType.
     * 
     * @param trnaExt_anticodon
     */
    public void setTrnaExt_anticodon(gov.nih.nlm.ncbi.www.soap.eutils.efetch.TrnaExt_anticodonType trnaExt_anticodon) {
        this.trnaExt_anticodon = trnaExt_anticodon;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TrnaExtType)) return false;
        TrnaExtType other = (TrnaExtType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.trnaExt_aa==null && other.getTrnaExt_aa()==null) || 
             (this.trnaExt_aa!=null &&
              this.trnaExt_aa.equals(other.getTrnaExt_aa()))) &&
            ((this.trnaExt_codon==null && other.getTrnaExt_codon()==null) || 
             (this.trnaExt_codon!=null &&
              this.trnaExt_codon.equals(other.getTrnaExt_codon()))) &&
            ((this.trnaExt_anticodon==null && other.getTrnaExt_anticodon()==null) || 
             (this.trnaExt_anticodon!=null &&
              this.trnaExt_anticodon.equals(other.getTrnaExt_anticodon())));
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
        if (getTrnaExt_aa() != null) {
            _hashCode += getTrnaExt_aa().hashCode();
        }
        if (getTrnaExt_codon() != null) {
            _hashCode += getTrnaExt_codon().hashCode();
        }
        if (getTrnaExt_anticodon() != null) {
            _hashCode += getTrnaExt_anticodon().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TrnaExtType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Trna-extType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trnaExt_aa");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Trna-ext_aa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Trna-ext_aaType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trnaExt_codon");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Trna-ext_codon"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Trna-ext_codonType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trnaExt_anticodon");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Trna-ext_anticodon"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Trna-ext_anticodonType"));
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
