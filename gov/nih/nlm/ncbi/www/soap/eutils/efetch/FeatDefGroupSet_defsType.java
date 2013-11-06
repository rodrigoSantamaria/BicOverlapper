/**
 * FeatDefGroupSet_defsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class FeatDefGroupSet_defsType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.FeatDefSetType featDefSet;

    public FeatDefGroupSet_defsType() {
    }

    public FeatDefGroupSet_defsType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.FeatDefSetType featDefSet) {
           this.featDefSet = featDefSet;
    }


    /**
     * Gets the featDefSet value for this FeatDefGroupSet_defsType.
     * 
     * @return featDefSet
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.FeatDefSetType getFeatDefSet() {
        return featDefSet;
    }


    /**
     * Sets the featDefSet value for this FeatDefGroupSet_defsType.
     * 
     * @param featDefSet
     */
    public void setFeatDefSet(gov.nih.nlm.ncbi.www.soap.eutils.efetch.FeatDefSetType featDefSet) {
        this.featDefSet = featDefSet;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FeatDefGroupSet_defsType)) return false;
        FeatDefGroupSet_defsType other = (FeatDefGroupSet_defsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.featDefSet==null && other.getFeatDefSet()==null) || 
             (this.featDefSet!=null &&
              this.featDefSet.equals(other.getFeatDefSet())));
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
        if (getFeatDefSet() != null) {
            _hashCode += getFeatDefSet().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FeatDefGroupSet_defsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "FeatDefGroupSet_defsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("featDefSet");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "FeatDefSet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "FeatDefSetType"));
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
