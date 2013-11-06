/**
 * BiostrucFeatureType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class BiostrucFeatureType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucFeature_idType biostrucFeature_id;

    private java.lang.String biostrucFeature_name;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucFeature_typeType biostrucFeature_type;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucFeature_propertyType biostrucFeature_property;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucFeature_locationType biostrucFeature_location;

    public BiostrucFeatureType() {
    }

    public BiostrucFeatureType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucFeature_idType biostrucFeature_id,
           java.lang.String biostrucFeature_name,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucFeature_typeType biostrucFeature_type,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucFeature_propertyType biostrucFeature_property,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucFeature_locationType biostrucFeature_location) {
           this.biostrucFeature_id = biostrucFeature_id;
           this.biostrucFeature_name = biostrucFeature_name;
           this.biostrucFeature_type = biostrucFeature_type;
           this.biostrucFeature_property = biostrucFeature_property;
           this.biostrucFeature_location = biostrucFeature_location;
    }


    /**
     * Gets the biostrucFeature_id value for this BiostrucFeatureType.
     * 
     * @return biostrucFeature_id
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucFeature_idType getBiostrucFeature_id() {
        return biostrucFeature_id;
    }


    /**
     * Sets the biostrucFeature_id value for this BiostrucFeatureType.
     * 
     * @param biostrucFeature_id
     */
    public void setBiostrucFeature_id(gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucFeature_idType biostrucFeature_id) {
        this.biostrucFeature_id = biostrucFeature_id;
    }


    /**
     * Gets the biostrucFeature_name value for this BiostrucFeatureType.
     * 
     * @return biostrucFeature_name
     */
    public java.lang.String getBiostrucFeature_name() {
        return biostrucFeature_name;
    }


    /**
     * Sets the biostrucFeature_name value for this BiostrucFeatureType.
     * 
     * @param biostrucFeature_name
     */
    public void setBiostrucFeature_name(java.lang.String biostrucFeature_name) {
        this.biostrucFeature_name = biostrucFeature_name;
    }


    /**
     * Gets the biostrucFeature_type value for this BiostrucFeatureType.
     * 
     * @return biostrucFeature_type
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucFeature_typeType getBiostrucFeature_type() {
        return biostrucFeature_type;
    }


    /**
     * Sets the biostrucFeature_type value for this BiostrucFeatureType.
     * 
     * @param biostrucFeature_type
     */
    public void setBiostrucFeature_type(gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucFeature_typeType biostrucFeature_type) {
        this.biostrucFeature_type = biostrucFeature_type;
    }


    /**
     * Gets the biostrucFeature_property value for this BiostrucFeatureType.
     * 
     * @return biostrucFeature_property
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucFeature_propertyType getBiostrucFeature_property() {
        return biostrucFeature_property;
    }


    /**
     * Sets the biostrucFeature_property value for this BiostrucFeatureType.
     * 
     * @param biostrucFeature_property
     */
    public void setBiostrucFeature_property(gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucFeature_propertyType biostrucFeature_property) {
        this.biostrucFeature_property = biostrucFeature_property;
    }


    /**
     * Gets the biostrucFeature_location value for this BiostrucFeatureType.
     * 
     * @return biostrucFeature_location
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucFeature_locationType getBiostrucFeature_location() {
        return biostrucFeature_location;
    }


    /**
     * Sets the biostrucFeature_location value for this BiostrucFeatureType.
     * 
     * @param biostrucFeature_location
     */
    public void setBiostrucFeature_location(gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucFeature_locationType biostrucFeature_location) {
        this.biostrucFeature_location = biostrucFeature_location;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BiostrucFeatureType)) return false;
        BiostrucFeatureType other = (BiostrucFeatureType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.biostrucFeature_id==null && other.getBiostrucFeature_id()==null) || 
             (this.biostrucFeature_id!=null &&
              this.biostrucFeature_id.equals(other.getBiostrucFeature_id()))) &&
            ((this.biostrucFeature_name==null && other.getBiostrucFeature_name()==null) || 
             (this.biostrucFeature_name!=null &&
              this.biostrucFeature_name.equals(other.getBiostrucFeature_name()))) &&
            ((this.biostrucFeature_type==null && other.getBiostrucFeature_type()==null) || 
             (this.biostrucFeature_type!=null &&
              this.biostrucFeature_type.equals(other.getBiostrucFeature_type()))) &&
            ((this.biostrucFeature_property==null && other.getBiostrucFeature_property()==null) || 
             (this.biostrucFeature_property!=null &&
              this.biostrucFeature_property.equals(other.getBiostrucFeature_property()))) &&
            ((this.biostrucFeature_location==null && other.getBiostrucFeature_location()==null) || 
             (this.biostrucFeature_location!=null &&
              this.biostrucFeature_location.equals(other.getBiostrucFeature_location())));
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
        if (getBiostrucFeature_id() != null) {
            _hashCode += getBiostrucFeature_id().hashCode();
        }
        if (getBiostrucFeature_name() != null) {
            _hashCode += getBiostrucFeature_name().hashCode();
        }
        if (getBiostrucFeature_type() != null) {
            _hashCode += getBiostrucFeature_type().hashCode();
        }
        if (getBiostrucFeature_property() != null) {
            _hashCode += getBiostrucFeature_property().hashCode();
        }
        if (getBiostrucFeature_location() != null) {
            _hashCode += getBiostrucFeature_location().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BiostrucFeatureType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-featureType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("biostrucFeature_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-feature_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-feature_idType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("biostrucFeature_name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-feature_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("biostrucFeature_type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-feature_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-feature_typeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("biostrucFeature_property");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-feature_property"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-feature_propertyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("biostrucFeature_location");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-feature_location"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-feature_locationType"));
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
