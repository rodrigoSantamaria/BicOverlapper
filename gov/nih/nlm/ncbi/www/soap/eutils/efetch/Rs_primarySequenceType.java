/**
 * Rs_primarySequenceType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Rs_primarySequenceType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PrimarySequenceType[] primarySequence;

    public Rs_primarySequenceType() {
    }

    public Rs_primarySequenceType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PrimarySequenceType[] primarySequence) {
           this.primarySequence = primarySequence;
    }


    /**
     * Gets the primarySequence value for this Rs_primarySequenceType.
     * 
     * @return primarySequence
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PrimarySequenceType[] getPrimarySequence() {
        return primarySequence;
    }


    /**
     * Sets the primarySequence value for this Rs_primarySequenceType.
     * 
     * @param primarySequence
     */
    public void setPrimarySequence(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PrimarySequenceType[] primarySequence) {
        this.primarySequence = primarySequence;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PrimarySequenceType getPrimarySequence(int i) {
        return this.primarySequence[i];
    }

    public void setPrimarySequence(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.PrimarySequenceType _value) {
        this.primarySequence[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Rs_primarySequenceType)) return false;
        Rs_primarySequenceType other = (Rs_primarySequenceType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.primarySequence==null && other.getPrimarySequence()==null) || 
             (this.primarySequence!=null &&
              java.util.Arrays.equals(this.primarySequence, other.getPrimarySequence())));
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
        if (getPrimarySequence() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPrimarySequence());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPrimarySequence(), i);
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
        new org.apache.axis.description.TypeDesc(Rs_primarySequenceType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Rs_primarySequenceType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primarySequence");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PrimarySequence"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PrimarySequenceType"));
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
