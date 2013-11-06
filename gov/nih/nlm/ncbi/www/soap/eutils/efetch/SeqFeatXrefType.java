/**
 * SeqFeatXrefType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class SeqFeatXrefType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqFeatXref_idType seqFeatXref_id;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqFeatXref_dataType seqFeatXref_data;

    public SeqFeatXrefType() {
    }

    public SeqFeatXrefType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqFeatXref_idType seqFeatXref_id,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqFeatXref_dataType seqFeatXref_data) {
           this.seqFeatXref_id = seqFeatXref_id;
           this.seqFeatXref_data = seqFeatXref_data;
    }


    /**
     * Gets the seqFeatXref_id value for this SeqFeatXrefType.
     * 
     * @return seqFeatXref_id
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqFeatXref_idType getSeqFeatXref_id() {
        return seqFeatXref_id;
    }


    /**
     * Sets the seqFeatXref_id value for this SeqFeatXrefType.
     * 
     * @param seqFeatXref_id
     */
    public void setSeqFeatXref_id(gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqFeatXref_idType seqFeatXref_id) {
        this.seqFeatXref_id = seqFeatXref_id;
    }


    /**
     * Gets the seqFeatXref_data value for this SeqFeatXrefType.
     * 
     * @return seqFeatXref_data
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqFeatXref_dataType getSeqFeatXref_data() {
        return seqFeatXref_data;
    }


    /**
     * Sets the seqFeatXref_data value for this SeqFeatXrefType.
     * 
     * @param seqFeatXref_data
     */
    public void setSeqFeatXref_data(gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqFeatXref_dataType seqFeatXref_data) {
        this.seqFeatXref_data = seqFeatXref_data;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SeqFeatXrefType)) return false;
        SeqFeatXrefType other = (SeqFeatXrefType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.seqFeatXref_id==null && other.getSeqFeatXref_id()==null) || 
             (this.seqFeatXref_id!=null &&
              this.seqFeatXref_id.equals(other.getSeqFeatXref_id()))) &&
            ((this.seqFeatXref_data==null && other.getSeqFeatXref_data()==null) || 
             (this.seqFeatXref_data!=null &&
              this.seqFeatXref_data.equals(other.getSeqFeatXref_data())));
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
        if (getSeqFeatXref_id() != null) {
            _hashCode += getSeqFeatXref_id().hashCode();
        }
        if (getSeqFeatXref_data() != null) {
            _hashCode += getSeqFeatXref_data().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SeqFeatXrefType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "SeqFeatXrefType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqFeatXref_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "SeqFeatXref_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "SeqFeatXref_idType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqFeatXref_data");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "SeqFeatXref_data"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "SeqFeatXref_dataType"));
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
