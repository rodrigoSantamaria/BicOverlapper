/**
 * PCAssayResultsSet.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class PCAssayResultsSet  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCAssayResultsType[] PCAssayResults;

    public PCAssayResultsSet() {
    }

    public PCAssayResultsSet(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCAssayResultsType[] PCAssayResults) {
           this.PCAssayResults = PCAssayResults;
    }


    /**
     * Gets the PCAssayResults value for this PCAssayResultsSet.
     * 
     * @return PCAssayResults
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCAssayResultsType[] getPCAssayResults() {
        return PCAssayResults;
    }


    /**
     * Sets the PCAssayResults value for this PCAssayResultsSet.
     * 
     * @param PCAssayResults
     */
    public void setPCAssayResults(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCAssayResultsType[] PCAssayResults) {
        this.PCAssayResults = PCAssayResults;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCAssayResultsType getPCAssayResults(int i) {
        return this.PCAssayResults[i];
    }

    public void setPCAssayResults(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCAssayResultsType _value) {
        this.PCAssayResults[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PCAssayResultsSet)) return false;
        PCAssayResultsSet other = (PCAssayResultsSet) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.PCAssayResults==null && other.getPCAssayResults()==null) || 
             (this.PCAssayResults!=null &&
              java.util.Arrays.equals(this.PCAssayResults, other.getPCAssayResults())));
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
        if (getPCAssayResults() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPCAssayResults());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPCAssayResults(), i);
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
        new org.apache.axis.description.TypeDesc(PCAssayResultsSet.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">PC-AssayResultsSet"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCAssayResults");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-AssayResults"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-AssayResultsType"));
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
