/**
 * BiostrucHistory_replacesType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class BiostrucHistory_replacesType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucReplaceType biostrucReplace;

    public BiostrucHistory_replacesType() {
    }

    public BiostrucHistory_replacesType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucReplaceType biostrucReplace) {
           this.biostrucReplace = biostrucReplace;
    }


    /**
     * Gets the biostrucReplace value for this BiostrucHistory_replacesType.
     * 
     * @return biostrucReplace
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucReplaceType getBiostrucReplace() {
        return biostrucReplace;
    }


    /**
     * Sets the biostrucReplace value for this BiostrucHistory_replacesType.
     * 
     * @param biostrucReplace
     */
    public void setBiostrucReplace(gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucReplaceType biostrucReplace) {
        this.biostrucReplace = biostrucReplace;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BiostrucHistory_replacesType)) return false;
        BiostrucHistory_replacesType other = (BiostrucHistory_replacesType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.biostrucReplace==null && other.getBiostrucReplace()==null) || 
             (this.biostrucReplace!=null &&
              this.biostrucReplace.equals(other.getBiostrucReplace())));
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
        if (getBiostrucReplace() != null) {
            _hashCode += getBiostrucReplace().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BiostrucHistory_replacesType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-history_replacesType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("biostrucReplace");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-replace"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-replaceType"));
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
