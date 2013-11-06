/**
 * PCUrnType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class PCUrnType  implements java.io.Serializable {
    private java.lang.String PCUrn_label;

    private java.lang.String PCUrn_name;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCUrn_datatypeType PCUrn_datatype;

    private java.lang.String PCUrn_parameters;

    private java.lang.String PCUrn_implementation;

    private java.lang.String PCUrn_version;

    private java.lang.String PCUrn_software;

    private java.lang.String PCUrn_source;

    private java.lang.String PCUrn_release;

    public PCUrnType() {
    }

    public PCUrnType(
           java.lang.String PCUrn_label,
           java.lang.String PCUrn_name,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCUrn_datatypeType PCUrn_datatype,
           java.lang.String PCUrn_parameters,
           java.lang.String PCUrn_implementation,
           java.lang.String PCUrn_version,
           java.lang.String PCUrn_software,
           java.lang.String PCUrn_source,
           java.lang.String PCUrn_release) {
           this.PCUrn_label = PCUrn_label;
           this.PCUrn_name = PCUrn_name;
           this.PCUrn_datatype = PCUrn_datatype;
           this.PCUrn_parameters = PCUrn_parameters;
           this.PCUrn_implementation = PCUrn_implementation;
           this.PCUrn_version = PCUrn_version;
           this.PCUrn_software = PCUrn_software;
           this.PCUrn_source = PCUrn_source;
           this.PCUrn_release = PCUrn_release;
    }


    /**
     * Gets the PCUrn_label value for this PCUrnType.
     * 
     * @return PCUrn_label
     */
    public java.lang.String getPCUrn_label() {
        return PCUrn_label;
    }


    /**
     * Sets the PCUrn_label value for this PCUrnType.
     * 
     * @param PCUrn_label
     */
    public void setPCUrn_label(java.lang.String PCUrn_label) {
        this.PCUrn_label = PCUrn_label;
    }


    /**
     * Gets the PCUrn_name value for this PCUrnType.
     * 
     * @return PCUrn_name
     */
    public java.lang.String getPCUrn_name() {
        return PCUrn_name;
    }


    /**
     * Sets the PCUrn_name value for this PCUrnType.
     * 
     * @param PCUrn_name
     */
    public void setPCUrn_name(java.lang.String PCUrn_name) {
        this.PCUrn_name = PCUrn_name;
    }


    /**
     * Gets the PCUrn_datatype value for this PCUrnType.
     * 
     * @return PCUrn_datatype
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCUrn_datatypeType getPCUrn_datatype() {
        return PCUrn_datatype;
    }


    /**
     * Sets the PCUrn_datatype value for this PCUrnType.
     * 
     * @param PCUrn_datatype
     */
    public void setPCUrn_datatype(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCUrn_datatypeType PCUrn_datatype) {
        this.PCUrn_datatype = PCUrn_datatype;
    }


    /**
     * Gets the PCUrn_parameters value for this PCUrnType.
     * 
     * @return PCUrn_parameters
     */
    public java.lang.String getPCUrn_parameters() {
        return PCUrn_parameters;
    }


    /**
     * Sets the PCUrn_parameters value for this PCUrnType.
     * 
     * @param PCUrn_parameters
     */
    public void setPCUrn_parameters(java.lang.String PCUrn_parameters) {
        this.PCUrn_parameters = PCUrn_parameters;
    }


    /**
     * Gets the PCUrn_implementation value for this PCUrnType.
     * 
     * @return PCUrn_implementation
     */
    public java.lang.String getPCUrn_implementation() {
        return PCUrn_implementation;
    }


    /**
     * Sets the PCUrn_implementation value for this PCUrnType.
     * 
     * @param PCUrn_implementation
     */
    public void setPCUrn_implementation(java.lang.String PCUrn_implementation) {
        this.PCUrn_implementation = PCUrn_implementation;
    }


    /**
     * Gets the PCUrn_version value for this PCUrnType.
     * 
     * @return PCUrn_version
     */
    public java.lang.String getPCUrn_version() {
        return PCUrn_version;
    }


    /**
     * Sets the PCUrn_version value for this PCUrnType.
     * 
     * @param PCUrn_version
     */
    public void setPCUrn_version(java.lang.String PCUrn_version) {
        this.PCUrn_version = PCUrn_version;
    }


    /**
     * Gets the PCUrn_software value for this PCUrnType.
     * 
     * @return PCUrn_software
     */
    public java.lang.String getPCUrn_software() {
        return PCUrn_software;
    }


    /**
     * Sets the PCUrn_software value for this PCUrnType.
     * 
     * @param PCUrn_software
     */
    public void setPCUrn_software(java.lang.String PCUrn_software) {
        this.PCUrn_software = PCUrn_software;
    }


    /**
     * Gets the PCUrn_source value for this PCUrnType.
     * 
     * @return PCUrn_source
     */
    public java.lang.String getPCUrn_source() {
        return PCUrn_source;
    }


    /**
     * Sets the PCUrn_source value for this PCUrnType.
     * 
     * @param PCUrn_source
     */
    public void setPCUrn_source(java.lang.String PCUrn_source) {
        this.PCUrn_source = PCUrn_source;
    }


    /**
     * Gets the PCUrn_release value for this PCUrnType.
     * 
     * @return PCUrn_release
     */
    public java.lang.String getPCUrn_release() {
        return PCUrn_release;
    }


    /**
     * Sets the PCUrn_release value for this PCUrnType.
     * 
     * @param PCUrn_release
     */
    public void setPCUrn_release(java.lang.String PCUrn_release) {
        this.PCUrn_release = PCUrn_release;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PCUrnType)) return false;
        PCUrnType other = (PCUrnType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.PCUrn_label==null && other.getPCUrn_label()==null) || 
             (this.PCUrn_label!=null &&
              this.PCUrn_label.equals(other.getPCUrn_label()))) &&
            ((this.PCUrn_name==null && other.getPCUrn_name()==null) || 
             (this.PCUrn_name!=null &&
              this.PCUrn_name.equals(other.getPCUrn_name()))) &&
            ((this.PCUrn_datatype==null && other.getPCUrn_datatype()==null) || 
             (this.PCUrn_datatype!=null &&
              this.PCUrn_datatype.equals(other.getPCUrn_datatype()))) &&
            ((this.PCUrn_parameters==null && other.getPCUrn_parameters()==null) || 
             (this.PCUrn_parameters!=null &&
              this.PCUrn_parameters.equals(other.getPCUrn_parameters()))) &&
            ((this.PCUrn_implementation==null && other.getPCUrn_implementation()==null) || 
             (this.PCUrn_implementation!=null &&
              this.PCUrn_implementation.equals(other.getPCUrn_implementation()))) &&
            ((this.PCUrn_version==null && other.getPCUrn_version()==null) || 
             (this.PCUrn_version!=null &&
              this.PCUrn_version.equals(other.getPCUrn_version()))) &&
            ((this.PCUrn_software==null && other.getPCUrn_software()==null) || 
             (this.PCUrn_software!=null &&
              this.PCUrn_software.equals(other.getPCUrn_software()))) &&
            ((this.PCUrn_source==null && other.getPCUrn_source()==null) || 
             (this.PCUrn_source!=null &&
              this.PCUrn_source.equals(other.getPCUrn_source()))) &&
            ((this.PCUrn_release==null && other.getPCUrn_release()==null) || 
             (this.PCUrn_release!=null &&
              this.PCUrn_release.equals(other.getPCUrn_release())));
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
        if (getPCUrn_label() != null) {
            _hashCode += getPCUrn_label().hashCode();
        }
        if (getPCUrn_name() != null) {
            _hashCode += getPCUrn_name().hashCode();
        }
        if (getPCUrn_datatype() != null) {
            _hashCode += getPCUrn_datatype().hashCode();
        }
        if (getPCUrn_parameters() != null) {
            _hashCode += getPCUrn_parameters().hashCode();
        }
        if (getPCUrn_implementation() != null) {
            _hashCode += getPCUrn_implementation().hashCode();
        }
        if (getPCUrn_version() != null) {
            _hashCode += getPCUrn_version().hashCode();
        }
        if (getPCUrn_software() != null) {
            _hashCode += getPCUrn_software().hashCode();
        }
        if (getPCUrn_source() != null) {
            _hashCode += getPCUrn_source().hashCode();
        }
        if (getPCUrn_release() != null) {
            _hashCode += getPCUrn_release().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PCUrnType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-UrnType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCUrn_label");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-Urn_label"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCUrn_name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-Urn_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCUrn_datatype");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-Urn_datatype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-Urn_datatypeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCUrn_parameters");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-Urn_parameters"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCUrn_implementation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-Urn_implementation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCUrn_version");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-Urn_version"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCUrn_software");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-Urn_software"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCUrn_source");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-Urn_source"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCUrn_release");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-Urn_release"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
