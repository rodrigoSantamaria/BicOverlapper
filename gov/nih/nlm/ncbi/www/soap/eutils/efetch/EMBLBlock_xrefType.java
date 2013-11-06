/**
 * EMBLBlock_xrefType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class EMBLBlock_xrefType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.EMBLXrefType[] EMBLXref;

    public EMBLBlock_xrefType() {
    }

    public EMBLBlock_xrefType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.EMBLXrefType[] EMBLXref) {
           this.EMBLXref = EMBLXref;
    }


    /**
     * Gets the EMBLXref value for this EMBLBlock_xrefType.
     * 
     * @return EMBLXref
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.EMBLXrefType[] getEMBLXref() {
        return EMBLXref;
    }


    /**
     * Sets the EMBLXref value for this EMBLBlock_xrefType.
     * 
     * @param EMBLXref
     */
    public void setEMBLXref(gov.nih.nlm.ncbi.www.soap.eutils.efetch.EMBLXrefType[] EMBLXref) {
        this.EMBLXref = EMBLXref;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.EMBLXrefType getEMBLXref(int i) {
        return this.EMBLXref[i];
    }

    public void setEMBLXref(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.EMBLXrefType _value) {
        this.EMBLXref[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EMBLBlock_xrefType)) return false;
        EMBLBlock_xrefType other = (EMBLBlock_xrefType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.EMBLXref==null && other.getEMBLXref()==null) || 
             (this.EMBLXref!=null &&
              java.util.Arrays.equals(this.EMBLXref, other.getEMBLXref())));
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
        if (getEMBLXref() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEMBLXref());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEMBLXref(), i);
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
        new org.apache.axis.description.TypeDesc(EMBLBlock_xrefType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "EMBL-block_xrefType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EMBLXref");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "EMBL-xref"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "EMBL-xrefType"));
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
