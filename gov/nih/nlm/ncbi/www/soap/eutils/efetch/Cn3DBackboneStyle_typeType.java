/**
 * Cn3DBackboneStyle_typeType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Cn3DBackboneStyle_typeType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DBackboneTypeType cn3DBackboneType;

    public Cn3DBackboneStyle_typeType() {
    }

    public Cn3DBackboneStyle_typeType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DBackboneTypeType cn3DBackboneType) {
           this.cn3DBackboneType = cn3DBackboneType;
    }


    /**
     * Gets the cn3DBackboneType value for this Cn3DBackboneStyle_typeType.
     * 
     * @return cn3DBackboneType
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DBackboneTypeType getCn3DBackboneType() {
        return cn3DBackboneType;
    }


    /**
     * Sets the cn3DBackboneType value for this Cn3DBackboneStyle_typeType.
     * 
     * @param cn3DBackboneType
     */
    public void setCn3DBackboneType(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DBackboneTypeType cn3DBackboneType) {
        this.cn3DBackboneType = cn3DBackboneType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Cn3DBackboneStyle_typeType)) return false;
        Cn3DBackboneStyle_typeType other = (Cn3DBackboneStyle_typeType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cn3DBackboneType==null && other.getCn3DBackboneType()==null) || 
             (this.cn3DBackboneType!=null &&
              this.cn3DBackboneType.equals(other.getCn3DBackboneType())));
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
        if (getCn3DBackboneType() != null) {
            _hashCode += getCn3DBackboneType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Cn3DBackboneStyle_typeType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-backbone-style_typeType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cn3DBackboneType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-backbone-type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-backbone-typeType"));
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
