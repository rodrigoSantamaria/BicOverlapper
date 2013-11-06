/**
 * Iteration_hitsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Iteration_hitsType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.HitType[] hit;

    public Iteration_hitsType() {
    }

    public Iteration_hitsType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.HitType[] hit) {
           this.hit = hit;
    }


    /**
     * Gets the hit value for this Iteration_hitsType.
     * 
     * @return hit
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.HitType[] getHit() {
        return hit;
    }


    /**
     * Sets the hit value for this Iteration_hitsType.
     * 
     * @param hit
     */
    public void setHit(gov.nih.nlm.ncbi.www.soap.eutils.efetch.HitType[] hit) {
        this.hit = hit;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.HitType getHit(int i) {
        return this.hit[i];
    }

    public void setHit(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.HitType _value) {
        this.hit[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Iteration_hitsType)) return false;
        Iteration_hitsType other = (Iteration_hitsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.hit==null && other.getHit()==null) || 
             (this.hit!=null &&
              java.util.Arrays.equals(this.hit, other.getHit())));
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
        if (getHit() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHit());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHit(), i);
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
        new org.apache.axis.description.TypeDesc(Iteration_hitsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Iteration_hitsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Hit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "HitType"));
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
