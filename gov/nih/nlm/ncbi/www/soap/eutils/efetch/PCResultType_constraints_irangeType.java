/**
 * PCResultType_constraints_irangeType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class PCResultType_constraints_irangeType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCIntegerMinMaxType PCIntegerMinMax;

    public PCResultType_constraints_irangeType() {
    }

    public PCResultType_constraints_irangeType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCIntegerMinMaxType PCIntegerMinMax) {
           this.PCIntegerMinMax = PCIntegerMinMax;
    }


    /**
     * Gets the PCIntegerMinMax value for this PCResultType_constraints_irangeType.
     * 
     * @return PCIntegerMinMax
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCIntegerMinMaxType getPCIntegerMinMax() {
        return PCIntegerMinMax;
    }


    /**
     * Sets the PCIntegerMinMax value for this PCResultType_constraints_irangeType.
     * 
     * @param PCIntegerMinMax
     */
    public void setPCIntegerMinMax(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCIntegerMinMaxType PCIntegerMinMax) {
        this.PCIntegerMinMax = PCIntegerMinMax;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PCResultType_constraints_irangeType)) return false;
        PCResultType_constraints_irangeType other = (PCResultType_constraints_irangeType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.PCIntegerMinMax==null && other.getPCIntegerMinMax()==null) || 
             (this.PCIntegerMinMax!=null &&
              this.PCIntegerMinMax.equals(other.getPCIntegerMinMax())));
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
        if (getPCIntegerMinMax() != null) {
            _hashCode += getPCIntegerMinMax().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PCResultType_constraints_irangeType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-ResultType_constraints_irangeType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCIntegerMinMax");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-IntegerMinMax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-IntegerMinMaxType"));
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
