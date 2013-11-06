/**
 * SeqCodeTableType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class SeqCodeTableType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqCodeTable_codeType seqCodeTable_code;

    private java.lang.String seqCodeTable_num;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqCodeTable_oneLetterType seqCodeTable_oneLetter;

    private java.lang.String seqCodeTable_startAt;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqCodeTable_tableType seqCodeTable_table;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqCodeTable_compsType seqCodeTable_comps;

    public SeqCodeTableType() {
    }

    public SeqCodeTableType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqCodeTable_codeType seqCodeTable_code,
           java.lang.String seqCodeTable_num,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqCodeTable_oneLetterType seqCodeTable_oneLetter,
           java.lang.String seqCodeTable_startAt,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqCodeTable_tableType seqCodeTable_table,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqCodeTable_compsType seqCodeTable_comps) {
           this.seqCodeTable_code = seqCodeTable_code;
           this.seqCodeTable_num = seqCodeTable_num;
           this.seqCodeTable_oneLetter = seqCodeTable_oneLetter;
           this.seqCodeTable_startAt = seqCodeTable_startAt;
           this.seqCodeTable_table = seqCodeTable_table;
           this.seqCodeTable_comps = seqCodeTable_comps;
    }


    /**
     * Gets the seqCodeTable_code value for this SeqCodeTableType.
     * 
     * @return seqCodeTable_code
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqCodeTable_codeType getSeqCodeTable_code() {
        return seqCodeTable_code;
    }


    /**
     * Sets the seqCodeTable_code value for this SeqCodeTableType.
     * 
     * @param seqCodeTable_code
     */
    public void setSeqCodeTable_code(gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqCodeTable_codeType seqCodeTable_code) {
        this.seqCodeTable_code = seqCodeTable_code;
    }


    /**
     * Gets the seqCodeTable_num value for this SeqCodeTableType.
     * 
     * @return seqCodeTable_num
     */
    public java.lang.String getSeqCodeTable_num() {
        return seqCodeTable_num;
    }


    /**
     * Sets the seqCodeTable_num value for this SeqCodeTableType.
     * 
     * @param seqCodeTable_num
     */
    public void setSeqCodeTable_num(java.lang.String seqCodeTable_num) {
        this.seqCodeTable_num = seqCodeTable_num;
    }


    /**
     * Gets the seqCodeTable_oneLetter value for this SeqCodeTableType.
     * 
     * @return seqCodeTable_oneLetter
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqCodeTable_oneLetterType getSeqCodeTable_oneLetter() {
        return seqCodeTable_oneLetter;
    }


    /**
     * Sets the seqCodeTable_oneLetter value for this SeqCodeTableType.
     * 
     * @param seqCodeTable_oneLetter
     */
    public void setSeqCodeTable_oneLetter(gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqCodeTable_oneLetterType seqCodeTable_oneLetter) {
        this.seqCodeTable_oneLetter = seqCodeTable_oneLetter;
    }


    /**
     * Gets the seqCodeTable_startAt value for this SeqCodeTableType.
     * 
     * @return seqCodeTable_startAt
     */
    public java.lang.String getSeqCodeTable_startAt() {
        return seqCodeTable_startAt;
    }


    /**
     * Sets the seqCodeTable_startAt value for this SeqCodeTableType.
     * 
     * @param seqCodeTable_startAt
     */
    public void setSeqCodeTable_startAt(java.lang.String seqCodeTable_startAt) {
        this.seqCodeTable_startAt = seqCodeTable_startAt;
    }


    /**
     * Gets the seqCodeTable_table value for this SeqCodeTableType.
     * 
     * @return seqCodeTable_table
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqCodeTable_tableType getSeqCodeTable_table() {
        return seqCodeTable_table;
    }


    /**
     * Sets the seqCodeTable_table value for this SeqCodeTableType.
     * 
     * @param seqCodeTable_table
     */
    public void setSeqCodeTable_table(gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqCodeTable_tableType seqCodeTable_table) {
        this.seqCodeTable_table = seqCodeTable_table;
    }


    /**
     * Gets the seqCodeTable_comps value for this SeqCodeTableType.
     * 
     * @return seqCodeTable_comps
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqCodeTable_compsType getSeqCodeTable_comps() {
        return seqCodeTable_comps;
    }


    /**
     * Sets the seqCodeTable_comps value for this SeqCodeTableType.
     * 
     * @param seqCodeTable_comps
     */
    public void setSeqCodeTable_comps(gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqCodeTable_compsType seqCodeTable_comps) {
        this.seqCodeTable_comps = seqCodeTable_comps;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SeqCodeTableType)) return false;
        SeqCodeTableType other = (SeqCodeTableType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.seqCodeTable_code==null && other.getSeqCodeTable_code()==null) || 
             (this.seqCodeTable_code!=null &&
              this.seqCodeTable_code.equals(other.getSeqCodeTable_code()))) &&
            ((this.seqCodeTable_num==null && other.getSeqCodeTable_num()==null) || 
             (this.seqCodeTable_num!=null &&
              this.seqCodeTable_num.equals(other.getSeqCodeTable_num()))) &&
            ((this.seqCodeTable_oneLetter==null && other.getSeqCodeTable_oneLetter()==null) || 
             (this.seqCodeTable_oneLetter!=null &&
              this.seqCodeTable_oneLetter.equals(other.getSeqCodeTable_oneLetter()))) &&
            ((this.seqCodeTable_startAt==null && other.getSeqCodeTable_startAt()==null) || 
             (this.seqCodeTable_startAt!=null &&
              this.seqCodeTable_startAt.equals(other.getSeqCodeTable_startAt()))) &&
            ((this.seqCodeTable_table==null && other.getSeqCodeTable_table()==null) || 
             (this.seqCodeTable_table!=null &&
              this.seqCodeTable_table.equals(other.getSeqCodeTable_table()))) &&
            ((this.seqCodeTable_comps==null && other.getSeqCodeTable_comps()==null) || 
             (this.seqCodeTable_comps!=null &&
              this.seqCodeTable_comps.equals(other.getSeqCodeTable_comps())));
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
        if (getSeqCodeTable_code() != null) {
            _hashCode += getSeqCodeTable_code().hashCode();
        }
        if (getSeqCodeTable_num() != null) {
            _hashCode += getSeqCodeTable_num().hashCode();
        }
        if (getSeqCodeTable_oneLetter() != null) {
            _hashCode += getSeqCodeTable_oneLetter().hashCode();
        }
        if (getSeqCodeTable_startAt() != null) {
            _hashCode += getSeqCodeTable_startAt().hashCode();
        }
        if (getSeqCodeTable_table() != null) {
            _hashCode += getSeqCodeTable_table().hashCode();
        }
        if (getSeqCodeTable_comps() != null) {
            _hashCode += getSeqCodeTable_comps().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SeqCodeTableType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-code-tableType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqCodeTable_code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-code-table_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-code-table_codeType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqCodeTable_num");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-code-table_num"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqCodeTable_oneLetter");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-code-table_one-letter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-code-table_one-letterType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqCodeTable_startAt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-code-table_start-at"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqCodeTable_table");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-code-table_table"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-code-table_tableType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqCodeTable_comps");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-code-table_comps"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-code-table_compsType"));
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
