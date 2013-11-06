/**
 * Blast4GetSearchResultsReply_phiAlignmentsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Blast4GetSearchResultsReply_phiAlignmentsType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4PhiAlignmentsType blast4PhiAlignments;

    public Blast4GetSearchResultsReply_phiAlignmentsType() {
    }

    public Blast4GetSearchResultsReply_phiAlignmentsType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4PhiAlignmentsType blast4PhiAlignments) {
           this.blast4PhiAlignments = blast4PhiAlignments;
    }


    /**
     * Gets the blast4PhiAlignments value for this Blast4GetSearchResultsReply_phiAlignmentsType.
     * 
     * @return blast4PhiAlignments
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4PhiAlignmentsType getBlast4PhiAlignments() {
        return blast4PhiAlignments;
    }


    /**
     * Sets the blast4PhiAlignments value for this Blast4GetSearchResultsReply_phiAlignmentsType.
     * 
     * @param blast4PhiAlignments
     */
    public void setBlast4PhiAlignments(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4PhiAlignmentsType blast4PhiAlignments) {
        this.blast4PhiAlignments = blast4PhiAlignments;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Blast4GetSearchResultsReply_phiAlignmentsType)) return false;
        Blast4GetSearchResultsReply_phiAlignmentsType other = (Blast4GetSearchResultsReply_phiAlignmentsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.blast4PhiAlignments==null && other.getBlast4PhiAlignments()==null) || 
             (this.blast4PhiAlignments!=null &&
              this.blast4PhiAlignments.equals(other.getBlast4PhiAlignments())));
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
        if (getBlast4PhiAlignments() != null) {
            _hashCode += getBlast4PhiAlignments().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Blast4GetSearchResultsReply_phiAlignmentsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-get-search-results-reply_phi-alignmentsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blast4PhiAlignments");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-phi-alignments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-phi-alignmentsType"));
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
