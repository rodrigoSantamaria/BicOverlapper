/**
 * PCResultType_constraints_frangeType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class PCResultType_constraints_frangeType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCRealMinMaxType PCRealMinMax;

    public PCResultType_constraints_frangeType() {
    }

    public PCResultType_constraints_frangeType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCRealMinMaxType PCRealMinMax) {
           this.PCRealMinMax = PCRealMinMax;
    }


    /**
     * Gets the PCRealMinMax value for this PCResultType_constraints_frangeType.
     * 
     * @return PCRealMinMax
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCRealMinMaxType getPCRealMinMax() {
        return PCRealMinMax;
    }


    /**
     * Sets the PCRealMinMax value for this PCResultType_constraints_frangeType.
     * 
     * @param PCRealMinMax
     */
    public void setPCRealMinMax(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCRealMinMaxType PCRealMinMax) {
        this.PCRealMinMax = PCRealMinMax;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PCResultType_constraints_frangeType)) return false;
        PCResultType_constraints_frangeType other = (PCResultType_constraints_frangeType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.PCRealMinMax==null && other.getPCRealMinMax()==null) || 
             (this.PCRealMinMax!=null &&
              this.PCRealMinMax.equals(other.getPCRealMinMax())));
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
        if (getPCRealMinMax() != null) {
            _hashCode += getPCRealMinMax().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PCResultType_constraints_frangeType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-ResultType_constraints_frangeType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCRealMinMax");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-RealMinMax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-RealMinMaxType"));
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
