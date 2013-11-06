/**
 * PCSubstances.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class PCSubstances  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCSubstanceType[] PCSubstance;

    public PCSubstances() {
    }

    public PCSubstances(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCSubstanceType[] PCSubstance) {
           this.PCSubstance = PCSubstance;
    }


    /**
     * Gets the PCSubstance value for this PCSubstances.
     * 
     * @return PCSubstance
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCSubstanceType[] getPCSubstance() {
        return PCSubstance;
    }


    /**
     * Sets the PCSubstance value for this PCSubstances.
     * 
     * @param PCSubstance
     */
    public void setPCSubstance(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCSubstanceType[] PCSubstance) {
        this.PCSubstance = PCSubstance;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCSubstanceType getPCSubstance(int i) {
        return this.PCSubstance[i];
    }

    public void setPCSubstance(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCSubstanceType _value) {
        this.PCSubstance[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PCSubstances)) return false;
        PCSubstances other = (PCSubstances) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.PCSubstance==null && other.getPCSubstance()==null) || 
             (this.PCSubstance!=null &&
              java.util.Arrays.equals(this.PCSubstance, other.getPCSubstance())));
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
        if (getPCSubstance() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPCSubstance());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPCSubstance(), i);
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
        new org.apache.axis.description.TypeDesc(PCSubstances.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">PC-Substances"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCSubstance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-Substance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-SubstanceType"));
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
