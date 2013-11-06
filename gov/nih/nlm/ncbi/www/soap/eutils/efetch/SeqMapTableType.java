/**
 * SeqMapTableType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class SeqMapTableType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqMapTable_fromType seqMapTable_from;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqMapTable_toType seqMapTable_to;

    private java.lang.String seqMapTable_num;

    private java.lang.String seqMapTable_startAt;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqMapTable_tableType seqMapTable_table;

    public SeqMapTableType() {
    }

    public SeqMapTableType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqMapTable_fromType seqMapTable_from,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqMapTable_toType seqMapTable_to,
           java.lang.String seqMapTable_num,
           java.lang.String seqMapTable_startAt,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqMapTable_tableType seqMapTable_table) {
           this.seqMapTable_from = seqMapTable_from;
           this.seqMapTable_to = seqMapTable_to;
           this.seqMapTable_num = seqMapTable_num;
           this.seqMapTable_startAt = seqMapTable_startAt;
           this.seqMapTable_table = seqMapTable_table;
    }


    /**
     * Gets the seqMapTable_from value for this SeqMapTableType.
     * 
     * @return seqMapTable_from
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqMapTable_fromType getSeqMapTable_from() {
        return seqMapTable_from;
    }


    /**
     * Sets the seqMapTable_from value for this SeqMapTableType.
     * 
     * @param seqMapTable_from
     */
    public void setSeqMapTable_from(gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqMapTable_fromType seqMapTable_from) {
        this.seqMapTable_from = seqMapTable_from;
    }


    /**
     * Gets the seqMapTable_to value for this SeqMapTableType.
     * 
     * @return seqMapTable_to
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqMapTable_toType getSeqMapTable_to() {
        return seqMapTable_to;
    }


    /**
     * Sets the seqMapTable_to value for this SeqMapTableType.
     * 
     * @param seqMapTable_to
     */
    public void setSeqMapTable_to(gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqMapTable_toType seqMapTable_to) {
        this.seqMapTable_to = seqMapTable_to;
    }


    /**
     * Gets the seqMapTable_num value for this SeqMapTableType.
     * 
     * @return seqMapTable_num
     */
    public java.lang.String getSeqMapTable_num() {
        return seqMapTable_num;
    }


    /**
     * Sets the seqMapTable_num value for this SeqMapTableType.
     * 
     * @param seqMapTable_num
     */
    public void setSeqMapTable_num(java.lang.String seqMapTable_num) {
        this.seqMapTable_num = seqMapTable_num;
    }


    /**
     * Gets the seqMapTable_startAt value for this SeqMapTableType.
     * 
     * @return seqMapTable_startAt
     */
    public java.lang.String getSeqMapTable_startAt() {
        return seqMapTable_startAt;
    }


    /**
     * Sets the seqMapTable_startAt value for this SeqMapTableType.
     * 
     * @param seqMapTable_startAt
     */
    public void setSeqMapTable_startAt(java.lang.String seqMapTable_startAt) {
        this.seqMapTable_startAt = seqMapTable_startAt;
    }


    /**
     * Gets the seqMapTable_table value for this SeqMapTableType.
     * 
     * @return seqMapTable_table
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqMapTable_tableType getSeqMapTable_table() {
        return seqMapTable_table;
    }


    /**
     * Sets the seqMapTable_table value for this SeqMapTableType.
     * 
     * @param seqMapTable_table
     */
    public void setSeqMapTable_table(gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqMapTable_tableType seqMapTable_table) {
        this.seqMapTable_table = seqMapTable_table;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SeqMapTableType)) return false;
        SeqMapTableType other = (SeqMapTableType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.seqMapTable_from==null && other.getSeqMapTable_from()==null) || 
             (this.seqMapTable_from!=null &&
              this.seqMapTable_from.equals(other.getSeqMapTable_from()))) &&
            ((this.seqMapTable_to==null && other.getSeqMapTable_to()==null) || 
             (this.seqMapTable_to!=null &&
              this.seqMapTable_to.equals(other.getSeqMapTable_to()))) &&
            ((this.seqMapTable_num==null && other.getSeqMapTable_num()==null) || 
             (this.seqMapTable_num!=null &&
              this.seqMapTable_num.equals(other.getSeqMapTable_num()))) &&
            ((this.seqMapTable_startAt==null && other.getSeqMapTable_startAt()==null) || 
             (this.seqMapTable_startAt!=null &&
              this.seqMapTable_startAt.equals(other.getSeqMapTable_startAt()))) &&
            ((this.seqMapTable_table==null && other.getSeqMapTable_table()==null) || 
             (this.seqMapTable_table!=null &&
              this.seqMapTable_table.equals(other.getSeqMapTable_table())));
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
        if (getSeqMapTable_from() != null) {
            _hashCode += getSeqMapTable_from().hashCode();
        }
        if (getSeqMapTable_to() != null) {
            _hashCode += getSeqMapTable_to().hashCode();
        }
        if (getSeqMapTable_num() != null) {
            _hashCode += getSeqMapTable_num().hashCode();
        }
        if (getSeqMapTable_startAt() != null) {
            _hashCode += getSeqMapTable_startAt().hashCode();
        }
        if (getSeqMapTable_table() != null) {
            _hashCode += getSeqMapTable_table().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SeqMapTableType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-map-tableType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqMapTable_from");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-map-table_from"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-map-table_fromType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqMapTable_to");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-map-table_to"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-map-table_toType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqMapTable_num");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-map-table_num"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqMapTable_startAt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-map-table_start-at"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqMapTable_table");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-map-table_table"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-map-table_tableType"));
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
