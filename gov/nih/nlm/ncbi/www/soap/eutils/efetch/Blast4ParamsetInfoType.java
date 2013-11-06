/**
 * Blast4ParamsetInfoType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Blast4ParamsetInfoType  implements java.io.Serializable {
    private java.lang.String blast4ParamsetInfo_program;

    private java.lang.String blast4ParamsetInfo_name;

    public Blast4ParamsetInfoType() {
    }

    public Blast4ParamsetInfoType(
           java.lang.String blast4ParamsetInfo_program,
           java.lang.String blast4ParamsetInfo_name) {
           this.blast4ParamsetInfo_program = blast4ParamsetInfo_program;
           this.blast4ParamsetInfo_name = blast4ParamsetInfo_name;
    }


    /**
     * Gets the blast4ParamsetInfo_program value for this Blast4ParamsetInfoType.
     * 
     * @return blast4ParamsetInfo_program
     */
    public java.lang.String getBlast4ParamsetInfo_program() {
        return blast4ParamsetInfo_program;
    }


    /**
     * Sets the blast4ParamsetInfo_program value for this Blast4ParamsetInfoType.
     * 
     * @param blast4ParamsetInfo_program
     */
    public void setBlast4ParamsetInfo_program(java.lang.String blast4ParamsetInfo_program) {
        this.blast4ParamsetInfo_program = blast4ParamsetInfo_program;
    }


    /**
     * Gets the blast4ParamsetInfo_name value for this Blast4ParamsetInfoType.
     * 
     * @return blast4ParamsetInfo_name
     */
    public java.lang.String getBlast4ParamsetInfo_name() {
        return blast4ParamsetInfo_name;
    }


    /**
     * Sets the blast4ParamsetInfo_name value for this Blast4ParamsetInfoType.
     * 
     * @param blast4ParamsetInfo_name
     */
    public void setBlast4ParamsetInfo_name(java.lang.String blast4ParamsetInfo_name) {
        this.blast4ParamsetInfo_name = blast4ParamsetInfo_name;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Blast4ParamsetInfoType)) return false;
        Blast4ParamsetInfoType other = (Blast4ParamsetInfoType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.blast4ParamsetInfo_program==null && other.getBlast4ParamsetInfo_program()==null) || 
             (this.blast4ParamsetInfo_program!=null &&
              this.blast4ParamsetInfo_program.equals(other.getBlast4ParamsetInfo_program()))) &&
            ((this.blast4ParamsetInfo_name==null && other.getBlast4ParamsetInfo_name()==null) || 
             (this.blast4ParamsetInfo_name!=null &&
              this.blast4ParamsetInfo_name.equals(other.getBlast4ParamsetInfo_name())));
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
        if (getBlast4ParamsetInfo_program() != null) {
            _hashCode += getBlast4ParamsetInfo_program().hashCode();
        }
        if (getBlast4ParamsetInfo_name() != null) {
            _hashCode += getBlast4ParamsetInfo_name().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Blast4ParamsetInfoType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-paramset-infoType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blast4ParamsetInfo_program");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-paramset-info_program"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blast4ParamsetInfo_name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-paramset-info_name"));
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
