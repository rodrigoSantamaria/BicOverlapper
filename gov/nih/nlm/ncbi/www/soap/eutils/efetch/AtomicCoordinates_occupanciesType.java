/**
 * AtomicCoordinates_occupanciesType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class AtomicCoordinates_occupanciesType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.AtomicOccupanciesType atomicOccupancies;

    public AtomicCoordinates_occupanciesType() {
    }

    public AtomicCoordinates_occupanciesType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.AtomicOccupanciesType atomicOccupancies) {
           this.atomicOccupancies = atomicOccupancies;
    }


    /**
     * Gets the atomicOccupancies value for this AtomicCoordinates_occupanciesType.
     * 
     * @return atomicOccupancies
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.AtomicOccupanciesType getAtomicOccupancies() {
        return atomicOccupancies;
    }


    /**
     * Sets the atomicOccupancies value for this AtomicCoordinates_occupanciesType.
     * 
     * @param atomicOccupancies
     */
    public void setAtomicOccupancies(gov.nih.nlm.ncbi.www.soap.eutils.efetch.AtomicOccupanciesType atomicOccupancies) {
        this.atomicOccupancies = atomicOccupancies;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AtomicCoordinates_occupanciesType)) return false;
        AtomicCoordinates_occupanciesType other = (AtomicCoordinates_occupanciesType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.atomicOccupancies==null && other.getAtomicOccupancies()==null) || 
             (this.atomicOccupancies!=null &&
              this.atomicOccupancies.equals(other.getAtomicOccupancies())));
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
        if (getAtomicOccupancies() != null) {
            _hashCode += getAtomicOccupancies().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AtomicCoordinates_occupanciesType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Atomic-coordinates_occupanciesType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("atomicOccupancies");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Atomic-occupancies"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Atomic-occupanciesType"));
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
