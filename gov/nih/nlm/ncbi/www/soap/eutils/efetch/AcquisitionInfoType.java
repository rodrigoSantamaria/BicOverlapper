/**
 * AcquisitionInfoType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class AcquisitionInfoType  implements java.io.Serializable {
    private java.lang.String stockNumber;

    private java.lang.String acquisitionSource;

    public AcquisitionInfoType() {
    }

    public AcquisitionInfoType(
           java.lang.String stockNumber,
           java.lang.String acquisitionSource) {
           this.stockNumber = stockNumber;
           this.acquisitionSource = acquisitionSource;
    }


    /**
     * Gets the stockNumber value for this AcquisitionInfoType.
     * 
     * @return stockNumber
     */
    public java.lang.String getStockNumber() {
        return stockNumber;
    }


    /**
     * Sets the stockNumber value for this AcquisitionInfoType.
     * 
     * @param stockNumber
     */
    public void setStockNumber(java.lang.String stockNumber) {
        this.stockNumber = stockNumber;
    }


    /**
     * Gets the acquisitionSource value for this AcquisitionInfoType.
     * 
     * @return acquisitionSource
     */
    public java.lang.String getAcquisitionSource() {
        return acquisitionSource;
    }


    /**
     * Sets the acquisitionSource value for this AcquisitionInfoType.
     * 
     * @param acquisitionSource
     */
    public void setAcquisitionSource(java.lang.String acquisitionSource) {
        this.acquisitionSource = acquisitionSource;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AcquisitionInfoType)) return false;
        AcquisitionInfoType other = (AcquisitionInfoType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.stockNumber==null && other.getStockNumber()==null) || 
             (this.stockNumber!=null &&
              this.stockNumber.equals(other.getStockNumber()))) &&
            ((this.acquisitionSource==null && other.getAcquisitionSource()==null) || 
             (this.acquisitionSource!=null &&
              this.acquisitionSource.equals(other.getAcquisitionSource())));
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
        if (getStockNumber() != null) {
            _hashCode += getStockNumber().hashCode();
        }
        if (getAcquisitionSource() != null) {
            _hashCode += getAcquisitionSource().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AcquisitionInfoType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "AcquisitionInfoType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stockNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "StockNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acquisitionSource");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "AcquisitionSource"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
