/**
 * Pssm_rowLabelsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Pssm_rowLabelsType  implements java.io.Serializable {
    private java.lang.String[] pssm_rowLabels_E;

    public Pssm_rowLabelsType() {
    }

    public Pssm_rowLabelsType(
           java.lang.String[] pssm_rowLabels_E) {
           this.pssm_rowLabels_E = pssm_rowLabels_E;
    }


    /**
     * Gets the pssm_rowLabels_E value for this Pssm_rowLabelsType.
     * 
     * @return pssm_rowLabels_E
     */
    public java.lang.String[] getPssm_rowLabels_E() {
        return pssm_rowLabels_E;
    }


    /**
     * Sets the pssm_rowLabels_E value for this Pssm_rowLabelsType.
     * 
     * @param pssm_rowLabels_E
     */
    public void setPssm_rowLabels_E(java.lang.String[] pssm_rowLabels_E) {
        this.pssm_rowLabels_E = pssm_rowLabels_E;
    }

    public java.lang.String getPssm_rowLabels_E(int i) {
        return this.pssm_rowLabels_E[i];
    }

    public void setPssm_rowLabels_E(int i, java.lang.String _value) {
        this.pssm_rowLabels_E[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Pssm_rowLabelsType)) return false;
        Pssm_rowLabelsType other = (Pssm_rowLabelsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.pssm_rowLabels_E==null && other.getPssm_rowLabels_E()==null) || 
             (this.pssm_rowLabels_E!=null &&
              java.util.Arrays.equals(this.pssm_rowLabels_E, other.getPssm_rowLabels_E())));
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
        if (getPssm_rowLabels_E() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPssm_rowLabels_E());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPssm_rowLabels_E(), i);
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
        new org.apache.axis.description.TypeDesc(Pssm_rowLabelsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Pssm_rowLabelsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pssm_rowLabels_E");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Pssm_rowLabels_E"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Pssm_rowLabels_E"));
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
