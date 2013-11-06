/**
 * DenseDiag_startsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class DenseDiag_startsType  implements java.io.Serializable {
    private java.lang.String[] denseDiag_starts_E;

    public DenseDiag_startsType() {
    }

    public DenseDiag_startsType(
           java.lang.String[] denseDiag_starts_E) {
           this.denseDiag_starts_E = denseDiag_starts_E;
    }


    /**
     * Gets the denseDiag_starts_E value for this DenseDiag_startsType.
     * 
     * @return denseDiag_starts_E
     */
    public java.lang.String[] getDenseDiag_starts_E() {
        return denseDiag_starts_E;
    }


    /**
     * Sets the denseDiag_starts_E value for this DenseDiag_startsType.
     * 
     * @param denseDiag_starts_E
     */
    public void setDenseDiag_starts_E(java.lang.String[] denseDiag_starts_E) {
        this.denseDiag_starts_E = denseDiag_starts_E;
    }

    public java.lang.String getDenseDiag_starts_E(int i) {
        return this.denseDiag_starts_E[i];
    }

    public void setDenseDiag_starts_E(int i, java.lang.String _value) {
        this.denseDiag_starts_E[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DenseDiag_startsType)) return false;
        DenseDiag_startsType other = (DenseDiag_startsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.denseDiag_starts_E==null && other.getDenseDiag_starts_E()==null) || 
             (this.denseDiag_starts_E!=null &&
              java.util.Arrays.equals(this.denseDiag_starts_E, other.getDenseDiag_starts_E())));
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
        if (getDenseDiag_starts_E() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDenseDiag_starts_E());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDenseDiag_starts_E(), i);
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
        new org.apache.axis.description.TypeDesc(DenseDiag_startsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Dense-diag_startsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("denseDiag_starts_E");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Dense-diag_starts_E"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Dense-diag_starts_E"));
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
