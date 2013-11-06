/**
 * NcbiMimeAsn1_entrezType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class NcbiMimeAsn1_entrezType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.EntrezGeneralType entrezGeneral;

    public NcbiMimeAsn1_entrezType() {
    }

    public NcbiMimeAsn1_entrezType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.EntrezGeneralType entrezGeneral) {
           this.entrezGeneral = entrezGeneral;
    }


    /**
     * Gets the entrezGeneral value for this NcbiMimeAsn1_entrezType.
     * 
     * @return entrezGeneral
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.EntrezGeneralType getEntrezGeneral() {
        return entrezGeneral;
    }


    /**
     * Sets the entrezGeneral value for this NcbiMimeAsn1_entrezType.
     * 
     * @param entrezGeneral
     */
    public void setEntrezGeneral(gov.nih.nlm.ncbi.www.soap.eutils.efetch.EntrezGeneralType entrezGeneral) {
        this.entrezGeneral = entrezGeneral;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NcbiMimeAsn1_entrezType)) return false;
        NcbiMimeAsn1_entrezType other = (NcbiMimeAsn1_entrezType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.entrezGeneral==null && other.getEntrezGeneral()==null) || 
             (this.entrezGeneral!=null &&
              this.entrezGeneral.equals(other.getEntrezGeneral())));
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
        if (getEntrezGeneral() != null) {
            _hashCode += getEntrezGeneral().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NcbiMimeAsn1_entrezType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Ncbi-mime-asn1_entrezType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entrezGeneral");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez-general"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez-generalType"));
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
