/**
 * RejectIdType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class RejectIdType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.RejectId_descriptionType rejectId_description;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.RejectId_idsType rejectId_ids;

    public RejectIdType() {
    }

    public RejectIdType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.RejectId_descriptionType rejectId_description,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.RejectId_idsType rejectId_ids) {
           this.rejectId_description = rejectId_description;
           this.rejectId_ids = rejectId_ids;
    }


    /**
     * Gets the rejectId_description value for this RejectIdType.
     * 
     * @return rejectId_description
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.RejectId_descriptionType getRejectId_description() {
        return rejectId_description;
    }


    /**
     * Sets the rejectId_description value for this RejectIdType.
     * 
     * @param rejectId_description
     */
    public void setRejectId_description(gov.nih.nlm.ncbi.www.soap.eutils.efetch.RejectId_descriptionType rejectId_description) {
        this.rejectId_description = rejectId_description;
    }


    /**
     * Gets the rejectId_ids value for this RejectIdType.
     * 
     * @return rejectId_ids
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.RejectId_idsType getRejectId_ids() {
        return rejectId_ids;
    }


    /**
     * Sets the rejectId_ids value for this RejectIdType.
     * 
     * @param rejectId_ids
     */
    public void setRejectId_ids(gov.nih.nlm.ncbi.www.soap.eutils.efetch.RejectId_idsType rejectId_ids) {
        this.rejectId_ids = rejectId_ids;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RejectIdType)) return false;
        RejectIdType other = (RejectIdType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.rejectId_description==null && other.getRejectId_description()==null) || 
             (this.rejectId_description!=null &&
              this.rejectId_description.equals(other.getRejectId_description()))) &&
            ((this.rejectId_ids==null && other.getRejectId_ids()==null) || 
             (this.rejectId_ids!=null &&
              this.rejectId_ids.equals(other.getRejectId_ids())));
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
        if (getRejectId_description() != null) {
            _hashCode += getRejectId_description().hashCode();
        }
        if (getRejectId_ids() != null) {
            _hashCode += getRejectId_ids().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RejectIdType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Reject-idType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rejectId_description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Reject-id_description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Reject-id_descriptionType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rejectId_ids");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Reject-id_ids"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Reject-id_idsType"));
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
