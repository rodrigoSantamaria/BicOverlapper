/**
 * SeqFeat_idsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class SeqFeat_idsType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.FeatIdType[] featId;

    public SeqFeat_idsType() {
    }

    public SeqFeat_idsType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.FeatIdType[] featId) {
           this.featId = featId;
    }


    /**
     * Gets the featId value for this SeqFeat_idsType.
     * 
     * @return featId
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.FeatIdType[] getFeatId() {
        return featId;
    }


    /**
     * Sets the featId value for this SeqFeat_idsType.
     * 
     * @param featId
     */
    public void setFeatId(gov.nih.nlm.ncbi.www.soap.eutils.efetch.FeatIdType[] featId) {
        this.featId = featId;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.FeatIdType getFeatId(int i) {
        return this.featId[i];
    }

    public void setFeatId(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.FeatIdType _value) {
        this.featId[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SeqFeat_idsType)) return false;
        SeqFeat_idsType other = (SeqFeat_idsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.featId==null && other.getFeatId()==null) || 
             (this.featId!=null &&
              java.util.Arrays.equals(this.featId, other.getFeatId())));
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
        if (getFeatId() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFeatId());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFeatId(), i);
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
        new org.apache.axis.description.TypeDesc(SeqFeat_idsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-feat_idsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("featId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Feat-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Feat-idType"));
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
