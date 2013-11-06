/**
 * RNARef_ext_tRNAType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class RNARef_ext_tRNAType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.TrnaExtType trnaExt;

    public RNARef_ext_tRNAType() {
    }

    public RNARef_ext_tRNAType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.TrnaExtType trnaExt) {
           this.trnaExt = trnaExt;
    }


    /**
     * Gets the trnaExt value for this RNARef_ext_tRNAType.
     * 
     * @return trnaExt
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.TrnaExtType getTrnaExt() {
        return trnaExt;
    }


    /**
     * Sets the trnaExt value for this RNARef_ext_tRNAType.
     * 
     * @param trnaExt
     */
    public void setTrnaExt(gov.nih.nlm.ncbi.www.soap.eutils.efetch.TrnaExtType trnaExt) {
        this.trnaExt = trnaExt;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RNARef_ext_tRNAType)) return false;
        RNARef_ext_tRNAType other = (RNARef_ext_tRNAType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.trnaExt==null && other.getTrnaExt()==null) || 
             (this.trnaExt!=null &&
              this.trnaExt.equals(other.getTrnaExt())));
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
        if (getTrnaExt() != null) {
            _hashCode += getTrnaExt().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RNARef_ext_tRNAType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "RNA-ref_ext_tRNAType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trnaExt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Trna-ext"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Trna-extType"));
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
