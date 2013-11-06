/**
 * Entrez2BooleanElement_termType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Entrez2BooleanElement_termType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2BooleanTermType entrez2BooleanTerm;

    public Entrez2BooleanElement_termType() {
    }

    public Entrez2BooleanElement_termType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2BooleanTermType entrez2BooleanTerm) {
           this.entrez2BooleanTerm = entrez2BooleanTerm;
    }


    /**
     * Gets the entrez2BooleanTerm value for this Entrez2BooleanElement_termType.
     * 
     * @return entrez2BooleanTerm
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2BooleanTermType getEntrez2BooleanTerm() {
        return entrez2BooleanTerm;
    }


    /**
     * Sets the entrez2BooleanTerm value for this Entrez2BooleanElement_termType.
     * 
     * @param entrez2BooleanTerm
     */
    public void setEntrez2BooleanTerm(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2BooleanTermType entrez2BooleanTerm) {
        this.entrez2BooleanTerm = entrez2BooleanTerm;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Entrez2BooleanElement_termType)) return false;
        Entrez2BooleanElement_termType other = (Entrez2BooleanElement_termType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.entrez2BooleanTerm==null && other.getEntrez2BooleanTerm()==null) || 
             (this.entrez2BooleanTerm!=null &&
              this.entrez2BooleanTerm.equals(other.getEntrez2BooleanTerm())));
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
        if (getEntrez2BooleanTerm() != null) {
            _hashCode += getEntrez2BooleanTerm().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Entrez2BooleanElement_termType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-boolean-element_termType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entrez2BooleanTerm");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-boolean-term"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-boolean-termType"));
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
