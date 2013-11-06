/**
 * SeqExt_deltaType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class SeqExt_deltaType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.DeltaExtType deltaExt;

    public SeqExt_deltaType() {
    }

    public SeqExt_deltaType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.DeltaExtType deltaExt) {
           this.deltaExt = deltaExt;
    }


    /**
     * Gets the deltaExt value for this SeqExt_deltaType.
     * 
     * @return deltaExt
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.DeltaExtType getDeltaExt() {
        return deltaExt;
    }


    /**
     * Sets the deltaExt value for this SeqExt_deltaType.
     * 
     * @param deltaExt
     */
    public void setDeltaExt(gov.nih.nlm.ncbi.www.soap.eutils.efetch.DeltaExtType deltaExt) {
        this.deltaExt = deltaExt;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SeqExt_deltaType)) return false;
        SeqExt_deltaType other = (SeqExt_deltaType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.deltaExt==null && other.getDeltaExt()==null) || 
             (this.deltaExt!=null &&
              this.deltaExt.equals(other.getDeltaExt())));
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
        if (getDeltaExt() != null) {
            _hashCode += getDeltaExt().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SeqExt_deltaType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-ext_deltaType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deltaExt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Delta-ext"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Delta-extType"));
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
