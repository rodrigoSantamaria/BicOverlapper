/**
 * ID2ReplyData_dataType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ID2ReplyData_dataType  implements java.io.Serializable {
    private java.lang.String[] ID2ReplyData_data_E;

    public ID2ReplyData_dataType() {
    }

    public ID2ReplyData_dataType(
           java.lang.String[] ID2ReplyData_data_E) {
           this.ID2ReplyData_data_E = ID2ReplyData_data_E;
    }


    /**
     * Gets the ID2ReplyData_data_E value for this ID2ReplyData_dataType.
     * 
     * @return ID2ReplyData_data_E
     */
    public java.lang.String[] getID2ReplyData_data_E() {
        return ID2ReplyData_data_E;
    }


    /**
     * Sets the ID2ReplyData_data_E value for this ID2ReplyData_dataType.
     * 
     * @param ID2ReplyData_data_E
     */
    public void setID2ReplyData_data_E(java.lang.String[] ID2ReplyData_data_E) {
        this.ID2ReplyData_data_E = ID2ReplyData_data_E;
    }

    public java.lang.String getID2ReplyData_data_E(int i) {
        return this.ID2ReplyData_data_E[i];
    }

    public void setID2ReplyData_data_E(int i, java.lang.String _value) {
        this.ID2ReplyData_data_E[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ID2ReplyData_dataType)) return false;
        ID2ReplyData_dataType other = (ID2ReplyData_dataType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ID2ReplyData_data_E==null && other.getID2ReplyData_data_E()==null) || 
             (this.ID2ReplyData_data_E!=null &&
              java.util.Arrays.equals(this.ID2ReplyData_data_E, other.getID2ReplyData_data_E())));
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
        if (getID2ReplyData_data_E() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getID2ReplyData_data_E());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getID2ReplyData_data_E(), i);
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
        new org.apache.axis.description.TypeDesc(ID2ReplyData_dataType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Reply-Data_dataType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2ReplyData_data_E");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Reply-Data_data_E"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Reply-Data_data_E"));
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
