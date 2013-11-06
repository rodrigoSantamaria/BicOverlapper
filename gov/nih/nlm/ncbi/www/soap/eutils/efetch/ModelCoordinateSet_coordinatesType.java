/**
 * ModelCoordinateSet_coordinatesType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ModelCoordinateSet_coordinatesType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ModelCoordinateSet_coordinates_literalType modelCoordinateSet_coordinates_literal;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ModelCoordinateSet_coordinates_referenceType modelCoordinateSet_coordinates_reference;

    public ModelCoordinateSet_coordinatesType() {
    }

    public ModelCoordinateSet_coordinatesType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ModelCoordinateSet_coordinates_literalType modelCoordinateSet_coordinates_literal,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ModelCoordinateSet_coordinates_referenceType modelCoordinateSet_coordinates_reference) {
           this.modelCoordinateSet_coordinates_literal = modelCoordinateSet_coordinates_literal;
           this.modelCoordinateSet_coordinates_reference = modelCoordinateSet_coordinates_reference;
    }


    /**
     * Gets the modelCoordinateSet_coordinates_literal value for this ModelCoordinateSet_coordinatesType.
     * 
     * @return modelCoordinateSet_coordinates_literal
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ModelCoordinateSet_coordinates_literalType getModelCoordinateSet_coordinates_literal() {
        return modelCoordinateSet_coordinates_literal;
    }


    /**
     * Sets the modelCoordinateSet_coordinates_literal value for this ModelCoordinateSet_coordinatesType.
     * 
     * @param modelCoordinateSet_coordinates_literal
     */
    public void setModelCoordinateSet_coordinates_literal(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ModelCoordinateSet_coordinates_literalType modelCoordinateSet_coordinates_literal) {
        this.modelCoordinateSet_coordinates_literal = modelCoordinateSet_coordinates_literal;
    }


    /**
     * Gets the modelCoordinateSet_coordinates_reference value for this ModelCoordinateSet_coordinatesType.
     * 
     * @return modelCoordinateSet_coordinates_reference
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ModelCoordinateSet_coordinates_referenceType getModelCoordinateSet_coordinates_reference() {
        return modelCoordinateSet_coordinates_reference;
    }


    /**
     * Sets the modelCoordinateSet_coordinates_reference value for this ModelCoordinateSet_coordinatesType.
     * 
     * @param modelCoordinateSet_coordinates_reference
     */
    public void setModelCoordinateSet_coordinates_reference(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ModelCoordinateSet_coordinates_referenceType modelCoordinateSet_coordinates_reference) {
        this.modelCoordinateSet_coordinates_reference = modelCoordinateSet_coordinates_reference;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ModelCoordinateSet_coordinatesType)) return false;
        ModelCoordinateSet_coordinatesType other = (ModelCoordinateSet_coordinatesType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.modelCoordinateSet_coordinates_literal==null && other.getModelCoordinateSet_coordinates_literal()==null) || 
             (this.modelCoordinateSet_coordinates_literal!=null &&
              this.modelCoordinateSet_coordinates_literal.equals(other.getModelCoordinateSet_coordinates_literal()))) &&
            ((this.modelCoordinateSet_coordinates_reference==null && other.getModelCoordinateSet_coordinates_reference()==null) || 
             (this.modelCoordinateSet_coordinates_reference!=null &&
              this.modelCoordinateSet_coordinates_reference.equals(other.getModelCoordinateSet_coordinates_reference())));
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
        if (getModelCoordinateSet_coordinates_literal() != null) {
            _hashCode += getModelCoordinateSet_coordinates_literal().hashCode();
        }
        if (getModelCoordinateSet_coordinates_reference() != null) {
            _hashCode += getModelCoordinateSet_coordinates_reference().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ModelCoordinateSet_coordinatesType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Model-coordinate-set_coordinatesType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modelCoordinateSet_coordinates_literal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Model-coordinate-set_coordinates_literal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Model-coordinate-set_coordinates_literalType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modelCoordinateSet_coordinates_reference");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Model-coordinate-set_coordinates_reference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Model-coordinate-set_coordinates_referenceType"));
        elemField.setMinOccurs(0);
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
