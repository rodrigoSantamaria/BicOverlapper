/**
 * Entrez2TermType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Entrez2TermType  implements java.io.Serializable {
    private java.lang.String entrez2Term_term;

    private java.lang.String entrez2Term_txid;

    private java.lang.String entrez2Term_count;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2Term_isLeafNodeType entrez2Term_isLeafNode;

    public Entrez2TermType() {
    }

    public Entrez2TermType(
           java.lang.String entrez2Term_term,
           java.lang.String entrez2Term_txid,
           java.lang.String entrez2Term_count,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2Term_isLeafNodeType entrez2Term_isLeafNode) {
           this.entrez2Term_term = entrez2Term_term;
           this.entrez2Term_txid = entrez2Term_txid;
           this.entrez2Term_count = entrez2Term_count;
           this.entrez2Term_isLeafNode = entrez2Term_isLeafNode;
    }


    /**
     * Gets the entrez2Term_term value for this Entrez2TermType.
     * 
     * @return entrez2Term_term
     */
    public java.lang.String getEntrez2Term_term() {
        return entrez2Term_term;
    }


    /**
     * Sets the entrez2Term_term value for this Entrez2TermType.
     * 
     * @param entrez2Term_term
     */
    public void setEntrez2Term_term(java.lang.String entrez2Term_term) {
        this.entrez2Term_term = entrez2Term_term;
    }


    /**
     * Gets the entrez2Term_txid value for this Entrez2TermType.
     * 
     * @return entrez2Term_txid
     */
    public java.lang.String getEntrez2Term_txid() {
        return entrez2Term_txid;
    }


    /**
     * Sets the entrez2Term_txid value for this Entrez2TermType.
     * 
     * @param entrez2Term_txid
     */
    public void setEntrez2Term_txid(java.lang.String entrez2Term_txid) {
        this.entrez2Term_txid = entrez2Term_txid;
    }


    /**
     * Gets the entrez2Term_count value for this Entrez2TermType.
     * 
     * @return entrez2Term_count
     */
    public java.lang.String getEntrez2Term_count() {
        return entrez2Term_count;
    }


    /**
     * Sets the entrez2Term_count value for this Entrez2TermType.
     * 
     * @param entrez2Term_count
     */
    public void setEntrez2Term_count(java.lang.String entrez2Term_count) {
        this.entrez2Term_count = entrez2Term_count;
    }


    /**
     * Gets the entrez2Term_isLeafNode value for this Entrez2TermType.
     * 
     * @return entrez2Term_isLeafNode
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2Term_isLeafNodeType getEntrez2Term_isLeafNode() {
        return entrez2Term_isLeafNode;
    }


    /**
     * Sets the entrez2Term_isLeafNode value for this Entrez2TermType.
     * 
     * @param entrez2Term_isLeafNode
     */
    public void setEntrez2Term_isLeafNode(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2Term_isLeafNodeType entrez2Term_isLeafNode) {
        this.entrez2Term_isLeafNode = entrez2Term_isLeafNode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Entrez2TermType)) return false;
        Entrez2TermType other = (Entrez2TermType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.entrez2Term_term==null && other.getEntrez2Term_term()==null) || 
             (this.entrez2Term_term!=null &&
              this.entrez2Term_term.equals(other.getEntrez2Term_term()))) &&
            ((this.entrez2Term_txid==null && other.getEntrez2Term_txid()==null) || 
             (this.entrez2Term_txid!=null &&
              this.entrez2Term_txid.equals(other.getEntrez2Term_txid()))) &&
            ((this.entrez2Term_count==null && other.getEntrez2Term_count()==null) || 
             (this.entrez2Term_count!=null &&
              this.entrez2Term_count.equals(other.getEntrez2Term_count()))) &&
            ((this.entrez2Term_isLeafNode==null && other.getEntrez2Term_isLeafNode()==null) || 
             (this.entrez2Term_isLeafNode!=null &&
              this.entrez2Term_isLeafNode.equals(other.getEntrez2Term_isLeafNode())));
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
        if (getEntrez2Term_term() != null) {
            _hashCode += getEntrez2Term_term().hashCode();
        }
        if (getEntrez2Term_txid() != null) {
            _hashCode += getEntrez2Term_txid().hashCode();
        }
        if (getEntrez2Term_count() != null) {
            _hashCode += getEntrez2Term_count().hashCode();
        }
        if (getEntrez2Term_isLeafNode() != null) {
            _hashCode += getEntrez2Term_isLeafNode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Entrez2TermType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-termType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entrez2Term_term");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-term_term"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entrez2Term_txid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-term_txid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entrez2Term_count");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-term_count"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entrez2Term_isLeafNode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-term_is-leaf-node"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-term_is-leaf-nodeType"));
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
