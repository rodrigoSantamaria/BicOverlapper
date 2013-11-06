/**
 * SeqAlign_segs_stdType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class SeqAlign_segs_stdType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.StdSegType[] stdSeg;

    public SeqAlign_segs_stdType() {
    }

    public SeqAlign_segs_stdType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.StdSegType[] stdSeg) {
           this.stdSeg = stdSeg;
    }


    /**
     * Gets the stdSeg value for this SeqAlign_segs_stdType.
     * 
     * @return stdSeg
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.StdSegType[] getStdSeg() {
        return stdSeg;
    }


    /**
     * Sets the stdSeg value for this SeqAlign_segs_stdType.
     * 
     * @param stdSeg
     */
    public void setStdSeg(gov.nih.nlm.ncbi.www.soap.eutils.efetch.StdSegType[] stdSeg) {
        this.stdSeg = stdSeg;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.StdSegType getStdSeg(int i) {
        return this.stdSeg[i];
    }

    public void setStdSeg(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.StdSegType _value) {
        this.stdSeg[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SeqAlign_segs_stdType)) return false;
        SeqAlign_segs_stdType other = (SeqAlign_segs_stdType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.stdSeg==null && other.getStdSeg()==null) || 
             (this.stdSeg!=null &&
              java.util.Arrays.equals(this.stdSeg, other.getStdSeg())));
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
        if (getStdSeg() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStdSeg());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStdSeg(), i);
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
        new org.apache.axis.description.TypeDesc(SeqAlign_segs_stdType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-align_segs_stdType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stdSeg");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Std-seg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Std-segType"));
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
