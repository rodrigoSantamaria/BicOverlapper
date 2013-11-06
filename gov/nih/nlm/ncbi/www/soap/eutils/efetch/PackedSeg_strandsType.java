/**
 * PackedSeg_strandsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class PackedSeg_strandsType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.NaStrandType[] naStrand;

    public PackedSeg_strandsType() {
    }

    public PackedSeg_strandsType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.NaStrandType[] naStrand) {
           this.naStrand = naStrand;
    }


    /**
     * Gets the naStrand value for this PackedSeg_strandsType.
     * 
     * @return naStrand
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.NaStrandType[] getNaStrand() {
        return naStrand;
    }


    /**
     * Sets the naStrand value for this PackedSeg_strandsType.
     * 
     * @param naStrand
     */
    public void setNaStrand(gov.nih.nlm.ncbi.www.soap.eutils.efetch.NaStrandType[] naStrand) {
        this.naStrand = naStrand;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.NaStrandType getNaStrand(int i) {
        return this.naStrand[i];
    }

    public void setNaStrand(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.NaStrandType _value) {
        this.naStrand[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PackedSeg_strandsType)) return false;
        PackedSeg_strandsType other = (PackedSeg_strandsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.naStrand==null && other.getNaStrand()==null) || 
             (this.naStrand!=null &&
              java.util.Arrays.equals(this.naStrand, other.getNaStrand())));
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
        if (getNaStrand() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNaStrand());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNaStrand(), i);
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
        new org.apache.axis.description.TypeDesc(PackedSeg_strandsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Packed-seg_strandsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("naStrand");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Na-strand"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Na-strandType"));
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
