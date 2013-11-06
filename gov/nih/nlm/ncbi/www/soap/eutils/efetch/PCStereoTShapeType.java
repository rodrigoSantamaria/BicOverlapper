/**
 * PCStereoTShapeType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class PCStereoTShapeType  implements java.io.Serializable {
    private java.lang.String PCStereoTShape_center;

    private java.lang.String PCStereoTShape_top;

    private java.lang.String PCStereoTShape_bottom;

    private java.lang.String PCStereoTShape_above;

    public PCStereoTShapeType() {
    }

    public PCStereoTShapeType(
           java.lang.String PCStereoTShape_center,
           java.lang.String PCStereoTShape_top,
           java.lang.String PCStereoTShape_bottom,
           java.lang.String PCStereoTShape_above) {
           this.PCStereoTShape_center = PCStereoTShape_center;
           this.PCStereoTShape_top = PCStereoTShape_top;
           this.PCStereoTShape_bottom = PCStereoTShape_bottom;
           this.PCStereoTShape_above = PCStereoTShape_above;
    }


    /**
     * Gets the PCStereoTShape_center value for this PCStereoTShapeType.
     * 
     * @return PCStereoTShape_center
     */
    public java.lang.String getPCStereoTShape_center() {
        return PCStereoTShape_center;
    }


    /**
     * Sets the PCStereoTShape_center value for this PCStereoTShapeType.
     * 
     * @param PCStereoTShape_center
     */
    public void setPCStereoTShape_center(java.lang.String PCStereoTShape_center) {
        this.PCStereoTShape_center = PCStereoTShape_center;
    }


    /**
     * Gets the PCStereoTShape_top value for this PCStereoTShapeType.
     * 
     * @return PCStereoTShape_top
     */
    public java.lang.String getPCStereoTShape_top() {
        return PCStereoTShape_top;
    }


    /**
     * Sets the PCStereoTShape_top value for this PCStereoTShapeType.
     * 
     * @param PCStereoTShape_top
     */
    public void setPCStereoTShape_top(java.lang.String PCStereoTShape_top) {
        this.PCStereoTShape_top = PCStereoTShape_top;
    }


    /**
     * Gets the PCStereoTShape_bottom value for this PCStereoTShapeType.
     * 
     * @return PCStereoTShape_bottom
     */
    public java.lang.String getPCStereoTShape_bottom() {
        return PCStereoTShape_bottom;
    }


    /**
     * Sets the PCStereoTShape_bottom value for this PCStereoTShapeType.
     * 
     * @param PCStereoTShape_bottom
     */
    public void setPCStereoTShape_bottom(java.lang.String PCStereoTShape_bottom) {
        this.PCStereoTShape_bottom = PCStereoTShape_bottom;
    }


    /**
     * Gets the PCStereoTShape_above value for this PCStereoTShapeType.
     * 
     * @return PCStereoTShape_above
     */
    public java.lang.String getPCStereoTShape_above() {
        return PCStereoTShape_above;
    }


    /**
     * Sets the PCStereoTShape_above value for this PCStereoTShapeType.
     * 
     * @param PCStereoTShape_above
     */
    public void setPCStereoTShape_above(java.lang.String PCStereoTShape_above) {
        this.PCStereoTShape_above = PCStereoTShape_above;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PCStereoTShapeType)) return false;
        PCStereoTShapeType other = (PCStereoTShapeType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.PCStereoTShape_center==null && other.getPCStereoTShape_center()==null) || 
             (this.PCStereoTShape_center!=null &&
              this.PCStereoTShape_center.equals(other.getPCStereoTShape_center()))) &&
            ((this.PCStereoTShape_top==null && other.getPCStereoTShape_top()==null) || 
             (this.PCStereoTShape_top!=null &&
              this.PCStereoTShape_top.equals(other.getPCStereoTShape_top()))) &&
            ((this.PCStereoTShape_bottom==null && other.getPCStereoTShape_bottom()==null) || 
             (this.PCStereoTShape_bottom!=null &&
              this.PCStereoTShape_bottom.equals(other.getPCStereoTShape_bottom()))) &&
            ((this.PCStereoTShape_above==null && other.getPCStereoTShape_above()==null) || 
             (this.PCStereoTShape_above!=null &&
              this.PCStereoTShape_above.equals(other.getPCStereoTShape_above())));
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
        if (getPCStereoTShape_center() != null) {
            _hashCode += getPCStereoTShape_center().hashCode();
        }
        if (getPCStereoTShape_top() != null) {
            _hashCode += getPCStereoTShape_top().hashCode();
        }
        if (getPCStereoTShape_bottom() != null) {
            _hashCode += getPCStereoTShape_bottom().hashCode();
        }
        if (getPCStereoTShape_above() != null) {
            _hashCode += getPCStereoTShape_above().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PCStereoTShapeType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-StereoTShapeType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCStereoTShape_center");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-StereoTShape_center"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCStereoTShape_top");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-StereoTShape_top"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCStereoTShape_bottom");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-StereoTShape_bottom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCStereoTShape_above");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-StereoTShape_above"));
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
