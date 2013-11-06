/**
 * BiostrucGraphPntrType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class BiostrucGraphPntrType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucGraphPntr_biostrucIdType biostrucGraphPntr_biostrucId;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucGraphPntr_residueGraphIdType biostrucGraphPntr_residueGraphId;

    public BiostrucGraphPntrType() {
    }

    public BiostrucGraphPntrType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucGraphPntr_biostrucIdType biostrucGraphPntr_biostrucId,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucGraphPntr_residueGraphIdType biostrucGraphPntr_residueGraphId) {
           this.biostrucGraphPntr_biostrucId = biostrucGraphPntr_biostrucId;
           this.biostrucGraphPntr_residueGraphId = biostrucGraphPntr_residueGraphId;
    }


    /**
     * Gets the biostrucGraphPntr_biostrucId value for this BiostrucGraphPntrType.
     * 
     * @return biostrucGraphPntr_biostrucId
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucGraphPntr_biostrucIdType getBiostrucGraphPntr_biostrucId() {
        return biostrucGraphPntr_biostrucId;
    }


    /**
     * Sets the biostrucGraphPntr_biostrucId value for this BiostrucGraphPntrType.
     * 
     * @param biostrucGraphPntr_biostrucId
     */
    public void setBiostrucGraphPntr_biostrucId(gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucGraphPntr_biostrucIdType biostrucGraphPntr_biostrucId) {
        this.biostrucGraphPntr_biostrucId = biostrucGraphPntr_biostrucId;
    }


    /**
     * Gets the biostrucGraphPntr_residueGraphId value for this BiostrucGraphPntrType.
     * 
     * @return biostrucGraphPntr_residueGraphId
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucGraphPntr_residueGraphIdType getBiostrucGraphPntr_residueGraphId() {
        return biostrucGraphPntr_residueGraphId;
    }


    /**
     * Sets the biostrucGraphPntr_residueGraphId value for this BiostrucGraphPntrType.
     * 
     * @param biostrucGraphPntr_residueGraphId
     */
    public void setBiostrucGraphPntr_residueGraphId(gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucGraphPntr_residueGraphIdType biostrucGraphPntr_residueGraphId) {
        this.biostrucGraphPntr_residueGraphId = biostrucGraphPntr_residueGraphId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BiostrucGraphPntrType)) return false;
        BiostrucGraphPntrType other = (BiostrucGraphPntrType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.biostrucGraphPntr_biostrucId==null && other.getBiostrucGraphPntr_biostrucId()==null) || 
             (this.biostrucGraphPntr_biostrucId!=null &&
              this.biostrucGraphPntr_biostrucId.equals(other.getBiostrucGraphPntr_biostrucId()))) &&
            ((this.biostrucGraphPntr_residueGraphId==null && other.getBiostrucGraphPntr_residueGraphId()==null) || 
             (this.biostrucGraphPntr_residueGraphId!=null &&
              this.biostrucGraphPntr_residueGraphId.equals(other.getBiostrucGraphPntr_residueGraphId())));
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
        if (getBiostrucGraphPntr_biostrucId() != null) {
            _hashCode += getBiostrucGraphPntr_biostrucId().hashCode();
        }
        if (getBiostrucGraphPntr_residueGraphId() != null) {
            _hashCode += getBiostrucGraphPntr_residueGraphId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BiostrucGraphPntrType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-graph-pntrType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("biostrucGraphPntr_biostrucId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-graph-pntr_biostruc-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-graph-pntr_biostruc-idType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("biostrucGraphPntr_residueGraphId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-graph-pntr_residue-graph-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-graph-pntr_residue-graph-idType"));
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
