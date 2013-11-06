/**
 * Entrez2BooleanExp_expType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Entrez2BooleanExp_expType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2BooleanElementType[] entrez2BooleanElement;

    public Entrez2BooleanExp_expType() {
    }

    public Entrez2BooleanExp_expType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2BooleanElementType[] entrez2BooleanElement) {
           this.entrez2BooleanElement = entrez2BooleanElement;
    }


    /**
     * Gets the entrez2BooleanElement value for this Entrez2BooleanExp_expType.
     * 
     * @return entrez2BooleanElement
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2BooleanElementType[] getEntrez2BooleanElement() {
        return entrez2BooleanElement;
    }


    /**
     * Sets the entrez2BooleanElement value for this Entrez2BooleanExp_expType.
     * 
     * @param entrez2BooleanElement
     */
    public void setEntrez2BooleanElement(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2BooleanElementType[] entrez2BooleanElement) {
        this.entrez2BooleanElement = entrez2BooleanElement;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2BooleanElementType getEntrez2BooleanElement(int i) {
        return this.entrez2BooleanElement[i];
    }

    public void setEntrez2BooleanElement(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2BooleanElementType _value) {
        this.entrez2BooleanElement[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Entrez2BooleanExp_expType)) return false;
        Entrez2BooleanExp_expType other = (Entrez2BooleanExp_expType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.entrez2BooleanElement==null && other.getEntrez2BooleanElement()==null) || 
             (this.entrez2BooleanElement!=null &&
              java.util.Arrays.equals(this.entrez2BooleanElement, other.getEntrez2BooleanElement())));
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
        if (getEntrez2BooleanElement() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEntrez2BooleanElement());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEntrez2BooleanElement(), i);
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
        new org.apache.axis.description.TypeDesc(Entrez2BooleanExp_expType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-boolean-exp_expType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entrez2BooleanElement");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-boolean-element"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-boolean-elementType"));
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
