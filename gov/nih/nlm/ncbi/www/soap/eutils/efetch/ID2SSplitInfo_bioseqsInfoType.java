/**
 * ID2SSplitInfo_bioseqsInfoType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ID2SSplitInfo_bioseqsInfoType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SBioseqsInfoType[] ID2SBioseqsInfo;

    public ID2SSplitInfo_bioseqsInfoType() {
    }

    public ID2SSplitInfo_bioseqsInfoType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SBioseqsInfoType[] ID2SBioseqsInfo) {
           this.ID2SBioseqsInfo = ID2SBioseqsInfo;
    }


    /**
     * Gets the ID2SBioseqsInfo value for this ID2SSplitInfo_bioseqsInfoType.
     * 
     * @return ID2SBioseqsInfo
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SBioseqsInfoType[] getID2SBioseqsInfo() {
        return ID2SBioseqsInfo;
    }


    /**
     * Sets the ID2SBioseqsInfo value for this ID2SSplitInfo_bioseqsInfoType.
     * 
     * @param ID2SBioseqsInfo
     */
    public void setID2SBioseqsInfo(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SBioseqsInfoType[] ID2SBioseqsInfo) {
        this.ID2SBioseqsInfo = ID2SBioseqsInfo;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SBioseqsInfoType getID2SBioseqsInfo(int i) {
        return this.ID2SBioseqsInfo[i];
    }

    public void setID2SBioseqsInfo(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SBioseqsInfoType _value) {
        this.ID2SBioseqsInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ID2SSplitInfo_bioseqsInfoType)) return false;
        ID2SSplitInfo_bioseqsInfoType other = (ID2SSplitInfo_bioseqsInfoType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ID2SBioseqsInfo==null && other.getID2SBioseqsInfo()==null) || 
             (this.ID2SBioseqsInfo!=null &&
              java.util.Arrays.equals(this.ID2SBioseqsInfo, other.getID2SBioseqsInfo())));
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
        if (getID2SBioseqsInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getID2SBioseqsInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getID2SBioseqsInfo(), i);
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
        new org.apache.axis.description.TypeDesc(ID2SSplitInfo_bioseqsInfoType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Split-Info_bioseqs-infoType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2SBioseqsInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Bioseqs-Info"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Bioseqs-InfoType"));
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
