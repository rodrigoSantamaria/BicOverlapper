/**
 * INSDFeatureType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class INSDFeatureType  implements java.io.Serializable {
    private java.lang.String INSDFeature_key;

    private java.lang.String INSDFeature_location;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.INSDFeature_intervalsType INSDFeature_intervals;

    private java.lang.String INSDFeature_operator;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.INSDFeature_partial5Type INSDFeature_partial5;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.INSDFeature_partial3Type INSDFeature_partial3;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.INSDFeature_qualsType INSDFeature_quals;

    public INSDFeatureType() {
    }

    public INSDFeatureType(
           java.lang.String INSDFeature_key,
           java.lang.String INSDFeature_location,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.INSDFeature_intervalsType INSDFeature_intervals,
           java.lang.String INSDFeature_operator,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.INSDFeature_partial5Type INSDFeature_partial5,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.INSDFeature_partial3Type INSDFeature_partial3,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.INSDFeature_qualsType INSDFeature_quals) {
           this.INSDFeature_key = INSDFeature_key;
           this.INSDFeature_location = INSDFeature_location;
           this.INSDFeature_intervals = INSDFeature_intervals;
           this.INSDFeature_operator = INSDFeature_operator;
           this.INSDFeature_partial5 = INSDFeature_partial5;
           this.INSDFeature_partial3 = INSDFeature_partial3;
           this.INSDFeature_quals = INSDFeature_quals;
    }


    /**
     * Gets the INSDFeature_key value for this INSDFeatureType.
     * 
     * @return INSDFeature_key
     */
    public java.lang.String getINSDFeature_key() {
        return INSDFeature_key;
    }


    /**
     * Sets the INSDFeature_key value for this INSDFeatureType.
     * 
     * @param INSDFeature_key
     */
    public void setINSDFeature_key(java.lang.String INSDFeature_key) {
        this.INSDFeature_key = INSDFeature_key;
    }


    /**
     * Gets the INSDFeature_location value for this INSDFeatureType.
     * 
     * @return INSDFeature_location
     */
    public java.lang.String getINSDFeature_location() {
        return INSDFeature_location;
    }


    /**
     * Sets the INSDFeature_location value for this INSDFeatureType.
     * 
     * @param INSDFeature_location
     */
    public void setINSDFeature_location(java.lang.String INSDFeature_location) {
        this.INSDFeature_location = INSDFeature_location;
    }


    /**
     * Gets the INSDFeature_intervals value for this INSDFeatureType.
     * 
     * @return INSDFeature_intervals
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.INSDFeature_intervalsType getINSDFeature_intervals() {
        return INSDFeature_intervals;
    }


    /**
     * Sets the INSDFeature_intervals value for this INSDFeatureType.
     * 
     * @param INSDFeature_intervals
     */
    public void setINSDFeature_intervals(gov.nih.nlm.ncbi.www.soap.eutils.efetch.INSDFeature_intervalsType INSDFeature_intervals) {
        this.INSDFeature_intervals = INSDFeature_intervals;
    }


    /**
     * Gets the INSDFeature_operator value for this INSDFeatureType.
     * 
     * @return INSDFeature_operator
     */
    public java.lang.String getINSDFeature_operator() {
        return INSDFeature_operator;
    }


    /**
     * Sets the INSDFeature_operator value for this INSDFeatureType.
     * 
     * @param INSDFeature_operator
     */
    public void setINSDFeature_operator(java.lang.String INSDFeature_operator) {
        this.INSDFeature_operator = INSDFeature_operator;
    }


    /**
     * Gets the INSDFeature_partial5 value for this INSDFeatureType.
     * 
     * @return INSDFeature_partial5
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.INSDFeature_partial5Type getINSDFeature_partial5() {
        return INSDFeature_partial5;
    }


    /**
     * Sets the INSDFeature_partial5 value for this INSDFeatureType.
     * 
     * @param INSDFeature_partial5
     */
    public void setINSDFeature_partial5(gov.nih.nlm.ncbi.www.soap.eutils.efetch.INSDFeature_partial5Type INSDFeature_partial5) {
        this.INSDFeature_partial5 = INSDFeature_partial5;
    }


    /**
     * Gets the INSDFeature_partial3 value for this INSDFeatureType.
     * 
     * @return INSDFeature_partial3
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.INSDFeature_partial3Type getINSDFeature_partial3() {
        return INSDFeature_partial3;
    }


    /**
     * Sets the INSDFeature_partial3 value for this INSDFeatureType.
     * 
     * @param INSDFeature_partial3
     */
    public void setINSDFeature_partial3(gov.nih.nlm.ncbi.www.soap.eutils.efetch.INSDFeature_partial3Type INSDFeature_partial3) {
        this.INSDFeature_partial3 = INSDFeature_partial3;
    }


    /**
     * Gets the INSDFeature_quals value for this INSDFeatureType.
     * 
     * @return INSDFeature_quals
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.INSDFeature_qualsType getINSDFeature_quals() {
        return INSDFeature_quals;
    }


    /**
     * Sets the INSDFeature_quals value for this INSDFeatureType.
     * 
     * @param INSDFeature_quals
     */
    public void setINSDFeature_quals(gov.nih.nlm.ncbi.www.soap.eutils.efetch.INSDFeature_qualsType INSDFeature_quals) {
        this.INSDFeature_quals = INSDFeature_quals;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof INSDFeatureType)) return false;
        INSDFeatureType other = (INSDFeatureType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.INSDFeature_key==null && other.getINSDFeature_key()==null) || 
             (this.INSDFeature_key!=null &&
              this.INSDFeature_key.equals(other.getINSDFeature_key()))) &&
            ((this.INSDFeature_location==null && other.getINSDFeature_location()==null) || 
             (this.INSDFeature_location!=null &&
              this.INSDFeature_location.equals(other.getINSDFeature_location()))) &&
            ((this.INSDFeature_intervals==null && other.getINSDFeature_intervals()==null) || 
             (this.INSDFeature_intervals!=null &&
              this.INSDFeature_intervals.equals(other.getINSDFeature_intervals()))) &&
            ((this.INSDFeature_operator==null && other.getINSDFeature_operator()==null) || 
             (this.INSDFeature_operator!=null &&
              this.INSDFeature_operator.equals(other.getINSDFeature_operator()))) &&
            ((this.INSDFeature_partial5==null && other.getINSDFeature_partial5()==null) || 
             (this.INSDFeature_partial5!=null &&
              this.INSDFeature_partial5.equals(other.getINSDFeature_partial5()))) &&
            ((this.INSDFeature_partial3==null && other.getINSDFeature_partial3()==null) || 
             (this.INSDFeature_partial3!=null &&
              this.INSDFeature_partial3.equals(other.getINSDFeature_partial3()))) &&
            ((this.INSDFeature_quals==null && other.getINSDFeature_quals()==null) || 
             (this.INSDFeature_quals!=null &&
              this.INSDFeature_quals.equals(other.getINSDFeature_quals())));
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
        if (getINSDFeature_key() != null) {
            _hashCode += getINSDFeature_key().hashCode();
        }
        if (getINSDFeature_location() != null) {
            _hashCode += getINSDFeature_location().hashCode();
        }
        if (getINSDFeature_intervals() != null) {
            _hashCode += getINSDFeature_intervals().hashCode();
        }
        if (getINSDFeature_operator() != null) {
            _hashCode += getINSDFeature_operator().hashCode();
        }
        if (getINSDFeature_partial5() != null) {
            _hashCode += getINSDFeature_partial5().hashCode();
        }
        if (getINSDFeature_partial3() != null) {
            _hashCode += getINSDFeature_partial3().hashCode();
        }
        if (getINSDFeature_quals() != null) {
            _hashCode += getINSDFeature_quals().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(INSDFeatureType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "INSDFeatureType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("INSDFeature_key");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "INSDFeature_key"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("INSDFeature_location");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "INSDFeature_location"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("INSDFeature_intervals");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "INSDFeature_intervals"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "INSDFeature_intervalsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("INSDFeature_operator");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "INSDFeature_operator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("INSDFeature_partial5");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "INSDFeature_partial5"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "INSDFeature_partial5Type"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("INSDFeature_partial3");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "INSDFeature_partial3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "INSDFeature_partial3Type"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("INSDFeature_quals");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "INSDFeature_quals"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "INSDFeature_qualsType"));
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
