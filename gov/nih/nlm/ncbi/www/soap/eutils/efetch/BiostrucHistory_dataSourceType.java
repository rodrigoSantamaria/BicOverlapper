/**
 * BiostrucHistory_dataSourceType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class BiostrucHistory_dataSourceType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucSourceType biostrucSource;

    public BiostrucHistory_dataSourceType() {
    }

    public BiostrucHistory_dataSourceType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucSourceType biostrucSource) {
           this.biostrucSource = biostrucSource;
    }


    /**
     * Gets the biostrucSource value for this BiostrucHistory_dataSourceType.
     * 
     * @return biostrucSource
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucSourceType getBiostrucSource() {
        return biostrucSource;
    }


    /**
     * Sets the biostrucSource value for this BiostrucHistory_dataSourceType.
     * 
     * @param biostrucSource
     */
    public void setBiostrucSource(gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucSourceType biostrucSource) {
        this.biostrucSource = biostrucSource;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BiostrucHistory_dataSourceType)) return false;
        BiostrucHistory_dataSourceType other = (BiostrucHistory_dataSourceType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.biostrucSource==null && other.getBiostrucSource()==null) || 
             (this.biostrucSource!=null &&
              this.biostrucSource.equals(other.getBiostrucSource())));
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
        if (getBiostrucSource() != null) {
            _hashCode += getBiostrucSource().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BiostrucHistory_dataSourceType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-history_data-sourceType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("biostrucSource");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-source"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-sourceType"));
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
