/**
 * PCAssayDescription_xrefType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class PCAssayDescription_xrefType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCAnnotatedXRefType[] PCAnnotatedXRef;

    public PCAssayDescription_xrefType() {
    }

    public PCAssayDescription_xrefType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCAnnotatedXRefType[] PCAnnotatedXRef) {
           this.PCAnnotatedXRef = PCAnnotatedXRef;
    }


    /**
     * Gets the PCAnnotatedXRef value for this PCAssayDescription_xrefType.
     * 
     * @return PCAnnotatedXRef
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCAnnotatedXRefType[] getPCAnnotatedXRef() {
        return PCAnnotatedXRef;
    }


    /**
     * Sets the PCAnnotatedXRef value for this PCAssayDescription_xrefType.
     * 
     * @param PCAnnotatedXRef
     */
    public void setPCAnnotatedXRef(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCAnnotatedXRefType[] PCAnnotatedXRef) {
        this.PCAnnotatedXRef = PCAnnotatedXRef;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCAnnotatedXRefType getPCAnnotatedXRef(int i) {
        return this.PCAnnotatedXRef[i];
    }

    public void setPCAnnotatedXRef(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCAnnotatedXRefType _value) {
        this.PCAnnotatedXRef[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PCAssayDescription_xrefType)) return false;
        PCAssayDescription_xrefType other = (PCAssayDescription_xrefType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.PCAnnotatedXRef==null && other.getPCAnnotatedXRef()==null) || 
             (this.PCAnnotatedXRef!=null &&
              java.util.Arrays.equals(this.PCAnnotatedXRef, other.getPCAnnotatedXRef())));
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
        if (getPCAnnotatedXRef() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPCAnnotatedXRef());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPCAnnotatedXRef(), i);
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
        new org.apache.axis.description.TypeDesc(PCAssayDescription_xrefType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-AssayDescription_xrefType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCAnnotatedXRef");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-AnnotatedXRef"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-AnnotatedXRefType"));
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
