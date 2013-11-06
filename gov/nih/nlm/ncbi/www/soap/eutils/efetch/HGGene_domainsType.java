/**
 * HGGene_domainsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class HGGene_domainsType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.HGDomainType[] HGDomain;

    public HGGene_domainsType() {
    }

    public HGGene_domainsType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.HGDomainType[] HGDomain) {
           this.HGDomain = HGDomain;
    }


    /**
     * Gets the HGDomain value for this HGGene_domainsType.
     * 
     * @return HGDomain
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.HGDomainType[] getHGDomain() {
        return HGDomain;
    }


    /**
     * Sets the HGDomain value for this HGGene_domainsType.
     * 
     * @param HGDomain
     */
    public void setHGDomain(gov.nih.nlm.ncbi.www.soap.eutils.efetch.HGDomainType[] HGDomain) {
        this.HGDomain = HGDomain;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.HGDomainType getHGDomain(int i) {
        return this.HGDomain[i];
    }

    public void setHGDomain(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.HGDomainType _value) {
        this.HGDomain[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HGGene_domainsType)) return false;
        HGGene_domainsType other = (HGGene_domainsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.HGDomain==null && other.getHGDomain()==null) || 
             (this.HGDomain!=null &&
              java.util.Arrays.equals(this.HGDomain, other.getHGDomain())));
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
        if (getHGDomain() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHGDomain());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHGDomain(), i);
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
        new org.apache.axis.description.TypeDesc(HGGene_domainsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "HG-Gene_domainsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("HGDomain");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "HG-Domain"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "HG-DomainType"));
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
