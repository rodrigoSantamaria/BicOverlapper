/**
 * SeqInstType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class SeqInstType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqInst_reprType seqInst_repr;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqInst_molType seqInst_mol;

    private java.lang.String seqInst_length;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqInst_fuzzType seqInst_fuzz;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqInst_topologyType seqInst_topology;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqInst_strandType seqInst_strand;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqInst_seqDataType seqInst_seqData;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqInst_extType seqInst_ext;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqInst_histType seqInst_hist;

    public SeqInstType() {
    }

    public SeqInstType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqInst_reprType seqInst_repr,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqInst_molType seqInst_mol,
           java.lang.String seqInst_length,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqInst_fuzzType seqInst_fuzz,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqInst_topologyType seqInst_topology,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqInst_strandType seqInst_strand,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqInst_seqDataType seqInst_seqData,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqInst_extType seqInst_ext,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqInst_histType seqInst_hist) {
           this.seqInst_repr = seqInst_repr;
           this.seqInst_mol = seqInst_mol;
           this.seqInst_length = seqInst_length;
           this.seqInst_fuzz = seqInst_fuzz;
           this.seqInst_topology = seqInst_topology;
           this.seqInst_strand = seqInst_strand;
           this.seqInst_seqData = seqInst_seqData;
           this.seqInst_ext = seqInst_ext;
           this.seqInst_hist = seqInst_hist;
    }


    /**
     * Gets the seqInst_repr value for this SeqInstType.
     * 
     * @return seqInst_repr
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqInst_reprType getSeqInst_repr() {
        return seqInst_repr;
    }


    /**
     * Sets the seqInst_repr value for this SeqInstType.
     * 
     * @param seqInst_repr
     */
    public void setSeqInst_repr(gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqInst_reprType seqInst_repr) {
        this.seqInst_repr = seqInst_repr;
    }


    /**
     * Gets the seqInst_mol value for this SeqInstType.
     * 
     * @return seqInst_mol
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqInst_molType getSeqInst_mol() {
        return seqInst_mol;
    }


    /**
     * Sets the seqInst_mol value for this SeqInstType.
     * 
     * @param seqInst_mol
     */
    public void setSeqInst_mol(gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqInst_molType seqInst_mol) {
        this.seqInst_mol = seqInst_mol;
    }


    /**
     * Gets the seqInst_length value for this SeqInstType.
     * 
     * @return seqInst_length
     */
    public java.lang.String getSeqInst_length() {
        return seqInst_length;
    }


    /**
     * Sets the seqInst_length value for this SeqInstType.
     * 
     * @param seqInst_length
     */
    public void setSeqInst_length(java.lang.String seqInst_length) {
        this.seqInst_length = seqInst_length;
    }


    /**
     * Gets the seqInst_fuzz value for this SeqInstType.
     * 
     * @return seqInst_fuzz
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqInst_fuzzType getSeqInst_fuzz() {
        return seqInst_fuzz;
    }


    /**
     * Sets the seqInst_fuzz value for this SeqInstType.
     * 
     * @param seqInst_fuzz
     */
    public void setSeqInst_fuzz(gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqInst_fuzzType seqInst_fuzz) {
        this.seqInst_fuzz = seqInst_fuzz;
    }


    /**
     * Gets the seqInst_topology value for this SeqInstType.
     * 
     * @return seqInst_topology
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqInst_topologyType getSeqInst_topology() {
        return seqInst_topology;
    }


    /**
     * Sets the seqInst_topology value for this SeqInstType.
     * 
     * @param seqInst_topology
     */
    public void setSeqInst_topology(gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqInst_topologyType seqInst_topology) {
        this.seqInst_topology = seqInst_topology;
    }


    /**
     * Gets the seqInst_strand value for this SeqInstType.
     * 
     * @return seqInst_strand
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqInst_strandType getSeqInst_strand() {
        return seqInst_strand;
    }


    /**
     * Sets the seqInst_strand value for this SeqInstType.
     * 
     * @param seqInst_strand
     */
    public void setSeqInst_strand(gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqInst_strandType seqInst_strand) {
        this.seqInst_strand = seqInst_strand;
    }


    /**
     * Gets the seqInst_seqData value for this SeqInstType.
     * 
     * @return seqInst_seqData
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqInst_seqDataType getSeqInst_seqData() {
        return seqInst_seqData;
    }


    /**
     * Sets the seqInst_seqData value for this SeqInstType.
     * 
     * @param seqInst_seqData
     */
    public void setSeqInst_seqData(gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqInst_seqDataType seqInst_seqData) {
        this.seqInst_seqData = seqInst_seqData;
    }


    /**
     * Gets the seqInst_ext value for this SeqInstType.
     * 
     * @return seqInst_ext
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqInst_extType getSeqInst_ext() {
        return seqInst_ext;
    }


    /**
     * Sets the seqInst_ext value for this SeqInstType.
     * 
     * @param seqInst_ext
     */
    public void setSeqInst_ext(gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqInst_extType seqInst_ext) {
        this.seqInst_ext = seqInst_ext;
    }


    /**
     * Gets the seqInst_hist value for this SeqInstType.
     * 
     * @return seqInst_hist
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqInst_histType getSeqInst_hist() {
        return seqInst_hist;
    }


    /**
     * Sets the seqInst_hist value for this SeqInstType.
     * 
     * @param seqInst_hist
     */
    public void setSeqInst_hist(gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqInst_histType seqInst_hist) {
        this.seqInst_hist = seqInst_hist;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SeqInstType)) return false;
        SeqInstType other = (SeqInstType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.seqInst_repr==null && other.getSeqInst_repr()==null) || 
             (this.seqInst_repr!=null &&
              this.seqInst_repr.equals(other.getSeqInst_repr()))) &&
            ((this.seqInst_mol==null && other.getSeqInst_mol()==null) || 
             (this.seqInst_mol!=null &&
              this.seqInst_mol.equals(other.getSeqInst_mol()))) &&
            ((this.seqInst_length==null && other.getSeqInst_length()==null) || 
             (this.seqInst_length!=null &&
              this.seqInst_length.equals(other.getSeqInst_length()))) &&
            ((this.seqInst_fuzz==null && other.getSeqInst_fuzz()==null) || 
             (this.seqInst_fuzz!=null &&
              this.seqInst_fuzz.equals(other.getSeqInst_fuzz()))) &&
            ((this.seqInst_topology==null && other.getSeqInst_topology()==null) || 
             (this.seqInst_topology!=null &&
              this.seqInst_topology.equals(other.getSeqInst_topology()))) &&
            ((this.seqInst_strand==null && other.getSeqInst_strand()==null) || 
             (this.seqInst_strand!=null &&
              this.seqInst_strand.equals(other.getSeqInst_strand()))) &&
            ((this.seqInst_seqData==null && other.getSeqInst_seqData()==null) || 
             (this.seqInst_seqData!=null &&
              this.seqInst_seqData.equals(other.getSeqInst_seqData()))) &&
            ((this.seqInst_ext==null && other.getSeqInst_ext()==null) || 
             (this.seqInst_ext!=null &&
              this.seqInst_ext.equals(other.getSeqInst_ext()))) &&
            ((this.seqInst_hist==null && other.getSeqInst_hist()==null) || 
             (this.seqInst_hist!=null &&
              this.seqInst_hist.equals(other.getSeqInst_hist())));
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
        if (getSeqInst_repr() != null) {
            _hashCode += getSeqInst_repr().hashCode();
        }
        if (getSeqInst_mol() != null) {
            _hashCode += getSeqInst_mol().hashCode();
        }
        if (getSeqInst_length() != null) {
            _hashCode += getSeqInst_length().hashCode();
        }
        if (getSeqInst_fuzz() != null) {
            _hashCode += getSeqInst_fuzz().hashCode();
        }
        if (getSeqInst_topology() != null) {
            _hashCode += getSeqInst_topology().hashCode();
        }
        if (getSeqInst_strand() != null) {
            _hashCode += getSeqInst_strand().hashCode();
        }
        if (getSeqInst_seqData() != null) {
            _hashCode += getSeqInst_seqData().hashCode();
        }
        if (getSeqInst_ext() != null) {
            _hashCode += getSeqInst_ext().hashCode();
        }
        if (getSeqInst_hist() != null) {
            _hashCode += getSeqInst_hist().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SeqInstType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-instType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqInst_repr");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-inst_repr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-inst_reprType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqInst_mol");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-inst_mol"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-inst_molType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqInst_length");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-inst_length"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqInst_fuzz");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-inst_fuzz"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-inst_fuzzType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqInst_topology");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-inst_topology"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-inst_topologyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqInst_strand");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-inst_strand"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-inst_strandType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqInst_seqData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-inst_seq-data"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-inst_seq-dataType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqInst_ext");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-inst_ext"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-inst_extType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqInst_hist");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-inst_hist"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-inst_histType"));
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
