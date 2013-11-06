/**
 * BiostrucHistoryType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class BiostrucHistoryType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucHistory_replacesType biostrucHistory_replaces;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucHistory_replacedByType biostrucHistory_replacedBy;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucHistory_dataSourceType biostrucHistory_dataSource;

    public BiostrucHistoryType() {
    }

    public BiostrucHistoryType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucHistory_replacesType biostrucHistory_replaces,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucHistory_replacedByType biostrucHistory_replacedBy,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucHistory_dataSourceType biostrucHistory_dataSource) {
           this.biostrucHistory_replaces = biostrucHistory_replaces;
           this.biostrucHistory_replacedBy = biostrucHistory_replacedBy;
           this.biostrucHistory_dataSource = biostrucHistory_dataSource;
    }


    /**
     * Gets the biostrucHistory_replaces value for this BiostrucHistoryType.
     * 
     * @return biostrucHistory_replaces
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucHistory_replacesType getBiostrucHistory_replaces() {
        return biostrucHistory_replaces;
    }


    /**
     * Sets the biostrucHistory_replaces value for this BiostrucHistoryType.
     * 
     * @param biostrucHistory_replaces
     */
    public void setBiostrucHistory_replaces(gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucHistory_replacesType biostrucHistory_replaces) {
        this.biostrucHistory_replaces = biostrucHistory_replaces;
    }


    /**
     * Gets the biostrucHistory_replacedBy value for this BiostrucHistoryType.
     * 
     * @return biostrucHistory_replacedBy
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucHistory_replacedByType getBiostrucHistory_replacedBy() {
        return biostrucHistory_replacedBy;
    }


    /**
     * Sets the biostrucHistory_replacedBy value for this BiostrucHistoryType.
     * 
     * @param biostrucHistory_replacedBy
     */
    public void setBiostrucHistory_replacedBy(gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucHistory_replacedByType biostrucHistory_replacedBy) {
        this.biostrucHistory_replacedBy = biostrucHistory_replacedBy;
    }


    /**
     * Gets the biostrucHistory_dataSource value for this BiostrucHistoryType.
     * 
     * @return biostrucHistory_dataSource
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucHistory_dataSourceType getBiostrucHistory_dataSource() {
        return biostrucHistory_dataSource;
    }


    /**
     * Sets the biostrucHistory_dataSource value for this BiostrucHistoryType.
     * 
     * @param biostrucHistory_dataSource
     */
    public void setBiostrucHistory_dataSource(gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucHistory_dataSourceType biostrucHistory_dataSource) {
        this.biostrucHistory_dataSource = biostrucHistory_dataSource;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BiostrucHistoryType)) return false;
        BiostrucHistoryType other = (BiostrucHistoryType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.biostrucHistory_replaces==null && other.getBiostrucHistory_replaces()==null) || 
             (this.biostrucHistory_replaces!=null &&
              this.biostrucHistory_replaces.equals(other.getBiostrucHistory_replaces()))) &&
            ((this.biostrucHistory_replacedBy==null && other.getBiostrucHistory_replacedBy()==null) || 
             (this.biostrucHistory_replacedBy!=null &&
              this.biostrucHistory_replacedBy.equals(other.getBiostrucHistory_replacedBy()))) &&
            ((this.biostrucHistory_dataSource==null && other.getBiostrucHistory_dataSource()==null) || 
             (this.biostrucHistory_dataSource!=null &&
              this.biostrucHistory_dataSource.equals(other.getBiostrucHistory_dataSource())));
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
        if (getBiostrucHistory_replaces() != null) {
            _hashCode += getBiostrucHistory_replaces().hashCode();
        }
        if (getBiostrucHistory_replacedBy() != null) {
            _hashCode += getBiostrucHistory_replacedBy().hashCode();
        }
        if (getBiostrucHistory_dataSource() != null) {
            _hashCode += getBiostrucHistory_dataSource().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BiostrucHistoryType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-historyType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("biostrucHistory_replaces");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-history_replaces"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-history_replacesType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("biostrucHistory_replacedBy");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-history_replaced-by"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-history_replaced-byType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("biostrucHistory_dataSource");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-history_data-source"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-history_data-sourceType"));
        elemField.setMinOccurs(0);
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
