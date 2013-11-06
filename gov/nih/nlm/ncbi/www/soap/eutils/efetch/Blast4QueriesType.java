/**
 * Blast4QueriesType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Blast4QueriesType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4Queries_pssmType blast4Queries_pssm;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4Queries_seqLocListType blast4Queries_seqLocList;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4Queries_bioseqSetType blast4Queries_bioseqSet;

    public Blast4QueriesType() {
    }

    public Blast4QueriesType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4Queries_pssmType blast4Queries_pssm,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4Queries_seqLocListType blast4Queries_seqLocList,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4Queries_bioseqSetType blast4Queries_bioseqSet) {
           this.blast4Queries_pssm = blast4Queries_pssm;
           this.blast4Queries_seqLocList = blast4Queries_seqLocList;
           this.blast4Queries_bioseqSet = blast4Queries_bioseqSet;
    }


    /**
     * Gets the blast4Queries_pssm value for this Blast4QueriesType.
     * 
     * @return blast4Queries_pssm
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4Queries_pssmType getBlast4Queries_pssm() {
        return blast4Queries_pssm;
    }


    /**
     * Sets the blast4Queries_pssm value for this Blast4QueriesType.
     * 
     * @param blast4Queries_pssm
     */
    public void setBlast4Queries_pssm(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4Queries_pssmType blast4Queries_pssm) {
        this.blast4Queries_pssm = blast4Queries_pssm;
    }


    /**
     * Gets the blast4Queries_seqLocList value for this Blast4QueriesType.
     * 
     * @return blast4Queries_seqLocList
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4Queries_seqLocListType getBlast4Queries_seqLocList() {
        return blast4Queries_seqLocList;
    }


    /**
     * Sets the blast4Queries_seqLocList value for this Blast4QueriesType.
     * 
     * @param blast4Queries_seqLocList
     */
    public void setBlast4Queries_seqLocList(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4Queries_seqLocListType blast4Queries_seqLocList) {
        this.blast4Queries_seqLocList = blast4Queries_seqLocList;
    }


    /**
     * Gets the blast4Queries_bioseqSet value for this Blast4QueriesType.
     * 
     * @return blast4Queries_bioseqSet
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4Queries_bioseqSetType getBlast4Queries_bioseqSet() {
        return blast4Queries_bioseqSet;
    }


    /**
     * Sets the blast4Queries_bioseqSet value for this Blast4QueriesType.
     * 
     * @param blast4Queries_bioseqSet
     */
    public void setBlast4Queries_bioseqSet(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4Queries_bioseqSetType blast4Queries_bioseqSet) {
        this.blast4Queries_bioseqSet = blast4Queries_bioseqSet;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Blast4QueriesType)) return false;
        Blast4QueriesType other = (Blast4QueriesType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.blast4Queries_pssm==null && other.getBlast4Queries_pssm()==null) || 
             (this.blast4Queries_pssm!=null &&
              this.blast4Queries_pssm.equals(other.getBlast4Queries_pssm()))) &&
            ((this.blast4Queries_seqLocList==null && other.getBlast4Queries_seqLocList()==null) || 
             (this.blast4Queries_seqLocList!=null &&
              this.blast4Queries_seqLocList.equals(other.getBlast4Queries_seqLocList()))) &&
            ((this.blast4Queries_bioseqSet==null && other.getBlast4Queries_bioseqSet()==null) || 
             (this.blast4Queries_bioseqSet!=null &&
              this.blast4Queries_bioseqSet.equals(other.getBlast4Queries_bioseqSet())));
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
        if (getBlast4Queries_pssm() != null) {
            _hashCode += getBlast4Queries_pssm().hashCode();
        }
        if (getBlast4Queries_seqLocList() != null) {
            _hashCode += getBlast4Queries_seqLocList().hashCode();
        }
        if (getBlast4Queries_bioseqSet() != null) {
            _hashCode += getBlast4Queries_bioseqSet().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Blast4QueriesType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-queriesType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blast4Queries_pssm");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-queries_pssm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-queries_pssmType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blast4Queries_seqLocList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-queries_seq-loc-list"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-queries_seq-loc-listType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blast4Queries_bioseqSet");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-queries_bioseq-set"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-queries_bioseq-setType"));
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
