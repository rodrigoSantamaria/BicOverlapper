/**
 * Cn3DStyleDictionary_styleTableType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Cn3DStyleDictionary_styleTableType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DStyleTableItemType[] cn3DStyleTableItem;

    public Cn3DStyleDictionary_styleTableType() {
    }

    public Cn3DStyleDictionary_styleTableType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DStyleTableItemType[] cn3DStyleTableItem) {
           this.cn3DStyleTableItem = cn3DStyleTableItem;
    }


    /**
     * Gets the cn3DStyleTableItem value for this Cn3DStyleDictionary_styleTableType.
     * 
     * @return cn3DStyleTableItem
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DStyleTableItemType[] getCn3DStyleTableItem() {
        return cn3DStyleTableItem;
    }


    /**
     * Sets the cn3DStyleTableItem value for this Cn3DStyleDictionary_styleTableType.
     * 
     * @param cn3DStyleTableItem
     */
    public void setCn3DStyleTableItem(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DStyleTableItemType[] cn3DStyleTableItem) {
        this.cn3DStyleTableItem = cn3DStyleTableItem;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DStyleTableItemType getCn3DStyleTableItem(int i) {
        return this.cn3DStyleTableItem[i];
    }

    public void setCn3DStyleTableItem(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DStyleTableItemType _value) {
        this.cn3DStyleTableItem[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Cn3DStyleDictionary_styleTableType)) return false;
        Cn3DStyleDictionary_styleTableType other = (Cn3DStyleDictionary_styleTableType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cn3DStyleTableItem==null && other.getCn3DStyleTableItem()==null) || 
             (this.cn3DStyleTableItem!=null &&
              java.util.Arrays.equals(this.cn3DStyleTableItem, other.getCn3DStyleTableItem())));
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
        if (getCn3DStyleTableItem() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCn3DStyleTableItem());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCn3DStyleTableItem(), i);
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
        new org.apache.axis.description.TypeDesc(Cn3DStyleDictionary_styleTableType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-style-dictionary_style-tableType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cn3DStyleTableItem");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-style-table-item"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-style-table-itemType"));
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
