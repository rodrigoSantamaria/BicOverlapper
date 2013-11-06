/**
 * MedlineEntry_geneType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class MedlineEntry_geneType  implements java.io.Serializable {
    private java.lang.String[] medlineEntry_gene_E;

    public MedlineEntry_geneType() {
    }

    public MedlineEntry_geneType(
           java.lang.String[] medlineEntry_gene_E) {
           this.medlineEntry_gene_E = medlineEntry_gene_E;
    }


    /**
     * Gets the medlineEntry_gene_E value for this MedlineEntry_geneType.
     * 
     * @return medlineEntry_gene_E
     */
    public java.lang.String[] getMedlineEntry_gene_E() {
        return medlineEntry_gene_E;
    }


    /**
     * Sets the medlineEntry_gene_E value for this MedlineEntry_geneType.
     * 
     * @param medlineEntry_gene_E
     */
    public void setMedlineEntry_gene_E(java.lang.String[] medlineEntry_gene_E) {
        this.medlineEntry_gene_E = medlineEntry_gene_E;
    }

    public java.lang.String getMedlineEntry_gene_E(int i) {
        return this.medlineEntry_gene_E[i];
    }

    public void setMedlineEntry_gene_E(int i, java.lang.String _value) {
        this.medlineEntry_gene_E[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MedlineEntry_geneType)) return false;
        MedlineEntry_geneType other = (MedlineEntry_geneType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.medlineEntry_gene_E==null && other.getMedlineEntry_gene_E()==null) || 
             (this.medlineEntry_gene_E!=null &&
              java.util.Arrays.equals(this.medlineEntry_gene_E, other.getMedlineEntry_gene_E())));
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
        if (getMedlineEntry_gene_E() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMedlineEntry_gene_E());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMedlineEntry_gene_E(), i);
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
        new org.apache.axis.description.TypeDesc(MedlineEntry_geneType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Medline-entry_geneType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("medlineEntry_gene_E");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Medline-entry_gene_E"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Medline-entry_gene_E"));
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
