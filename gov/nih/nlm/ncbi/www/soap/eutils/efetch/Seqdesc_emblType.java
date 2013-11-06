/**
 * Seqdesc_emblType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Seqdesc_emblType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.EMBLBlockType EMBLBlock;

    public Seqdesc_emblType() {
    }

    public Seqdesc_emblType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.EMBLBlockType EMBLBlock) {
           this.EMBLBlock = EMBLBlock;
    }


    /**
     * Gets the EMBLBlock value for this Seqdesc_emblType.
     * 
     * @return EMBLBlock
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.EMBLBlockType getEMBLBlock() {
        return EMBLBlock;
    }


    /**
     * Sets the EMBLBlock value for this Seqdesc_emblType.
     * 
     * @param EMBLBlock
     */
    public void setEMBLBlock(gov.nih.nlm.ncbi.www.soap.eutils.efetch.EMBLBlockType EMBLBlock) {
        this.EMBLBlock = EMBLBlock;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Seqdesc_emblType)) return false;
        Seqdesc_emblType other = (Seqdesc_emblType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.EMBLBlock==null && other.getEMBLBlock()==null) || 
             (this.EMBLBlock!=null &&
              this.EMBLBlock.equals(other.getEMBLBlock())));
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
        if (getEMBLBlock() != null) {
            _hashCode += getEMBLBlock().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Seqdesc_emblType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seqdesc_emblType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EMBLBlock");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "EMBL-block"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "EMBL-blockType"));
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
