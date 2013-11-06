/**
 * Entrez2BooleanElement_opType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Entrez2BooleanElement_opType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2OperatorType entrez2Operator;

    public Entrez2BooleanElement_opType() {
    }

    public Entrez2BooleanElement_opType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2OperatorType entrez2Operator) {
           this.entrez2Operator = entrez2Operator;
    }


    /**
     * Gets the entrez2Operator value for this Entrez2BooleanElement_opType.
     * 
     * @return entrez2Operator
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2OperatorType getEntrez2Operator() {
        return entrez2Operator;
    }


    /**
     * Sets the entrez2Operator value for this Entrez2BooleanElement_opType.
     * 
     * @param entrez2Operator
     */
    public void setEntrez2Operator(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2OperatorType entrez2Operator) {
        this.entrez2Operator = entrez2Operator;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Entrez2BooleanElement_opType)) return false;
        Entrez2BooleanElement_opType other = (Entrez2BooleanElement_opType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.entrez2Operator==null && other.getEntrez2Operator()==null) || 
             (this.entrez2Operator!=null &&
              this.entrez2Operator.equals(other.getEntrez2Operator())));
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
        if (getEntrez2Operator() != null) {
            _hashCode += getEntrez2Operator().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Entrez2BooleanElement_opType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-boolean-element_opType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entrez2Operator");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-operator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-operatorType"));
        elemField.setNillable(false);
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
