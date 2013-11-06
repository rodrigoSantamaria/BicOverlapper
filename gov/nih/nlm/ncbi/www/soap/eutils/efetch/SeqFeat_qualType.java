/**
 * SeqFeat_qualType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class SeqFeat_qualType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.GbQualType[] gbQual;

    public SeqFeat_qualType() {
    }

    public SeqFeat_qualType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.GbQualType[] gbQual) {
           this.gbQual = gbQual;
    }


    /**
     * Gets the gbQual value for this SeqFeat_qualType.
     * 
     * @return gbQual
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.GbQualType[] getGbQual() {
        return gbQual;
    }


    /**
     * Sets the gbQual value for this SeqFeat_qualType.
     * 
     * @param gbQual
     */
    public void setGbQual(gov.nih.nlm.ncbi.www.soap.eutils.efetch.GbQualType[] gbQual) {
        this.gbQual = gbQual;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.GbQualType getGbQual(int i) {
        return this.gbQual[i];
    }

    public void setGbQual(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.GbQualType _value) {
        this.gbQual[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SeqFeat_qualType)) return false;
        SeqFeat_qualType other = (SeqFeat_qualType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.gbQual==null && other.getGbQual()==null) || 
             (this.gbQual!=null &&
              java.util.Arrays.equals(this.gbQual, other.getGbQual())));
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
        if (getGbQual() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGbQual());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGbQual(), i);
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
        new org.apache.axis.description.TypeDesc(SeqFeat_qualType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-feat_qualType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gbQual");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Gb-qual"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Gb-qualType"));
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
