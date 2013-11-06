/**
 * ID2SSeqIdIntervalType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ID2SSeqIdIntervalType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SSeqIdInterval_seqIdType ID2SSeqIdInterval_seqId;

    private java.lang.String ID2SSeqIdInterval_start;

    private java.lang.String ID2SSeqIdInterval_length;

    public ID2SSeqIdIntervalType() {
    }

    public ID2SSeqIdIntervalType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SSeqIdInterval_seqIdType ID2SSeqIdInterval_seqId,
           java.lang.String ID2SSeqIdInterval_start,
           java.lang.String ID2SSeqIdInterval_length) {
           this.ID2SSeqIdInterval_seqId = ID2SSeqIdInterval_seqId;
           this.ID2SSeqIdInterval_start = ID2SSeqIdInterval_start;
           this.ID2SSeqIdInterval_length = ID2SSeqIdInterval_length;
    }


    /**
     * Gets the ID2SSeqIdInterval_seqId value for this ID2SSeqIdIntervalType.
     * 
     * @return ID2SSeqIdInterval_seqId
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SSeqIdInterval_seqIdType getID2SSeqIdInterval_seqId() {
        return ID2SSeqIdInterval_seqId;
    }


    /**
     * Sets the ID2SSeqIdInterval_seqId value for this ID2SSeqIdIntervalType.
     * 
     * @param ID2SSeqIdInterval_seqId
     */
    public void setID2SSeqIdInterval_seqId(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SSeqIdInterval_seqIdType ID2SSeqIdInterval_seqId) {
        this.ID2SSeqIdInterval_seqId = ID2SSeqIdInterval_seqId;
    }


    /**
     * Gets the ID2SSeqIdInterval_start value for this ID2SSeqIdIntervalType.
     * 
     * @return ID2SSeqIdInterval_start
     */
    public java.lang.String getID2SSeqIdInterval_start() {
        return ID2SSeqIdInterval_start;
    }


    /**
     * Sets the ID2SSeqIdInterval_start value for this ID2SSeqIdIntervalType.
     * 
     * @param ID2SSeqIdInterval_start
     */
    public void setID2SSeqIdInterval_start(java.lang.String ID2SSeqIdInterval_start) {
        this.ID2SSeqIdInterval_start = ID2SSeqIdInterval_start;
    }


    /**
     * Gets the ID2SSeqIdInterval_length value for this ID2SSeqIdIntervalType.
     * 
     * @return ID2SSeqIdInterval_length
     */
    public java.lang.String getID2SSeqIdInterval_length() {
        return ID2SSeqIdInterval_length;
    }


    /**
     * Sets the ID2SSeqIdInterval_length value for this ID2SSeqIdIntervalType.
     * 
     * @param ID2SSeqIdInterval_length
     */
    public void setID2SSeqIdInterval_length(java.lang.String ID2SSeqIdInterval_length) {
        this.ID2SSeqIdInterval_length = ID2SSeqIdInterval_length;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ID2SSeqIdIntervalType)) return false;
        ID2SSeqIdIntervalType other = (ID2SSeqIdIntervalType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ID2SSeqIdInterval_seqId==null && other.getID2SSeqIdInterval_seqId()==null) || 
             (this.ID2SSeqIdInterval_seqId!=null &&
              this.ID2SSeqIdInterval_seqId.equals(other.getID2SSeqIdInterval_seqId()))) &&
            ((this.ID2SSeqIdInterval_start==null && other.getID2SSeqIdInterval_start()==null) || 
             (this.ID2SSeqIdInterval_start!=null &&
              this.ID2SSeqIdInterval_start.equals(other.getID2SSeqIdInterval_start()))) &&
            ((this.ID2SSeqIdInterval_length==null && other.getID2SSeqIdInterval_length()==null) || 
             (this.ID2SSeqIdInterval_length!=null &&
              this.ID2SSeqIdInterval_length.equals(other.getID2SSeqIdInterval_length())));
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
        if (getID2SSeqIdInterval_seqId() != null) {
            _hashCode += getID2SSeqIdInterval_seqId().hashCode();
        }
        if (getID2SSeqIdInterval_start() != null) {
            _hashCode += getID2SSeqIdInterval_start().hashCode();
        }
        if (getID2SSeqIdInterval_length() != null) {
            _hashCode += getID2SSeqIdInterval_length().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ID2SSeqIdIntervalType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Seq-id-IntervalType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2SSeqIdInterval_seqId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Seq-id-Interval_seq-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Seq-id-Interval_seq-idType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2SSeqIdInterval_start");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Seq-id-Interval_start"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2SSeqIdInterval_length");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Seq-id-Interval_length"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
