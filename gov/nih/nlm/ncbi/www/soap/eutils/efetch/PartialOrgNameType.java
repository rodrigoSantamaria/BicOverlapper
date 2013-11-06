/**
 * PartialOrgNameType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class PartialOrgNameType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.TaxElementType[] taxElement;

    public PartialOrgNameType() {
    }

    public PartialOrgNameType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.TaxElementType[] taxElement) {
           this.taxElement = taxElement;
    }


    /**
     * Gets the taxElement value for this PartialOrgNameType.
     * 
     * @return taxElement
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.TaxElementType[] getTaxElement() {
        return taxElement;
    }


    /**
     * Sets the taxElement value for this PartialOrgNameType.
     * 
     * @param taxElement
     */
    public void setTaxElement(gov.nih.nlm.ncbi.www.soap.eutils.efetch.TaxElementType[] taxElement) {
        this.taxElement = taxElement;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.TaxElementType getTaxElement(int i) {
        return this.taxElement[i];
    }

    public void setTaxElement(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.TaxElementType _value) {
        this.taxElement[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PartialOrgNameType)) return false;
        PartialOrgNameType other = (PartialOrgNameType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.taxElement==null && other.getTaxElement()==null) || 
             (this.taxElement!=null &&
              java.util.Arrays.equals(this.taxElement, other.getTaxElement())));
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
        if (getTaxElement() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTaxElement());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTaxElement(), i);
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
        new org.apache.axis.description.TypeDesc(PartialOrgNameType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PartialOrgNameType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxElement");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "TaxElement"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "TaxElementType"));
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
