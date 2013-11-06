/**
 * ModelSpacePoints_xType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ModelSpacePoints_xType  implements java.io.Serializable {
    private java.lang.String[] modelSpacePoints_x_E;

    public ModelSpacePoints_xType() {
    }

    public ModelSpacePoints_xType(
           java.lang.String[] modelSpacePoints_x_E) {
           this.modelSpacePoints_x_E = modelSpacePoints_x_E;
    }


    /**
     * Gets the modelSpacePoints_x_E value for this ModelSpacePoints_xType.
     * 
     * @return modelSpacePoints_x_E
     */
    public java.lang.String[] getModelSpacePoints_x_E() {
        return modelSpacePoints_x_E;
    }


    /**
     * Sets the modelSpacePoints_x_E value for this ModelSpacePoints_xType.
     * 
     * @param modelSpacePoints_x_E
     */
    public void setModelSpacePoints_x_E(java.lang.String[] modelSpacePoints_x_E) {
        this.modelSpacePoints_x_E = modelSpacePoints_x_E;
    }

    public java.lang.String getModelSpacePoints_x_E(int i) {
        return this.modelSpacePoints_x_E[i];
    }

    public void setModelSpacePoints_x_E(int i, java.lang.String _value) {
        this.modelSpacePoints_x_E[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ModelSpacePoints_xType)) return false;
        ModelSpacePoints_xType other = (ModelSpacePoints_xType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.modelSpacePoints_x_E==null && other.getModelSpacePoints_x_E()==null) || 
             (this.modelSpacePoints_x_E!=null &&
              java.util.Arrays.equals(this.modelSpacePoints_x_E, other.getModelSpacePoints_x_E())));
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
        if (getModelSpacePoints_x_E() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getModelSpacePoints_x_E());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getModelSpacePoints_x_E(), i);
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
        new org.apache.axis.description.TypeDesc(ModelSpacePoints_xType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Model-space-points_xType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modelSpacePoints_x_E");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Model-space-points_x_E"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Model-space-points_x_E"));
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
