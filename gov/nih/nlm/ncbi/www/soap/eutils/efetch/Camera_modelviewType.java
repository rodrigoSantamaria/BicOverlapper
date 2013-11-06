/**
 * Camera_modelviewType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Camera_modelviewType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.GLMatrixType GLMatrix;

    public Camera_modelviewType() {
    }

    public Camera_modelviewType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.GLMatrixType GLMatrix) {
           this.GLMatrix = GLMatrix;
    }


    /**
     * Gets the GLMatrix value for this Camera_modelviewType.
     * 
     * @return GLMatrix
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.GLMatrixType getGLMatrix() {
        return GLMatrix;
    }


    /**
     * Sets the GLMatrix value for this Camera_modelviewType.
     * 
     * @param GLMatrix
     */
    public void setGLMatrix(gov.nih.nlm.ncbi.www.soap.eutils.efetch.GLMatrixType GLMatrix) {
        this.GLMatrix = GLMatrix;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Camera_modelviewType)) return false;
        Camera_modelviewType other = (Camera_modelviewType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.GLMatrix==null && other.getGLMatrix()==null) || 
             (this.GLMatrix!=null &&
              this.GLMatrix.equals(other.getGLMatrix())));
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
        if (getGLMatrix() != null) {
            _hashCode += getGLMatrix().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Camera_modelviewType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Camera_modelviewType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GLMatrix");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "GL-matrix"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "GL-matrixType"));
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
