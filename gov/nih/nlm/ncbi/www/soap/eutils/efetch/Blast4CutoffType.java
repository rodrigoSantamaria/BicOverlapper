/**
 * Blast4CutoffType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Blast4CutoffType  implements java.io.Serializable {
    private java.lang.String blast4Cutoff_eValue;

    private java.lang.String blast4Cutoff_rawScore;

    public Blast4CutoffType() {
    }

    public Blast4CutoffType(
           java.lang.String blast4Cutoff_eValue,
           java.lang.String blast4Cutoff_rawScore) {
           this.blast4Cutoff_eValue = blast4Cutoff_eValue;
           this.blast4Cutoff_rawScore = blast4Cutoff_rawScore;
    }


    /**
     * Gets the blast4Cutoff_eValue value for this Blast4CutoffType.
     * 
     * @return blast4Cutoff_eValue
     */
    public java.lang.String getBlast4Cutoff_eValue() {
        return blast4Cutoff_eValue;
    }


    /**
     * Sets the blast4Cutoff_eValue value for this Blast4CutoffType.
     * 
     * @param blast4Cutoff_eValue
     */
    public void setBlast4Cutoff_eValue(java.lang.String blast4Cutoff_eValue) {
        this.blast4Cutoff_eValue = blast4Cutoff_eValue;
    }


    /**
     * Gets the blast4Cutoff_rawScore value for this Blast4CutoffType.
     * 
     * @return blast4Cutoff_rawScore
     */
    public java.lang.String getBlast4Cutoff_rawScore() {
        return blast4Cutoff_rawScore;
    }


    /**
     * Sets the blast4Cutoff_rawScore value for this Blast4CutoffType.
     * 
     * @param blast4Cutoff_rawScore
     */
    public void setBlast4Cutoff_rawScore(java.lang.String blast4Cutoff_rawScore) {
        this.blast4Cutoff_rawScore = blast4Cutoff_rawScore;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Blast4CutoffType)) return false;
        Blast4CutoffType other = (Blast4CutoffType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.blast4Cutoff_eValue==null && other.getBlast4Cutoff_eValue()==null) || 
             (this.blast4Cutoff_eValue!=null &&
              this.blast4Cutoff_eValue.equals(other.getBlast4Cutoff_eValue()))) &&
            ((this.blast4Cutoff_rawScore==null && other.getBlast4Cutoff_rawScore()==null) || 
             (this.blast4Cutoff_rawScore!=null &&
              this.blast4Cutoff_rawScore.equals(other.getBlast4Cutoff_rawScore())));
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
        if (getBlast4Cutoff_eValue() != null) {
            _hashCode += getBlast4Cutoff_eValue().hashCode();
        }
        if (getBlast4Cutoff_rawScore() != null) {
            _hashCode += getBlast4Cutoff_rawScore().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Blast4CutoffType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-cutoffType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blast4Cutoff_eValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-cutoff_e-value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blast4Cutoff_rawScore");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-cutoff_raw-score"));
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
