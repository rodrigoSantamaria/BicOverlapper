/**
 * MSSearchSettings_zdepType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class MSSearchSettings_zdepType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSZdependenceType MSZdependence;

    public MSSearchSettings_zdepType() {
    }

    public MSSearchSettings_zdepType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSZdependenceType MSZdependence) {
           this.MSZdependence = MSZdependence;
    }


    /**
     * Gets the MSZdependence value for this MSSearchSettings_zdepType.
     * 
     * @return MSZdependence
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSZdependenceType getMSZdependence() {
        return MSZdependence;
    }


    /**
     * Sets the MSZdependence value for this MSSearchSettings_zdepType.
     * 
     * @param MSZdependence
     */
    public void setMSZdependence(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSZdependenceType MSZdependence) {
        this.MSZdependence = MSZdependence;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MSSearchSettings_zdepType)) return false;
        MSSearchSettings_zdepType other = (MSSearchSettings_zdepType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.MSZdependence==null && other.getMSZdependence()==null) || 
             (this.MSZdependence!=null &&
              this.MSZdependence.equals(other.getMSZdependence())));
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
        if (getMSZdependence() != null) {
            _hashCode += getMSZdependence().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MSSearchSettings_zdepType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSSearchSettings_zdepType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSZdependence");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSZdependence"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSZdependenceType"));
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
