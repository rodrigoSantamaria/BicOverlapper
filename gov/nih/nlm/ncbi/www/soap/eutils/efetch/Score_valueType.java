/**
 * Score_valueType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Score_valueType  implements java.io.Serializable {
    private java.lang.String score_value_real;

    private java.lang.String score_value_int;

    public Score_valueType() {
    }

    public Score_valueType(
           java.lang.String score_value_real,
           java.lang.String score_value_int) {
           this.score_value_real = score_value_real;
           this.score_value_int = score_value_int;
    }


    /**
     * Gets the score_value_real value for this Score_valueType.
     * 
     * @return score_value_real
     */
    public java.lang.String getScore_value_real() {
        return score_value_real;
    }


    /**
     * Sets the score_value_real value for this Score_valueType.
     * 
     * @param score_value_real
     */
    public void setScore_value_real(java.lang.String score_value_real) {
        this.score_value_real = score_value_real;
    }


    /**
     * Gets the score_value_int value for this Score_valueType.
     * 
     * @return score_value_int
     */
    public java.lang.String getScore_value_int() {
        return score_value_int;
    }


    /**
     * Sets the score_value_int value for this Score_valueType.
     * 
     * @param score_value_int
     */
    public void setScore_value_int(java.lang.String score_value_int) {
        this.score_value_int = score_value_int;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Score_valueType)) return false;
        Score_valueType other = (Score_valueType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.score_value_real==null && other.getScore_value_real()==null) || 
             (this.score_value_real!=null &&
              this.score_value_real.equals(other.getScore_value_real()))) &&
            ((this.score_value_int==null && other.getScore_value_int()==null) || 
             (this.score_value_int!=null &&
              this.score_value_int.equals(other.getScore_value_int())));
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
        if (getScore_value_real() != null) {
            _hashCode += getScore_value_real().hashCode();
        }
        if (getScore_value_int() != null) {
            _hashCode += getScore_value_int().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Score_valueType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Score_valueType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("score_value_real");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Score_value_real"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("score_value_int");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Score_value_int"));
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
