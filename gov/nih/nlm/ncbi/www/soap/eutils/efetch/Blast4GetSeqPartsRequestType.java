/**
 * Blast4GetSeqPartsRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Blast4GetSeqPartsRequestType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4GetSeqPartsRequest_databaseType blast4GetSeqPartsRequest_database;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4GetSeqPartsRequest_idType blast4GetSeqPartsRequest_id;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4GetSeqPartsRequest_needMetaDataType blast4GetSeqPartsRequest_needMetaData;

    private java.lang.String blast4GetSeqPartsRequest_start;

    private java.lang.String blast4GetSeqPartsRequest_end;

    public Blast4GetSeqPartsRequestType() {
    }

    public Blast4GetSeqPartsRequestType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4GetSeqPartsRequest_databaseType blast4GetSeqPartsRequest_database,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4GetSeqPartsRequest_idType blast4GetSeqPartsRequest_id,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4GetSeqPartsRequest_needMetaDataType blast4GetSeqPartsRequest_needMetaData,
           java.lang.String blast4GetSeqPartsRequest_start,
           java.lang.String blast4GetSeqPartsRequest_end) {
           this.blast4GetSeqPartsRequest_database = blast4GetSeqPartsRequest_database;
           this.blast4GetSeqPartsRequest_id = blast4GetSeqPartsRequest_id;
           this.blast4GetSeqPartsRequest_needMetaData = blast4GetSeqPartsRequest_needMetaData;
           this.blast4GetSeqPartsRequest_start = blast4GetSeqPartsRequest_start;
           this.blast4GetSeqPartsRequest_end = blast4GetSeqPartsRequest_end;
    }


    /**
     * Gets the blast4GetSeqPartsRequest_database value for this Blast4GetSeqPartsRequestType.
     * 
     * @return blast4GetSeqPartsRequest_database
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4GetSeqPartsRequest_databaseType getBlast4GetSeqPartsRequest_database() {
        return blast4GetSeqPartsRequest_database;
    }


    /**
     * Sets the blast4GetSeqPartsRequest_database value for this Blast4GetSeqPartsRequestType.
     * 
     * @param blast4GetSeqPartsRequest_database
     */
    public void setBlast4GetSeqPartsRequest_database(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4GetSeqPartsRequest_databaseType blast4GetSeqPartsRequest_database) {
        this.blast4GetSeqPartsRequest_database = blast4GetSeqPartsRequest_database;
    }


    /**
     * Gets the blast4GetSeqPartsRequest_id value for this Blast4GetSeqPartsRequestType.
     * 
     * @return blast4GetSeqPartsRequest_id
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4GetSeqPartsRequest_idType getBlast4GetSeqPartsRequest_id() {
        return blast4GetSeqPartsRequest_id;
    }


    /**
     * Sets the blast4GetSeqPartsRequest_id value for this Blast4GetSeqPartsRequestType.
     * 
     * @param blast4GetSeqPartsRequest_id
     */
    public void setBlast4GetSeqPartsRequest_id(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4GetSeqPartsRequest_idType blast4GetSeqPartsRequest_id) {
        this.blast4GetSeqPartsRequest_id = blast4GetSeqPartsRequest_id;
    }


    /**
     * Gets the blast4GetSeqPartsRequest_needMetaData value for this Blast4GetSeqPartsRequestType.
     * 
     * @return blast4GetSeqPartsRequest_needMetaData
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4GetSeqPartsRequest_needMetaDataType getBlast4GetSeqPartsRequest_needMetaData() {
        return blast4GetSeqPartsRequest_needMetaData;
    }


    /**
     * Sets the blast4GetSeqPartsRequest_needMetaData value for this Blast4GetSeqPartsRequestType.
     * 
     * @param blast4GetSeqPartsRequest_needMetaData
     */
    public void setBlast4GetSeqPartsRequest_needMetaData(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4GetSeqPartsRequest_needMetaDataType blast4GetSeqPartsRequest_needMetaData) {
        this.blast4GetSeqPartsRequest_needMetaData = blast4GetSeqPartsRequest_needMetaData;
    }


    /**
     * Gets the blast4GetSeqPartsRequest_start value for this Blast4GetSeqPartsRequestType.
     * 
     * @return blast4GetSeqPartsRequest_start
     */
    public java.lang.String getBlast4GetSeqPartsRequest_start() {
        return blast4GetSeqPartsRequest_start;
    }


    /**
     * Sets the blast4GetSeqPartsRequest_start value for this Blast4GetSeqPartsRequestType.
     * 
     * @param blast4GetSeqPartsRequest_start
     */
    public void setBlast4GetSeqPartsRequest_start(java.lang.String blast4GetSeqPartsRequest_start) {
        this.blast4GetSeqPartsRequest_start = blast4GetSeqPartsRequest_start;
    }


    /**
     * Gets the blast4GetSeqPartsRequest_end value for this Blast4GetSeqPartsRequestType.
     * 
     * @return blast4GetSeqPartsRequest_end
     */
    public java.lang.String getBlast4GetSeqPartsRequest_end() {
        return blast4GetSeqPartsRequest_end;
    }


    /**
     * Sets the blast4GetSeqPartsRequest_end value for this Blast4GetSeqPartsRequestType.
     * 
     * @param blast4GetSeqPartsRequest_end
     */
    public void setBlast4GetSeqPartsRequest_end(java.lang.String blast4GetSeqPartsRequest_end) {
        this.blast4GetSeqPartsRequest_end = blast4GetSeqPartsRequest_end;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Blast4GetSeqPartsRequestType)) return false;
        Blast4GetSeqPartsRequestType other = (Blast4GetSeqPartsRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.blast4GetSeqPartsRequest_database==null && other.getBlast4GetSeqPartsRequest_database()==null) || 
             (this.blast4GetSeqPartsRequest_database!=null &&
              this.blast4GetSeqPartsRequest_database.equals(other.getBlast4GetSeqPartsRequest_database()))) &&
            ((this.blast4GetSeqPartsRequest_id==null && other.getBlast4GetSeqPartsRequest_id()==null) || 
             (this.blast4GetSeqPartsRequest_id!=null &&
              this.blast4GetSeqPartsRequest_id.equals(other.getBlast4GetSeqPartsRequest_id()))) &&
            ((this.blast4GetSeqPartsRequest_needMetaData==null && other.getBlast4GetSeqPartsRequest_needMetaData()==null) || 
             (this.blast4GetSeqPartsRequest_needMetaData!=null &&
              this.blast4GetSeqPartsRequest_needMetaData.equals(other.getBlast4GetSeqPartsRequest_needMetaData()))) &&
            ((this.blast4GetSeqPartsRequest_start==null && other.getBlast4GetSeqPartsRequest_start()==null) || 
             (this.blast4GetSeqPartsRequest_start!=null &&
              this.blast4GetSeqPartsRequest_start.equals(other.getBlast4GetSeqPartsRequest_start()))) &&
            ((this.blast4GetSeqPartsRequest_end==null && other.getBlast4GetSeqPartsRequest_end()==null) || 
             (this.blast4GetSeqPartsRequest_end!=null &&
              this.blast4GetSeqPartsRequest_end.equals(other.getBlast4GetSeqPartsRequest_end())));
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
        if (getBlast4GetSeqPartsRequest_database() != null) {
            _hashCode += getBlast4GetSeqPartsRequest_database().hashCode();
        }
        if (getBlast4GetSeqPartsRequest_id() != null) {
            _hashCode += getBlast4GetSeqPartsRequest_id().hashCode();
        }
        if (getBlast4GetSeqPartsRequest_needMetaData() != null) {
            _hashCode += getBlast4GetSeqPartsRequest_needMetaData().hashCode();
        }
        if (getBlast4GetSeqPartsRequest_start() != null) {
            _hashCode += getBlast4GetSeqPartsRequest_start().hashCode();
        }
        if (getBlast4GetSeqPartsRequest_end() != null) {
            _hashCode += getBlast4GetSeqPartsRequest_end().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Blast4GetSeqPartsRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-get-seq-parts-requestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blast4GetSeqPartsRequest_database");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-get-seq-parts-request_database"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-get-seq-parts-request_databaseType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blast4GetSeqPartsRequest_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-get-seq-parts-request_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-get-seq-parts-request_idType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blast4GetSeqPartsRequest_needMetaData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-get-seq-parts-request_need-meta-data"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-get-seq-parts-request_need-meta-dataType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blast4GetSeqPartsRequest_start");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-get-seq-parts-request_start"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blast4GetSeqPartsRequest_end");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-get-seq-parts-request_end"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
