/**
 * ID2ParamsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ID2ParamsType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2ParamType[] ID2Param;

    public ID2ParamsType() {
    }

    public ID2ParamsType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2ParamType[] ID2Param) {
           this.ID2Param = ID2Param;
    }


    /**
     * Gets the ID2Param value for this ID2ParamsType.
     * 
     * @return ID2Param
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2ParamType[] getID2Param() {
        return ID2Param;
    }


    /**
     * Sets the ID2Param value for this ID2ParamsType.
     * 
     * @param ID2Param
     */
    public void setID2Param(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2ParamType[] ID2Param) {
        this.ID2Param = ID2Param;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2ParamType getID2Param(int i) {
        return this.ID2Param[i];
    }

    public void setID2Param(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2ParamType _value) {
        this.ID2Param[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ID2ParamsType)) return false;
        ID2ParamsType other = (ID2ParamsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ID2Param==null && other.getID2Param()==null) || 
             (this.ID2Param!=null &&
              java.util.Arrays.equals(this.ID2Param, other.getID2Param())));
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
        if (getID2Param() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getID2Param());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getID2Param(), i);
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
        new org.apache.axis.description.TypeDesc(ID2ParamsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-ParamsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2Param");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Param"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-ParamType"));
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
