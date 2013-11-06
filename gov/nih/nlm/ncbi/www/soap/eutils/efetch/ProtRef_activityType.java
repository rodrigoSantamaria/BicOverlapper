/**
 * ProtRef_activityType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ProtRef_activityType  implements java.io.Serializable {
    private java.lang.String[] protRef_activity_E;

    public ProtRef_activityType() {
    }

    public ProtRef_activityType(
           java.lang.String[] protRef_activity_E) {
           this.protRef_activity_E = protRef_activity_E;
    }


    /**
     * Gets the protRef_activity_E value for this ProtRef_activityType.
     * 
     * @return protRef_activity_E
     */
    public java.lang.String[] getProtRef_activity_E() {
        return protRef_activity_E;
    }


    /**
     * Sets the protRef_activity_E value for this ProtRef_activityType.
     * 
     * @param protRef_activity_E
     */
    public void setProtRef_activity_E(java.lang.String[] protRef_activity_E) {
        this.protRef_activity_E = protRef_activity_E;
    }

    public java.lang.String getProtRef_activity_E(int i) {
        return this.protRef_activity_E[i];
    }

    public void setProtRef_activity_E(int i, java.lang.String _value) {
        this.protRef_activity_E[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProtRef_activityType)) return false;
        ProtRef_activityType other = (ProtRef_activityType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.protRef_activity_E==null && other.getProtRef_activity_E()==null) || 
             (this.protRef_activity_E!=null &&
              java.util.Arrays.equals(this.protRef_activity_E, other.getProtRef_activity_E())));
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
        if (getProtRef_activity_E() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProtRef_activity_E());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProtRef_activity_E(), i);
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
        new org.apache.axis.description.TypeDesc(ProtRef_activityType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Prot-ref_activityType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("protRef_activity_E");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Prot-ref_activity_E"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Prot-ref_activity_E"));
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
