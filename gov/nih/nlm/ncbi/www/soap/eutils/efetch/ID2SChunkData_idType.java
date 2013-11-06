/**
 * ID2SChunkData_idType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ID2SChunkData_idType  implements java.io.Serializable {
    private java.lang.String ID2SChunkData_id_bioseqSet;

    private java.lang.String ID2SChunkData_id_gi;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SChunkData_id_seqIdType ID2SChunkData_id_seqId;

    public ID2SChunkData_idType() {
    }

    public ID2SChunkData_idType(
           java.lang.String ID2SChunkData_id_bioseqSet,
           java.lang.String ID2SChunkData_id_gi,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SChunkData_id_seqIdType ID2SChunkData_id_seqId) {
           this.ID2SChunkData_id_bioseqSet = ID2SChunkData_id_bioseqSet;
           this.ID2SChunkData_id_gi = ID2SChunkData_id_gi;
           this.ID2SChunkData_id_seqId = ID2SChunkData_id_seqId;
    }


    /**
     * Gets the ID2SChunkData_id_bioseqSet value for this ID2SChunkData_idType.
     * 
     * @return ID2SChunkData_id_bioseqSet
     */
    public java.lang.String getID2SChunkData_id_bioseqSet() {
        return ID2SChunkData_id_bioseqSet;
    }


    /**
     * Sets the ID2SChunkData_id_bioseqSet value for this ID2SChunkData_idType.
     * 
     * @param ID2SChunkData_id_bioseqSet
     */
    public void setID2SChunkData_id_bioseqSet(java.lang.String ID2SChunkData_id_bioseqSet) {
        this.ID2SChunkData_id_bioseqSet = ID2SChunkData_id_bioseqSet;
    }


    /**
     * Gets the ID2SChunkData_id_gi value for this ID2SChunkData_idType.
     * 
     * @return ID2SChunkData_id_gi
     */
    public java.lang.String getID2SChunkData_id_gi() {
        return ID2SChunkData_id_gi;
    }


    /**
     * Sets the ID2SChunkData_id_gi value for this ID2SChunkData_idType.
     * 
     * @param ID2SChunkData_id_gi
     */
    public void setID2SChunkData_id_gi(java.lang.String ID2SChunkData_id_gi) {
        this.ID2SChunkData_id_gi = ID2SChunkData_id_gi;
    }


    /**
     * Gets the ID2SChunkData_id_seqId value for this ID2SChunkData_idType.
     * 
     * @return ID2SChunkData_id_seqId
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SChunkData_id_seqIdType getID2SChunkData_id_seqId() {
        return ID2SChunkData_id_seqId;
    }


    /**
     * Sets the ID2SChunkData_id_seqId value for this ID2SChunkData_idType.
     * 
     * @param ID2SChunkData_id_seqId
     */
    public void setID2SChunkData_id_seqId(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SChunkData_id_seqIdType ID2SChunkData_id_seqId) {
        this.ID2SChunkData_id_seqId = ID2SChunkData_id_seqId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ID2SChunkData_idType)) return false;
        ID2SChunkData_idType other = (ID2SChunkData_idType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ID2SChunkData_id_bioseqSet==null && other.getID2SChunkData_id_bioseqSet()==null) || 
             (this.ID2SChunkData_id_bioseqSet!=null &&
              this.ID2SChunkData_id_bioseqSet.equals(other.getID2SChunkData_id_bioseqSet()))) &&
            ((this.ID2SChunkData_id_gi==null && other.getID2SChunkData_id_gi()==null) || 
             (this.ID2SChunkData_id_gi!=null &&
              this.ID2SChunkData_id_gi.equals(other.getID2SChunkData_id_gi()))) &&
            ((this.ID2SChunkData_id_seqId==null && other.getID2SChunkData_id_seqId()==null) || 
             (this.ID2SChunkData_id_seqId!=null &&
              this.ID2SChunkData_id_seqId.equals(other.getID2SChunkData_id_seqId())));
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
        if (getID2SChunkData_id_bioseqSet() != null) {
            _hashCode += getID2SChunkData_id_bioseqSet().hashCode();
        }
        if (getID2SChunkData_id_gi() != null) {
            _hashCode += getID2SChunkData_id_gi().hashCode();
        }
        if (getID2SChunkData_id_seqId() != null) {
            _hashCode += getID2SChunkData_id_seqId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ID2SChunkData_idType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Chunk-Data_idType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2SChunkData_id_bioseqSet");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Chunk-Data_id_bioseq-set"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2SChunkData_id_gi");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Chunk-Data_id_gi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2SChunkData_id_seqId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Chunk-Data_id_seq-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Chunk-Data_id_seq-idType"));
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
