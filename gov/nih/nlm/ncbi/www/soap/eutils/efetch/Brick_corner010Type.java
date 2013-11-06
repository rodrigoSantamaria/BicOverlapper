/**
 * Brick_corner010Type.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Brick_corner010Type  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ModelSpacePointType modelSpacePoint;

    public Brick_corner010Type() {
    }

    public Brick_corner010Type(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ModelSpacePointType modelSpacePoint) {
           this.modelSpacePoint = modelSpacePoint;
    }


    /**
     * Gets the modelSpacePoint value for this Brick_corner010Type.
     * 
     * @return modelSpacePoint
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ModelSpacePointType getModelSpacePoint() {
        return modelSpacePoint;
    }


    /**
     * Sets the modelSpacePoint value for this Brick_corner010Type.
     * 
     * @param modelSpacePoint
     */
    public void setModelSpacePoint(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ModelSpacePointType modelSpacePoint) {
        this.modelSpacePoint = modelSpacePoint;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Brick_corner010Type)) return false;
        Brick_corner010Type other = (Brick_corner010Type) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.modelSpacePoint==null && other.getModelSpacePoint()==null) || 
             (this.modelSpacePoint!=null &&
              this.modelSpacePoint.equals(other.getModelSpacePoint())));
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
        if (getModelSpacePoint() != null) {
            _hashCode += getModelSpacePoint().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Brick_corner010Type.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Brick_corner-010Type"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modelSpacePoint");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Model-space-point"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Model-space-pointType"));
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
