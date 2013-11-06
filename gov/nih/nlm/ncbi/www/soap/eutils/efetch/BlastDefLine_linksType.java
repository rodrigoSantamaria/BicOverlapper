/**
 * BlastDefLine_linksType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class BlastDefLine_linksType  implements java.io.Serializable {
    private java.lang.String[] blastDefLine_links_E;

    public BlastDefLine_linksType() {
    }

    public BlastDefLine_linksType(
           java.lang.String[] blastDefLine_links_E) {
           this.blastDefLine_links_E = blastDefLine_links_E;
    }


    /**
     * Gets the blastDefLine_links_E value for this BlastDefLine_linksType.
     * 
     * @return blastDefLine_links_E
     */
    public java.lang.String[] getBlastDefLine_links_E() {
        return blastDefLine_links_E;
    }


    /**
     * Sets the blastDefLine_links_E value for this BlastDefLine_linksType.
     * 
     * @param blastDefLine_links_E
     */
    public void setBlastDefLine_links_E(java.lang.String[] blastDefLine_links_E) {
        this.blastDefLine_links_E = blastDefLine_links_E;
    }

    public java.lang.String getBlastDefLine_links_E(int i) {
        return this.blastDefLine_links_E[i];
    }

    public void setBlastDefLine_links_E(int i, java.lang.String _value) {
        this.blastDefLine_links_E[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BlastDefLine_linksType)) return false;
        BlastDefLine_linksType other = (BlastDefLine_linksType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.blastDefLine_links_E==null && other.getBlastDefLine_links_E()==null) || 
             (this.blastDefLine_links_E!=null &&
              java.util.Arrays.equals(this.blastDefLine_links_E, other.getBlastDefLine_links_E())));
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
        if (getBlastDefLine_links_E() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBlastDefLine_links_E());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBlastDefLine_links_E(), i);
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
        new org.apache.axis.description.TypeDesc(BlastDefLine_linksType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast-def-line_linksType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blastDefLine_links_E");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast-def-line_links_E"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast-def-line_links_E"));
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
