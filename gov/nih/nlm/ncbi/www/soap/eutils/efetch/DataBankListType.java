/**
 * DataBankListType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class DataBankListType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.DataBankType[] dataBank;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.DataBankListTypeCompleteYN completeYN;  // attribute

    public DataBankListType() {
    }

    public DataBankListType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.DataBankType[] dataBank,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.DataBankListTypeCompleteYN completeYN) {
           this.dataBank = dataBank;
           this.completeYN = completeYN;
    }


    /**
     * Gets the dataBank value for this DataBankListType.
     * 
     * @return dataBank
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.DataBankType[] getDataBank() {
        return dataBank;
    }


    /**
     * Sets the dataBank value for this DataBankListType.
     * 
     * @param dataBank
     */
    public void setDataBank(gov.nih.nlm.ncbi.www.soap.eutils.efetch.DataBankType[] dataBank) {
        this.dataBank = dataBank;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.DataBankType getDataBank(int i) {
        return this.dataBank[i];
    }

    public void setDataBank(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.DataBankType _value) {
        this.dataBank[i] = _value;
    }


    /**
     * Gets the completeYN value for this DataBankListType.
     * 
     * @return completeYN
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.DataBankListTypeCompleteYN getCompleteYN() {
        return completeYN;
    }


    /**
     * Sets the completeYN value for this DataBankListType.
     * 
     * @param completeYN
     */
    public void setCompleteYN(gov.nih.nlm.ncbi.www.soap.eutils.efetch.DataBankListTypeCompleteYN completeYN) {
        this.completeYN = completeYN;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DataBankListType)) return false;
        DataBankListType other = (DataBankListType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dataBank==null && other.getDataBank()==null) || 
             (this.dataBank!=null &&
              java.util.Arrays.equals(this.dataBank, other.getDataBank()))) &&
            ((this.completeYN==null && other.getCompleteYN()==null) || 
             (this.completeYN!=null &&
              this.completeYN.equals(other.getCompleteYN())));
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
        if (getDataBank() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDataBank());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDataBank(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCompleteYN() != null) {
            _hashCode += getCompleteYN().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DataBankListType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "DataBankListType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("completeYN");
        attrField.setXmlName(new javax.xml.namespace.QName("", "CompleteYN"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">DataBankListType>CompleteYN"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataBank");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "DataBank"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "DataBankType"));
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
