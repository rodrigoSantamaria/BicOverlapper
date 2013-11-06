/**
 * MSChargeHandle_calcplusoneType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class MSChargeHandle_calcplusoneType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSCalcPlusOneType MSCalcPlusOne;

    public MSChargeHandle_calcplusoneType() {
    }

    public MSChargeHandle_calcplusoneType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSCalcPlusOneType MSCalcPlusOne) {
           this.MSCalcPlusOne = MSCalcPlusOne;
    }


    /**
     * Gets the MSCalcPlusOne value for this MSChargeHandle_calcplusoneType.
     * 
     * @return MSCalcPlusOne
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSCalcPlusOneType getMSCalcPlusOne() {
        return MSCalcPlusOne;
    }


    /**
     * Sets the MSCalcPlusOne value for this MSChargeHandle_calcplusoneType.
     * 
     * @param MSCalcPlusOne
     */
    public void setMSCalcPlusOne(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSCalcPlusOneType MSCalcPlusOne) {
        this.MSCalcPlusOne = MSCalcPlusOne;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MSChargeHandle_calcplusoneType)) return false;
        MSChargeHandle_calcplusoneType other = (MSChargeHandle_calcplusoneType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.MSCalcPlusOne==null && other.getMSCalcPlusOne()==null) || 
             (this.MSCalcPlusOne!=null &&
              this.MSCalcPlusOne.equals(other.getMSCalcPlusOne())));
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
        if (getMSCalcPlusOne() != null) {
            _hashCode += getMSCalcPlusOne().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MSChargeHandle_calcplusoneType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSChargeHandle_calcplusoneType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSCalcPlusOne");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSCalcPlusOne"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSCalcPlusOneType"));
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
