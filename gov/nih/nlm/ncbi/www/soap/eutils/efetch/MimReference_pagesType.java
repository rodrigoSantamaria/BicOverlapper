/**
 * MimReference_pagesType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class MimReference_pagesType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimPageType[] mimPage;

    public MimReference_pagesType() {
    }

    public MimReference_pagesType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimPageType[] mimPage) {
           this.mimPage = mimPage;
    }


    /**
     * Gets the mimPage value for this MimReference_pagesType.
     * 
     * @return mimPage
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimPageType[] getMimPage() {
        return mimPage;
    }


    /**
     * Sets the mimPage value for this MimReference_pagesType.
     * 
     * @param mimPage
     */
    public void setMimPage(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimPageType[] mimPage) {
        this.mimPage = mimPage;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimPageType getMimPage(int i) {
        return this.mimPage[i];
    }

    public void setMimPage(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimPageType _value) {
        this.mimPage[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MimReference_pagesType)) return false;
        MimReference_pagesType other = (MimReference_pagesType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.mimPage==null && other.getMimPage()==null) || 
             (this.mimPage!=null &&
              java.util.Arrays.equals(this.mimPage, other.getMimPage())));
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
        if (getMimPage() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMimPage());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMimPage(), i);
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
        new org.apache.axis.description.TypeDesc(MimReference_pagesType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-reference_pagesType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mimPage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-page"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-pageType"));
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
