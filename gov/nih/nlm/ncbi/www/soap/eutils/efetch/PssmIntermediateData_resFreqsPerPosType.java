/**
 * PssmIntermediateData_resFreqsPerPosType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class PssmIntermediateData_resFreqsPerPosType  implements java.io.Serializable {
    private java.lang.String[] pssmIntermediateData_resFreqsPerPos_E;

    public PssmIntermediateData_resFreqsPerPosType() {
    }

    public PssmIntermediateData_resFreqsPerPosType(
           java.lang.String[] pssmIntermediateData_resFreqsPerPos_E) {
           this.pssmIntermediateData_resFreqsPerPos_E = pssmIntermediateData_resFreqsPerPos_E;
    }


    /**
     * Gets the pssmIntermediateData_resFreqsPerPos_E value for this PssmIntermediateData_resFreqsPerPosType.
     * 
     * @return pssmIntermediateData_resFreqsPerPos_E
     */
    public java.lang.String[] getPssmIntermediateData_resFreqsPerPos_E() {
        return pssmIntermediateData_resFreqsPerPos_E;
    }


    /**
     * Sets the pssmIntermediateData_resFreqsPerPos_E value for this PssmIntermediateData_resFreqsPerPosType.
     * 
     * @param pssmIntermediateData_resFreqsPerPos_E
     */
    public void setPssmIntermediateData_resFreqsPerPos_E(java.lang.String[] pssmIntermediateData_resFreqsPerPos_E) {
        this.pssmIntermediateData_resFreqsPerPos_E = pssmIntermediateData_resFreqsPerPos_E;
    }

    public java.lang.String getPssmIntermediateData_resFreqsPerPos_E(int i) {
        return this.pssmIntermediateData_resFreqsPerPos_E[i];
    }

    public void setPssmIntermediateData_resFreqsPerPos_E(int i, java.lang.String _value) {
        this.pssmIntermediateData_resFreqsPerPos_E[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PssmIntermediateData_resFreqsPerPosType)) return false;
        PssmIntermediateData_resFreqsPerPosType other = (PssmIntermediateData_resFreqsPerPosType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.pssmIntermediateData_resFreqsPerPos_E==null && other.getPssmIntermediateData_resFreqsPerPos_E()==null) || 
             (this.pssmIntermediateData_resFreqsPerPos_E!=null &&
              java.util.Arrays.equals(this.pssmIntermediateData_resFreqsPerPos_E, other.getPssmIntermediateData_resFreqsPerPos_E())));
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
        if (getPssmIntermediateData_resFreqsPerPos_E() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPssmIntermediateData_resFreqsPerPos_E());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPssmIntermediateData_resFreqsPerPos_E(), i);
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
        new org.apache.axis.description.TypeDesc(PssmIntermediateData_resFreqsPerPosType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PssmIntermediateData_resFreqsPerPosType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pssmIntermediateData_resFreqsPerPos_E");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PssmIntermediateData_resFreqsPerPos_E"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PssmIntermediateData_resFreqsPerPos_E"));
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
