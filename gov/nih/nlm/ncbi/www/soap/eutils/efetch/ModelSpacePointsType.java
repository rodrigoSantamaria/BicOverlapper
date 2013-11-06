/**
 * ModelSpacePointsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ModelSpacePointsType  implements java.io.Serializable {
    private java.lang.String modelSpacePoints_scaleFactor;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ModelSpacePoints_xType modelSpacePoints_x;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ModelSpacePoints_yType modelSpacePoints_y;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ModelSpacePoints_zType modelSpacePoints_z;

    public ModelSpacePointsType() {
    }

    public ModelSpacePointsType(
           java.lang.String modelSpacePoints_scaleFactor,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ModelSpacePoints_xType modelSpacePoints_x,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ModelSpacePoints_yType modelSpacePoints_y,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ModelSpacePoints_zType modelSpacePoints_z) {
           this.modelSpacePoints_scaleFactor = modelSpacePoints_scaleFactor;
           this.modelSpacePoints_x = modelSpacePoints_x;
           this.modelSpacePoints_y = modelSpacePoints_y;
           this.modelSpacePoints_z = modelSpacePoints_z;
    }


    /**
     * Gets the modelSpacePoints_scaleFactor value for this ModelSpacePointsType.
     * 
     * @return modelSpacePoints_scaleFactor
     */
    public java.lang.String getModelSpacePoints_scaleFactor() {
        return modelSpacePoints_scaleFactor;
    }


    /**
     * Sets the modelSpacePoints_scaleFactor value for this ModelSpacePointsType.
     * 
     * @param modelSpacePoints_scaleFactor
     */
    public void setModelSpacePoints_scaleFactor(java.lang.String modelSpacePoints_scaleFactor) {
        this.modelSpacePoints_scaleFactor = modelSpacePoints_scaleFactor;
    }


    /**
     * Gets the modelSpacePoints_x value for this ModelSpacePointsType.
     * 
     * @return modelSpacePoints_x
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ModelSpacePoints_xType getModelSpacePoints_x() {
        return modelSpacePoints_x;
    }


    /**
     * Sets the modelSpacePoints_x value for this ModelSpacePointsType.
     * 
     * @param modelSpacePoints_x
     */
    public void setModelSpacePoints_x(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ModelSpacePoints_xType modelSpacePoints_x) {
        this.modelSpacePoints_x = modelSpacePoints_x;
    }


    /**
     * Gets the modelSpacePoints_y value for this ModelSpacePointsType.
     * 
     * @return modelSpacePoints_y
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ModelSpacePoints_yType getModelSpacePoints_y() {
        return modelSpacePoints_y;
    }


    /**
     * Sets the modelSpacePoints_y value for this ModelSpacePointsType.
     * 
     * @param modelSpacePoints_y
     */
    public void setModelSpacePoints_y(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ModelSpacePoints_yType modelSpacePoints_y) {
        this.modelSpacePoints_y = modelSpacePoints_y;
    }


    /**
     * Gets the modelSpacePoints_z value for this ModelSpacePointsType.
     * 
     * @return modelSpacePoints_z
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ModelSpacePoints_zType getModelSpacePoints_z() {
        return modelSpacePoints_z;
    }


    /**
     * Sets the modelSpacePoints_z value for this ModelSpacePointsType.
     * 
     * @param modelSpacePoints_z
     */
    public void setModelSpacePoints_z(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ModelSpacePoints_zType modelSpacePoints_z) {
        this.modelSpacePoints_z = modelSpacePoints_z;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ModelSpacePointsType)) return false;
        ModelSpacePointsType other = (ModelSpacePointsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.modelSpacePoints_scaleFactor==null && other.getModelSpacePoints_scaleFactor()==null) || 
             (this.modelSpacePoints_scaleFactor!=null &&
              this.modelSpacePoints_scaleFactor.equals(other.getModelSpacePoints_scaleFactor()))) &&
            ((this.modelSpacePoints_x==null && other.getModelSpacePoints_x()==null) || 
             (this.modelSpacePoints_x!=null &&
              this.modelSpacePoints_x.equals(other.getModelSpacePoints_x()))) &&
            ((this.modelSpacePoints_y==null && other.getModelSpacePoints_y()==null) || 
             (this.modelSpacePoints_y!=null &&
              this.modelSpacePoints_y.equals(other.getModelSpacePoints_y()))) &&
            ((this.modelSpacePoints_z==null && other.getModelSpacePoints_z()==null) || 
             (this.modelSpacePoints_z!=null &&
              this.modelSpacePoints_z.equals(other.getModelSpacePoints_z())));
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
        if (getModelSpacePoints_scaleFactor() != null) {
            _hashCode += getModelSpacePoints_scaleFactor().hashCode();
        }
        if (getModelSpacePoints_x() != null) {
            _hashCode += getModelSpacePoints_x().hashCode();
        }
        if (getModelSpacePoints_y() != null) {
            _hashCode += getModelSpacePoints_y().hashCode();
        }
        if (getModelSpacePoints_z() != null) {
            _hashCode += getModelSpacePoints_z().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ModelSpacePointsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Model-space-pointsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modelSpacePoints_scaleFactor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Model-space-points_scale-factor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modelSpacePoints_x");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Model-space-points_x"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Model-space-points_xType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modelSpacePoints_y");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Model-space-points_y"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Model-space-points_yType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modelSpacePoints_z");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Model-space-points_z"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Model-space-points_zType"));
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
