/**
 * MimEntry_clinicalSynopsisType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class MimEntry_clinicalSynopsisType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimIndexTermType[] mimIndexTerm;

    public MimEntry_clinicalSynopsisType() {
    }

    public MimEntry_clinicalSynopsisType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimIndexTermType[] mimIndexTerm) {
           this.mimIndexTerm = mimIndexTerm;
    }


    /**
     * Gets the mimIndexTerm value for this MimEntry_clinicalSynopsisType.
     * 
     * @return mimIndexTerm
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimIndexTermType[] getMimIndexTerm() {
        return mimIndexTerm;
    }


    /**
     * Sets the mimIndexTerm value for this MimEntry_clinicalSynopsisType.
     * 
     * @param mimIndexTerm
     */
    public void setMimIndexTerm(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimIndexTermType[] mimIndexTerm) {
        this.mimIndexTerm = mimIndexTerm;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimIndexTermType getMimIndexTerm(int i) {
        return this.mimIndexTerm[i];
    }

    public void setMimIndexTerm(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimIndexTermType _value) {
        this.mimIndexTerm[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MimEntry_clinicalSynopsisType)) return false;
        MimEntry_clinicalSynopsisType other = (MimEntry_clinicalSynopsisType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.mimIndexTerm==null && other.getMimIndexTerm()==null) || 
             (this.mimIndexTerm!=null &&
              java.util.Arrays.equals(this.mimIndexTerm, other.getMimIndexTerm())));
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
        if (getMimIndexTerm() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMimIndexTerm());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMimIndexTerm(), i);
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
        new org.apache.axis.description.TypeDesc(MimEntry_clinicalSynopsisType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-entry_clinicalSynopsisType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mimIndexTerm");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-index-term"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-index-termType"));
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
