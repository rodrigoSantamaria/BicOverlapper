/**
 * CylinderType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class CylinderType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cylinder_axisTopType cylinder_axisTop;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cylinder_axisBottomType cylinder_axisBottom;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cylinder_radiusType cylinder_radius;

    public CylinderType() {
    }

    public CylinderType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cylinder_axisTopType cylinder_axisTop,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cylinder_axisBottomType cylinder_axisBottom,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cylinder_radiusType cylinder_radius) {
           this.cylinder_axisTop = cylinder_axisTop;
           this.cylinder_axisBottom = cylinder_axisBottom;
           this.cylinder_radius = cylinder_radius;
    }


    /**
     * Gets the cylinder_axisTop value for this CylinderType.
     * 
     * @return cylinder_axisTop
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cylinder_axisTopType getCylinder_axisTop() {
        return cylinder_axisTop;
    }


    /**
     * Sets the cylinder_axisTop value for this CylinderType.
     * 
     * @param cylinder_axisTop
     */
    public void setCylinder_axisTop(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cylinder_axisTopType cylinder_axisTop) {
        this.cylinder_axisTop = cylinder_axisTop;
    }


    /**
     * Gets the cylinder_axisBottom value for this CylinderType.
     * 
     * @return cylinder_axisBottom
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cylinder_axisBottomType getCylinder_axisBottom() {
        return cylinder_axisBottom;
    }


    /**
     * Sets the cylinder_axisBottom value for this CylinderType.
     * 
     * @param cylinder_axisBottom
     */
    public void setCylinder_axisBottom(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cylinder_axisBottomType cylinder_axisBottom) {
        this.cylinder_axisBottom = cylinder_axisBottom;
    }


    /**
     * Gets the cylinder_radius value for this CylinderType.
     * 
     * @return cylinder_radius
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cylinder_radiusType getCylinder_radius() {
        return cylinder_radius;
    }


    /**
     * Sets the cylinder_radius value for this CylinderType.
     * 
     * @param cylinder_radius
     */
    public void setCylinder_radius(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cylinder_radiusType cylinder_radius) {
        this.cylinder_radius = cylinder_radius;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CylinderType)) return false;
        CylinderType other = (CylinderType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cylinder_axisTop==null && other.getCylinder_axisTop()==null) || 
             (this.cylinder_axisTop!=null &&
              this.cylinder_axisTop.equals(other.getCylinder_axisTop()))) &&
            ((this.cylinder_axisBottom==null && other.getCylinder_axisBottom()==null) || 
             (this.cylinder_axisBottom!=null &&
              this.cylinder_axisBottom.equals(other.getCylinder_axisBottom()))) &&
            ((this.cylinder_radius==null && other.getCylinder_radius()==null) || 
             (this.cylinder_radius!=null &&
              this.cylinder_radius.equals(other.getCylinder_radius())));
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
        if (getCylinder_axisTop() != null) {
            _hashCode += getCylinder_axisTop().hashCode();
        }
        if (getCylinder_axisBottom() != null) {
            _hashCode += getCylinder_axisBottom().hashCode();
        }
        if (getCylinder_radius() != null) {
            _hashCode += getCylinder_radius().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CylinderType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "CylinderType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cylinder_axisTop");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cylinder_axis-top"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cylinder_axis-topType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cylinder_axisBottom");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cylinder_axis-bottom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cylinder_axis-bottomType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cylinder_radius");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cylinder_radius"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cylinder_radiusType"));
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
