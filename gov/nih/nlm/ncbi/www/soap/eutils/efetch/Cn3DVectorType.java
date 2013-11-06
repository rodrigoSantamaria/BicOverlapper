/**
 * Cn3DVectorType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Cn3DVectorType  implements java.io.Serializable {
    private java.lang.String cn3DVector_x;

    private java.lang.String cn3DVector_y;

    private java.lang.String cn3DVector_z;

    public Cn3DVectorType() {
    }

    public Cn3DVectorType(
           java.lang.String cn3DVector_x,
           java.lang.String cn3DVector_y,
           java.lang.String cn3DVector_z) {
           this.cn3DVector_x = cn3DVector_x;
           this.cn3DVector_y = cn3DVector_y;
           this.cn3DVector_z = cn3DVector_z;
    }


    /**
     * Gets the cn3DVector_x value for this Cn3DVectorType.
     * 
     * @return cn3DVector_x
     */
    public java.lang.String getCn3DVector_x() {
        return cn3DVector_x;
    }


    /**
     * Sets the cn3DVector_x value for this Cn3DVectorType.
     * 
     * @param cn3DVector_x
     */
    public void setCn3DVector_x(java.lang.String cn3DVector_x) {
        this.cn3DVector_x = cn3DVector_x;
    }


    /**
     * Gets the cn3DVector_y value for this Cn3DVectorType.
     * 
     * @return cn3DVector_y
     */
    public java.lang.String getCn3DVector_y() {
        return cn3DVector_y;
    }


    /**
     * Sets the cn3DVector_y value for this Cn3DVectorType.
     * 
     * @param cn3DVector_y
     */
    public void setCn3DVector_y(java.lang.String cn3DVector_y) {
        this.cn3DVector_y = cn3DVector_y;
    }


    /**
     * Gets the cn3DVector_z value for this Cn3DVectorType.
     * 
     * @return cn3DVector_z
     */
    public java.lang.String getCn3DVector_z() {
        return cn3DVector_z;
    }


    /**
     * Sets the cn3DVector_z value for this Cn3DVectorType.
     * 
     * @param cn3DVector_z
     */
    public void setCn3DVector_z(java.lang.String cn3DVector_z) {
        this.cn3DVector_z = cn3DVector_z;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Cn3DVectorType)) return false;
        Cn3DVectorType other = (Cn3DVectorType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cn3DVector_x==null && other.getCn3DVector_x()==null) || 
             (this.cn3DVector_x!=null &&
              this.cn3DVector_x.equals(other.getCn3DVector_x()))) &&
            ((this.cn3DVector_y==null && other.getCn3DVector_y()==null) || 
             (this.cn3DVector_y!=null &&
              this.cn3DVector_y.equals(other.getCn3DVector_y()))) &&
            ((this.cn3DVector_z==null && other.getCn3DVector_z()==null) || 
             (this.cn3DVector_z!=null &&
              this.cn3DVector_z.equals(other.getCn3DVector_z())));
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
        if (getCn3DVector_x() != null) {
            _hashCode += getCn3DVector_x().hashCode();
        }
        if (getCn3DVector_y() != null) {
            _hashCode += getCn3DVector_y().hashCode();
        }
        if (getCn3DVector_z() != null) {
            _hashCode += getCn3DVector_z().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Cn3DVectorType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-vectorType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cn3DVector_x");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-vector_x"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cn3DVector_y");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-vector_y"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cn3DVector_z");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-vector_z"));
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
