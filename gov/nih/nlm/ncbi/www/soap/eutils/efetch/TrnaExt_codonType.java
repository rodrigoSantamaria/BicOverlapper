/**
 * TrnaExt_codonType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class TrnaExt_codonType  implements java.io.Serializable {
    private java.lang.String[] trnaExt_codon_E;

    public TrnaExt_codonType() {
    }

    public TrnaExt_codonType(
           java.lang.String[] trnaExt_codon_E) {
           this.trnaExt_codon_E = trnaExt_codon_E;
    }


    /**
     * Gets the trnaExt_codon_E value for this TrnaExt_codonType.
     * 
     * @return trnaExt_codon_E
     */
    public java.lang.String[] getTrnaExt_codon_E() {
        return trnaExt_codon_E;
    }


    /**
     * Sets the trnaExt_codon_E value for this TrnaExt_codonType.
     * 
     * @param trnaExt_codon_E
     */
    public void setTrnaExt_codon_E(java.lang.String[] trnaExt_codon_E) {
        this.trnaExt_codon_E = trnaExt_codon_E;
    }

    public java.lang.String getTrnaExt_codon_E(int i) {
        return this.trnaExt_codon_E[i];
    }

    public void setTrnaExt_codon_E(int i, java.lang.String _value) {
        this.trnaExt_codon_E[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TrnaExt_codonType)) return false;
        TrnaExt_codonType other = (TrnaExt_codonType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.trnaExt_codon_E==null && other.getTrnaExt_codon_E()==null) || 
             (this.trnaExt_codon_E!=null &&
              java.util.Arrays.equals(this.trnaExt_codon_E, other.getTrnaExt_codon_E())));
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
        if (getTrnaExt_codon_E() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTrnaExt_codon_E());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTrnaExt_codon_E(), i);
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
        new org.apache.axis.description.TypeDesc(TrnaExt_codonType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Trna-ext_codonType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trnaExt_codon_E");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Trna-ext_codon_E"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Trna-ext_codon_E"));
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
