/**
 * PCCoordinates_dataType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class PCCoordinates_dataType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCInfoDataType[] PCInfoData;

    public PCCoordinates_dataType() {
    }

    public PCCoordinates_dataType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCInfoDataType[] PCInfoData) {
           this.PCInfoData = PCInfoData;
    }


    /**
     * Gets the PCInfoData value for this PCCoordinates_dataType.
     * 
     * @return PCInfoData
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCInfoDataType[] getPCInfoData() {
        return PCInfoData;
    }


    /**
     * Sets the PCInfoData value for this PCCoordinates_dataType.
     * 
     * @param PCInfoData
     */
    public void setPCInfoData(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCInfoDataType[] PCInfoData) {
        this.PCInfoData = PCInfoData;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCInfoDataType getPCInfoData(int i) {
        return this.PCInfoData[i];
    }

    public void setPCInfoData(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCInfoDataType _value) {
        this.PCInfoData[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PCCoordinates_dataType)) return false;
        PCCoordinates_dataType other = (PCCoordinates_dataType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.PCInfoData==null && other.getPCInfoData()==null) || 
             (this.PCInfoData!=null &&
              java.util.Arrays.equals(this.PCInfoData, other.getPCInfoData())));
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
        if (getPCInfoData() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPCInfoData());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPCInfoData(), i);
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
        new org.apache.axis.description.TypeDesc(PCCoordinates_dataType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-Coordinates_dataType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCInfoData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-InfoData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-InfoDataType"));
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
