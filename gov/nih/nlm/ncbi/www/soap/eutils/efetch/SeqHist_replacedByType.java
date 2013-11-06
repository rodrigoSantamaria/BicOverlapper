/**
 * SeqHist_replacedByType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class SeqHist_replacedByType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqHistRecType seqHistRec;

    public SeqHist_replacedByType() {
    }

    public SeqHist_replacedByType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqHistRecType seqHistRec) {
           this.seqHistRec = seqHistRec;
    }


    /**
     * Gets the seqHistRec value for this SeqHist_replacedByType.
     * 
     * @return seqHistRec
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqHistRecType getSeqHistRec() {
        return seqHistRec;
    }


    /**
     * Sets the seqHistRec value for this SeqHist_replacedByType.
     * 
     * @param seqHistRec
     */
    public void setSeqHistRec(gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqHistRecType seqHistRec) {
        this.seqHistRec = seqHistRec;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SeqHist_replacedByType)) return false;
        SeqHist_replacedByType other = (SeqHist_replacedByType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.seqHistRec==null && other.getSeqHistRec()==null) || 
             (this.seqHistRec!=null &&
              this.seqHistRec.equals(other.getSeqHistRec())));
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
        if (getSeqHistRec() != null) {
            _hashCode += getSeqHistRec().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SeqHist_replacedByType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-hist_replaced-byType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqHistRec");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-hist-rec"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-hist-recType"));
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
