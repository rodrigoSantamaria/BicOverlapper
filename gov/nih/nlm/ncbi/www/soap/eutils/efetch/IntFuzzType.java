/**
 * IntFuzzType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class IntFuzzType  implements java.io.Serializable {
    private java.lang.String intFuzz_pM;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.IntFuzz_rangeType intFuzz_range;

    private java.lang.String intFuzz_pct;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.IntFuzz_limType intFuzz_lim;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.IntFuzz_altType intFuzz_alt;

    public IntFuzzType() {
    }

    public IntFuzzType(
           java.lang.String intFuzz_pM,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.IntFuzz_rangeType intFuzz_range,
           java.lang.String intFuzz_pct,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.IntFuzz_limType intFuzz_lim,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.IntFuzz_altType intFuzz_alt) {
           this.intFuzz_pM = intFuzz_pM;
           this.intFuzz_range = intFuzz_range;
           this.intFuzz_pct = intFuzz_pct;
           this.intFuzz_lim = intFuzz_lim;
           this.intFuzz_alt = intFuzz_alt;
    }


    /**
     * Gets the intFuzz_pM value for this IntFuzzType.
     * 
     * @return intFuzz_pM
     */
    public java.lang.String getIntFuzz_pM() {
        return intFuzz_pM;
    }


    /**
     * Sets the intFuzz_pM value for this IntFuzzType.
     * 
     * @param intFuzz_pM
     */
    public void setIntFuzz_pM(java.lang.String intFuzz_pM) {
        this.intFuzz_pM = intFuzz_pM;
    }


    /**
     * Gets the intFuzz_range value for this IntFuzzType.
     * 
     * @return intFuzz_range
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.IntFuzz_rangeType getIntFuzz_range() {
        return intFuzz_range;
    }


    /**
     * Sets the intFuzz_range value for this IntFuzzType.
     * 
     * @param intFuzz_range
     */
    public void setIntFuzz_range(gov.nih.nlm.ncbi.www.soap.eutils.efetch.IntFuzz_rangeType intFuzz_range) {
        this.intFuzz_range = intFuzz_range;
    }


    /**
     * Gets the intFuzz_pct value for this IntFuzzType.
     * 
     * @return intFuzz_pct
     */
    public java.lang.String getIntFuzz_pct() {
        return intFuzz_pct;
    }


    /**
     * Sets the intFuzz_pct value for this IntFuzzType.
     * 
     * @param intFuzz_pct
     */
    public void setIntFuzz_pct(java.lang.String intFuzz_pct) {
        this.intFuzz_pct = intFuzz_pct;
    }


    /**
     * Gets the intFuzz_lim value for this IntFuzzType.
     * 
     * @return intFuzz_lim
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.IntFuzz_limType getIntFuzz_lim() {
        return intFuzz_lim;
    }


    /**
     * Sets the intFuzz_lim value for this IntFuzzType.
     * 
     * @param intFuzz_lim
     */
    public void setIntFuzz_lim(gov.nih.nlm.ncbi.www.soap.eutils.efetch.IntFuzz_limType intFuzz_lim) {
        this.intFuzz_lim = intFuzz_lim;
    }


    /**
     * Gets the intFuzz_alt value for this IntFuzzType.
     * 
     * @return intFuzz_alt
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.IntFuzz_altType getIntFuzz_alt() {
        return intFuzz_alt;
    }


    /**
     * Sets the intFuzz_alt value for this IntFuzzType.
     * 
     * @param intFuzz_alt
     */
    public void setIntFuzz_alt(gov.nih.nlm.ncbi.www.soap.eutils.efetch.IntFuzz_altType intFuzz_alt) {
        this.intFuzz_alt = intFuzz_alt;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IntFuzzType)) return false;
        IntFuzzType other = (IntFuzzType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.intFuzz_pM==null && other.getIntFuzz_pM()==null) || 
             (this.intFuzz_pM!=null &&
              this.intFuzz_pM.equals(other.getIntFuzz_pM()))) &&
            ((this.intFuzz_range==null && other.getIntFuzz_range()==null) || 
             (this.intFuzz_range!=null &&
              this.intFuzz_range.equals(other.getIntFuzz_range()))) &&
            ((this.intFuzz_pct==null && other.getIntFuzz_pct()==null) || 
             (this.intFuzz_pct!=null &&
              this.intFuzz_pct.equals(other.getIntFuzz_pct()))) &&
            ((this.intFuzz_lim==null && other.getIntFuzz_lim()==null) || 
             (this.intFuzz_lim!=null &&
              this.intFuzz_lim.equals(other.getIntFuzz_lim()))) &&
            ((this.intFuzz_alt==null && other.getIntFuzz_alt()==null) || 
             (this.intFuzz_alt!=null &&
              this.intFuzz_alt.equals(other.getIntFuzz_alt())));
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
        if (getIntFuzz_pM() != null) {
            _hashCode += getIntFuzz_pM().hashCode();
        }
        if (getIntFuzz_range() != null) {
            _hashCode += getIntFuzz_range().hashCode();
        }
        if (getIntFuzz_pct() != null) {
            _hashCode += getIntFuzz_pct().hashCode();
        }
        if (getIntFuzz_lim() != null) {
            _hashCode += getIntFuzz_lim().hashCode();
        }
        if (getIntFuzz_alt() != null) {
            _hashCode += getIntFuzz_alt().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IntFuzzType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Int-fuzzType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("intFuzz_pM");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Int-fuzz_p-m"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("intFuzz_range");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Int-fuzz_range"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Int-fuzz_rangeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("intFuzz_pct");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Int-fuzz_pct"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("intFuzz_lim");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Int-fuzz_lim"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Int-fuzz_limType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("intFuzz_alt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Int-fuzz_alt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Int-fuzz_altType"));
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
