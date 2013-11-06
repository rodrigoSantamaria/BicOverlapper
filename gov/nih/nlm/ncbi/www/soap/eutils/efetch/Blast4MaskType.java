/**
 * Blast4MaskType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Blast4MaskType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4Mask_locationsType blast4Mask_locations;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4Mask_frameType blast4Mask_frame;

    public Blast4MaskType() {
    }

    public Blast4MaskType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4Mask_locationsType blast4Mask_locations,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4Mask_frameType blast4Mask_frame) {
           this.blast4Mask_locations = blast4Mask_locations;
           this.blast4Mask_frame = blast4Mask_frame;
    }


    /**
     * Gets the blast4Mask_locations value for this Blast4MaskType.
     * 
     * @return blast4Mask_locations
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4Mask_locationsType getBlast4Mask_locations() {
        return blast4Mask_locations;
    }


    /**
     * Sets the blast4Mask_locations value for this Blast4MaskType.
     * 
     * @param blast4Mask_locations
     */
    public void setBlast4Mask_locations(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4Mask_locationsType blast4Mask_locations) {
        this.blast4Mask_locations = blast4Mask_locations;
    }


    /**
     * Gets the blast4Mask_frame value for this Blast4MaskType.
     * 
     * @return blast4Mask_frame
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4Mask_frameType getBlast4Mask_frame() {
        return blast4Mask_frame;
    }


    /**
     * Sets the blast4Mask_frame value for this Blast4MaskType.
     * 
     * @param blast4Mask_frame
     */
    public void setBlast4Mask_frame(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4Mask_frameType blast4Mask_frame) {
        this.blast4Mask_frame = blast4Mask_frame;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Blast4MaskType)) return false;
        Blast4MaskType other = (Blast4MaskType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.blast4Mask_locations==null && other.getBlast4Mask_locations()==null) || 
             (this.blast4Mask_locations!=null &&
              this.blast4Mask_locations.equals(other.getBlast4Mask_locations()))) &&
            ((this.blast4Mask_frame==null && other.getBlast4Mask_frame()==null) || 
             (this.blast4Mask_frame!=null &&
              this.blast4Mask_frame.equals(other.getBlast4Mask_frame())));
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
        if (getBlast4Mask_locations() != null) {
            _hashCode += getBlast4Mask_locations().hashCode();
        }
        if (getBlast4Mask_frame() != null) {
            _hashCode += getBlast4Mask_frame().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Blast4MaskType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-maskType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blast4Mask_locations");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-mask_locations"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-mask_locationsType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blast4Mask_frame");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-mask_frame"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-mask_frameType"));
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
