/**
 * MSSpectrum_abundanceType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class MSSpectrum_abundanceType  implements java.io.Serializable {
    private java.lang.String[] MSSpectrum_abundance_E;

    public MSSpectrum_abundanceType() {
    }

    public MSSpectrum_abundanceType(
           java.lang.String[] MSSpectrum_abundance_E) {
           this.MSSpectrum_abundance_E = MSSpectrum_abundance_E;
    }


    /**
     * Gets the MSSpectrum_abundance_E value for this MSSpectrum_abundanceType.
     * 
     * @return MSSpectrum_abundance_E
     */
    public java.lang.String[] getMSSpectrum_abundance_E() {
        return MSSpectrum_abundance_E;
    }


    /**
     * Sets the MSSpectrum_abundance_E value for this MSSpectrum_abundanceType.
     * 
     * @param MSSpectrum_abundance_E
     */
    public void setMSSpectrum_abundance_E(java.lang.String[] MSSpectrum_abundance_E) {
        this.MSSpectrum_abundance_E = MSSpectrum_abundance_E;
    }

    public java.lang.String getMSSpectrum_abundance_E(int i) {
        return this.MSSpectrum_abundance_E[i];
    }

    public void setMSSpectrum_abundance_E(int i, java.lang.String _value) {
        this.MSSpectrum_abundance_E[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MSSpectrum_abundanceType)) return false;
        MSSpectrum_abundanceType other = (MSSpectrum_abundanceType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.MSSpectrum_abundance_E==null && other.getMSSpectrum_abundance_E()==null) || 
             (this.MSSpectrum_abundance_E!=null &&
              java.util.Arrays.equals(this.MSSpectrum_abundance_E, other.getMSSpectrum_abundance_E())));
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
        if (getMSSpectrum_abundance_E() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMSSpectrum_abundance_E());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMSSpectrum_abundance_E(), i);
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
        new org.apache.axis.description.TypeDesc(MSSpectrum_abundanceType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSSpectrum_abundanceType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSSpectrum_abundance_E");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSSpectrum_abundance_E"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSSpectrum_abundance_E"));
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
