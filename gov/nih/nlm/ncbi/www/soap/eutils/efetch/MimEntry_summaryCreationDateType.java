/**
 * MimEntry_summaryCreationDateType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class MimEntry_summaryCreationDateType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimEditItemType mimEditItem;

    public MimEntry_summaryCreationDateType() {
    }

    public MimEntry_summaryCreationDateType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimEditItemType mimEditItem) {
           this.mimEditItem = mimEditItem;
    }


    /**
     * Gets the mimEditItem value for this MimEntry_summaryCreationDateType.
     * 
     * @return mimEditItem
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimEditItemType getMimEditItem() {
        return mimEditItem;
    }


    /**
     * Sets the mimEditItem value for this MimEntry_summaryCreationDateType.
     * 
     * @param mimEditItem
     */
    public void setMimEditItem(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimEditItemType mimEditItem) {
        this.mimEditItem = mimEditItem;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MimEntry_summaryCreationDateType)) return false;
        MimEntry_summaryCreationDateType other = (MimEntry_summaryCreationDateType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.mimEditItem==null && other.getMimEditItem()==null) || 
             (this.mimEditItem!=null &&
              this.mimEditItem.equals(other.getMimEditItem())));
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
        if (getMimEditItem() != null) {
            _hashCode += getMimEditItem().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MimEntry_summaryCreationDateType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-entry_summaryCreationDateType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mimEditItem");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-edit-item"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-edit-itemType"));
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
