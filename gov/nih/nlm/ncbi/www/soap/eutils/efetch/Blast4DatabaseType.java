/**
 * Blast4DatabaseType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Blast4DatabaseType  implements java.io.Serializable {
    private java.lang.String blast4Database_name;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4Database_typeType blast4Database_type;

    public Blast4DatabaseType() {
    }

    public Blast4DatabaseType(
           java.lang.String blast4Database_name,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4Database_typeType blast4Database_type) {
           this.blast4Database_name = blast4Database_name;
           this.blast4Database_type = blast4Database_type;
    }


    /**
     * Gets the blast4Database_name value for this Blast4DatabaseType.
     * 
     * @return blast4Database_name
     */
    public java.lang.String getBlast4Database_name() {
        return blast4Database_name;
    }


    /**
     * Sets the blast4Database_name value for this Blast4DatabaseType.
     * 
     * @param blast4Database_name
     */
    public void setBlast4Database_name(java.lang.String blast4Database_name) {
        this.blast4Database_name = blast4Database_name;
    }


    /**
     * Gets the blast4Database_type value for this Blast4DatabaseType.
     * 
     * @return blast4Database_type
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4Database_typeType getBlast4Database_type() {
        return blast4Database_type;
    }


    /**
     * Sets the blast4Database_type value for this Blast4DatabaseType.
     * 
     * @param blast4Database_type
     */
    public void setBlast4Database_type(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4Database_typeType blast4Database_type) {
        this.blast4Database_type = blast4Database_type;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Blast4DatabaseType)) return false;
        Blast4DatabaseType other = (Blast4DatabaseType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.blast4Database_name==null && other.getBlast4Database_name()==null) || 
             (this.blast4Database_name!=null &&
              this.blast4Database_name.equals(other.getBlast4Database_name()))) &&
            ((this.blast4Database_type==null && other.getBlast4Database_type()==null) || 
             (this.blast4Database_type!=null &&
              this.blast4Database_type.equals(other.getBlast4Database_type())));
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
        if (getBlast4Database_name() != null) {
            _hashCode += getBlast4Database_name().hashCode();
        }
        if (getBlast4Database_type() != null) {
            _hashCode += getBlast4Database_type().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Blast4DatabaseType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-databaseType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blast4Database_name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-database_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blast4Database_type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-database_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-database_typeType"));
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
