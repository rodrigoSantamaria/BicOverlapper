/**
 * ID2SSeqIdInts_intsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ID2SSeqIdInts_intsType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SIntervalType[] ID2SInterval;

    public ID2SSeqIdInts_intsType() {
    }

    public ID2SSeqIdInts_intsType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SIntervalType[] ID2SInterval) {
           this.ID2SInterval = ID2SInterval;
    }


    /**
     * Gets the ID2SInterval value for this ID2SSeqIdInts_intsType.
     * 
     * @return ID2SInterval
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SIntervalType[] getID2SInterval() {
        return ID2SInterval;
    }


    /**
     * Sets the ID2SInterval value for this ID2SSeqIdInts_intsType.
     * 
     * @param ID2SInterval
     */
    public void setID2SInterval(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SIntervalType[] ID2SInterval) {
        this.ID2SInterval = ID2SInterval;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SIntervalType getID2SInterval(int i) {
        return this.ID2SInterval[i];
    }

    public void setID2SInterval(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SIntervalType _value) {
        this.ID2SInterval[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ID2SSeqIdInts_intsType)) return false;
        ID2SSeqIdInts_intsType other = (ID2SSeqIdInts_intsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ID2SInterval==null && other.getID2SInterval()==null) || 
             (this.ID2SInterval!=null &&
              java.util.Arrays.equals(this.ID2SInterval, other.getID2SInterval())));
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
        if (getID2SInterval() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getID2SInterval());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getID2SInterval(), i);
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
        new org.apache.axis.description.TypeDesc(ID2SSeqIdInts_intsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Seq-id-Ints_intsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2SInterval");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Interval"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-IntervalType"));
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
