/**
 * MSRequest_spectraType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class MSRequest_spectraType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSSpectrumsetType MSSpectrumset;

    public MSRequest_spectraType() {
    }

    public MSRequest_spectraType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSSpectrumsetType MSSpectrumset) {
           this.MSSpectrumset = MSSpectrumset;
    }


    /**
     * Gets the MSSpectrumset value for this MSRequest_spectraType.
     * 
     * @return MSSpectrumset
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSSpectrumsetType getMSSpectrumset() {
        return MSSpectrumset;
    }


    /**
     * Sets the MSSpectrumset value for this MSRequest_spectraType.
     * 
     * @param MSSpectrumset
     */
    public void setMSSpectrumset(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSSpectrumsetType MSSpectrumset) {
        this.MSSpectrumset = MSSpectrumset;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MSRequest_spectraType)) return false;
        MSRequest_spectraType other = (MSRequest_spectraType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.MSSpectrumset==null && other.getMSSpectrumset()==null) || 
             (this.MSSpectrumset!=null &&
              this.MSSpectrumset.equals(other.getMSSpectrumset())));
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
        if (getMSSpectrumset() != null) {
            _hashCode += getMSSpectrumset().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MSRequest_spectraType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSRequest_spectraType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSSpectrumset");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSSpectrumset"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSSpectrumsetType"));
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
