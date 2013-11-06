/**
 * Blast4MatrixId_residueTypeType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Blast4MatrixId_residueTypeType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4ResidueTypeType blast4ResidueType;

    public Blast4MatrixId_residueTypeType() {
    }

    public Blast4MatrixId_residueTypeType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4ResidueTypeType blast4ResidueType) {
           this.blast4ResidueType = blast4ResidueType;
    }


    /**
     * Gets the blast4ResidueType value for this Blast4MatrixId_residueTypeType.
     * 
     * @return blast4ResidueType
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4ResidueTypeType getBlast4ResidueType() {
        return blast4ResidueType;
    }


    /**
     * Sets the blast4ResidueType value for this Blast4MatrixId_residueTypeType.
     * 
     * @param blast4ResidueType
     */
    public void setBlast4ResidueType(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4ResidueTypeType blast4ResidueType) {
        this.blast4ResidueType = blast4ResidueType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Blast4MatrixId_residueTypeType)) return false;
        Blast4MatrixId_residueTypeType other = (Blast4MatrixId_residueTypeType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.blast4ResidueType==null && other.getBlast4ResidueType()==null) || 
             (this.blast4ResidueType!=null &&
              this.blast4ResidueType.equals(other.getBlast4ResidueType())));
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
        if (getBlast4ResidueType() != null) {
            _hashCode += getBlast4ResidueType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Blast4MatrixId_residueTypeType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-matrix-id_residue-typeType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blast4ResidueType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-residue-type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-residue-typeType"));
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
