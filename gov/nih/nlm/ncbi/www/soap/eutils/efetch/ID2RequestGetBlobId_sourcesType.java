/**
 * ID2RequestGetBlobId_sourcesType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ID2RequestGetBlobId_sourcesType  implements java.io.Serializable {
    private java.lang.String[] ID2RequestGetBlobId_sources_E;

    public ID2RequestGetBlobId_sourcesType() {
    }

    public ID2RequestGetBlobId_sourcesType(
           java.lang.String[] ID2RequestGetBlobId_sources_E) {
           this.ID2RequestGetBlobId_sources_E = ID2RequestGetBlobId_sources_E;
    }


    /**
     * Gets the ID2RequestGetBlobId_sources_E value for this ID2RequestGetBlobId_sourcesType.
     * 
     * @return ID2RequestGetBlobId_sources_E
     */
    public java.lang.String[] getID2RequestGetBlobId_sources_E() {
        return ID2RequestGetBlobId_sources_E;
    }


    /**
     * Sets the ID2RequestGetBlobId_sources_E value for this ID2RequestGetBlobId_sourcesType.
     * 
     * @param ID2RequestGetBlobId_sources_E
     */
    public void setID2RequestGetBlobId_sources_E(java.lang.String[] ID2RequestGetBlobId_sources_E) {
        this.ID2RequestGetBlobId_sources_E = ID2RequestGetBlobId_sources_E;
    }

    public java.lang.String getID2RequestGetBlobId_sources_E(int i) {
        return this.ID2RequestGetBlobId_sources_E[i];
    }

    public void setID2RequestGetBlobId_sources_E(int i, java.lang.String _value) {
        this.ID2RequestGetBlobId_sources_E[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ID2RequestGetBlobId_sourcesType)) return false;
        ID2RequestGetBlobId_sourcesType other = (ID2RequestGetBlobId_sourcesType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ID2RequestGetBlobId_sources_E==null && other.getID2RequestGetBlobId_sources_E()==null) || 
             (this.ID2RequestGetBlobId_sources_E!=null &&
              java.util.Arrays.equals(this.ID2RequestGetBlobId_sources_E, other.getID2RequestGetBlobId_sources_E())));
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
        if (getID2RequestGetBlobId_sources_E() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getID2RequestGetBlobId_sources_E());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getID2RequestGetBlobId_sources_E(), i);
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
        new org.apache.axis.description.TypeDesc(ID2RequestGetBlobId_sourcesType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Request-Get-Blob-Id_sourcesType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2RequestGetBlobId_sources_E");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Request-Get-Blob-Id_sources_E"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Request-Get-Blob-Id_sources_E"));
        elemField.setMinOccurs(0);
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
