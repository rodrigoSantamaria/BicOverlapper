/**
 * PatentSeqIdType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class PatentSeqIdType  implements java.io.Serializable {
    private java.lang.String patentSeqId_seqid;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PatentSeqId_citType patentSeqId_cit;

    public PatentSeqIdType() {
    }

    public PatentSeqIdType(
           java.lang.String patentSeqId_seqid,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PatentSeqId_citType patentSeqId_cit) {
           this.patentSeqId_seqid = patentSeqId_seqid;
           this.patentSeqId_cit = patentSeqId_cit;
    }


    /**
     * Gets the patentSeqId_seqid value for this PatentSeqIdType.
     * 
     * @return patentSeqId_seqid
     */
    public java.lang.String getPatentSeqId_seqid() {
        return patentSeqId_seqid;
    }


    /**
     * Sets the patentSeqId_seqid value for this PatentSeqIdType.
     * 
     * @param patentSeqId_seqid
     */
    public void setPatentSeqId_seqid(java.lang.String patentSeqId_seqid) {
        this.patentSeqId_seqid = patentSeqId_seqid;
    }


    /**
     * Gets the patentSeqId_cit value for this PatentSeqIdType.
     * 
     * @return patentSeqId_cit
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PatentSeqId_citType getPatentSeqId_cit() {
        return patentSeqId_cit;
    }


    /**
     * Sets the patentSeqId_cit value for this PatentSeqIdType.
     * 
     * @param patentSeqId_cit
     */
    public void setPatentSeqId_cit(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PatentSeqId_citType patentSeqId_cit) {
        this.patentSeqId_cit = patentSeqId_cit;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PatentSeqIdType)) return false;
        PatentSeqIdType other = (PatentSeqIdType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.patentSeqId_seqid==null && other.getPatentSeqId_seqid()==null) || 
             (this.patentSeqId_seqid!=null &&
              this.patentSeqId_seqid.equals(other.getPatentSeqId_seqid()))) &&
            ((this.patentSeqId_cit==null && other.getPatentSeqId_cit()==null) || 
             (this.patentSeqId_cit!=null &&
              this.patentSeqId_cit.equals(other.getPatentSeqId_cit())));
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
        if (getPatentSeqId_seqid() != null) {
            _hashCode += getPatentSeqId_seqid().hashCode();
        }
        if (getPatentSeqId_cit() != null) {
            _hashCode += getPatentSeqId_cit().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PatentSeqIdType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Patent-seq-idType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("patentSeqId_seqid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Patent-seq-id_seqid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("patentSeqId_cit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Patent-seq-id_cit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Patent-seq-id_citType"));
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
