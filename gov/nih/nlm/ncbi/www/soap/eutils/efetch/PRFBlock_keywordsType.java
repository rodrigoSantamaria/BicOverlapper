/**
 * PRFBlock_keywordsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class PRFBlock_keywordsType  implements java.io.Serializable {
    private java.lang.String[] PRFBlock_keywords_E;

    public PRFBlock_keywordsType() {
    }

    public PRFBlock_keywordsType(
           java.lang.String[] PRFBlock_keywords_E) {
           this.PRFBlock_keywords_E = PRFBlock_keywords_E;
    }


    /**
     * Gets the PRFBlock_keywords_E value for this PRFBlock_keywordsType.
     * 
     * @return PRFBlock_keywords_E
     */
    public java.lang.String[] getPRFBlock_keywords_E() {
        return PRFBlock_keywords_E;
    }


    /**
     * Sets the PRFBlock_keywords_E value for this PRFBlock_keywordsType.
     * 
     * @param PRFBlock_keywords_E
     */
    public void setPRFBlock_keywords_E(java.lang.String[] PRFBlock_keywords_E) {
        this.PRFBlock_keywords_E = PRFBlock_keywords_E;
    }

    public java.lang.String getPRFBlock_keywords_E(int i) {
        return this.PRFBlock_keywords_E[i];
    }

    public void setPRFBlock_keywords_E(int i, java.lang.String _value) {
        this.PRFBlock_keywords_E[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PRFBlock_keywordsType)) return false;
        PRFBlock_keywordsType other = (PRFBlock_keywordsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.PRFBlock_keywords_E==null && other.getPRFBlock_keywords_E()==null) || 
             (this.PRFBlock_keywords_E!=null &&
              java.util.Arrays.equals(this.PRFBlock_keywords_E, other.getPRFBlock_keywords_E())));
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
        if (getPRFBlock_keywords_E() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPRFBlock_keywords_E());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPRFBlock_keywords_E(), i);
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
        new org.apache.axis.description.TypeDesc(PRFBlock_keywordsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PRF-block_keywordsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PRFBlock_keywords_E");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PRF-block_keywords_E"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PRF-block_keywords_E"));
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
