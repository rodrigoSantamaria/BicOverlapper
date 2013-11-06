/**
 * Coordinates_densityType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Coordinates_densityType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.DensityCoordinatesType densityCoordinates;

    public Coordinates_densityType() {
    }

    public Coordinates_densityType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.DensityCoordinatesType densityCoordinates) {
           this.densityCoordinates = densityCoordinates;
    }


    /**
     * Gets the densityCoordinates value for this Coordinates_densityType.
     * 
     * @return densityCoordinates
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.DensityCoordinatesType getDensityCoordinates() {
        return densityCoordinates;
    }


    /**
     * Sets the densityCoordinates value for this Coordinates_densityType.
     * 
     * @param densityCoordinates
     */
    public void setDensityCoordinates(gov.nih.nlm.ncbi.www.soap.eutils.efetch.DensityCoordinatesType densityCoordinates) {
        this.densityCoordinates = densityCoordinates;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Coordinates_densityType)) return false;
        Coordinates_densityType other = (Coordinates_densityType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.densityCoordinates==null && other.getDensityCoordinates()==null) || 
             (this.densityCoordinates!=null &&
              this.densityCoordinates.equals(other.getDensityCoordinates())));
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
        if (getDensityCoordinates() != null) {
            _hashCode += getDensityCoordinates().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Coordinates_densityType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Coordinates_densityType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("densityCoordinates");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Density-coordinates"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Density-coordinatesType"));
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
