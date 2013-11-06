/**
 * HGCommentary_otherCommentariesType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class HGCommentary_otherCommentariesType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.HGCommentaryType[] HGCommentary;

    public HGCommentary_otherCommentariesType() {
    }

    public HGCommentary_otherCommentariesType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.HGCommentaryType[] HGCommentary) {
           this.HGCommentary = HGCommentary;
    }


    /**
     * Gets the HGCommentary value for this HGCommentary_otherCommentariesType.
     * 
     * @return HGCommentary
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.HGCommentaryType[] getHGCommentary() {
        return HGCommentary;
    }


    /**
     * Sets the HGCommentary value for this HGCommentary_otherCommentariesType.
     * 
     * @param HGCommentary
     */
    public void setHGCommentary(gov.nih.nlm.ncbi.www.soap.eutils.efetch.HGCommentaryType[] HGCommentary) {
        this.HGCommentary = HGCommentary;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.HGCommentaryType getHGCommentary(int i) {
        return this.HGCommentary[i];
    }

    public void setHGCommentary(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.HGCommentaryType _value) {
        this.HGCommentary[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HGCommentary_otherCommentariesType)) return false;
        HGCommentary_otherCommentariesType other = (HGCommentary_otherCommentariesType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.HGCommentary==null && other.getHGCommentary()==null) || 
             (this.HGCommentary!=null &&
              java.util.Arrays.equals(this.HGCommentary, other.getHGCommentary())));
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
        if (getHGCommentary() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHGCommentary());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHGCommentary(), i);
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
        new org.apache.axis.description.TypeDesc(HGCommentary_otherCommentariesType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "HG-Commentary_other-commentariesType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("HGCommentary");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "HG-Commentary"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "HG-CommentaryType"));
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
