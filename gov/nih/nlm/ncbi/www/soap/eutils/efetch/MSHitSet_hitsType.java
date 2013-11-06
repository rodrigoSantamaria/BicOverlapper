/**
 * MSHitSet_hitsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class MSHitSet_hitsType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSHitsType[] MSHits;

    public MSHitSet_hitsType() {
    }

    public MSHitSet_hitsType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSHitsType[] MSHits) {
           this.MSHits = MSHits;
    }


    /**
     * Gets the MSHits value for this MSHitSet_hitsType.
     * 
     * @return MSHits
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSHitsType[] getMSHits() {
        return MSHits;
    }


    /**
     * Sets the MSHits value for this MSHitSet_hitsType.
     * 
     * @param MSHits
     */
    public void setMSHits(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSHitsType[] MSHits) {
        this.MSHits = MSHits;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSHitsType getMSHits(int i) {
        return this.MSHits[i];
    }

    public void setMSHits(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSHitsType _value) {
        this.MSHits[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MSHitSet_hitsType)) return false;
        MSHitSet_hitsType other = (MSHitSet_hitsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.MSHits==null && other.getMSHits()==null) || 
             (this.MSHits!=null &&
              java.util.Arrays.equals(this.MSHits, other.getMSHits())));
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
        if (getMSHits() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMSHits());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMSHits(), i);
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
        new org.apache.axis.description.TypeDesc(MSHitSet_hitsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSHitSet_hitsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSHits");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSHits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSHitsType"));
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
