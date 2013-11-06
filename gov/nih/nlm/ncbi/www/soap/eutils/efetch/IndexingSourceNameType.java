/**
 * IndexingSourceNameType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class IndexingSourceNameType  implements java.io.Serializable, org.apache.axis.encoding.SimpleType {
    private java.lang.String _value;

    private java.lang.String indexingTreatment;  // attribute

    private java.lang.String indexingStatus;  // attribute

    public IndexingSourceNameType() {
    }

    // Simple Types must have a String constructor
    public IndexingSourceNameType(java.lang.String _value) {
        this._value = _value;
    }
    // Simple Types must have a toString for serializing the value
    public java.lang.String toString() {
        return _value;
    }


    /**
     * Gets the _value value for this IndexingSourceNameType.
     * 
     * @return _value
     */
    public java.lang.String get_value() {
        return _value;
    }


    /**
     * Sets the _value value for this IndexingSourceNameType.
     * 
     * @param _value
     */
    public void set_value(java.lang.String _value) {
        this._value = _value;
    }


    /**
     * Gets the indexingTreatment value for this IndexingSourceNameType.
     * 
     * @return indexingTreatment
     */
    public java.lang.String getIndexingTreatment() {
        return indexingTreatment;
    }


    /**
     * Sets the indexingTreatment value for this IndexingSourceNameType.
     * 
     * @param indexingTreatment
     */
    public void setIndexingTreatment(java.lang.String indexingTreatment) {
        this.indexingTreatment = indexingTreatment;
    }


    /**
     * Gets the indexingStatus value for this IndexingSourceNameType.
     * 
     * @return indexingStatus
     */
    public java.lang.String getIndexingStatus() {
        return indexingStatus;
    }


    /**
     * Sets the indexingStatus value for this IndexingSourceNameType.
     * 
     * @param indexingStatus
     */
    public void setIndexingStatus(java.lang.String indexingStatus) {
        this.indexingStatus = indexingStatus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IndexingSourceNameType)) return false;
        IndexingSourceNameType other = (IndexingSourceNameType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this._value==null && other.get_value()==null) || 
             (this._value!=null &&
              this._value.equals(other.get_value()))) &&
            ((this.indexingTreatment==null && other.getIndexingTreatment()==null) || 
             (this.indexingTreatment!=null &&
              this.indexingTreatment.equals(other.getIndexingTreatment()))) &&
            ((this.indexingStatus==null && other.getIndexingStatus()==null) || 
             (this.indexingStatus!=null &&
              this.indexingStatus.equals(other.getIndexingStatus())));
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
        if (get_value() != null) {
            _hashCode += get_value().hashCode();
        }
        if (getIndexingTreatment() != null) {
            _hashCode += getIndexingTreatment().hashCode();
        }
        if (getIndexingStatus() != null) {
            _hashCode += getIndexingStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IndexingSourceNameType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "IndexingSourceNameType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("indexingTreatment");
        attrField.setXmlName(new javax.xml.namespace.QName("", "IndexingTreatment"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("indexingStatus");
        attrField.setXmlName(new javax.xml.namespace.QName("", "IndexingStatus"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_value");
        elemField.setXmlName(new javax.xml.namespace.QName("", "_value"));
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
          new  org.apache.axis.encoding.ser.SimpleSerializer(
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
          new  org.apache.axis.encoding.ser.SimpleDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
