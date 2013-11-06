/**
 * Seqdesc_methodType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Seqdesc_methodType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.GIBBMethodType GIBBMethod;

    public Seqdesc_methodType() {
    }

    public Seqdesc_methodType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.GIBBMethodType GIBBMethod) {
           this.GIBBMethod = GIBBMethod;
    }


    /**
     * Gets the GIBBMethod value for this Seqdesc_methodType.
     * 
     * @return GIBBMethod
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.GIBBMethodType getGIBBMethod() {
        return GIBBMethod;
    }


    /**
     * Sets the GIBBMethod value for this Seqdesc_methodType.
     * 
     * @param GIBBMethod
     */
    public void setGIBBMethod(gov.nih.nlm.ncbi.www.soap.eutils.efetch.GIBBMethodType GIBBMethod) {
        this.GIBBMethod = GIBBMethod;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Seqdesc_methodType)) return false;
        Seqdesc_methodType other = (Seqdesc_methodType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.GIBBMethod==null && other.getGIBBMethod()==null) || 
             (this.GIBBMethod!=null &&
              this.GIBBMethod.equals(other.getGIBBMethod())));
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
        if (getGIBBMethod() != null) {
            _hashCode += getGIBBMethod().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Seqdesc_methodType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seqdesc_methodType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GIBBMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "GIBB-method"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "GIBB-methodType"));
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
