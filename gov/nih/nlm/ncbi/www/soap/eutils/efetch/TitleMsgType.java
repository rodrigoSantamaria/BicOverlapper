/**
 * TitleMsgType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class TitleMsgType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.TitleMsg_typeType titleMsg_type;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.TitleMsg_titleType titleMsg_title;

    public TitleMsgType() {
    }

    public TitleMsgType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.TitleMsg_typeType titleMsg_type,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.TitleMsg_titleType titleMsg_title) {
           this.titleMsg_type = titleMsg_type;
           this.titleMsg_title = titleMsg_title;
    }


    /**
     * Gets the titleMsg_type value for this TitleMsgType.
     * 
     * @return titleMsg_type
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.TitleMsg_typeType getTitleMsg_type() {
        return titleMsg_type;
    }


    /**
     * Sets the titleMsg_type value for this TitleMsgType.
     * 
     * @param titleMsg_type
     */
    public void setTitleMsg_type(gov.nih.nlm.ncbi.www.soap.eutils.efetch.TitleMsg_typeType titleMsg_type) {
        this.titleMsg_type = titleMsg_type;
    }


    /**
     * Gets the titleMsg_title value for this TitleMsgType.
     * 
     * @return titleMsg_title
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.TitleMsg_titleType getTitleMsg_title() {
        return titleMsg_title;
    }


    /**
     * Sets the titleMsg_title value for this TitleMsgType.
     * 
     * @param titleMsg_title
     */
    public void setTitleMsg_title(gov.nih.nlm.ncbi.www.soap.eutils.efetch.TitleMsg_titleType titleMsg_title) {
        this.titleMsg_title = titleMsg_title;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TitleMsgType)) return false;
        TitleMsgType other = (TitleMsgType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.titleMsg_type==null && other.getTitleMsg_type()==null) || 
             (this.titleMsg_type!=null &&
              this.titleMsg_type.equals(other.getTitleMsg_type()))) &&
            ((this.titleMsg_title==null && other.getTitleMsg_title()==null) || 
             (this.titleMsg_title!=null &&
              this.titleMsg_title.equals(other.getTitleMsg_title())));
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
        if (getTitleMsg_type() != null) {
            _hashCode += getTitleMsg_type().hashCode();
        }
        if (getTitleMsg_title() != null) {
            _hashCode += getTitleMsg_title().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TitleMsgType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Title-msgType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("titleMsg_type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Title-msg_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Title-msg_typeType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("titleMsg_title");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Title-msg_title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Title-msg_titleType"));
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
