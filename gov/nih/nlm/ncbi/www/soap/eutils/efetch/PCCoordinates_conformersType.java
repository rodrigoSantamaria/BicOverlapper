/**
 * PCCoordinates_conformersType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class PCCoordinates_conformersType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCConformerType[] PCConformer;

    public PCCoordinates_conformersType() {
    }

    public PCCoordinates_conformersType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCConformerType[] PCConformer) {
           this.PCConformer = PCConformer;
    }


    /**
     * Gets the PCConformer value for this PCCoordinates_conformersType.
     * 
     * @return PCConformer
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCConformerType[] getPCConformer() {
        return PCConformer;
    }


    /**
     * Sets the PCConformer value for this PCCoordinates_conformersType.
     * 
     * @param PCConformer
     */
    public void setPCConformer(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCConformerType[] PCConformer) {
        this.PCConformer = PCConformer;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCConformerType getPCConformer(int i) {
        return this.PCConformer[i];
    }

    public void setPCConformer(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCConformerType _value) {
        this.PCConformer[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PCCoordinates_conformersType)) return false;
        PCCoordinates_conformersType other = (PCCoordinates_conformersType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.PCConformer==null && other.getPCConformer()==null) || 
             (this.PCConformer!=null &&
              java.util.Arrays.equals(this.PCConformer, other.getPCConformer())));
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
        if (getPCConformer() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPCConformer());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPCConformer(), i);
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
        new org.apache.axis.description.TypeDesc(PCCoordinates_conformersType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-Coordinates_conformersType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCConformer");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-Conformer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-ConformerType"));
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
