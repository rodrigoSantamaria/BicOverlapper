/**
 * ID1ServerDebug.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ID1ServerDebug  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID1ServerBackType[] ID1ServerBack;

    public ID1ServerDebug() {
    }

    public ID1ServerDebug(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID1ServerBackType[] ID1ServerBack) {
           this.ID1ServerBack = ID1ServerBack;
    }


    /**
     * Gets the ID1ServerBack value for this ID1ServerDebug.
     * 
     * @return ID1ServerBack
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID1ServerBackType[] getID1ServerBack() {
        return ID1ServerBack;
    }


    /**
     * Sets the ID1ServerBack value for this ID1ServerDebug.
     * 
     * @param ID1ServerBack
     */
    public void setID1ServerBack(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID1ServerBackType[] ID1ServerBack) {
        this.ID1ServerBack = ID1ServerBack;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID1ServerBackType getID1ServerBack(int i) {
        return this.ID1ServerBack[i];
    }

    public void setID1ServerBack(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID1ServerBackType _value) {
        this.ID1ServerBack[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ID1ServerDebug)) return false;
        ID1ServerDebug other = (ID1ServerDebug) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ID1ServerBack==null && other.getID1ServerBack()==null) || 
             (this.ID1ServerBack!=null &&
              java.util.Arrays.equals(this.ID1ServerBack, other.getID1ServerBack())));
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
        if (getID1ServerBack() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getID1ServerBack());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getID1ServerBack(), i);
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
        new org.apache.axis.description.TypeDesc(ID1ServerDebug.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">ID1server-debug"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID1ServerBack");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID1server-back"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID1server-backType"));
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
