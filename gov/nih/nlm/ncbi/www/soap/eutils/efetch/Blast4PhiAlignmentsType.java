/**
 * Blast4PhiAlignmentsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Blast4PhiAlignmentsType  implements java.io.Serializable {
    private java.lang.String blast4PhiAlignments_numAlignments;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4PhiAlignments_seqLocsType blast4PhiAlignments_seqLocs;

    public Blast4PhiAlignmentsType() {
    }

    public Blast4PhiAlignmentsType(
           java.lang.String blast4PhiAlignments_numAlignments,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4PhiAlignments_seqLocsType blast4PhiAlignments_seqLocs) {
           this.blast4PhiAlignments_numAlignments = blast4PhiAlignments_numAlignments;
           this.blast4PhiAlignments_seqLocs = blast4PhiAlignments_seqLocs;
    }


    /**
     * Gets the blast4PhiAlignments_numAlignments value for this Blast4PhiAlignmentsType.
     * 
     * @return blast4PhiAlignments_numAlignments
     */
    public java.lang.String getBlast4PhiAlignments_numAlignments() {
        return blast4PhiAlignments_numAlignments;
    }


    /**
     * Sets the blast4PhiAlignments_numAlignments value for this Blast4PhiAlignmentsType.
     * 
     * @param blast4PhiAlignments_numAlignments
     */
    public void setBlast4PhiAlignments_numAlignments(java.lang.String blast4PhiAlignments_numAlignments) {
        this.blast4PhiAlignments_numAlignments = blast4PhiAlignments_numAlignments;
    }


    /**
     * Gets the blast4PhiAlignments_seqLocs value for this Blast4PhiAlignmentsType.
     * 
     * @return blast4PhiAlignments_seqLocs
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4PhiAlignments_seqLocsType getBlast4PhiAlignments_seqLocs() {
        return blast4PhiAlignments_seqLocs;
    }


    /**
     * Sets the blast4PhiAlignments_seqLocs value for this Blast4PhiAlignmentsType.
     * 
     * @param blast4PhiAlignments_seqLocs
     */
    public void setBlast4PhiAlignments_seqLocs(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4PhiAlignments_seqLocsType blast4PhiAlignments_seqLocs) {
        this.blast4PhiAlignments_seqLocs = blast4PhiAlignments_seqLocs;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Blast4PhiAlignmentsType)) return false;
        Blast4PhiAlignmentsType other = (Blast4PhiAlignmentsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.blast4PhiAlignments_numAlignments==null && other.getBlast4PhiAlignments_numAlignments()==null) || 
             (this.blast4PhiAlignments_numAlignments!=null &&
              this.blast4PhiAlignments_numAlignments.equals(other.getBlast4PhiAlignments_numAlignments()))) &&
            ((this.blast4PhiAlignments_seqLocs==null && other.getBlast4PhiAlignments_seqLocs()==null) || 
             (this.blast4PhiAlignments_seqLocs!=null &&
              this.blast4PhiAlignments_seqLocs.equals(other.getBlast4PhiAlignments_seqLocs())));
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
        if (getBlast4PhiAlignments_numAlignments() != null) {
            _hashCode += getBlast4PhiAlignments_numAlignments().hashCode();
        }
        if (getBlast4PhiAlignments_seqLocs() != null) {
            _hashCode += getBlast4PhiAlignments_seqLocs().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Blast4PhiAlignmentsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-phi-alignmentsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blast4PhiAlignments_numAlignments");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-phi-alignments_num-alignments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blast4PhiAlignments_seqLocs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-phi-alignments_seq-locs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-phi-alignments_seq-locsType"));
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
