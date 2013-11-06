/**
 * BiostrucModel_modelSpaceType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class BiostrucModel_modelSpaceType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ModelSpaceType modelSpace;

    public BiostrucModel_modelSpaceType() {
    }

    public BiostrucModel_modelSpaceType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ModelSpaceType modelSpace) {
           this.modelSpace = modelSpace;
    }


    /**
     * Gets the modelSpace value for this BiostrucModel_modelSpaceType.
     * 
     * @return modelSpace
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ModelSpaceType getModelSpace() {
        return modelSpace;
    }


    /**
     * Sets the modelSpace value for this BiostrucModel_modelSpaceType.
     * 
     * @param modelSpace
     */
    public void setModelSpace(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ModelSpaceType modelSpace) {
        this.modelSpace = modelSpace;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BiostrucModel_modelSpaceType)) return false;
        BiostrucModel_modelSpaceType other = (BiostrucModel_modelSpaceType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.modelSpace==null && other.getModelSpace()==null) || 
             (this.modelSpace!=null &&
              this.modelSpace.equals(other.getModelSpace())));
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
        if (getModelSpace() != null) {
            _hashCode += getModelSpace().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BiostrucModel_modelSpaceType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-model_model-spaceType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modelSpace");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Model-space"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Model-spaceType"));
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
