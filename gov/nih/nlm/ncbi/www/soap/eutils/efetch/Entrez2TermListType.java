/**
 * Entrez2TermListType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Entrez2TermListType  implements java.io.Serializable {
    private java.lang.String entrez2TermList_pos;

    private java.lang.String entrez2TermList_num;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2TermList_listType entrez2TermList_list;

    public Entrez2TermListType() {
    }

    public Entrez2TermListType(
           java.lang.String entrez2TermList_pos,
           java.lang.String entrez2TermList_num,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2TermList_listType entrez2TermList_list) {
           this.entrez2TermList_pos = entrez2TermList_pos;
           this.entrez2TermList_num = entrez2TermList_num;
           this.entrez2TermList_list = entrez2TermList_list;
    }


    /**
     * Gets the entrez2TermList_pos value for this Entrez2TermListType.
     * 
     * @return entrez2TermList_pos
     */
    public java.lang.String getEntrez2TermList_pos() {
        return entrez2TermList_pos;
    }


    /**
     * Sets the entrez2TermList_pos value for this Entrez2TermListType.
     * 
     * @param entrez2TermList_pos
     */
    public void setEntrez2TermList_pos(java.lang.String entrez2TermList_pos) {
        this.entrez2TermList_pos = entrez2TermList_pos;
    }


    /**
     * Gets the entrez2TermList_num value for this Entrez2TermListType.
     * 
     * @return entrez2TermList_num
     */
    public java.lang.String getEntrez2TermList_num() {
        return entrez2TermList_num;
    }


    /**
     * Sets the entrez2TermList_num value for this Entrez2TermListType.
     * 
     * @param entrez2TermList_num
     */
    public void setEntrez2TermList_num(java.lang.String entrez2TermList_num) {
        this.entrez2TermList_num = entrez2TermList_num;
    }


    /**
     * Gets the entrez2TermList_list value for this Entrez2TermListType.
     * 
     * @return entrez2TermList_list
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2TermList_listType getEntrez2TermList_list() {
        return entrez2TermList_list;
    }


    /**
     * Sets the entrez2TermList_list value for this Entrez2TermListType.
     * 
     * @param entrez2TermList_list
     */
    public void setEntrez2TermList_list(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2TermList_listType entrez2TermList_list) {
        this.entrez2TermList_list = entrez2TermList_list;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Entrez2TermListType)) return false;
        Entrez2TermListType other = (Entrez2TermListType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.entrez2TermList_pos==null && other.getEntrez2TermList_pos()==null) || 
             (this.entrez2TermList_pos!=null &&
              this.entrez2TermList_pos.equals(other.getEntrez2TermList_pos()))) &&
            ((this.entrez2TermList_num==null && other.getEntrez2TermList_num()==null) || 
             (this.entrez2TermList_num!=null &&
              this.entrez2TermList_num.equals(other.getEntrez2TermList_num()))) &&
            ((this.entrez2TermList_list==null && other.getEntrez2TermList_list()==null) || 
             (this.entrez2TermList_list!=null &&
              this.entrez2TermList_list.equals(other.getEntrez2TermList_list())));
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
        if (getEntrez2TermList_pos() != null) {
            _hashCode += getEntrez2TermList_pos().hashCode();
        }
        if (getEntrez2TermList_num() != null) {
            _hashCode += getEntrez2TermList_num().hashCode();
        }
        if (getEntrez2TermList_list() != null) {
            _hashCode += getEntrez2TermList_list().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Entrez2TermListType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-term-listType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entrez2TermList_pos");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-term-list_pos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entrez2TermList_num");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-term-list_num"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entrez2TermList_list");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-term-list_list"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-term-list_listType"));
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
