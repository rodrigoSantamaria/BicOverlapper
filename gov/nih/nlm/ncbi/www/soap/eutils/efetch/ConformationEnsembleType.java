/**
 * ConformationEnsembleType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ConformationEnsembleType  implements java.io.Serializable {
    private java.lang.String conformationEnsemble_name;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ConformationEnsemble_altConfIdsType conformationEnsemble_altConfIds;

    public ConformationEnsembleType() {
    }

    public ConformationEnsembleType(
           java.lang.String conformationEnsemble_name,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ConformationEnsemble_altConfIdsType conformationEnsemble_altConfIds) {
           this.conformationEnsemble_name = conformationEnsemble_name;
           this.conformationEnsemble_altConfIds = conformationEnsemble_altConfIds;
    }


    /**
     * Gets the conformationEnsemble_name value for this ConformationEnsembleType.
     * 
     * @return conformationEnsemble_name
     */
    public java.lang.String getConformationEnsemble_name() {
        return conformationEnsemble_name;
    }


    /**
     * Sets the conformationEnsemble_name value for this ConformationEnsembleType.
     * 
     * @param conformationEnsemble_name
     */
    public void setConformationEnsemble_name(java.lang.String conformationEnsemble_name) {
        this.conformationEnsemble_name = conformationEnsemble_name;
    }


    /**
     * Gets the conformationEnsemble_altConfIds value for this ConformationEnsembleType.
     * 
     * @return conformationEnsemble_altConfIds
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ConformationEnsemble_altConfIdsType getConformationEnsemble_altConfIds() {
        return conformationEnsemble_altConfIds;
    }


    /**
     * Sets the conformationEnsemble_altConfIds value for this ConformationEnsembleType.
     * 
     * @param conformationEnsemble_altConfIds
     */
    public void setConformationEnsemble_altConfIds(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ConformationEnsemble_altConfIdsType conformationEnsemble_altConfIds) {
        this.conformationEnsemble_altConfIds = conformationEnsemble_altConfIds;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConformationEnsembleType)) return false;
        ConformationEnsembleType other = (ConformationEnsembleType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.conformationEnsemble_name==null && other.getConformationEnsemble_name()==null) || 
             (this.conformationEnsemble_name!=null &&
              this.conformationEnsemble_name.equals(other.getConformationEnsemble_name()))) &&
            ((this.conformationEnsemble_altConfIds==null && other.getConformationEnsemble_altConfIds()==null) || 
             (this.conformationEnsemble_altConfIds!=null &&
              this.conformationEnsemble_altConfIds.equals(other.getConformationEnsemble_altConfIds())));
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
        if (getConformationEnsemble_name() != null) {
            _hashCode += getConformationEnsemble_name().hashCode();
        }
        if (getConformationEnsemble_altConfIds() != null) {
            _hashCode += getConformationEnsemble_altConfIds().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConformationEnsembleType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Conformation-ensembleType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conformationEnsemble_name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Conformation-ensemble_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conformationEnsemble_altConfIds");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Conformation-ensemble_alt-conf-ids"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Conformation-ensemble_alt-conf-idsType"));
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
