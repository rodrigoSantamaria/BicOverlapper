/**
 * ID2SChunkContent_bioseqPlaceType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ID2SChunkContent_bioseqPlaceType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SBioseqPlaceInfoType[] ID2SBioseqPlaceInfo;

    public ID2SChunkContent_bioseqPlaceType() {
    }

    public ID2SChunkContent_bioseqPlaceType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SBioseqPlaceInfoType[] ID2SBioseqPlaceInfo) {
           this.ID2SBioseqPlaceInfo = ID2SBioseqPlaceInfo;
    }


    /**
     * Gets the ID2SBioseqPlaceInfo value for this ID2SChunkContent_bioseqPlaceType.
     * 
     * @return ID2SBioseqPlaceInfo
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SBioseqPlaceInfoType[] getID2SBioseqPlaceInfo() {
        return ID2SBioseqPlaceInfo;
    }


    /**
     * Sets the ID2SBioseqPlaceInfo value for this ID2SChunkContent_bioseqPlaceType.
     * 
     * @param ID2SBioseqPlaceInfo
     */
    public void setID2SBioseqPlaceInfo(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SBioseqPlaceInfoType[] ID2SBioseqPlaceInfo) {
        this.ID2SBioseqPlaceInfo = ID2SBioseqPlaceInfo;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SBioseqPlaceInfoType getID2SBioseqPlaceInfo(int i) {
        return this.ID2SBioseqPlaceInfo[i];
    }

    public void setID2SBioseqPlaceInfo(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SBioseqPlaceInfoType _value) {
        this.ID2SBioseqPlaceInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ID2SChunkContent_bioseqPlaceType)) return false;
        ID2SChunkContent_bioseqPlaceType other = (ID2SChunkContent_bioseqPlaceType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ID2SBioseqPlaceInfo==null && other.getID2SBioseqPlaceInfo()==null) || 
             (this.ID2SBioseqPlaceInfo!=null &&
              java.util.Arrays.equals(this.ID2SBioseqPlaceInfo, other.getID2SBioseqPlaceInfo())));
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
        if (getID2SBioseqPlaceInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getID2SBioseqPlaceInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getID2SBioseqPlaceInfo(), i);
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
        new org.apache.axis.description.TypeDesc(ID2SChunkContent_bioseqPlaceType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Chunk-Content_bioseq-placeType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2SBioseqPlaceInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Bioseq-place-Info"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Bioseq-place-InfoType"));
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
