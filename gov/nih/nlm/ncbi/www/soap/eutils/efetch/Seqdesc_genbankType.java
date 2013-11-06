/**
 * Seqdesc_genbankType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Seqdesc_genbankType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.GBBlockType GBBlock;

    public Seqdesc_genbankType() {
    }

    public Seqdesc_genbankType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.GBBlockType GBBlock) {
           this.GBBlock = GBBlock;
    }


    /**
     * Gets the GBBlock value for this Seqdesc_genbankType.
     * 
     * @return GBBlock
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.GBBlockType getGBBlock() {
        return GBBlock;
    }


    /**
     * Sets the GBBlock value for this Seqdesc_genbankType.
     * 
     * @param GBBlock
     */
    public void setGBBlock(gov.nih.nlm.ncbi.www.soap.eutils.efetch.GBBlockType GBBlock) {
        this.GBBlock = GBBlock;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Seqdesc_genbankType)) return false;
        Seqdesc_genbankType other = (Seqdesc_genbankType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.GBBlock==null && other.getGBBlock()==null) || 
             (this.GBBlock!=null &&
              this.GBBlock.equals(other.getGBBlock())));
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
        if (getGBBlock() != null) {
            _hashCode += getGBBlock().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Seqdesc_genbankType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seqdesc_genbankType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GBBlock");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "GB-block"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "GB-blockType"));
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
