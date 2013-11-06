/**
 * Blast4MatrixIdType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Blast4MatrixIdType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4MatrixId_residueTypeType blast4MatrixId_residueType;

    private java.lang.String blast4MatrixId_name;

    public Blast4MatrixIdType() {
    }

    public Blast4MatrixIdType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4MatrixId_residueTypeType blast4MatrixId_residueType,
           java.lang.String blast4MatrixId_name) {
           this.blast4MatrixId_residueType = blast4MatrixId_residueType;
           this.blast4MatrixId_name = blast4MatrixId_name;
    }


    /**
     * Gets the blast4MatrixId_residueType value for this Blast4MatrixIdType.
     * 
     * @return blast4MatrixId_residueType
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4MatrixId_residueTypeType getBlast4MatrixId_residueType() {
        return blast4MatrixId_residueType;
    }


    /**
     * Sets the blast4MatrixId_residueType value for this Blast4MatrixIdType.
     * 
     * @param blast4MatrixId_residueType
     */
    public void setBlast4MatrixId_residueType(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4MatrixId_residueTypeType blast4MatrixId_residueType) {
        this.blast4MatrixId_residueType = blast4MatrixId_residueType;
    }


    /**
     * Gets the blast4MatrixId_name value for this Blast4MatrixIdType.
     * 
     * @return blast4MatrixId_name
     */
    public java.lang.String getBlast4MatrixId_name() {
        return blast4MatrixId_name;
    }


    /**
     * Sets the blast4MatrixId_name value for this Blast4MatrixIdType.
     * 
     * @param blast4MatrixId_name
     */
    public void setBlast4MatrixId_name(java.lang.String blast4MatrixId_name) {
        this.blast4MatrixId_name = blast4MatrixId_name;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Blast4MatrixIdType)) return false;
        Blast4MatrixIdType other = (Blast4MatrixIdType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.blast4MatrixId_residueType==null && other.getBlast4MatrixId_residueType()==null) || 
             (this.blast4MatrixId_residueType!=null &&
              this.blast4MatrixId_residueType.equals(other.getBlast4MatrixId_residueType()))) &&
            ((this.blast4MatrixId_name==null && other.getBlast4MatrixId_name()==null) || 
             (this.blast4MatrixId_name!=null &&
              this.blast4MatrixId_name.equals(other.getBlast4MatrixId_name())));
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
        if (getBlast4MatrixId_residueType() != null) {
            _hashCode += getBlast4MatrixId_residueType().hashCode();
        }
        if (getBlast4MatrixId_name() != null) {
            _hashCode += getBlast4MatrixId_name().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Blast4MatrixIdType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-matrix-idType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blast4MatrixId_residueType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-matrix-id_residue-type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-matrix-id_residue-typeType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blast4MatrixId_name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-matrix-id_name"));
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
