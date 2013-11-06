/**
 * SurfaceCoordinates_surface_tmeshType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class SurfaceCoordinates_surface_tmeshType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.TMeshType TMesh;

    public SurfaceCoordinates_surface_tmeshType() {
    }

    public SurfaceCoordinates_surface_tmeshType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.TMeshType TMesh) {
           this.TMesh = TMesh;
    }


    /**
     * Gets the TMesh value for this SurfaceCoordinates_surface_tmeshType.
     * 
     * @return TMesh
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.TMeshType getTMesh() {
        return TMesh;
    }


    /**
     * Sets the TMesh value for this SurfaceCoordinates_surface_tmeshType.
     * 
     * @param TMesh
     */
    public void setTMesh(gov.nih.nlm.ncbi.www.soap.eutils.efetch.TMeshType TMesh) {
        this.TMesh = TMesh;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SurfaceCoordinates_surface_tmeshType)) return false;
        SurfaceCoordinates_surface_tmeshType other = (SurfaceCoordinates_surface_tmeshType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.TMesh==null && other.getTMesh()==null) || 
             (this.TMesh!=null &&
              this.TMesh.equals(other.getTMesh())));
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
        if (getTMesh() != null) {
            _hashCode += getTMesh().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SurfaceCoordinates_surface_tmeshType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Surface-coordinates_surface_tmeshType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TMesh");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "T-mesh"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "T-meshType"));
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
