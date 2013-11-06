/**
 * UpdateAlignType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class UpdateAlignType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.UpdateAlign_descriptionType updateAlign_description;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.UpdateAlign_seqannotType updateAlign_seqannot;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.UpdateAlign_typeType updateAlign_type;

    public UpdateAlignType() {
    }

    public UpdateAlignType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.UpdateAlign_descriptionType updateAlign_description,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.UpdateAlign_seqannotType updateAlign_seqannot,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.UpdateAlign_typeType updateAlign_type) {
           this.updateAlign_description = updateAlign_description;
           this.updateAlign_seqannot = updateAlign_seqannot;
           this.updateAlign_type = updateAlign_type;
    }


    /**
     * Gets the updateAlign_description value for this UpdateAlignType.
     * 
     * @return updateAlign_description
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.UpdateAlign_descriptionType getUpdateAlign_description() {
        return updateAlign_description;
    }


    /**
     * Sets the updateAlign_description value for this UpdateAlignType.
     * 
     * @param updateAlign_description
     */
    public void setUpdateAlign_description(gov.nih.nlm.ncbi.www.soap.eutils.efetch.UpdateAlign_descriptionType updateAlign_description) {
        this.updateAlign_description = updateAlign_description;
    }


    /**
     * Gets the updateAlign_seqannot value for this UpdateAlignType.
     * 
     * @return updateAlign_seqannot
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.UpdateAlign_seqannotType getUpdateAlign_seqannot() {
        return updateAlign_seqannot;
    }


    /**
     * Sets the updateAlign_seqannot value for this UpdateAlignType.
     * 
     * @param updateAlign_seqannot
     */
    public void setUpdateAlign_seqannot(gov.nih.nlm.ncbi.www.soap.eutils.efetch.UpdateAlign_seqannotType updateAlign_seqannot) {
        this.updateAlign_seqannot = updateAlign_seqannot;
    }


    /**
     * Gets the updateAlign_type value for this UpdateAlignType.
     * 
     * @return updateAlign_type
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.UpdateAlign_typeType getUpdateAlign_type() {
        return updateAlign_type;
    }


    /**
     * Sets the updateAlign_type value for this UpdateAlignType.
     * 
     * @param updateAlign_type
     */
    public void setUpdateAlign_type(gov.nih.nlm.ncbi.www.soap.eutils.efetch.UpdateAlign_typeType updateAlign_type) {
        this.updateAlign_type = updateAlign_type;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateAlignType)) return false;
        UpdateAlignType other = (UpdateAlignType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.updateAlign_description==null && other.getUpdateAlign_description()==null) || 
             (this.updateAlign_description!=null &&
              this.updateAlign_description.equals(other.getUpdateAlign_description()))) &&
            ((this.updateAlign_seqannot==null && other.getUpdateAlign_seqannot()==null) || 
             (this.updateAlign_seqannot!=null &&
              this.updateAlign_seqannot.equals(other.getUpdateAlign_seqannot()))) &&
            ((this.updateAlign_type==null && other.getUpdateAlign_type()==null) || 
             (this.updateAlign_type!=null &&
              this.updateAlign_type.equals(other.getUpdateAlign_type())));
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
        if (getUpdateAlign_description() != null) {
            _hashCode += getUpdateAlign_description().hashCode();
        }
        if (getUpdateAlign_seqannot() != null) {
            _hashCode += getUpdateAlign_seqannot().hashCode();
        }
        if (getUpdateAlign_type() != null) {
            _hashCode += getUpdateAlign_type().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdateAlignType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Update-alignType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updateAlign_description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Update-align_description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Update-align_descriptionType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updateAlign_seqannot");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Update-align_seqannot"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Update-align_seqannotType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updateAlign_type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Update-align_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Update-align_typeType"));
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
