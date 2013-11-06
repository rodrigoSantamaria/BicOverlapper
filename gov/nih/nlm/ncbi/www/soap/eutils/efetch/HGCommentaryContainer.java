/**
 * HGCommentaryContainer.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class HGCommentaryContainer  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.HGCommentarySetType[] HGCommentarySet;

    public HGCommentaryContainer() {
    }

    public HGCommentaryContainer(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.HGCommentarySetType[] HGCommentarySet) {
           this.HGCommentarySet = HGCommentarySet;
    }


    /**
     * Gets the HGCommentarySet value for this HGCommentaryContainer.
     * 
     * @return HGCommentarySet
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.HGCommentarySetType[] getHGCommentarySet() {
        return HGCommentarySet;
    }


    /**
     * Sets the HGCommentarySet value for this HGCommentaryContainer.
     * 
     * @param HGCommentarySet
     */
    public void setHGCommentarySet(gov.nih.nlm.ncbi.www.soap.eutils.efetch.HGCommentarySetType[] HGCommentarySet) {
        this.HGCommentarySet = HGCommentarySet;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.HGCommentarySetType getHGCommentarySet(int i) {
        return this.HGCommentarySet[i];
    }

    public void setHGCommentarySet(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.HGCommentarySetType _value) {
        this.HGCommentarySet[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HGCommentaryContainer)) return false;
        HGCommentaryContainer other = (HGCommentaryContainer) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.HGCommentarySet==null && other.getHGCommentarySet()==null) || 
             (this.HGCommentarySet!=null &&
              java.util.Arrays.equals(this.HGCommentarySet, other.getHGCommentarySet())));
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
        if (getHGCommentarySet() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHGCommentarySet());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHGCommentarySet(), i);
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
        new org.apache.axis.description.TypeDesc(HGCommentaryContainer.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">HG-CommentaryContainer"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("HGCommentarySet");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "HG-CommentarySet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "HG-CommentarySetType"));
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
