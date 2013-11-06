/**
 * GBSeq_otherSeqidsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class GBSeq_otherSeqidsType  implements java.io.Serializable {
    private java.lang.String[] GBSeqid;

    public GBSeq_otherSeqidsType() {
    }

    public GBSeq_otherSeqidsType(
           java.lang.String[] GBSeqid) {
           this.GBSeqid = GBSeqid;
    }


    /**
     * Gets the GBSeqid value for this GBSeq_otherSeqidsType.
     * 
     * @return GBSeqid
     */
    public java.lang.String[] getGBSeqid() {
        return GBSeqid;
    }


    /**
     * Sets the GBSeqid value for this GBSeq_otherSeqidsType.
     * 
     * @param GBSeqid
     */
    public void setGBSeqid(java.lang.String[] GBSeqid) {
        this.GBSeqid = GBSeqid;
    }

    public java.lang.String getGBSeqid(int i) {
        return this.GBSeqid[i];
    }

    public void setGBSeqid(int i, java.lang.String _value) {
        this.GBSeqid[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GBSeq_otherSeqidsType)) return false;
        GBSeq_otherSeqidsType other = (GBSeq_otherSeqidsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.GBSeqid==null && other.getGBSeqid()==null) || 
             (this.GBSeqid!=null &&
              java.util.Arrays.equals(this.GBSeqid, other.getGBSeqid())));
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
        if (getGBSeqid() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGBSeqid());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGBSeqid(), i);
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
        new org.apache.axis.description.TypeDesc(GBSeq_otherSeqidsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "GBSeq_other-seqidsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GBSeqid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "GBSeqid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "GBSeqid"));
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
