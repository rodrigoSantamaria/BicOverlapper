/**
 * PCAssaySubmitType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class PCAssaySubmitType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCAssaySubmit_assayType PCAssaySubmit_assay;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCAssaySubmit_dataType PCAssaySubmit_data;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCAssaySubmit_revokeType PCAssaySubmit_revoke;

    public PCAssaySubmitType() {
    }

    public PCAssaySubmitType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCAssaySubmit_assayType PCAssaySubmit_assay,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCAssaySubmit_dataType PCAssaySubmit_data,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCAssaySubmit_revokeType PCAssaySubmit_revoke) {
           this.PCAssaySubmit_assay = PCAssaySubmit_assay;
           this.PCAssaySubmit_data = PCAssaySubmit_data;
           this.PCAssaySubmit_revoke = PCAssaySubmit_revoke;
    }


    /**
     * Gets the PCAssaySubmit_assay value for this PCAssaySubmitType.
     * 
     * @return PCAssaySubmit_assay
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCAssaySubmit_assayType getPCAssaySubmit_assay() {
        return PCAssaySubmit_assay;
    }


    /**
     * Sets the PCAssaySubmit_assay value for this PCAssaySubmitType.
     * 
     * @param PCAssaySubmit_assay
     */
    public void setPCAssaySubmit_assay(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCAssaySubmit_assayType PCAssaySubmit_assay) {
        this.PCAssaySubmit_assay = PCAssaySubmit_assay;
    }


    /**
     * Gets the PCAssaySubmit_data value for this PCAssaySubmitType.
     * 
     * @return PCAssaySubmit_data
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCAssaySubmit_dataType getPCAssaySubmit_data() {
        return PCAssaySubmit_data;
    }


    /**
     * Sets the PCAssaySubmit_data value for this PCAssaySubmitType.
     * 
     * @param PCAssaySubmit_data
     */
    public void setPCAssaySubmit_data(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCAssaySubmit_dataType PCAssaySubmit_data) {
        this.PCAssaySubmit_data = PCAssaySubmit_data;
    }


    /**
     * Gets the PCAssaySubmit_revoke value for this PCAssaySubmitType.
     * 
     * @return PCAssaySubmit_revoke
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCAssaySubmit_revokeType getPCAssaySubmit_revoke() {
        return PCAssaySubmit_revoke;
    }


    /**
     * Sets the PCAssaySubmit_revoke value for this PCAssaySubmitType.
     * 
     * @param PCAssaySubmit_revoke
     */
    public void setPCAssaySubmit_revoke(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCAssaySubmit_revokeType PCAssaySubmit_revoke) {
        this.PCAssaySubmit_revoke = PCAssaySubmit_revoke;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PCAssaySubmitType)) return false;
        PCAssaySubmitType other = (PCAssaySubmitType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.PCAssaySubmit_assay==null && other.getPCAssaySubmit_assay()==null) || 
             (this.PCAssaySubmit_assay!=null &&
              this.PCAssaySubmit_assay.equals(other.getPCAssaySubmit_assay()))) &&
            ((this.PCAssaySubmit_data==null && other.getPCAssaySubmit_data()==null) || 
             (this.PCAssaySubmit_data!=null &&
              this.PCAssaySubmit_data.equals(other.getPCAssaySubmit_data()))) &&
            ((this.PCAssaySubmit_revoke==null && other.getPCAssaySubmit_revoke()==null) || 
             (this.PCAssaySubmit_revoke!=null &&
              this.PCAssaySubmit_revoke.equals(other.getPCAssaySubmit_revoke())));
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
        if (getPCAssaySubmit_assay() != null) {
            _hashCode += getPCAssaySubmit_assay().hashCode();
        }
        if (getPCAssaySubmit_data() != null) {
            _hashCode += getPCAssaySubmit_data().hashCode();
        }
        if (getPCAssaySubmit_revoke() != null) {
            _hashCode += getPCAssaySubmit_revoke().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PCAssaySubmitType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-AssaySubmitType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCAssaySubmit_assay");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-AssaySubmit_assay"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-AssaySubmit_assayType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCAssaySubmit_data");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-AssaySubmit_data"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-AssaySubmit_dataType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCAssaySubmit_revoke");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-AssaySubmit_revoke"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-AssaySubmit_revokeType"));
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
