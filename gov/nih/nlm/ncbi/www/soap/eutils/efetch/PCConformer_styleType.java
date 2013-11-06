/**
 * PCConformer_styleType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class PCConformer_styleType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCDrawAnnotationsType PCDrawAnnotations;

    public PCConformer_styleType() {
    }

    public PCConformer_styleType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCDrawAnnotationsType PCDrawAnnotations) {
           this.PCDrawAnnotations = PCDrawAnnotations;
    }


    /**
     * Gets the PCDrawAnnotations value for this PCConformer_styleType.
     * 
     * @return PCDrawAnnotations
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCDrawAnnotationsType getPCDrawAnnotations() {
        return PCDrawAnnotations;
    }


    /**
     * Sets the PCDrawAnnotations value for this PCConformer_styleType.
     * 
     * @param PCDrawAnnotations
     */
    public void setPCDrawAnnotations(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCDrawAnnotationsType PCDrawAnnotations) {
        this.PCDrawAnnotations = PCDrawAnnotations;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PCConformer_styleType)) return false;
        PCConformer_styleType other = (PCConformer_styleType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.PCDrawAnnotations==null && other.getPCDrawAnnotations()==null) || 
             (this.PCDrawAnnotations!=null &&
              this.PCDrawAnnotations.equals(other.getPCDrawAnnotations())));
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
        if (getPCDrawAnnotations() != null) {
            _hashCode += getPCDrawAnnotations().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PCConformer_styleType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-Conformer_styleType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCDrawAnnotations");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-DrawAnnotations"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-DrawAnnotationsType"));
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
