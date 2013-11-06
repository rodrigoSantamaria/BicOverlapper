/**
 * Cdd_ancestorsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Cdd_ancestorsType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.DomainParentType[] domainParent;

    public Cdd_ancestorsType() {
    }

    public Cdd_ancestorsType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.DomainParentType[] domainParent) {
           this.domainParent = domainParent;
    }


    /**
     * Gets the domainParent value for this Cdd_ancestorsType.
     * 
     * @return domainParent
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.DomainParentType[] getDomainParent() {
        return domainParent;
    }


    /**
     * Sets the domainParent value for this Cdd_ancestorsType.
     * 
     * @param domainParent
     */
    public void setDomainParent(gov.nih.nlm.ncbi.www.soap.eutils.efetch.DomainParentType[] domainParent) {
        this.domainParent = domainParent;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.DomainParentType getDomainParent(int i) {
        return this.domainParent[i];
    }

    public void setDomainParent(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.DomainParentType _value) {
        this.domainParent[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Cdd_ancestorsType)) return false;
        Cdd_ancestorsType other = (Cdd_ancestorsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.domainParent==null && other.getDomainParent()==null) || 
             (this.domainParent!=null &&
              java.util.Arrays.equals(this.domainParent, other.getDomainParent())));
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
        if (getDomainParent() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDomainParent());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDomainParent(), i);
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
        new org.apache.axis.description.TypeDesc(Cdd_ancestorsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdd_ancestorsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("domainParent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Domain-parent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Domain-parentType"));
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
