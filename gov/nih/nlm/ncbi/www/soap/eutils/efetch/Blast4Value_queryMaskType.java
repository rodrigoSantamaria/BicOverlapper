/**
 * Blast4Value_queryMaskType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Blast4Value_queryMaskType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4MaskType blast4Mask;

    public Blast4Value_queryMaskType() {
    }

    public Blast4Value_queryMaskType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4MaskType blast4Mask) {
           this.blast4Mask = blast4Mask;
    }


    /**
     * Gets the blast4Mask value for this Blast4Value_queryMaskType.
     * 
     * @return blast4Mask
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4MaskType getBlast4Mask() {
        return blast4Mask;
    }


    /**
     * Sets the blast4Mask value for this Blast4Value_queryMaskType.
     * 
     * @param blast4Mask
     */
    public void setBlast4Mask(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4MaskType blast4Mask) {
        this.blast4Mask = blast4Mask;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Blast4Value_queryMaskType)) return false;
        Blast4Value_queryMaskType other = (Blast4Value_queryMaskType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.blast4Mask==null && other.getBlast4Mask()==null) || 
             (this.blast4Mask!=null &&
              this.blast4Mask.equals(other.getBlast4Mask())));
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
        if (getBlast4Mask() != null) {
            _hashCode += getBlast4Mask().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Blast4Value_queryMaskType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-value_query-maskType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blast4Mask");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-mask"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-maskType"));
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
