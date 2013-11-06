/**
 * SeqFeatXref_dataType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class SeqFeatXref_dataType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqFeatDataType seqFeatData;

    public SeqFeatXref_dataType() {
    }

    public SeqFeatXref_dataType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqFeatDataType seqFeatData) {
           this.seqFeatData = seqFeatData;
    }


    /**
     * Gets the seqFeatData value for this SeqFeatXref_dataType.
     * 
     * @return seqFeatData
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqFeatDataType getSeqFeatData() {
        return seqFeatData;
    }


    /**
     * Sets the seqFeatData value for this SeqFeatXref_dataType.
     * 
     * @param seqFeatData
     */
    public void setSeqFeatData(gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqFeatDataType seqFeatData) {
        this.seqFeatData = seqFeatData;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SeqFeatXref_dataType)) return false;
        SeqFeatXref_dataType other = (SeqFeatXref_dataType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.seqFeatData==null && other.getSeqFeatData()==null) || 
             (this.seqFeatData!=null &&
              this.seqFeatData.equals(other.getSeqFeatData())));
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
        if (getSeqFeatData() != null) {
            _hashCode += getSeqFeatData().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SeqFeatXref_dataType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "SeqFeatXref_dataType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqFeatData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "SeqFeatData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "SeqFeatDataType"));
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
