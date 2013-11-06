/**
 * SeqExtType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class SeqExtType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqExt_segType seqExt_seg;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqExt_refType seqExt_ref;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqExt_mapType seqExt_map;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqExt_deltaType seqExt_delta;

    public SeqExtType() {
    }

    public SeqExtType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqExt_segType seqExt_seg,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqExt_refType seqExt_ref,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqExt_mapType seqExt_map,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqExt_deltaType seqExt_delta) {
           this.seqExt_seg = seqExt_seg;
           this.seqExt_ref = seqExt_ref;
           this.seqExt_map = seqExt_map;
           this.seqExt_delta = seqExt_delta;
    }


    /**
     * Gets the seqExt_seg value for this SeqExtType.
     * 
     * @return seqExt_seg
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqExt_segType getSeqExt_seg() {
        return seqExt_seg;
    }


    /**
     * Sets the seqExt_seg value for this SeqExtType.
     * 
     * @param seqExt_seg
     */
    public void setSeqExt_seg(gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqExt_segType seqExt_seg) {
        this.seqExt_seg = seqExt_seg;
    }


    /**
     * Gets the seqExt_ref value for this SeqExtType.
     * 
     * @return seqExt_ref
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqExt_refType getSeqExt_ref() {
        return seqExt_ref;
    }


    /**
     * Sets the seqExt_ref value for this SeqExtType.
     * 
     * @param seqExt_ref
     */
    public void setSeqExt_ref(gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqExt_refType seqExt_ref) {
        this.seqExt_ref = seqExt_ref;
    }


    /**
     * Gets the seqExt_map value for this SeqExtType.
     * 
     * @return seqExt_map
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqExt_mapType getSeqExt_map() {
        return seqExt_map;
    }


    /**
     * Sets the seqExt_map value for this SeqExtType.
     * 
     * @param seqExt_map
     */
    public void setSeqExt_map(gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqExt_mapType seqExt_map) {
        this.seqExt_map = seqExt_map;
    }


    /**
     * Gets the seqExt_delta value for this SeqExtType.
     * 
     * @return seqExt_delta
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqExt_deltaType getSeqExt_delta() {
        return seqExt_delta;
    }


    /**
     * Sets the seqExt_delta value for this SeqExtType.
     * 
     * @param seqExt_delta
     */
    public void setSeqExt_delta(gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqExt_deltaType seqExt_delta) {
        this.seqExt_delta = seqExt_delta;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SeqExtType)) return false;
        SeqExtType other = (SeqExtType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.seqExt_seg==null && other.getSeqExt_seg()==null) || 
             (this.seqExt_seg!=null &&
              this.seqExt_seg.equals(other.getSeqExt_seg()))) &&
            ((this.seqExt_ref==null && other.getSeqExt_ref()==null) || 
             (this.seqExt_ref!=null &&
              this.seqExt_ref.equals(other.getSeqExt_ref()))) &&
            ((this.seqExt_map==null && other.getSeqExt_map()==null) || 
             (this.seqExt_map!=null &&
              this.seqExt_map.equals(other.getSeqExt_map()))) &&
            ((this.seqExt_delta==null && other.getSeqExt_delta()==null) || 
             (this.seqExt_delta!=null &&
              this.seqExt_delta.equals(other.getSeqExt_delta())));
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
        if (getSeqExt_seg() != null) {
            _hashCode += getSeqExt_seg().hashCode();
        }
        if (getSeqExt_ref() != null) {
            _hashCode += getSeqExt_ref().hashCode();
        }
        if (getSeqExt_map() != null) {
            _hashCode += getSeqExt_map().hashCode();
        }
        if (getSeqExt_delta() != null) {
            _hashCode += getSeqExt_delta().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SeqExtType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-extType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqExt_seg");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-ext_seg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-ext_segType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqExt_ref");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-ext_ref"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-ext_refType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqExt_map");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-ext_map"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-ext_mapType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqExt_delta");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-ext_delta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-ext_deltaType"));
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
