/**
 * SeqHist_deletedType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class SeqHist_deletedType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqHist_deleted_boolType seqHist_deleted_bool;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqHist_deleted_dateType seqHist_deleted_date;

    public SeqHist_deletedType() {
    }

    public SeqHist_deletedType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqHist_deleted_boolType seqHist_deleted_bool,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqHist_deleted_dateType seqHist_deleted_date) {
           this.seqHist_deleted_bool = seqHist_deleted_bool;
           this.seqHist_deleted_date = seqHist_deleted_date;
    }


    /**
     * Gets the seqHist_deleted_bool value for this SeqHist_deletedType.
     * 
     * @return seqHist_deleted_bool
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqHist_deleted_boolType getSeqHist_deleted_bool() {
        return seqHist_deleted_bool;
    }


    /**
     * Sets the seqHist_deleted_bool value for this SeqHist_deletedType.
     * 
     * @param seqHist_deleted_bool
     */
    public void setSeqHist_deleted_bool(gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqHist_deleted_boolType seqHist_deleted_bool) {
        this.seqHist_deleted_bool = seqHist_deleted_bool;
    }


    /**
     * Gets the seqHist_deleted_date value for this SeqHist_deletedType.
     * 
     * @return seqHist_deleted_date
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqHist_deleted_dateType getSeqHist_deleted_date() {
        return seqHist_deleted_date;
    }


    /**
     * Sets the seqHist_deleted_date value for this SeqHist_deletedType.
     * 
     * @param seqHist_deleted_date
     */
    public void setSeqHist_deleted_date(gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqHist_deleted_dateType seqHist_deleted_date) {
        this.seqHist_deleted_date = seqHist_deleted_date;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SeqHist_deletedType)) return false;
        SeqHist_deletedType other = (SeqHist_deletedType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.seqHist_deleted_bool==null && other.getSeqHist_deleted_bool()==null) || 
             (this.seqHist_deleted_bool!=null &&
              this.seqHist_deleted_bool.equals(other.getSeqHist_deleted_bool()))) &&
            ((this.seqHist_deleted_date==null && other.getSeqHist_deleted_date()==null) || 
             (this.seqHist_deleted_date!=null &&
              this.seqHist_deleted_date.equals(other.getSeqHist_deleted_date())));
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
        if (getSeqHist_deleted_bool() != null) {
            _hashCode += getSeqHist_deleted_bool().hashCode();
        }
        if (getSeqHist_deleted_date() != null) {
            _hashCode += getSeqHist_deleted_date().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SeqHist_deletedType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-hist_deletedType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqHist_deleted_bool");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-hist_deleted_bool"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-hist_deleted_boolType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqHist_deleted_date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-hist_deleted_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-hist_deleted_dateType"));
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
