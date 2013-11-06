/**
 * INSDSeq_otherSeqidsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class INSDSeq_otherSeqidsType  implements java.io.Serializable {
    private java.lang.String[] INSDSeqid;

    public INSDSeq_otherSeqidsType() {
    }

    public INSDSeq_otherSeqidsType(
           java.lang.String[] INSDSeqid) {
           this.INSDSeqid = INSDSeqid;
    }


    /**
     * Gets the INSDSeqid value for this INSDSeq_otherSeqidsType.
     * 
     * @return INSDSeqid
     */
    public java.lang.String[] getINSDSeqid() {
        return INSDSeqid;
    }


    /**
     * Sets the INSDSeqid value for this INSDSeq_otherSeqidsType.
     * 
     * @param INSDSeqid
     */
    public void setINSDSeqid(java.lang.String[] INSDSeqid) {
        this.INSDSeqid = INSDSeqid;
    }

    public java.lang.String getINSDSeqid(int i) {
        return this.INSDSeqid[i];
    }

    public void setINSDSeqid(int i, java.lang.String _value) {
        this.INSDSeqid[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof INSDSeq_otherSeqidsType)) return false;
        INSDSeq_otherSeqidsType other = (INSDSeq_otherSeqidsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.INSDSeqid==null && other.getINSDSeqid()==null) || 
             (this.INSDSeqid!=null &&
              java.util.Arrays.equals(this.INSDSeqid, other.getINSDSeqid())));
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
        if (getINSDSeqid() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getINSDSeqid());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getINSDSeqid(), i);
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
        new org.apache.axis.description.TypeDesc(INSDSeq_otherSeqidsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "INSDSeq_other-seqidsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("INSDSeqid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "INSDSeqid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "INSDSeqid"));
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
