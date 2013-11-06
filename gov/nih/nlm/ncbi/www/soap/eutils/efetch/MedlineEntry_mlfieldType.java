/**
 * MedlineEntry_mlfieldType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class MedlineEntry_mlfieldType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MedlineFieldType[] medlineField;

    public MedlineEntry_mlfieldType() {
    }

    public MedlineEntry_mlfieldType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MedlineFieldType[] medlineField) {
           this.medlineField = medlineField;
    }


    /**
     * Gets the medlineField value for this MedlineEntry_mlfieldType.
     * 
     * @return medlineField
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MedlineFieldType[] getMedlineField() {
        return medlineField;
    }


    /**
     * Sets the medlineField value for this MedlineEntry_mlfieldType.
     * 
     * @param medlineField
     */
    public void setMedlineField(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MedlineFieldType[] medlineField) {
        this.medlineField = medlineField;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MedlineFieldType getMedlineField(int i) {
        return this.medlineField[i];
    }

    public void setMedlineField(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.MedlineFieldType _value) {
        this.medlineField[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MedlineEntry_mlfieldType)) return false;
        MedlineEntry_mlfieldType other = (MedlineEntry_mlfieldType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.medlineField==null && other.getMedlineField()==null) || 
             (this.medlineField!=null &&
              java.util.Arrays.equals(this.medlineField, other.getMedlineField())));
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
        if (getMedlineField() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMedlineField());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMedlineField(), i);
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
        new org.apache.axis.description.TypeDesc(MedlineEntry_mlfieldType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Medline-entry_mlfieldType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("medlineField");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Medline-field"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Medline-fieldType"));
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
