/**
 * Coordinates_atomicType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Coordinates_atomicType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.AtomicCoordinatesType atomicCoordinates;

    public Coordinates_atomicType() {
    }

    public Coordinates_atomicType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.AtomicCoordinatesType atomicCoordinates) {
           this.atomicCoordinates = atomicCoordinates;
    }


    /**
     * Gets the atomicCoordinates value for this Coordinates_atomicType.
     * 
     * @return atomicCoordinates
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.AtomicCoordinatesType getAtomicCoordinates() {
        return atomicCoordinates;
    }


    /**
     * Sets the atomicCoordinates value for this Coordinates_atomicType.
     * 
     * @param atomicCoordinates
     */
    public void setAtomicCoordinates(gov.nih.nlm.ncbi.www.soap.eutils.efetch.AtomicCoordinatesType atomicCoordinates) {
        this.atomicCoordinates = atomicCoordinates;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Coordinates_atomicType)) return false;
        Coordinates_atomicType other = (Coordinates_atomicType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.atomicCoordinates==null && other.getAtomicCoordinates()==null) || 
             (this.atomicCoordinates!=null &&
              this.atomicCoordinates.equals(other.getAtomicCoordinates())));
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
        if (getAtomicCoordinates() != null) {
            _hashCode += getAtomicCoordinates().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Coordinates_atomicType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Coordinates_atomicType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("atomicCoordinates");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Atomic-coordinates"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Atomic-coordinatesType"));
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
