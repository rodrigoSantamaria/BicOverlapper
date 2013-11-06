/**
 * PCCoordinatesType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class PCCoordinatesType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCCoordinates_typeType PCCoordinates_type;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCCoordinates_aidType PCCoordinates_aid;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCCoordinates_conformersType PCCoordinates_conformers;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCCoordinates_atomlabelsType PCCoordinates_atomlabels;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCCoordinates_dataType PCCoordinates_data;

    public PCCoordinatesType() {
    }

    public PCCoordinatesType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCCoordinates_typeType PCCoordinates_type,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCCoordinates_aidType PCCoordinates_aid,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCCoordinates_conformersType PCCoordinates_conformers,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCCoordinates_atomlabelsType PCCoordinates_atomlabels,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCCoordinates_dataType PCCoordinates_data) {
           this.PCCoordinates_type = PCCoordinates_type;
           this.PCCoordinates_aid = PCCoordinates_aid;
           this.PCCoordinates_conformers = PCCoordinates_conformers;
           this.PCCoordinates_atomlabels = PCCoordinates_atomlabels;
           this.PCCoordinates_data = PCCoordinates_data;
    }


    /**
     * Gets the PCCoordinates_type value for this PCCoordinatesType.
     * 
     * @return PCCoordinates_type
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCCoordinates_typeType getPCCoordinates_type() {
        return PCCoordinates_type;
    }


    /**
     * Sets the PCCoordinates_type value for this PCCoordinatesType.
     * 
     * @param PCCoordinates_type
     */
    public void setPCCoordinates_type(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCCoordinates_typeType PCCoordinates_type) {
        this.PCCoordinates_type = PCCoordinates_type;
    }


    /**
     * Gets the PCCoordinates_aid value for this PCCoordinatesType.
     * 
     * @return PCCoordinates_aid
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCCoordinates_aidType getPCCoordinates_aid() {
        return PCCoordinates_aid;
    }


    /**
     * Sets the PCCoordinates_aid value for this PCCoordinatesType.
     * 
     * @param PCCoordinates_aid
     */
    public void setPCCoordinates_aid(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCCoordinates_aidType PCCoordinates_aid) {
        this.PCCoordinates_aid = PCCoordinates_aid;
    }


    /**
     * Gets the PCCoordinates_conformers value for this PCCoordinatesType.
     * 
     * @return PCCoordinates_conformers
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCCoordinates_conformersType getPCCoordinates_conformers() {
        return PCCoordinates_conformers;
    }


    /**
     * Sets the PCCoordinates_conformers value for this PCCoordinatesType.
     * 
     * @param PCCoordinates_conformers
     */
    public void setPCCoordinates_conformers(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCCoordinates_conformersType PCCoordinates_conformers) {
        this.PCCoordinates_conformers = PCCoordinates_conformers;
    }


    /**
     * Gets the PCCoordinates_atomlabels value for this PCCoordinatesType.
     * 
     * @return PCCoordinates_atomlabels
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCCoordinates_atomlabelsType getPCCoordinates_atomlabels() {
        return PCCoordinates_atomlabels;
    }


    /**
     * Sets the PCCoordinates_atomlabels value for this PCCoordinatesType.
     * 
     * @param PCCoordinates_atomlabels
     */
    public void setPCCoordinates_atomlabels(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCCoordinates_atomlabelsType PCCoordinates_atomlabels) {
        this.PCCoordinates_atomlabels = PCCoordinates_atomlabels;
    }


    /**
     * Gets the PCCoordinates_data value for this PCCoordinatesType.
     * 
     * @return PCCoordinates_data
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCCoordinates_dataType getPCCoordinates_data() {
        return PCCoordinates_data;
    }


    /**
     * Sets the PCCoordinates_data value for this PCCoordinatesType.
     * 
     * @param PCCoordinates_data
     */
    public void setPCCoordinates_data(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCCoordinates_dataType PCCoordinates_data) {
        this.PCCoordinates_data = PCCoordinates_data;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PCCoordinatesType)) return false;
        PCCoordinatesType other = (PCCoordinatesType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.PCCoordinates_type==null && other.getPCCoordinates_type()==null) || 
             (this.PCCoordinates_type!=null &&
              this.PCCoordinates_type.equals(other.getPCCoordinates_type()))) &&
            ((this.PCCoordinates_aid==null && other.getPCCoordinates_aid()==null) || 
             (this.PCCoordinates_aid!=null &&
              this.PCCoordinates_aid.equals(other.getPCCoordinates_aid()))) &&
            ((this.PCCoordinates_conformers==null && other.getPCCoordinates_conformers()==null) || 
             (this.PCCoordinates_conformers!=null &&
              this.PCCoordinates_conformers.equals(other.getPCCoordinates_conformers()))) &&
            ((this.PCCoordinates_atomlabels==null && other.getPCCoordinates_atomlabels()==null) || 
             (this.PCCoordinates_atomlabels!=null &&
              this.PCCoordinates_atomlabels.equals(other.getPCCoordinates_atomlabels()))) &&
            ((this.PCCoordinates_data==null && other.getPCCoordinates_data()==null) || 
             (this.PCCoordinates_data!=null &&
              this.PCCoordinates_data.equals(other.getPCCoordinates_data())));
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
        if (getPCCoordinates_type() != null) {
            _hashCode += getPCCoordinates_type().hashCode();
        }
        if (getPCCoordinates_aid() != null) {
            _hashCode += getPCCoordinates_aid().hashCode();
        }
        if (getPCCoordinates_conformers() != null) {
            _hashCode += getPCCoordinates_conformers().hashCode();
        }
        if (getPCCoordinates_atomlabels() != null) {
            _hashCode += getPCCoordinates_atomlabels().hashCode();
        }
        if (getPCCoordinates_data() != null) {
            _hashCode += getPCCoordinates_data().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PCCoordinatesType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-CoordinatesType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCCoordinates_type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-Coordinates_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-Coordinates_typeType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCCoordinates_aid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-Coordinates_aid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-Coordinates_aidType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCCoordinates_conformers");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-Coordinates_conformers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-Coordinates_conformersType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCCoordinates_atomlabels");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-Coordinates_atomlabels"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-Coordinates_atomlabelsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCCoordinates_data");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-Coordinates_data"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-Coordinates_dataType"));
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
