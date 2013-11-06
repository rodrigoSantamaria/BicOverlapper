/**
 * MSSearchSettings_enzymeType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class MSSearchSettings_enzymeType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSEnzymesType MSEnzymes;

    public MSSearchSettings_enzymeType() {
    }

    public MSSearchSettings_enzymeType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSEnzymesType MSEnzymes) {
           this.MSEnzymes = MSEnzymes;
    }


    /**
     * Gets the MSEnzymes value for this MSSearchSettings_enzymeType.
     * 
     * @return MSEnzymes
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSEnzymesType getMSEnzymes() {
        return MSEnzymes;
    }


    /**
     * Sets the MSEnzymes value for this MSSearchSettings_enzymeType.
     * 
     * @param MSEnzymes
     */
    public void setMSEnzymes(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSEnzymesType MSEnzymes) {
        this.MSEnzymes = MSEnzymes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MSSearchSettings_enzymeType)) return false;
        MSSearchSettings_enzymeType other = (MSSearchSettings_enzymeType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.MSEnzymes==null && other.getMSEnzymes()==null) || 
             (this.MSEnzymes!=null &&
              this.MSEnzymes.equals(other.getMSEnzymes())));
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
        if (getMSEnzymes() != null) {
            _hashCode += getMSEnzymes().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MSSearchSettings_enzymeType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSSearchSettings_enzymeType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSEnzymes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSEnzymes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSEnzymesType"));
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
