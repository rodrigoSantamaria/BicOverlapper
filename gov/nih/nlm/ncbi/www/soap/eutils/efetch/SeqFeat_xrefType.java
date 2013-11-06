/**
 * SeqFeat_xrefType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class SeqFeat_xrefType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqFeatXrefType[] seqFeatXref;

    public SeqFeat_xrefType() {
    }

    public SeqFeat_xrefType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqFeatXrefType[] seqFeatXref) {
           this.seqFeatXref = seqFeatXref;
    }


    /**
     * Gets the seqFeatXref value for this SeqFeat_xrefType.
     * 
     * @return seqFeatXref
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqFeatXrefType[] getSeqFeatXref() {
        return seqFeatXref;
    }


    /**
     * Sets the seqFeatXref value for this SeqFeat_xrefType.
     * 
     * @param seqFeatXref
     */
    public void setSeqFeatXref(gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqFeatXrefType[] seqFeatXref) {
        this.seqFeatXref = seqFeatXref;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqFeatXrefType getSeqFeatXref(int i) {
        return this.seqFeatXref[i];
    }

    public void setSeqFeatXref(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqFeatXrefType _value) {
        this.seqFeatXref[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SeqFeat_xrefType)) return false;
        SeqFeat_xrefType other = (SeqFeat_xrefType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.seqFeatXref==null && other.getSeqFeatXref()==null) || 
             (this.seqFeatXref!=null &&
              java.util.Arrays.equals(this.seqFeatXref, other.getSeqFeatXref())));
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
        if (getSeqFeatXref() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSeqFeatXref());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSeqFeatXref(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SeqFeat_xrefType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-feat_xrefType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqFeatXref");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "SeqFeatXref"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "SeqFeatXrefType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
