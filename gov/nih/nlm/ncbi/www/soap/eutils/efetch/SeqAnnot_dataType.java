/**
 * SeqAnnot_dataType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class SeqAnnot_dataType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqAnnot_data_ftableType seqAnnot_data_ftable;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqAnnot_data_alignType seqAnnot_data_align;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqAnnot_data_graphType seqAnnot_data_graph;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqAnnot_data_idsType seqAnnot_data_ids;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqAnnot_data_locsType seqAnnot_data_locs;

    public SeqAnnot_dataType() {
    }

    public SeqAnnot_dataType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqAnnot_data_ftableType seqAnnot_data_ftable,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqAnnot_data_alignType seqAnnot_data_align,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqAnnot_data_graphType seqAnnot_data_graph,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqAnnot_data_idsType seqAnnot_data_ids,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqAnnot_data_locsType seqAnnot_data_locs) {
           this.seqAnnot_data_ftable = seqAnnot_data_ftable;
           this.seqAnnot_data_align = seqAnnot_data_align;
           this.seqAnnot_data_graph = seqAnnot_data_graph;
           this.seqAnnot_data_ids = seqAnnot_data_ids;
           this.seqAnnot_data_locs = seqAnnot_data_locs;
    }


    /**
     * Gets the seqAnnot_data_ftable value for this SeqAnnot_dataType.
     * 
     * @return seqAnnot_data_ftable
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqAnnot_data_ftableType getSeqAnnot_data_ftable() {
        return seqAnnot_data_ftable;
    }


    /**
     * Sets the seqAnnot_data_ftable value for this SeqAnnot_dataType.
     * 
     * @param seqAnnot_data_ftable
     */
    public void setSeqAnnot_data_ftable(gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqAnnot_data_ftableType seqAnnot_data_ftable) {
        this.seqAnnot_data_ftable = seqAnnot_data_ftable;
    }


    /**
     * Gets the seqAnnot_data_align value for this SeqAnnot_dataType.
     * 
     * @return seqAnnot_data_align
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqAnnot_data_alignType getSeqAnnot_data_align() {
        return seqAnnot_data_align;
    }


    /**
     * Sets the seqAnnot_data_align value for this SeqAnnot_dataType.
     * 
     * @param seqAnnot_data_align
     */
    public void setSeqAnnot_data_align(gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqAnnot_data_alignType seqAnnot_data_align) {
        this.seqAnnot_data_align = seqAnnot_data_align;
    }


    /**
     * Gets the seqAnnot_data_graph value for this SeqAnnot_dataType.
     * 
     * @return seqAnnot_data_graph
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqAnnot_data_graphType getSeqAnnot_data_graph() {
        return seqAnnot_data_graph;
    }


    /**
     * Sets the seqAnnot_data_graph value for this SeqAnnot_dataType.
     * 
     * @param seqAnnot_data_graph
     */
    public void setSeqAnnot_data_graph(gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqAnnot_data_graphType seqAnnot_data_graph) {
        this.seqAnnot_data_graph = seqAnnot_data_graph;
    }


    /**
     * Gets the seqAnnot_data_ids value for this SeqAnnot_dataType.
     * 
     * @return seqAnnot_data_ids
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqAnnot_data_idsType getSeqAnnot_data_ids() {
        return seqAnnot_data_ids;
    }


    /**
     * Sets the seqAnnot_data_ids value for this SeqAnnot_dataType.
     * 
     * @param seqAnnot_data_ids
     */
    public void setSeqAnnot_data_ids(gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqAnnot_data_idsType seqAnnot_data_ids) {
        this.seqAnnot_data_ids = seqAnnot_data_ids;
    }


    /**
     * Gets the seqAnnot_data_locs value for this SeqAnnot_dataType.
     * 
     * @return seqAnnot_data_locs
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqAnnot_data_locsType getSeqAnnot_data_locs() {
        return seqAnnot_data_locs;
    }


    /**
     * Sets the seqAnnot_data_locs value for this SeqAnnot_dataType.
     * 
     * @param seqAnnot_data_locs
     */
    public void setSeqAnnot_data_locs(gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqAnnot_data_locsType seqAnnot_data_locs) {
        this.seqAnnot_data_locs = seqAnnot_data_locs;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SeqAnnot_dataType)) return false;
        SeqAnnot_dataType other = (SeqAnnot_dataType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.seqAnnot_data_ftable==null && other.getSeqAnnot_data_ftable()==null) || 
             (this.seqAnnot_data_ftable!=null &&
              this.seqAnnot_data_ftable.equals(other.getSeqAnnot_data_ftable()))) &&
            ((this.seqAnnot_data_align==null && other.getSeqAnnot_data_align()==null) || 
             (this.seqAnnot_data_align!=null &&
              this.seqAnnot_data_align.equals(other.getSeqAnnot_data_align()))) &&
            ((this.seqAnnot_data_graph==null && other.getSeqAnnot_data_graph()==null) || 
             (this.seqAnnot_data_graph!=null &&
              this.seqAnnot_data_graph.equals(other.getSeqAnnot_data_graph()))) &&
            ((this.seqAnnot_data_ids==null && other.getSeqAnnot_data_ids()==null) || 
             (this.seqAnnot_data_ids!=null &&
              this.seqAnnot_data_ids.equals(other.getSeqAnnot_data_ids()))) &&
            ((this.seqAnnot_data_locs==null && other.getSeqAnnot_data_locs()==null) || 
             (this.seqAnnot_data_locs!=null &&
              this.seqAnnot_data_locs.equals(other.getSeqAnnot_data_locs())));
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
        if (getSeqAnnot_data_ftable() != null) {
            _hashCode += getSeqAnnot_data_ftable().hashCode();
        }
        if (getSeqAnnot_data_align() != null) {
            _hashCode += getSeqAnnot_data_align().hashCode();
        }
        if (getSeqAnnot_data_graph() != null) {
            _hashCode += getSeqAnnot_data_graph().hashCode();
        }
        if (getSeqAnnot_data_ids() != null) {
            _hashCode += getSeqAnnot_data_ids().hashCode();
        }
        if (getSeqAnnot_data_locs() != null) {
            _hashCode += getSeqAnnot_data_locs().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SeqAnnot_dataType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-annot_dataType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqAnnot_data_ftable");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-annot_data_ftable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-annot_data_ftableType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqAnnot_data_align");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-annot_data_align"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-annot_data_alignType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqAnnot_data_graph");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-annot_data_graph"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-annot_data_graphType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqAnnot_data_ids");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-annot_data_ids"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-annot_data_idsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqAnnot_data_locs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-annot_data_locs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-annot_data_locsType"));
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
