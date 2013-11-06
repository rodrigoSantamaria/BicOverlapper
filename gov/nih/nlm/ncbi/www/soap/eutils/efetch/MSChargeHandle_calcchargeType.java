/**
 * MSChargeHandle_calcchargeType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class MSChargeHandle_calcchargeType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSCalcChargeType MSCalcCharge;

    public MSChargeHandle_calcchargeType() {
    }

    public MSChargeHandle_calcchargeType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSCalcChargeType MSCalcCharge) {
           this.MSCalcCharge = MSCalcCharge;
    }


    /**
     * Gets the MSCalcCharge value for this MSChargeHandle_calcchargeType.
     * 
     * @return MSCalcCharge
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSCalcChargeType getMSCalcCharge() {
        return MSCalcCharge;
    }


    /**
     * Sets the MSCalcCharge value for this MSChargeHandle_calcchargeType.
     * 
     * @param MSCalcCharge
     */
    public void setMSCalcCharge(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSCalcChargeType MSCalcCharge) {
        this.MSCalcCharge = MSCalcCharge;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MSChargeHandle_calcchargeType)) return false;
        MSChargeHandle_calcchargeType other = (MSChargeHandle_calcchargeType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.MSCalcCharge==null && other.getMSCalcCharge()==null) || 
             (this.MSCalcCharge!=null &&
              this.MSCalcCharge.equals(other.getMSCalcCharge())));
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
        if (getMSCalcCharge() != null) {
            _hashCode += getMSCalcCharge().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MSChargeHandle_calcchargeType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSChargeHandle_calcchargeType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSCalcCharge");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSCalcCharge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSCalcChargeType"));
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
