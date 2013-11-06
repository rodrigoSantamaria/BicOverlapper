/**
 * SeqSubmit.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class SeqSubmit  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqSubmit_subType seqSubmit_sub;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqSubmit_dataType seqSubmit_data;

    public SeqSubmit() {
    }

    public SeqSubmit(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqSubmit_subType seqSubmit_sub,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqSubmit_dataType seqSubmit_data) {
           this.seqSubmit_sub = seqSubmit_sub;
           this.seqSubmit_data = seqSubmit_data;
    }


    /**
     * Gets the seqSubmit_sub value for this SeqSubmit.
     * 
     * @return seqSubmit_sub
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqSubmit_subType getSeqSubmit_sub() {
        return seqSubmit_sub;
    }


    /**
     * Sets the seqSubmit_sub value for this SeqSubmit.
     * 
     * @param seqSubmit_sub
     */
    public void setSeqSubmit_sub(gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqSubmit_subType seqSubmit_sub) {
        this.seqSubmit_sub = seqSubmit_sub;
    }


    /**
     * Gets the seqSubmit_data value for this SeqSubmit.
     * 
     * @return seqSubmit_data
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqSubmit_dataType getSeqSubmit_data() {
        return seqSubmit_data;
    }


    /**
     * Sets the seqSubmit_data value for this SeqSubmit.
     * 
     * @param seqSubmit_data
     */
    public void setSeqSubmit_data(gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqSubmit_dataType seqSubmit_data) {
        this.seqSubmit_data = seqSubmit_data;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SeqSubmit)) return false;
        SeqSubmit other = (SeqSubmit) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.seqSubmit_sub==null && other.getSeqSubmit_sub()==null) || 
             (this.seqSubmit_sub!=null &&
              this.seqSubmit_sub.equals(other.getSeqSubmit_sub()))) &&
            ((this.seqSubmit_data==null && other.getSeqSubmit_data()==null) || 
             (this.seqSubmit_data!=null &&
              this.seqSubmit_data.equals(other.getSeqSubmit_data())));
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
        if (getSeqSubmit_sub() != null) {
            _hashCode += getSeqSubmit_sub().hashCode();
        }
        if (getSeqSubmit_data() != null) {
            _hashCode += getSeqSubmit_data().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SeqSubmit.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">Seq-submit"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqSubmit_sub");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-submit_sub"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-submit_subType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqSubmit_data");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-submit_data"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-submit_dataType"));
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
