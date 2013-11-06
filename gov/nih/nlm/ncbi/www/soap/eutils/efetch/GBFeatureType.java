/**
 * GBFeatureType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class GBFeatureType  implements java.io.Serializable {
    private java.lang.String GBFeature_key;

    private java.lang.String GBFeature_location;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.GBFeature_intervalsType GBFeature_intervals;

    private java.lang.String GBFeature_operator;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.GBFeature_partial5Type GBFeature_partial5;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.GBFeature_partial3Type GBFeature_partial3;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.GBFeature_qualsType GBFeature_quals;

    public GBFeatureType() {
    }

    public GBFeatureType(
           java.lang.String GBFeature_key,
           java.lang.String GBFeature_location,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.GBFeature_intervalsType GBFeature_intervals,
           java.lang.String GBFeature_operator,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.GBFeature_partial5Type GBFeature_partial5,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.GBFeature_partial3Type GBFeature_partial3,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.GBFeature_qualsType GBFeature_quals) {
           this.GBFeature_key = GBFeature_key;
           this.GBFeature_location = GBFeature_location;
           this.GBFeature_intervals = GBFeature_intervals;
           this.GBFeature_operator = GBFeature_operator;
           this.GBFeature_partial5 = GBFeature_partial5;
           this.GBFeature_partial3 = GBFeature_partial3;
           this.GBFeature_quals = GBFeature_quals;
    }


    /**
     * Gets the GBFeature_key value for this GBFeatureType.
     * 
     * @return GBFeature_key
     */
    public java.lang.String getGBFeature_key() {
        return GBFeature_key;
    }


    /**
     * Sets the GBFeature_key value for this GBFeatureType.
     * 
     * @param GBFeature_key
     */
    public void setGBFeature_key(java.lang.String GBFeature_key) {
        this.GBFeature_key = GBFeature_key;
    }


    /**
     * Gets the GBFeature_location value for this GBFeatureType.
     * 
     * @return GBFeature_location
     */
    public java.lang.String getGBFeature_location() {
        return GBFeature_location;
    }


    /**
     * Sets the GBFeature_location value for this GBFeatureType.
     * 
     * @param GBFeature_location
     */
    public void setGBFeature_location(java.lang.String GBFeature_location) {
        this.GBFeature_location = GBFeature_location;
    }


    /**
     * Gets the GBFeature_intervals value for this GBFeatureType.
     * 
     * @return GBFeature_intervals
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.GBFeature_intervalsType getGBFeature_intervals() {
        return GBFeature_intervals;
    }


    /**
     * Sets the GBFeature_intervals value for this GBFeatureType.
     * 
     * @param GBFeature_intervals
     */
    public void setGBFeature_intervals(gov.nih.nlm.ncbi.www.soap.eutils.efetch.GBFeature_intervalsType GBFeature_intervals) {
        this.GBFeature_intervals = GBFeature_intervals;
    }


    /**
     * Gets the GBFeature_operator value for this GBFeatureType.
     * 
     * @return GBFeature_operator
     */
    public java.lang.String getGBFeature_operator() {
        return GBFeature_operator;
    }


    /**
     * Sets the GBFeature_operator value for this GBFeatureType.
     * 
     * @param GBFeature_operator
     */
    public void setGBFeature_operator(java.lang.String GBFeature_operator) {
        this.GBFeature_operator = GBFeature_operator;
    }


    /**
     * Gets the GBFeature_partial5 value for this GBFeatureType.
     * 
     * @return GBFeature_partial5
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.GBFeature_partial5Type getGBFeature_partial5() {
        return GBFeature_partial5;
    }


    /**
     * Sets the GBFeature_partial5 value for this GBFeatureType.
     * 
     * @param GBFeature_partial5
     */
    public void setGBFeature_partial5(gov.nih.nlm.ncbi.www.soap.eutils.efetch.GBFeature_partial5Type GBFeature_partial5) {
        this.GBFeature_partial5 = GBFeature_partial5;
    }


    /**
     * Gets the GBFeature_partial3 value for this GBFeatureType.
     * 
     * @return GBFeature_partial3
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.GBFeature_partial3Type getGBFeature_partial3() {
        return GBFeature_partial3;
    }


    /**
     * Sets the GBFeature_partial3 value for this GBFeatureType.
     * 
     * @param GBFeature_partial3
     */
    public void setGBFeature_partial3(gov.nih.nlm.ncbi.www.soap.eutils.efetch.GBFeature_partial3Type GBFeature_partial3) {
        this.GBFeature_partial3 = GBFeature_partial3;
    }


    /**
     * Gets the GBFeature_quals value for this GBFeatureType.
     * 
     * @return GBFeature_quals
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.GBFeature_qualsType getGBFeature_quals() {
        return GBFeature_quals;
    }


    /**
     * Sets the GBFeature_quals value for this GBFeatureType.
     * 
     * @param GBFeature_quals
     */
    public void setGBFeature_quals(gov.nih.nlm.ncbi.www.soap.eutils.efetch.GBFeature_qualsType GBFeature_quals) {
        this.GBFeature_quals = GBFeature_quals;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GBFeatureType)) return false;
        GBFeatureType other = (GBFeatureType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.GBFeature_key==null && other.getGBFeature_key()==null) || 
             (this.GBFeature_key!=null &&
              this.GBFeature_key.equals(other.getGBFeature_key()))) &&
            ((this.GBFeature_location==null && other.getGBFeature_location()==null) || 
             (this.GBFeature_location!=null &&
              this.GBFeature_location.equals(other.getGBFeature_location()))) &&
            ((this.GBFeature_intervals==null && other.getGBFeature_intervals()==null) || 
             (this.GBFeature_intervals!=null &&
              this.GBFeature_intervals.equals(other.getGBFeature_intervals()))) &&
            ((this.GBFeature_operator==null && other.getGBFeature_operator()==null) || 
             (this.GBFeature_operator!=null &&
              this.GBFeature_operator.equals(other.getGBFeature_operator()))) &&
            ((this.GBFeature_partial5==null && other.getGBFeature_partial5()==null) || 
             (this.GBFeature_partial5!=null &&
              this.GBFeature_partial5.equals(other.getGBFeature_partial5()))) &&
            ((this.GBFeature_partial3==null && other.getGBFeature_partial3()==null) || 
             (this.GBFeature_partial3!=null &&
              this.GBFeature_partial3.equals(other.getGBFeature_partial3()))) &&
            ((this.GBFeature_quals==null && other.getGBFeature_quals()==null) || 
             (this.GBFeature_quals!=null &&
              this.GBFeature_quals.equals(other.getGBFeature_quals())));
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
        if (getGBFeature_key() != null) {
            _hashCode += getGBFeature_key().hashCode();
        }
        if (getGBFeature_location() != null) {
            _hashCode += getGBFeature_location().hashCode();
        }
        if (getGBFeature_intervals() != null) {
            _hashCode += getGBFeature_intervals().hashCode();
        }
        if (getGBFeature_operator() != null) {
            _hashCode += getGBFeature_operator().hashCode();
        }
        if (getGBFeature_partial5() != null) {
            _hashCode += getGBFeature_partial5().hashCode();
        }
        if (getGBFeature_partial3() != null) {
            _hashCode += getGBFeature_partial3().hashCode();
        }
        if (getGBFeature_quals() != null) {
            _hashCode += getGBFeature_quals().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GBFeatureType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "GBFeatureType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GBFeature_key");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "GBFeature_key"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GBFeature_location");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "GBFeature_location"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GBFeature_intervals");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "GBFeature_intervals"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "GBFeature_intervalsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GBFeature_operator");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "GBFeature_operator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GBFeature_partial5");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "GBFeature_partial5"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "GBFeature_partial5Type"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GBFeature_partial3");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "GBFeature_partial3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "GBFeature_partial3Type"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GBFeature_quals");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "GBFeature_quals"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "GBFeature_qualsType"));
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
