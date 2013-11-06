/**
 * SeqAlign_segs_densegType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class SeqAlign_segs_densegType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.DenseSegType denseSeg;

    public SeqAlign_segs_densegType() {
    }

    public SeqAlign_segs_densegType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.DenseSegType denseSeg) {
           this.denseSeg = denseSeg;
    }


    /**
     * Gets the denseSeg value for this SeqAlign_segs_densegType.
     * 
     * @return denseSeg
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.DenseSegType getDenseSeg() {
        return denseSeg;
    }


    /**
     * Sets the denseSeg value for this SeqAlign_segs_densegType.
     * 
     * @param denseSeg
     */
    public void setDenseSeg(gov.nih.nlm.ncbi.www.soap.eutils.efetch.DenseSegType denseSeg) {
        this.denseSeg = denseSeg;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SeqAlign_segs_densegType)) return false;
        SeqAlign_segs_densegType other = (SeqAlign_segs_densegType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.denseSeg==null && other.getDenseSeg()==null) || 
             (this.denseSeg!=null &&
              this.denseSeg.equals(other.getDenseSeg())));
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
        if (getDenseSeg() != null) {
            _hashCode += getDenseSeg().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SeqAlign_segs_densegType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-align_segs_densegType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("denseSeg");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Dense-seg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Dense-segType"));
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
