/**
 * MSResponse_hitsetsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class MSResponse_hitsetsType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSHitSetType[] MSHitSet;

    public MSResponse_hitsetsType() {
    }

    public MSResponse_hitsetsType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSHitSetType[] MSHitSet) {
           this.MSHitSet = MSHitSet;
    }


    /**
     * Gets the MSHitSet value for this MSResponse_hitsetsType.
     * 
     * @return MSHitSet
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSHitSetType[] getMSHitSet() {
        return MSHitSet;
    }


    /**
     * Sets the MSHitSet value for this MSResponse_hitsetsType.
     * 
     * @param MSHitSet
     */
    public void setMSHitSet(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSHitSetType[] MSHitSet) {
        this.MSHitSet = MSHitSet;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSHitSetType getMSHitSet(int i) {
        return this.MSHitSet[i];
    }

    public void setMSHitSet(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSHitSetType _value) {
        this.MSHitSet[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MSResponse_hitsetsType)) return false;
        MSResponse_hitsetsType other = (MSResponse_hitsetsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.MSHitSet==null && other.getMSHitSet()==null) || 
             (this.MSHitSet!=null &&
              java.util.Arrays.equals(this.MSHitSet, other.getMSHitSet())));
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
        if (getMSHitSet() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMSHitSet());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMSHitSet(), i);
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
        new org.apache.axis.description.TypeDesc(MSResponse_hitsetsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSResponse_hitsetsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSHitSet");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSHitSet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSHitSetType"));
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
