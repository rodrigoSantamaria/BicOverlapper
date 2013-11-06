/**
 * FeatDefGroupSet_groupsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class FeatDefGroupSet_groupsType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.FeatDispGroupSetType featDispGroupSet;

    public FeatDefGroupSet_groupsType() {
    }

    public FeatDefGroupSet_groupsType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.FeatDispGroupSetType featDispGroupSet) {
           this.featDispGroupSet = featDispGroupSet;
    }


    /**
     * Gets the featDispGroupSet value for this FeatDefGroupSet_groupsType.
     * 
     * @return featDispGroupSet
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.FeatDispGroupSetType getFeatDispGroupSet() {
        return featDispGroupSet;
    }


    /**
     * Sets the featDispGroupSet value for this FeatDefGroupSet_groupsType.
     * 
     * @param featDispGroupSet
     */
    public void setFeatDispGroupSet(gov.nih.nlm.ncbi.www.soap.eutils.efetch.FeatDispGroupSetType featDispGroupSet) {
        this.featDispGroupSet = featDispGroupSet;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FeatDefGroupSet_groupsType)) return false;
        FeatDefGroupSet_groupsType other = (FeatDefGroupSet_groupsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.featDispGroupSet==null && other.getFeatDispGroupSet()==null) || 
             (this.featDispGroupSet!=null &&
              this.featDispGroupSet.equals(other.getFeatDispGroupSet())));
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
        if (getFeatDispGroupSet() != null) {
            _hashCode += getFeatDispGroupSet().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FeatDefGroupSet_groupsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "FeatDefGroupSet_groupsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("featDispGroupSet");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "FeatDispGroupSet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "FeatDispGroupSetType"));
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
