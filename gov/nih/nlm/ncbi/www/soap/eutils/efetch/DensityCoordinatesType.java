/**
 * DensityCoordinatesType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class DensityCoordinatesType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.DensityCoordinates_contentsType densityCoordinates_contents;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.DensityCoordinates_gridCornersType densityCoordinates_gridCorners;

    private java.lang.String densityCoordinates_gridStepsX;

    private java.lang.String densityCoordinates_gridStepsY;

    private java.lang.String densityCoordinates_gridStepsZ;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.DensityCoordinates_fastestVaryingType densityCoordinates_fastestVarying;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.DensityCoordinates_slowestVaryingType densityCoordinates_slowestVarying;

    private java.lang.String densityCoordinates_scaleFactor;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.DensityCoordinates_densityType densityCoordinates_density;

    public DensityCoordinatesType() {
    }

    public DensityCoordinatesType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.DensityCoordinates_contentsType densityCoordinates_contents,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.DensityCoordinates_gridCornersType densityCoordinates_gridCorners,
           java.lang.String densityCoordinates_gridStepsX,
           java.lang.String densityCoordinates_gridStepsY,
           java.lang.String densityCoordinates_gridStepsZ,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.DensityCoordinates_fastestVaryingType densityCoordinates_fastestVarying,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.DensityCoordinates_slowestVaryingType densityCoordinates_slowestVarying,
           java.lang.String densityCoordinates_scaleFactor,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.DensityCoordinates_densityType densityCoordinates_density) {
           this.densityCoordinates_contents = densityCoordinates_contents;
           this.densityCoordinates_gridCorners = densityCoordinates_gridCorners;
           this.densityCoordinates_gridStepsX = densityCoordinates_gridStepsX;
           this.densityCoordinates_gridStepsY = densityCoordinates_gridStepsY;
           this.densityCoordinates_gridStepsZ = densityCoordinates_gridStepsZ;
           this.densityCoordinates_fastestVarying = densityCoordinates_fastestVarying;
           this.densityCoordinates_slowestVarying = densityCoordinates_slowestVarying;
           this.densityCoordinates_scaleFactor = densityCoordinates_scaleFactor;
           this.densityCoordinates_density = densityCoordinates_density;
    }


    /**
     * Gets the densityCoordinates_contents value for this DensityCoordinatesType.
     * 
     * @return densityCoordinates_contents
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.DensityCoordinates_contentsType getDensityCoordinates_contents() {
        return densityCoordinates_contents;
    }


    /**
     * Sets the densityCoordinates_contents value for this DensityCoordinatesType.
     * 
     * @param densityCoordinates_contents
     */
    public void setDensityCoordinates_contents(gov.nih.nlm.ncbi.www.soap.eutils.efetch.DensityCoordinates_contentsType densityCoordinates_contents) {
        this.densityCoordinates_contents = densityCoordinates_contents;
    }


    /**
     * Gets the densityCoordinates_gridCorners value for this DensityCoordinatesType.
     * 
     * @return densityCoordinates_gridCorners
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.DensityCoordinates_gridCornersType getDensityCoordinates_gridCorners() {
        return densityCoordinates_gridCorners;
    }


    /**
     * Sets the densityCoordinates_gridCorners value for this DensityCoordinatesType.
     * 
     * @param densityCoordinates_gridCorners
     */
    public void setDensityCoordinates_gridCorners(gov.nih.nlm.ncbi.www.soap.eutils.efetch.DensityCoordinates_gridCornersType densityCoordinates_gridCorners) {
        this.densityCoordinates_gridCorners = densityCoordinates_gridCorners;
    }


    /**
     * Gets the densityCoordinates_gridStepsX value for this DensityCoordinatesType.
     * 
     * @return densityCoordinates_gridStepsX
     */
    public java.lang.String getDensityCoordinates_gridStepsX() {
        return densityCoordinates_gridStepsX;
    }


    /**
     * Sets the densityCoordinates_gridStepsX value for this DensityCoordinatesType.
     * 
     * @param densityCoordinates_gridStepsX
     */
    public void setDensityCoordinates_gridStepsX(java.lang.String densityCoordinates_gridStepsX) {
        this.densityCoordinates_gridStepsX = densityCoordinates_gridStepsX;
    }


    /**
     * Gets the densityCoordinates_gridStepsY value for this DensityCoordinatesType.
     * 
     * @return densityCoordinates_gridStepsY
     */
    public java.lang.String getDensityCoordinates_gridStepsY() {
        return densityCoordinates_gridStepsY;
    }


    /**
     * Sets the densityCoordinates_gridStepsY value for this DensityCoordinatesType.
     * 
     * @param densityCoordinates_gridStepsY
     */
    public void setDensityCoordinates_gridStepsY(java.lang.String densityCoordinates_gridStepsY) {
        this.densityCoordinates_gridStepsY = densityCoordinates_gridStepsY;
    }


    /**
     * Gets the densityCoordinates_gridStepsZ value for this DensityCoordinatesType.
     * 
     * @return densityCoordinates_gridStepsZ
     */
    public java.lang.String getDensityCoordinates_gridStepsZ() {
        return densityCoordinates_gridStepsZ;
    }


    /**
     * Sets the densityCoordinates_gridStepsZ value for this DensityCoordinatesType.
     * 
     * @param densityCoordinates_gridStepsZ
     */
    public void setDensityCoordinates_gridStepsZ(java.lang.String densityCoordinates_gridStepsZ) {
        this.densityCoordinates_gridStepsZ = densityCoordinates_gridStepsZ;
    }


    /**
     * Gets the densityCoordinates_fastestVarying value for this DensityCoordinatesType.
     * 
     * @return densityCoordinates_fastestVarying
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.DensityCoordinates_fastestVaryingType getDensityCoordinates_fastestVarying() {
        return densityCoordinates_fastestVarying;
    }


    /**
     * Sets the densityCoordinates_fastestVarying value for this DensityCoordinatesType.
     * 
     * @param densityCoordinates_fastestVarying
     */
    public void setDensityCoordinates_fastestVarying(gov.nih.nlm.ncbi.www.soap.eutils.efetch.DensityCoordinates_fastestVaryingType densityCoordinates_fastestVarying) {
        this.densityCoordinates_fastestVarying = densityCoordinates_fastestVarying;
    }


    /**
     * Gets the densityCoordinates_slowestVarying value for this DensityCoordinatesType.
     * 
     * @return densityCoordinates_slowestVarying
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.DensityCoordinates_slowestVaryingType getDensityCoordinates_slowestVarying() {
        return densityCoordinates_slowestVarying;
    }


    /**
     * Sets the densityCoordinates_slowestVarying value for this DensityCoordinatesType.
     * 
     * @param densityCoordinates_slowestVarying
     */
    public void setDensityCoordinates_slowestVarying(gov.nih.nlm.ncbi.www.soap.eutils.efetch.DensityCoordinates_slowestVaryingType densityCoordinates_slowestVarying) {
        this.densityCoordinates_slowestVarying = densityCoordinates_slowestVarying;
    }


    /**
     * Gets the densityCoordinates_scaleFactor value for this DensityCoordinatesType.
     * 
     * @return densityCoordinates_scaleFactor
     */
    public java.lang.String getDensityCoordinates_scaleFactor() {
        return densityCoordinates_scaleFactor;
    }


    /**
     * Sets the densityCoordinates_scaleFactor value for this DensityCoordinatesType.
     * 
     * @param densityCoordinates_scaleFactor
     */
    public void setDensityCoordinates_scaleFactor(java.lang.String densityCoordinates_scaleFactor) {
        this.densityCoordinates_scaleFactor = densityCoordinates_scaleFactor;
    }


    /**
     * Gets the densityCoordinates_density value for this DensityCoordinatesType.
     * 
     * @return densityCoordinates_density
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.DensityCoordinates_densityType getDensityCoordinates_density() {
        return densityCoordinates_density;
    }


    /**
     * Sets the densityCoordinates_density value for this DensityCoordinatesType.
     * 
     * @param densityCoordinates_density
     */
    public void setDensityCoordinates_density(gov.nih.nlm.ncbi.www.soap.eutils.efetch.DensityCoordinates_densityType densityCoordinates_density) {
        this.densityCoordinates_density = densityCoordinates_density;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DensityCoordinatesType)) return false;
        DensityCoordinatesType other = (DensityCoordinatesType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.densityCoordinates_contents==null && other.getDensityCoordinates_contents()==null) || 
             (this.densityCoordinates_contents!=null &&
              this.densityCoordinates_contents.equals(other.getDensityCoordinates_contents()))) &&
            ((this.densityCoordinates_gridCorners==null && other.getDensityCoordinates_gridCorners()==null) || 
             (this.densityCoordinates_gridCorners!=null &&
              this.densityCoordinates_gridCorners.equals(other.getDensityCoordinates_gridCorners()))) &&
            ((this.densityCoordinates_gridStepsX==null && other.getDensityCoordinates_gridStepsX()==null) || 
             (this.densityCoordinates_gridStepsX!=null &&
              this.densityCoordinates_gridStepsX.equals(other.getDensityCoordinates_gridStepsX()))) &&
            ((this.densityCoordinates_gridStepsY==null && other.getDensityCoordinates_gridStepsY()==null) || 
             (this.densityCoordinates_gridStepsY!=null &&
              this.densityCoordinates_gridStepsY.equals(other.getDensityCoordinates_gridStepsY()))) &&
            ((this.densityCoordinates_gridStepsZ==null && other.getDensityCoordinates_gridStepsZ()==null) || 
             (this.densityCoordinates_gridStepsZ!=null &&
              this.densityCoordinates_gridStepsZ.equals(other.getDensityCoordinates_gridStepsZ()))) &&
            ((this.densityCoordinates_fastestVarying==null && other.getDensityCoordinates_fastestVarying()==null) || 
             (this.densityCoordinates_fastestVarying!=null &&
              this.densityCoordinates_fastestVarying.equals(other.getDensityCoordinates_fastestVarying()))) &&
            ((this.densityCoordinates_slowestVarying==null && other.getDensityCoordinates_slowestVarying()==null) || 
             (this.densityCoordinates_slowestVarying!=null &&
              this.densityCoordinates_slowestVarying.equals(other.getDensityCoordinates_slowestVarying()))) &&
            ((this.densityCoordinates_scaleFactor==null && other.getDensityCoordinates_scaleFactor()==null) || 
             (this.densityCoordinates_scaleFactor!=null &&
              this.densityCoordinates_scaleFactor.equals(other.getDensityCoordinates_scaleFactor()))) &&
            ((this.densityCoordinates_density==null && other.getDensityCoordinates_density()==null) || 
             (this.densityCoordinates_density!=null &&
              this.densityCoordinates_density.equals(other.getDensityCoordinates_density())));
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
        if (getDensityCoordinates_contents() != null) {
            _hashCode += getDensityCoordinates_contents().hashCode();
        }
        if (getDensityCoordinates_gridCorners() != null) {
            _hashCode += getDensityCoordinates_gridCorners().hashCode();
        }
        if (getDensityCoordinates_gridStepsX() != null) {
            _hashCode += getDensityCoordinates_gridStepsX().hashCode();
        }
        if (getDensityCoordinates_gridStepsY() != null) {
            _hashCode += getDensityCoordinates_gridStepsY().hashCode();
        }
        if (getDensityCoordinates_gridStepsZ() != null) {
            _hashCode += getDensityCoordinates_gridStepsZ().hashCode();
        }
        if (getDensityCoordinates_fastestVarying() != null) {
            _hashCode += getDensityCoordinates_fastestVarying().hashCode();
        }
        if (getDensityCoordinates_slowestVarying() != null) {
            _hashCode += getDensityCoordinates_slowestVarying().hashCode();
        }
        if (getDensityCoordinates_scaleFactor() != null) {
            _hashCode += getDensityCoordinates_scaleFactor().hashCode();
        }
        if (getDensityCoordinates_density() != null) {
            _hashCode += getDensityCoordinates_density().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DensityCoordinatesType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Density-coordinatesType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("densityCoordinates_contents");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Density-coordinates_contents"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Density-coordinates_contentsType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("densityCoordinates_gridCorners");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Density-coordinates_grid-corners"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Density-coordinates_grid-cornersType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("densityCoordinates_gridStepsX");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Density-coordinates_grid-steps-x"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("densityCoordinates_gridStepsY");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Density-coordinates_grid-steps-y"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("densityCoordinates_gridStepsZ");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Density-coordinates_grid-steps-z"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("densityCoordinates_fastestVarying");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Density-coordinates_fastest-varying"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Density-coordinates_fastest-varyingType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("densityCoordinates_slowestVarying");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Density-coordinates_slowest-varying"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Density-coordinates_slowest-varyingType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("densityCoordinates_scaleFactor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Density-coordinates_scale-factor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("densityCoordinates_density");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Density-coordinates_density"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Density-coordinates_densityType"));
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
