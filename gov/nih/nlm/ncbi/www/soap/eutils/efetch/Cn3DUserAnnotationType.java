/**
 * Cn3DUserAnnotationType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Cn3DUserAnnotationType  implements java.io.Serializable {
    private java.lang.String cn3DUserAnnotation_name;

    private java.lang.String cn3DUserAnnotation_description;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DUserAnnotation_styleIdType cn3DUserAnnotation_styleId;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DUserAnnotation_residuesType cn3DUserAnnotation_residues;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DUserAnnotation_isOnType cn3DUserAnnotation_isOn;

    public Cn3DUserAnnotationType() {
    }

    public Cn3DUserAnnotationType(
           java.lang.String cn3DUserAnnotation_name,
           java.lang.String cn3DUserAnnotation_description,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DUserAnnotation_styleIdType cn3DUserAnnotation_styleId,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DUserAnnotation_residuesType cn3DUserAnnotation_residues,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DUserAnnotation_isOnType cn3DUserAnnotation_isOn) {
           this.cn3DUserAnnotation_name = cn3DUserAnnotation_name;
           this.cn3DUserAnnotation_description = cn3DUserAnnotation_description;
           this.cn3DUserAnnotation_styleId = cn3DUserAnnotation_styleId;
           this.cn3DUserAnnotation_residues = cn3DUserAnnotation_residues;
           this.cn3DUserAnnotation_isOn = cn3DUserAnnotation_isOn;
    }


    /**
     * Gets the cn3DUserAnnotation_name value for this Cn3DUserAnnotationType.
     * 
     * @return cn3DUserAnnotation_name
     */
    public java.lang.String getCn3DUserAnnotation_name() {
        return cn3DUserAnnotation_name;
    }


    /**
     * Sets the cn3DUserAnnotation_name value for this Cn3DUserAnnotationType.
     * 
     * @param cn3DUserAnnotation_name
     */
    public void setCn3DUserAnnotation_name(java.lang.String cn3DUserAnnotation_name) {
        this.cn3DUserAnnotation_name = cn3DUserAnnotation_name;
    }


    /**
     * Gets the cn3DUserAnnotation_description value for this Cn3DUserAnnotationType.
     * 
     * @return cn3DUserAnnotation_description
     */
    public java.lang.String getCn3DUserAnnotation_description() {
        return cn3DUserAnnotation_description;
    }


    /**
     * Sets the cn3DUserAnnotation_description value for this Cn3DUserAnnotationType.
     * 
     * @param cn3DUserAnnotation_description
     */
    public void setCn3DUserAnnotation_description(java.lang.String cn3DUserAnnotation_description) {
        this.cn3DUserAnnotation_description = cn3DUserAnnotation_description;
    }


    /**
     * Gets the cn3DUserAnnotation_styleId value for this Cn3DUserAnnotationType.
     * 
     * @return cn3DUserAnnotation_styleId
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DUserAnnotation_styleIdType getCn3DUserAnnotation_styleId() {
        return cn3DUserAnnotation_styleId;
    }


    /**
     * Sets the cn3DUserAnnotation_styleId value for this Cn3DUserAnnotationType.
     * 
     * @param cn3DUserAnnotation_styleId
     */
    public void setCn3DUserAnnotation_styleId(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DUserAnnotation_styleIdType cn3DUserAnnotation_styleId) {
        this.cn3DUserAnnotation_styleId = cn3DUserAnnotation_styleId;
    }


    /**
     * Gets the cn3DUserAnnotation_residues value for this Cn3DUserAnnotationType.
     * 
     * @return cn3DUserAnnotation_residues
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DUserAnnotation_residuesType getCn3DUserAnnotation_residues() {
        return cn3DUserAnnotation_residues;
    }


    /**
     * Sets the cn3DUserAnnotation_residues value for this Cn3DUserAnnotationType.
     * 
     * @param cn3DUserAnnotation_residues
     */
    public void setCn3DUserAnnotation_residues(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DUserAnnotation_residuesType cn3DUserAnnotation_residues) {
        this.cn3DUserAnnotation_residues = cn3DUserAnnotation_residues;
    }


    /**
     * Gets the cn3DUserAnnotation_isOn value for this Cn3DUserAnnotationType.
     * 
     * @return cn3DUserAnnotation_isOn
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DUserAnnotation_isOnType getCn3DUserAnnotation_isOn() {
        return cn3DUserAnnotation_isOn;
    }


    /**
     * Sets the cn3DUserAnnotation_isOn value for this Cn3DUserAnnotationType.
     * 
     * @param cn3DUserAnnotation_isOn
     */
    public void setCn3DUserAnnotation_isOn(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DUserAnnotation_isOnType cn3DUserAnnotation_isOn) {
        this.cn3DUserAnnotation_isOn = cn3DUserAnnotation_isOn;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Cn3DUserAnnotationType)) return false;
        Cn3DUserAnnotationType other = (Cn3DUserAnnotationType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cn3DUserAnnotation_name==null && other.getCn3DUserAnnotation_name()==null) || 
             (this.cn3DUserAnnotation_name!=null &&
              this.cn3DUserAnnotation_name.equals(other.getCn3DUserAnnotation_name()))) &&
            ((this.cn3DUserAnnotation_description==null && other.getCn3DUserAnnotation_description()==null) || 
             (this.cn3DUserAnnotation_description!=null &&
              this.cn3DUserAnnotation_description.equals(other.getCn3DUserAnnotation_description()))) &&
            ((this.cn3DUserAnnotation_styleId==null && other.getCn3DUserAnnotation_styleId()==null) || 
             (this.cn3DUserAnnotation_styleId!=null &&
              this.cn3DUserAnnotation_styleId.equals(other.getCn3DUserAnnotation_styleId()))) &&
            ((this.cn3DUserAnnotation_residues==null && other.getCn3DUserAnnotation_residues()==null) || 
             (this.cn3DUserAnnotation_residues!=null &&
              this.cn3DUserAnnotation_residues.equals(other.getCn3DUserAnnotation_residues()))) &&
            ((this.cn3DUserAnnotation_isOn==null && other.getCn3DUserAnnotation_isOn()==null) || 
             (this.cn3DUserAnnotation_isOn!=null &&
              this.cn3DUserAnnotation_isOn.equals(other.getCn3DUserAnnotation_isOn())));
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
        if (getCn3DUserAnnotation_name() != null) {
            _hashCode += getCn3DUserAnnotation_name().hashCode();
        }
        if (getCn3DUserAnnotation_description() != null) {
            _hashCode += getCn3DUserAnnotation_description().hashCode();
        }
        if (getCn3DUserAnnotation_styleId() != null) {
            _hashCode += getCn3DUserAnnotation_styleId().hashCode();
        }
        if (getCn3DUserAnnotation_residues() != null) {
            _hashCode += getCn3DUserAnnotation_residues().hashCode();
        }
        if (getCn3DUserAnnotation_isOn() != null) {
            _hashCode += getCn3DUserAnnotation_isOn().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Cn3DUserAnnotationType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-user-annotationType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cn3DUserAnnotation_name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-user-annotation_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cn3DUserAnnotation_description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-user-annotation_description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cn3DUserAnnotation_styleId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-user-annotation_style-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-user-annotation_style-idType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cn3DUserAnnotation_residues");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-user-annotation_residues"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-user-annotation_residuesType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cn3DUserAnnotation_isOn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-user-annotation_is-on"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-user-annotation_is-onType"));
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
