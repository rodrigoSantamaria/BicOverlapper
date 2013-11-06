/**
 * TransformType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class TransformType  implements java.io.Serializable {
    private java.lang.String transform_id;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Transform_movesType transform_moves;

    public TransformType() {
    }

    public TransformType(
           java.lang.String transform_id,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Transform_movesType transform_moves) {
           this.transform_id = transform_id;
           this.transform_moves = transform_moves;
    }


    /**
     * Gets the transform_id value for this TransformType.
     * 
     * @return transform_id
     */
    public java.lang.String getTransform_id() {
        return transform_id;
    }


    /**
     * Sets the transform_id value for this TransformType.
     * 
     * @param transform_id
     */
    public void setTransform_id(java.lang.String transform_id) {
        this.transform_id = transform_id;
    }


    /**
     * Gets the transform_moves value for this TransformType.
     * 
     * @return transform_moves
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Transform_movesType getTransform_moves() {
        return transform_moves;
    }


    /**
     * Sets the transform_moves value for this TransformType.
     * 
     * @param transform_moves
     */
    public void setTransform_moves(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Transform_movesType transform_moves) {
        this.transform_moves = transform_moves;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TransformType)) return false;
        TransformType other = (TransformType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.transform_id==null && other.getTransform_id()==null) || 
             (this.transform_id!=null &&
              this.transform_id.equals(other.getTransform_id()))) &&
            ((this.transform_moves==null && other.getTransform_moves()==null) || 
             (this.transform_moves!=null &&
              this.transform_moves.equals(other.getTransform_moves())));
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
        if (getTransform_id() != null) {
            _hashCode += getTransform_id().hashCode();
        }
        if (getTransform_moves() != null) {
            _hashCode += getTransform_moves().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TransformType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "TransformType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transform_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Transform_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transform_moves");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Transform_moves"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Transform_movesType"));
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
