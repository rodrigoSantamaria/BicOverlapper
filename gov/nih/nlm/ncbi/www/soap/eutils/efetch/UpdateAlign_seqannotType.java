/**
 * UpdateAlign_seqannotType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class UpdateAlign_seqannotType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqAnnotType seqAnnot;

    public UpdateAlign_seqannotType() {
    }

    public UpdateAlign_seqannotType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqAnnotType seqAnnot) {
           this.seqAnnot = seqAnnot;
    }


    /**
     * Gets the seqAnnot value for this UpdateAlign_seqannotType.
     * 
     * @return seqAnnot
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqAnnotType getSeqAnnot() {
        return seqAnnot;
    }


    /**
     * Sets the seqAnnot value for this UpdateAlign_seqannotType.
     * 
     * @param seqAnnot
     */
    public void setSeqAnnot(gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqAnnotType seqAnnot) {
        this.seqAnnot = seqAnnot;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateAlign_seqannotType)) return false;
        UpdateAlign_seqannotType other = (UpdateAlign_seqannotType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.seqAnnot==null && other.getSeqAnnot()==null) || 
             (this.seqAnnot!=null &&
              this.seqAnnot.equals(other.getSeqAnnot())));
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
        if (getSeqAnnot() != null) {
            _hashCode += getSeqAnnot().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdateAlign_seqannotType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Update-align_seqannotType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqAnnot");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-annot"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-annotType"));
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
