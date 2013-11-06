/**
 * Blast4ProgramInfo_servicesType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Blast4ProgramInfo_servicesType  implements java.io.Serializable {
    private java.lang.String[] blast4ProgramInfo_services_E;

    public Blast4ProgramInfo_servicesType() {
    }

    public Blast4ProgramInfo_servicesType(
           java.lang.String[] blast4ProgramInfo_services_E) {
           this.blast4ProgramInfo_services_E = blast4ProgramInfo_services_E;
    }


    /**
     * Gets the blast4ProgramInfo_services_E value for this Blast4ProgramInfo_servicesType.
     * 
     * @return blast4ProgramInfo_services_E
     */
    public java.lang.String[] getBlast4ProgramInfo_services_E() {
        return blast4ProgramInfo_services_E;
    }


    /**
     * Sets the blast4ProgramInfo_services_E value for this Blast4ProgramInfo_servicesType.
     * 
     * @param blast4ProgramInfo_services_E
     */
    public void setBlast4ProgramInfo_services_E(java.lang.String[] blast4ProgramInfo_services_E) {
        this.blast4ProgramInfo_services_E = blast4ProgramInfo_services_E;
    }

    public java.lang.String getBlast4ProgramInfo_services_E(int i) {
        return this.blast4ProgramInfo_services_E[i];
    }

    public void setBlast4ProgramInfo_services_E(int i, java.lang.String _value) {
        this.blast4ProgramInfo_services_E[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Blast4ProgramInfo_servicesType)) return false;
        Blast4ProgramInfo_servicesType other = (Blast4ProgramInfo_servicesType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.blast4ProgramInfo_services_E==null && other.getBlast4ProgramInfo_services_E()==null) || 
             (this.blast4ProgramInfo_services_E!=null &&
              java.util.Arrays.equals(this.blast4ProgramInfo_services_E, other.getBlast4ProgramInfo_services_E())));
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
        if (getBlast4ProgramInfo_services_E() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBlast4ProgramInfo_services_E());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBlast4ProgramInfo_services_E(), i);
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
        new org.apache.axis.description.TypeDesc(Blast4ProgramInfo_servicesType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-program-info_servicesType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blast4ProgramInfo_services_E");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-program-info_services_E"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-program-info_services_E"));
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
