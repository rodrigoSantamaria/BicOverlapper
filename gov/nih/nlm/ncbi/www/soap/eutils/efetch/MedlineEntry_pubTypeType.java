/**
 * MedlineEntry_pubTypeType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class MedlineEntry_pubTypeType  implements java.io.Serializable {
    private java.lang.String[] medlineEntry_pubType_E;

    public MedlineEntry_pubTypeType() {
    }

    public MedlineEntry_pubTypeType(
           java.lang.String[] medlineEntry_pubType_E) {
           this.medlineEntry_pubType_E = medlineEntry_pubType_E;
    }


    /**
     * Gets the medlineEntry_pubType_E value for this MedlineEntry_pubTypeType.
     * 
     * @return medlineEntry_pubType_E
     */
    public java.lang.String[] getMedlineEntry_pubType_E() {
        return medlineEntry_pubType_E;
    }


    /**
     * Sets the medlineEntry_pubType_E value for this MedlineEntry_pubTypeType.
     * 
     * @param medlineEntry_pubType_E
     */
    public void setMedlineEntry_pubType_E(java.lang.String[] medlineEntry_pubType_E) {
        this.medlineEntry_pubType_E = medlineEntry_pubType_E;
    }

    public java.lang.String getMedlineEntry_pubType_E(int i) {
        return this.medlineEntry_pubType_E[i];
    }

    public void setMedlineEntry_pubType_E(int i, java.lang.String _value) {
        this.medlineEntry_pubType_E[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MedlineEntry_pubTypeType)) return false;
        MedlineEntry_pubTypeType other = (MedlineEntry_pubTypeType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.medlineEntry_pubType_E==null && other.getMedlineEntry_pubType_E()==null) || 
             (this.medlineEntry_pubType_E!=null &&
              java.util.Arrays.equals(this.medlineEntry_pubType_E, other.getMedlineEntry_pubType_E())));
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
        if (getMedlineEntry_pubType_E() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMedlineEntry_pubType_E());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMedlineEntry_pubType_E(), i);
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
        new org.apache.axis.description.TypeDesc(MedlineEntry_pubTypeType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Medline-entry_pub-typeType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("medlineEntry_pubType_E");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Medline-entry_pub-type_E"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Medline-entry_pub-type_E"));
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
