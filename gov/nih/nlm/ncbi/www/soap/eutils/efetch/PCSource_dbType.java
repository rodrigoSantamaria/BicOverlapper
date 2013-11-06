/**
 * PCSource_dbType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class PCSource_dbType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCDBTrackingType PCDBTracking;

    public PCSource_dbType() {
    }

    public PCSource_dbType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCDBTrackingType PCDBTracking) {
           this.PCDBTracking = PCDBTracking;
    }


    /**
     * Gets the PCDBTracking value for this PCSource_dbType.
     * 
     * @return PCDBTracking
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCDBTrackingType getPCDBTracking() {
        return PCDBTracking;
    }


    /**
     * Sets the PCDBTracking value for this PCSource_dbType.
     * 
     * @param PCDBTracking
     */
    public void setPCDBTracking(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCDBTrackingType PCDBTracking) {
        this.PCDBTracking = PCDBTracking;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PCSource_dbType)) return false;
        PCSource_dbType other = (PCSource_dbType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.PCDBTracking==null && other.getPCDBTracking()==null) || 
             (this.PCDBTracking!=null &&
              this.PCDBTracking.equals(other.getPCDBTracking())));
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
        if (getPCDBTracking() != null) {
            _hashCode += getPCDBTracking().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PCSource_dbType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-Source_dbType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCDBTracking");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-DBTracking"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-DBTrackingType"));
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
