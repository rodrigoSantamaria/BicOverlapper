/**
 * ModelSpacePointType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ModelSpacePointType  implements java.io.Serializable {
    private java.lang.String modelSpacePoint_scaleFactor;

    private java.lang.String modelSpacePoint_x;

    private java.lang.String modelSpacePoint_y;

    private java.lang.String modelSpacePoint_z;

    public ModelSpacePointType() {
    }

    public ModelSpacePointType(
           java.lang.String modelSpacePoint_scaleFactor,
           java.lang.String modelSpacePoint_x,
           java.lang.String modelSpacePoint_y,
           java.lang.String modelSpacePoint_z) {
           this.modelSpacePoint_scaleFactor = modelSpacePoint_scaleFactor;
           this.modelSpacePoint_x = modelSpacePoint_x;
           this.modelSpacePoint_y = modelSpacePoint_y;
           this.modelSpacePoint_z = modelSpacePoint_z;
    }


    /**
     * Gets the modelSpacePoint_scaleFactor value for this ModelSpacePointType.
     * 
     * @return modelSpacePoint_scaleFactor
     */
    public java.lang.String getModelSpacePoint_scaleFactor() {
        return modelSpacePoint_scaleFactor;
    }


    /**
     * Sets the modelSpacePoint_scaleFactor value for this ModelSpacePointType.
     * 
     * @param modelSpacePoint_scaleFactor
     */
    public void setModelSpacePoint_scaleFactor(java.lang.String modelSpacePoint_scaleFactor) {
        this.modelSpacePoint_scaleFactor = modelSpacePoint_scaleFactor;
    }


    /**
     * Gets the modelSpacePoint_x value for this ModelSpacePointType.
     * 
     * @return modelSpacePoint_x
     */
    public java.lang.String getModelSpacePoint_x() {
        return modelSpacePoint_x;
    }


    /**
     * Sets the modelSpacePoint_x value for this ModelSpacePointType.
     * 
     * @param modelSpacePoint_x
     */
    public void setModelSpacePoint_x(java.lang.String modelSpacePoint_x) {
        this.modelSpacePoint_x = modelSpacePoint_x;
    }


    /**
     * Gets the modelSpacePoint_y value for this ModelSpacePointType.
     * 
     * @return modelSpacePoint_y
     */
    public java.lang.String getModelSpacePoint_y() {
        return modelSpacePoint_y;
    }


    /**
     * Sets the modelSpacePoint_y value for this ModelSpacePointType.
     * 
     * @param modelSpacePoint_y
     */
    public void setModelSpacePoint_y(java.lang.String modelSpacePoint_y) {
        this.modelSpacePoint_y = modelSpacePoint_y;
    }


    /**
     * Gets the modelSpacePoint_z value for this ModelSpacePointType.
     * 
     * @return modelSpacePoint_z
     */
    public java.lang.String getModelSpacePoint_z() {
        return modelSpacePoint_z;
    }


    /**
     * Sets the modelSpacePoint_z value for this ModelSpacePointType.
     * 
     * @param modelSpacePoint_z
     */
    public void setModelSpacePoint_z(java.lang.String modelSpacePoint_z) {
        this.modelSpacePoint_z = modelSpacePoint_z;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ModelSpacePointType)) return false;
        ModelSpacePointType other = (ModelSpacePointType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.modelSpacePoint_scaleFactor==null && other.getModelSpacePoint_scaleFactor()==null) || 
             (this.modelSpacePoint_scaleFactor!=null &&
              this.modelSpacePoint_scaleFactor.equals(other.getModelSpacePoint_scaleFactor()))) &&
            ((this.modelSpacePoint_x==null && other.getModelSpacePoint_x()==null) || 
             (this.modelSpacePoint_x!=null &&
              this.modelSpacePoint_x.equals(other.getModelSpacePoint_x()))) &&
            ((this.modelSpacePoint_y==null && other.getModelSpacePoint_y()==null) || 
             (this.modelSpacePoint_y!=null &&
              this.modelSpacePoint_y.equals(other.getModelSpacePoint_y()))) &&
            ((this.modelSpacePoint_z==null && other.getModelSpacePoint_z()==null) || 
             (this.modelSpacePoint_z!=null &&
              this.modelSpacePoint_z.equals(other.getModelSpacePoint_z())));
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
        if (getModelSpacePoint_scaleFactor() != null) {
            _hashCode += getModelSpacePoint_scaleFactor().hashCode();
        }
        if (getModelSpacePoint_x() != null) {
            _hashCode += getModelSpacePoint_x().hashCode();
        }
        if (getModelSpacePoint_y() != null) {
            _hashCode += getModelSpacePoint_y().hashCode();
        }
        if (getModelSpacePoint_z() != null) {
            _hashCode += getModelSpacePoint_z().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ModelSpacePointType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Model-space-pointType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modelSpacePoint_scaleFactor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Model-space-point_scale-factor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modelSpacePoint_x");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Model-space-point_x"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modelSpacePoint_y");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Model-space-point_y"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modelSpacePoint_z");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Model-space-point_z"));
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
