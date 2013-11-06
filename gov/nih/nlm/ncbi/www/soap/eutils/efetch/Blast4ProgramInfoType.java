/**
 * Blast4ProgramInfoType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Blast4ProgramInfoType  implements java.io.Serializable {
    private java.lang.String blast4ProgramInfo_program;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4ProgramInfo_servicesType blast4ProgramInfo_services;

    public Blast4ProgramInfoType() {
    }

    public Blast4ProgramInfoType(
           java.lang.String blast4ProgramInfo_program,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4ProgramInfo_servicesType blast4ProgramInfo_services) {
           this.blast4ProgramInfo_program = blast4ProgramInfo_program;
           this.blast4ProgramInfo_services = blast4ProgramInfo_services;
    }


    /**
     * Gets the blast4ProgramInfo_program value for this Blast4ProgramInfoType.
     * 
     * @return blast4ProgramInfo_program
     */
    public java.lang.String getBlast4ProgramInfo_program() {
        return blast4ProgramInfo_program;
    }


    /**
     * Sets the blast4ProgramInfo_program value for this Blast4ProgramInfoType.
     * 
     * @param blast4ProgramInfo_program
     */
    public void setBlast4ProgramInfo_program(java.lang.String blast4ProgramInfo_program) {
        this.blast4ProgramInfo_program = blast4ProgramInfo_program;
    }


    /**
     * Gets the blast4ProgramInfo_services value for this Blast4ProgramInfoType.
     * 
     * @return blast4ProgramInfo_services
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4ProgramInfo_servicesType getBlast4ProgramInfo_services() {
        return blast4ProgramInfo_services;
    }


    /**
     * Sets the blast4ProgramInfo_services value for this Blast4ProgramInfoType.
     * 
     * @param blast4ProgramInfo_services
     */
    public void setBlast4ProgramInfo_services(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4ProgramInfo_servicesType blast4ProgramInfo_services) {
        this.blast4ProgramInfo_services = blast4ProgramInfo_services;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Blast4ProgramInfoType)) return false;
        Blast4ProgramInfoType other = (Blast4ProgramInfoType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.blast4ProgramInfo_program==null && other.getBlast4ProgramInfo_program()==null) || 
             (this.blast4ProgramInfo_program!=null &&
              this.blast4ProgramInfo_program.equals(other.getBlast4ProgramInfo_program()))) &&
            ((this.blast4ProgramInfo_services==null && other.getBlast4ProgramInfo_services()==null) || 
             (this.blast4ProgramInfo_services!=null &&
              this.blast4ProgramInfo_services.equals(other.getBlast4ProgramInfo_services())));
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
        if (getBlast4ProgramInfo_program() != null) {
            _hashCode += getBlast4ProgramInfo_program().hashCode();
        }
        if (getBlast4ProgramInfo_services() != null) {
            _hashCode += getBlast4ProgramInfo_services().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Blast4ProgramInfoType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-program-infoType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blast4ProgramInfo_program");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-program-info_program"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blast4ProgramInfo_services");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-program-info_services"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-program-info_servicesType"));
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
