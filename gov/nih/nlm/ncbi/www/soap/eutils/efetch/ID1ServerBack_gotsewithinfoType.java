/**
 * ID1ServerBack_gotsewithinfoType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ID1ServerBack_gotsewithinfoType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID1SeqEntryInfoType ID1SeqEntryInfo;

    public ID1ServerBack_gotsewithinfoType() {
    }

    public ID1ServerBack_gotsewithinfoType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID1SeqEntryInfoType ID1SeqEntryInfo) {
           this.ID1SeqEntryInfo = ID1SeqEntryInfo;
    }


    /**
     * Gets the ID1SeqEntryInfo value for this ID1ServerBack_gotsewithinfoType.
     * 
     * @return ID1SeqEntryInfo
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID1SeqEntryInfoType getID1SeqEntryInfo() {
        return ID1SeqEntryInfo;
    }


    /**
     * Sets the ID1SeqEntryInfo value for this ID1ServerBack_gotsewithinfoType.
     * 
     * @param ID1SeqEntryInfo
     */
    public void setID1SeqEntryInfo(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID1SeqEntryInfoType ID1SeqEntryInfo) {
        this.ID1SeqEntryInfo = ID1SeqEntryInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ID1ServerBack_gotsewithinfoType)) return false;
        ID1ServerBack_gotsewithinfoType other = (ID1ServerBack_gotsewithinfoType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ID1SeqEntryInfo==null && other.getID1SeqEntryInfo()==null) || 
             (this.ID1SeqEntryInfo!=null &&
              this.ID1SeqEntryInfo.equals(other.getID1SeqEntryInfo())));
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
        if (getID1SeqEntryInfo() != null) {
            _hashCode += getID1SeqEntryInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ID1ServerBack_gotsewithinfoType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID1server-back_gotsewithinfoType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID1SeqEntryInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID1SeqEntry-info"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID1SeqEntry-infoType"));
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
