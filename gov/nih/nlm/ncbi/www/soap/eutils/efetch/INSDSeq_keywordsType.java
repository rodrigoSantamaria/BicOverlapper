/**
 * INSDSeq_keywordsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class INSDSeq_keywordsType  implements java.io.Serializable {
    private java.lang.String[] INSDKeyword;

    public INSDSeq_keywordsType() {
    }

    public INSDSeq_keywordsType(
           java.lang.String[] INSDKeyword) {
           this.INSDKeyword = INSDKeyword;
    }


    /**
     * Gets the INSDKeyword value for this INSDSeq_keywordsType.
     * 
     * @return INSDKeyword
     */
    public java.lang.String[] getINSDKeyword() {
        return INSDKeyword;
    }


    /**
     * Sets the INSDKeyword value for this INSDSeq_keywordsType.
     * 
     * @param INSDKeyword
     */
    public void setINSDKeyword(java.lang.String[] INSDKeyword) {
        this.INSDKeyword = INSDKeyword;
    }

    public java.lang.String getINSDKeyword(int i) {
        return this.INSDKeyword[i];
    }

    public void setINSDKeyword(int i, java.lang.String _value) {
        this.INSDKeyword[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof INSDSeq_keywordsType)) return false;
        INSDSeq_keywordsType other = (INSDSeq_keywordsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.INSDKeyword==null && other.getINSDKeyword()==null) || 
             (this.INSDKeyword!=null &&
              java.util.Arrays.equals(this.INSDKeyword, other.getINSDKeyword())));
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
        if (getINSDKeyword() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getINSDKeyword());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getINSDKeyword(), i);
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
        new org.apache.axis.description.TypeDesc(INSDSeq_keywordsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "INSDSeq_keywordsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("INSDKeyword");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "INSDKeyword"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "INSDKeyword"));
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
