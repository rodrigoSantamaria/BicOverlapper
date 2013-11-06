/**
 * MimEntry_seeAlsoType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class MimEntry_seeAlsoType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimCitType[] mimCit;

    public MimEntry_seeAlsoType() {
    }

    public MimEntry_seeAlsoType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimCitType[] mimCit) {
           this.mimCit = mimCit;
    }


    /**
     * Gets the mimCit value for this MimEntry_seeAlsoType.
     * 
     * @return mimCit
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimCitType[] getMimCit() {
        return mimCit;
    }


    /**
     * Sets the mimCit value for this MimEntry_seeAlsoType.
     * 
     * @param mimCit
     */
    public void setMimCit(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimCitType[] mimCit) {
        this.mimCit = mimCit;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimCitType getMimCit(int i) {
        return this.mimCit[i];
    }

    public void setMimCit(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimCitType _value) {
        this.mimCit[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MimEntry_seeAlsoType)) return false;
        MimEntry_seeAlsoType other = (MimEntry_seeAlsoType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.mimCit==null && other.getMimCit()==null) || 
             (this.mimCit!=null &&
              java.util.Arrays.equals(this.mimCit, other.getMimCit())));
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
        if (getMimCit() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMimCit());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMimCit(), i);
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
        new org.apache.axis.description.TypeDesc(MimEntry_seeAlsoType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-entry_seeAlsoType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mimCit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-cit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-citType"));
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
