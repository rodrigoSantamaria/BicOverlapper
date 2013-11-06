/**
 * CddOrgRefSetType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class CddOrgRefSetType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.CddOrgRefType[] cddOrgRef;

    public CddOrgRefSetType() {
    }

    public CddOrgRefSetType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.CddOrgRefType[] cddOrgRef) {
           this.cddOrgRef = cddOrgRef;
    }


    /**
     * Gets the cddOrgRef value for this CddOrgRefSetType.
     * 
     * @return cddOrgRef
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.CddOrgRefType[] getCddOrgRef() {
        return cddOrgRef;
    }


    /**
     * Sets the cddOrgRef value for this CddOrgRefSetType.
     * 
     * @param cddOrgRef
     */
    public void setCddOrgRef(gov.nih.nlm.ncbi.www.soap.eutils.efetch.CddOrgRefType[] cddOrgRef) {
        this.cddOrgRef = cddOrgRef;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.CddOrgRefType getCddOrgRef(int i) {
        return this.cddOrgRef[i];
    }

    public void setCddOrgRef(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.CddOrgRefType _value) {
        this.cddOrgRef[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CddOrgRefSetType)) return false;
        CddOrgRefSetType other = (CddOrgRefSetType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cddOrgRef==null && other.getCddOrgRef()==null) || 
             (this.cddOrgRef!=null &&
              java.util.Arrays.equals(this.cddOrgRef, other.getCddOrgRef())));
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
        if (getCddOrgRef() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCddOrgRef());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCddOrgRef(), i);
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
        new org.apache.axis.description.TypeDesc(CddOrgRefSetType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdd-org-ref-setType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cddOrgRef");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdd-org-ref"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdd-org-refType"));
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
