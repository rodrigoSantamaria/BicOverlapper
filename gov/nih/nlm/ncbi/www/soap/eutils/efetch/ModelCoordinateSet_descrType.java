/**
 * ModelCoordinateSet_descrType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ModelCoordinateSet_descrType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ModelDescrType[] modelDescr;

    public ModelCoordinateSet_descrType() {
    }

    public ModelCoordinateSet_descrType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ModelDescrType[] modelDescr) {
           this.modelDescr = modelDescr;
    }


    /**
     * Gets the modelDescr value for this ModelCoordinateSet_descrType.
     * 
     * @return modelDescr
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ModelDescrType[] getModelDescr() {
        return modelDescr;
    }


    /**
     * Sets the modelDescr value for this ModelCoordinateSet_descrType.
     * 
     * @param modelDescr
     */
    public void setModelDescr(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ModelDescrType[] modelDescr) {
        this.modelDescr = modelDescr;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ModelDescrType getModelDescr(int i) {
        return this.modelDescr[i];
    }

    public void setModelDescr(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.ModelDescrType _value) {
        this.modelDescr[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ModelCoordinateSet_descrType)) return false;
        ModelCoordinateSet_descrType other = (ModelCoordinateSet_descrType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.modelDescr==null && other.getModelDescr()==null) || 
             (this.modelDescr!=null &&
              java.util.Arrays.equals(this.modelDescr, other.getModelDescr())));
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
        if (getModelDescr() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getModelDescr());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getModelDescr(), i);
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
        new org.apache.axis.description.TypeDesc(ModelCoordinateSet_descrType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Model-coordinate-set_descrType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modelDescr");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Model-descr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Model-descrType"));
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
