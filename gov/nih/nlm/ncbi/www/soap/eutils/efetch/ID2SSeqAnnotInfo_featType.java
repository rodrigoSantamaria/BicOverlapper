/**
 * ID2SSeqAnnotInfo_featType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ID2SSeqAnnotInfo_featType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SFeatTypeInfoType[] ID2SFeatTypeInfo;

    public ID2SSeqAnnotInfo_featType() {
    }

    public ID2SSeqAnnotInfo_featType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SFeatTypeInfoType[] ID2SFeatTypeInfo) {
           this.ID2SFeatTypeInfo = ID2SFeatTypeInfo;
    }


    /**
     * Gets the ID2SFeatTypeInfo value for this ID2SSeqAnnotInfo_featType.
     * 
     * @return ID2SFeatTypeInfo
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SFeatTypeInfoType[] getID2SFeatTypeInfo() {
        return ID2SFeatTypeInfo;
    }


    /**
     * Sets the ID2SFeatTypeInfo value for this ID2SSeqAnnotInfo_featType.
     * 
     * @param ID2SFeatTypeInfo
     */
    public void setID2SFeatTypeInfo(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SFeatTypeInfoType[] ID2SFeatTypeInfo) {
        this.ID2SFeatTypeInfo = ID2SFeatTypeInfo;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SFeatTypeInfoType getID2SFeatTypeInfo(int i) {
        return this.ID2SFeatTypeInfo[i];
    }

    public void setID2SFeatTypeInfo(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SFeatTypeInfoType _value) {
        this.ID2SFeatTypeInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ID2SSeqAnnotInfo_featType)) return false;
        ID2SSeqAnnotInfo_featType other = (ID2SSeqAnnotInfo_featType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ID2SFeatTypeInfo==null && other.getID2SFeatTypeInfo()==null) || 
             (this.ID2SFeatTypeInfo!=null &&
              java.util.Arrays.equals(this.ID2SFeatTypeInfo, other.getID2SFeatTypeInfo())));
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
        if (getID2SFeatTypeInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getID2SFeatTypeInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getID2SFeatTypeInfo(), i);
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
        new org.apache.axis.description.TypeDesc(ID2SSeqAnnotInfo_featType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Seq-annot-Info_featType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2SFeatTypeInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Feat-type-Info"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Feat-type-InfoType"));
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
