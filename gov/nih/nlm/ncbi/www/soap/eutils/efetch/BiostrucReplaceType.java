/**
 * BiostrucReplaceType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class BiostrucReplaceType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucReplace_idType biostrucReplace_id;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucReplace_dateType biostrucReplace_date;

    public BiostrucReplaceType() {
    }

    public BiostrucReplaceType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucReplace_idType biostrucReplace_id,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucReplace_dateType biostrucReplace_date) {
           this.biostrucReplace_id = biostrucReplace_id;
           this.biostrucReplace_date = biostrucReplace_date;
    }


    /**
     * Gets the biostrucReplace_id value for this BiostrucReplaceType.
     * 
     * @return biostrucReplace_id
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucReplace_idType getBiostrucReplace_id() {
        return biostrucReplace_id;
    }


    /**
     * Sets the biostrucReplace_id value for this BiostrucReplaceType.
     * 
     * @param biostrucReplace_id
     */
    public void setBiostrucReplace_id(gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucReplace_idType biostrucReplace_id) {
        this.biostrucReplace_id = biostrucReplace_id;
    }


    /**
     * Gets the biostrucReplace_date value for this BiostrucReplaceType.
     * 
     * @return biostrucReplace_date
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucReplace_dateType getBiostrucReplace_date() {
        return biostrucReplace_date;
    }


    /**
     * Sets the biostrucReplace_date value for this BiostrucReplaceType.
     * 
     * @param biostrucReplace_date
     */
    public void setBiostrucReplace_date(gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucReplace_dateType biostrucReplace_date) {
        this.biostrucReplace_date = biostrucReplace_date;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BiostrucReplaceType)) return false;
        BiostrucReplaceType other = (BiostrucReplaceType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.biostrucReplace_id==null && other.getBiostrucReplace_id()==null) || 
             (this.biostrucReplace_id!=null &&
              this.biostrucReplace_id.equals(other.getBiostrucReplace_id()))) &&
            ((this.biostrucReplace_date==null && other.getBiostrucReplace_date()==null) || 
             (this.biostrucReplace_date!=null &&
              this.biostrucReplace_date.equals(other.getBiostrucReplace_date())));
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
        if (getBiostrucReplace_id() != null) {
            _hashCode += getBiostrucReplace_id().hashCode();
        }
        if (getBiostrucReplace_date() != null) {
            _hashCode += getBiostrucReplace_date().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BiostrucReplaceType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-replaceType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("biostrucReplace_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-replace_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-replace_idType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("biostrucReplace_date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-replace_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-replace_dateType"));
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
