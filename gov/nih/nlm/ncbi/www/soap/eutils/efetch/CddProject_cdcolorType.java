/**
 * CddProject_cdcolorType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class CddProject_cdcolorType  implements java.io.Serializable {
    private java.lang.String[] cddProject_cdcolor_E;

    public CddProject_cdcolorType() {
    }

    public CddProject_cdcolorType(
           java.lang.String[] cddProject_cdcolor_E) {
           this.cddProject_cdcolor_E = cddProject_cdcolor_E;
    }


    /**
     * Gets the cddProject_cdcolor_E value for this CddProject_cdcolorType.
     * 
     * @return cddProject_cdcolor_E
     */
    public java.lang.String[] getCddProject_cdcolor_E() {
        return cddProject_cdcolor_E;
    }


    /**
     * Sets the cddProject_cdcolor_E value for this CddProject_cdcolorType.
     * 
     * @param cddProject_cdcolor_E
     */
    public void setCddProject_cdcolor_E(java.lang.String[] cddProject_cdcolor_E) {
        this.cddProject_cdcolor_E = cddProject_cdcolor_E;
    }

    public java.lang.String getCddProject_cdcolor_E(int i) {
        return this.cddProject_cdcolor_E[i];
    }

    public void setCddProject_cdcolor_E(int i, java.lang.String _value) {
        this.cddProject_cdcolor_E[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CddProject_cdcolorType)) return false;
        CddProject_cdcolorType other = (CddProject_cdcolorType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cddProject_cdcolor_E==null && other.getCddProject_cdcolor_E()==null) || 
             (this.cddProject_cdcolor_E!=null &&
              java.util.Arrays.equals(this.cddProject_cdcolor_E, other.getCddProject_cdcolor_E())));
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
        if (getCddProject_cdcolor_E() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCddProject_cdcolor_E());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCddProject_cdcolor_E(), i);
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
        new org.apache.axis.description.TypeDesc(CddProject_cdcolorType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdd-Project_cdcolorType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cddProject_cdcolor_E");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdd-Project_cdcolor_E"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdd-Project_cdcolor_E"));
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
