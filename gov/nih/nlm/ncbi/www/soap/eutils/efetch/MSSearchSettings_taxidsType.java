/**
 * MSSearchSettings_taxidsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class MSSearchSettings_taxidsType  implements java.io.Serializable {
    private java.lang.String[] MSSearchSettings_taxids_E;

    public MSSearchSettings_taxidsType() {
    }

    public MSSearchSettings_taxidsType(
           java.lang.String[] MSSearchSettings_taxids_E) {
           this.MSSearchSettings_taxids_E = MSSearchSettings_taxids_E;
    }


    /**
     * Gets the MSSearchSettings_taxids_E value for this MSSearchSettings_taxidsType.
     * 
     * @return MSSearchSettings_taxids_E
     */
    public java.lang.String[] getMSSearchSettings_taxids_E() {
        return MSSearchSettings_taxids_E;
    }


    /**
     * Sets the MSSearchSettings_taxids_E value for this MSSearchSettings_taxidsType.
     * 
     * @param MSSearchSettings_taxids_E
     */
    public void setMSSearchSettings_taxids_E(java.lang.String[] MSSearchSettings_taxids_E) {
        this.MSSearchSettings_taxids_E = MSSearchSettings_taxids_E;
    }

    public java.lang.String getMSSearchSettings_taxids_E(int i) {
        return this.MSSearchSettings_taxids_E[i];
    }

    public void setMSSearchSettings_taxids_E(int i, java.lang.String _value) {
        this.MSSearchSettings_taxids_E[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MSSearchSettings_taxidsType)) return false;
        MSSearchSettings_taxidsType other = (MSSearchSettings_taxidsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.MSSearchSettings_taxids_E==null && other.getMSSearchSettings_taxids_E()==null) || 
             (this.MSSearchSettings_taxids_E!=null &&
              java.util.Arrays.equals(this.MSSearchSettings_taxids_E, other.getMSSearchSettings_taxids_E())));
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
        if (getMSSearchSettings_taxids_E() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMSSearchSettings_taxids_E());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMSSearchSettings_taxids_E(), i);
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
        new org.apache.axis.description.TypeDesc(MSSearchSettings_taxidsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSSearchSettings_taxidsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSSearchSettings_taxids_E");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSSearchSettings_taxids_E"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSSearchSettings_taxids_E"));
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
