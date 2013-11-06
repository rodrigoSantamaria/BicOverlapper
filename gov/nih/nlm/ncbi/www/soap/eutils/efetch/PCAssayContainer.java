/**
 * PCAssayContainer.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class PCAssayContainer  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCAssaySubmitType[] PCAssaySubmit;

    public PCAssayContainer() {
    }

    public PCAssayContainer(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCAssaySubmitType[] PCAssaySubmit) {
           this.PCAssaySubmit = PCAssaySubmit;
    }


    /**
     * Gets the PCAssaySubmit value for this PCAssayContainer.
     * 
     * @return PCAssaySubmit
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCAssaySubmitType[] getPCAssaySubmit() {
        return PCAssaySubmit;
    }


    /**
     * Sets the PCAssaySubmit value for this PCAssayContainer.
     * 
     * @param PCAssaySubmit
     */
    public void setPCAssaySubmit(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCAssaySubmitType[] PCAssaySubmit) {
        this.PCAssaySubmit = PCAssaySubmit;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCAssaySubmitType getPCAssaySubmit(int i) {
        return this.PCAssaySubmit[i];
    }

    public void setPCAssaySubmit(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCAssaySubmitType _value) {
        this.PCAssaySubmit[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PCAssayContainer)) return false;
        PCAssayContainer other = (PCAssayContainer) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.PCAssaySubmit==null && other.getPCAssaySubmit()==null) || 
             (this.PCAssaySubmit!=null &&
              java.util.Arrays.equals(this.PCAssaySubmit, other.getPCAssaySubmit())));
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
        if (getPCAssaySubmit() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPCAssaySubmit());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPCAssaySubmit(), i);
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
        new org.apache.axis.description.TypeDesc(PCAssayContainer.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">PC-AssayContainer"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCAssaySubmit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-AssaySubmit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-AssaySubmitType"));
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
