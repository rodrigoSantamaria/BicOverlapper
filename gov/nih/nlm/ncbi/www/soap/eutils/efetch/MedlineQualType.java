/**
 * MedlineQualType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class MedlineQualType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MedlineQual_mpType medlineQual_mp;

    private java.lang.String medlineQual_subh;

    public MedlineQualType() {
    }

    public MedlineQualType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MedlineQual_mpType medlineQual_mp,
           java.lang.String medlineQual_subh) {
           this.medlineQual_mp = medlineQual_mp;
           this.medlineQual_subh = medlineQual_subh;
    }


    /**
     * Gets the medlineQual_mp value for this MedlineQualType.
     * 
     * @return medlineQual_mp
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MedlineQual_mpType getMedlineQual_mp() {
        return medlineQual_mp;
    }


    /**
     * Sets the medlineQual_mp value for this MedlineQualType.
     * 
     * @param medlineQual_mp
     */
    public void setMedlineQual_mp(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MedlineQual_mpType medlineQual_mp) {
        this.medlineQual_mp = medlineQual_mp;
    }


    /**
     * Gets the medlineQual_subh value for this MedlineQualType.
     * 
     * @return medlineQual_subh
     */
    public java.lang.String getMedlineQual_subh() {
        return medlineQual_subh;
    }


    /**
     * Sets the medlineQual_subh value for this MedlineQualType.
     * 
     * @param medlineQual_subh
     */
    public void setMedlineQual_subh(java.lang.String medlineQual_subh) {
        this.medlineQual_subh = medlineQual_subh;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MedlineQualType)) return false;
        MedlineQualType other = (MedlineQualType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.medlineQual_mp==null && other.getMedlineQual_mp()==null) || 
             (this.medlineQual_mp!=null &&
              this.medlineQual_mp.equals(other.getMedlineQual_mp()))) &&
            ((this.medlineQual_subh==null && other.getMedlineQual_subh()==null) || 
             (this.medlineQual_subh!=null &&
              this.medlineQual_subh.equals(other.getMedlineQual_subh())));
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
        if (getMedlineQual_mp() != null) {
            _hashCode += getMedlineQual_mp().hashCode();
        }
        if (getMedlineQual_subh() != null) {
            _hashCode += getMedlineQual_subh().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MedlineQualType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Medline-qualType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("medlineQual_mp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Medline-qual_mp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Medline-qual_mpType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("medlineQual_subh");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Medline-qual_subh"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
