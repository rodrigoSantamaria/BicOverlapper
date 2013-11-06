/**
 * PssmType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class PssmType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Pssm_isProteinType pssm_isProtein;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Pssm_identifierType pssm_identifier;

    private java.lang.String pssm_numRows;

    private java.lang.String pssm_numColumns;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Pssm_rowLabelsType pssm_rowLabels;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Pssm_byRowType pssm_byRow;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Pssm_queryType pssm_query;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Pssm_intermediateDataType pssm_intermediateData;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Pssm_finalDataType pssm_finalData;

    public PssmType() {
    }

    public PssmType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Pssm_isProteinType pssm_isProtein,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Pssm_identifierType pssm_identifier,
           java.lang.String pssm_numRows,
           java.lang.String pssm_numColumns,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Pssm_rowLabelsType pssm_rowLabels,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Pssm_byRowType pssm_byRow,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Pssm_queryType pssm_query,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Pssm_intermediateDataType pssm_intermediateData,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Pssm_finalDataType pssm_finalData) {
           this.pssm_isProtein = pssm_isProtein;
           this.pssm_identifier = pssm_identifier;
           this.pssm_numRows = pssm_numRows;
           this.pssm_numColumns = pssm_numColumns;
           this.pssm_rowLabels = pssm_rowLabels;
           this.pssm_byRow = pssm_byRow;
           this.pssm_query = pssm_query;
           this.pssm_intermediateData = pssm_intermediateData;
           this.pssm_finalData = pssm_finalData;
    }


    /**
     * Gets the pssm_isProtein value for this PssmType.
     * 
     * @return pssm_isProtein
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Pssm_isProteinType getPssm_isProtein() {
        return pssm_isProtein;
    }


    /**
     * Sets the pssm_isProtein value for this PssmType.
     * 
     * @param pssm_isProtein
     */
    public void setPssm_isProtein(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Pssm_isProteinType pssm_isProtein) {
        this.pssm_isProtein = pssm_isProtein;
    }


    /**
     * Gets the pssm_identifier value for this PssmType.
     * 
     * @return pssm_identifier
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Pssm_identifierType getPssm_identifier() {
        return pssm_identifier;
    }


    /**
     * Sets the pssm_identifier value for this PssmType.
     * 
     * @param pssm_identifier
     */
    public void setPssm_identifier(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Pssm_identifierType pssm_identifier) {
        this.pssm_identifier = pssm_identifier;
    }


    /**
     * Gets the pssm_numRows value for this PssmType.
     * 
     * @return pssm_numRows
     */
    public java.lang.String getPssm_numRows() {
        return pssm_numRows;
    }


    /**
     * Sets the pssm_numRows value for this PssmType.
     * 
     * @param pssm_numRows
     */
    public void setPssm_numRows(java.lang.String pssm_numRows) {
        this.pssm_numRows = pssm_numRows;
    }


    /**
     * Gets the pssm_numColumns value for this PssmType.
     * 
     * @return pssm_numColumns
     */
    public java.lang.String getPssm_numColumns() {
        return pssm_numColumns;
    }


    /**
     * Sets the pssm_numColumns value for this PssmType.
     * 
     * @param pssm_numColumns
     */
    public void setPssm_numColumns(java.lang.String pssm_numColumns) {
        this.pssm_numColumns = pssm_numColumns;
    }


    /**
     * Gets the pssm_rowLabels value for this PssmType.
     * 
     * @return pssm_rowLabels
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Pssm_rowLabelsType getPssm_rowLabels() {
        return pssm_rowLabels;
    }


    /**
     * Sets the pssm_rowLabels value for this PssmType.
     * 
     * @param pssm_rowLabels
     */
    public void setPssm_rowLabels(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Pssm_rowLabelsType pssm_rowLabels) {
        this.pssm_rowLabels = pssm_rowLabels;
    }


    /**
     * Gets the pssm_byRow value for this PssmType.
     * 
     * @return pssm_byRow
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Pssm_byRowType getPssm_byRow() {
        return pssm_byRow;
    }


    /**
     * Sets the pssm_byRow value for this PssmType.
     * 
     * @param pssm_byRow
     */
    public void setPssm_byRow(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Pssm_byRowType pssm_byRow) {
        this.pssm_byRow = pssm_byRow;
    }


    /**
     * Gets the pssm_query value for this PssmType.
     * 
     * @return pssm_query
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Pssm_queryType getPssm_query() {
        return pssm_query;
    }


    /**
     * Sets the pssm_query value for this PssmType.
     * 
     * @param pssm_query
     */
    public void setPssm_query(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Pssm_queryType pssm_query) {
        this.pssm_query = pssm_query;
    }


    /**
     * Gets the pssm_intermediateData value for this PssmType.
     * 
     * @return pssm_intermediateData
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Pssm_intermediateDataType getPssm_intermediateData() {
        return pssm_intermediateData;
    }


    /**
     * Sets the pssm_intermediateData value for this PssmType.
     * 
     * @param pssm_intermediateData
     */
    public void setPssm_intermediateData(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Pssm_intermediateDataType pssm_intermediateData) {
        this.pssm_intermediateData = pssm_intermediateData;
    }


    /**
     * Gets the pssm_finalData value for this PssmType.
     * 
     * @return pssm_finalData
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Pssm_finalDataType getPssm_finalData() {
        return pssm_finalData;
    }


    /**
     * Sets the pssm_finalData value for this PssmType.
     * 
     * @param pssm_finalData
     */
    public void setPssm_finalData(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Pssm_finalDataType pssm_finalData) {
        this.pssm_finalData = pssm_finalData;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PssmType)) return false;
        PssmType other = (PssmType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.pssm_isProtein==null && other.getPssm_isProtein()==null) || 
             (this.pssm_isProtein!=null &&
              this.pssm_isProtein.equals(other.getPssm_isProtein()))) &&
            ((this.pssm_identifier==null && other.getPssm_identifier()==null) || 
             (this.pssm_identifier!=null &&
              this.pssm_identifier.equals(other.getPssm_identifier()))) &&
            ((this.pssm_numRows==null && other.getPssm_numRows()==null) || 
             (this.pssm_numRows!=null &&
              this.pssm_numRows.equals(other.getPssm_numRows()))) &&
            ((this.pssm_numColumns==null && other.getPssm_numColumns()==null) || 
             (this.pssm_numColumns!=null &&
              this.pssm_numColumns.equals(other.getPssm_numColumns()))) &&
            ((this.pssm_rowLabels==null && other.getPssm_rowLabels()==null) || 
             (this.pssm_rowLabels!=null &&
              this.pssm_rowLabels.equals(other.getPssm_rowLabels()))) &&
            ((this.pssm_byRow==null && other.getPssm_byRow()==null) || 
             (this.pssm_byRow!=null &&
              this.pssm_byRow.equals(other.getPssm_byRow()))) &&
            ((this.pssm_query==null && other.getPssm_query()==null) || 
             (this.pssm_query!=null &&
              this.pssm_query.equals(other.getPssm_query()))) &&
            ((this.pssm_intermediateData==null && other.getPssm_intermediateData()==null) || 
             (this.pssm_intermediateData!=null &&
              this.pssm_intermediateData.equals(other.getPssm_intermediateData()))) &&
            ((this.pssm_finalData==null && other.getPssm_finalData()==null) || 
             (this.pssm_finalData!=null &&
              this.pssm_finalData.equals(other.getPssm_finalData())));
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
        if (getPssm_isProtein() != null) {
            _hashCode += getPssm_isProtein().hashCode();
        }
        if (getPssm_identifier() != null) {
            _hashCode += getPssm_identifier().hashCode();
        }
        if (getPssm_numRows() != null) {
            _hashCode += getPssm_numRows().hashCode();
        }
        if (getPssm_numColumns() != null) {
            _hashCode += getPssm_numColumns().hashCode();
        }
        if (getPssm_rowLabels() != null) {
            _hashCode += getPssm_rowLabels().hashCode();
        }
        if (getPssm_byRow() != null) {
            _hashCode += getPssm_byRow().hashCode();
        }
        if (getPssm_query() != null) {
            _hashCode += getPssm_query().hashCode();
        }
        if (getPssm_intermediateData() != null) {
            _hashCode += getPssm_intermediateData().hashCode();
        }
        if (getPssm_finalData() != null) {
            _hashCode += getPssm_finalData().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PssmType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PssmType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pssm_isProtein");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Pssm_isProtein"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Pssm_isProteinType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pssm_identifier");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Pssm_identifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Pssm_identifierType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pssm_numRows");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Pssm_numRows"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pssm_numColumns");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Pssm_numColumns"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pssm_rowLabels");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Pssm_rowLabels"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Pssm_rowLabelsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pssm_byRow");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Pssm_byRow"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Pssm_byRowType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pssm_query");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Pssm_query"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Pssm_queryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pssm_intermediateData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Pssm_intermediateData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Pssm_intermediateDataType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pssm_finalData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Pssm_finalData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Pssm_finalDataType"));
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
