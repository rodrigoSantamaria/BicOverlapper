/**
 * ResidueGraphPntr_standardType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ResidueGraphPntr_standardType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucResidueGraphSetPntrType biostrucResidueGraphSetPntr;

    public ResidueGraphPntr_standardType() {
    }

    public ResidueGraphPntr_standardType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucResidueGraphSetPntrType biostrucResidueGraphSetPntr) {
           this.biostrucResidueGraphSetPntr = biostrucResidueGraphSetPntr;
    }


    /**
     * Gets the biostrucResidueGraphSetPntr value for this ResidueGraphPntr_standardType.
     * 
     * @return biostrucResidueGraphSetPntr
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucResidueGraphSetPntrType getBiostrucResidueGraphSetPntr() {
        return biostrucResidueGraphSetPntr;
    }


    /**
     * Sets the biostrucResidueGraphSetPntr value for this ResidueGraphPntr_standardType.
     * 
     * @param biostrucResidueGraphSetPntr
     */
    public void setBiostrucResidueGraphSetPntr(gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucResidueGraphSetPntrType biostrucResidueGraphSetPntr) {
        this.biostrucResidueGraphSetPntr = biostrucResidueGraphSetPntr;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResidueGraphPntr_standardType)) return false;
        ResidueGraphPntr_standardType other = (ResidueGraphPntr_standardType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.biostrucResidueGraphSetPntr==null && other.getBiostrucResidueGraphSetPntr()==null) || 
             (this.biostrucResidueGraphSetPntr!=null &&
              this.biostrucResidueGraphSetPntr.equals(other.getBiostrucResidueGraphSetPntr())));
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
        if (getBiostrucResidueGraphSetPntr() != null) {
            _hashCode += getBiostrucResidueGraphSetPntr().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ResidueGraphPntr_standardType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Residue-graph-pntr_standardType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("biostrucResidueGraphSetPntr");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-residue-graph-set-pntr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-residue-graph-set-pntrType"));
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
