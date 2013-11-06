/**
 * SeqAlign_segs_dendiagType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class SeqAlign_segs_dendiagType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.DenseDiagType[] denseDiag;

    public SeqAlign_segs_dendiagType() {
    }

    public SeqAlign_segs_dendiagType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.DenseDiagType[] denseDiag) {
           this.denseDiag = denseDiag;
    }


    /**
     * Gets the denseDiag value for this SeqAlign_segs_dendiagType.
     * 
     * @return denseDiag
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.DenseDiagType[] getDenseDiag() {
        return denseDiag;
    }


    /**
     * Sets the denseDiag value for this SeqAlign_segs_dendiagType.
     * 
     * @param denseDiag
     */
    public void setDenseDiag(gov.nih.nlm.ncbi.www.soap.eutils.efetch.DenseDiagType[] denseDiag) {
        this.denseDiag = denseDiag;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.DenseDiagType getDenseDiag(int i) {
        return this.denseDiag[i];
    }

    public void setDenseDiag(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.DenseDiagType _value) {
        this.denseDiag[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SeqAlign_segs_dendiagType)) return false;
        SeqAlign_segs_dendiagType other = (SeqAlign_segs_dendiagType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.denseDiag==null && other.getDenseDiag()==null) || 
             (this.denseDiag!=null &&
              java.util.Arrays.equals(this.denseDiag, other.getDenseDiag())));
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
        if (getDenseDiag() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDenseDiag());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDenseDiag(), i);
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
        new org.apache.axis.description.TypeDesc(SeqAlign_segs_dendiagType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-align_segs_dendiagType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("denseDiag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Dense-diag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Dense-diagType"));
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
