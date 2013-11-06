/**
 * MimReference_editorsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class MimReference_editorsType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimAuthorType[] mimAuthor;

    public MimReference_editorsType() {
    }

    public MimReference_editorsType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimAuthorType[] mimAuthor) {
           this.mimAuthor = mimAuthor;
    }


    /**
     * Gets the mimAuthor value for this MimReference_editorsType.
     * 
     * @return mimAuthor
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimAuthorType[] getMimAuthor() {
        return mimAuthor;
    }


    /**
     * Sets the mimAuthor value for this MimReference_editorsType.
     * 
     * @param mimAuthor
     */
    public void setMimAuthor(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimAuthorType[] mimAuthor) {
        this.mimAuthor = mimAuthor;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimAuthorType getMimAuthor(int i) {
        return this.mimAuthor[i];
    }

    public void setMimAuthor(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimAuthorType _value) {
        this.mimAuthor[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MimReference_editorsType)) return false;
        MimReference_editorsType other = (MimReference_editorsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.mimAuthor==null && other.getMimAuthor()==null) || 
             (this.mimAuthor!=null &&
              java.util.Arrays.equals(this.mimAuthor, other.getMimAuthor())));
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
        if (getMimAuthor() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMimAuthor());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMimAuthor(), i);
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
        new org.apache.axis.description.TypeDesc(MimReference_editorsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-reference_editorsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mimAuthor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-author"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-authorType"));
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