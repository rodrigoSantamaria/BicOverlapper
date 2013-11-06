/**
 * ID2SSeqLoc_giIntervalType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ID2SSeqLoc_giIntervalType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SGiIntervalType ID2SGiInterval;

    public ID2SSeqLoc_giIntervalType() {
    }

    public ID2SSeqLoc_giIntervalType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SGiIntervalType ID2SGiInterval) {
           this.ID2SGiInterval = ID2SGiInterval;
    }


    /**
     * Gets the ID2SGiInterval value for this ID2SSeqLoc_giIntervalType.
     * 
     * @return ID2SGiInterval
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SGiIntervalType getID2SGiInterval() {
        return ID2SGiInterval;
    }


    /**
     * Sets the ID2SGiInterval value for this ID2SSeqLoc_giIntervalType.
     * 
     * @param ID2SGiInterval
     */
    public void setID2SGiInterval(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SGiIntervalType ID2SGiInterval) {
        this.ID2SGiInterval = ID2SGiInterval;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ID2SSeqLoc_giIntervalType)) return false;
        ID2SSeqLoc_giIntervalType other = (ID2SSeqLoc_giIntervalType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ID2SGiInterval==null && other.getID2SGiInterval()==null) || 
             (this.ID2SGiInterval!=null &&
              this.ID2SGiInterval.equals(other.getID2SGiInterval())));
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
        if (getID2SGiInterval() != null) {
            _hashCode += getID2SGiInterval().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ID2SSeqLoc_giIntervalType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Seq-loc_gi-intervalType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2SGiInterval");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Gi-Interval"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Gi-IntervalType"));
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
