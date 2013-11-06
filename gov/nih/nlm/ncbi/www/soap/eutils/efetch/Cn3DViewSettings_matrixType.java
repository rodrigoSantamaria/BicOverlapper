/**
 * Cn3DViewSettings_matrixType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Cn3DViewSettings_matrixType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DGLMatrixType cn3DGLMatrix;

    public Cn3DViewSettings_matrixType() {
    }

    public Cn3DViewSettings_matrixType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DGLMatrixType cn3DGLMatrix) {
           this.cn3DGLMatrix = cn3DGLMatrix;
    }


    /**
     * Gets the cn3DGLMatrix value for this Cn3DViewSettings_matrixType.
     * 
     * @return cn3DGLMatrix
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DGLMatrixType getCn3DGLMatrix() {
        return cn3DGLMatrix;
    }


    /**
     * Sets the cn3DGLMatrix value for this Cn3DViewSettings_matrixType.
     * 
     * @param cn3DGLMatrix
     */
    public void setCn3DGLMatrix(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DGLMatrixType cn3DGLMatrix) {
        this.cn3DGLMatrix = cn3DGLMatrix;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Cn3DViewSettings_matrixType)) return false;
        Cn3DViewSettings_matrixType other = (Cn3DViewSettings_matrixType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cn3DGLMatrix==null && other.getCn3DGLMatrix()==null) || 
             (this.cn3DGLMatrix!=null &&
              this.cn3DGLMatrix.equals(other.getCn3DGLMatrix())));
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
        if (getCn3DGLMatrix() != null) {
            _hashCode += getCn3DGLMatrix().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Cn3DViewSettings_matrixType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-view-settings_matrixType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cn3DGLMatrix");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-GL-matrix"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-GL-matrixType"));
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
