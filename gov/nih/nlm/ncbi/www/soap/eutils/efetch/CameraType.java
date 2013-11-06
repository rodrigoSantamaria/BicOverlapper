/**
 * CameraType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class CameraType  implements java.io.Serializable {
    private java.lang.String camera_x;

    private java.lang.String camera_y;

    private java.lang.String camera_distance;

    private java.lang.String camera_angle;

    private java.lang.String camera_scale;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Camera_modelviewType camera_modelview;

    public CameraType() {
    }

    public CameraType(
           java.lang.String camera_x,
           java.lang.String camera_y,
           java.lang.String camera_distance,
           java.lang.String camera_angle,
           java.lang.String camera_scale,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Camera_modelviewType camera_modelview) {
           this.camera_x = camera_x;
           this.camera_y = camera_y;
           this.camera_distance = camera_distance;
           this.camera_angle = camera_angle;
           this.camera_scale = camera_scale;
           this.camera_modelview = camera_modelview;
    }


    /**
     * Gets the camera_x value for this CameraType.
     * 
     * @return camera_x
     */
    public java.lang.String getCamera_x() {
        return camera_x;
    }


    /**
     * Sets the camera_x value for this CameraType.
     * 
     * @param camera_x
     */
    public void setCamera_x(java.lang.String camera_x) {
        this.camera_x = camera_x;
    }


    /**
     * Gets the camera_y value for this CameraType.
     * 
     * @return camera_y
     */
    public java.lang.String getCamera_y() {
        return camera_y;
    }


    /**
     * Sets the camera_y value for this CameraType.
     * 
     * @param camera_y
     */
    public void setCamera_y(java.lang.String camera_y) {
        this.camera_y = camera_y;
    }


    /**
     * Gets the camera_distance value for this CameraType.
     * 
     * @return camera_distance
     */
    public java.lang.String getCamera_distance() {
        return camera_distance;
    }


    /**
     * Sets the camera_distance value for this CameraType.
     * 
     * @param camera_distance
     */
    public void setCamera_distance(java.lang.String camera_distance) {
        this.camera_distance = camera_distance;
    }


    /**
     * Gets the camera_angle value for this CameraType.
     * 
     * @return camera_angle
     */
    public java.lang.String getCamera_angle() {
        return camera_angle;
    }


    /**
     * Sets the camera_angle value for this CameraType.
     * 
     * @param camera_angle
     */
    public void setCamera_angle(java.lang.String camera_angle) {
        this.camera_angle = camera_angle;
    }


    /**
     * Gets the camera_scale value for this CameraType.
     * 
     * @return camera_scale
     */
    public java.lang.String getCamera_scale() {
        return camera_scale;
    }


    /**
     * Sets the camera_scale value for this CameraType.
     * 
     * @param camera_scale
     */
    public void setCamera_scale(java.lang.String camera_scale) {
        this.camera_scale = camera_scale;
    }


    /**
     * Gets the camera_modelview value for this CameraType.
     * 
     * @return camera_modelview
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Camera_modelviewType getCamera_modelview() {
        return camera_modelview;
    }


    /**
     * Sets the camera_modelview value for this CameraType.
     * 
     * @param camera_modelview
     */
    public void setCamera_modelview(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Camera_modelviewType camera_modelview) {
        this.camera_modelview = camera_modelview;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CameraType)) return false;
        CameraType other = (CameraType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.camera_x==null && other.getCamera_x()==null) || 
             (this.camera_x!=null &&
              this.camera_x.equals(other.getCamera_x()))) &&
            ((this.camera_y==null && other.getCamera_y()==null) || 
             (this.camera_y!=null &&
              this.camera_y.equals(other.getCamera_y()))) &&
            ((this.camera_distance==null && other.getCamera_distance()==null) || 
             (this.camera_distance!=null &&
              this.camera_distance.equals(other.getCamera_distance()))) &&
            ((this.camera_angle==null && other.getCamera_angle()==null) || 
             (this.camera_angle!=null &&
              this.camera_angle.equals(other.getCamera_angle()))) &&
            ((this.camera_scale==null && other.getCamera_scale()==null) || 
             (this.camera_scale!=null &&
              this.camera_scale.equals(other.getCamera_scale()))) &&
            ((this.camera_modelview==null && other.getCamera_modelview()==null) || 
             (this.camera_modelview!=null &&
              this.camera_modelview.equals(other.getCamera_modelview())));
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
        if (getCamera_x() != null) {
            _hashCode += getCamera_x().hashCode();
        }
        if (getCamera_y() != null) {
            _hashCode += getCamera_y().hashCode();
        }
        if (getCamera_distance() != null) {
            _hashCode += getCamera_distance().hashCode();
        }
        if (getCamera_angle() != null) {
            _hashCode += getCamera_angle().hashCode();
        }
        if (getCamera_scale() != null) {
            _hashCode += getCamera_scale().hashCode();
        }
        if (getCamera_modelview() != null) {
            _hashCode += getCamera_modelview().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CameraType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "CameraType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("camera_x");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Camera_x"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("camera_y");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Camera_y"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("camera_distance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Camera_distance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("camera_angle");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Camera_angle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("camera_scale");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Camera_scale"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("camera_modelview");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Camera_modelview"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Camera_modelviewType"));
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
