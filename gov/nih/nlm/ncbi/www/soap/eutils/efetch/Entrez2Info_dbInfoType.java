/**
 * Entrez2Info_dbInfoType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Entrez2Info_dbInfoType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2DbInfoType[] entrez2DbInfo;

    public Entrez2Info_dbInfoType() {
    }

    public Entrez2Info_dbInfoType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2DbInfoType[] entrez2DbInfo) {
           this.entrez2DbInfo = entrez2DbInfo;
    }


    /**
     * Gets the entrez2DbInfo value for this Entrez2Info_dbInfoType.
     * 
     * @return entrez2DbInfo
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2DbInfoType[] getEntrez2DbInfo() {
        return entrez2DbInfo;
    }


    /**
     * Sets the entrez2DbInfo value for this Entrez2Info_dbInfoType.
     * 
     * @param entrez2DbInfo
     */
    public void setEntrez2DbInfo(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2DbInfoType[] entrez2DbInfo) {
        this.entrez2DbInfo = entrez2DbInfo;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2DbInfoType getEntrez2DbInfo(int i) {
        return this.entrez2DbInfo[i];
    }

    public void setEntrez2DbInfo(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2DbInfoType _value) {
        this.entrez2DbInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Entrez2Info_dbInfoType)) return false;
        Entrez2Info_dbInfoType other = (Entrez2Info_dbInfoType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.entrez2DbInfo==null && other.getEntrez2DbInfo()==null) || 
             (this.entrez2DbInfo!=null &&
              java.util.Arrays.equals(this.entrez2DbInfo, other.getEntrez2DbInfo())));
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
        if (getEntrez2DbInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEntrez2DbInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEntrez2DbInfo(), i);
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
        new org.apache.axis.description.TypeDesc(Entrez2Info_dbInfoType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-info_db-infoType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entrez2DbInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-db-info"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-db-infoType"));
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
