/**
 * Triangle_scoresType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Triangle_scoresType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ScoreSetType scoreSet;

    public Triangle_scoresType() {
    }

    public Triangle_scoresType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ScoreSetType scoreSet) {
           this.scoreSet = scoreSet;
    }


    /**
     * Gets the scoreSet value for this Triangle_scoresType.
     * 
     * @return scoreSet
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ScoreSetType getScoreSet() {
        return scoreSet;
    }


    /**
     * Sets the scoreSet value for this Triangle_scoresType.
     * 
     * @param scoreSet
     */
    public void setScoreSet(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ScoreSetType scoreSet) {
        this.scoreSet = scoreSet;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Triangle_scoresType)) return false;
        Triangle_scoresType other = (Triangle_scoresType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.scoreSet==null && other.getScoreSet()==null) || 
             (this.scoreSet!=null &&
              this.scoreSet.equals(other.getScoreSet())));
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
        if (getScoreSet() != null) {
            _hashCode += getScoreSet().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Triangle_scoresType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Triangle_scoresType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scoreSet");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Score-set"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Score-setType"));
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
