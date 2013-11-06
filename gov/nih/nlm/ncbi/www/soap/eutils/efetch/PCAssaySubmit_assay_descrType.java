/**
 * PCAssaySubmit_assay_descrType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class PCAssaySubmit_assay_descrType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCAssayDescriptionType PCAssayDescription;

    public PCAssaySubmit_assay_descrType() {
    }

    public PCAssaySubmit_assay_descrType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCAssayDescriptionType PCAssayDescription) {
           this.PCAssayDescription = PCAssayDescription;
    }


    /**
     * Gets the PCAssayDescription value for this PCAssaySubmit_assay_descrType.
     * 
     * @return PCAssayDescription
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCAssayDescriptionType getPCAssayDescription() {
        return PCAssayDescription;
    }


    /**
     * Sets the PCAssayDescription value for this PCAssaySubmit_assay_descrType.
     * 
     * @param PCAssayDescription
     */
    public void setPCAssayDescription(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCAssayDescriptionType PCAssayDescription) {
        this.PCAssayDescription = PCAssayDescription;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PCAssaySubmit_assay_descrType)) return false;
        PCAssaySubmit_assay_descrType other = (PCAssaySubmit_assay_descrType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.PCAssayDescription==null && other.getPCAssayDescription()==null) || 
             (this.PCAssayDescription!=null &&
              this.PCAssayDescription.equals(other.getPCAssayDescription())));
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
        if (getPCAssayDescription() != null) {
            _hashCode += getPCAssayDescription().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PCAssaySubmit_assay_descrType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-AssaySubmit_assay_descrType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCAssayDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-AssayDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-AssayDescriptionType"));
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
