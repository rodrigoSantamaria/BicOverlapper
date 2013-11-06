/**
 * GeneRef_synType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class GeneRef_synType  implements java.io.Serializable {
    private java.lang.String[] geneRef_syn_E;

    public GeneRef_synType() {
    }

    public GeneRef_synType(
           java.lang.String[] geneRef_syn_E) {
           this.geneRef_syn_E = geneRef_syn_E;
    }


    /**
     * Gets the geneRef_syn_E value for this GeneRef_synType.
     * 
     * @return geneRef_syn_E
     */
    public java.lang.String[] getGeneRef_syn_E() {
        return geneRef_syn_E;
    }


    /**
     * Sets the geneRef_syn_E value for this GeneRef_synType.
     * 
     * @param geneRef_syn_E
     */
    public void setGeneRef_syn_E(java.lang.String[] geneRef_syn_E) {
        this.geneRef_syn_E = geneRef_syn_E;
    }

    public java.lang.String getGeneRef_syn_E(int i) {
        return this.geneRef_syn_E[i];
    }

    public void setGeneRef_syn_E(int i, java.lang.String _value) {
        this.geneRef_syn_E[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GeneRef_synType)) return false;
        GeneRef_synType other = (GeneRef_synType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.geneRef_syn_E==null && other.getGeneRef_syn_E()==null) || 
             (this.geneRef_syn_E!=null &&
              java.util.Arrays.equals(this.geneRef_syn_E, other.getGeneRef_syn_E())));
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
        if (getGeneRef_syn_E() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGeneRef_syn_E());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGeneRef_syn_E(), i);
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
        new org.apache.axis.description.TypeDesc(GeneRef_synType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Gene-ref_synType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("geneRef_syn_E");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Gene-ref_syn_E"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Gene-ref_syn_E"));
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
