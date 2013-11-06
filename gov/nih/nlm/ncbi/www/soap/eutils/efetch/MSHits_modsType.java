/**
 * MSHits_modsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class MSHits_modsType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSModHitType[] MSModHit;

    public MSHits_modsType() {
    }

    public MSHits_modsType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSModHitType[] MSModHit) {
           this.MSModHit = MSModHit;
    }


    /**
     * Gets the MSModHit value for this MSHits_modsType.
     * 
     * @return MSModHit
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSModHitType[] getMSModHit() {
        return MSModHit;
    }


    /**
     * Sets the MSModHit value for this MSHits_modsType.
     * 
     * @param MSModHit
     */
    public void setMSModHit(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSModHitType[] MSModHit) {
        this.MSModHit = MSModHit;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSModHitType getMSModHit(int i) {
        return this.MSModHit[i];
    }

    public void setMSModHit(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSModHitType _value) {
        this.MSModHit[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MSHits_modsType)) return false;
        MSHits_modsType other = (MSHits_modsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.MSModHit==null && other.getMSModHit()==null) || 
             (this.MSModHit!=null &&
              java.util.Arrays.equals(this.MSModHit, other.getMSModHit())));
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
        if (getMSModHit() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMSModHit());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMSModHit(), i);
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
        new org.apache.axis.description.TypeDesc(MSHits_modsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSHits_modsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSModHit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSModHit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSModHitType"));
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
