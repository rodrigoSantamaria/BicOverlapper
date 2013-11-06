/**
 * Entrez2DbInfo_linksType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Entrez2DbInfo_linksType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2LinkInfoType[] entrez2LinkInfo;

    public Entrez2DbInfo_linksType() {
    }

    public Entrez2DbInfo_linksType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2LinkInfoType[] entrez2LinkInfo) {
           this.entrez2LinkInfo = entrez2LinkInfo;
    }


    /**
     * Gets the entrez2LinkInfo value for this Entrez2DbInfo_linksType.
     * 
     * @return entrez2LinkInfo
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2LinkInfoType[] getEntrez2LinkInfo() {
        return entrez2LinkInfo;
    }


    /**
     * Sets the entrez2LinkInfo value for this Entrez2DbInfo_linksType.
     * 
     * @param entrez2LinkInfo
     */
    public void setEntrez2LinkInfo(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2LinkInfoType[] entrez2LinkInfo) {
        this.entrez2LinkInfo = entrez2LinkInfo;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2LinkInfoType getEntrez2LinkInfo(int i) {
        return this.entrez2LinkInfo[i];
    }

    public void setEntrez2LinkInfo(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2LinkInfoType _value) {
        this.entrez2LinkInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Entrez2DbInfo_linksType)) return false;
        Entrez2DbInfo_linksType other = (Entrez2DbInfo_linksType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.entrez2LinkInfo==null && other.getEntrez2LinkInfo()==null) || 
             (this.entrez2LinkInfo!=null &&
              java.util.Arrays.equals(this.entrez2LinkInfo, other.getEntrez2LinkInfo())));
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
        if (getEntrez2LinkInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEntrez2LinkInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEntrez2LinkInfo(), i);
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
        new org.apache.axis.description.TypeDesc(Entrez2DbInfo_linksType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-db-info_linksType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entrez2LinkInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-link-info"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-link-infoType"));
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
