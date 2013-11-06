/**
 * MlaBack_getuidsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class MlaBack_getuidsType  implements java.io.Serializable {
    private java.lang.String[] mlaBack_getuids_E;

    public MlaBack_getuidsType() {
    }

    public MlaBack_getuidsType(
           java.lang.String[] mlaBack_getuids_E) {
           this.mlaBack_getuids_E = mlaBack_getuids_E;
    }


    /**
     * Gets the mlaBack_getuids_E value for this MlaBack_getuidsType.
     * 
     * @return mlaBack_getuids_E
     */
    public java.lang.String[] getMlaBack_getuids_E() {
        return mlaBack_getuids_E;
    }


    /**
     * Sets the mlaBack_getuids_E value for this MlaBack_getuidsType.
     * 
     * @param mlaBack_getuids_E
     */
    public void setMlaBack_getuids_E(java.lang.String[] mlaBack_getuids_E) {
        this.mlaBack_getuids_E = mlaBack_getuids_E;
    }

    public java.lang.String getMlaBack_getuids_E(int i) {
        return this.mlaBack_getuids_E[i];
    }

    public void setMlaBack_getuids_E(int i, java.lang.String _value) {
        this.mlaBack_getuids_E[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MlaBack_getuidsType)) return false;
        MlaBack_getuidsType other = (MlaBack_getuidsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.mlaBack_getuids_E==null && other.getMlaBack_getuids_E()==null) || 
             (this.mlaBack_getuids_E!=null &&
              java.util.Arrays.equals(this.mlaBack_getuids_E, other.getMlaBack_getuids_E())));
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
        if (getMlaBack_getuids_E() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMlaBack_getuids_E());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMlaBack_getuids_E(), i);
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
        new org.apache.axis.description.TypeDesc(MlaBack_getuidsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mla-back_getuidsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mlaBack_getuids_E");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mla-back_getuids_E"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mla-back_getuids_E"));
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
