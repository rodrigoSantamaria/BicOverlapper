/**
 * PCSubstance_commentType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class PCSubstance_commentType  implements java.io.Serializable {
    private java.lang.String[] PCSubstance_comment_E;

    public PCSubstance_commentType() {
    }

    public PCSubstance_commentType(
           java.lang.String[] PCSubstance_comment_E) {
           this.PCSubstance_comment_E = PCSubstance_comment_E;
    }


    /**
     * Gets the PCSubstance_comment_E value for this PCSubstance_commentType.
     * 
     * @return PCSubstance_comment_E
     */
    public java.lang.String[] getPCSubstance_comment_E() {
        return PCSubstance_comment_E;
    }


    /**
     * Sets the PCSubstance_comment_E value for this PCSubstance_commentType.
     * 
     * @param PCSubstance_comment_E
     */
    public void setPCSubstance_comment_E(java.lang.String[] PCSubstance_comment_E) {
        this.PCSubstance_comment_E = PCSubstance_comment_E;
    }

    public java.lang.String getPCSubstance_comment_E(int i) {
        return this.PCSubstance_comment_E[i];
    }

    public void setPCSubstance_comment_E(int i, java.lang.String _value) {
        this.PCSubstance_comment_E[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PCSubstance_commentType)) return false;
        PCSubstance_commentType other = (PCSubstance_commentType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.PCSubstance_comment_E==null && other.getPCSubstance_comment_E()==null) || 
             (this.PCSubstance_comment_E!=null &&
              java.util.Arrays.equals(this.PCSubstance_comment_E, other.getPCSubstance_comment_E())));
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
        if (getPCSubstance_comment_E() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPCSubstance_comment_E());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPCSubstance_comment_E(), i);
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
        new org.apache.axis.description.TypeDesc(PCSubstance_commentType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-Substance_commentType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCSubstance_comment_E");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-Substance_comment_E"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-Substance_comment_E"));
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
