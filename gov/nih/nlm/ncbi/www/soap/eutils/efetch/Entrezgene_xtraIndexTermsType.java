/**
 * Entrezgene_xtraIndexTermsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Entrezgene_xtraIndexTermsType  implements java.io.Serializable {
    private java.lang.String[] entrezgene_xtraIndexTerms_E;

    public Entrezgene_xtraIndexTermsType() {
    }

    public Entrezgene_xtraIndexTermsType(
           java.lang.String[] entrezgene_xtraIndexTerms_E) {
           this.entrezgene_xtraIndexTerms_E = entrezgene_xtraIndexTerms_E;
    }


    /**
     * Gets the entrezgene_xtraIndexTerms_E value for this Entrezgene_xtraIndexTermsType.
     * 
     * @return entrezgene_xtraIndexTerms_E
     */
    public java.lang.String[] getEntrezgene_xtraIndexTerms_E() {
        return entrezgene_xtraIndexTerms_E;
    }


    /**
     * Sets the entrezgene_xtraIndexTerms_E value for this Entrezgene_xtraIndexTermsType.
     * 
     * @param entrezgene_xtraIndexTerms_E
     */
    public void setEntrezgene_xtraIndexTerms_E(java.lang.String[] entrezgene_xtraIndexTerms_E) {
        this.entrezgene_xtraIndexTerms_E = entrezgene_xtraIndexTerms_E;
    }

    public java.lang.String getEntrezgene_xtraIndexTerms_E(int i) {
        return this.entrezgene_xtraIndexTerms_E[i];
    }

    public void setEntrezgene_xtraIndexTerms_E(int i, java.lang.String _value) {
        this.entrezgene_xtraIndexTerms_E[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Entrezgene_xtraIndexTermsType)) return false;
        Entrezgene_xtraIndexTermsType other = (Entrezgene_xtraIndexTermsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.entrezgene_xtraIndexTerms_E==null && other.getEntrezgene_xtraIndexTerms_E()==null) || 
             (this.entrezgene_xtraIndexTerms_E!=null &&
              java.util.Arrays.equals(this.entrezgene_xtraIndexTerms_E, other.getEntrezgene_xtraIndexTerms_E())));
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
        if (getEntrezgene_xtraIndexTerms_E() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEntrezgene_xtraIndexTerms_E());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEntrezgene_xtraIndexTerms_E(), i);
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
        new org.apache.axis.description.TypeDesc(Entrezgene_xtraIndexTermsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrezgene_xtra-index-termsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entrezgene_xtraIndexTerms_E");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrezgene_xtra-index-terms_E"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrezgene_xtra-index-terms_E"));
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
