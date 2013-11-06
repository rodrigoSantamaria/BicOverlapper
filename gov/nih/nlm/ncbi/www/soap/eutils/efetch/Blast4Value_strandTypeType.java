/**
 * Blast4Value_strandTypeType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Blast4Value_strandTypeType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4StrandTypeType blast4StrandType;

    public Blast4Value_strandTypeType() {
    }

    public Blast4Value_strandTypeType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4StrandTypeType blast4StrandType) {
           this.blast4StrandType = blast4StrandType;
    }


    /**
     * Gets the blast4StrandType value for this Blast4Value_strandTypeType.
     * 
     * @return blast4StrandType
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4StrandTypeType getBlast4StrandType() {
        return blast4StrandType;
    }


    /**
     * Sets the blast4StrandType value for this Blast4Value_strandTypeType.
     * 
     * @param blast4StrandType
     */
    public void setBlast4StrandType(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4StrandTypeType blast4StrandType) {
        this.blast4StrandType = blast4StrandType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Blast4Value_strandTypeType)) return false;
        Blast4Value_strandTypeType other = (Blast4Value_strandTypeType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.blast4StrandType==null && other.getBlast4StrandType()==null) || 
             (this.blast4StrandType!=null &&
              this.blast4StrandType.equals(other.getBlast4StrandType())));
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
        if (getBlast4StrandType() != null) {
            _hashCode += getBlast4StrandType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Blast4Value_strandTypeType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-value_strand-typeType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blast4StrandType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-strand-type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-strand-typeType"));
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
