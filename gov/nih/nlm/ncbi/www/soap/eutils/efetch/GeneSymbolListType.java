/**
 * GeneSymbolListType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class GeneSymbolListType  implements java.io.Serializable {
    private java.lang.String[] geneSymbol;

    public GeneSymbolListType() {
    }

    public GeneSymbolListType(
           java.lang.String[] geneSymbol) {
           this.geneSymbol = geneSymbol;
    }


    /**
     * Gets the geneSymbol value for this GeneSymbolListType.
     * 
     * @return geneSymbol
     */
    public java.lang.String[] getGeneSymbol() {
        return geneSymbol;
    }


    /**
     * Sets the geneSymbol value for this GeneSymbolListType.
     * 
     * @param geneSymbol
     */
    public void setGeneSymbol(java.lang.String[] geneSymbol) {
        this.geneSymbol = geneSymbol;
    }

    public java.lang.String getGeneSymbol(int i) {
        return this.geneSymbol[i];
    }

    public void setGeneSymbol(int i, java.lang.String _value) {
        this.geneSymbol[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GeneSymbolListType)) return false;
        GeneSymbolListType other = (GeneSymbolListType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.geneSymbol==null && other.getGeneSymbol()==null) || 
             (this.geneSymbol!=null &&
              java.util.Arrays.equals(this.geneSymbol, other.getGeneSymbol())));
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
        if (getGeneSymbol() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGeneSymbol());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGeneSymbol(), i);
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
        new org.apache.axis.description.TypeDesc(GeneSymbolListType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "GeneSymbolListType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("geneSymbol");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "GeneSymbol"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "GeneSymbol"));
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
