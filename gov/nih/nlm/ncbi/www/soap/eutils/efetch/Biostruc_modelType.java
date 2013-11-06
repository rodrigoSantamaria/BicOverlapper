/**
 * Biostruc_modelType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Biostruc_modelType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucModelType[] biostrucModel;

    public Biostruc_modelType() {
    }

    public Biostruc_modelType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucModelType[] biostrucModel) {
           this.biostrucModel = biostrucModel;
    }


    /**
     * Gets the biostrucModel value for this Biostruc_modelType.
     * 
     * @return biostrucModel
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucModelType[] getBiostrucModel() {
        return biostrucModel;
    }


    /**
     * Sets the biostrucModel value for this Biostruc_modelType.
     * 
     * @param biostrucModel
     */
    public void setBiostrucModel(gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucModelType[] biostrucModel) {
        this.biostrucModel = biostrucModel;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucModelType getBiostrucModel(int i) {
        return this.biostrucModel[i];
    }

    public void setBiostrucModel(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucModelType _value) {
        this.biostrucModel[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Biostruc_modelType)) return false;
        Biostruc_modelType other = (Biostruc_modelType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.biostrucModel==null && other.getBiostrucModel()==null) || 
             (this.biostrucModel!=null &&
              java.util.Arrays.equals(this.biostrucModel, other.getBiostrucModel())));
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
        if (getBiostrucModel() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBiostrucModel());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBiostrucModel(), i);
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
        new org.apache.axis.description.TypeDesc(Biostruc_modelType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc_modelType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("biostrucModel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-model"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-modelType"));
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
