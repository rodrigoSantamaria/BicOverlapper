/**
 * MSResponseType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class MSResponseType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSResponse_hitsetsType MSResponse_hitsets;

    private java.lang.String MSResponse_scale;

    private java.lang.String MSResponse_rid;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSResponse_errorType MSResponse_error;

    private java.lang.String MSResponse_version;

    private java.lang.String MSResponse_email;

    private java.lang.String MSResponse_dbversion;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSResponse_bioseqsType MSResponse_bioseqs;

    public MSResponseType() {
    }

    public MSResponseType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSResponse_hitsetsType MSResponse_hitsets,
           java.lang.String MSResponse_scale,
           java.lang.String MSResponse_rid,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSResponse_errorType MSResponse_error,
           java.lang.String MSResponse_version,
           java.lang.String MSResponse_email,
           java.lang.String MSResponse_dbversion,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSResponse_bioseqsType MSResponse_bioseqs) {
           this.MSResponse_hitsets = MSResponse_hitsets;
           this.MSResponse_scale = MSResponse_scale;
           this.MSResponse_rid = MSResponse_rid;
           this.MSResponse_error = MSResponse_error;
           this.MSResponse_version = MSResponse_version;
           this.MSResponse_email = MSResponse_email;
           this.MSResponse_dbversion = MSResponse_dbversion;
           this.MSResponse_bioseqs = MSResponse_bioseqs;
    }


    /**
     * Gets the MSResponse_hitsets value for this MSResponseType.
     * 
     * @return MSResponse_hitsets
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSResponse_hitsetsType getMSResponse_hitsets() {
        return MSResponse_hitsets;
    }


    /**
     * Sets the MSResponse_hitsets value for this MSResponseType.
     * 
     * @param MSResponse_hitsets
     */
    public void setMSResponse_hitsets(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSResponse_hitsetsType MSResponse_hitsets) {
        this.MSResponse_hitsets = MSResponse_hitsets;
    }


    /**
     * Gets the MSResponse_scale value for this MSResponseType.
     * 
     * @return MSResponse_scale
     */
    public java.lang.String getMSResponse_scale() {
        return MSResponse_scale;
    }


    /**
     * Sets the MSResponse_scale value for this MSResponseType.
     * 
     * @param MSResponse_scale
     */
    public void setMSResponse_scale(java.lang.String MSResponse_scale) {
        this.MSResponse_scale = MSResponse_scale;
    }


    /**
     * Gets the MSResponse_rid value for this MSResponseType.
     * 
     * @return MSResponse_rid
     */
    public java.lang.String getMSResponse_rid() {
        return MSResponse_rid;
    }


    /**
     * Sets the MSResponse_rid value for this MSResponseType.
     * 
     * @param MSResponse_rid
     */
    public void setMSResponse_rid(java.lang.String MSResponse_rid) {
        this.MSResponse_rid = MSResponse_rid;
    }


    /**
     * Gets the MSResponse_error value for this MSResponseType.
     * 
     * @return MSResponse_error
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSResponse_errorType getMSResponse_error() {
        return MSResponse_error;
    }


    /**
     * Sets the MSResponse_error value for this MSResponseType.
     * 
     * @param MSResponse_error
     */
    public void setMSResponse_error(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSResponse_errorType MSResponse_error) {
        this.MSResponse_error = MSResponse_error;
    }


    /**
     * Gets the MSResponse_version value for this MSResponseType.
     * 
     * @return MSResponse_version
     */
    public java.lang.String getMSResponse_version() {
        return MSResponse_version;
    }


    /**
     * Sets the MSResponse_version value for this MSResponseType.
     * 
     * @param MSResponse_version
     */
    public void setMSResponse_version(java.lang.String MSResponse_version) {
        this.MSResponse_version = MSResponse_version;
    }


    /**
     * Gets the MSResponse_email value for this MSResponseType.
     * 
     * @return MSResponse_email
     */
    public java.lang.String getMSResponse_email() {
        return MSResponse_email;
    }


    /**
     * Sets the MSResponse_email value for this MSResponseType.
     * 
     * @param MSResponse_email
     */
    public void setMSResponse_email(java.lang.String MSResponse_email) {
        this.MSResponse_email = MSResponse_email;
    }


    /**
     * Gets the MSResponse_dbversion value for this MSResponseType.
     * 
     * @return MSResponse_dbversion
     */
    public java.lang.String getMSResponse_dbversion() {
        return MSResponse_dbversion;
    }


    /**
     * Sets the MSResponse_dbversion value for this MSResponseType.
     * 
     * @param MSResponse_dbversion
     */
    public void setMSResponse_dbversion(java.lang.String MSResponse_dbversion) {
        this.MSResponse_dbversion = MSResponse_dbversion;
    }


    /**
     * Gets the MSResponse_bioseqs value for this MSResponseType.
     * 
     * @return MSResponse_bioseqs
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSResponse_bioseqsType getMSResponse_bioseqs() {
        return MSResponse_bioseqs;
    }


    /**
     * Sets the MSResponse_bioseqs value for this MSResponseType.
     * 
     * @param MSResponse_bioseqs
     */
    public void setMSResponse_bioseqs(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSResponse_bioseqsType MSResponse_bioseqs) {
        this.MSResponse_bioseqs = MSResponse_bioseqs;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MSResponseType)) return false;
        MSResponseType other = (MSResponseType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.MSResponse_hitsets==null && other.getMSResponse_hitsets()==null) || 
             (this.MSResponse_hitsets!=null &&
              this.MSResponse_hitsets.equals(other.getMSResponse_hitsets()))) &&
            ((this.MSResponse_scale==null && other.getMSResponse_scale()==null) || 
             (this.MSResponse_scale!=null &&
              this.MSResponse_scale.equals(other.getMSResponse_scale()))) &&
            ((this.MSResponse_rid==null && other.getMSResponse_rid()==null) || 
             (this.MSResponse_rid!=null &&
              this.MSResponse_rid.equals(other.getMSResponse_rid()))) &&
            ((this.MSResponse_error==null && other.getMSResponse_error()==null) || 
             (this.MSResponse_error!=null &&
              this.MSResponse_error.equals(other.getMSResponse_error()))) &&
            ((this.MSResponse_version==null && other.getMSResponse_version()==null) || 
             (this.MSResponse_version!=null &&
              this.MSResponse_version.equals(other.getMSResponse_version()))) &&
            ((this.MSResponse_email==null && other.getMSResponse_email()==null) || 
             (this.MSResponse_email!=null &&
              this.MSResponse_email.equals(other.getMSResponse_email()))) &&
            ((this.MSResponse_dbversion==null && other.getMSResponse_dbversion()==null) || 
             (this.MSResponse_dbversion!=null &&
              this.MSResponse_dbversion.equals(other.getMSResponse_dbversion()))) &&
            ((this.MSResponse_bioseqs==null && other.getMSResponse_bioseqs()==null) || 
             (this.MSResponse_bioseqs!=null &&
              this.MSResponse_bioseqs.equals(other.getMSResponse_bioseqs())));
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
        if (getMSResponse_hitsets() != null) {
            _hashCode += getMSResponse_hitsets().hashCode();
        }
        if (getMSResponse_scale() != null) {
            _hashCode += getMSResponse_scale().hashCode();
        }
        if (getMSResponse_rid() != null) {
            _hashCode += getMSResponse_rid().hashCode();
        }
        if (getMSResponse_error() != null) {
            _hashCode += getMSResponse_error().hashCode();
        }
        if (getMSResponse_version() != null) {
            _hashCode += getMSResponse_version().hashCode();
        }
        if (getMSResponse_email() != null) {
            _hashCode += getMSResponse_email().hashCode();
        }
        if (getMSResponse_dbversion() != null) {
            _hashCode += getMSResponse_dbversion().hashCode();
        }
        if (getMSResponse_bioseqs() != null) {
            _hashCode += getMSResponse_bioseqs().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MSResponseType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSResponseType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSResponse_hitsets");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSResponse_hitsets"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSResponse_hitsetsType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSResponse_scale");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSResponse_scale"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSResponse_rid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSResponse_rid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSResponse_error");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSResponse_error"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSResponse_errorType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSResponse_version");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSResponse_version"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSResponse_email");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSResponse_email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSResponse_dbversion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSResponse_dbversion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSResponse_bioseqs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSResponse_bioseqs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSResponse_bioseqsType"));
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
