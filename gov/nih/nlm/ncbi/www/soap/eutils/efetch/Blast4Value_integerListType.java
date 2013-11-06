/**
 * Blast4Value_integerListType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Blast4Value_integerListType  implements java.io.Serializable {
    private java.lang.String[] blast4Value_integerList_E;

    public Blast4Value_integerListType() {
    }

    public Blast4Value_integerListType(
           java.lang.String[] blast4Value_integerList_E) {
           this.blast4Value_integerList_E = blast4Value_integerList_E;
    }


    /**
     * Gets the blast4Value_integerList_E value for this Blast4Value_integerListType.
     * 
     * @return blast4Value_integerList_E
     */
    public java.lang.String[] getBlast4Value_integerList_E() {
        return blast4Value_integerList_E;
    }


    /**
     * Sets the blast4Value_integerList_E value for this Blast4Value_integerListType.
     * 
     * @param blast4Value_integerList_E
     */
    public void setBlast4Value_integerList_E(java.lang.String[] blast4Value_integerList_E) {
        this.blast4Value_integerList_E = blast4Value_integerList_E;
    }

    public java.lang.String getBlast4Value_integerList_E(int i) {
        return this.blast4Value_integerList_E[i];
    }

    public void setBlast4Value_integerList_E(int i, java.lang.String _value) {
        this.blast4Value_integerList_E[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Blast4Value_integerListType)) return false;
        Blast4Value_integerListType other = (Blast4Value_integerListType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.blast4Value_integerList_E==null && other.getBlast4Value_integerList_E()==null) || 
             (this.blast4Value_integerList_E!=null &&
              java.util.Arrays.equals(this.blast4Value_integerList_E, other.getBlast4Value_integerList_E())));
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
        if (getBlast4Value_integerList_E() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBlast4Value_integerList_E());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBlast4Value_integerList_E(), i);
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
        new org.apache.axis.description.TypeDesc(Blast4Value_integerListType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-value_integer-listType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blast4Value_integerList_E");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-value_integer-list_E"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-value_integer-list_E"));
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
