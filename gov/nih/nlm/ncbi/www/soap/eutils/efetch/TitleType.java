/**
 * TitleType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class TitleType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Title_EType[] title_E;

    public TitleType() {
    }

    public TitleType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Title_EType[] title_E) {
           this.title_E = title_E;
    }


    /**
     * Gets the title_E value for this TitleType.
     * 
     * @return title_E
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Title_EType[] getTitle_E() {
        return title_E;
    }


    /**
     * Sets the title_E value for this TitleType.
     * 
     * @param title_E
     */
    public void setTitle_E(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Title_EType[] title_E) {
        this.title_E = title_E;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Title_EType getTitle_E(int i) {
        return this.title_E[i];
    }

    public void setTitle_E(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.Title_EType _value) {
        this.title_E[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TitleType)) return false;
        TitleType other = (TitleType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.title_E==null && other.getTitle_E()==null) || 
             (this.title_E!=null &&
              java.util.Arrays.equals(this.title_E, other.getTitle_E())));
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
        if (getTitle_E() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTitle_E());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTitle_E(), i);
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
        new org.apache.axis.description.TypeDesc(TitleType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "TitleType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("title_E");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Title_E"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Title_EType"));
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
