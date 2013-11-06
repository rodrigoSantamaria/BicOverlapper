/**
 * ModelCoordinateSetType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ModelCoordinateSetType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ModelCoordinateSet_idType modelCoordinateSet_id;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ModelCoordinateSet_descrType modelCoordinateSet_descr;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ModelCoordinateSet_coordinatesType modelCoordinateSet_coordinates;

    public ModelCoordinateSetType() {
    }

    public ModelCoordinateSetType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ModelCoordinateSet_idType modelCoordinateSet_id,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ModelCoordinateSet_descrType modelCoordinateSet_descr,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ModelCoordinateSet_coordinatesType modelCoordinateSet_coordinates) {
           this.modelCoordinateSet_id = modelCoordinateSet_id;
           this.modelCoordinateSet_descr = modelCoordinateSet_descr;
           this.modelCoordinateSet_coordinates = modelCoordinateSet_coordinates;
    }


    /**
     * Gets the modelCoordinateSet_id value for this ModelCoordinateSetType.
     * 
     * @return modelCoordinateSet_id
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ModelCoordinateSet_idType getModelCoordinateSet_id() {
        return modelCoordinateSet_id;
    }


    /**
     * Sets the modelCoordinateSet_id value for this ModelCoordinateSetType.
     * 
     * @param modelCoordinateSet_id
     */
    public void setModelCoordinateSet_id(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ModelCoordinateSet_idType modelCoordinateSet_id) {
        this.modelCoordinateSet_id = modelCoordinateSet_id;
    }


    /**
     * Gets the modelCoordinateSet_descr value for this ModelCoordinateSetType.
     * 
     * @return modelCoordinateSet_descr
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ModelCoordinateSet_descrType getModelCoordinateSet_descr() {
        return modelCoordinateSet_descr;
    }


    /**
     * Sets the modelCoordinateSet_descr value for this ModelCoordinateSetType.
     * 
     * @param modelCoordinateSet_descr
     */
    public void setModelCoordinateSet_descr(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ModelCoordinateSet_descrType modelCoordinateSet_descr) {
        this.modelCoordinateSet_descr = modelCoordinateSet_descr;
    }


    /**
     * Gets the modelCoordinateSet_coordinates value for this ModelCoordinateSetType.
     * 
     * @return modelCoordinateSet_coordinates
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ModelCoordinateSet_coordinatesType getModelCoordinateSet_coordinates() {
        return modelCoordinateSet_coordinates;
    }


    /**
     * Sets the modelCoordinateSet_coordinates value for this ModelCoordinateSetType.
     * 
     * @param modelCoordinateSet_coordinates
     */
    public void setModelCoordinateSet_coordinates(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ModelCoordinateSet_coordinatesType modelCoordinateSet_coordinates) {
        this.modelCoordinateSet_coordinates = modelCoordinateSet_coordinates;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ModelCoordinateSetType)) return false;
        ModelCoordinateSetType other = (ModelCoordinateSetType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.modelCoordinateSet_id==null && other.getModelCoordinateSet_id()==null) || 
             (this.modelCoordinateSet_id!=null &&
              this.modelCoordinateSet_id.equals(other.getModelCoordinateSet_id()))) &&
            ((this.modelCoordinateSet_descr==null && other.getModelCoordinateSet_descr()==null) || 
             (this.modelCoordinateSet_descr!=null &&
              this.modelCoordinateSet_descr.equals(other.getModelCoordinateSet_descr()))) &&
            ((this.modelCoordinateSet_coordinates==null && other.getModelCoordinateSet_coordinates()==null) || 
             (this.modelCoordinateSet_coordinates!=null &&
              this.modelCoordinateSet_coordinates.equals(other.getModelCoordinateSet_coordinates())));
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
        if (getModelCoordinateSet_id() != null) {
            _hashCode += getModelCoordinateSet_id().hashCode();
        }
        if (getModelCoordinateSet_descr() != null) {
            _hashCode += getModelCoordinateSet_descr().hashCode();
        }
        if (getModelCoordinateSet_coordinates() != null) {
            _hashCode += getModelCoordinateSet_coordinates().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ModelCoordinateSetType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Model-coordinate-setType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modelCoordinateSet_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Model-coordinate-set_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Model-coordinate-set_idType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modelCoordinateSet_descr");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Model-coordinate-set_descr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Model-coordinate-set_descrType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modelCoordinateSet_coordinates");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Model-coordinate-set_coordinates"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Model-coordinate-set_coordinatesType"));
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
