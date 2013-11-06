/**
 * Rs_assemblyType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Rs_assemblyType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.AssemblyType[] assembly;

    public Rs_assemblyType() {
    }

    public Rs_assemblyType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.AssemblyType[] assembly) {
           this.assembly = assembly;
    }


    /**
     * Gets the assembly value for this Rs_assemblyType.
     * 
     * @return assembly
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.AssemblyType[] getAssembly() {
        return assembly;
    }


    /**
     * Sets the assembly value for this Rs_assemblyType.
     * 
     * @param assembly
     */
    public void setAssembly(gov.nih.nlm.ncbi.www.soap.eutils.efetch.AssemblyType[] assembly) {
        this.assembly = assembly;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.AssemblyType getAssembly(int i) {
        return this.assembly[i];
    }

    public void setAssembly(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.AssemblyType _value) {
        this.assembly[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Rs_assemblyType)) return false;
        Rs_assemblyType other = (Rs_assemblyType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.assembly==null && other.getAssembly()==null) || 
             (this.assembly!=null &&
              java.util.Arrays.equals(this.assembly, other.getAssembly())));
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
        if (getAssembly() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAssembly());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAssembly(), i);
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
        new org.apache.axis.description.TypeDesc(Rs_assemblyType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Rs_assemblyType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assembly");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Assembly"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "AssemblyType"));
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
