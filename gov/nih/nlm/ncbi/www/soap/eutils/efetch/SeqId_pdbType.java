/**
 * SeqId_pdbType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class SeqId_pdbType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PDBSeqIdType PDBSeqId;

    public SeqId_pdbType() {
    }

    public SeqId_pdbType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PDBSeqIdType PDBSeqId) {
           this.PDBSeqId = PDBSeqId;
    }


    /**
     * Gets the PDBSeqId value for this SeqId_pdbType.
     * 
     * @return PDBSeqId
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PDBSeqIdType getPDBSeqId() {
        return PDBSeqId;
    }


    /**
     * Sets the PDBSeqId value for this SeqId_pdbType.
     * 
     * @param PDBSeqId
     */
    public void setPDBSeqId(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PDBSeqIdType PDBSeqId) {
        this.PDBSeqId = PDBSeqId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SeqId_pdbType)) return false;
        SeqId_pdbType other = (SeqId_pdbType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.PDBSeqId==null && other.getPDBSeqId()==null) || 
             (this.PDBSeqId!=null &&
              this.PDBSeqId.equals(other.getPDBSeqId())));
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
        if (getPDBSeqId() != null) {
            _hashCode += getPDBSeqId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SeqId_pdbType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-id_pdbType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PDBSeqId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PDB-seq-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PDB-seq-idType"));
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
