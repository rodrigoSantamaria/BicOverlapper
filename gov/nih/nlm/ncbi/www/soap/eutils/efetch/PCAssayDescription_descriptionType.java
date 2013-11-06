/**
 * PCAssayDescription_descriptionType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class PCAssayDescription_descriptionType  implements java.io.Serializable {
    private java.lang.String[] PCAssayDescription_description_E;

    public PCAssayDescription_descriptionType() {
    }

    public PCAssayDescription_descriptionType(
           java.lang.String[] PCAssayDescription_description_E) {
           this.PCAssayDescription_description_E = PCAssayDescription_description_E;
    }


    /**
     * Gets the PCAssayDescription_description_E value for this PCAssayDescription_descriptionType.
     * 
     * @return PCAssayDescription_description_E
     */
    public java.lang.String[] getPCAssayDescription_description_E() {
        return PCAssayDescription_description_E;
    }


    /**
     * Sets the PCAssayDescription_description_E value for this PCAssayDescription_descriptionType.
     * 
     * @param PCAssayDescription_description_E
     */
    public void setPCAssayDescription_description_E(java.lang.String[] PCAssayDescription_description_E) {
        this.PCAssayDescription_description_E = PCAssayDescription_description_E;
    }

    public java.lang.String getPCAssayDescription_description_E(int i) {
        return this.PCAssayDescription_description_E[i];
    }

    public void setPCAssayDescription_description_E(int i, java.lang.String _value) {
        this.PCAssayDescription_description_E[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PCAssayDescription_descriptionType)) return false;
        PCAssayDescription_descriptionType other = (PCAssayDescription_descriptionType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.PCAssayDescription_description_E==null && other.getPCAssayDescription_description_E()==null) || 
             (this.PCAssayDescription_description_E!=null &&
              java.util.Arrays.equals(this.PCAssayDescription_description_E, other.getPCAssayDescription_description_E())));
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
        if (getPCAssayDescription_description_E() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPCAssayDescription_description_E());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPCAssayDescription_description_E(), i);
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
        new org.apache.axis.description.TypeDesc(PCAssayDescription_descriptionType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-AssayDescription_descriptionType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCAssayDescription_description_E");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-AssayDescription_description_E"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-AssayDescription_description_E"));
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
