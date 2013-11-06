/**
 * BiostrucDescr_historyType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class BiostrucDescr_historyType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucHistoryType biostrucHistory;

    public BiostrucDescr_historyType() {
    }

    public BiostrucDescr_historyType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucHistoryType biostrucHistory) {
           this.biostrucHistory = biostrucHistory;
    }


    /**
     * Gets the biostrucHistory value for this BiostrucDescr_historyType.
     * 
     * @return biostrucHistory
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucHistoryType getBiostrucHistory() {
        return biostrucHistory;
    }


    /**
     * Sets the biostrucHistory value for this BiostrucDescr_historyType.
     * 
     * @param biostrucHistory
     */
    public void setBiostrucHistory(gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucHistoryType biostrucHistory) {
        this.biostrucHistory = biostrucHistory;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BiostrucDescr_historyType)) return false;
        BiostrucDescr_historyType other = (BiostrucDescr_historyType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.biostrucHistory==null && other.getBiostrucHistory()==null) || 
             (this.biostrucHistory!=null &&
              this.biostrucHistory.equals(other.getBiostrucHistory())));
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
        if (getBiostrucHistory() != null) {
            _hashCode += getBiostrucHistory().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BiostrucDescr_historyType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-descr_historyType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("biostrucHistory");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-history"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-historyType"));
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
