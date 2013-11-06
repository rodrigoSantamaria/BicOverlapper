/**
 * Blast4GetSequencesRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Blast4GetSequencesRequestType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4GetSequencesRequest_databaseType blast4GetSequencesRequest_database;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4GetSequencesRequest_seqIdsType blast4GetSequencesRequest_seqIds;

    public Blast4GetSequencesRequestType() {
    }

    public Blast4GetSequencesRequestType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4GetSequencesRequest_databaseType blast4GetSequencesRequest_database,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4GetSequencesRequest_seqIdsType blast4GetSequencesRequest_seqIds) {
           this.blast4GetSequencesRequest_database = blast4GetSequencesRequest_database;
           this.blast4GetSequencesRequest_seqIds = blast4GetSequencesRequest_seqIds;
    }


    /**
     * Gets the blast4GetSequencesRequest_database value for this Blast4GetSequencesRequestType.
     * 
     * @return blast4GetSequencesRequest_database
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4GetSequencesRequest_databaseType getBlast4GetSequencesRequest_database() {
        return blast4GetSequencesRequest_database;
    }


    /**
     * Sets the blast4GetSequencesRequest_database value for this Blast4GetSequencesRequestType.
     * 
     * @param blast4GetSequencesRequest_database
     */
    public void setBlast4GetSequencesRequest_database(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4GetSequencesRequest_databaseType blast4GetSequencesRequest_database) {
        this.blast4GetSequencesRequest_database = blast4GetSequencesRequest_database;
    }


    /**
     * Gets the blast4GetSequencesRequest_seqIds value for this Blast4GetSequencesRequestType.
     * 
     * @return blast4GetSequencesRequest_seqIds
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4GetSequencesRequest_seqIdsType getBlast4GetSequencesRequest_seqIds() {
        return blast4GetSequencesRequest_seqIds;
    }


    /**
     * Sets the blast4GetSequencesRequest_seqIds value for this Blast4GetSequencesRequestType.
     * 
     * @param blast4GetSequencesRequest_seqIds
     */
    public void setBlast4GetSequencesRequest_seqIds(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4GetSequencesRequest_seqIdsType blast4GetSequencesRequest_seqIds) {
        this.blast4GetSequencesRequest_seqIds = blast4GetSequencesRequest_seqIds;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Blast4GetSequencesRequestType)) return false;
        Blast4GetSequencesRequestType other = (Blast4GetSequencesRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.blast4GetSequencesRequest_database==null && other.getBlast4GetSequencesRequest_database()==null) || 
             (this.blast4GetSequencesRequest_database!=null &&
              this.blast4GetSequencesRequest_database.equals(other.getBlast4GetSequencesRequest_database()))) &&
            ((this.blast4GetSequencesRequest_seqIds==null && other.getBlast4GetSequencesRequest_seqIds()==null) || 
             (this.blast4GetSequencesRequest_seqIds!=null &&
              this.blast4GetSequencesRequest_seqIds.equals(other.getBlast4GetSequencesRequest_seqIds())));
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
        if (getBlast4GetSequencesRequest_database() != null) {
            _hashCode += getBlast4GetSequencesRequest_database().hashCode();
        }
        if (getBlast4GetSequencesRequest_seqIds() != null) {
            _hashCode += getBlast4GetSequencesRequest_seqIds().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Blast4GetSequencesRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-get-sequences-requestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blast4GetSequencesRequest_database");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-get-sequences-request_database"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-get-sequences-request_databaseType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blast4GetSequencesRequest_seqIds");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-get-sequences-request_seq-ids"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-get-sequences-request_seq-idsType"));
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
