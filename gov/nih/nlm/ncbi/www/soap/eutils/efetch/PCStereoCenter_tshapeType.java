/**
 * PCStereoCenter_tshapeType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class PCStereoCenter_tshapeType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCStereoTShapeType PCStereoTShape;

    public PCStereoCenter_tshapeType() {
    }

    public PCStereoCenter_tshapeType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCStereoTShapeType PCStereoTShape) {
           this.PCStereoTShape = PCStereoTShape;
    }


    /**
     * Gets the PCStereoTShape value for this PCStereoCenter_tshapeType.
     * 
     * @return PCStereoTShape
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCStereoTShapeType getPCStereoTShape() {
        return PCStereoTShape;
    }


    /**
     * Sets the PCStereoTShape value for this PCStereoCenter_tshapeType.
     * 
     * @param PCStereoTShape
     */
    public void setPCStereoTShape(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCStereoTShapeType PCStereoTShape) {
        this.PCStereoTShape = PCStereoTShape;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PCStereoCenter_tshapeType)) return false;
        PCStereoCenter_tshapeType other = (PCStereoCenter_tshapeType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.PCStereoTShape==null && other.getPCStereoTShape()==null) || 
             (this.PCStereoTShape!=null &&
              this.PCStereoTShape.equals(other.getPCStereoTShape())));
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
        if (getPCStereoTShape() != null) {
            _hashCode += getPCStereoTShape().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PCStereoCenter_tshapeType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-StereoCenter_tshapeType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCStereoTShape");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-StereoTShape"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-StereoTShapeType"));
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
