/**
 * IndexingSourceType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class IndexingSourceType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.IndexingSourceNameType indexingSourceName;

    private java.lang.String coverage;

    public IndexingSourceType() {
    }

    public IndexingSourceType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.IndexingSourceNameType indexingSourceName,
           java.lang.String coverage) {
           this.indexingSourceName = indexingSourceName;
           this.coverage = coverage;
    }


    /**
     * Gets the indexingSourceName value for this IndexingSourceType.
     * 
     * @return indexingSourceName
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.IndexingSourceNameType getIndexingSourceName() {
        return indexingSourceName;
    }


    /**
     * Sets the indexingSourceName value for this IndexingSourceType.
     * 
     * @param indexingSourceName
     */
    public void setIndexingSourceName(gov.nih.nlm.ncbi.www.soap.eutils.efetch.IndexingSourceNameType indexingSourceName) {
        this.indexingSourceName = indexingSourceName;
    }


    /**
     * Gets the coverage value for this IndexingSourceType.
     * 
     * @return coverage
     */
    public java.lang.String getCoverage() {
        return coverage;
    }


    /**
     * Sets the coverage value for this IndexingSourceType.
     * 
     * @param coverage
     */
    public void setCoverage(java.lang.String coverage) {
        this.coverage = coverage;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IndexingSourceType)) return false;
        IndexingSourceType other = (IndexingSourceType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.indexingSourceName==null && other.getIndexingSourceName()==null) || 
             (this.indexingSourceName!=null &&
              this.indexingSourceName.equals(other.getIndexingSourceName()))) &&
            ((this.coverage==null && other.getCoverage()==null) || 
             (this.coverage!=null &&
              this.coverage.equals(other.getCoverage())));
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
        if (getIndexingSourceName() != null) {
            _hashCode += getIndexingSourceName().hashCode();
        }
        if (getCoverage() != null) {
            _hashCode += getCoverage().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IndexingSourceType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "IndexingSourceType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indexingSourceName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "IndexingSourceName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "IndexingSourceNameType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coverage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Coverage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
