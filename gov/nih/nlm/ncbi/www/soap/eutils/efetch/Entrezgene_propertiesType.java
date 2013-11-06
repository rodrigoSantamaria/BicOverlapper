/**
 * Entrezgene_propertiesType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Entrezgene_propertiesType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.GeneCommentaryType[] geneCommentary;

    public Entrezgene_propertiesType() {
    }

    public Entrezgene_propertiesType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.GeneCommentaryType[] geneCommentary) {
           this.geneCommentary = geneCommentary;
    }


    /**
     * Gets the geneCommentary value for this Entrezgene_propertiesType.
     * 
     * @return geneCommentary
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.GeneCommentaryType[] getGeneCommentary() {
        return geneCommentary;
    }


    /**
     * Sets the geneCommentary value for this Entrezgene_propertiesType.
     * 
     * @param geneCommentary
     */
    public void setGeneCommentary(gov.nih.nlm.ncbi.www.soap.eutils.efetch.GeneCommentaryType[] geneCommentary) {
        this.geneCommentary = geneCommentary;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.GeneCommentaryType getGeneCommentary(int i) {
        return this.geneCommentary[i];
    }

    public void setGeneCommentary(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.GeneCommentaryType _value) {
        this.geneCommentary[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Entrezgene_propertiesType)) return false;
        Entrezgene_propertiesType other = (Entrezgene_propertiesType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.geneCommentary==null && other.getGeneCommentary()==null) || 
             (this.geneCommentary!=null &&
              java.util.Arrays.equals(this.geneCommentary, other.getGeneCommentary())));
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
        if (getGeneCommentary() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGeneCommentary());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGeneCommentary(), i);
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
        new org.apache.axis.description.TypeDesc(Entrezgene_propertiesType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrezgene_propertiesType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("geneCommentary");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Gene-commentary"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Gene-commentaryType"));
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
