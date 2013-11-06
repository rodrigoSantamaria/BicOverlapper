/**
 * StdSeg_scoresType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class StdSeg_scoresType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ScoreType[] score;

    public StdSeg_scoresType() {
    }

    public StdSeg_scoresType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ScoreType[] score) {
           this.score = score;
    }


    /**
     * Gets the score value for this StdSeg_scoresType.
     * 
     * @return score
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ScoreType[] getScore() {
        return score;
    }


    /**
     * Sets the score value for this StdSeg_scoresType.
     * 
     * @param score
     */
    public void setScore(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ScoreType[] score) {
        this.score = score;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ScoreType getScore(int i) {
        return this.score[i];
    }

    public void setScore(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.ScoreType _value) {
        this.score[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof StdSeg_scoresType)) return false;
        StdSeg_scoresType other = (StdSeg_scoresType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.score==null && other.getScore()==null) || 
             (this.score!=null &&
              java.util.Arrays.equals(this.score, other.getScore())));
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
        if (getScore() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getScore());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getScore(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(StdSeg_scoresType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Std-seg_scoresType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("score");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Score"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ScoreType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
