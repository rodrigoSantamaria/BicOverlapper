/**
 * MSHits_mzhitsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class MSHits_mzhitsType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSMZHitType[] MSMZHit;

    public MSHits_mzhitsType() {
    }

    public MSHits_mzhitsType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSMZHitType[] MSMZHit) {
           this.MSMZHit = MSMZHit;
    }


    /**
     * Gets the MSMZHit value for this MSHits_mzhitsType.
     * 
     * @return MSMZHit
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSMZHitType[] getMSMZHit() {
        return MSMZHit;
    }


    /**
     * Sets the MSMZHit value for this MSHits_mzhitsType.
     * 
     * @param MSMZHit
     */
    public void setMSMZHit(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSMZHitType[] MSMZHit) {
        this.MSMZHit = MSMZHit;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSMZHitType getMSMZHit(int i) {
        return this.MSMZHit[i];
    }

    public void setMSMZHit(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSMZHitType _value) {
        this.MSMZHit[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MSHits_mzhitsType)) return false;
        MSHits_mzhitsType other = (MSHits_mzhitsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.MSMZHit==null && other.getMSMZHit()==null) || 
             (this.MSMZHit!=null &&
              java.util.Arrays.equals(this.MSMZHit, other.getMSMZHit())));
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
        if (getMSMZHit() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMSMZHit());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMSMZHit(), i);
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
        new org.apache.axis.description.TypeDesc(MSHits_mzhitsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSHits_mzhitsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSMZHit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSMZHit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSMZHitType"));
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
