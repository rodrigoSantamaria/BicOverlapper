/**
 * INSDReference_authorsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class INSDReference_authorsType  implements java.io.Serializable {
    private java.lang.String[] INSDAuthor;

    public INSDReference_authorsType() {
    }

    public INSDReference_authorsType(
           java.lang.String[] INSDAuthor) {
           this.INSDAuthor = INSDAuthor;
    }


    /**
     * Gets the INSDAuthor value for this INSDReference_authorsType.
     * 
     * @return INSDAuthor
     */
    public java.lang.String[] getINSDAuthor() {
        return INSDAuthor;
    }


    /**
     * Sets the INSDAuthor value for this INSDReference_authorsType.
     * 
     * @param INSDAuthor
     */
    public void setINSDAuthor(java.lang.String[] INSDAuthor) {
        this.INSDAuthor = INSDAuthor;
    }

    public java.lang.String getINSDAuthor(int i) {
        return this.INSDAuthor[i];
    }

    public void setINSDAuthor(int i, java.lang.String _value) {
        this.INSDAuthor[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof INSDReference_authorsType)) return false;
        INSDReference_authorsType other = (INSDReference_authorsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.INSDAuthor==null && other.getINSDAuthor()==null) || 
             (this.INSDAuthor!=null &&
              java.util.Arrays.equals(this.INSDAuthor, other.getINSDAuthor())));
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
        if (getINSDAuthor() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getINSDAuthor());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getINSDAuthor(), i);
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
        new org.apache.axis.description.TypeDesc(INSDReference_authorsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "INSDReference_authorsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("INSDAuthor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "INSDAuthor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "INSDAuthor"));
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
