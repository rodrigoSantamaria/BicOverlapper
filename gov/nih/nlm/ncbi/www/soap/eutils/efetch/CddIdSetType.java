/**
 * CddIdSetType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class CddIdSetType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.CddIdType[] cddId;

    public CddIdSetType() {
    }

    public CddIdSetType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.CddIdType[] cddId) {
           this.cddId = cddId;
    }


    /**
     * Gets the cddId value for this CddIdSetType.
     * 
     * @return cddId
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.CddIdType[] getCddId() {
        return cddId;
    }


    /**
     * Sets the cddId value for this CddIdSetType.
     * 
     * @param cddId
     */
    public void setCddId(gov.nih.nlm.ncbi.www.soap.eutils.efetch.CddIdType[] cddId) {
        this.cddId = cddId;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.CddIdType getCddId(int i) {
        return this.cddId[i];
    }

    public void setCddId(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.CddIdType _value) {
        this.cddId[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CddIdSetType)) return false;
        CddIdSetType other = (CddIdSetType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cddId==null && other.getCddId()==null) || 
             (this.cddId!=null &&
              java.util.Arrays.equals(this.cddId, other.getCddId())));
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
        if (getCddId() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCddId());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCddId(), i);
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
        new org.apache.axis.description.TypeDesc(CddIdSetType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdd-id-setType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cddId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdd-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdd-idType"));
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
