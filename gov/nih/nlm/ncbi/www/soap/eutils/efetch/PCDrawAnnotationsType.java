/**
 * PCDrawAnnotationsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class PCDrawAnnotationsType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCDrawAnnotations_annotationType PCDrawAnnotations_annotation;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCDrawAnnotations_aid1Type PCDrawAnnotations_aid1;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCDrawAnnotations_aid2Type PCDrawAnnotations_aid2;

    public PCDrawAnnotationsType() {
    }

    public PCDrawAnnotationsType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCDrawAnnotations_annotationType PCDrawAnnotations_annotation,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCDrawAnnotations_aid1Type PCDrawAnnotations_aid1,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCDrawAnnotations_aid2Type PCDrawAnnotations_aid2) {
           this.PCDrawAnnotations_annotation = PCDrawAnnotations_annotation;
           this.PCDrawAnnotations_aid1 = PCDrawAnnotations_aid1;
           this.PCDrawAnnotations_aid2 = PCDrawAnnotations_aid2;
    }


    /**
     * Gets the PCDrawAnnotations_annotation value for this PCDrawAnnotationsType.
     * 
     * @return PCDrawAnnotations_annotation
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCDrawAnnotations_annotationType getPCDrawAnnotations_annotation() {
        return PCDrawAnnotations_annotation;
    }


    /**
     * Sets the PCDrawAnnotations_annotation value for this PCDrawAnnotationsType.
     * 
     * @param PCDrawAnnotations_annotation
     */
    public void setPCDrawAnnotations_annotation(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCDrawAnnotations_annotationType PCDrawAnnotations_annotation) {
        this.PCDrawAnnotations_annotation = PCDrawAnnotations_annotation;
    }


    /**
     * Gets the PCDrawAnnotations_aid1 value for this PCDrawAnnotationsType.
     * 
     * @return PCDrawAnnotations_aid1
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCDrawAnnotations_aid1Type getPCDrawAnnotations_aid1() {
        return PCDrawAnnotations_aid1;
    }


    /**
     * Sets the PCDrawAnnotations_aid1 value for this PCDrawAnnotationsType.
     * 
     * @param PCDrawAnnotations_aid1
     */
    public void setPCDrawAnnotations_aid1(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCDrawAnnotations_aid1Type PCDrawAnnotations_aid1) {
        this.PCDrawAnnotations_aid1 = PCDrawAnnotations_aid1;
    }


    /**
     * Gets the PCDrawAnnotations_aid2 value for this PCDrawAnnotationsType.
     * 
     * @return PCDrawAnnotations_aid2
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCDrawAnnotations_aid2Type getPCDrawAnnotations_aid2() {
        return PCDrawAnnotations_aid2;
    }


    /**
     * Sets the PCDrawAnnotations_aid2 value for this PCDrawAnnotationsType.
     * 
     * @param PCDrawAnnotations_aid2
     */
    public void setPCDrawAnnotations_aid2(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCDrawAnnotations_aid2Type PCDrawAnnotations_aid2) {
        this.PCDrawAnnotations_aid2 = PCDrawAnnotations_aid2;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PCDrawAnnotationsType)) return false;
        PCDrawAnnotationsType other = (PCDrawAnnotationsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.PCDrawAnnotations_annotation==null && other.getPCDrawAnnotations_annotation()==null) || 
             (this.PCDrawAnnotations_annotation!=null &&
              this.PCDrawAnnotations_annotation.equals(other.getPCDrawAnnotations_annotation()))) &&
            ((this.PCDrawAnnotations_aid1==null && other.getPCDrawAnnotations_aid1()==null) || 
             (this.PCDrawAnnotations_aid1!=null &&
              this.PCDrawAnnotations_aid1.equals(other.getPCDrawAnnotations_aid1()))) &&
            ((this.PCDrawAnnotations_aid2==null && other.getPCDrawAnnotations_aid2()==null) || 
             (this.PCDrawAnnotations_aid2!=null &&
              this.PCDrawAnnotations_aid2.equals(other.getPCDrawAnnotations_aid2())));
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
        if (getPCDrawAnnotations_annotation() != null) {
            _hashCode += getPCDrawAnnotations_annotation().hashCode();
        }
        if (getPCDrawAnnotations_aid1() != null) {
            _hashCode += getPCDrawAnnotations_aid1().hashCode();
        }
        if (getPCDrawAnnotations_aid2() != null) {
            _hashCode += getPCDrawAnnotations_aid2().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PCDrawAnnotationsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-DrawAnnotationsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCDrawAnnotations_annotation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-DrawAnnotations_annotation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-DrawAnnotations_annotationType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCDrawAnnotations_aid1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-DrawAnnotations_aid1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-DrawAnnotations_aid1Type"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCDrawAnnotations_aid2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-DrawAnnotations_aid2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-DrawAnnotations_aid2Type"));
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
