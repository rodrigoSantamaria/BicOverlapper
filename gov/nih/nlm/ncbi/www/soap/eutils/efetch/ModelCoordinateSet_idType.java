/**
 * ModelCoordinateSet_idType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ModelCoordinateSet_idType  implements java.io.Serializable {
    private java.lang.String modelCoordinateSetId;

    public ModelCoordinateSet_idType() {
    }

    public ModelCoordinateSet_idType(
           java.lang.String modelCoordinateSetId) {
           this.modelCoordinateSetId = modelCoordinateSetId;
    }


    /**
     * Gets the modelCoordinateSetId value for this ModelCoordinateSet_idType.
     * 
     * @return modelCoordinateSetId
     */
    public java.lang.String getModelCoordinateSetId() {
        return modelCoordinateSetId;
    }


    /**
     * Sets the modelCoordinateSetId value for this ModelCoordinateSet_idType.
     * 
     * @param modelCoordinateSetId
     */
    public void setModelCoordinateSetId(java.lang.String modelCoordinateSetId) {
        this.modelCoordinateSetId = modelCoordinateSetId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ModelCoordinateSet_idType)) return false;
        ModelCoordinateSet_idType other = (ModelCoordinateSet_idType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.modelCoordinateSetId==null && other.getModelCoordinateSetId()==null) || 
             (this.modelCoordinateSetId!=null &&
              this.modelCoordinateSetId.equals(other.getModelCoordinateSetId())));
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
        if (getModelCoordinateSetId() != null) {
            _hashCode += getModelCoordinateSetId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ModelCoordinateSet_idType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Model-coordinate-set_idType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modelCoordinateSetId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Model-coordinate-set-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
