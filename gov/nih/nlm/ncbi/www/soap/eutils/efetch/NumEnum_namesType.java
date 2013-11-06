/**
 * NumEnum_namesType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class NumEnum_namesType  implements java.io.Serializable {
    private java.lang.String[] numEnum_names_E;

    public NumEnum_namesType() {
    }

    public NumEnum_namesType(
           java.lang.String[] numEnum_names_E) {
           this.numEnum_names_E = numEnum_names_E;
    }


    /**
     * Gets the numEnum_names_E value for this NumEnum_namesType.
     * 
     * @return numEnum_names_E
     */
    public java.lang.String[] getNumEnum_names_E() {
        return numEnum_names_E;
    }


    /**
     * Sets the numEnum_names_E value for this NumEnum_namesType.
     * 
     * @param numEnum_names_E
     */
    public void setNumEnum_names_E(java.lang.String[] numEnum_names_E) {
        this.numEnum_names_E = numEnum_names_E;
    }

    public java.lang.String getNumEnum_names_E(int i) {
        return this.numEnum_names_E[i];
    }

    public void setNumEnum_names_E(int i, java.lang.String _value) {
        this.numEnum_names_E[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NumEnum_namesType)) return false;
        NumEnum_namesType other = (NumEnum_namesType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.numEnum_names_E==null && other.getNumEnum_names_E()==null) || 
             (this.numEnum_names_E!=null &&
              java.util.Arrays.equals(this.numEnum_names_E, other.getNumEnum_names_E())));
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
        if (getNumEnum_names_E() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNumEnum_names_E());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNumEnum_names_E(), i);
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
        new org.apache.axis.description.TypeDesc(NumEnum_namesType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Num-enum_namesType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numEnum_names_E");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Num-enum_names_E"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Num-enum_names_E"));
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
