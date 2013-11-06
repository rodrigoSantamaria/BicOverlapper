/**
 * Blast4DatabaseInfo_seqtechType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Blast4DatabaseInfo_seqtechType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4SeqtechType blast4Seqtech;

    public Blast4DatabaseInfo_seqtechType() {
    }

    public Blast4DatabaseInfo_seqtechType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4SeqtechType blast4Seqtech) {
           this.blast4Seqtech = blast4Seqtech;
    }


    /**
     * Gets the blast4Seqtech value for this Blast4DatabaseInfo_seqtechType.
     * 
     * @return blast4Seqtech
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4SeqtechType getBlast4Seqtech() {
        return blast4Seqtech;
    }


    /**
     * Sets the blast4Seqtech value for this Blast4DatabaseInfo_seqtechType.
     * 
     * @param blast4Seqtech
     */
    public void setBlast4Seqtech(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4SeqtechType blast4Seqtech) {
        this.blast4Seqtech = blast4Seqtech;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Blast4DatabaseInfo_seqtechType)) return false;
        Blast4DatabaseInfo_seqtechType other = (Blast4DatabaseInfo_seqtechType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.blast4Seqtech==null && other.getBlast4Seqtech()==null) || 
             (this.blast4Seqtech!=null &&
              this.blast4Seqtech.equals(other.getBlast4Seqtech())));
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
        if (getBlast4Seqtech() != null) {
            _hashCode += getBlast4Seqtech().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Blast4DatabaseInfo_seqtechType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-database-info_seqtechType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blast4Seqtech");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-seqtech"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-seqtechType"));
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
