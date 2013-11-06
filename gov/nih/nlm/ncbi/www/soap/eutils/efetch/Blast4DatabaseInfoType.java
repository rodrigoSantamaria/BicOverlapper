/**
 * Blast4DatabaseInfoType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Blast4DatabaseInfoType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4DatabaseInfo_databaseType blast4DatabaseInfo_database;

    private java.lang.String blast4DatabaseInfo_description;

    private java.lang.String blast4DatabaseInfo_lastUpdated;

    private java.lang.String blast4DatabaseInfo_totalLength;

    private java.lang.String blast4DatabaseInfo_numSequences;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4DatabaseInfo_seqtechType blast4DatabaseInfo_seqtech;

    private java.lang.String blast4DatabaseInfo_taxid;

    public Blast4DatabaseInfoType() {
    }

    public Blast4DatabaseInfoType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4DatabaseInfo_databaseType blast4DatabaseInfo_database,
           java.lang.String blast4DatabaseInfo_description,
           java.lang.String blast4DatabaseInfo_lastUpdated,
           java.lang.String blast4DatabaseInfo_totalLength,
           java.lang.String blast4DatabaseInfo_numSequences,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4DatabaseInfo_seqtechType blast4DatabaseInfo_seqtech,
           java.lang.String blast4DatabaseInfo_taxid) {
           this.blast4DatabaseInfo_database = blast4DatabaseInfo_database;
           this.blast4DatabaseInfo_description = blast4DatabaseInfo_description;
           this.blast4DatabaseInfo_lastUpdated = blast4DatabaseInfo_lastUpdated;
           this.blast4DatabaseInfo_totalLength = blast4DatabaseInfo_totalLength;
           this.blast4DatabaseInfo_numSequences = blast4DatabaseInfo_numSequences;
           this.blast4DatabaseInfo_seqtech = blast4DatabaseInfo_seqtech;
           this.blast4DatabaseInfo_taxid = blast4DatabaseInfo_taxid;
    }


    /**
     * Gets the blast4DatabaseInfo_database value for this Blast4DatabaseInfoType.
     * 
     * @return blast4DatabaseInfo_database
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4DatabaseInfo_databaseType getBlast4DatabaseInfo_database() {
        return blast4DatabaseInfo_database;
    }


    /**
     * Sets the blast4DatabaseInfo_database value for this Blast4DatabaseInfoType.
     * 
     * @param blast4DatabaseInfo_database
     */
    public void setBlast4DatabaseInfo_database(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4DatabaseInfo_databaseType blast4DatabaseInfo_database) {
        this.blast4DatabaseInfo_database = blast4DatabaseInfo_database;
    }


    /**
     * Gets the blast4DatabaseInfo_description value for this Blast4DatabaseInfoType.
     * 
     * @return blast4DatabaseInfo_description
     */
    public java.lang.String getBlast4DatabaseInfo_description() {
        return blast4DatabaseInfo_description;
    }


    /**
     * Sets the blast4DatabaseInfo_description value for this Blast4DatabaseInfoType.
     * 
     * @param blast4DatabaseInfo_description
     */
    public void setBlast4DatabaseInfo_description(java.lang.String blast4DatabaseInfo_description) {
        this.blast4DatabaseInfo_description = blast4DatabaseInfo_description;
    }


    /**
     * Gets the blast4DatabaseInfo_lastUpdated value for this Blast4DatabaseInfoType.
     * 
     * @return blast4DatabaseInfo_lastUpdated
     */
    public java.lang.String getBlast4DatabaseInfo_lastUpdated() {
        return blast4DatabaseInfo_lastUpdated;
    }


    /**
     * Sets the blast4DatabaseInfo_lastUpdated value for this Blast4DatabaseInfoType.
     * 
     * @param blast4DatabaseInfo_lastUpdated
     */
    public void setBlast4DatabaseInfo_lastUpdated(java.lang.String blast4DatabaseInfo_lastUpdated) {
        this.blast4DatabaseInfo_lastUpdated = blast4DatabaseInfo_lastUpdated;
    }


    /**
     * Gets the blast4DatabaseInfo_totalLength value for this Blast4DatabaseInfoType.
     * 
     * @return blast4DatabaseInfo_totalLength
     */
    public java.lang.String getBlast4DatabaseInfo_totalLength() {
        return blast4DatabaseInfo_totalLength;
    }


    /**
     * Sets the blast4DatabaseInfo_totalLength value for this Blast4DatabaseInfoType.
     * 
     * @param blast4DatabaseInfo_totalLength
     */
    public void setBlast4DatabaseInfo_totalLength(java.lang.String blast4DatabaseInfo_totalLength) {
        this.blast4DatabaseInfo_totalLength = blast4DatabaseInfo_totalLength;
    }


    /**
     * Gets the blast4DatabaseInfo_numSequences value for this Blast4DatabaseInfoType.
     * 
     * @return blast4DatabaseInfo_numSequences
     */
    public java.lang.String getBlast4DatabaseInfo_numSequences() {
        return blast4DatabaseInfo_numSequences;
    }


    /**
     * Sets the blast4DatabaseInfo_numSequences value for this Blast4DatabaseInfoType.
     * 
     * @param blast4DatabaseInfo_numSequences
     */
    public void setBlast4DatabaseInfo_numSequences(java.lang.String blast4DatabaseInfo_numSequences) {
        this.blast4DatabaseInfo_numSequences = blast4DatabaseInfo_numSequences;
    }


    /**
     * Gets the blast4DatabaseInfo_seqtech value for this Blast4DatabaseInfoType.
     * 
     * @return blast4DatabaseInfo_seqtech
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4DatabaseInfo_seqtechType getBlast4DatabaseInfo_seqtech() {
        return blast4DatabaseInfo_seqtech;
    }


    /**
     * Sets the blast4DatabaseInfo_seqtech value for this Blast4DatabaseInfoType.
     * 
     * @param blast4DatabaseInfo_seqtech
     */
    public void setBlast4DatabaseInfo_seqtech(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4DatabaseInfo_seqtechType blast4DatabaseInfo_seqtech) {
        this.blast4DatabaseInfo_seqtech = blast4DatabaseInfo_seqtech;
    }


    /**
     * Gets the blast4DatabaseInfo_taxid value for this Blast4DatabaseInfoType.
     * 
     * @return blast4DatabaseInfo_taxid
     */
    public java.lang.String getBlast4DatabaseInfo_taxid() {
        return blast4DatabaseInfo_taxid;
    }


    /**
     * Sets the blast4DatabaseInfo_taxid value for this Blast4DatabaseInfoType.
     * 
     * @param blast4DatabaseInfo_taxid
     */
    public void setBlast4DatabaseInfo_taxid(java.lang.String blast4DatabaseInfo_taxid) {
        this.blast4DatabaseInfo_taxid = blast4DatabaseInfo_taxid;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Blast4DatabaseInfoType)) return false;
        Blast4DatabaseInfoType other = (Blast4DatabaseInfoType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.blast4DatabaseInfo_database==null && other.getBlast4DatabaseInfo_database()==null) || 
             (this.blast4DatabaseInfo_database!=null &&
              this.blast4DatabaseInfo_database.equals(other.getBlast4DatabaseInfo_database()))) &&
            ((this.blast4DatabaseInfo_description==null && other.getBlast4DatabaseInfo_description()==null) || 
             (this.blast4DatabaseInfo_description!=null &&
              this.blast4DatabaseInfo_description.equals(other.getBlast4DatabaseInfo_description()))) &&
            ((this.blast4DatabaseInfo_lastUpdated==null && other.getBlast4DatabaseInfo_lastUpdated()==null) || 
             (this.blast4DatabaseInfo_lastUpdated!=null &&
              this.blast4DatabaseInfo_lastUpdated.equals(other.getBlast4DatabaseInfo_lastUpdated()))) &&
            ((this.blast4DatabaseInfo_totalLength==null && other.getBlast4DatabaseInfo_totalLength()==null) || 
             (this.blast4DatabaseInfo_totalLength!=null &&
              this.blast4DatabaseInfo_totalLength.equals(other.getBlast4DatabaseInfo_totalLength()))) &&
            ((this.blast4DatabaseInfo_numSequences==null && other.getBlast4DatabaseInfo_numSequences()==null) || 
             (this.blast4DatabaseInfo_numSequences!=null &&
              this.blast4DatabaseInfo_numSequences.equals(other.getBlast4DatabaseInfo_numSequences()))) &&
            ((this.blast4DatabaseInfo_seqtech==null && other.getBlast4DatabaseInfo_seqtech()==null) || 
             (this.blast4DatabaseInfo_seqtech!=null &&
              this.blast4DatabaseInfo_seqtech.equals(other.getBlast4DatabaseInfo_seqtech()))) &&
            ((this.blast4DatabaseInfo_taxid==null && other.getBlast4DatabaseInfo_taxid()==null) || 
             (this.blast4DatabaseInfo_taxid!=null &&
              this.blast4DatabaseInfo_taxid.equals(other.getBlast4DatabaseInfo_taxid())));
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
        if (getBlast4DatabaseInfo_database() != null) {
            _hashCode += getBlast4DatabaseInfo_database().hashCode();
        }
        if (getBlast4DatabaseInfo_description() != null) {
            _hashCode += getBlast4DatabaseInfo_description().hashCode();
        }
        if (getBlast4DatabaseInfo_lastUpdated() != null) {
            _hashCode += getBlast4DatabaseInfo_lastUpdated().hashCode();
        }
        if (getBlast4DatabaseInfo_totalLength() != null) {
            _hashCode += getBlast4DatabaseInfo_totalLength().hashCode();
        }
        if (getBlast4DatabaseInfo_numSequences() != null) {
            _hashCode += getBlast4DatabaseInfo_numSequences().hashCode();
        }
        if (getBlast4DatabaseInfo_seqtech() != null) {
            _hashCode += getBlast4DatabaseInfo_seqtech().hashCode();
        }
        if (getBlast4DatabaseInfo_taxid() != null) {
            _hashCode += getBlast4DatabaseInfo_taxid().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Blast4DatabaseInfoType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-database-infoType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blast4DatabaseInfo_database");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-database-info_database"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-database-info_databaseType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blast4DatabaseInfo_description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-database-info_description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blast4DatabaseInfo_lastUpdated");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-database-info_last-updated"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blast4DatabaseInfo_totalLength");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-database-info_total-length"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blast4DatabaseInfo_numSequences");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-database-info_num-sequences"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blast4DatabaseInfo_seqtech");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-database-info_seqtech"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-database-info_seqtechType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blast4DatabaseInfo_taxid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-database-info_taxid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
