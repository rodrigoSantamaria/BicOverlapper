/**
 * SeqGraph_graphType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class SeqGraph_graphType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqGraph_graph_realType seqGraph_graph_real;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqGraph_graph_intType seqGraph_graph_int;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqGraph_graph_byteType seqGraph_graph_byte;

    public SeqGraph_graphType() {
    }

    public SeqGraph_graphType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqGraph_graph_realType seqGraph_graph_real,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqGraph_graph_intType seqGraph_graph_int,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqGraph_graph_byteType seqGraph_graph_byte) {
           this.seqGraph_graph_real = seqGraph_graph_real;
           this.seqGraph_graph_int = seqGraph_graph_int;
           this.seqGraph_graph_byte = seqGraph_graph_byte;
    }


    /**
     * Gets the seqGraph_graph_real value for this SeqGraph_graphType.
     * 
     * @return seqGraph_graph_real
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqGraph_graph_realType getSeqGraph_graph_real() {
        return seqGraph_graph_real;
    }


    /**
     * Sets the seqGraph_graph_real value for this SeqGraph_graphType.
     * 
     * @param seqGraph_graph_real
     */
    public void setSeqGraph_graph_real(gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqGraph_graph_realType seqGraph_graph_real) {
        this.seqGraph_graph_real = seqGraph_graph_real;
    }


    /**
     * Gets the seqGraph_graph_int value for this SeqGraph_graphType.
     * 
     * @return seqGraph_graph_int
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqGraph_graph_intType getSeqGraph_graph_int() {
        return seqGraph_graph_int;
    }


    /**
     * Sets the seqGraph_graph_int value for this SeqGraph_graphType.
     * 
     * @param seqGraph_graph_int
     */
    public void setSeqGraph_graph_int(gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqGraph_graph_intType seqGraph_graph_int) {
        this.seqGraph_graph_int = seqGraph_graph_int;
    }


    /**
     * Gets the seqGraph_graph_byte value for this SeqGraph_graphType.
     * 
     * @return seqGraph_graph_byte
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqGraph_graph_byteType getSeqGraph_graph_byte() {
        return seqGraph_graph_byte;
    }


    /**
     * Sets the seqGraph_graph_byte value for this SeqGraph_graphType.
     * 
     * @param seqGraph_graph_byte
     */
    public void setSeqGraph_graph_byte(gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqGraph_graph_byteType seqGraph_graph_byte) {
        this.seqGraph_graph_byte = seqGraph_graph_byte;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SeqGraph_graphType)) return false;
        SeqGraph_graphType other = (SeqGraph_graphType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.seqGraph_graph_real==null && other.getSeqGraph_graph_real()==null) || 
             (this.seqGraph_graph_real!=null &&
              this.seqGraph_graph_real.equals(other.getSeqGraph_graph_real()))) &&
            ((this.seqGraph_graph_int==null && other.getSeqGraph_graph_int()==null) || 
             (this.seqGraph_graph_int!=null &&
              this.seqGraph_graph_int.equals(other.getSeqGraph_graph_int()))) &&
            ((this.seqGraph_graph_byte==null && other.getSeqGraph_graph_byte()==null) || 
             (this.seqGraph_graph_byte!=null &&
              this.seqGraph_graph_byte.equals(other.getSeqGraph_graph_byte())));
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
        if (getSeqGraph_graph_real() != null) {
            _hashCode += getSeqGraph_graph_real().hashCode();
        }
        if (getSeqGraph_graph_int() != null) {
            _hashCode += getSeqGraph_graph_int().hashCode();
        }
        if (getSeqGraph_graph_byte() != null) {
            _hashCode += getSeqGraph_graph_byte().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SeqGraph_graphType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-graph_graphType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqGraph_graph_real");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-graph_graph_real"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-graph_graph_realType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqGraph_graph_int");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-graph_graph_int"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-graph_graph_intType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqGraph_graph_byte");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-graph_graph_byte"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-graph_graph_byteType"));
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
