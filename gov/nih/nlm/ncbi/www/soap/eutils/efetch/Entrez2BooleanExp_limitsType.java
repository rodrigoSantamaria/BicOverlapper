/**
 * Entrez2BooleanExp_limitsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Entrez2BooleanExp_limitsType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2LimitsType entrez2Limits;

    public Entrez2BooleanExp_limitsType() {
    }

    public Entrez2BooleanExp_limitsType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2LimitsType entrez2Limits) {
           this.entrez2Limits = entrez2Limits;
    }


    /**
     * Gets the entrez2Limits value for this Entrez2BooleanExp_limitsType.
     * 
     * @return entrez2Limits
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2LimitsType getEntrez2Limits() {
        return entrez2Limits;
    }


    /**
     * Sets the entrez2Limits value for this Entrez2BooleanExp_limitsType.
     * 
     * @param entrez2Limits
     */
    public void setEntrez2Limits(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2LimitsType entrez2Limits) {
        this.entrez2Limits = entrez2Limits;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Entrez2BooleanExp_limitsType)) return false;
        Entrez2BooleanExp_limitsType other = (Entrez2BooleanExp_limitsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.entrez2Limits==null && other.getEntrez2Limits()==null) || 
             (this.entrez2Limits!=null &&
              this.entrez2Limits.equals(other.getEntrez2Limits())));
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
        if (getEntrez2Limits() != null) {
            _hashCode += getEntrez2Limits().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Entrez2BooleanExp_limitsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-boolean-exp_limitsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entrez2Limits");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-limits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-limitsType"));
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
