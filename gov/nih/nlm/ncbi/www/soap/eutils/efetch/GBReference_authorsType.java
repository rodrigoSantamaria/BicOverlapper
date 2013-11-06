/**
 * GBReference_authorsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class GBReference_authorsType  implements java.io.Serializable {
    private java.lang.String[] GBAuthor;

    public GBReference_authorsType() {
    }

    public GBReference_authorsType(
           java.lang.String[] GBAuthor) {
           this.GBAuthor = GBAuthor;
    }


    /**
     * Gets the GBAuthor value for this GBReference_authorsType.
     * 
     * @return GBAuthor
     */
    public java.lang.String[] getGBAuthor() {
        return GBAuthor;
    }


    /**
     * Sets the GBAuthor value for this GBReference_authorsType.
     * 
     * @param GBAuthor
     */
    public void setGBAuthor(java.lang.String[] GBAuthor) {
        this.GBAuthor = GBAuthor;
    }

    public java.lang.String getGBAuthor(int i) {
        return this.GBAuthor[i];
    }

    public void setGBAuthor(int i, java.lang.String _value) {
        this.GBAuthor[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GBReference_authorsType)) return false;
        GBReference_authorsType other = (GBReference_authorsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.GBAuthor==null && other.getGBAuthor()==null) || 
             (this.GBAuthor!=null &&
              java.util.Arrays.equals(this.GBAuthor, other.getGBAuthor())));
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
        if (getGBAuthor() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGBAuthor());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGBAuthor(), i);
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
        new org.apache.axis.description.TypeDesc(GBReference_authorsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "GBReference_authorsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GBAuthor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "GBAuthor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "GBAuthor"));
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
