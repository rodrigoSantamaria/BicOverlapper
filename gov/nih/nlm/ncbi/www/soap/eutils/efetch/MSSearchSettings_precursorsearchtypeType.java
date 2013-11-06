/**
 * MSSearchSettings_precursorsearchtypeType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class MSSearchSettings_precursorsearchtypeType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSSearchTypeType MSSearchType;

    public MSSearchSettings_precursorsearchtypeType() {
    }

    public MSSearchSettings_precursorsearchtypeType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSSearchTypeType MSSearchType) {
           this.MSSearchType = MSSearchType;
    }


    /**
     * Gets the MSSearchType value for this MSSearchSettings_precursorsearchtypeType.
     * 
     * @return MSSearchType
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSSearchTypeType getMSSearchType() {
        return MSSearchType;
    }


    /**
     * Sets the MSSearchType value for this MSSearchSettings_precursorsearchtypeType.
     * 
     * @param MSSearchType
     */
    public void setMSSearchType(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSSearchTypeType MSSearchType) {
        this.MSSearchType = MSSearchType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MSSearchSettings_precursorsearchtypeType)) return false;
        MSSearchSettings_precursorsearchtypeType other = (MSSearchSettings_precursorsearchtypeType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.MSSearchType==null && other.getMSSearchType()==null) || 
             (this.MSSearchType!=null &&
              this.MSSearchType.equals(other.getMSSearchType())));
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
        if (getMSSearchType() != null) {
            _hashCode += getMSSearchType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MSSearchSettings_precursorsearchtypeType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSSearchSettings_precursorsearchtypeType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSSearchType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSSearchType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSSearchTypeType"));
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
