/**
 * ID2RequestGetBlobIdType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ID2RequestGetBlobIdType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2RequestGetBlobId_seqIdType ID2RequestGetBlobId_seqId;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2RequestGetBlobId_sourcesType ID2RequestGetBlobId_sources;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2RequestGetBlobId_external ID2RequestGetBlobId_external;

    public ID2RequestGetBlobIdType() {
    }

    public ID2RequestGetBlobIdType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2RequestGetBlobId_seqIdType ID2RequestGetBlobId_seqId,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2RequestGetBlobId_sourcesType ID2RequestGetBlobId_sources,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2RequestGetBlobId_external ID2RequestGetBlobId_external) {
           this.ID2RequestGetBlobId_seqId = ID2RequestGetBlobId_seqId;
           this.ID2RequestGetBlobId_sources = ID2RequestGetBlobId_sources;
           this.ID2RequestGetBlobId_external = ID2RequestGetBlobId_external;
    }


    /**
     * Gets the ID2RequestGetBlobId_seqId value for this ID2RequestGetBlobIdType.
     * 
     * @return ID2RequestGetBlobId_seqId
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2RequestGetBlobId_seqIdType getID2RequestGetBlobId_seqId() {
        return ID2RequestGetBlobId_seqId;
    }


    /**
     * Sets the ID2RequestGetBlobId_seqId value for this ID2RequestGetBlobIdType.
     * 
     * @param ID2RequestGetBlobId_seqId
     */
    public void setID2RequestGetBlobId_seqId(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2RequestGetBlobId_seqIdType ID2RequestGetBlobId_seqId) {
        this.ID2RequestGetBlobId_seqId = ID2RequestGetBlobId_seqId;
    }


    /**
     * Gets the ID2RequestGetBlobId_sources value for this ID2RequestGetBlobIdType.
     * 
     * @return ID2RequestGetBlobId_sources
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2RequestGetBlobId_sourcesType getID2RequestGetBlobId_sources() {
        return ID2RequestGetBlobId_sources;
    }


    /**
     * Sets the ID2RequestGetBlobId_sources value for this ID2RequestGetBlobIdType.
     * 
     * @param ID2RequestGetBlobId_sources
     */
    public void setID2RequestGetBlobId_sources(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2RequestGetBlobId_sourcesType ID2RequestGetBlobId_sources) {
        this.ID2RequestGetBlobId_sources = ID2RequestGetBlobId_sources;
    }


    /**
     * Gets the ID2RequestGetBlobId_external value for this ID2RequestGetBlobIdType.
     * 
     * @return ID2RequestGetBlobId_external
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2RequestGetBlobId_external getID2RequestGetBlobId_external() {
        return ID2RequestGetBlobId_external;
    }


    /**
     * Sets the ID2RequestGetBlobId_external value for this ID2RequestGetBlobIdType.
     * 
     * @param ID2RequestGetBlobId_external
     */
    public void setID2RequestGetBlobId_external(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2RequestGetBlobId_external ID2RequestGetBlobId_external) {
        this.ID2RequestGetBlobId_external = ID2RequestGetBlobId_external;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ID2RequestGetBlobIdType)) return false;
        ID2RequestGetBlobIdType other = (ID2RequestGetBlobIdType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ID2RequestGetBlobId_seqId==null && other.getID2RequestGetBlobId_seqId()==null) || 
             (this.ID2RequestGetBlobId_seqId!=null &&
              this.ID2RequestGetBlobId_seqId.equals(other.getID2RequestGetBlobId_seqId()))) &&
            ((this.ID2RequestGetBlobId_sources==null && other.getID2RequestGetBlobId_sources()==null) || 
             (this.ID2RequestGetBlobId_sources!=null &&
              this.ID2RequestGetBlobId_sources.equals(other.getID2RequestGetBlobId_sources()))) &&
            ((this.ID2RequestGetBlobId_external==null && other.getID2RequestGetBlobId_external()==null) || 
             (this.ID2RequestGetBlobId_external!=null &&
              this.ID2RequestGetBlobId_external.equals(other.getID2RequestGetBlobId_external())));
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
        if (getID2RequestGetBlobId_seqId() != null) {
            _hashCode += getID2RequestGetBlobId_seqId().hashCode();
        }
        if (getID2RequestGetBlobId_sources() != null) {
            _hashCode += getID2RequestGetBlobId_sources().hashCode();
        }
        if (getID2RequestGetBlobId_external() != null) {
            _hashCode += getID2RequestGetBlobId_external().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ID2RequestGetBlobIdType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Request-Get-Blob-IdType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2RequestGetBlobId_seqId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Request-Get-Blob-Id_seq-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Request-Get-Blob-Id_seq-idType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2RequestGetBlobId_sources");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Request-Get-Blob-Id_sources"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Request-Get-Blob-Id_sourcesType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2RequestGetBlobId_external");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Request-Get-Blob-Id_external"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">ID2-Request-Get-Blob-Id_external"));
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
