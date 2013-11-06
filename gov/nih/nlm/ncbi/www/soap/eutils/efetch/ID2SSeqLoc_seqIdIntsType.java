/**
 * ID2SSeqLoc_seqIdIntsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ID2SSeqLoc_seqIdIntsType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SSeqIdIntsType ID2SSeqIdInts;

    public ID2SSeqLoc_seqIdIntsType() {
    }

    public ID2SSeqLoc_seqIdIntsType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SSeqIdIntsType ID2SSeqIdInts) {
           this.ID2SSeqIdInts = ID2SSeqIdInts;
    }


    /**
     * Gets the ID2SSeqIdInts value for this ID2SSeqLoc_seqIdIntsType.
     * 
     * @return ID2SSeqIdInts
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SSeqIdIntsType getID2SSeqIdInts() {
        return ID2SSeqIdInts;
    }


    /**
     * Sets the ID2SSeqIdInts value for this ID2SSeqLoc_seqIdIntsType.
     * 
     * @param ID2SSeqIdInts
     */
    public void setID2SSeqIdInts(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SSeqIdIntsType ID2SSeqIdInts) {
        this.ID2SSeqIdInts = ID2SSeqIdInts;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ID2SSeqLoc_seqIdIntsType)) return false;
        ID2SSeqLoc_seqIdIntsType other = (ID2SSeqLoc_seqIdIntsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ID2SSeqIdInts==null && other.getID2SSeqIdInts()==null) || 
             (this.ID2SSeqIdInts!=null &&
              this.ID2SSeqIdInts.equals(other.getID2SSeqIdInts())));
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
        if (getID2SSeqIdInts() != null) {
            _hashCode += getID2SSeqIdInts().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ID2SSeqLoc_seqIdIntsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Seq-loc_seq-id-intsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2SSeqIdInts");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Seq-id-Ints"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Seq-id-IntsType"));
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
