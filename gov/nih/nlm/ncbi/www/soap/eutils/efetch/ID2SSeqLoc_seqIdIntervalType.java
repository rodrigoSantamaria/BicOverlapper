/**
 * ID2SSeqLoc_seqIdIntervalType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ID2SSeqLoc_seqIdIntervalType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SSeqIdIntervalType ID2SSeqIdInterval;

    public ID2SSeqLoc_seqIdIntervalType() {
    }

    public ID2SSeqLoc_seqIdIntervalType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SSeqIdIntervalType ID2SSeqIdInterval) {
           this.ID2SSeqIdInterval = ID2SSeqIdInterval;
    }


    /**
     * Gets the ID2SSeqIdInterval value for this ID2SSeqLoc_seqIdIntervalType.
     * 
     * @return ID2SSeqIdInterval
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SSeqIdIntervalType getID2SSeqIdInterval() {
        return ID2SSeqIdInterval;
    }


    /**
     * Sets the ID2SSeqIdInterval value for this ID2SSeqLoc_seqIdIntervalType.
     * 
     * @param ID2SSeqIdInterval
     */
    public void setID2SSeqIdInterval(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SSeqIdIntervalType ID2SSeqIdInterval) {
        this.ID2SSeqIdInterval = ID2SSeqIdInterval;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ID2SSeqLoc_seqIdIntervalType)) return false;
        ID2SSeqLoc_seqIdIntervalType other = (ID2SSeqLoc_seqIdIntervalType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ID2SSeqIdInterval==null && other.getID2SSeqIdInterval()==null) || 
             (this.ID2SSeqIdInterval!=null &&
              this.ID2SSeqIdInterval.equals(other.getID2SSeqIdInterval())));
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
        if (getID2SSeqIdInterval() != null) {
            _hashCode += getID2SSeqIdInterval().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ID2SSeqLoc_seqIdIntervalType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Seq-loc_seq-id-intervalType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2SSeqIdInterval");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Seq-id-Interval"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Seq-id-IntervalType"));
        elemField.setNillable(false);
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
