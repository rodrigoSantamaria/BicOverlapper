/**
 * CddPrefNodeDescrSetType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class CddPrefNodeDescrSetType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.CddPrefNodeDescrType[] cddPrefNodeDescr;

    public CddPrefNodeDescrSetType() {
    }

    public CddPrefNodeDescrSetType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.CddPrefNodeDescrType[] cddPrefNodeDescr) {
           this.cddPrefNodeDescr = cddPrefNodeDescr;
    }


    /**
     * Gets the cddPrefNodeDescr value for this CddPrefNodeDescrSetType.
     * 
     * @return cddPrefNodeDescr
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.CddPrefNodeDescrType[] getCddPrefNodeDescr() {
        return cddPrefNodeDescr;
    }


    /**
     * Sets the cddPrefNodeDescr value for this CddPrefNodeDescrSetType.
     * 
     * @param cddPrefNodeDescr
     */
    public void setCddPrefNodeDescr(gov.nih.nlm.ncbi.www.soap.eutils.efetch.CddPrefNodeDescrType[] cddPrefNodeDescr) {
        this.cddPrefNodeDescr = cddPrefNodeDescr;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.CddPrefNodeDescrType getCddPrefNodeDescr(int i) {
        return this.cddPrefNodeDescr[i];
    }

    public void setCddPrefNodeDescr(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.CddPrefNodeDescrType _value) {
        this.cddPrefNodeDescr[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CddPrefNodeDescrSetType)) return false;
        CddPrefNodeDescrSetType other = (CddPrefNodeDescrSetType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cddPrefNodeDescr==null && other.getCddPrefNodeDescr()==null) || 
             (this.cddPrefNodeDescr!=null &&
              java.util.Arrays.equals(this.cddPrefNodeDescr, other.getCddPrefNodeDescr())));
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
        if (getCddPrefNodeDescr() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCddPrefNodeDescr());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCddPrefNodeDescr(), i);
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
        new org.apache.axis.description.TypeDesc(CddPrefNodeDescrSetType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdd-pref-node-descr-setType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cddPrefNodeDescr");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdd-pref-node-descr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdd-pref-node-descrType"));
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
