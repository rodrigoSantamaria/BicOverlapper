/**
 * PssmWithParameters_pssmType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class PssmWithParameters_pssmType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PssmType pssm;

    public PssmWithParameters_pssmType() {
    }

    public PssmWithParameters_pssmType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PssmType pssm) {
           this.pssm = pssm;
    }


    /**
     * Gets the pssm value for this PssmWithParameters_pssmType.
     * 
     * @return pssm
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PssmType getPssm() {
        return pssm;
    }


    /**
     * Sets the pssm value for this PssmWithParameters_pssmType.
     * 
     * @param pssm
     */
    public void setPssm(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PssmType pssm) {
        this.pssm = pssm;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PssmWithParameters_pssmType)) return false;
        PssmWithParameters_pssmType other = (PssmWithParameters_pssmType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.pssm==null && other.getPssm()==null) || 
             (this.pssm!=null &&
              this.pssm.equals(other.getPssm())));
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
        if (getPssm() != null) {
            _hashCode += getPssm().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PssmWithParameters_pssmType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PssmWithParameters_pssmType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pssm");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Pssm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PssmType"));
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
