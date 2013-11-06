/**
 * BioseqType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class BioseqType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Bioseq_idType bioseq_id;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Bioseq_descrType bioseq_descr;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Bioseq_instType bioseq_inst;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Bioseq_annotType bioseq_annot;

    public BioseqType() {
    }

    public BioseqType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Bioseq_idType bioseq_id,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Bioseq_descrType bioseq_descr,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Bioseq_instType bioseq_inst,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Bioseq_annotType bioseq_annot) {
           this.bioseq_id = bioseq_id;
           this.bioseq_descr = bioseq_descr;
           this.bioseq_inst = bioseq_inst;
           this.bioseq_annot = bioseq_annot;
    }


    /**
     * Gets the bioseq_id value for this BioseqType.
     * 
     * @return bioseq_id
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Bioseq_idType getBioseq_id() {
        return bioseq_id;
    }


    /**
     * Sets the bioseq_id value for this BioseqType.
     * 
     * @param bioseq_id
     */
    public void setBioseq_id(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Bioseq_idType bioseq_id) {
        this.bioseq_id = bioseq_id;
    }


    /**
     * Gets the bioseq_descr value for this BioseqType.
     * 
     * @return bioseq_descr
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Bioseq_descrType getBioseq_descr() {
        return bioseq_descr;
    }


    /**
     * Sets the bioseq_descr value for this BioseqType.
     * 
     * @param bioseq_descr
     */
    public void setBioseq_descr(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Bioseq_descrType bioseq_descr) {
        this.bioseq_descr = bioseq_descr;
    }


    /**
     * Gets the bioseq_inst value for this BioseqType.
     * 
     * @return bioseq_inst
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Bioseq_instType getBioseq_inst() {
        return bioseq_inst;
    }


    /**
     * Sets the bioseq_inst value for this BioseqType.
     * 
     * @param bioseq_inst
     */
    public void setBioseq_inst(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Bioseq_instType bioseq_inst) {
        this.bioseq_inst = bioseq_inst;
    }


    /**
     * Gets the bioseq_annot value for this BioseqType.
     * 
     * @return bioseq_annot
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Bioseq_annotType getBioseq_annot() {
        return bioseq_annot;
    }


    /**
     * Sets the bioseq_annot value for this BioseqType.
     * 
     * @param bioseq_annot
     */
    public void setBioseq_annot(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Bioseq_annotType bioseq_annot) {
        this.bioseq_annot = bioseq_annot;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BioseqType)) return false;
        BioseqType other = (BioseqType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.bioseq_id==null && other.getBioseq_id()==null) || 
             (this.bioseq_id!=null &&
              this.bioseq_id.equals(other.getBioseq_id()))) &&
            ((this.bioseq_descr==null && other.getBioseq_descr()==null) || 
             (this.bioseq_descr!=null &&
              this.bioseq_descr.equals(other.getBioseq_descr()))) &&
            ((this.bioseq_inst==null && other.getBioseq_inst()==null) || 
             (this.bioseq_inst!=null &&
              this.bioseq_inst.equals(other.getBioseq_inst()))) &&
            ((this.bioseq_annot==null && other.getBioseq_annot()==null) || 
             (this.bioseq_annot!=null &&
              this.bioseq_annot.equals(other.getBioseq_annot())));
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
        if (getBioseq_id() != null) {
            _hashCode += getBioseq_id().hashCode();
        }
        if (getBioseq_descr() != null) {
            _hashCode += getBioseq_descr().hashCode();
        }
        if (getBioseq_inst() != null) {
            _hashCode += getBioseq_inst().hashCode();
        }
        if (getBioseq_annot() != null) {
            _hashCode += getBioseq_annot().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BioseqType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "BioseqType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bioseq_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Bioseq_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Bioseq_idType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bioseq_descr");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Bioseq_descr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Bioseq_descrType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bioseq_inst");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Bioseq_inst"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Bioseq_instType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bioseq_annot");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Bioseq_annot"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Bioseq_annotType"));
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
