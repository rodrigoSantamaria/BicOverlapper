/**
 * AtomicOccupanciesType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class AtomicOccupanciesType  implements java.io.Serializable {
    private java.lang.String atomicOccupancies_scaleFactor;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.AtomicOccupancies_oType atomicOccupancies_o;

    public AtomicOccupanciesType() {
    }

    public AtomicOccupanciesType(
           java.lang.String atomicOccupancies_scaleFactor,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.AtomicOccupancies_oType atomicOccupancies_o) {
           this.atomicOccupancies_scaleFactor = atomicOccupancies_scaleFactor;
           this.atomicOccupancies_o = atomicOccupancies_o;
    }


    /**
     * Gets the atomicOccupancies_scaleFactor value for this AtomicOccupanciesType.
     * 
     * @return atomicOccupancies_scaleFactor
     */
    public java.lang.String getAtomicOccupancies_scaleFactor() {
        return atomicOccupancies_scaleFactor;
    }


    /**
     * Sets the atomicOccupancies_scaleFactor value for this AtomicOccupanciesType.
     * 
     * @param atomicOccupancies_scaleFactor
     */
    public void setAtomicOccupancies_scaleFactor(java.lang.String atomicOccupancies_scaleFactor) {
        this.atomicOccupancies_scaleFactor = atomicOccupancies_scaleFactor;
    }


    /**
     * Gets the atomicOccupancies_o value for this AtomicOccupanciesType.
     * 
     * @return atomicOccupancies_o
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.AtomicOccupancies_oType getAtomicOccupancies_o() {
        return atomicOccupancies_o;
    }


    /**
     * Sets the atomicOccupancies_o value for this AtomicOccupanciesType.
     * 
     * @param atomicOccupancies_o
     */
    public void setAtomicOccupancies_o(gov.nih.nlm.ncbi.www.soap.eutils.efetch.AtomicOccupancies_oType atomicOccupancies_o) {
        this.atomicOccupancies_o = atomicOccupancies_o;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AtomicOccupanciesType)) return false;
        AtomicOccupanciesType other = (AtomicOccupanciesType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.atomicOccupancies_scaleFactor==null && other.getAtomicOccupancies_scaleFactor()==null) || 
             (this.atomicOccupancies_scaleFactor!=null &&
              this.atomicOccupancies_scaleFactor.equals(other.getAtomicOccupancies_scaleFactor()))) &&
            ((this.atomicOccupancies_o==null && other.getAtomicOccupancies_o()==null) || 
             (this.atomicOccupancies_o!=null &&
              this.atomicOccupancies_o.equals(other.getAtomicOccupancies_o())));
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
        if (getAtomicOccupancies_scaleFactor() != null) {
            _hashCode += getAtomicOccupancies_scaleFactor().hashCode();
        }
        if (getAtomicOccupancies_o() != null) {
            _hashCode += getAtomicOccupancies_o().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AtomicOccupanciesType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Atomic-occupanciesType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("atomicOccupancies_scaleFactor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Atomic-occupancies_scale-factor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("atomicOccupancies_o");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Atomic-occupancies_o"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Atomic-occupancies_oType"));
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
