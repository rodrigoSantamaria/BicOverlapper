/**
 * Blast4Mask_frameType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Blast4Mask_frameType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4FrameTypeType blast4FrameType;

    public Blast4Mask_frameType() {
    }

    public Blast4Mask_frameType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4FrameTypeType blast4FrameType) {
           this.blast4FrameType = blast4FrameType;
    }


    /**
     * Gets the blast4FrameType value for this Blast4Mask_frameType.
     * 
     * @return blast4FrameType
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4FrameTypeType getBlast4FrameType() {
        return blast4FrameType;
    }


    /**
     * Sets the blast4FrameType value for this Blast4Mask_frameType.
     * 
     * @param blast4FrameType
     */
    public void setBlast4FrameType(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4FrameTypeType blast4FrameType) {
        this.blast4FrameType = blast4FrameType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Blast4Mask_frameType)) return false;
        Blast4Mask_frameType other = (Blast4Mask_frameType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.blast4FrameType==null && other.getBlast4FrameType()==null) || 
             (this.blast4FrameType!=null &&
              this.blast4FrameType.equals(other.getBlast4FrameType())));
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
        if (getBlast4FrameType() != null) {
            _hashCode += getBlast4FrameType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Blast4Mask_frameType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-mask_frameType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blast4FrameType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-frame-type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-frame-typeType"));
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
