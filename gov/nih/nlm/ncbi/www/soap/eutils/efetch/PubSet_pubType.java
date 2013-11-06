/**
 * PubSet_pubType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class PubSet_pubType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PubType[] pub;

    public PubSet_pubType() {
    }

    public PubSet_pubType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PubType[] pub) {
           this.pub = pub;
    }


    /**
     * Gets the pub value for this PubSet_pubType.
     * 
     * @return pub
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PubType[] getPub() {
        return pub;
    }


    /**
     * Sets the pub value for this PubSet_pubType.
     * 
     * @param pub
     */
    public void setPub(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PubType[] pub) {
        this.pub = pub;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PubType getPub(int i) {
        return this.pub[i];
    }

    public void setPub(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.PubType _value) {
        this.pub[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PubSet_pubType)) return false;
        PubSet_pubType other = (PubSet_pubType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.pub==null && other.getPub()==null) || 
             (this.pub!=null &&
              java.util.Arrays.equals(this.pub, other.getPub())));
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
        if (getPub() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPub());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPub(), i);
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
        new org.apache.axis.description.TypeDesc(PubSet_pubType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Pub-set_pubType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pub");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Pub"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PubType"));
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
