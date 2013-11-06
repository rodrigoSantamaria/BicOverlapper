/**
 * MimEntry_textfieldsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class MimEntry_textfieldsType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimTextType[] mimText;

    public MimEntry_textfieldsType() {
    }

    public MimEntry_textfieldsType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimTextType[] mimText) {
           this.mimText = mimText;
    }


    /**
     * Gets the mimText value for this MimEntry_textfieldsType.
     * 
     * @return mimText
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimTextType[] getMimText() {
        return mimText;
    }


    /**
     * Sets the mimText value for this MimEntry_textfieldsType.
     * 
     * @param mimText
     */
    public void setMimText(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimTextType[] mimText) {
        this.mimText = mimText;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimTextType getMimText(int i) {
        return this.mimText[i];
    }

    public void setMimText(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimTextType _value) {
        this.mimText[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MimEntry_textfieldsType)) return false;
        MimEntry_textfieldsType other = (MimEntry_textfieldsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.mimText==null && other.getMimText()==null) || 
             (this.mimText!=null &&
              java.util.Arrays.equals(this.mimText, other.getMimText())));
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
        if (getMimText() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMimText());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMimText(), i);
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
        new org.apache.axis.description.TypeDesc(MimEntry_textfieldsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-entry_textfieldsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mimText");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-text"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-textType"));
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
