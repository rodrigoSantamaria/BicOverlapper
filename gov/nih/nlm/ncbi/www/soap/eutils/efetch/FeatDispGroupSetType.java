/**
 * FeatDispGroupSetType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class FeatDispGroupSetType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.FeatDispGroupType[] featDispGroup;

    public FeatDispGroupSetType() {
    }

    public FeatDispGroupSetType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.FeatDispGroupType[] featDispGroup) {
           this.featDispGroup = featDispGroup;
    }


    /**
     * Gets the featDispGroup value for this FeatDispGroupSetType.
     * 
     * @return featDispGroup
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.FeatDispGroupType[] getFeatDispGroup() {
        return featDispGroup;
    }


    /**
     * Sets the featDispGroup value for this FeatDispGroupSetType.
     * 
     * @param featDispGroup
     */
    public void setFeatDispGroup(gov.nih.nlm.ncbi.www.soap.eutils.efetch.FeatDispGroupType[] featDispGroup) {
        this.featDispGroup = featDispGroup;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.FeatDispGroupType getFeatDispGroup(int i) {
        return this.featDispGroup[i];
    }

    public void setFeatDispGroup(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.FeatDispGroupType _value) {
        this.featDispGroup[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FeatDispGroupSetType)) return false;
        FeatDispGroupSetType other = (FeatDispGroupSetType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.featDispGroup==null && other.getFeatDispGroup()==null) || 
             (this.featDispGroup!=null &&
              java.util.Arrays.equals(this.featDispGroup, other.getFeatDispGroup())));
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
        if (getFeatDispGroup() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFeatDispGroup());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFeatDispGroup(), i);
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
        new org.apache.axis.description.TypeDesc(FeatDispGroupSetType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "FeatDispGroupSetType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("featDispGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "FeatDispGroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "FeatDispGroupType"));
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
