/**
 * BiostrucModel_modelCoordinatesType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class BiostrucModel_modelCoordinatesType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ModelCoordinateSetType[] modelCoordinateSet;

    public BiostrucModel_modelCoordinatesType() {
    }

    public BiostrucModel_modelCoordinatesType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ModelCoordinateSetType[] modelCoordinateSet) {
           this.modelCoordinateSet = modelCoordinateSet;
    }


    /**
     * Gets the modelCoordinateSet value for this BiostrucModel_modelCoordinatesType.
     * 
     * @return modelCoordinateSet
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ModelCoordinateSetType[] getModelCoordinateSet() {
        return modelCoordinateSet;
    }


    /**
     * Sets the modelCoordinateSet value for this BiostrucModel_modelCoordinatesType.
     * 
     * @param modelCoordinateSet
     */
    public void setModelCoordinateSet(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ModelCoordinateSetType[] modelCoordinateSet) {
        this.modelCoordinateSet = modelCoordinateSet;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ModelCoordinateSetType getModelCoordinateSet(int i) {
        return this.modelCoordinateSet[i];
    }

    public void setModelCoordinateSet(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.ModelCoordinateSetType _value) {
        this.modelCoordinateSet[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BiostrucModel_modelCoordinatesType)) return false;
        BiostrucModel_modelCoordinatesType other = (BiostrucModel_modelCoordinatesType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.modelCoordinateSet==null && other.getModelCoordinateSet()==null) || 
             (this.modelCoordinateSet!=null &&
              java.util.Arrays.equals(this.modelCoordinateSet, other.getModelCoordinateSet())));
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
        if (getModelCoordinateSet() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getModelCoordinateSet());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getModelCoordinateSet(), i);
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
        new org.apache.axis.description.TypeDesc(BiostrucModel_modelCoordinatesType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-model_model-coordinatesType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modelCoordinateSet");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Model-coordinate-set"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Model-coordinate-setType"));
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
