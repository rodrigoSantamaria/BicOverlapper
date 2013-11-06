/**
 * Cn3DViewSettings_rotationCenterType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Cn3DViewSettings_rotationCenterType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DVectorType cn3DVector;

    public Cn3DViewSettings_rotationCenterType() {
    }

    public Cn3DViewSettings_rotationCenterType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DVectorType cn3DVector) {
           this.cn3DVector = cn3DVector;
    }


    /**
     * Gets the cn3DVector value for this Cn3DViewSettings_rotationCenterType.
     * 
     * @return cn3DVector
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DVectorType getCn3DVector() {
        return cn3DVector;
    }


    /**
     * Sets the cn3DVector value for this Cn3DViewSettings_rotationCenterType.
     * 
     * @param cn3DVector
     */
    public void setCn3DVector(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DVectorType cn3DVector) {
        this.cn3DVector = cn3DVector;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Cn3DViewSettings_rotationCenterType)) return false;
        Cn3DViewSettings_rotationCenterType other = (Cn3DViewSettings_rotationCenterType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cn3DVector==null && other.getCn3DVector()==null) || 
             (this.cn3DVector!=null &&
              this.cn3DVector.equals(other.getCn3DVector())));
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
        if (getCn3DVector() != null) {
            _hashCode += getCn3DVector().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Cn3DViewSettings_rotationCenterType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-view-settings_rotation-centerType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cn3DVector");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-vector"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-vectorType"));
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
