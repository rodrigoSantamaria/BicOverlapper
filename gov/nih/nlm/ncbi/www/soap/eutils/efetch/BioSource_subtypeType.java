/**
 * BioSource_subtypeType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class BioSource_subtypeType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.SubSourceType[] subSource;

    public BioSource_subtypeType() {
    }

    public BioSource_subtypeType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.SubSourceType[] subSource) {
           this.subSource = subSource;
    }


    /**
     * Gets the subSource value for this BioSource_subtypeType.
     * 
     * @return subSource
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SubSourceType[] getSubSource() {
        return subSource;
    }


    /**
     * Sets the subSource value for this BioSource_subtypeType.
     * 
     * @param subSource
     */
    public void setSubSource(gov.nih.nlm.ncbi.www.soap.eutils.efetch.SubSourceType[] subSource) {
        this.subSource = subSource;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SubSourceType getSubSource(int i) {
        return this.subSource[i];
    }

    public void setSubSource(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.SubSourceType _value) {
        this.subSource[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BioSource_subtypeType)) return false;
        BioSource_subtypeType other = (BioSource_subtypeType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.subSource==null && other.getSubSource()==null) || 
             (this.subSource!=null &&
              java.util.Arrays.equals(this.subSource, other.getSubSource())));
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
        if (getSubSource() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSubSource());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSubSource(), i);
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
        new org.apache.axis.description.TypeDesc(BioSource_subtypeType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "BioSource_subtypeType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subSource");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "SubSource"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "SubSourceType"));
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
