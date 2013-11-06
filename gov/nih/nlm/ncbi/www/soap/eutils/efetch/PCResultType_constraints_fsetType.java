/**
 * PCResultType_constraints_fsetType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class PCResultType_constraints_fsetType  implements java.io.Serializable {
    private java.lang.String[] PCResultType_constraints_fset_E;

    public PCResultType_constraints_fsetType() {
    }

    public PCResultType_constraints_fsetType(
           java.lang.String[] PCResultType_constraints_fset_E) {
           this.PCResultType_constraints_fset_E = PCResultType_constraints_fset_E;
    }


    /**
     * Gets the PCResultType_constraints_fset_E value for this PCResultType_constraints_fsetType.
     * 
     * @return PCResultType_constraints_fset_E
     */
    public java.lang.String[] getPCResultType_constraints_fset_E() {
        return PCResultType_constraints_fset_E;
    }


    /**
     * Sets the PCResultType_constraints_fset_E value for this PCResultType_constraints_fsetType.
     * 
     * @param PCResultType_constraints_fset_E
     */
    public void setPCResultType_constraints_fset_E(java.lang.String[] PCResultType_constraints_fset_E) {
        this.PCResultType_constraints_fset_E = PCResultType_constraints_fset_E;
    }

    public java.lang.String getPCResultType_constraints_fset_E(int i) {
        return this.PCResultType_constraints_fset_E[i];
    }

    public void setPCResultType_constraints_fset_E(int i, java.lang.String _value) {
        this.PCResultType_constraints_fset_E[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PCResultType_constraints_fsetType)) return false;
        PCResultType_constraints_fsetType other = (PCResultType_constraints_fsetType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.PCResultType_constraints_fset_E==null && other.getPCResultType_constraints_fset_E()==null) || 
             (this.PCResultType_constraints_fset_E!=null &&
              java.util.Arrays.equals(this.PCResultType_constraints_fset_E, other.getPCResultType_constraints_fset_E())));
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
        if (getPCResultType_constraints_fset_E() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPCResultType_constraints_fset_E());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPCResultType_constraints_fset_E(), i);
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
        new org.apache.axis.description.TypeDesc(PCResultType_constraints_fsetType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-ResultType_constraints_fsetType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCResultType_constraints_fset_E");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-ResultType_constraints_fset_E"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-ResultType_constraints_fset_E"));
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
