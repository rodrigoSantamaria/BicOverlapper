/**
 * SeqAnnot_idType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class SeqAnnot_idType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.AnnotIdType[] annotId;

    public SeqAnnot_idType() {
    }

    public SeqAnnot_idType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.AnnotIdType[] annotId) {
           this.annotId = annotId;
    }


    /**
     * Gets the annotId value for this SeqAnnot_idType.
     * 
     * @return annotId
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.AnnotIdType[] getAnnotId() {
        return annotId;
    }


    /**
     * Sets the annotId value for this SeqAnnot_idType.
     * 
     * @param annotId
     */
    public void setAnnotId(gov.nih.nlm.ncbi.www.soap.eutils.efetch.AnnotIdType[] annotId) {
        this.annotId = annotId;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.AnnotIdType getAnnotId(int i) {
        return this.annotId[i];
    }

    public void setAnnotId(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.AnnotIdType _value) {
        this.annotId[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SeqAnnot_idType)) return false;
        SeqAnnot_idType other = (SeqAnnot_idType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.annotId==null && other.getAnnotId()==null) || 
             (this.annotId!=null &&
              java.util.Arrays.equals(this.annotId, other.getAnnotId())));
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
        if (getAnnotId() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAnnotId());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAnnotId(), i);
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
        new org.apache.axis.description.TypeDesc(SeqAnnot_idType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-annot_idType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("annotId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Annot-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Annot-idType"));
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
