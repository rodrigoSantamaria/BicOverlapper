/**
 * ID2Reply_reply_getSplitInfoType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ID2Reply_reply_getSplitInfoType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SReplyGetSplitInfoType ID2SReplyGetSplitInfo;

    public ID2Reply_reply_getSplitInfoType() {
    }

    public ID2Reply_reply_getSplitInfoType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SReplyGetSplitInfoType ID2SReplyGetSplitInfo) {
           this.ID2SReplyGetSplitInfo = ID2SReplyGetSplitInfo;
    }


    /**
     * Gets the ID2SReplyGetSplitInfo value for this ID2Reply_reply_getSplitInfoType.
     * 
     * @return ID2SReplyGetSplitInfo
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SReplyGetSplitInfoType getID2SReplyGetSplitInfo() {
        return ID2SReplyGetSplitInfo;
    }


    /**
     * Sets the ID2SReplyGetSplitInfo value for this ID2Reply_reply_getSplitInfoType.
     * 
     * @param ID2SReplyGetSplitInfo
     */
    public void setID2SReplyGetSplitInfo(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SReplyGetSplitInfoType ID2SReplyGetSplitInfo) {
        this.ID2SReplyGetSplitInfo = ID2SReplyGetSplitInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ID2Reply_reply_getSplitInfoType)) return false;
        ID2Reply_reply_getSplitInfoType other = (ID2Reply_reply_getSplitInfoType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ID2SReplyGetSplitInfo==null && other.getID2SReplyGetSplitInfo()==null) || 
             (this.ID2SReplyGetSplitInfo!=null &&
              this.ID2SReplyGetSplitInfo.equals(other.getID2SReplyGetSplitInfo())));
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
        if (getID2SReplyGetSplitInfo() != null) {
            _hashCode += getID2SReplyGetSplitInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ID2Reply_reply_getSplitInfoType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Reply_reply_get-split-infoType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2SReplyGetSplitInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Reply-Get-Split-Info"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Reply-Get-Split-InfoType"));
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
