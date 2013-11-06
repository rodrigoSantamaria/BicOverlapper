/**
 * BiostrucModelType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class BiostrucModelType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucModel_idType biostrucModel_id;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucModel_typeType biostrucModel_type;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucModel_descrType biostrucModel_descr;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucModel_modelSpaceType biostrucModel_modelSpace;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucModel_modelCoordinatesType biostrucModel_modelCoordinates;

    public BiostrucModelType() {
    }

    public BiostrucModelType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucModel_idType biostrucModel_id,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucModel_typeType biostrucModel_type,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucModel_descrType biostrucModel_descr,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucModel_modelSpaceType biostrucModel_modelSpace,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucModel_modelCoordinatesType biostrucModel_modelCoordinates) {
           this.biostrucModel_id = biostrucModel_id;
           this.biostrucModel_type = biostrucModel_type;
           this.biostrucModel_descr = biostrucModel_descr;
           this.biostrucModel_modelSpace = biostrucModel_modelSpace;
           this.biostrucModel_modelCoordinates = biostrucModel_modelCoordinates;
    }


    /**
     * Gets the biostrucModel_id value for this BiostrucModelType.
     * 
     * @return biostrucModel_id
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucModel_idType getBiostrucModel_id() {
        return biostrucModel_id;
    }


    /**
     * Sets the biostrucModel_id value for this BiostrucModelType.
     * 
     * @param biostrucModel_id
     */
    public void setBiostrucModel_id(gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucModel_idType biostrucModel_id) {
        this.biostrucModel_id = biostrucModel_id;
    }


    /**
     * Gets the biostrucModel_type value for this BiostrucModelType.
     * 
     * @return biostrucModel_type
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucModel_typeType getBiostrucModel_type() {
        return biostrucModel_type;
    }


    /**
     * Sets the biostrucModel_type value for this BiostrucModelType.
     * 
     * @param biostrucModel_type
     */
    public void setBiostrucModel_type(gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucModel_typeType biostrucModel_type) {
        this.biostrucModel_type = biostrucModel_type;
    }


    /**
     * Gets the biostrucModel_descr value for this BiostrucModelType.
     * 
     * @return biostrucModel_descr
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucModel_descrType getBiostrucModel_descr() {
        return biostrucModel_descr;
    }


    /**
     * Sets the biostrucModel_descr value for this BiostrucModelType.
     * 
     * @param biostrucModel_descr
     */
    public void setBiostrucModel_descr(gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucModel_descrType biostrucModel_descr) {
        this.biostrucModel_descr = biostrucModel_descr;
    }


    /**
     * Gets the biostrucModel_modelSpace value for this BiostrucModelType.
     * 
     * @return biostrucModel_modelSpace
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucModel_modelSpaceType getBiostrucModel_modelSpace() {
        return biostrucModel_modelSpace;
    }


    /**
     * Sets the biostrucModel_modelSpace value for this BiostrucModelType.
     * 
     * @param biostrucModel_modelSpace
     */
    public void setBiostrucModel_modelSpace(gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucModel_modelSpaceType biostrucModel_modelSpace) {
        this.biostrucModel_modelSpace = biostrucModel_modelSpace;
    }


    /**
     * Gets the biostrucModel_modelCoordinates value for this BiostrucModelType.
     * 
     * @return biostrucModel_modelCoordinates
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucModel_modelCoordinatesType getBiostrucModel_modelCoordinates() {
        return biostrucModel_modelCoordinates;
    }


    /**
     * Sets the biostrucModel_modelCoordinates value for this BiostrucModelType.
     * 
     * @param biostrucModel_modelCoordinates
     */
    public void setBiostrucModel_modelCoordinates(gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucModel_modelCoordinatesType biostrucModel_modelCoordinates) {
        this.biostrucModel_modelCoordinates = biostrucModel_modelCoordinates;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BiostrucModelType)) return false;
        BiostrucModelType other = (BiostrucModelType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.biostrucModel_id==null && other.getBiostrucModel_id()==null) || 
             (this.biostrucModel_id!=null &&
              this.biostrucModel_id.equals(other.getBiostrucModel_id()))) &&
            ((this.biostrucModel_type==null && other.getBiostrucModel_type()==null) || 
             (this.biostrucModel_type!=null &&
              this.biostrucModel_type.equals(other.getBiostrucModel_type()))) &&
            ((this.biostrucModel_descr==null && other.getBiostrucModel_descr()==null) || 
             (this.biostrucModel_descr!=null &&
              this.biostrucModel_descr.equals(other.getBiostrucModel_descr()))) &&
            ((this.biostrucModel_modelSpace==null && other.getBiostrucModel_modelSpace()==null) || 
             (this.biostrucModel_modelSpace!=null &&
              this.biostrucModel_modelSpace.equals(other.getBiostrucModel_modelSpace()))) &&
            ((this.biostrucModel_modelCoordinates==null && other.getBiostrucModel_modelCoordinates()==null) || 
             (this.biostrucModel_modelCoordinates!=null &&
              this.biostrucModel_modelCoordinates.equals(other.getBiostrucModel_modelCoordinates())));
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
        if (getBiostrucModel_id() != null) {
            _hashCode += getBiostrucModel_id().hashCode();
        }
        if (getBiostrucModel_type() != null) {
            _hashCode += getBiostrucModel_type().hashCode();
        }
        if (getBiostrucModel_descr() != null) {
            _hashCode += getBiostrucModel_descr().hashCode();
        }
        if (getBiostrucModel_modelSpace() != null) {
            _hashCode += getBiostrucModel_modelSpace().hashCode();
        }
        if (getBiostrucModel_modelCoordinates() != null) {
            _hashCode += getBiostrucModel_modelCoordinates().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BiostrucModelType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-modelType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("biostrucModel_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-model_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-model_idType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("biostrucModel_type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-model_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-model_typeType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("biostrucModel_descr");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-model_descr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-model_descrType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("biostrucModel_modelSpace");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-model_model-space"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-model_model-spaceType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("biostrucModel_modelCoordinates");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-model_model-coordinates"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-model_model-coordinatesType"));
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
