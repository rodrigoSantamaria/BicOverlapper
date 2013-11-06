/**
 * ModelSpaceType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ModelSpaceType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ModelSpace_coordinateUnitsType modelSpace_coordinateUnits;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ModelSpace_thermalFactorUnitsType modelSpace_thermalFactorUnits;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ModelSpace_occupancyFactorUnitsType modelSpace_occupancyFactorUnits;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ModelSpace_densityUnitsType modelSpace_densityUnits;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ModelSpace_referenceFrameType modelSpace_referenceFrame;

    public ModelSpaceType() {
    }

    public ModelSpaceType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ModelSpace_coordinateUnitsType modelSpace_coordinateUnits,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ModelSpace_thermalFactorUnitsType modelSpace_thermalFactorUnits,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ModelSpace_occupancyFactorUnitsType modelSpace_occupancyFactorUnits,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ModelSpace_densityUnitsType modelSpace_densityUnits,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ModelSpace_referenceFrameType modelSpace_referenceFrame) {
           this.modelSpace_coordinateUnits = modelSpace_coordinateUnits;
           this.modelSpace_thermalFactorUnits = modelSpace_thermalFactorUnits;
           this.modelSpace_occupancyFactorUnits = modelSpace_occupancyFactorUnits;
           this.modelSpace_densityUnits = modelSpace_densityUnits;
           this.modelSpace_referenceFrame = modelSpace_referenceFrame;
    }


    /**
     * Gets the modelSpace_coordinateUnits value for this ModelSpaceType.
     * 
     * @return modelSpace_coordinateUnits
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ModelSpace_coordinateUnitsType getModelSpace_coordinateUnits() {
        return modelSpace_coordinateUnits;
    }


    /**
     * Sets the modelSpace_coordinateUnits value for this ModelSpaceType.
     * 
     * @param modelSpace_coordinateUnits
     */
    public void setModelSpace_coordinateUnits(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ModelSpace_coordinateUnitsType modelSpace_coordinateUnits) {
        this.modelSpace_coordinateUnits = modelSpace_coordinateUnits;
    }


    /**
     * Gets the modelSpace_thermalFactorUnits value for this ModelSpaceType.
     * 
     * @return modelSpace_thermalFactorUnits
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ModelSpace_thermalFactorUnitsType getModelSpace_thermalFactorUnits() {
        return modelSpace_thermalFactorUnits;
    }


    /**
     * Sets the modelSpace_thermalFactorUnits value for this ModelSpaceType.
     * 
     * @param modelSpace_thermalFactorUnits
     */
    public void setModelSpace_thermalFactorUnits(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ModelSpace_thermalFactorUnitsType modelSpace_thermalFactorUnits) {
        this.modelSpace_thermalFactorUnits = modelSpace_thermalFactorUnits;
    }


    /**
     * Gets the modelSpace_occupancyFactorUnits value for this ModelSpaceType.
     * 
     * @return modelSpace_occupancyFactorUnits
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ModelSpace_occupancyFactorUnitsType getModelSpace_occupancyFactorUnits() {
        return modelSpace_occupancyFactorUnits;
    }


    /**
     * Sets the modelSpace_occupancyFactorUnits value for this ModelSpaceType.
     * 
     * @param modelSpace_occupancyFactorUnits
     */
    public void setModelSpace_occupancyFactorUnits(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ModelSpace_occupancyFactorUnitsType modelSpace_occupancyFactorUnits) {
        this.modelSpace_occupancyFactorUnits = modelSpace_occupancyFactorUnits;
    }


    /**
     * Gets the modelSpace_densityUnits value for this ModelSpaceType.
     * 
     * @return modelSpace_densityUnits
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ModelSpace_densityUnitsType getModelSpace_densityUnits() {
        return modelSpace_densityUnits;
    }


    /**
     * Sets the modelSpace_densityUnits value for this ModelSpaceType.
     * 
     * @param modelSpace_densityUnits
     */
    public void setModelSpace_densityUnits(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ModelSpace_densityUnitsType modelSpace_densityUnits) {
        this.modelSpace_densityUnits = modelSpace_densityUnits;
    }


    /**
     * Gets the modelSpace_referenceFrame value for this ModelSpaceType.
     * 
     * @return modelSpace_referenceFrame
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ModelSpace_referenceFrameType getModelSpace_referenceFrame() {
        return modelSpace_referenceFrame;
    }


    /**
     * Sets the modelSpace_referenceFrame value for this ModelSpaceType.
     * 
     * @param modelSpace_referenceFrame
     */
    public void setModelSpace_referenceFrame(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ModelSpace_referenceFrameType modelSpace_referenceFrame) {
        this.modelSpace_referenceFrame = modelSpace_referenceFrame;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ModelSpaceType)) return false;
        ModelSpaceType other = (ModelSpaceType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.modelSpace_coordinateUnits==null && other.getModelSpace_coordinateUnits()==null) || 
             (this.modelSpace_coordinateUnits!=null &&
              this.modelSpace_coordinateUnits.equals(other.getModelSpace_coordinateUnits()))) &&
            ((this.modelSpace_thermalFactorUnits==null && other.getModelSpace_thermalFactorUnits()==null) || 
             (this.modelSpace_thermalFactorUnits!=null &&
              this.modelSpace_thermalFactorUnits.equals(other.getModelSpace_thermalFactorUnits()))) &&
            ((this.modelSpace_occupancyFactorUnits==null && other.getModelSpace_occupancyFactorUnits()==null) || 
             (this.modelSpace_occupancyFactorUnits!=null &&
              this.modelSpace_occupancyFactorUnits.equals(other.getModelSpace_occupancyFactorUnits()))) &&
            ((this.modelSpace_densityUnits==null && other.getModelSpace_densityUnits()==null) || 
             (this.modelSpace_densityUnits!=null &&
              this.modelSpace_densityUnits.equals(other.getModelSpace_densityUnits()))) &&
            ((this.modelSpace_referenceFrame==null && other.getModelSpace_referenceFrame()==null) || 
             (this.modelSpace_referenceFrame!=null &&
              this.modelSpace_referenceFrame.equals(other.getModelSpace_referenceFrame())));
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
        if (getModelSpace_coordinateUnits() != null) {
            _hashCode += getModelSpace_coordinateUnits().hashCode();
        }
        if (getModelSpace_thermalFactorUnits() != null) {
            _hashCode += getModelSpace_thermalFactorUnits().hashCode();
        }
        if (getModelSpace_occupancyFactorUnits() != null) {
            _hashCode += getModelSpace_occupancyFactorUnits().hashCode();
        }
        if (getModelSpace_densityUnits() != null) {
            _hashCode += getModelSpace_densityUnits().hashCode();
        }
        if (getModelSpace_referenceFrame() != null) {
            _hashCode += getModelSpace_referenceFrame().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ModelSpaceType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Model-spaceType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modelSpace_coordinateUnits");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Model-space_coordinate-units"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Model-space_coordinate-unitsType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modelSpace_thermalFactorUnits");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Model-space_thermal-factor-units"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Model-space_thermal-factor-unitsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modelSpace_occupancyFactorUnits");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Model-space_occupancy-factor-units"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Model-space_occupancy-factor-unitsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modelSpace_densityUnits");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Model-space_density-units"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Model-space_density-unitsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modelSpace_referenceFrame");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Model-space_reference-frame"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Model-space_reference-frameType"));
        elemField.setMinOccurs(0);
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
