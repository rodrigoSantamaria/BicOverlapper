/**
 * TitleMsgListType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class TitleMsgListType  implements java.io.Serializable {
    private java.lang.String titleMsgList_num;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.TitleMsgList_titlesType titleMsgList_titles;

    public TitleMsgListType() {
    }

    public TitleMsgListType(
           java.lang.String titleMsgList_num,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.TitleMsgList_titlesType titleMsgList_titles) {
           this.titleMsgList_num = titleMsgList_num;
           this.titleMsgList_titles = titleMsgList_titles;
    }


    /**
     * Gets the titleMsgList_num value for this TitleMsgListType.
     * 
     * @return titleMsgList_num
     */
    public java.lang.String getTitleMsgList_num() {
        return titleMsgList_num;
    }


    /**
     * Sets the titleMsgList_num value for this TitleMsgListType.
     * 
     * @param titleMsgList_num
     */
    public void setTitleMsgList_num(java.lang.String titleMsgList_num) {
        this.titleMsgList_num = titleMsgList_num;
    }


    /**
     * Gets the titleMsgList_titles value for this TitleMsgListType.
     * 
     * @return titleMsgList_titles
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.TitleMsgList_titlesType getTitleMsgList_titles() {
        return titleMsgList_titles;
    }


    /**
     * Sets the titleMsgList_titles value for this TitleMsgListType.
     * 
     * @param titleMsgList_titles
     */
    public void setTitleMsgList_titles(gov.nih.nlm.ncbi.www.soap.eutils.efetch.TitleMsgList_titlesType titleMsgList_titles) {
        this.titleMsgList_titles = titleMsgList_titles;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TitleMsgListType)) return false;
        TitleMsgListType other = (TitleMsgListType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.titleMsgList_num==null && other.getTitleMsgList_num()==null) || 
             (this.titleMsgList_num!=null &&
              this.titleMsgList_num.equals(other.getTitleMsgList_num()))) &&
            ((this.titleMsgList_titles==null && other.getTitleMsgList_titles()==null) || 
             (this.titleMsgList_titles!=null &&
              this.titleMsgList_titles.equals(other.getTitleMsgList_titles())));
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
        if (getTitleMsgList_num() != null) {
            _hashCode += getTitleMsgList_num().hashCode();
        }
        if (getTitleMsgList_titles() != null) {
            _hashCode += getTitleMsgList_titles().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TitleMsgListType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Title-msg-listType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("titleMsgList_num");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Title-msg-list_num"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("titleMsgList_titles");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Title-msg-list_titles"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Title-msg-list_titlesType"));
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
