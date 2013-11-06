/**
 * E2Request_evalBooleanType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class E2Request_evalBooleanType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2EvalBooleanType entrez2EvalBoolean;

    public E2Request_evalBooleanType() {
    }

    public E2Request_evalBooleanType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2EvalBooleanType entrez2EvalBoolean) {
           this.entrez2EvalBoolean = entrez2EvalBoolean;
    }


    /**
     * Gets the entrez2EvalBoolean value for this E2Request_evalBooleanType.
     * 
     * @return entrez2EvalBoolean
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2EvalBooleanType getEntrez2EvalBoolean() {
        return entrez2EvalBoolean;
    }


    /**
     * Sets the entrez2EvalBoolean value for this E2Request_evalBooleanType.
     * 
     * @param entrez2EvalBoolean
     */
    public void setEntrez2EvalBoolean(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2EvalBooleanType entrez2EvalBoolean) {
        this.entrez2EvalBoolean = entrez2EvalBoolean;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof E2Request_evalBooleanType)) return false;
        E2Request_evalBooleanType other = (E2Request_evalBooleanType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.entrez2EvalBoolean==null && other.getEntrez2EvalBoolean()==null) || 
             (this.entrez2EvalBoolean!=null &&
              this.entrez2EvalBoolean.equals(other.getEntrez2EvalBoolean())));
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
        if (getEntrez2EvalBoolean() != null) {
            _hashCode += getEntrez2EvalBoolean().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(E2Request_evalBooleanType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "E2Request_eval-booleanType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entrez2EvalBoolean");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-eval-boolean"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-eval-booleanType"));
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
