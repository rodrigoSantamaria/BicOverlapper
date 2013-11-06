/**
 * SeqLoc_equivType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class SeqLoc_equivType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqLocEquivType seqLocEquiv;

    public SeqLoc_equivType() {
    }

    public SeqLoc_equivType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqLocEquivType seqLocEquiv) {
           this.seqLocEquiv = seqLocEquiv;
    }


    /**
     * Gets the seqLocEquiv value for this SeqLoc_equivType.
     * 
     * @return seqLocEquiv
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqLocEquivType getSeqLocEquiv() {
        return seqLocEquiv;
    }


    /**
     * Sets the seqLocEquiv value for this SeqLoc_equivType.
     * 
     * @param seqLocEquiv
     */
    public void setSeqLocEquiv(gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqLocEquivType seqLocEquiv) {
        this.seqLocEquiv = seqLocEquiv;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SeqLoc_equivType)) return false;
        SeqLoc_equivType other = (SeqLoc_equivType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.seqLocEquiv==null && other.getSeqLocEquiv()==null) || 
             (this.seqLocEquiv!=null &&
              this.seqLocEquiv.equals(other.getSeqLocEquiv())));
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
        if (getSeqLocEquiv() != null) {
            _hashCode += getSeqLocEquiv().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SeqLoc_equivType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-loc_equivType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqLocEquiv");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-loc-equiv"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-loc-equivType"));
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
