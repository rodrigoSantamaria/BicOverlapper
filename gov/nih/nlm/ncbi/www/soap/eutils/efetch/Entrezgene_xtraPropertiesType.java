/**
 * Entrezgene_xtraPropertiesType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Entrezgene_xtraPropertiesType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.XtraTermsType[] xtraTerms;

    public Entrezgene_xtraPropertiesType() {
    }

    public Entrezgene_xtraPropertiesType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.XtraTermsType[] xtraTerms) {
           this.xtraTerms = xtraTerms;
    }


    /**
     * Gets the xtraTerms value for this Entrezgene_xtraPropertiesType.
     * 
     * @return xtraTerms
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.XtraTermsType[] getXtraTerms() {
        return xtraTerms;
    }


    /**
     * Sets the xtraTerms value for this Entrezgene_xtraPropertiesType.
     * 
     * @param xtraTerms
     */
    public void setXtraTerms(gov.nih.nlm.ncbi.www.soap.eutils.efetch.XtraTermsType[] xtraTerms) {
        this.xtraTerms = xtraTerms;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.XtraTermsType getXtraTerms(int i) {
        return this.xtraTerms[i];
    }

    public void setXtraTerms(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.XtraTermsType _value) {
        this.xtraTerms[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Entrezgene_xtraPropertiesType)) return false;
        Entrezgene_xtraPropertiesType other = (Entrezgene_xtraPropertiesType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.xtraTerms==null && other.getXtraTerms()==null) || 
             (this.xtraTerms!=null &&
              java.util.Arrays.equals(this.xtraTerms, other.getXtraTerms())));
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
        if (getXtraTerms() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getXtraTerms());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getXtraTerms(), i);
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
        new org.apache.axis.description.TypeDesc(Entrezgene_xtraPropertiesType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrezgene_xtra-propertiesType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("xtraTerms");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Xtra-Terms"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Xtra-TermsType"));
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
