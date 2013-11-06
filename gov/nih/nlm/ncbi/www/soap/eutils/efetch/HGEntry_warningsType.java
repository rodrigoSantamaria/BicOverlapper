/**
 * HGEntry_warningsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class HGEntry_warningsType  implements java.io.Serializable {
    private java.lang.String[] HGEntry_warnings_E;

    public HGEntry_warningsType() {
    }

    public HGEntry_warningsType(
           java.lang.String[] HGEntry_warnings_E) {
           this.HGEntry_warnings_E = HGEntry_warnings_E;
    }


    /**
     * Gets the HGEntry_warnings_E value for this HGEntry_warningsType.
     * 
     * @return HGEntry_warnings_E
     */
    public java.lang.String[] getHGEntry_warnings_E() {
        return HGEntry_warnings_E;
    }


    /**
     * Sets the HGEntry_warnings_E value for this HGEntry_warningsType.
     * 
     * @param HGEntry_warnings_E
     */
    public void setHGEntry_warnings_E(java.lang.String[] HGEntry_warnings_E) {
        this.HGEntry_warnings_E = HGEntry_warnings_E;
    }

    public java.lang.String getHGEntry_warnings_E(int i) {
        return this.HGEntry_warnings_E[i];
    }

    public void setHGEntry_warnings_E(int i, java.lang.String _value) {
        this.HGEntry_warnings_E[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HGEntry_warningsType)) return false;
        HGEntry_warningsType other = (HGEntry_warningsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.HGEntry_warnings_E==null && other.getHGEntry_warnings_E()==null) || 
             (this.HGEntry_warnings_E!=null &&
              java.util.Arrays.equals(this.HGEntry_warnings_E, other.getHGEntry_warnings_E())));
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
        if (getHGEntry_warnings_E() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHGEntry_warnings_E());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHGEntry_warnings_E(), i);
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
        new org.apache.axis.description.TypeDesc(HGEntry_warningsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "HG-Entry_warningsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("HGEntry_warnings_E");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "HG-Entry_warnings_E"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "HG-Entry_warnings_E"));
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
