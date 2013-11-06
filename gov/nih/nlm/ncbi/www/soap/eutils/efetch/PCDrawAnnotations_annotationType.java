/**
 * PCDrawAnnotations_annotationType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class PCDrawAnnotations_annotationType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCBondAnnotationType[] PCBondAnnotation;

    public PCDrawAnnotations_annotationType() {
    }

    public PCDrawAnnotations_annotationType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCBondAnnotationType[] PCBondAnnotation) {
           this.PCBondAnnotation = PCBondAnnotation;
    }


    /**
     * Gets the PCBondAnnotation value for this PCDrawAnnotations_annotationType.
     * 
     * @return PCBondAnnotation
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCBondAnnotationType[] getPCBondAnnotation() {
        return PCBondAnnotation;
    }


    /**
     * Sets the PCBondAnnotation value for this PCDrawAnnotations_annotationType.
     * 
     * @param PCBondAnnotation
     */
    public void setPCBondAnnotation(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCBondAnnotationType[] PCBondAnnotation) {
        this.PCBondAnnotation = PCBondAnnotation;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCBondAnnotationType getPCBondAnnotation(int i) {
        return this.PCBondAnnotation[i];
    }

    public void setPCBondAnnotation(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCBondAnnotationType _value) {
        this.PCBondAnnotation[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PCDrawAnnotations_annotationType)) return false;
        PCDrawAnnotations_annotationType other = (PCDrawAnnotations_annotationType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.PCBondAnnotation==null && other.getPCBondAnnotation()==null) || 
             (this.PCBondAnnotation!=null &&
              java.util.Arrays.equals(this.PCBondAnnotation, other.getPCBondAnnotation())));
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
        if (getPCBondAnnotation() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPCBondAnnotation());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPCBondAnnotation(), i);
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
        new org.apache.axis.description.TypeDesc(PCDrawAnnotations_annotationType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-DrawAnnotations_annotationType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCBondAnnotation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-BondAnnotation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-BondAnnotationType"));
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
