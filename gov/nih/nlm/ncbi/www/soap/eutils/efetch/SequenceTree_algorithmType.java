/**
 * SequenceTree_algorithmType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class SequenceTree_algorithmType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.AlgorithmTypeType algorithmType;

    public SequenceTree_algorithmType() {
    }

    public SequenceTree_algorithmType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.AlgorithmTypeType algorithmType) {
           this.algorithmType = algorithmType;
    }


    /**
     * Gets the algorithmType value for this SequenceTree_algorithmType.
     * 
     * @return algorithmType
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.AlgorithmTypeType getAlgorithmType() {
        return algorithmType;
    }


    /**
     * Sets the algorithmType value for this SequenceTree_algorithmType.
     * 
     * @param algorithmType
     */
    public void setAlgorithmType(gov.nih.nlm.ncbi.www.soap.eutils.efetch.AlgorithmTypeType algorithmType) {
        this.algorithmType = algorithmType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SequenceTree_algorithmType)) return false;
        SequenceTree_algorithmType other = (SequenceTree_algorithmType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.algorithmType==null && other.getAlgorithmType()==null) || 
             (this.algorithmType!=null &&
              this.algorithmType.equals(other.getAlgorithmType())));
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
        if (getAlgorithmType() != null) {
            _hashCode += getAlgorithmType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SequenceTree_algorithmType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Sequence-tree_algorithmType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("algorithmType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Algorithm-type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Algorithm-typeType"));
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
