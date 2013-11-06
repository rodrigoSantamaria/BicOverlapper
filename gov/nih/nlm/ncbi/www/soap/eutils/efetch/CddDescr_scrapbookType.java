/**
 * CddDescr_scrapbookType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class CddDescr_scrapbookType  implements java.io.Serializable {
    private java.lang.String[] cddDescr_scrapbook_E;

    public CddDescr_scrapbookType() {
    }

    public CddDescr_scrapbookType(
           java.lang.String[] cddDescr_scrapbook_E) {
           this.cddDescr_scrapbook_E = cddDescr_scrapbook_E;
    }


    /**
     * Gets the cddDescr_scrapbook_E value for this CddDescr_scrapbookType.
     * 
     * @return cddDescr_scrapbook_E
     */
    public java.lang.String[] getCddDescr_scrapbook_E() {
        return cddDescr_scrapbook_E;
    }


    /**
     * Sets the cddDescr_scrapbook_E value for this CddDescr_scrapbookType.
     * 
     * @param cddDescr_scrapbook_E
     */
    public void setCddDescr_scrapbook_E(java.lang.String[] cddDescr_scrapbook_E) {
        this.cddDescr_scrapbook_E = cddDescr_scrapbook_E;
    }

    public java.lang.String getCddDescr_scrapbook_E(int i) {
        return this.cddDescr_scrapbook_E[i];
    }

    public void setCddDescr_scrapbook_E(int i, java.lang.String _value) {
        this.cddDescr_scrapbook_E[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CddDescr_scrapbookType)) return false;
        CddDescr_scrapbookType other = (CddDescr_scrapbookType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cddDescr_scrapbook_E==null && other.getCddDescr_scrapbook_E()==null) || 
             (this.cddDescr_scrapbook_E!=null &&
              java.util.Arrays.equals(this.cddDescr_scrapbook_E, other.getCddDescr_scrapbook_E())));
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
        if (getCddDescr_scrapbook_E() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCddDescr_scrapbook_E());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCddDescr_scrapbook_E(), i);
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
        new org.apache.axis.description.TypeDesc(CddDescr_scrapbookType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdd-descr_scrapbookType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cddDescr_scrapbook_E");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdd-descr_scrapbook_E"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdd-descr_scrapbook_E"));
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
