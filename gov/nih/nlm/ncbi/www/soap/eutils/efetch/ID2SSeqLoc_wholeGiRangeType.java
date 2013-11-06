/**
 * ID2SSeqLoc_wholeGiRangeType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ID2SSeqLoc_wholeGiRangeType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SGiRangeType ID2SGiRange;

    public ID2SSeqLoc_wholeGiRangeType() {
    }

    public ID2SSeqLoc_wholeGiRangeType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SGiRangeType ID2SGiRange) {
           this.ID2SGiRange = ID2SGiRange;
    }


    /**
     * Gets the ID2SGiRange value for this ID2SSeqLoc_wholeGiRangeType.
     * 
     * @return ID2SGiRange
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SGiRangeType getID2SGiRange() {
        return ID2SGiRange;
    }


    /**
     * Sets the ID2SGiRange value for this ID2SSeqLoc_wholeGiRangeType.
     * 
     * @param ID2SGiRange
     */
    public void setID2SGiRange(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SGiRangeType ID2SGiRange) {
        this.ID2SGiRange = ID2SGiRange;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ID2SSeqLoc_wholeGiRangeType)) return false;
        ID2SSeqLoc_wholeGiRangeType other = (ID2SSeqLoc_wholeGiRangeType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ID2SGiRange==null && other.getID2SGiRange()==null) || 
             (this.ID2SGiRange!=null &&
              this.ID2SGiRange.equals(other.getID2SGiRange())));
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
        if (getID2SGiRange() != null) {
            _hashCode += getID2SGiRange().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ID2SSeqLoc_wholeGiRangeType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Seq-loc_whole-gi-rangeType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2SGiRange");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Gi-Range"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Gi-RangeType"));
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
