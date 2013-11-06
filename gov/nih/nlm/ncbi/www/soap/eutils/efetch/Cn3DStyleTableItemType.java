/**
 * Cn3DStyleTableItemType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Cn3DStyleTableItemType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DStyleTableItem_idType cn3DStyleTableItem_id;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DStyleTableItem_styleType cn3DStyleTableItem_style;

    public Cn3DStyleTableItemType() {
    }

    public Cn3DStyleTableItemType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DStyleTableItem_idType cn3DStyleTableItem_id,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DStyleTableItem_styleType cn3DStyleTableItem_style) {
           this.cn3DStyleTableItem_id = cn3DStyleTableItem_id;
           this.cn3DStyleTableItem_style = cn3DStyleTableItem_style;
    }


    /**
     * Gets the cn3DStyleTableItem_id value for this Cn3DStyleTableItemType.
     * 
     * @return cn3DStyleTableItem_id
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DStyleTableItem_idType getCn3DStyleTableItem_id() {
        return cn3DStyleTableItem_id;
    }


    /**
     * Sets the cn3DStyleTableItem_id value for this Cn3DStyleTableItemType.
     * 
     * @param cn3DStyleTableItem_id
     */
    public void setCn3DStyleTableItem_id(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DStyleTableItem_idType cn3DStyleTableItem_id) {
        this.cn3DStyleTableItem_id = cn3DStyleTableItem_id;
    }


    /**
     * Gets the cn3DStyleTableItem_style value for this Cn3DStyleTableItemType.
     * 
     * @return cn3DStyleTableItem_style
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DStyleTableItem_styleType getCn3DStyleTableItem_style() {
        return cn3DStyleTableItem_style;
    }


    /**
     * Sets the cn3DStyleTableItem_style value for this Cn3DStyleTableItemType.
     * 
     * @param cn3DStyleTableItem_style
     */
    public void setCn3DStyleTableItem_style(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DStyleTableItem_styleType cn3DStyleTableItem_style) {
        this.cn3DStyleTableItem_style = cn3DStyleTableItem_style;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Cn3DStyleTableItemType)) return false;
        Cn3DStyleTableItemType other = (Cn3DStyleTableItemType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cn3DStyleTableItem_id==null && other.getCn3DStyleTableItem_id()==null) || 
             (this.cn3DStyleTableItem_id!=null &&
              this.cn3DStyleTableItem_id.equals(other.getCn3DStyleTableItem_id()))) &&
            ((this.cn3DStyleTableItem_style==null && other.getCn3DStyleTableItem_style()==null) || 
             (this.cn3DStyleTableItem_style!=null &&
              this.cn3DStyleTableItem_style.equals(other.getCn3DStyleTableItem_style())));
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
        if (getCn3DStyleTableItem_id() != null) {
            _hashCode += getCn3DStyleTableItem_id().hashCode();
        }
        if (getCn3DStyleTableItem_style() != null) {
            _hashCode += getCn3DStyleTableItem_style().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Cn3DStyleTableItemType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-style-table-itemType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cn3DStyleTableItem_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-style-table-item_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-style-table-item_idType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cn3DStyleTableItem_style");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-style-table-item_style"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-style-table-item_styleType"));
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
