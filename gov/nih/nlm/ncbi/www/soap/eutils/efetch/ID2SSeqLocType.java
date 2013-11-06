/**
 * ID2SSeqLocType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ID2SSeqLocType  implements java.io.Serializable {
    private java.lang.String ID2SSeqLoc_wholeGi;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SSeqLoc_wholeSeqIdType ID2SSeqLoc_wholeSeqId;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SSeqLoc_wholeGiRangeType ID2SSeqLoc_wholeGiRange;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SSeqLoc_giIntervalType ID2SSeqLoc_giInterval;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SSeqLoc_seqIdIntervalType ID2SSeqLoc_seqIdInterval;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SSeqLoc_giIntsType ID2SSeqLoc_giInts;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SSeqLoc_seqIdIntsType ID2SSeqLoc_seqIdInts;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SSeqLoc_locSetType ID2SSeqLoc_locSet;

    public ID2SSeqLocType() {
    }

    public ID2SSeqLocType(
           java.lang.String ID2SSeqLoc_wholeGi,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SSeqLoc_wholeSeqIdType ID2SSeqLoc_wholeSeqId,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SSeqLoc_wholeGiRangeType ID2SSeqLoc_wholeGiRange,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SSeqLoc_giIntervalType ID2SSeqLoc_giInterval,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SSeqLoc_seqIdIntervalType ID2SSeqLoc_seqIdInterval,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SSeqLoc_giIntsType ID2SSeqLoc_giInts,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SSeqLoc_seqIdIntsType ID2SSeqLoc_seqIdInts,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SSeqLoc_locSetType ID2SSeqLoc_locSet) {
           this.ID2SSeqLoc_wholeGi = ID2SSeqLoc_wholeGi;
           this.ID2SSeqLoc_wholeSeqId = ID2SSeqLoc_wholeSeqId;
           this.ID2SSeqLoc_wholeGiRange = ID2SSeqLoc_wholeGiRange;
           this.ID2SSeqLoc_giInterval = ID2SSeqLoc_giInterval;
           this.ID2SSeqLoc_seqIdInterval = ID2SSeqLoc_seqIdInterval;
           this.ID2SSeqLoc_giInts = ID2SSeqLoc_giInts;
           this.ID2SSeqLoc_seqIdInts = ID2SSeqLoc_seqIdInts;
           this.ID2SSeqLoc_locSet = ID2SSeqLoc_locSet;
    }


    /**
     * Gets the ID2SSeqLoc_wholeGi value for this ID2SSeqLocType.
     * 
     * @return ID2SSeqLoc_wholeGi
     */
    public java.lang.String getID2SSeqLoc_wholeGi() {
        return ID2SSeqLoc_wholeGi;
    }


    /**
     * Sets the ID2SSeqLoc_wholeGi value for this ID2SSeqLocType.
     * 
     * @param ID2SSeqLoc_wholeGi
     */
    public void setID2SSeqLoc_wholeGi(java.lang.String ID2SSeqLoc_wholeGi) {
        this.ID2SSeqLoc_wholeGi = ID2SSeqLoc_wholeGi;
    }


    /**
     * Gets the ID2SSeqLoc_wholeSeqId value for this ID2SSeqLocType.
     * 
     * @return ID2SSeqLoc_wholeSeqId
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SSeqLoc_wholeSeqIdType getID2SSeqLoc_wholeSeqId() {
        return ID2SSeqLoc_wholeSeqId;
    }


    /**
     * Sets the ID2SSeqLoc_wholeSeqId value for this ID2SSeqLocType.
     * 
     * @param ID2SSeqLoc_wholeSeqId
     */
    public void setID2SSeqLoc_wholeSeqId(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SSeqLoc_wholeSeqIdType ID2SSeqLoc_wholeSeqId) {
        this.ID2SSeqLoc_wholeSeqId = ID2SSeqLoc_wholeSeqId;
    }


    /**
     * Gets the ID2SSeqLoc_wholeGiRange value for this ID2SSeqLocType.
     * 
     * @return ID2SSeqLoc_wholeGiRange
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SSeqLoc_wholeGiRangeType getID2SSeqLoc_wholeGiRange() {
        return ID2SSeqLoc_wholeGiRange;
    }


    /**
     * Sets the ID2SSeqLoc_wholeGiRange value for this ID2SSeqLocType.
     * 
     * @param ID2SSeqLoc_wholeGiRange
     */
    public void setID2SSeqLoc_wholeGiRange(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SSeqLoc_wholeGiRangeType ID2SSeqLoc_wholeGiRange) {
        this.ID2SSeqLoc_wholeGiRange = ID2SSeqLoc_wholeGiRange;
    }


    /**
     * Gets the ID2SSeqLoc_giInterval value for this ID2SSeqLocType.
     * 
     * @return ID2SSeqLoc_giInterval
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SSeqLoc_giIntervalType getID2SSeqLoc_giInterval() {
        return ID2SSeqLoc_giInterval;
    }


    /**
     * Sets the ID2SSeqLoc_giInterval value for this ID2SSeqLocType.
     * 
     * @param ID2SSeqLoc_giInterval
     */
    public void setID2SSeqLoc_giInterval(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SSeqLoc_giIntervalType ID2SSeqLoc_giInterval) {
        this.ID2SSeqLoc_giInterval = ID2SSeqLoc_giInterval;
    }


    /**
     * Gets the ID2SSeqLoc_seqIdInterval value for this ID2SSeqLocType.
     * 
     * @return ID2SSeqLoc_seqIdInterval
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SSeqLoc_seqIdIntervalType getID2SSeqLoc_seqIdInterval() {
        return ID2SSeqLoc_seqIdInterval;
    }


    /**
     * Sets the ID2SSeqLoc_seqIdInterval value for this ID2SSeqLocType.
     * 
     * @param ID2SSeqLoc_seqIdInterval
     */
    public void setID2SSeqLoc_seqIdInterval(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SSeqLoc_seqIdIntervalType ID2SSeqLoc_seqIdInterval) {
        this.ID2SSeqLoc_seqIdInterval = ID2SSeqLoc_seqIdInterval;
    }


    /**
     * Gets the ID2SSeqLoc_giInts value for this ID2SSeqLocType.
     * 
     * @return ID2SSeqLoc_giInts
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SSeqLoc_giIntsType getID2SSeqLoc_giInts() {
        return ID2SSeqLoc_giInts;
    }


    /**
     * Sets the ID2SSeqLoc_giInts value for this ID2SSeqLocType.
     * 
     * @param ID2SSeqLoc_giInts
     */
    public void setID2SSeqLoc_giInts(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SSeqLoc_giIntsType ID2SSeqLoc_giInts) {
        this.ID2SSeqLoc_giInts = ID2SSeqLoc_giInts;
    }


    /**
     * Gets the ID2SSeqLoc_seqIdInts value for this ID2SSeqLocType.
     * 
     * @return ID2SSeqLoc_seqIdInts
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SSeqLoc_seqIdIntsType getID2SSeqLoc_seqIdInts() {
        return ID2SSeqLoc_seqIdInts;
    }


    /**
     * Sets the ID2SSeqLoc_seqIdInts value for this ID2SSeqLocType.
     * 
     * @param ID2SSeqLoc_seqIdInts
     */
    public void setID2SSeqLoc_seqIdInts(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SSeqLoc_seqIdIntsType ID2SSeqLoc_seqIdInts) {
        this.ID2SSeqLoc_seqIdInts = ID2SSeqLoc_seqIdInts;
    }


    /**
     * Gets the ID2SSeqLoc_locSet value for this ID2SSeqLocType.
     * 
     * @return ID2SSeqLoc_locSet
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SSeqLoc_locSetType getID2SSeqLoc_locSet() {
        return ID2SSeqLoc_locSet;
    }


    /**
     * Sets the ID2SSeqLoc_locSet value for this ID2SSeqLocType.
     * 
     * @param ID2SSeqLoc_locSet
     */
    public void setID2SSeqLoc_locSet(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SSeqLoc_locSetType ID2SSeqLoc_locSet) {
        this.ID2SSeqLoc_locSet = ID2SSeqLoc_locSet;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ID2SSeqLocType)) return false;
        ID2SSeqLocType other = (ID2SSeqLocType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ID2SSeqLoc_wholeGi==null && other.getID2SSeqLoc_wholeGi()==null) || 
             (this.ID2SSeqLoc_wholeGi!=null &&
              this.ID2SSeqLoc_wholeGi.equals(other.getID2SSeqLoc_wholeGi()))) &&
            ((this.ID2SSeqLoc_wholeSeqId==null && other.getID2SSeqLoc_wholeSeqId()==null) || 
             (this.ID2SSeqLoc_wholeSeqId!=null &&
              this.ID2SSeqLoc_wholeSeqId.equals(other.getID2SSeqLoc_wholeSeqId()))) &&
            ((this.ID2SSeqLoc_wholeGiRange==null && other.getID2SSeqLoc_wholeGiRange()==null) || 
             (this.ID2SSeqLoc_wholeGiRange!=null &&
              this.ID2SSeqLoc_wholeGiRange.equals(other.getID2SSeqLoc_wholeGiRange()))) &&
            ((this.ID2SSeqLoc_giInterval==null && other.getID2SSeqLoc_giInterval()==null) || 
             (this.ID2SSeqLoc_giInterval!=null &&
              this.ID2SSeqLoc_giInterval.equals(other.getID2SSeqLoc_giInterval()))) &&
            ((this.ID2SSeqLoc_seqIdInterval==null && other.getID2SSeqLoc_seqIdInterval()==null) || 
             (this.ID2SSeqLoc_seqIdInterval!=null &&
              this.ID2SSeqLoc_seqIdInterval.equals(other.getID2SSeqLoc_seqIdInterval()))) &&
            ((this.ID2SSeqLoc_giInts==null && other.getID2SSeqLoc_giInts()==null) || 
             (this.ID2SSeqLoc_giInts!=null &&
              this.ID2SSeqLoc_giInts.equals(other.getID2SSeqLoc_giInts()))) &&
            ((this.ID2SSeqLoc_seqIdInts==null && other.getID2SSeqLoc_seqIdInts()==null) || 
             (this.ID2SSeqLoc_seqIdInts!=null &&
              this.ID2SSeqLoc_seqIdInts.equals(other.getID2SSeqLoc_seqIdInts()))) &&
            ((this.ID2SSeqLoc_locSet==null && other.getID2SSeqLoc_locSet()==null) || 
             (this.ID2SSeqLoc_locSet!=null &&
              this.ID2SSeqLoc_locSet.equals(other.getID2SSeqLoc_locSet())));
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
        if (getID2SSeqLoc_wholeGi() != null) {
            _hashCode += getID2SSeqLoc_wholeGi().hashCode();
        }
        if (getID2SSeqLoc_wholeSeqId() != null) {
            _hashCode += getID2SSeqLoc_wholeSeqId().hashCode();
        }
        if (getID2SSeqLoc_wholeGiRange() != null) {
            _hashCode += getID2SSeqLoc_wholeGiRange().hashCode();
        }
        if (getID2SSeqLoc_giInterval() != null) {
            _hashCode += getID2SSeqLoc_giInterval().hashCode();
        }
        if (getID2SSeqLoc_seqIdInterval() != null) {
            _hashCode += getID2SSeqLoc_seqIdInterval().hashCode();
        }
        if (getID2SSeqLoc_giInts() != null) {
            _hashCode += getID2SSeqLoc_giInts().hashCode();
        }
        if (getID2SSeqLoc_seqIdInts() != null) {
            _hashCode += getID2SSeqLoc_seqIdInts().hashCode();
        }
        if (getID2SSeqLoc_locSet() != null) {
            _hashCode += getID2SSeqLoc_locSet().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ID2SSeqLocType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Seq-locType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2SSeqLoc_wholeGi");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Seq-loc_whole-gi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2SSeqLoc_wholeSeqId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Seq-loc_whole-seq-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Seq-loc_whole-seq-idType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2SSeqLoc_wholeGiRange");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Seq-loc_whole-gi-range"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Seq-loc_whole-gi-rangeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2SSeqLoc_giInterval");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Seq-loc_gi-interval"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Seq-loc_gi-intervalType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2SSeqLoc_seqIdInterval");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Seq-loc_seq-id-interval"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Seq-loc_seq-id-intervalType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2SSeqLoc_giInts");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Seq-loc_gi-ints"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Seq-loc_gi-intsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2SSeqLoc_seqIdInts");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Seq-loc_seq-id-ints"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Seq-loc_seq-id-intsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2SSeqLoc_locSet");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Seq-loc_loc-set"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Seq-loc_loc-setType"));
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
