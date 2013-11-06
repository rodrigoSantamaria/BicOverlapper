/**
 * Entrez2DbInfo_fieldsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Entrez2DbInfo_fieldsType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2FieldInfoType[] entrez2FieldInfo;

    public Entrez2DbInfo_fieldsType() {
    }

    public Entrez2DbInfo_fieldsType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2FieldInfoType[] entrez2FieldInfo) {
           this.entrez2FieldInfo = entrez2FieldInfo;
    }


    /**
     * Gets the entrez2FieldInfo value for this Entrez2DbInfo_fieldsType.
     * 
     * @return entrez2FieldInfo
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2FieldInfoType[] getEntrez2FieldInfo() {
        return entrez2FieldInfo;
    }


    /**
     * Sets the entrez2FieldInfo value for this Entrez2DbInfo_fieldsType.
     * 
     * @param entrez2FieldInfo
     */
    public void setEntrez2FieldInfo(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2FieldInfoType[] entrez2FieldInfo) {
        this.entrez2FieldInfo = entrez2FieldInfo;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2FieldInfoType getEntrez2FieldInfo(int i) {
        return this.entrez2FieldInfo[i];
    }

    public void setEntrez2FieldInfo(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2FieldInfoType _value) {
        this.entrez2FieldInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Entrez2DbInfo_fieldsType)) return false;
        Entrez2DbInfo_fieldsType other = (Entrez2DbInfo_fieldsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.entrez2FieldInfo==null && other.getEntrez2FieldInfo()==null) || 
             (this.entrez2FieldInfo!=null &&
              java.util.Arrays.equals(this.entrez2FieldInfo, other.getEntrez2FieldInfo())));
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
        if (getEntrez2FieldInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEntrez2FieldInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEntrez2FieldInfo(), i);
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
        new org.apache.axis.description.TypeDesc(Entrez2DbInfo_fieldsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-db-info_fieldsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entrez2FieldInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-field-info"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-field-infoType"));
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
