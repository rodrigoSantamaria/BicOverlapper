/**
 * TaxaSetType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class TaxaSetType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.TaxonType[] taxon;

    public TaxaSetType() {
    }

    public TaxaSetType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.TaxonType[] taxon) {
           this.taxon = taxon;
    }


    /**
     * Gets the taxon value for this TaxaSetType.
     * 
     * @return taxon
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.TaxonType[] getTaxon() {
        return taxon;
    }


    /**
     * Sets the taxon value for this TaxaSetType.
     * 
     * @param taxon
     */
    public void setTaxon(gov.nih.nlm.ncbi.www.soap.eutils.efetch.TaxonType[] taxon) {
        this.taxon = taxon;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.TaxonType getTaxon(int i) {
        return this.taxon[i];
    }

    public void setTaxon(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.TaxonType _value) {
        this.taxon[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TaxaSetType)) return false;
        TaxaSetType other = (TaxaSetType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.taxon==null && other.getTaxon()==null) || 
             (this.taxon!=null &&
              java.util.Arrays.equals(this.taxon, other.getTaxon())));
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
        if (getTaxon() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTaxon());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTaxon(), i);
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
        new org.apache.axis.description.TypeDesc(TaxaSetType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "TaxaSetType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxon");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Taxon"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "TaxonType"));
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
