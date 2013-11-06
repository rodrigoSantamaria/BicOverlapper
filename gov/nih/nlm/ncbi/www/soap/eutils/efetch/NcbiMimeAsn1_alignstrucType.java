/**
 * NcbiMimeAsn1_alignstrucType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class NcbiMimeAsn1_alignstrucType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucAlignType biostrucAlign;

    public NcbiMimeAsn1_alignstrucType() {
    }

    public NcbiMimeAsn1_alignstrucType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucAlignType biostrucAlign) {
           this.biostrucAlign = biostrucAlign;
    }


    /**
     * Gets the biostrucAlign value for this NcbiMimeAsn1_alignstrucType.
     * 
     * @return biostrucAlign
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucAlignType getBiostrucAlign() {
        return biostrucAlign;
    }


    /**
     * Sets the biostrucAlign value for this NcbiMimeAsn1_alignstrucType.
     * 
     * @param biostrucAlign
     */
    public void setBiostrucAlign(gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucAlignType biostrucAlign) {
        this.biostrucAlign = biostrucAlign;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NcbiMimeAsn1_alignstrucType)) return false;
        NcbiMimeAsn1_alignstrucType other = (NcbiMimeAsn1_alignstrucType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.biostrucAlign==null && other.getBiostrucAlign()==null) || 
             (this.biostrucAlign!=null &&
              this.biostrucAlign.equals(other.getBiostrucAlign())));
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
        if (getBiostrucAlign() != null) {
            _hashCode += getBiostrucAlign().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NcbiMimeAsn1_alignstrucType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Ncbi-mime-asn1_alignstrucType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("biostrucAlign");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-align"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-alignType"));
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
