/**
 * IndexingSourceListType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class IndexingSourceListType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.IndexingSourceType[] indexingSource;

    public IndexingSourceListType() {
    }

    public IndexingSourceListType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.IndexingSourceType[] indexingSource) {
           this.indexingSource = indexingSource;
    }


    /**
     * Gets the indexingSource value for this IndexingSourceListType.
     * 
     * @return indexingSource
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.IndexingSourceType[] getIndexingSource() {
        return indexingSource;
    }


    /**
     * Sets the indexingSource value for this IndexingSourceListType.
     * 
     * @param indexingSource
     */
    public void setIndexingSource(gov.nih.nlm.ncbi.www.soap.eutils.efetch.IndexingSourceType[] indexingSource) {
        this.indexingSource = indexingSource;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.IndexingSourceType getIndexingSource(int i) {
        return this.indexingSource[i];
    }

    public void setIndexingSource(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.IndexingSourceType _value) {
        this.indexingSource[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IndexingSourceListType)) return false;
        IndexingSourceListType other = (IndexingSourceListType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.indexingSource==null && other.getIndexingSource()==null) || 
             (this.indexingSource!=null &&
              java.util.Arrays.equals(this.indexingSource, other.getIndexingSource())));
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
        if (getIndexingSource() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIndexingSource());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIndexingSource(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IndexingSourceListType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "IndexingSourceListType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indexingSource");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "IndexingSource"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "IndexingSourceType"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
