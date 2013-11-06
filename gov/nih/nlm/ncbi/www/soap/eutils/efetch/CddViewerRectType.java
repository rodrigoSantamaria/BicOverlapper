/**
 * CddViewerRectType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class CddViewerRectType  implements java.io.Serializable {
    private java.lang.String cddViewerRect_top;

    private java.lang.String cddViewerRect_left;

    private java.lang.String cddViewerRect_width;

    private java.lang.String cddViewerRect_height;

    public CddViewerRectType() {
    }

    public CddViewerRectType(
           java.lang.String cddViewerRect_top,
           java.lang.String cddViewerRect_left,
           java.lang.String cddViewerRect_width,
           java.lang.String cddViewerRect_height) {
           this.cddViewerRect_top = cddViewerRect_top;
           this.cddViewerRect_left = cddViewerRect_left;
           this.cddViewerRect_width = cddViewerRect_width;
           this.cddViewerRect_height = cddViewerRect_height;
    }


    /**
     * Gets the cddViewerRect_top value for this CddViewerRectType.
     * 
     * @return cddViewerRect_top
     */
    public java.lang.String getCddViewerRect_top() {
        return cddViewerRect_top;
    }


    /**
     * Sets the cddViewerRect_top value for this CddViewerRectType.
     * 
     * @param cddViewerRect_top
     */
    public void setCddViewerRect_top(java.lang.String cddViewerRect_top) {
        this.cddViewerRect_top = cddViewerRect_top;
    }


    /**
     * Gets the cddViewerRect_left value for this CddViewerRectType.
     * 
     * @return cddViewerRect_left
     */
    public java.lang.String getCddViewerRect_left() {
        return cddViewerRect_left;
    }


    /**
     * Sets the cddViewerRect_left value for this CddViewerRectType.
     * 
     * @param cddViewerRect_left
     */
    public void setCddViewerRect_left(java.lang.String cddViewerRect_left) {
        this.cddViewerRect_left = cddViewerRect_left;
    }


    /**
     * Gets the cddViewerRect_width value for this CddViewerRectType.
     * 
     * @return cddViewerRect_width
     */
    public java.lang.String getCddViewerRect_width() {
        return cddViewerRect_width;
    }


    /**
     * Sets the cddViewerRect_width value for this CddViewerRectType.
     * 
     * @param cddViewerRect_width
     */
    public void setCddViewerRect_width(java.lang.String cddViewerRect_width) {
        this.cddViewerRect_width = cddViewerRect_width;
    }


    /**
     * Gets the cddViewerRect_height value for this CddViewerRectType.
     * 
     * @return cddViewerRect_height
     */
    public java.lang.String getCddViewerRect_height() {
        return cddViewerRect_height;
    }


    /**
     * Sets the cddViewerRect_height value for this CddViewerRectType.
     * 
     * @param cddViewerRect_height
     */
    public void setCddViewerRect_height(java.lang.String cddViewerRect_height) {
        this.cddViewerRect_height = cddViewerRect_height;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CddViewerRectType)) return false;
        CddViewerRectType other = (CddViewerRectType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cddViewerRect_top==null && other.getCddViewerRect_top()==null) || 
             (this.cddViewerRect_top!=null &&
              this.cddViewerRect_top.equals(other.getCddViewerRect_top()))) &&
            ((this.cddViewerRect_left==null && other.getCddViewerRect_left()==null) || 
             (this.cddViewerRect_left!=null &&
              this.cddViewerRect_left.equals(other.getCddViewerRect_left()))) &&
            ((this.cddViewerRect_width==null && other.getCddViewerRect_width()==null) || 
             (this.cddViewerRect_width!=null &&
              this.cddViewerRect_width.equals(other.getCddViewerRect_width()))) &&
            ((this.cddViewerRect_height==null && other.getCddViewerRect_height()==null) || 
             (this.cddViewerRect_height!=null &&
              this.cddViewerRect_height.equals(other.getCddViewerRect_height())));
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
        if (getCddViewerRect_top() != null) {
            _hashCode += getCddViewerRect_top().hashCode();
        }
        if (getCddViewerRect_left() != null) {
            _hashCode += getCddViewerRect_left().hashCode();
        }
        if (getCddViewerRect_width() != null) {
            _hashCode += getCddViewerRect_width().hashCode();
        }
        if (getCddViewerRect_height() != null) {
            _hashCode += getCddViewerRect_height().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CddViewerRectType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdd-Viewer-RectType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cddViewerRect_top");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdd-Viewer-Rect_top"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cddViewerRect_left");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdd-Viewer-Rect_left"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cddViewerRect_width");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdd-Viewer-Rect_width"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cddViewerRect_height");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdd-Viewer-Rect_height"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
