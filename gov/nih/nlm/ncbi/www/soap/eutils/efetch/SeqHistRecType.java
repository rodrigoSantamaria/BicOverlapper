/**
 * SeqHistRecType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class SeqHistRecType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqHistRec_dateType seqHistRec_date;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqHistRec_idsType seqHistRec_ids;

    public SeqHistRecType() {
    }

    public SeqHistRecType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqHistRec_dateType seqHistRec_date,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqHistRec_idsType seqHistRec_ids) {
           this.seqHistRec_date = seqHistRec_date;
           this.seqHistRec_ids = seqHistRec_ids;
    }


    /**
     * Gets the seqHistRec_date value for this SeqHistRecType.
     * 
     * @return seqHistRec_date
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqHistRec_dateType getSeqHistRec_date() {
        return seqHistRec_date;
    }


    /**
     * Sets the seqHistRec_date value for this SeqHistRecType.
     * 
     * @param seqHistRec_date
     */
    public void setSeqHistRec_date(gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqHistRec_dateType seqHistRec_date) {
        this.seqHistRec_date = seqHistRec_date;
    }


    /**
     * Gets the seqHistRec_ids value for this SeqHistRecType.
     * 
     * @return seqHistRec_ids
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqHistRec_idsType getSeqHistRec_ids() {
        return seqHistRec_ids;
    }


    /**
     * Sets the seqHistRec_ids value for this SeqHistRecType.
     * 
     * @param seqHistRec_ids
     */
    public void setSeqHistRec_ids(gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqHistRec_idsType seqHistRec_ids) {
        this.seqHistRec_ids = seqHistRec_ids;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SeqHistRecType)) return false;
        SeqHistRecType other = (SeqHistRecType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.seqHistRec_date==null && other.getSeqHistRec_date()==null) || 
             (this.seqHistRec_date!=null &&
              this.seqHistRec_date.equals(other.getSeqHistRec_date()))) &&
            ((this.seqHistRec_ids==null && other.getSeqHistRec_ids()==null) || 
             (this.seqHistRec_ids!=null &&
              this.seqHistRec_ids.equals(other.getSeqHistRec_ids())));
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
        if (getSeqHistRec_date() != null) {
            _hashCode += getSeqHistRec_date().hashCode();
        }
        if (getSeqHistRec_ids() != null) {
            _hashCode += getSeqHistRec_ids().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SeqHistRecType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-hist-recType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqHistRec_date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-hist-rec_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-hist-rec_dateType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqHistRec_ids");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-hist-rec_ids"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-hist-rec_idsType"));
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
