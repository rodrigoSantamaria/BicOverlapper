/**
 * TMeshType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class TMeshType  implements java.io.Serializable {
    private java.lang.String TMesh_numberOfPoints;

    private java.lang.String TMesh_scaleFactor;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.TMesh_swapType TMesh_swap;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.TMesh_xType TMesh_x;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.TMesh_yType TMesh_y;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.TMesh_zType TMesh_z;

    public TMeshType() {
    }

    public TMeshType(
           java.lang.String TMesh_numberOfPoints,
           java.lang.String TMesh_scaleFactor,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.TMesh_swapType TMesh_swap,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.TMesh_xType TMesh_x,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.TMesh_yType TMesh_y,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.TMesh_zType TMesh_z) {
           this.TMesh_numberOfPoints = TMesh_numberOfPoints;
           this.TMesh_scaleFactor = TMesh_scaleFactor;
           this.TMesh_swap = TMesh_swap;
           this.TMesh_x = TMesh_x;
           this.TMesh_y = TMesh_y;
           this.TMesh_z = TMesh_z;
    }


    /**
     * Gets the TMesh_numberOfPoints value for this TMeshType.
     * 
     * @return TMesh_numberOfPoints
     */
    public java.lang.String getTMesh_numberOfPoints() {
        return TMesh_numberOfPoints;
    }


    /**
     * Sets the TMesh_numberOfPoints value for this TMeshType.
     * 
     * @param TMesh_numberOfPoints
     */
    public void setTMesh_numberOfPoints(java.lang.String TMesh_numberOfPoints) {
        this.TMesh_numberOfPoints = TMesh_numberOfPoints;
    }


    /**
     * Gets the TMesh_scaleFactor value for this TMeshType.
     * 
     * @return TMesh_scaleFactor
     */
    public java.lang.String getTMesh_scaleFactor() {
        return TMesh_scaleFactor;
    }


    /**
     * Sets the TMesh_scaleFactor value for this TMeshType.
     * 
     * @param TMesh_scaleFactor
     */
    public void setTMesh_scaleFactor(java.lang.String TMesh_scaleFactor) {
        this.TMesh_scaleFactor = TMesh_scaleFactor;
    }


    /**
     * Gets the TMesh_swap value for this TMeshType.
     * 
     * @return TMesh_swap
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.TMesh_swapType getTMesh_swap() {
        return TMesh_swap;
    }


    /**
     * Sets the TMesh_swap value for this TMeshType.
     * 
     * @param TMesh_swap
     */
    public void setTMesh_swap(gov.nih.nlm.ncbi.www.soap.eutils.efetch.TMesh_swapType TMesh_swap) {
        this.TMesh_swap = TMesh_swap;
    }


    /**
     * Gets the TMesh_x value for this TMeshType.
     * 
     * @return TMesh_x
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.TMesh_xType getTMesh_x() {
        return TMesh_x;
    }


    /**
     * Sets the TMesh_x value for this TMeshType.
     * 
     * @param TMesh_x
     */
    public void setTMesh_x(gov.nih.nlm.ncbi.www.soap.eutils.efetch.TMesh_xType TMesh_x) {
        this.TMesh_x = TMesh_x;
    }


    /**
     * Gets the TMesh_y value for this TMeshType.
     * 
     * @return TMesh_y
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.TMesh_yType getTMesh_y() {
        return TMesh_y;
    }


    /**
     * Sets the TMesh_y value for this TMeshType.
     * 
     * @param TMesh_y
     */
    public void setTMesh_y(gov.nih.nlm.ncbi.www.soap.eutils.efetch.TMesh_yType TMesh_y) {
        this.TMesh_y = TMesh_y;
    }


    /**
     * Gets the TMesh_z value for this TMeshType.
     * 
     * @return TMesh_z
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.TMesh_zType getTMesh_z() {
        return TMesh_z;
    }


    /**
     * Sets the TMesh_z value for this TMeshType.
     * 
     * @param TMesh_z
     */
    public void setTMesh_z(gov.nih.nlm.ncbi.www.soap.eutils.efetch.TMesh_zType TMesh_z) {
        this.TMesh_z = TMesh_z;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TMeshType)) return false;
        TMeshType other = (TMeshType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.TMesh_numberOfPoints==null && other.getTMesh_numberOfPoints()==null) || 
             (this.TMesh_numberOfPoints!=null &&
              this.TMesh_numberOfPoints.equals(other.getTMesh_numberOfPoints()))) &&
            ((this.TMesh_scaleFactor==null && other.getTMesh_scaleFactor()==null) || 
             (this.TMesh_scaleFactor!=null &&
              this.TMesh_scaleFactor.equals(other.getTMesh_scaleFactor()))) &&
            ((this.TMesh_swap==null && other.getTMesh_swap()==null) || 
             (this.TMesh_swap!=null &&
              this.TMesh_swap.equals(other.getTMesh_swap()))) &&
            ((this.TMesh_x==null && other.getTMesh_x()==null) || 
             (this.TMesh_x!=null &&
              this.TMesh_x.equals(other.getTMesh_x()))) &&
            ((this.TMesh_y==null && other.getTMesh_y()==null) || 
             (this.TMesh_y!=null &&
              this.TMesh_y.equals(other.getTMesh_y()))) &&
            ((this.TMesh_z==null && other.getTMesh_z()==null) || 
             (this.TMesh_z!=null &&
              this.TMesh_z.equals(other.getTMesh_z())));
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
        if (getTMesh_numberOfPoints() != null) {
            _hashCode += getTMesh_numberOfPoints().hashCode();
        }
        if (getTMesh_scaleFactor() != null) {
            _hashCode += getTMesh_scaleFactor().hashCode();
        }
        if (getTMesh_swap() != null) {
            _hashCode += getTMesh_swap().hashCode();
        }
        if (getTMesh_x() != null) {
            _hashCode += getTMesh_x().hashCode();
        }
        if (getTMesh_y() != null) {
            _hashCode += getTMesh_y().hashCode();
        }
        if (getTMesh_z() != null) {
            _hashCode += getTMesh_z().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TMeshType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "T-meshType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TMesh_numberOfPoints");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "T-mesh_number-of-points"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TMesh_scaleFactor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "T-mesh_scale-factor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TMesh_swap");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "T-mesh_swap"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "T-mesh_swapType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TMesh_x");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "T-mesh_x"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "T-mesh_xType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TMesh_y");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "T-mesh_y"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "T-mesh_yType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TMesh_z");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "T-mesh_z"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "T-mesh_zType"));
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
