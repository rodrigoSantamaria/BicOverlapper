/**
 * ChemGraphAlignment_transformType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ChemGraphAlignment_transformType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.TransformType[] transform;

    public ChemGraphAlignment_transformType() {
    }

    public ChemGraphAlignment_transformType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.TransformType[] transform) {
           this.transform = transform;
    }


    /**
     * Gets the transform value for this ChemGraphAlignment_transformType.
     * 
     * @return transform
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.TransformType[] getTransform() {
        return transform;
    }


    /**
     * Sets the transform value for this ChemGraphAlignment_transformType.
     * 
     * @param transform
     */
    public void setTransform(gov.nih.nlm.ncbi.www.soap.eutils.efetch.TransformType[] transform) {
        this.transform = transform;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.TransformType getTransform(int i) {
        return this.transform[i];
    }

    public void setTransform(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.TransformType _value) {
        this.transform[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChemGraphAlignment_transformType)) return false;
        ChemGraphAlignment_transformType other = (ChemGraphAlignment_transformType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.transform==null && other.getTransform()==null) || 
             (this.transform!=null &&
              java.util.Arrays.equals(this.transform, other.getTransform())));
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
        if (getTransform() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTransform());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTransform(), i);
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
        new org.apache.axis.description.TypeDesc(ChemGraphAlignment_transformType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Chem-graph-alignment_transformType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transform");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Transform"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "TransformType"));
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
