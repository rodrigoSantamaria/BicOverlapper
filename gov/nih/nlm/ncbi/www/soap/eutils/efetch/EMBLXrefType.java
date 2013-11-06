/**
 * EMBLXrefType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class EMBLXrefType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.EMBLXref_dbnameType EMBLXref_dbname;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.EMBLXref_idType EMBLXref_id;

    public EMBLXrefType() {
    }

    public EMBLXrefType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.EMBLXref_dbnameType EMBLXref_dbname,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.EMBLXref_idType EMBLXref_id) {
           this.EMBLXref_dbname = EMBLXref_dbname;
           this.EMBLXref_id = EMBLXref_id;
    }


    /**
     * Gets the EMBLXref_dbname value for this EMBLXrefType.
     * 
     * @return EMBLXref_dbname
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.EMBLXref_dbnameType getEMBLXref_dbname() {
        return EMBLXref_dbname;
    }


    /**
     * Sets the EMBLXref_dbname value for this EMBLXrefType.
     * 
     * @param EMBLXref_dbname
     */
    public void setEMBLXref_dbname(gov.nih.nlm.ncbi.www.soap.eutils.efetch.EMBLXref_dbnameType EMBLXref_dbname) {
        this.EMBLXref_dbname = EMBLXref_dbname;
    }


    /**
     * Gets the EMBLXref_id value for this EMBLXrefType.
     * 
     * @return EMBLXref_id
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.EMBLXref_idType getEMBLXref_id() {
        return EMBLXref_id;
    }


    /**
     * Sets the EMBLXref_id value for this EMBLXrefType.
     * 
     * @param EMBLXref_id
     */
    public void setEMBLXref_id(gov.nih.nlm.ncbi.www.soap.eutils.efetch.EMBLXref_idType EMBLXref_id) {
        this.EMBLXref_id = EMBLXref_id;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EMBLXrefType)) return false;
        EMBLXrefType other = (EMBLXrefType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.EMBLXref_dbname==null && other.getEMBLXref_dbname()==null) || 
             (this.EMBLXref_dbname!=null &&
              this.EMBLXref_dbname.equals(other.getEMBLXref_dbname()))) &&
            ((this.EMBLXref_id==null && other.getEMBLXref_id()==null) || 
             (this.EMBLXref_id!=null &&
              this.EMBLXref_id.equals(other.getEMBLXref_id())));
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
        if (getEMBLXref_dbname() != null) {
            _hashCode += getEMBLXref_dbname().hashCode();
        }
        if (getEMBLXref_id() != null) {
            _hashCode += getEMBLXref_id().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EMBLXrefType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "EMBL-xrefType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EMBLXref_dbname");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "EMBL-xref_dbname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "EMBL-xref_dbnameType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EMBLXref_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "EMBL-xref_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "EMBL-xref_idType"));
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
