/**
 * ScoreType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ScoreType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Score_idType score_id;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Score_valueType score_value;

    public ScoreType() {
    }

    public ScoreType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Score_idType score_id,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Score_valueType score_value) {
           this.score_id = score_id;
           this.score_value = score_value;
    }


    /**
     * Gets the score_id value for this ScoreType.
     * 
     * @return score_id
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Score_idType getScore_id() {
        return score_id;
    }


    /**
     * Sets the score_id value for this ScoreType.
     * 
     * @param score_id
     */
    public void setScore_id(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Score_idType score_id) {
        this.score_id = score_id;
    }


    /**
     * Gets the score_value value for this ScoreType.
     * 
     * @return score_value
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Score_valueType getScore_value() {
        return score_value;
    }


    /**
     * Sets the score_value value for this ScoreType.
     * 
     * @param score_value
     */
    public void setScore_value(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Score_valueType score_value) {
        this.score_value = score_value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ScoreType)) return false;
        ScoreType other = (ScoreType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.score_id==null && other.getScore_id()==null) || 
             (this.score_id!=null &&
              this.score_id.equals(other.getScore_id()))) &&
            ((this.score_value==null && other.getScore_value()==null) || 
             (this.score_value!=null &&
              this.score_value.equals(other.getScore_value())));
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
        if (getScore_id() != null) {
            _hashCode += getScore_id().hashCode();
        }
        if (getScore_value() != null) {
            _hashCode += getScore_value().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ScoreType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ScoreType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("score_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Score_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Score_idType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("score_value");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Score_value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Score_valueType"));
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
