/**
 * Cn3DStyleTableItem_idType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Cn3DStyleTableItem_idType  implements java.io.Serializable {
    private java.lang.String cn3DStyleTableId;

    public Cn3DStyleTableItem_idType() {
    }

    public Cn3DStyleTableItem_idType(
           java.lang.String cn3DStyleTableId) {
           this.cn3DStyleTableId = cn3DStyleTableId;
    }


    /**
     * Gets the cn3DStyleTableId value for this Cn3DStyleTableItem_idType.
     * 
     * @return cn3DStyleTableId
     */
    public java.lang.String getCn3DStyleTableId() {
        return cn3DStyleTableId;
    }


    /**
     * Sets the cn3DStyleTableId value for this Cn3DStyleTableItem_idType.
     * 
     * @param cn3DStyleTableId
     */
    public void setCn3DStyleTableId(java.lang.String cn3DStyleTableId) {
        this.cn3DStyleTableId = cn3DStyleTableId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Cn3DStyleTableItem_idType)) return false;
        Cn3DStyleTableItem_idType other = (Cn3DStyleTableItem_idType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cn3DStyleTableId==null && other.getCn3DStyleTableId()==null) || 
             (this.cn3DStyleTableId!=null &&
              this.cn3DStyleTableId.equals(other.getCn3DStyleTableId())));
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
        if (getCn3DStyleTableId() != null) {
            _hashCode += getCn3DStyleTableId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Cn3DStyleTableItem_idType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-style-table-item_idType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cn3DStyleTableId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-style-table-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
