/**
 * MlaRequest_gettitleType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class MlaRequest_gettitleType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.TitleMsgType titleMsg;

    public MlaRequest_gettitleType() {
    }

    public MlaRequest_gettitleType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.TitleMsgType titleMsg) {
           this.titleMsg = titleMsg;
    }


    /**
     * Gets the titleMsg value for this MlaRequest_gettitleType.
     * 
     * @return titleMsg
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.TitleMsgType getTitleMsg() {
        return titleMsg;
    }


    /**
     * Sets the titleMsg value for this MlaRequest_gettitleType.
     * 
     * @param titleMsg
     */
    public void setTitleMsg(gov.nih.nlm.ncbi.www.soap.eutils.efetch.TitleMsgType titleMsg) {
        this.titleMsg = titleMsg;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MlaRequest_gettitleType)) return false;
        MlaRequest_gettitleType other = (MlaRequest_gettitleType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.titleMsg==null && other.getTitleMsg()==null) || 
             (this.titleMsg!=null &&
              this.titleMsg.equals(other.getTitleMsg())));
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
        if (getTitleMsg() != null) {
            _hashCode += getTitleMsg().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MlaRequest_gettitleType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mla-request_gettitleType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("titleMsg");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Title-msg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Title-msgType"));
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
