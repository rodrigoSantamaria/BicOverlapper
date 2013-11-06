/**
 * PRFBlock_extraSrcType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class PRFBlock_extraSrcType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PRFExtraSrcType PRFExtraSrc;

    public PRFBlock_extraSrcType() {
    }

    public PRFBlock_extraSrcType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PRFExtraSrcType PRFExtraSrc) {
           this.PRFExtraSrc = PRFExtraSrc;
    }


    /**
     * Gets the PRFExtraSrc value for this PRFBlock_extraSrcType.
     * 
     * @return PRFExtraSrc
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PRFExtraSrcType getPRFExtraSrc() {
        return PRFExtraSrc;
    }


    /**
     * Sets the PRFExtraSrc value for this PRFBlock_extraSrcType.
     * 
     * @param PRFExtraSrc
     */
    public void setPRFExtraSrc(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PRFExtraSrcType PRFExtraSrc) {
        this.PRFExtraSrc = PRFExtraSrc;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PRFBlock_extraSrcType)) return false;
        PRFBlock_extraSrcType other = (PRFBlock_extraSrcType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.PRFExtraSrc==null && other.getPRFExtraSrc()==null) || 
             (this.PRFExtraSrc!=null &&
              this.PRFExtraSrc.equals(other.getPRFExtraSrc())));
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
        if (getPRFExtraSrc() != null) {
            _hashCode += getPRFExtraSrc().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PRFBlock_extraSrcType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PRF-block_extra-srcType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PRFExtraSrc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PRF-ExtraSrc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PRF-ExtraSrcType"));
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
