/**
 * MapsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class MapsType  implements java.io.Serializable {
    private java.lang.String maps_displayStr;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Maps_methodType maps_method;

    public MapsType() {
    }

    public MapsType(
           java.lang.String maps_displayStr,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Maps_methodType maps_method) {
           this.maps_displayStr = maps_displayStr;
           this.maps_method = maps_method;
    }


    /**
     * Gets the maps_displayStr value for this MapsType.
     * 
     * @return maps_displayStr
     */
    public java.lang.String getMaps_displayStr() {
        return maps_displayStr;
    }


    /**
     * Sets the maps_displayStr value for this MapsType.
     * 
     * @param maps_displayStr
     */
    public void setMaps_displayStr(java.lang.String maps_displayStr) {
        this.maps_displayStr = maps_displayStr;
    }


    /**
     * Gets the maps_method value for this MapsType.
     * 
     * @return maps_method
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Maps_methodType getMaps_method() {
        return maps_method;
    }


    /**
     * Sets the maps_method value for this MapsType.
     * 
     * @param maps_method
     */
    public void setMaps_method(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Maps_methodType maps_method) {
        this.maps_method = maps_method;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MapsType)) return false;
        MapsType other = (MapsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.maps_displayStr==null && other.getMaps_displayStr()==null) || 
             (this.maps_displayStr!=null &&
              this.maps_displayStr.equals(other.getMaps_displayStr()))) &&
            ((this.maps_method==null && other.getMaps_method()==null) || 
             (this.maps_method!=null &&
              this.maps_method.equals(other.getMaps_method())));
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
        if (getMaps_displayStr() != null) {
            _hashCode += getMaps_displayStr().hashCode();
        }
        if (getMaps_method() != null) {
            _hashCode += getMaps_method().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MapsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MapsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maps_displayStr");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Maps_display-str"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maps_method");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Maps_method"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Maps_methodType"));
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
