/**
 * SeqDescrType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class SeqDescrType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqdescType[] seqdesc;

    public SeqDescrType() {
    }

    public SeqDescrType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqdescType[] seqdesc) {
           this.seqdesc = seqdesc;
    }


    /**
     * Gets the seqdesc value for this SeqDescrType.
     * 
     * @return seqdesc
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqdescType[] getSeqdesc() {
        return seqdesc;
    }


    /**
     * Sets the seqdesc value for this SeqDescrType.
     * 
     * @param seqdesc
     */
    public void setSeqdesc(gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqdescType[] seqdesc) {
        this.seqdesc = seqdesc;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqdescType getSeqdesc(int i) {
        return this.seqdesc[i];
    }

    public void setSeqdesc(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqdescType _value) {
        this.seqdesc[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SeqDescrType)) return false;
        SeqDescrType other = (SeqDescrType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.seqdesc==null && other.getSeqdesc()==null) || 
             (this.seqdesc!=null &&
              java.util.Arrays.equals(this.seqdesc, other.getSeqdesc())));
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
        if (getSeqdesc() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSeqdesc());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSeqdesc(), i);
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
        new org.apache.axis.description.TypeDesc(SeqDescrType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-descrType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqdesc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seqdesc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "SeqdescType"));
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
