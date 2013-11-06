/**
 * Assay_methodType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Assay_methodType  implements java.io.Serializable {
    private java.lang.String assay_method_name;

    private java.lang.String assay_method_id;

    private java.lang.String assay_method_exception;

    public Assay_methodType() {
    }

    public Assay_methodType(
           java.lang.String assay_method_name,
           java.lang.String assay_method_id,
           java.lang.String assay_method_exception) {
           this.assay_method_name = assay_method_name;
           this.assay_method_id = assay_method_id;
           this.assay_method_exception = assay_method_exception;
    }


    /**
     * Gets the assay_method_name value for this Assay_methodType.
     * 
     * @return assay_method_name
     */
    public java.lang.String getAssay_method_name() {
        return assay_method_name;
    }


    /**
     * Sets the assay_method_name value for this Assay_methodType.
     * 
     * @param assay_method_name
     */
    public void setAssay_method_name(java.lang.String assay_method_name) {
        this.assay_method_name = assay_method_name;
    }


    /**
     * Gets the assay_method_id value for this Assay_methodType.
     * 
     * @return assay_method_id
     */
    public java.lang.String getAssay_method_id() {
        return assay_method_id;
    }


    /**
     * Sets the assay_method_id value for this Assay_methodType.
     * 
     * @param assay_method_id
     */
    public void setAssay_method_id(java.lang.String assay_method_id) {
        this.assay_method_id = assay_method_id;
    }


    /**
     * Gets the assay_method_exception value for this Assay_methodType.
     * 
     * @return assay_method_exception
     */
    public java.lang.String getAssay_method_exception() {
        return assay_method_exception;
    }


    /**
     * Sets the assay_method_exception value for this Assay_methodType.
     * 
     * @param assay_method_exception
     */
    public void setAssay_method_exception(java.lang.String assay_method_exception) {
        this.assay_method_exception = assay_method_exception;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Assay_methodType)) return false;
        Assay_methodType other = (Assay_methodType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.assay_method_name==null && other.getAssay_method_name()==null) || 
             (this.assay_method_name!=null &&
              this.assay_method_name.equals(other.getAssay_method_name()))) &&
            ((this.assay_method_id==null && other.getAssay_method_id()==null) || 
             (this.assay_method_id!=null &&
              this.assay_method_id.equals(other.getAssay_method_id()))) &&
            ((this.assay_method_exception==null && other.getAssay_method_exception()==null) || 
             (this.assay_method_exception!=null &&
              this.assay_method_exception.equals(other.getAssay_method_exception())));
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
        if (getAssay_method_name() != null) {
            _hashCode += getAssay_method_name().hashCode();
        }
        if (getAssay_method_id() != null) {
            _hashCode += getAssay_method_id().hashCode();
        }
        if (getAssay_method_exception() != null) {
            _hashCode += getAssay_method_exception().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Assay_methodType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Assay_methodType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assay_method_name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Assay_method_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assay_method_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Assay_method_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assay_method_exception");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Assay_method_exception"));
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
