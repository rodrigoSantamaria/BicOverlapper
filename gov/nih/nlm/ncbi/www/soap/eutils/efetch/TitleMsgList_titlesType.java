/**
 * TitleMsgList_titlesType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class TitleMsgList_titlesType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.TitleMsgType[] titleMsg;

    public TitleMsgList_titlesType() {
    }

    public TitleMsgList_titlesType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.TitleMsgType[] titleMsg) {
           this.titleMsg = titleMsg;
    }


    /**
     * Gets the titleMsg value for this TitleMsgList_titlesType.
     * 
     * @return titleMsg
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.TitleMsgType[] getTitleMsg() {
        return titleMsg;
    }


    /**
     * Sets the titleMsg value for this TitleMsgList_titlesType.
     * 
     * @param titleMsg
     */
    public void setTitleMsg(gov.nih.nlm.ncbi.www.soap.eutils.efetch.TitleMsgType[] titleMsg) {
        this.titleMsg = titleMsg;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.TitleMsgType getTitleMsg(int i) {
        return this.titleMsg[i];
    }

    public void setTitleMsg(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.TitleMsgType _value) {
        this.titleMsg[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TitleMsgList_titlesType)) return false;
        TitleMsgList_titlesType other = (TitleMsgList_titlesType) obj;
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
              java.util.Arrays.equals(this.titleMsg, other.getTitleMsg())));
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
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTitleMsg());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTitleMsg(), i);
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
        new org.apache.axis.description.TypeDesc(TitleMsgList_titlesType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Title-msg-list_titlesType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("titleMsg");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Title-msg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Title-msgType"));
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
